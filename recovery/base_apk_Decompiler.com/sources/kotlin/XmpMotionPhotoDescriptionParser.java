package kotlin;

import android.content.Context;

/* JADX INFO: loaded from: classes3.dex */
public final class XmpMotionPhotoDescriptionParser {
    private static parseMotionPhotoFlagFromDescription AudioAttributesCompatParcelizer;

    static parseMotionPhotoFlagFromDescription write(Context context) {
        parseMotionPhotoFlagFromDescription parsemotionphotoflagfromdescription;
        synchronized (XmpMotionPhotoDescriptionParser.class) {
            if (AudioAttributesCompatParcelizer == null) {
                parseMicroVideoOffsetFromDescription parsemicrovideooffsetfromdescription = new parseMicroVideoOffsetFromDescription((byte) 0);
                parsemicrovideooffsetfromdescription.write(new DefaultEbmlReader(MotionPhotoDescriptionContainerItem.IconCompatParcelizer(context)));
                AudioAttributesCompatParcelizer = parsemicrovideooffsetfromdescription.IconCompatParcelizer();
            }
            parsemotionphotoflagfromdescription = AudioAttributesCompatParcelizer;
        }
        return parsemotionphotoflagfromdescription;
    }
}
