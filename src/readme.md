# Eclipse project for language server

## Building the project

- Open workspace in Eclipse
- Import the parent project as an Existing Gradle Project
- On project `org.xtext.computationalmodelling.parent`, right-click and select `Gradle`->`Refresh Gradle Project`. Wait for Eclipse to complete the process.
- build either in a terminal or in Eclipse
- in a terminal (make sure you are connected to the internet) type:

  ``` bash
  cd <inside the parent project>
  ./gradlew installDist
  ```

- in Eclipse, in the Gradle Task View (can be opened by `Window=>Show View=>Other` then `Gradle=>Gradle Tasks`), run the `distribution/installDist` task of the `org.xtext.computationalmodelling.parent`
- the result of the build are two executable Java programs

  - One is the LSP server for the three languages.
    It is located in the directory named `cm-xtext-server` located in `\tools\dsl\eclipse-workspace\org.xtext.computationalmodelling.parent\org.xtext.computationalmodelling.lsp\build\install`
  - The other is a code generator tool.
    It is located in the directory named `cm-codegen` located in `\tools\dsl\eclipse-workspace\org.xtext.computationalmodelling.parent\org.xtext.computationalmodelling.ide\build\install`
- Copy the folders `cm-xtext-server` and `cm-codegen` into to folder `\tools\vscode-extension-computationalmodelling\xtextbin`
