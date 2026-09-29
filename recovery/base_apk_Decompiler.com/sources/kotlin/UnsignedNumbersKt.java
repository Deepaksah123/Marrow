package kotlin;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.RemoteException;
import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.UShortSerializer;
import kotlin.deserializeErzVvmY;
import kotlin.deserializeKeyQDdqvc;

/* JADX INFO: loaded from: classes2.dex */
public final class UnsignedNumbersKt {
    private int AudioAttributesCompatParcelizer;
    private final String AudioAttributesImplApi21Parcelizer;
    private final ServiceConnection AudioAttributesImplApi26Parcelizer;
    private final deserializeKeyQDdqvc AudioAttributesImplBaseParcelizer;
    private final Context IconCompatParcelizer;
    private deserializeErzVvmY MediaBrowserCompatCustomActionResultReceiver;
    private final AudioAttributesCompatParcelizer MediaBrowserCompatItemReceiver;
    private final AtomicBoolean MediaBrowserCompatSearchResultReceiver;
    private final TopUserCompanion RemoteActionCompatParcelizer;
    private final ThemeState<Set<String>> read;
    private final UShortSerializer write;

    public UnsignedNumbersKt(Context context, String str, deserializeKeyQDdqvc deserializekeyqddqvc) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(deserializekeyqddqvc, "");
        this.AudioAttributesImplApi21Parcelizer = str;
        this.AudioAttributesImplBaseParcelizer = deserializekeyqddqvc;
        this.IconCompatParcelizer = context.getApplicationContext();
        this.RemoteActionCompatParcelizer = deserializekeyqddqvc.getAudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver();
        this.MediaBrowserCompatSearchResultReceiver = new AtomicBoolean(true);
        this.read = getThemeState.AudioAttributesCompatParcelizer(0, 0, setAddressLine2.read);
        this.MediaBrowserCompatItemReceiver = new AudioAttributesCompatParcelizer(deserializekeyqddqvc.getMediaBrowserCompatSearchResultReceiver());
        this.write = new read();
        this.AudioAttributesImplApi26Parcelizer = new IconCompatParcelizer();
    }

    public final deserializeKeyQDdqvc AudioAttributesCompatParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: loaded from: classes4.dex */
    public static final class RemoteActionCompatParcelizer implements NewNumberOtpResendRequest<Set<? extends String>> {
        final /* synthetic */ String[] RemoteActionCompatParcelizer;
        final /* synthetic */ NewNumberOtpResendRequest read;

        /* JADX INFO: renamed from: o.UnsignedNumbersKt$RemoteActionCompatParcelizer$4, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"T", "R", "p0", "", "IconCompatParcelizer", "(Ljava/lang/Object;Lo/SampleVideos;)Ljava/lang/Object;"}, k = 3, mv = {2, 0, 0}, xi = 48)
        public static final class AnonymousClass4<T> implements getValidationToken {
            final /* synthetic */ getValidationToken $AudioAttributesCompatParcelizer;
            final /* synthetic */ String[] $write;

            /* JADX INFO: renamed from: o.UnsignedNumbersKt$RemoteActionCompatParcelizer$4$2, reason: invalid class name */
            public static final class AnonymousClass2 extends getTotalMcq {
                /* synthetic */ Object read;
                int write;

                public AnonymousClass2(SampleVideos sampleVideos) {
                    super(sampleVideos);
                }

                @Override // kotlin.getMonthName
                public final Object invokeSuspend(Object obj) {
                    this.read = obj;
                    this.write |= Integer.MIN_VALUE;
                    return AnonymousClass4.this.IconCompatParcelizer(null, this);
                }
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0014  */
            @Override // kotlin.getValidationToken
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object IconCompatParcelizer(java.lang.Object r10, kotlin.SampleVideos r11) {
                /*
                    r9 = this;
                    boolean r0 = r11 instanceof o.UnsignedNumbersKt.RemoteActionCompatParcelizer.AnonymousClass4.AnonymousClass2
                    if (r0 == 0) goto L14
                    r0 = r11
                    o.UnsignedNumbersKt$RemoteActionCompatParcelizer$4$2 r0 = (o.UnsignedNumbersKt.RemoteActionCompatParcelizer.AnonymousClass4.AnonymousClass2) r0
                    int r1 = r0.write
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r1 = r1 & r2
                    if (r1 == 0) goto L14
                    int r11 = r0.write
                    int r11 = r11 + r2
                    r0.write = r11
                    goto L19
                L14:
                    o.UnsignedNumbersKt$RemoteActionCompatParcelizer$4$2 r0 = new o.UnsignedNumbersKt$RemoteActionCompatParcelizer$4$2
                    r0.<init>(r11)
                L19:
                    java.lang.Object r11 = r0.read
                    java.lang.Object r1 = kotlin.getYear.IconCompatParcelizer()
                    int r2 = r0.write
                    r3 = 1
                    if (r2 == 0) goto L32
                    if (r2 != r3) goto L2a
                    kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                    goto L80
                L2a:
                    java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                    java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
                    r9.<init>(r10)
                    throw r9
                L32:
                    kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                    o.getValidationToken r11 = r9.$AudioAttributesCompatParcelizer
                    r2 = r0
                    o.SampleVideos r2 = (kotlin.SampleVideos) r2
                    java.util.Set r10 = (java.util.Set) r10
                    java.util.Set r2 = kotlin.getKycMessage.write()
                    java.lang.String[] r9 = r9.$write
                    int r4 = r9.length
                    r5 = 0
                L44:
                    if (r5 >= r4) goto L68
                    r6 = r9[r5]
                    r7 = r10
                    java.lang.Iterable r7 = (java.lang.Iterable) r7
                    java.util.Iterator r7 = r7.iterator()
                L4f:
                    boolean r8 = r7.hasNext()
                    if (r8 == 0) goto L65
                    java.lang.Object r8 = r7.next()
                    java.lang.String r8 = (java.lang.String) r8
                    boolean r8 = kotlin.TestGroupLSModel.read(r6, r8, r3)
                    if (r8 == 0) goto L4f
                    r2.add(r6)
                    goto L4f
                L65:
                    int r5 = r5 + 1
                    goto L44
                L68:
                    java.util.Set r9 = kotlin.getKycMessage.RemoteActionCompatParcelizer(r2)
                    java.util.Collection r9 = (java.util.Collection) r9
                    boolean r10 = r9.isEmpty()
                    if (r10 == 0) goto L75
                    r9 = 0
                L75:
                    if (r9 == 0) goto L80
                    r0.write = r3
                    java.lang.Object r9 = r11.IconCompatParcelizer(r9, r0)
                    if (r9 != r1) goto L80
                    return r1
                L80:
                    o.getShowPopup r9 = kotlin.getShowPopup.INSTANCE
                    return r9
                */
                throw new UnsupportedOperationException("Method not decompiled: o.UnsignedNumbersKt.RemoteActionCompatParcelizer.AnonymousClass4.IconCompatParcelizer(java.lang.Object, o.SampleVideos):java.lang.Object");
            }

            public AnonymousClass4(getValidationToken getvalidationtoken, String[] strArr) {
                this.$AudioAttributesCompatParcelizer = getvalidationtoken;
                this.$write = strArr;
            }
        }

        public RemoteActionCompatParcelizer(NewNumberOtpResendRequest newNumberOtpResendRequest, String[] strArr) {
            this.read = newNumberOtpResendRequest;
            this.RemoteActionCompatParcelizer = strArr;
        }

        @Override // kotlin.NewNumberOtpResendRequest
        public final Object write(getValidationToken<? super Set<? extends String>> getvalidationtoken, SampleVideos sampleVideos) {
            Object objWrite = this.read.write(new AnonymousClass4(getvalidationtoken, this.RemoteActionCompatParcelizer), sampleVideos);
            return objWrite == getYear.IconCompatParcelizer() ? objWrite : getShowPopup.INSTANCE;
        }
    }

    public static final class AudioAttributesCompatParcelizer extends deserializeKeyQDdqvc.write {
        @Override // o.deserializeKeyQDdqvc.write
        public final boolean AudioAttributesCompatParcelizer() {
            return true;
        }

        AudioAttributesCompatParcelizer(String[] strArr) {
            super(strArr);
        }

        @Override // o.deserializeKeyQDdqvc.write
        public final void write(Set<String> set) {
            toMagicModuleMetaRepoModel.write(set, "");
            if (UnsignedNumbersKt.this.MediaBrowserCompatSearchResultReceiver.get()) {
                return;
            }
            try {
                deserializeErzVvmY deserializeerzvvmy = UnsignedNumbersKt.this.MediaBrowserCompatCustomActionResultReceiver;
                if (deserializeerzvvmy != null) {
                    deserializeerzvvmy.AudioAttributesCompatParcelizer(UnsignedNumbersKt.this.AudioAttributesCompatParcelizer, (String[]) set.toArray(new String[0]));
                }
            } catch (RemoteException e) {
            }
        }
    }

    public static final class read extends UShortSerializer.write {
        read() {
        }

        static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            final /* synthetic */ UnsignedNumbersKt AudioAttributesCompatParcelizer;
            private int IconCompatParcelizer;
            final /* synthetic */ String[] RemoteActionCompatParcelizer;
            private Object read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                Set<String> set;
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    String[] strArr = this.RemoteActionCompatParcelizer;
                    Set<String> setIconCompatParcelizer = getKycMessage.IconCompatParcelizer(Arrays.copyOf(strArr, strArr.length));
                    this.read = setIconCompatParcelizer;
                    this.IconCompatParcelizer = 1;
                    if (this.AudioAttributesCompatParcelizer.read.IconCompatParcelizer(setIconCompatParcelizer, this) == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                    set = setIconCompatParcelizer;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    set = (Set) this.read;
                    SdkPayloadData.IconCompatParcelizer(obj);
                }
                this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer().IconCompatParcelizer(set);
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            write(String[] strArr, UnsignedNumbersKt unsignedNumbersKt, SampleVideos<? super write> sampleVideos) {
                super(2, sampleVideos);
                this.RemoteActionCompatParcelizer = strArr;
                this.AudioAttributesCompatParcelizer = unsignedNumbersKt;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new write(this.RemoteActionCompatParcelizer, this.AudioAttributesCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.UShortSerializer
        public final void write(String[] strArr) {
            toMagicModuleMetaRepoModel.write(strArr, "");
            C0201setMcqCount.IconCompatParcelizer(UnsignedNumbersKt.this.RemoteActionCompatParcelizer, null, null, new write(strArr, UnsignedNumbersKt.this, null), 3);
        }
    }

    public static final class IconCompatParcelizer implements ServiceConnection {
        IconCompatParcelizer() {
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            toMagicModuleMetaRepoModel.write(componentName, "");
            toMagicModuleMetaRepoModel.write(iBinder, "");
            UnsignedNumbersKt.this.MediaBrowserCompatCustomActionResultReceiver = deserializeErzVvmY.IconCompatParcelizer.read(iBinder);
            UnsignedNumbersKt.this.write();
        }

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            toMagicModuleMetaRepoModel.write(componentName, "");
            UnsignedNumbersKt.this.MediaBrowserCompatCustomActionResultReceiver = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write() {
        try {
            deserializeErzVvmY deserializeerzvvmy = this.MediaBrowserCompatCustomActionResultReceiver;
            if (deserializeerzvvmy != null) {
                this.AudioAttributesCompatParcelizer = deserializeerzvvmy.IconCompatParcelizer(this.write, this.AudioAttributesImplApi21Parcelizer);
            }
        } catch (RemoteException e) {
        }
    }

    public final void read(Intent intent) {
        toMagicModuleMetaRepoModel.write(intent, "");
        if (this.MediaBrowserCompatSearchResultReceiver.compareAndSet(true, false)) {
            this.IconCompatParcelizer.bindService(intent, this.AudioAttributesImplApi26Parcelizer, 1);
            this.AudioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer(this.MediaBrowserCompatItemReceiver);
        }
    }

    public final void IconCompatParcelizer() {
        if (this.MediaBrowserCompatSearchResultReceiver.compareAndSet(false, true)) {
            this.AudioAttributesImplBaseParcelizer.read(this.MediaBrowserCompatItemReceiver);
            try {
                deserializeErzVvmY deserializeerzvvmy = this.MediaBrowserCompatCustomActionResultReceiver;
                if (deserializeerzvvmy != null) {
                    deserializeerzvvmy.RemoteActionCompatParcelizer(this.write, this.AudioAttributesCompatParcelizer);
                }
            } catch (RemoteException e) {
            }
            this.IconCompatParcelizer.unbindService(this.AudioAttributesImplApi26Parcelizer);
        }
    }

    public final NewNumberOtpResendRequest<Set<String>> RemoteActionCompatParcelizer(String[] strArr) {
        toMagicModuleMetaRepoModel.write(strArr, "");
        return new RemoteActionCompatParcelizer(this.read, strArr);
    }
}
