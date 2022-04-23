# Language Server Project

To be changed!

Standard IO based Language Server application.

## Build

To build the project:

- Make sure your have gradle installed.
- In this directory (`nl.tue.ele.es.lsp.qrml.parent`) type:

  ``` bash
  ./gradlew installDist
  ```

- The application is built and place in the directory `nl.tue.ele.es.lsp.qrml.ide/build/install/`

- Then, to install the LSP in the web application, type

  ``` bash
  ./gradlew installWebApp
  ```

## Running the server

The server can be started by execution the script that was built.
