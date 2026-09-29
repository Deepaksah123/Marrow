package kotlin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.util.TypedValue;
import android.view.Window;
import android.widget.Toast;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.google.android.gms.common.util.DeviceProperties;
import com.marrow.R;
import com.marrow.designsystem.theme.AppTheme;
import com.marrow.designsystem.theme.AppThemeManager;
import kotlin.ResolvableApiException;
import kotlin.anyIgnorals;
import kotlin.shouldEscapeCharacter;

/* JADX INFO: loaded from: classes.dex */
public final class CmcdConfigurationRequestConfig {

    /* JADX INFO: loaded from: classes3.dex */
    public static final /* synthetic */ class write {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[AppTheme.values().length];
            try {
                iArr[AppTheme.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AppTheme.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AppTheme.AudioAttributesCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            write = iArr;
        }
    }

    public static final void write(addObserverForBackInvoker addobserverforbackinvoker, int i, Fragment fragment) {
        toMagicModuleMetaRepoModel.write(addobserverforbackinvoker, "");
        toMagicModuleMetaRepoModel.write(fragment, "");
        FragmentManager supportFragmentManager = addobserverforbackinvoker.getSupportFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(supportFragmentManager, "");
        _doAddInjectable _doaddinjectableIconCompatParcelizer = supportFragmentManager.IconCompatParcelizer();
        _doaddinjectableIconCompatParcelizer.write(i, fragment);
        _doaddinjectableIconCompatParcelizer.write();
    }

    public static final void RemoteActionCompatParcelizer(maybeGetTypeVariable maybegettypevariable, Fragment fragment) {
        toMagicModuleMetaRepoModel.write(maybegettypevariable, "");
        toMagicModuleMetaRepoModel.write(fragment, "");
        FragmentManager supportFragmentManager = maybegettypevariable.getSupportFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(supportFragmentManager, "");
        _doAddInjectable _doaddinjectableIconCompatParcelizer = supportFragmentManager.IconCompatParcelizer();
        _doaddinjectableIconCompatParcelizer.write(R.id.container, fragment);
        _doaddinjectableIconCompatParcelizer.read((String) null);
        _doaddinjectableIconCompatParcelizer.write();
    }

    public static final void write(Fragment fragment, int i, Fragment fragment2) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        toMagicModuleMetaRepoModel.write(fragment2, "");
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        _doAddInjectable _doaddinjectableIconCompatParcelizer = childFragmentManager.IconCompatParcelizer();
        _doaddinjectableIconCompatParcelizer.write(i, fragment2);
        _doaddinjectableIconCompatParcelizer.write();
    }

    public static final void RemoteActionCompatParcelizer(Fragment fragment, int i, Fragment fragment2) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        toMagicModuleMetaRepoModel.write(fragment2, "");
        FragmentManager childFragmentManager = fragment.getChildFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(childFragmentManager, "");
        _doAddInjectable _doaddinjectableIconCompatParcelizer = childFragmentManager.IconCompatParcelizer();
        _doaddinjectableIconCompatParcelizer.write(i, fragment2);
        _doaddinjectableIconCompatParcelizer.read("addBackStack");
        _doaddinjectableIconCompatParcelizer.write();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void read(Context context, String str, int i) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        Toast.makeText(context, str, i).show();
    }

    public static final void AudioAttributesCompatParcelizer(Fragment fragment, String str, int i) {
        toMagicModuleMetaRepoModel.write(fragment, "");
        toMagicModuleMetaRepoModel.write(str, "");
        Context context = fragment.getContext();
        if (context != null) {
            read(context, str, i);
        }
    }

    public static final int read(Context context, int i, int i2) {
        toMagicModuleMetaRepoModel.write(context, "");
        TypedValue typedValue = new TypedValue();
        return context.getTheme().resolveAttribute(i, typedValue, true) ? typedValue.data : context.getColor(i2);
    }

    public static /* synthetic */ void write(Activity activity, Integer num, int i, int i2, boolean z, int i3) {
        if ((i3 & 1) != 0) {
            num = null;
        }
        if ((i3 & 2) != 0) {
            i = R.attr.colorSurfaceVariant5;
        }
        if ((i3 & 4) != 0) {
            i2 = R.attr.backgroundColor;
        }
        if ((i3 & 8) != 0) {
            z = false;
        }
        RemoteActionCompatParcelizer(activity, num, i, i2, z);
    }

    private static void RemoteActionCompatParcelizer(Activity activity, Integer num, int i, int i2, boolean z) {
        int iIntValue;
        toMagicModuleMetaRepoModel.write(activity, "");
        AppTheme appTheme = AppThemeManager.read();
        boolean zAudioAttributesCompatParcelizer = AppThemeManager.AudioAttributesCompatParcelizer();
        if (num != null) {
            iIntValue = num.intValue();
        } else if (z && zAudioAttributesCompatParcelizer && appTheme == AppTheme.RemoteActionCompatParcelizer) {
            iIntValue = R.style.Theme_Marrow2_Sepia;
        } else {
            iIntValue = appTheme == AppTheme.read ? R.style.Theme_Marrow2_Dark : R.style.Theme_Marrow2;
        }
        write(activity, iIntValue);
        RemoteActionCompatParcelizer(activity, Integer.valueOf(i), Integer.valueOf(i2));
    }

    public static final void read(Activity activity) {
        toMagicModuleMetaRepoModel.write(activity, "");
        int i = write.write[AppThemeManager.read().ordinal()];
        int i2 = R.style.Marrow2_Transparent;
        if (i != 1 && i == 2) {
            i2 = R.style.Marrow2_Dark_Transparent;
        }
        write(activity, i2);
    }

    public static final int RemoteActionCompatParcelizer() {
        int i = write.write[AppThemeManager.read().ordinal()];
        return (i == 1 || i != 2) ? R.style.AppThemeV2_Transparent_Dim : R.style.AppThemeV2_Dark_Transparent_Dim;
    }

    public static final int IconCompatParcelizer() {
        int i = write.write[AppThemeManager.read().ordinal()];
        return (i == 1 || i != 2) ? R.style.AppThemeV2 : R.style.AppThemeV2_Dark;
    }

    public static final int AudioAttributesCompatParcelizer() {
        int i = write.write[AppThemeManager.read().ordinal()];
        return (i == 1 || i != 2) ? R.style.AppTheme_Video : R.style.AppTheme_Video_Dark;
    }

    public static final int read() {
        int i = write.write[AppThemeManager.read().ordinal()];
        return (i == 1 || i != 2) ? R.style.AppThemeV2_Light_Dialog : R.style.AppThemeV2_Dark_Dialog;
    }

    public static final int write() {
        int i = write.write[AppThemeManager.read().ordinal()];
        return i != 2 ? i != 3 ? R.style.AppTheme_Light_Regular : R.style.AppTheme_Sepia_Regular : R.style.AppTheme_Dark_Regular;
    }

    private static final void write(Activity activity, int i) {
        activity.getTheme().applyStyle(i, true);
    }

    public static final void RemoteActionCompatParcelizer(Activity activity, Integer num, Integer num2) {
        toMagicModuleMetaRepoModel.write(activity, "");
        activity.getWindow().addFlags(Integer.MIN_VALUE);
        if (num != null) {
            activity.getWindow().setStatusBarColor(read(activity, num.intValue(), R.color.mb_50));
        }
        if (num2 != null) {
            activity.getWindow().setNavigationBarColor(read(activity, num2.intValue(), R.color.mb_50));
        }
        findNameForMutator findnameformutator = new findNameForMutator(activity.getWindow(), activity.getWindow().getDecorView());
        boolean z = !AppThemeManager.write();
        findnameformutator.IconCompatParcelizer(z);
        findnameformutator.AudioAttributesCompatParcelizer(z);
    }

    public static final void read(Activity activity, int i) {
        toMagicModuleMetaRepoModel.write(activity, "");
        Window window = activity.getWindow();
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        window.setStatusBarColor(shouldEscapeCharacter.Companion.read(activity, i, new TypedValue(), true));
    }

    public static final void AudioAttributesCompatParcelizer(Activity activity, int i) {
        toMagicModuleMetaRepoModel.write(activity, "");
        Window window = activity.getWindow();
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        window.setNavigationBarColor(shouldEscapeCharacter.Companion.read(activity, i, new TypedValue(), true));
    }

    public static final void RemoteActionCompatParcelizer(Activity activity, int i) {
        toMagicModuleMetaRepoModel.write(activity, "");
        Window window = activity.getWindow();
        shouldEscapeCharacter.Companion companion = shouldEscapeCharacter.INSTANCE;
        window.setBackgroundDrawable(new ColorDrawable(shouldEscapeCharacter.Companion.read(activity, i, new TypedValue(), true)));
    }

    public static final void write(Activity activity, r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<String> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8) {
        toMagicModuleMetaRepoModel.write(activity, "");
        toMagicModuleMetaRepoModel.write(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read("android.permission.CAMERA");
    }

    private static final boolean IconCompatParcelizer(Context context, String str) {
        return _isNaN.checkSelfPermission(context, str) == 0;
    }

    public static final boolean write(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return IconCompatParcelizer(context, "android.permission.POST_NOTIFICATIONS");
    }

    public static final void AudioAttributesCompatParcelizer(r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<String> r8lambdaibk6u1hk7j3awkl_wn934v2uvi8) {
        toMagicModuleMetaRepoModel.write(r8lambdaibk6u1hk7j3awkl_wn934v2uvi8, "");
        r8lambdaibk6u1hk7j3awkl_wn934v2uvi8.read("android.permission.POST_NOTIFICATIONS");
    }

    public static final Activity read(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        while (!(context instanceof Activity)) {
            if (!(context instanceof ContextWrapper)) {
                StringBuilder sb = new StringBuilder();
                sb.append(context);
                sb.append(" is not the activity");
                throw new IllegalStateException(sb.toString());
            }
            context = ((ContextWrapper) context).getBaseContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(context, "");
        }
        return (Activity) context;
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ addObserverForBackInvoker AudioAttributesCompatParcelizer;
        private /* synthetic */ MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> RemoteActionCompatParcelizer;
        private int write;

        /* JADX INFO: renamed from: o.CmcdConfigurationRequestConfig$read$2, reason: invalid class name */
        static final class AnonymousClass2 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private /* synthetic */ Object IconCompatParcelizer;
            private int RemoteActionCompatParcelizer;
            private /* synthetic */ MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                TopUserCompanion topUserCompanion = (TopUserCompanion) this.IconCompatParcelizer;
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.RemoteActionCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> magicModuleSubmissionRequestBody = this.read;
                    this.IconCompatParcelizer = null;
                    this.RemoteActionCompatParcelizer = 1;
                    if (magicModuleSubmissionRequestBody.invoke(topUserCompanion, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass2(MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super AnonymousClass2> sampleVideos) {
                super(2, sampleVideos);
                this.read = magicModuleSubmissionRequestBody;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.read, sampleVideos);
                anonymousClass2.IconCompatParcelizer = obj;
                return anonymousClass2;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass2) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.write = 1;
                if (POJOPropertyBuilderLinked.write(this.AudioAttributesCompatParcelizer, anyIgnorals.write.read, new AnonymousClass2(this.RemoteActionCompatParcelizer, null), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        read(addObserverForBackInvoker addobserverforbackinvoker, MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.AudioAttributesCompatParcelizer = addobserverforbackinvoker;
            this.RemoteActionCompatParcelizer = magicModuleSubmissionRequestBody;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new read(this.AudioAttributesCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final void RemoteActionCompatParcelizer(addObserverForBackInvoker addobserverforbackinvoker, MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody) {
        toMagicModuleMetaRepoModel.write(addobserverforbackinvoker, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        C0201setMcqCount.IconCompatParcelizer(getInternalName.RemoteActionCompatParcelizer(addobserverforbackinvoker), null, null, new read(addobserverforbackinvoker, magicModuleSubmissionRequestBody, null), 3);
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> IconCompatParcelizer;
        private /* synthetic */ addObserverForBackInvoker write;

        /* JADX INFO: renamed from: o.CmcdConfigurationRequestConfig$RemoteActionCompatParcelizer$1, reason: invalid class name */
        static final class AnonymousClass1 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int IconCompatParcelizer;
            private /* synthetic */ Object RemoteActionCompatParcelizer;
            private /* synthetic */ MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                TopUserCompanion topUserCompanion = (TopUserCompanion) this.RemoteActionCompatParcelizer;
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> magicModuleSubmissionRequestBody = this.read;
                    this.RemoteActionCompatParcelizer = null;
                    this.IconCompatParcelizer = 1;
                    if (magicModuleSubmissionRequestBody.invoke(topUserCompanion, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            AnonymousClass1(MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super AnonymousClass1> sampleVideos) {
                super(2, sampleVideos);
                this.read = magicModuleSubmissionRequestBody;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.read, sampleVideos);
                anonymousClass1.RemoteActionCompatParcelizer = obj;
                return anonymousClass1;
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass1) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesCompatParcelizer = 1;
                if (POJOPropertyBuilderLinked.write(this.write, anyIgnorals.write.RemoteActionCompatParcelizer, new AnonymousClass1(this.IconCompatParcelizer, null), this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(addObserverForBackInvoker addobserverforbackinvoker, MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody, SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.write = addobserverforbackinvoker;
            this.IconCompatParcelizer = magicModuleSubmissionRequestBody;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new RemoteActionCompatParcelizer(this.write, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final void read(addObserverForBackInvoker addobserverforbackinvoker, MagicModuleSubmissionRequestBody<? super TopUserCompanion, ? super SampleVideos<? super getShowPopup>, ? extends Object> magicModuleSubmissionRequestBody) {
        toMagicModuleMetaRepoModel.write(addobserverforbackinvoker, "");
        toMagicModuleMetaRepoModel.write(magicModuleSubmissionRequestBody, "");
        C0201setMcqCount.IconCompatParcelizer(getInternalName.RemoteActionCompatParcelizer(addobserverforbackinvoker), null, null, new RemoteActionCompatParcelizer(addobserverforbackinvoker, magicModuleSubmissionRequestBody, null), 3);
    }

    public static final void RemoteActionCompatParcelizer(addObserverForBackInvoker addobserverforbackinvoker, String str) {
        toMagicModuleMetaRepoModel.write(addobserverforbackinvoker, "");
        toMagicModuleMetaRepoModel.write(str, "");
        try {
            addobserverforbackinvoker.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(str)));
        } catch (Exception unused) {
            write(addobserverforbackinvoker, str, "");
        }
    }

    public static final void write(addObserverForBackInvoker addobserverforbackinvoker, String str, String str2) {
        toMagicModuleMetaRepoModel.write(addobserverforbackinvoker, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        ResolvableApiException.Companion iconCompatParcelizer = ResolvableApiException.INSTANCE;
        addobserverforbackinvoker.startActivity(ResolvableApiException.Companion.read(addobserverforbackinvoker, new canceledPendingResult(str, str2, null, 4, null)));
    }

    public static final boolean AudioAttributesImplApi26Parcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return MediaDescriptionCompat(context) && IconCompatParcelizer(context);
    }

    public static final boolean MediaBrowserCompatCustomActionResultReceiver(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return MediaDescriptionCompat(context) && MediaBrowserCompatItemReceiver(context);
    }

    public static final boolean RemoteActionCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return MediaBrowserCompatMediaItem(context) && MediaBrowserCompatItemReceiver(context);
    }

    private static boolean AudioAttributesImplBaseParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return DeviceProperties.isFoldable(context);
    }

    private static boolean MediaBrowserCompatMediaItem(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return (MediaDescriptionCompat(context) || AudioAttributesImplBaseParcelizer(context)) ? false : true;
    }

    private static boolean MediaDescriptionCompat(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return DeviceProperties.isTablet(context);
    }

    public static final boolean AudioAttributesImplApi21Parcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return context.getResources().getBoolean(R.bool.is_tablet);
    }

    public static final boolean IconCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return context.getResources().getConfiguration().orientation == 2;
    }

    public static final boolean MediaBrowserCompatItemReceiver(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        return context.getResources().getConfiguration().orientation == 1;
    }

    public static final String AudioAttributesCompatParcelizer(Context context) {
        toMagicModuleMetaRepoModel.write(context, "");
        try {
            if (Build.VERSION.SDK_INT >= 30) {
                String installingPackageName = context.getPackageManager().getInstallSourceInfo(context.getPackageName()).getInstallingPackageName();
                if (installingPackageName != null) {
                    return installingPackageName;
                }
                String installerPackageName = context.getPackageManager().getInstallerPackageName(context.getPackageName());
                return installerPackageName == null ? "NA" : installerPackageName;
            }
            String installerPackageName2 = context.getPackageManager().getInstallerPackageName(context.getPackageName());
            return installerPackageName2 == null ? "NA" : installerPackageName2;
        } catch (PackageManager.NameNotFoundException unused) {
            return "NA-0";
        } catch (IllegalArgumentException unused2) {
            return "NA-1";
        } catch (Exception unused3) {
            return "NA-2";
        }
    }
}
