cmake_minimum_required(VERSION 3.2)

set(CMAKE_CXX_STANDARD 11)
set(CMAKE_CXX_STANDARD_REQUIRED ON)

project(cpp-consumer)
set(CMAKE_CROSSCOMPILING "TRUE")

#find_package(Boost REQUIRED)
#include_directories(${Boost_INCLUDE_DIRS})

#Bring the headers, such as .hpp into the project
include_directories(${PROJECT_SOURCE_DIR}/include)

message("Supported features = ${CMAKE_CXX_COMPILE_FEATURES}")
#set(cpp-maindemo src/cpp-maindemo.cpp src/producer.cpp)
message("Configuration Types = ${CMAKE_CONFIGURATION_TYPES}")

file(GLOB SOURCES "src/*.cpp")

add_executable(cppmaindemo ${SOURCES})



# set output directories for all builds (Debug, Release, etc.)
#foreach( OUTPUTCONFIG ${CMAKE_CONFIGURATION_TYPES} )
#    string( TOUPPER ${OUTPUTCONFIG} OUTPUTCONFIG )
#    set( CMAKE_ARCHIVE_OUTPUT_DIRECTORY_${OUTPUTCONFIG} ${CMAKE_SOURCE_DIR}/lib )
#    set( CMAKE_LIBRARY_OUTPUT_DIRECTORY_${OUTPUTCONFIG} ${CMAKE_SOURCE_DIR}/lib )
#    set( CMAKE_RUNTIME_OUTPUT_DIRECTORY_${OUTPUTCONFIG} ${CMAKE_SOURCE_DIR}/bin )
#endforeach( OUTPUTCONFIG CMAKE_CONFIGURATION_TYPES )

#add_executable(cpp-maindemo
#    src/cpp-maindemo.cpp
#    src/producer.cpp
#)

#install(TARGETS cppmaindemo RUNTIME DESTINATION bin)
