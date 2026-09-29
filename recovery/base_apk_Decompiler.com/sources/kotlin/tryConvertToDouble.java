package kotlin;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.window.SplashScreenView;
import kotlin.Metadata;
import kotlin.configureFromArraySettings;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \f2\u00020\u0001:\u0004\f\n\u0007\rB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0007\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u000b"}, d2 = {"Lo/tryConvertToDouble;", "", "Landroid/app/Activity;", "p0", "<init>", "(Landroid/app/Activity;)V", "", "write", "()V", "Lo/tryConvertToDouble$RemoteActionCompatParcelizer;", "RemoteActionCompatParcelizer", "Lo/tryConvertToDouble$RemoteActionCompatParcelizer;", "read", "AudioAttributesCompatParcelizer"}, k = 1, mv = {1, 6, 0}, xi = 48)
public final class tryConvertToDouble {

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RemoteActionCompatParcelizer write;

    public interface AudioAttributesCompatParcelizer {
    }

    private tryConvertToDouble(Activity activity) {
        this.write = Build.VERSION.SDK_INT >= 31 ? new write(activity) : new RemoteActionCompatParcelizer(activity);
    }

    /* JADX INFO: renamed from: o.tryConvertToDouble$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0007¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/tryConvertToDouble$read;", "", "<init>", "()V", "Landroid/app/Activity;", "Lo/tryConvertToDouble;", "write", "(Landroid/app/Activity;)Lo/tryConvertToDouble;"}, k = 1, mv = {1, 6, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        @getMagicModuleMeta
        public static tryConvertToDouble write(Activity activity) {
            toMagicModuleMetaRepoModel.write(activity, "");
            tryConvertToDouble tryconverttodouble = new tryConvertToDouble(activity, null);
            tryconverttodouble.write();
            return tryconverttodouble;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write() {
        this.write.write();
    }

    public /* synthetic */ tryConvertToDouble(Activity activity, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(activity);
    }

    static class RemoteActionCompatParcelizer {
        private boolean AudioAttributesCompatParcelizer;
        private AudioAttributesCompatParcelizer AudioAttributesImplApi21Parcelizer;
        private Drawable AudioAttributesImplApi26Parcelizer;
        private final Activity IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private Integer read;
        private Integer write;

        public RemoteActionCompatParcelizer(Activity activity) {
            toMagicModuleMetaRepoModel.write(activity, "");
            this.IconCompatParcelizer = activity;
            this.AudioAttributesImplApi21Parcelizer = new AudioAttributesCompatParcelizer() { // from class: o.configureFromBigIntegerCreator
            };
        }

        public final Activity IconCompatParcelizer() {
            return this.IconCompatParcelizer;
        }

        public void write() {
            TypedValue typedValue = new TypedValue();
            Resources.Theme theme = this.IconCompatParcelizer.getTheme();
            if (theme.resolveAttribute(configureFromArraySettings.IconCompatParcelizer.windowSplashScreenBackground, typedValue, true)) {
                this.read = Integer.valueOf(typedValue.resourceId);
                this.write = Integer.valueOf(typedValue.data);
            }
            if (theme.resolveAttribute(configureFromArraySettings.IconCompatParcelizer.windowSplashScreenAnimatedIcon, typedValue, true)) {
                this.AudioAttributesImplApi26Parcelizer = theme.getDrawable(typedValue.resourceId);
            }
            if (theme.resolveAttribute(configureFromArraySettings.IconCompatParcelizer.splashScreenIconSize, typedValue, true)) {
                this.AudioAttributesCompatParcelizer = typedValue.resourceId == configureFromArraySettings.AudioAttributesCompatParcelizer.splashscreen_icon_size_with_background;
            }
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(theme, "");
            RemoteActionCompatParcelizer(theme, typedValue);
        }

        protected final void RemoteActionCompatParcelizer(Resources.Theme theme, TypedValue typedValue) {
            toMagicModuleMetaRepoModel.write(theme, "");
            toMagicModuleMetaRepoModel.write(typedValue, "");
            if (theme.resolveAttribute(configureFromArraySettings.IconCompatParcelizer.postSplashScreenTheme, typedValue, true)) {
                int i = typedValue.resourceId;
                this.RemoteActionCompatParcelizer = i;
                if (i != 0) {
                    this.IconCompatParcelizer.setTheme(i);
                }
            }
        }
    }

    static final class write extends RemoteActionCompatParcelizer {
        private boolean RemoteActionCompatParcelizer;
        private final ViewGroup.OnHierarchyChangeListener read;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public write(Activity activity) {
            super(activity);
            toMagicModuleMetaRepoModel.write(activity, "");
            this.RemoteActionCompatParcelizer = true;
            this.read = new IconCompatParcelizer(activity);
        }

        public static final class IconCompatParcelizer implements ViewGroup.OnHierarchyChangeListener {
            final /* synthetic */ Activity IconCompatParcelizer;

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewRemoved(View view, View view2) {
            }

            IconCompatParcelizer(Activity activity) {
                this.IconCompatParcelizer = activity;
            }

            @Override // android.view.ViewGroup.OnHierarchyChangeListener
            public final void onChildViewAdded(View view, View view2) {
                if (view2 instanceof SplashScreenView) {
                    write.cr_((SplashScreenView) view2);
                    ((ViewGroup) this.IconCompatParcelizer.getWindow().getDecorView()).setOnHierarchyChangeListener(null);
                }
            }
        }

        public static boolean cr_(SplashScreenView splashScreenView) {
            toMagicModuleMetaRepoModel.write(splashScreenView, "");
            WindowInsets windowInsetsBuild = new WindowInsets.Builder().build();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(windowInsetsBuild, "");
            Rect rect = new Rect(Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE);
            return (windowInsetsBuild == splashScreenView.getRootView().computeSystemWindowInsets(windowInsetsBuild, rect) && rect.isEmpty()) ? false : true;
        }

        @Override // o.tryConvertToDouble.RemoteActionCompatParcelizer
        public final void write() {
            Resources.Theme theme = IconCompatParcelizer().getTheme();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(theme, "");
            RemoteActionCompatParcelizer(theme, new TypedValue());
            ((ViewGroup) IconCompatParcelizer().getWindow().getDecorView()).setOnHierarchyChangeListener(this.read);
        }
    }
}
