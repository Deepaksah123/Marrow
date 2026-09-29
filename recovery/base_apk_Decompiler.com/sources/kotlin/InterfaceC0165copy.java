package kotlin;

/* JADX INFO: renamed from: o.copy, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public @interface InterfaceC0165copy {

    /* JADX INFO: renamed from: o.copy$AudioAttributesCompatParcelizer */
    /* JADX INFO: loaded from: classes5.dex */
    public enum AudioAttributesCompatParcelizer {
        DEFAULT,
        SIGNED,
        FIXED
    }

    int IconCompatParcelizer();

    AudioAttributesCompatParcelizer RemoteActionCompatParcelizer() default AudioAttributesCompatParcelizer.DEFAULT;
}
