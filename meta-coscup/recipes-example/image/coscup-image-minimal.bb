SUMMARY = "A console-only image for COSCUP2015"

LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

# This image is based on core-image-minimal
include recipes-core/images/core-image-minimal.bb

IMAGE_INSTALL_append_qemux86 = " hello"

IMAGE_INSTALL_append_raspberrypi = ""

IMAGE_INSTALL += " \
   vim strace \
"

# Add package-manager support
IMAGE_FEATURES += " package-management"
# Add ssh server support, or add ssh-server-dropbear here.
IMAGE_FEATURES += "ssh-server-openssh"
