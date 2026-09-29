package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002À\u0006\u0003"}, d2 = {"Lo/parseDtsxChannelConfiguration;", "", "RemoteActionCompatParcelizer", "write"}, k = 1, mv = {2, 2, 0}, xi = 48)
public interface parseDtsxChannelConfiguration {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = Companion.IconCompatParcelizer;

    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000 \u00022\u00020\u0001:\u0001\u0002À\u0006\u0003"}, d2 = {"Lo/parseDtsxChannelConfiguration$write;", "", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public interface write {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        public static final Companion INSTANCE = Companion.RemoteActionCompatParcelizer;

        /* JADX INFO: renamed from: o.parseDtsxChannelConfiguration$write$IconCompatParcelizer, reason: from kotlin metadata */
        public static final class Companion {
            static final /* synthetic */ Companion RemoteActionCompatParcelizer = new Companion();
            private static final List<Integer> AudioAttributesCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer((Object[]) new Integer[]{15001, 15002, 15003});

            private Companion() {
            }

            public static List<Integer> read() {
                return AudioAttributesCompatParcelizer;
            }
        }
    }

    /* JADX INFO: renamed from: o.parseDtsxChannelConfiguration$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final class Companion {
        static final /* synthetic */ Companion IconCompatParcelizer = new Companion();
        private static final String read = "https://www.marrow.com/notes/order-details";

        private Companion() {
        }

        public static String AudioAttributesCompatParcelizer() {
            return read;
        }
    }
}
