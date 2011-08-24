# Copyright (C) 2011 Freescale Semicondutor
# Released under the MIT license (see COPYING.MIT for the terms)

inherit autotools pkgconfig

DESCRIPTION = "Gstreamer freescale plugins"
LICENSE = "GPLv2 & LGPLv2 & LGPLv2.1"
SECTION = "multimedia"
DEPENDS = "gstreamer fsl-mm-codeclib imx-lib"
PR = "r0"

LIC_FILES_CHKSUM = "file://COPYING;md5=59530bdf33659b29e73d4adb9f9f6552 \
                    file://COPYING-LGPL-2;md5=5f30f0716dfdd0d91eb439ebec522ec2 \
                    file://COPYING-LGPL-2.1;md5=fbc093901857fcd118f065f900982c24"

SRC_URI = "http://auslxsc01.mtwk.freescale.net/ppp/${PN}-${PV}.tar.gz"
SRC_URI[md5sum] = "ef414365901a4457d8c091615c0749e0"
SRC_URI[sha256sum] = "99668788886d7a9223c5cc2a408631d6fbf9094894da34c6c00036a9fe1253de"

# Todo add a mechanism to map posible build targets
EXTRA_OECONF = "PLATFORM=MX53 --disable-valgrind --disable-examples"

FILES_${PN} += "${libdir}/gstreamer-0.10/*.so"
FILES_${PN}-dbg += "${libdir}/gstreamer-0.10/.debug"
FILES_${PN}-dev += "${libdir}/gstreamer-0.10/*.la ${libdir}/gstreamer-0.10/*.a"