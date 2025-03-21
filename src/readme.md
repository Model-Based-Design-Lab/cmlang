# Eclipse project for language server

## Building the project

### Using Docker

Build the docker image. In the `src` folder run:

``` shell
docker build . -t cmlang
```

Run the docker image using a mounted volume referred to as `<volume-name>` in the command below.

``` shell
docker run -v <volume-name>:/output cmlang
```

The results are visible in the mounted volume `/output`.

### From the Command Line

- in a terminal (make sure you are connected to the internet) type:

  ``` bash
  cd <inside the parent project>
  mvn install
  ```

### In Eclipse

Ensure that ou have the [Maven Nature support](https://marketplace.eclipse.org/free-tagging/nature_orgeclipsem2ecoremaven2nature) installed in Eclipse

- Open workspace in Eclipse
- Import the parent project as an Existing Maven Project
- On project `org.xtext.computationalmodelling.parent`, right-click and select `Run as `->`Maven install`. Wait for Eclipse to complete the process.

- the result of the build are two executable Java programs

  - One is the LSP server for the three languages.
    It is packaged in platform specific zip archives named `cm-lsp-1.0.0-SNAPSHOT-win.zip` and `cm-lsp-1.0.0-SNAPSHOT-unix.zip` located in `info.computationalmodelling.lang.parent\info.computationalmodelling.lang.lsp\target`
  - The other is a code generator tool.
    It is packaged in platform specific zip archives named `cm-codegen-1.0.0-SNAPSHOT-win.zip` and `cm-codegen-1.0.0-SNAPSHOT-unix.zip` located in `info.computationalmodelling.lang.parent\info.computationalmodelling.lang.codegen\target`
