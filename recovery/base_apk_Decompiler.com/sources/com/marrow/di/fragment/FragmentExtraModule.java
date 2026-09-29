package com.marrow.di.fragment;

import android.content.Context;
import android.os.Handler;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.marrow.TrainingApplication;
import java.lang.reflect.Constructor;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.RtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0;
import kotlin.RtspMediaSource;
import kotlin.onRebuffer;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b&\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/marrow/di/fragment/FragmentExtraModule;", "", "<init>", "()V", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
public abstract class FragmentExtraModule {

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: com.marrow.di.fragment.FragmentExtraModule$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\f"}, d2 = {"Lcom/marrow/di/fragment/FragmentExtraModule$RemoteActionCompatParcelizer;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "read$767fef6", "(Landroid/content/Context;)Ljava/lang/Object;", "Lo/onRebuffer;", "p1", "Lo/RtspMediaSource;", "AudioAttributesCompatParcelizer", "(Landroid/content/Context;Lo/onRebuffer;)Lo/RtspMediaSource;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public final Object read$767fef6(Context p0) throws Throwable {
            toMagicModuleMetaRepoModel.write(p0, "");
            try {
                Object[] objArr = {p0};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-404213719);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 1), 24269 - ExpandableListView.getPackedPositionGroup(0L), (ViewConfiguration.getEdgeSlop() >> 16) + 17, -1717439300, false, null, new Class[]{Context.class});
                }
                return ((Constructor) objRemoteActionCompatParcelizer).newInstance(objArr);
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }

        public final RtspMediaSource AudioAttributesCompatParcelizer(Context p0, onRebuffer p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            return new RtspMediaPeriodRtpLoadInfoExternalSyntheticLambda0(TrainingApplication.IconCompatParcelizer(p0), new Handler(), p1);
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
