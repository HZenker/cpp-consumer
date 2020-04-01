/** cpp-maindemo  200310 
*/
#include <cstdlib>
#include <string>
#include <iostream>
#include <sstream>
#include <iomanip>
#include <memory>
#include <fstream>
#include <exception>

#include "../include/producer.hpp"

int main(int argc, char** argv) {
    std::cout << "strart producer and consumer threads\n";

    std::shared_ptr<producer> prod(new producer());
    producer *ptest = prod.get(); 

    return 0;
}
