
SUMMARY = "cpp-consumer application"
SECTION = "demos"
SECTION = "console"

#LICENSE = "MIT"
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = "file://include/COPYING;md5=2f4b45a53265d0a62dc12977b3d21314"

EXTRA_OECMAKE = " -DCROSS_COMPILE=TRUE"

python my_python_function (){
    d.setVar("TEXT","from my python function")
    print d.getVar("TEXT",True)
}
#my_python_function()

PR = "r1"
SRCREV = "${AUTOREV}"
#SRCREV_default_pn-cpp-consumer

#EXTERNALSRC = "home/helgo/git/cpp-consumer/"
#EXTERNALSRC_BUILD = "home/helgo/git/cpp-consumer/build/"

FILESEXTRAPATHS_prepend := "${THISDIR}/cpp-consumer:"
#FILESEXTRAPATHS_prepend := "${THISDIR}:"

S = "${WORKDIR}"
#D = "${WORKDIR}/inst"

#TARGET_class_target = "am57xx"

#SRC_URI = "git:///home/helgo/git/cpp-consumer/cpp-consumer-${PV};protocol=file"
#SRC_URI = "git:///home/helgo/git/cpp-consumer/cpp-consumer-${PV}; file:defconfig"

#BB_STRICT_CHECKSUM = "0"
#SRC_URI = "file://CMakeList.txt;name=name01"

SRC_URI = "file:///CMakeList.txt;protocol=file;name=name01"
#SRC_URI[name01:md5sum] = "127e1d608e2459888e4e0919e3eb6a35" 

#           file://src/cpp-consumer.cpp;name=entr02" 
#SRC_URI[entr1:sha256sum] = "b454e61e672527152cdc4ddbb048b19374deeaac5b057aa32a3e0a674aeef261"

#EXTRA_OECMAKE = " -DCROSS_COMPILE=TRUE"
EXTRA_OECMAKE=""

inherit cmake

#do_configure() { 
#    cmake ../ 
#} 

#cmake_do_compile() {
#    cd ${B}
#    base_do_compile VERBOSE=1
#}

#ERROR: Nothing RPROVIDES 
#do_compile() {
#         ${CXX} cpp-consumer.cpp -o cpp-consumer
#}

#do_install() {
#    install -d ${D}
#}
