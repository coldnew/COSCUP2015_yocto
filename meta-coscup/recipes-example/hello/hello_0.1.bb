DESCRIPTION = "Simple helloworld application"
SECTION = "examples"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRCBRANCH ??= "master"
SRCREV ?= "6f833f8b94a02511f73263bc40d605c6f4ff018b"
SRC_URI = "git://github.com/coldnew/COSCUP2015_yocto.git;protocol=ssh;branch=${SRCBRANCH}"

S = "${WORKDIR}/git/example/hello"

do_compile() {
	     ${CC} hello.c -o hello
}

do_install() {
	     install -d ${D}${bindir}
	     install -m 0755 hello ${D}${bindir}
}

BBCLASSEXTEND = "native nativesdk"
