package kotlin;

import android.os.Bundle;
import com.marrow.designsystem.theme.AppTheme;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.getLatestBitrateEstimate;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getSelectedIndexInTrackGroup;", "", "<init>", "()V", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class getSelectedIndexInTrackGroup {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: o.getSelectedIndexInTrackGroup$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\t\u0010\bJ\u0019\u0010\n\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\n\u0010\bJ\u0019\u0010\u000b\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u000b\u0010\bJ\u000f\u0010\n\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u0003J\u0017\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\f\u0010\bJ\u0015\u0010\f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\r¢\u0006\u0004\b\f\u0010\u000eJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\rH\u0002¢\u0006\u0004\b\n\u0010\u000f"}, d2 = {"Lo/getSelectedIndexInTrackGroup$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "", "p0", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)V", "AudioAttributesCompatParcelizer", "read", "write", "IconCompatParcelizer", "Lcom/marrow/designsystem/theme/AppTheme;", "(Lcom/marrow/designsystem/theme/AppTheme;)V", "(Lcom/marrow/designsystem/theme/AppTheme;)Ljava/lang/String;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {

        /* JADX INFO: renamed from: o.getSelectedIndexInTrackGroup$AudioAttributesCompatParcelizer$write */
        public static final /* synthetic */ class write {
            public static final /* synthetic */ int[] write;

            static {
                int[] iArr = new int[AppTheme.values().length];
                try {
                    iArr[AppTheme.read.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[AppTheme.AudioAttributesCompatParcelizer.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                write = iArr;
            }
        }

        private Companion() {
        }

        @getMagicModuleMeta
        public static void RemoteActionCompatParcelizer(String p0) {
            Bundle bundle = new Bundle();
            bundle.putString("source", p0);
            getTrackGroup.AudioAttributesCompatParcelizer("bookmark_load", bundle);
        }

        @getMagicModuleMeta
        public static void AudioAttributesCompatParcelizer(String p0) {
            Bundle bundle = new Bundle();
            bundle.putString("source", p0);
            isTrackExcluded.AudioAttributesCompatParcelizer("search_click", bundle);
        }

        @getMagicModuleMeta
        public static void read(String p0) {
            Bundle bundle = new Bundle();
            bundle.putString("title", p0);
            getTrackGroup.AudioAttributesCompatParcelizer("tab_clicked", bundle);
            HashMap map = new HashMap();
            HashMap map2 = map;
            if (p0 == null) {
                p0 = "HOME";
            }
            map2.put("title", p0);
            getLatestBitrateEstimate.write("tab_clicked", map);
        }

        @getMagicModuleMeta
        public static void write(String p0) {
            Bundle bundle = new Bundle();
            bundle.putString("title", p0);
            getTrackGroup.AudioAttributesCompatParcelizer("page_presented", bundle);
        }

        @getMagicModuleMeta
        public static void read() {
            getTrackGroup.AudioAttributesCompatParcelizer("college_year_update_screen", new Bundle());
        }

        @getMagicModuleMeta
        public static void IconCompatParcelizer(String p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Bundle bundle = new Bundle();
            bundle.putString("update_status", p0);
            getTrackGroup.AudioAttributesCompatParcelizer("college_year_update_status", bundle);
        }

        public static void IconCompatParcelizer(AppTheme p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            String str = read(p0);
            Bundle bundle = new Bundle();
            bundle.putString("curr_theme", str);
            getLatestBitrateEstimate.AudioAttributesImplBaseParcelizer.read(str);
            isTrackExcluded.AudioAttributesCompatParcelizer("theme_capture", bundle);
        }

        private static String read(AppTheme p0) {
            int i = write.write[p0.ordinal()];
            if (i == 1) {
                return "dark";
            }
            if (i == 2) {
                return "sepia";
            }
            return "light";
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
