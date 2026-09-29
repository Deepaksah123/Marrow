package kotlin;

/* JADX INFO: loaded from: classes2.dex */
public abstract class DefaultAudioSinkApi23 {
    public static final AudioRendererEventListenerEventDispatcher AudioAttributesCompatParcelizer(deviceDoesntSupportOperatingRate devicedoesntsupportoperatingrate, String str, getAnswerMap getanswermap, getAnswerMap getanswermap2) {
        return ((Boolean) getanswermap.invoke(devicedoesntsupportoperatingrate.IconCompatParcelizer())).booleanValue() ? new AudioRendererEventListenerEventDispatcher(str, null, Ac4UtilSyncFrameInfo.AudioAttributesCompatParcelizer) : new AudioRendererEventListenerEventDispatcher(str, getanswermap2.invoke(devicedoesntsupportoperatingrate.IconCompatParcelizer()), onAudioDevicesAdded.AudioAttributesCompatParcelizer);
    }

    public static AudioRendererEventListenerEventDispatcher IconCompatParcelizer(deviceDoesntSupportOperatingRate devicedoesntsupportoperatingrate, String str, getAnswerMap getanswermap) {
        return AudioAttributesCompatParcelizer(devicedoesntsupportoperatingrate, str, onChange.read, new isOperational(getanswermap));
    }
}
