/**producer.cpp  200310
*/


#include "../include/producer.hpp"


producer::producer() : m_cond_var()
{
    std::cout<<"producer constructor\n";
};

producer::~producer()
{
    std::cout<<"destruction\n" << std::endl;
};

