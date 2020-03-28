#!/bin/sh
git clone https://github.com/tolga9009/elgato-gchd

cd /home/$USER/elgato-gchd

FILE=gchdm_203_970.dmg
if [ -f "$FILE" ]; then
    echo "$FILE exist"
else 
wget http://files.elgato.com/gamecapture/gchdm_203_970.dmg
fi

dmg2img gchdm_203_970.dmg -o gchdm_203_970.dmg.img

mkdir /tmp/dmg

sudo mount -o loop -t hfsplus gchdm_203_970.dmg.img /tmp/dmg

cp /tmp/dmg/Game\ Capture\ HD.app/Contents/Resources/Firmware/Beddo/mb86h57_h58_idle.bin /home/$USER/elgato-gchd/build/src

cp /tmp/dmg/Game\ Capture\ HD.app/Contents/Resources/Firmware/Beddo/mb86h57_h58_enc_h.bin /home/$USER/elgato-gchd/build/src

cp /tmp/dmg/Game\ Capture\ HD.app/Contents/Resources/Firmware/Beddo/mb86m01_assp_nsec_idle.bin /home/$USER/elgato-gchd/build/src

cp /tmp/dmg/Game\ Capture\ HD.app/Contents/Resources/Firmware/Beddo/mb86m01_assp_nsec_enc_h.bin /home/$USER/elgato-gchd/build/src

bash

