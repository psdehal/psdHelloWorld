/*
A KBase module: psdHelloWorld
*/

module psdHelloWorld {
    /*
        Insert your typespec information here.
    */

typedef structure {
        string phrase;
    } InParams;

 typedef structure {
        string phrase;
    } OutParams;

    funcdef printhelloworld(InParams params)
        returns (OutParams) authentication required;
};
