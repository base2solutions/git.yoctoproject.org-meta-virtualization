include runc.inc

RRECOMMENDS_${PN} = "lxc docker"

# Note: this rev is before the required protocol field, update when all components
#       have been updated to match.
SRCREV_runc-docker = "6635b4f0c6af3810594d2770f662f34ddc15b40d"
SRC_URI = "git://github.com/opencontainers/runc;nobranch=1;name=runc-docker \
           file://0001-runc-Add-console-socket-dev-null.patch \
           file://0001-build-drop-recvtty-and-use-GOBUILDFLAGS.patch \
           file://0001-runc-docker-SIGUSR1-daemonize.patch \
          "

RUNC_VERSION = "1.0.0-rc6"
