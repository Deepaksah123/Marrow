package kotlin;

import kotlin.setComingSoon;

/* JADX INFO: loaded from: classes4.dex */
public final class setImagesInfo {
    public static final RemoteActionCompatParcelizer AudioAttributesCompatParcelizer = new RemoteActionCompatParcelizer(0);
    private final getImagesInfo read;
    private final getPearlId write;

    private setImagesInfo(getPearlId getpearlid, getImagesInfo getimagesinfo) {
        this.write = getpearlid;
        this.read = getimagesinfo;
    }

    public final getPearlId write() {
        return this.write;
    }

    public final getImagesInfo read() {
        return this.read;
    }

    public final getTopSection AudioAttributesCompatParcelizer() {
        return this.write.MediaBrowserCompatMediaItem();
    }

    public static final class RemoteActionCompatParcelizer {
        private RemoteActionCompatParcelizer() {
        }

        public static setImagesInfo read(ClassLoader classLoader) {
            toMagicModuleMetaRepoModel.write(classLoader, "");
            isImageContent isimagecontent = new isImageContent(classLoader);
            setComingSoon.read readVar = setComingSoon.read;
            ClassLoader classLoader2 = getShowPopup.class.getClassLoader();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(classLoader2, "");
            setComingSoon.read.AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = setComingSoon.read.AudioAttributesCompatParcelizer(isimagecontent, new isImageContent(classLoader2), new getBodyType(classLoader), "runtime module for ".concat(String.valueOf(classLoader)), getVideo.write, setMsInterimHtmlEndTime.IconCompatParcelizer);
            return new setImagesInfo(AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().RemoteActionCompatParcelizer(), new getImagesInfo(AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(), isimagecontent), (byte) 0);
        }

        public /* synthetic */ RemoteActionCompatParcelizer(byte b) {
            this();
        }
    }

    public /* synthetic */ setImagesInfo(getPearlId getpearlid, getImagesInfo getimagesinfo, byte b) {
        this(getpearlid, getimagesinfo);
    }
}
