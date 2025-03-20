# Computational Modeling Language Tools

GitHub: <https://github.com/Model-Based-Design-Lab/cmlang>

This repository contains the domain-specific-language tools related to [Computational Modeling]

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

`src/info.computationalmodeling.lang.codegen`

This project contains a code generation tool for the various languages defined in the LSP project.

Depending on the model it generates one more of the following

- Visualization using [graphviz](https:/graphviz.org)
- Conversion to the [SDF3](https://www.es.ele.tue.nl/sdf3) file format
- Visualization in LaTeX
- Conversion to [Octave](https://octave.org)

Extensions for the files are assumed to be as follows:

- `.sdf` for dataflow models, generating Graphviz and SDF3
- `.mpm` for max-plus models, generating LaTeX
- `.fsa` for finite state automata models, generating Graphviz
- `.dtmc` for Markov Chain models, generating Octave and Graphviz
- `.ltl` for Linear Temporal Logic models, generating LaTeX
- `.regex` for regular expression models, generating LaTeX

## Building the software

The software can be built from the command line or using the provided docker image. Note that the build creates both Linux and Windows scripts to run the Java based tools.

### Command line build

Building from the command line requires a recent [Java JDK](https://adoptium.net/) and [Maven](https://maven.apache.org/) to be installed.

``` shell
cd src\info.computationalmodeling.lang.parent\
mvn install
```

The built language server, for Windows or Unix, respectively, can be found in:
`src/info.computationalmodeling.lang.parent/info.computationalmodeling.lang.lsp/target/cm-lsp-1.0.0-SNAPSHOT-win.zip`
`src/info.computationalmodeling.lang.parent/info.computationalmodeling.lang.lsp/target/cm-lsp-1.0.0-SNAPSHOT-unix.zip`

The built code generator can be found in:
`src/info.computationalmodeling.lang.codegen.parent/info.computationalmodeling.lang.codegen/target/cm-codegen-1.0.0-SNAPSHOT-win.zip`
`src/info.computationalmodeling.lang.codegen.parent/info.computationalmodeling.lang.codegen/target/cm-codegen-1.0.0-SNAPSHOT-unix.zip`

### Building with Docker

Build the [docker](https://www.docker.com/) image:

The `Dockerfile` is located in the `/src` directory.
In the `/src` directory, run the following command to build the image.

``` shell
docker build -t cmlang .
```

Run the docker image using a mounted volume referred to as `<volume-name>` in the command below.

``` shell
docker run -v <volume-name>:/output cmlang
```

After a successful run the results are in the mounted volume.

## Using the Software

Note that the software requires a Java JRE to be installed on the host platform to run.

The LSP project produces a script to start the application in the `bin` directory after building. The script is called `computational-modelling-language-server-stdio`. When run, it accepts LSP clients on `stdin` and produces outputs on `stdout`.

The code generation project produces a script to start the application in the `bin` directory after building.

The tool is run with the following command-line.

`codegen <input-file> <output-dir>`

It will apply all code generation options it has for the type of `input-file` and writes corresponding output files in the directory `output-dir`.

## References

This tool has been developed by the Model-Based Design Lab, <https://computationalmodeling.info>

GitHub: <https://github.com/Model-Based-Design-Lab>

Contact: Marc Geilen, <m.c.w.geilen@tue.nl>

## License

This software is licensed under the MIT License
