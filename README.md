# Computational Modeling Language Tools

## Software

This repository contains two Java/Xtext based projects.

### Languages and LSP Server

`src/info.computationalmodeling.lang.parent`

Contains the Xtext language definitions of the following domain-specific languages of models of computation:

- Finite State Automata
- Regular Expressions
- Linear Temporal Logic
- Markov Chains
- Dataflow Graphs
- Max-plus Algebra Models

It further contains a server for [the Language Server Protocol](https://microsoft.github.io/language-server-protocol/) (LSP) through standard I/O to facilitate the use of editors that support LSP. (In particular the [Monaco](https://microsoft.github.io/monaco-editor/) based web editor of the [Computational Modeling Workbench](https://computationalmodeling.info/cmwb)).

### Code Generation Tools

`src/info.computationalmodeling.lang.codegen.parent`

To be done.

## Building the software

The software can be built from the command line or using the provided docker image. Note that the build creates both Linux and Windows scripts to run the Java based tools.

### Command line build

Building from the command line requires a recent [Java JDK](https://adoptium.net/) and [Gradle](https://gradle.org/install/) to be installed.

``` shell
cd ..\info.computationalmodeling.lang.parent\
./gradlew installDist
cd ..\info.computationalmodeling.lang.codegen.parent\
./gradlew installDist
```

The built language server can be found in:
`src/info.computationalmodeling.lang.parent/info.computationalmodeling.lang.ide/build/install/info.computationalmodeling.lang.ide`

The built code generator can be found in:
`src/info.computationalmodeling.lang.codegen.parent/info.computationalmodeling.lang.codegen.compiler/build/install/info.computationalmodeling.lang.codegen.compiler`

### Building with Docker

Build the [docker](https://www.docker.com/) image:

The `Dockerfile` is located in the `/src` directory.
In the `/src` directory, run the following command to build the image.

``` shell
docker build -t cmlang .
```

Run the docker image using a mounted volume referred to as `<volume>` in the command below.

``` shell
docker run -v <volumename>:/output cmlang
```

After a successful run the results are in the mounted volume.

## Using the Software

To be done.

Note that the software requires a Java JRE to be installed on the host platform to run.

## References

<https://computationalmodeling.info>

<m.c.w.geilen@tue.nl>


## License

This software is licenced under the MIT License
