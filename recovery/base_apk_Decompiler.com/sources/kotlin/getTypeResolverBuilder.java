package kotlin;

import kotlin.Metadata;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/getTypeResolverBuilder;", "", "<init>", "(Ljava/lang/String;I)V", "AudioAttributesCompatParcelizer", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class getTypeResolverBuilder {
    private static final /* synthetic */ getTypeResolverBuilder[] IconCompatParcelizer;
    private static final /* synthetic */ getMagicModuleSavedMcqCount write;
    public static final getTypeResolverBuilder AudioAttributesCompatParcelizer = new getTypeResolverBuilder("Shown", 0);
    public static final getTypeResolverBuilder read = new getTypeResolverBuilder("Hidden", 1);

    private getTypeResolverBuilder(String str, int i) {
    }

    static {
        getTypeResolverBuilder[] gettyperesolverbuilderArrAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer();
        IconCompatParcelizer = gettyperesolverbuilderArrAudioAttributesCompatParcelizer;
        write = getMagicModuleTimeline.IconCompatParcelizer(gettyperesolverbuilderArrAudioAttributesCompatParcelizer);
    }

    private static final /* synthetic */ getTypeResolverBuilder[] AudioAttributesCompatParcelizer() {
        return new getTypeResolverBuilder[]{AudioAttributesCompatParcelizer, read};
    }

    public static getTypeResolverBuilder valueOf(String str) {
        return (getTypeResolverBuilder) Enum.valueOf(getTypeResolverBuilder.class, str);
    }

    public static getTypeResolverBuilder[] values() {
        return (getTypeResolverBuilder[]) IconCompatParcelizer.clone();
    }
}
