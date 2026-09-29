package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0080\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B!\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fR\u0017\u0010\u000f\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0014\u001a\u00020\u00048\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000b\u0010\u0013R\u001a\u0010\u0016\u001a\u00020\u00068\u0007X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0016\u0010\u0013j\u0002\b\u0014j\u0002\b\u000bj\u0002\b\u0017j\u0002\b\u0016j\u0002\b\u000f"}, d2 = {"Lo/setShowDisableOption;", "", "", "p0", "Lo/setImage;", "p1", "Lo/showController;", "p2", "<init>", "(Ljava/lang/String;ILjava/lang/Object;II)V", "", "IconCompatParcelizer", "(Lo/_handleUnrecognizedCharacterEscape;I)Ljava/lang/String;", "MediaBrowserCompatCustomActionResultReceiver", "Ljava/lang/Object;", "RemoteActionCompatParcelizer", "()Ljava/lang/Object;", "AudioAttributesImplBaseParcelizer", "I", "()I", "AudioAttributesCompatParcelizer", "MediaBrowserCompatItemReceiver", "write", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setShowDisableOption {
    private static final /* synthetic */ setShowDisableOption[] AudioAttributesImplApi21Parcelizer;
    private static final /* synthetic */ getMagicModuleSavedMcqCount AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final Object RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final int write;
    public static final setShowDisableOption AudioAttributesCompatParcelizer = new setShowDisableOption("Cut", 0, isAdapterPositionUnknown.INSTANCE.write(), setImage.INSTANCE.AudioAttributesCompatParcelizer(), showController.INSTANCE.read());
    public static final setShowDisableOption IconCompatParcelizer = new setShowDisableOption("Copy", 1, isAdapterPositionUnknown.INSTANCE.AudioAttributesCompatParcelizer(), setImage.INSTANCE.IconCompatParcelizer(), showController.INSTANCE.write());
    public static final setShowDisableOption read = new setShowDisableOption("Paste", 2, isAdapterPositionUnknown.INSTANCE.IconCompatParcelizer(), setImage.INSTANCE.RemoteActionCompatParcelizer(), showController.INSTANCE.AudioAttributesCompatParcelizer());
    public static final setShowDisableOption write = new setShowDisableOption("SelectAll", 3, isAdapterPositionUnknown.INSTANCE.read(), setImage.INSTANCE.read(), showController.INSTANCE.RemoteActionCompatParcelizer());
    public static final setShowDisableOption RemoteActionCompatParcelizer = new setShowDisableOption("Autofill", 4, isAdapterPositionUnknown.INSTANCE.RemoteActionCompatParcelizer(), setImage.INSTANCE.write(), showController.INSTANCE.IconCompatParcelizer());

    private setShowDisableOption(String str, int i, Object obj, int i2, int i3) {
        this.RemoteActionCompatParcelizer = obj;
        this.AudioAttributesCompatParcelizer = i2;
        this.write = i3;
    }

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from getter */
    public final Object getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final int getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final int getWrite() {
        return this.write;
    }

    static {
        setShowDisableOption[] setshowdisableoptionArr = read();
        AudioAttributesImplApi21Parcelizer = setshowdisableoptionArr;
        AudioAttributesImplApi26Parcelizer = getMagicModuleTimeline.IconCompatParcelizer(setshowdisableoptionArr);
    }

    public final String IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesCompatParcelizer(479426150, i, -1, "androidx.compose.foundation.text.TextContextMenuItems.resolvedString (CommonContextMenuArea.kt:178)");
        }
        String str = shouldShowControllerIndefinitely.read(this.AudioAttributesCompatParcelizer, _handleunrecognizedcharacterescape, 0);
        if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
            _validJsonValueList.AudioAttributesImplApi21Parcelizer();
        }
        return str;
    }

    private static final /* synthetic */ setShowDisableOption[] read() {
        return new setShowDisableOption[]{AudioAttributesCompatParcelizer, IconCompatParcelizer, read, write, RemoteActionCompatParcelizer};
    }

    public static setShowDisableOption valueOf(String str) {
        return (setShowDisableOption) Enum.valueOf(setShowDisableOption.class, str);
    }

    public static setShowDisableOption[] values() {
        return (setShowDisableOption[]) AudioAttributesImplApi21Parcelizer.clone();
    }
}
