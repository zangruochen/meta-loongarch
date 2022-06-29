SUMMARY = "Sanitized set of kernel headers for the C library's use"
HOMEPAGE = "https://www.kernel.org/"
DESCRIPTION = "Designed to maintain an Application Programming Interface (API) stable version of the Linux headers"
SECTION = "devel"
LICENSE = "GPL-2.0-only"

LIC_FILES_CHKSUM = "file://COPYING;md5=6bc538ed5bd9a7fc9398086aedcd7e46"

SRC_URI[sha256sum] = "c2d2400bbf52688a1d2d1e45171331ddbc69ba1c3864e922c1c3f5b546b4d21b"

inherit kernel-arch pkgconfig multilib_header

SRC_URI = "https://git.kernel.org/torvalds/t/linux-5.19-rc1.tar.gz"
UPSTREAM_CHECK_URI = "https://www.kernel.org/"

S = "${WORKDIR}/linux-${PV}-rc1"

EXTRA_OEMAKE = " HOSTCC="${BUILD_CC}" HOSTCPP="${BUILD_CPP}""

do_configure[noexec] = "1"

do_compile[noexec] = "1"

do_install() {
	oe_runmake headers_install INSTALL_HDR_PATH=${D}${exec_prefix} ARCH=loongarch
	# Kernel should not be exporting this header
	rm -f ${D}${exec_prefix}/include/scsi/scsi.h

	# The ..install.cmd conflicts between various configure runs
	find ${D}${includedir} -name ..install.cmd | xargs rm -f
}

BBCLASSEXTEND = "nativesdk"

RDEPENDS:${PN}-dev = ""
RRECOMMENDS:${PN}-dbg = "${PN}-dev (= ${EXTENDPKGV})"

INHIBIT_DEFAULT_DEPS = "1"
DEPENDS += "unifdef-native bison-native rsync-native"
