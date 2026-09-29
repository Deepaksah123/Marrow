package kotlin;

import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import kotlin.getQbankUpdatedTime;

/* JADX INFO: loaded from: classes4.dex */
public abstract class SubjectCompletionInfoCompanion implements getQbankUpdatedTime {
    private final String read;

    public static final class RemoteActionCompatParcelizer extends SubjectCompletionInfoCompanion {
        public static final RemoteActionCompatParcelizer read = new RemoteActionCompatParcelizer();

        private RemoteActionCompatParcelizer() {
            super("must have no value parameters", (byte) 0);
        }

        @Override // kotlin.getQbankUpdatedTime
        public final boolean write(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
            toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
            return courseConfigV2NavDrawerItemRateUs.aX_().isEmpty();
        }
    }

    private SubjectCompletionInfoCompanion(String str) {
        this.read = str;
    }

    @Override // kotlin.getQbankUpdatedTime
    public final String AudioAttributesCompatParcelizer() {
        return this.read;
    }

    @Override // kotlin.getQbankUpdatedTime
    public final String IconCompatParcelizer(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
        return getQbankUpdatedTime.AudioAttributesCompatParcelizer.write(this, courseConfigV2NavDrawerItemRateUs);
    }

    public /* synthetic */ SubjectCompletionInfoCompanion(String str, byte b) {
        this(str);
    }

    public static final class write extends SubjectCompletionInfoCompanion {
        public static final write RemoteActionCompatParcelizer = new write();

        private write() {
            super("must have a single value parameter", (byte) 0);
        }

        @Override // kotlin.getQbankUpdatedTime
        public final boolean write(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
            toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
            return courseConfigV2NavDrawerItemRateUs.aX_().size() == 1;
        }
    }

    public static final class IconCompatParcelizer extends SubjectCompletionInfoCompanion {
        private final int write;

        public IconCompatParcelizer(int i) {
            StringBuilder sb = new StringBuilder("must have at least ");
            sb.append(i);
            sb.append(" value parameter");
            sb.append(i > 1 ? CmcdHeadersFactory.STREAMING_FORMAT_SS : "");
            super(sb.toString(), (byte) 0);
            this.write = i;
        }

        @Override // kotlin.getQbankUpdatedTime
        public final boolean write(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
            toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
            return courseConfigV2NavDrawerItemRateUs.aX_().size() >= this.write;
        }
    }

    public static final class read extends SubjectCompletionInfoCompanion {
        private final int IconCompatParcelizer;

        public read() {
            super(new StringBuilder("must have exactly 2 value parameters").toString(), (byte) 0);
            this.IconCompatParcelizer = 2;
        }

        @Override // kotlin.getQbankUpdatedTime
        public final boolean write(CourseConfigV2NavDrawerItemRateUs courseConfigV2NavDrawerItemRateUs) {
            toMagicModuleMetaRepoModel.write(courseConfigV2NavDrawerItemRateUs, "");
            return courseConfigV2NavDrawerItemRateUs.aX_().size() == this.IconCompatParcelizer;
        }
    }
}
