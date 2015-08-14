FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}-${PV}:"

# Change "Hello World!" to "Hello COSCUP!"
SRC_URI += "file://0001-hello-coscup.patch"
