/** producer.hpp 
*/

#ifndef PRODUCER_HPP
#define PRODUCER_HPP

#include <iostream>
#include <cerrno>
#include <exception>
#include <mutex>
#include <fstream>
#include <future>
#include <condition_variable>
#include <vector>
#include <queue>
#include <memory>

class producer : public std::enable_shared_from_this <producer>
{
public:
    producer();
    virtual ~producer() noexcept;

private:
protected:
    std::condition_variable     m_cond_var;  //wait condition
};

#endif /* PRODUCER_HPP */