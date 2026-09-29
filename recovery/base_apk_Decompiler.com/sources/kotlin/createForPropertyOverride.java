package kotlin;

import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\bf\u0018\u0000 \u00062\u00020\u0001:\u0001\u0006R\u0014\u0010\u0005\u001a\u00020\u00028'X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001À\u0006\u0001"}, d2 = {"Lo/createForPropertyOverride;", "Lo/Module;", "", "MediaBrowserCompatItemReceiver", "()Ljava/lang/Object;", "read", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
public interface createForPropertyOverride extends Module {

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.AudioAttributesCompatParcelizer;

    Object MediaBrowserCompatItemReceiver();

    /* JADX INFO: renamed from: o.createForPropertyOverride$write, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/createForPropertyOverride$write;", "", "<init>", "()V", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        static final /* synthetic */ Companion AudioAttributesCompatParcelizer = new Companion();

        private Companion() {
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* JADX INFO: renamed from: o.createForPropertyOverride$write$IconCompatParcelizer */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006"}, d2 = {"Lo/createForPropertyOverride$write$IconCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "read", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class IconCompatParcelizer {
            private static final /* synthetic */ getMagicModuleSavedMcqCount AudioAttributesCompatParcelizer;
            private static final /* synthetic */ IconCompatParcelizer[] RemoteActionCompatParcelizer;
            public static final IconCompatParcelizer read = new IconCompatParcelizer("ContinueTraversal", 0);
            public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer("SkipSubtreeAndContinueTraversal", 1);
            public static final IconCompatParcelizer write = new IconCompatParcelizer("CancelTraversal", 2);

            private IconCompatParcelizer(String str, int i) {
            }

            static {
                IconCompatParcelizer[] iconCompatParcelizerArrWrite = write();
                RemoteActionCompatParcelizer = iconCompatParcelizerArrWrite;
                AudioAttributesCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(iconCompatParcelizerArrWrite);
            }

            private static final /* synthetic */ IconCompatParcelizer[] write() {
                return new IconCompatParcelizer[]{read, IconCompatParcelizer, write};
            }

            public static IconCompatParcelizer valueOf(String str) {
                return (IconCompatParcelizer) Enum.valueOf(IconCompatParcelizer.class, str);
            }

            public static IconCompatParcelizer[] values() {
                return (IconCompatParcelizer[]) RemoteActionCompatParcelizer.clone();
            }
        }
    }
}
