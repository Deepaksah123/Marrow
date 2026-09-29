package kotlin;

/* JADX INFO: renamed from: o.getDisplayname, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
public enum EnumC0173getDisplayname {
    FIELD,
    FILE,
    PROPERTY,
    PROPERTY_GETTER("get"),
    PROPERTY_SETTER("set"),
    RECEIVER,
    CONSTRUCTOR_PARAMETER("param"),
    SETTER_PARAMETER("setparam"),
    PROPERTY_DELEGATE_FIELD("delegate");

    private final String MediaBrowserCompatMediaItem;

    /* synthetic */ EnumC0173getDisplayname() {
        this(null);
    }

    EnumC0173getDisplayname(String str) {
        this.MediaBrowserCompatMediaItem = str == null ? SubjectIntroSkip.AudioAttributesCompatParcelizer(name()) : str;
    }

    public final String RemoteActionCompatParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }
}
