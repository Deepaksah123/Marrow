package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.ScrollView;
import android.widget.TextView;
import com.google.android.exoplayer2.source.rtsp.SessionDescription;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.material.textfield.TextInputEditText;
import com.marrow.R;
import com.marrow2.ui.onboarding.main_phone.PhoneNumberViewModel;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.readHeader;
import kotlin.readIBinder;
import kotlin.readIntegerObject;
import kotlin.readLongObject;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0014¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u001f\u0010\r\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0010\u0010\u0003R\u0016\u0010\u000f\u001a\u00020\u00118\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001b\u0010\r\u001a\u00020\u00148CX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017"}, d2 = {"Lo/createStringSparseArray;", "Lo/addObserverForBackInvoker;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "onBackPressed", "", "", "p1", "read", "(ILjava/lang/String;)V", "write", "AudioAttributesImplBaseParcelizer", "Lo/parseSelectionFlagsFromRoleDescriptors;", "AudioAttributesCompatParcelizer", "Lo/parseSelectionFlagsFromRoleDescriptors;", "Lcom/marrow2/ui/onboarding/main_phone/PhoneNumberViewModel;", "Lo/RenewEligible;", "AudioAttributesImplApi26Parcelizer", "()Lcom/marrow2/ui/onboarding/main_phone/PhoneNumberViewModel;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class createStringSparseArray extends createString {
    private static char[] AudioAttributesImplApi21Parcelizer;
    private static int AudioAttributesImplApi26Parcelizer;
    private static byte[] AudioAttributesImplBaseParcelizer;
    private static int IconCompatParcelizer;
    private static int MediaBrowserCompatCustomActionResultReceiver;
    private static short[] MediaBrowserCompatItemReceiver;
    private static int MediaBrowserCompatMediaItem;
    private static boolean MediaBrowserCompatSearchResultReceiver;
    private static boolean RatingCompat;
    private static int RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private parseSelectionFlagsFromRoleDescriptors write;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final RenewEligible read;
    private static final byte[] $$l = {5, 107, -8, 109};
    private static final int $$m = 34;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$j = {66, 100, 74, -7, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 13, -1, -62, 58, 9, 1, -7, 6, -6, -54, TarConstants.LF_BLK, 14, -9, 15, -2, -5, -4, -53, 64, -11, 20, -14, 14, -8, -7, 12, -61, 71, -18, 2, 18, -68, 39, 14, 2, -21, 22, 25, -9, 7, 0, -79, 79, -12, -3, 4, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, -64, 77, 1, -21, 13, -4, -8, 12, -14};
    private static final int $$k = 175;
    private static final byte[] $$d = {81, 95, TarConstants.LF_LINK, -71, -20, -9, -3, -6, 14, 35, -35, -18, 10, -7, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, 12, 3, -4, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, 42, -44, 14, -9, 26, -20, 1, -3, -5, -14, 16, -14, -27, -13, 0, 42, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 47, -45, 1, -4, 14, -20, 35, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$e = 22;
    private static int onAddQueueItem = 1;
    private static int MediaMetadataCompat = 0;
    private static int MediaDescriptionCompat = 1;

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$n(byte r7, short r8, short r9) {
        /*
            int r7 = r7 * 3
            int r7 = r7 + 112
            byte[] r0 = kotlin.createStringSparseArray.$$l
            int r8 = r8 + 4
            int r9 = r9 * 2
            int r9 = 1 - r9
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r7 = r9
            r5 = r2
            goto L2a
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L23:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r7 = r7 + r8
            r8 = r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createStringSparseArray.$$n(byte, short, short):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0020  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0018  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0020 -> B:11:0x0022). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void g(short r6, byte r7, short r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.createStringSparseArray.$$d
            int r7 = 44 - r7
            int r8 = 114 - r8
            int r6 = 191 - r6
            byte[] r1 = new byte[r7]
            r2 = 0
            if (r0 != 0) goto L10
            r3 = r7
            r5 = r2
            goto L22
        L10:
            r3 = r2
        L11:
            byte r4 = (byte) r8
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r7) goto L20
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L20:
            r3 = r0[r6]
        L22:
            int r3 = -r3
            int r8 = r8 + r3
            int r6 = r6 + 1
            int r8 = r8 + (-1)
            r3 = r5
            goto L11
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createStringSparseArray.g(short, byte, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void h(int r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 + 73
            byte[] r0 = kotlin.createStringSparseArray.$$j
            int r7 = r7 + 4
            int r8 = 47 - r8
            byte[] r1 = new byte[r8]
            r2 = 0
            if (r0 != 0) goto L11
            r9 = r7
            r3 = r8
            r4 = r2
            goto L28
        L11:
            r3 = r2
        L12:
            int r7 = r7 + 1
            int r4 = r3 + 1
            byte r5 = (byte) r9
            r1[r3] = r5
            if (r4 != r8) goto L23
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L23:
            r3 = r0[r7]
            r6 = r9
            r9 = r7
            r7 = r6
        L28:
            int r7 = r7 + r3
            int r7 = r7 + (-1)
            r3 = r4
            r6 = r9
            r9 = r7
            r7 = r6
            goto L12
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createStringSparseArray.h(int, byte, byte, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object write(int i, int i2, int i3, int i4, int i5, Object[] objArr, int i6) {
        int i7 = ~i3;
        int i8 = ~i5;
        int i9 = (~(i7 | i8)) | i;
        int i10 = ~(i3 | i5);
        int i11 = i9 | i10;
        int i12 = ~i;
        int i13 = (~(i12 | i5)) | (~(i12 | i3)) | i10;
        int i14 = (~(i7 | i5)) | (~(i8 | i3));
        int i15 = i3 + i5 + i6 + (1040777104 * i2) + ((-1861505373) * i4);
        int i16 = i15 * i15;
        int i17 = (i3 * (-1036928585)) + 527892480 + ((-1036928585) * i5) + ((-562525036) * i11) + (562525036 * i13) + ((-281262518) * i14) + ((-1318191104) * i6) + (1608515584 * i2) + ((-1123418112) * i4) + ((-2114519040) * i16);
        int i18 = (i3 * 1703033811) + 1712528133 + (i5 * 1703033811) + (i11 * 1508) + (i13 * (-1508)) + (i14 * 754) + (i6 * 1703034565) + (i2 * (-2114876976)) + (i4 * 1880022383) + (i16 * (-720175104));
        int i19 = i17 + (i18 * i18 * (-739180544));
        return i19 != 1 ? i19 != 2 ? i19 != 3 ? i19 != 4 ? read(objArr) : IconCompatParcelizer(objArr) : AudioAttributesCompatParcelizer(objArr) : RemoteActionCompatParcelizer(objArr) : write(objArr);
    }

    public createStringSparseArray() {
        createStringSparseArray createstringsparsearray = this;
        this.read = new VirtualAnnotatedMember(toMagicModuleMetaDataUcModel.write(PhoneNumberViewModel.class), new AnonymousClass3(createstringsparsearray), new AnonymousClass5(createstringsparsearray), new AnonymousClass4(createstringsparsearray));
    }

    public static final /* synthetic */ parseSelectionFlagsFromRoleDescriptors AudioAttributesCompatParcelizer(createStringSparseArray createstringsparsearray) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat;
        int i3 = i2 + 65;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptors = createstringsparsearray.write;
        int i5 = i2 + 17;
        MediaDescriptionCompat = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 18 / 0;
        }
        return parseselectionflagsfromroledescriptors;
    }

    public static final /* synthetic */ void AudioAttributesCompatParcelizer(createStringSparseArray createstringsparsearray, int i, String str) {
        int i2 = 2 % 2;
        int i3 = MediaMetadataCompat + 117;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        createstringsparsearray.read(i, str);
        int i5 = MediaMetadataCompat + 79;
        MediaDescriptionCompat = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ PhoneNumberViewModel RemoteActionCompatParcelizer(createStringSparseArray createstringsparsearray) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 27;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            createstringsparsearray.AudioAttributesImplApi26Parcelizer();
            throw null;
        }
        PhoneNumberViewModel phoneNumberViewModelAudioAttributesImplApi26Parcelizer = createstringsparsearray.AudioAttributesImplApi26Parcelizer();
        int i3 = MediaDescriptionCompat + 111;
        MediaMetadataCompat = i3 % 128;
        if (i3 % 2 == 0) {
            return phoneNumberViewModelAudioAttributesImplApi26Parcelizer;
        }
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        createStringSparseArray createstringsparsearray = (createStringSparseArray) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        String str = (String) objArr[2];
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 9;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        createstringsparsearray.write(iIntValue, str);
        if (i3 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ void read(createStringSparseArray createstringsparsearray) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 79;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        createstringsparsearray.AudioAttributesImplBaseParcelizer();
        if (i3 != 0) {
            int i4 = 54 / 0;
        }
    }

    private final PhoneNumberViewModel AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 57;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        PhoneNumberViewModel phoneNumberViewModel = (PhoneNumberViewModel) this.read.RemoteActionCompatParcelizer();
        if (i3 == 0) {
            return phoneNumberViewModel;
        }
        throw null;
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusAudioAttributesImplApi26Parcelizer = createStringSparseArray.RemoteActionCompatParcelizer(createStringSparseArray.this).AudioAttributesImplApi26Parcelizer();
                final createStringSparseArray createstringsparsearray = createStringSparseArray.this;
                this.write = 1;
                if (setupdatedstatusAudioAttributesImplApi26Parcelizer.write(new getValidationToken() { // from class: o.createStringSparseArray.IconCompatParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object IconCompatParcelizer(boolean z) {
                        parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer = createStringSparseArray.AudioAttributesCompatParcelizer(createstringsparsearray);
                        if (parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer = null;
                        }
                        ProgressBar progressBar = parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
                        progressBar.setVisibility(z ? 0 : 8);
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        IconCompatParcelizer(SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return createStringSparseArray.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<readLongObject> setupdatedstatusIconCompatParcelizer = createStringSparseArray.RemoteActionCompatParcelizer(createStringSparseArray.this).IconCompatParcelizer();
                final createStringSparseArray createstringsparsearray = createStringSparseArray.this;
                this.write = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.createStringSparseArray.write.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((readLongObject) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(readLongObject readlongobject) {
                        if (readlongobject instanceof readLongObject.IconCompatParcelizer) {
                            readLongObject.IconCompatParcelizer iconCompatParcelizer = (readLongObject.IconCompatParcelizer) readlongobject;
                            createStringSparseArray.AudioAttributesCompatParcelizer(createstringsparsearray, iconCompatParcelizer.IconCompatParcelizer(), iconCompatParcelizer.read());
                        } else {
                            if (!(readlongobject instanceof readLongObject.read)) {
                                throw new RenewEligibleCreator();
                            }
                            createStringSparseArray createstringsparsearray2 = createstringsparsearray;
                            readLongObject.read readVar = (readLongObject.read) readlongobject;
                            int i2 = readVar.read();
                            Object[] objArr = {createstringsparsearray2, Integer.valueOf(i2), readVar.AudioAttributesCompatParcelizer()};
                            createStringSparseArray.write(zba.RemoteActionCompatParcelizer(), zba.RemoteActionCompatParcelizer(), 863699000, zba.RemoteActionCompatParcelizer(), -863698998, objArr, zba.RemoteActionCompatParcelizer());
                        }
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        write(SampleVideos<? super write> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return createStringSparseArray.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<readIBinder> setupdatedstatus = createStringSparseArray.RemoteActionCompatParcelizer(createStringSparseArray.this).read();
                final createStringSparseArray createstringsparsearray = createStringSparseArray.this;
                this.write = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.createStringSparseArray.AudioAttributesCompatParcelizer.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return read((readIBinder) obj2);
                    }

                    private Object read(readIBinder readibinder) {
                        parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer = createStringSparseArray.AudioAttributesCompatParcelizer(createstringsparsearray);
                        parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptors = null;
                        if (parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer = null;
                        }
                        parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer.read.MediaBrowserCompatCustomActionResultReceiver.setAlpha(1.0f);
                        parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer2 = createStringSparseArray.AudioAttributesCompatParcelizer(createstringsparsearray);
                        if (parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer2 == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer2 = null;
                        }
                        parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer2.read.MediaBrowserCompatCustomActionResultReceiver.setEnabled(true);
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(readibinder, readIBinder.read.INSTANCE)) {
                            parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer3 = createStringSparseArray.AudioAttributesCompatParcelizer(createstringsparsearray);
                            if (parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer3 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                parseselectionflagsfromroledescriptors = parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer3;
                            }
                            parseselectionflagsfromroledescriptors.read.MediaBrowserCompatCustomActionResultReceiver.setText(R.string.btn_call_me);
                        } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(readibinder, readIBinder.IconCompatParcelizer.INSTANCE)) {
                            parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer4 = createStringSparseArray.AudioAttributesCompatParcelizer(createstringsparsearray);
                            if (parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer4 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                parseselectionflagsfromroledescriptors = parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer4;
                            }
                            parseselectionflagsfromroledescriptors.read.MediaBrowserCompatCustomActionResultReceiver.setText(R.string.text_resend_otp);
                        } else {
                            if (!(readibinder instanceof readIBinder.AudioAttributesCompatParcelizer)) {
                                throw new RenewEligibleCreator();
                            }
                            readIBinder.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = (readIBinder.AudioAttributesCompatParcelizer) readibinder;
                            int iRemoteActionCompatParcelizer = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                            int iRemoteActionCompatParcelizer2 = audioAttributesCompatParcelizer.RemoteActionCompatParcelizer();
                            String strConcat = iRemoteActionCompatParcelizer < 10 ? SessionDescription.SUPPORTED_SDP_VERSION.concat(String.valueOf(iRemoteActionCompatParcelizer2)) : String.valueOf(iRemoteActionCompatParcelizer2);
                            parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer5 = createStringSparseArray.AudioAttributesCompatParcelizer(createstringsparsearray);
                            if (parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer5 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer5 = null;
                            }
                            parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer5.read.MediaBrowserCompatCustomActionResultReceiver.setText(createstringsparsearray.getString(R.string.f_call_me, strConcat));
                            parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer6 = createStringSparseArray.AudioAttributesCompatParcelizer(createstringsparsearray);
                            if (parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer6 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer6 = null;
                            }
                            parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer6.read.MediaBrowserCompatCustomActionResultReceiver.setAlpha(0.5f);
                            parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer7 = createStringSparseArray.AudioAttributesCompatParcelizer(createstringsparsearray);
                            if (parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer7 == null) {
                                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            } else {
                                parseselectionflagsfromroledescriptors = parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer7;
                            }
                            parseselectionflagsfromroledescriptors.read.MediaBrowserCompatCustomActionResultReceiver.setEnabled(false);
                        }
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        AudioAttributesCompatParcelizer(SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return createStringSparseArray.this.new AudioAttributesCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.createStringSparseArray$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "IconCompatParcelizer", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ MediaBrowserCompatMediaItem $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            return this.$write.getDefaultViewModelProviderFactory();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$write = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<readSize> setupdatedstatusAudioAttributesImplBaseParcelizer = createStringSparseArray.RemoteActionCompatParcelizer(createStringSparseArray.this).AudioAttributesImplBaseParcelizer();
                final createStringSparseArray createstringsparsearray = createStringSparseArray.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplBaseParcelizer.write(new getValidationToken() { // from class: o.createStringSparseArray.RemoteActionCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((readSize) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(readSize readsize) {
                        parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer = createStringSparseArray.AudioAttributesCompatParcelizer(createstringsparsearray);
                        if (parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer == null) {
                            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                            parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer = null;
                        }
                        DashDownloader dashDownloader = parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer.read;
                        LinearLayout linearLayout = dashDownloader.RemoteActionCompatParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                        linearLayout.setVisibility(readsize.getRead() ? 0 : 8);
                        TextView textView = dashDownloader.MediaBrowserCompatItemReceiver;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
                        textView.setVisibility(readsize.getAudioAttributesCompatParcelizer() ? 0 : 8);
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return createStringSparseArray.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.createStringSparseArray$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ MediaBrowserCompatMediaItem $AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return this.$AudioAttributesCompatParcelizer.getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$AudioAttributesCompatParcelizer = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: renamed from: o.createStringSparseArray$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "read", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $AudioAttributesCompatParcelizer = null;
        private /* synthetic */ MediaBrowserCompatMediaItem $read;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            return this.$read.getDefaultViewModelCreationExtras();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem) {
            super(0);
            this.$read = mediaBrowserCompatMediaItem;
        }
    }

    /* JADX INFO: loaded from: classes3.dex */
    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<readIntegerObject> setupdatedstatusAudioAttributesCompatParcelizer = createStringSparseArray.RemoteActionCompatParcelizer(createStringSparseArray.this).AudioAttributesCompatParcelizer();
                final createStringSparseArray createstringsparsearray = createStringSparseArray.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesCompatParcelizer.write(new getValidationToken() { // from class: o.createStringSparseArray.MediaBrowserCompatCustomActionResultReceiver.4
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((readIntegerObject) obj2);
                    }

                    private Object IconCompatParcelizer(readIntegerObject readintegerobject) {
                        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(readintegerobject, readIntegerObject.RemoteActionCompatParcelizer.INSTANCE)) {
                            if (readintegerobject instanceof readIntegerObject.read) {
                                PlayerControlViewExternalSyntheticLambda1.write(createstringsparsearray, ((readIntegerObject.read) readintegerobject).read());
                            } else if (readintegerobject instanceof readIntegerObject.IconCompatParcelizer) {
                                createStringSparseArray.read(createstringsparsearray);
                                PlayerControlViewExternalSyntheticLambda1.write(createstringsparsearray, ((readIntegerObject.IconCompatParcelizer) readintegerobject).read());
                            } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(readintegerobject, readIntegerObject.AudioAttributesCompatParcelizer.INSTANCE)) {
                                createstringsparsearray.finish();
                            } else {
                                if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(readintegerobject, readIntegerObject.write.INSTANCE)) {
                                    throw new RenewEligibleCreator();
                                }
                                parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer = createStringSparseArray.AudioAttributesCompatParcelizer(createstringsparsearray);
                                if (parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer = null;
                                }
                                parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer.read.write.setText("");
                                parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer2 = createStringSparseArray.AudioAttributesCompatParcelizer(createstringsparsearray);
                                if (parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer2 == null) {
                                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                                    parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer2 = null;
                                }
                                parseselectionflagsfromroledescriptorsAudioAttributesCompatParcelizer2.read.AudioAttributesImplApi26Parcelizer.setError(null);
                            }
                        }
                        createStringSparseArray.RemoteActionCompatParcelizer(createstringsparsearray).IconCompatParcelizer(readHeader.AudioAttributesCompatParcelizer.INSTANCE);
                        return getShowPopup.INSTANCE;
                    }
                }, this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            throw new PlanDetailsCreator();
        }

        MediaBrowserCompatCustomActionResultReceiver(SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return createStringSparseArray.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer implements TextWatcher {
        private /* synthetic */ DashDownloader read;

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        public AudioAttributesImplApi21Parcelizer(DashDownloader dashDownloader) {
            this.read = dashDownloader;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            String strValueOf = String.valueOf(editable);
            this.read.AudioAttributesImplBaseParcelizer.setAlpha(strValueOf.length() >= 4 ? 1.0f : 0.5f);
            this.read.AudioAttributesImplBaseParcelizer.setEnabled(strValueOf.length() >= 4);
        }
    }

    private static void f(byte[] bArr, int i, char[] cArr, int[] iArr, Object[] objArr) throws Throwable {
        int i2 = 2 % 2;
        notifyDownloads notifydownloads = new notifyDownloads();
        char[] cArr2 = AudioAttributesImplApi21Parcelizer;
        if (cArr2 != null) {
            int length = cArr2.length;
            char[] cArr3 = new char[length];
            for (int i3 = 0; i3 < length; i3++) {
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr2[i3])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-298077624);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (44861 - ImageFormat.getBitsPerPixel(0)), 18944 - TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getTapTimeout() >> 16) + 28, -1871546659, false, CmcdHeadersFactory.STREAMING_FORMAT_SS, new Class[]{Integer.TYPE});
                    }
                    cArr3[i3] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr2 = cArr3;
        }
        Object[] objArr3 = {Integer.valueOf(AudioAttributesImplApi26Parcelizer)};
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(680566917);
        if (objRemoteActionCompatParcelizer2 == null) {
            objRemoteActionCompatParcelizer2 = startForeground.read((char) KeyEvent.getDeadChar(0, 0), 19033 - Color.red(0), 75 - Color.red(0), 1457087504, false, "r", new Class[]{Integer.TYPE});
        }
        int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).intValue();
        long j = 0;
        if (MediaBrowserCompatSearchResultReceiver) {
            int i4 = $11 + 17;
            $10 = i4 % 128;
            int i5 = i4 % 2;
            notifydownloads.AudioAttributesCompatParcelizer = bArr.length;
            char[] cArr4 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr4[notifydownloads.IconCompatParcelizer] = (char) (cArr2[bArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] + i] - iIntValue);
                Object[] objArr4 = {notifydownloads, notifydownloads};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1593953308);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (ViewConfiguration.getPressedStateDuration() >> 16), (ViewConfiguration.getGlobalActionKeyTimeout() > j ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == j ? 0 : -1)) + 11438, TextUtils.indexOf((CharSequence) "", '0', 0) + 15, -558368911, false, "q", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                int i6 = $11 + 13;
                $10 = i6 % 128;
                int i7 = i6 % 2;
                j = 0;
            }
            objArr[0] = new String(cArr4);
            return;
        }
        if (!RatingCompat) {
            notifydownloads.AudioAttributesCompatParcelizer = iArr.length;
            char[] cArr5 = new char[notifydownloads.AudioAttributesCompatParcelizer];
            notifydownloads.IconCompatParcelizer = 0;
            while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
                cArr5[notifydownloads.IconCompatParcelizer] = (char) (cArr2[iArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
                notifydownloads.IconCompatParcelizer++;
            }
            String str = new String(cArr5);
            int i8 = $11 + 107;
            $10 = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
            objArr[0] = str;
            return;
        }
        int i9 = $10 + 87;
        $11 = i9 % 128;
        int i10 = i9 % 2;
        notifydownloads.AudioAttributesCompatParcelizer = cArr.length;
        char[] cArr6 = new char[notifydownloads.AudioAttributesCompatParcelizer];
        notifydownloads.IconCompatParcelizer = 0;
        while (notifydownloads.IconCompatParcelizer < notifydownloads.AudioAttributesCompatParcelizer) {
            cArr6[notifydownloads.IconCompatParcelizer] = (char) (cArr2[cArr[(notifydownloads.AudioAttributesCompatParcelizer - 1) - notifydownloads.IconCompatParcelizer] - i] - iIntValue);
            Object[] objArr5 = {notifydownloads, notifydownloads};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1593953308);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) KeyEvent.normalizeMetaState(0), 11439 - TextUtils.getCapsMode("", 0, 0), (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 13, -558368911, false, "q", new Class[]{Object.class, Object.class});
            }
            ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
        }
        objArr[0] = new String(cArr6);
    }

    /* JADX INFO: renamed from: o.createStringSparseArray$read, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\t\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\n"}, d2 = {"Lo/createStringSparseArray$read;", "", "<init>", "()V", "Landroid/content/Context;", "p0", "Lo/readList;", "p1", "Landroid/content/Intent;", "write", "(Landroid/content/Context;Lo/readList;)Landroid/content/Intent;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static Intent write(Context p0, readList p1) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            Intent intent = new Intent(p0, (Class<?>) createStringSparseArray.class);
            p1.IconCompatParcelizer(intent);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x0220 A[PHI: r0
      0x0220: PHI (r0v9 int) = (r0v8 int), (r0v54 int) binds: [B:53:0x021e, B:50:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0222 A[PHI: r0
      0x0222: PHI (r0v51 int) = (r0v8 int), (r0v54 int) binds: [B:53:0x021e, B:50:0x020c] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void e(int r23, byte r24, int r25, int r26, short r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 841
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createStringSparseArray.e(int, byte, int, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0265  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x011c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object AudioAttributesCompatParcelizer(java.lang.Object[] r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 2736
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createStringSparseArray.AudioAttributesCompatParcelizer(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        createStringSparseArray createstringsparsearray = (createStringSparseArray) objArr[0];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 79;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        createstringsparsearray.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer(readHeader.IconCompatParcelizer.INSTANCE);
        int i4 = MediaMetadataCompat + 9;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final void read(UtcTimingElement utcTimingElement) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 53;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        utcTimingElement.read.requestFocus();
        if (i3 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void read(int p0, String p1) {
        int i = 2 % 2;
        parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptors = this.write;
        parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptors2 = null;
        if (parseselectionflagsfromroledescriptors == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            parseselectionflagsfromroledescriptors = null;
        }
        ScrollView scrollViewIconCompatParcelizer = parseselectionflagsfromroledescriptors.read.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollViewIconCompatParcelizer, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(scrollViewIconCompatParcelizer);
        parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptors3 = this.write;
        if (parseselectionflagsfromroledescriptors3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            int i2 = MediaDescriptionCompat + 73;
            MediaMetadataCompat = i2 % 128;
            int i3 = i2 % 2;
        } else {
            parseselectionflagsfromroledescriptors2 = parseselectionflagsfromroledescriptors3;
        }
        final UtcTimingElement utcTimingElement = parseselectionflagsfromroledescriptors2.write;
        ScrollView scrollViewIconCompatParcelizer2 = utcTimingElement.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollViewIconCompatParcelizer2, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(scrollViewIconCompatParcelizer2);
        updateNavigation updatenavigation = updateNavigation.INSTANCE;
        updateNavigation.read(utcTimingElement.read);
        if (p0 == 0) {
            int i4 = MediaMetadataCompat + 119;
            MediaDescriptionCompat = i4 % 128;
            int i5 = i4 % 2;
            updateRepeatModeButton updaterepeatmodebutton = updateRepeatModeButton.INSTANCE;
            p0 = updateRepeatModeButton.AudioAttributesCompatParcelizer(this);
            if (p0 == 0) {
                p0 = 91;
            }
        }
        utcTimingElement.RemoteActionCompatParcelizer.setText("+".concat(String.valueOf(p0)));
        utcTimingElement.read.setText(PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(p1));
        utcTimingElement.read.setSelection(utcTimingElement.read.getText().length());
        utcTimingElement.read.postDelayed(new Runnable() { // from class: o.createTypedSparseArray
            @Override // java.lang.Runnable
            public final void run() {
                createStringSparseArray.write(utcTimingElement);
            }
        }, 200L);
        utcTimingElement.IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.ensureAtEnd
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                createStringSparseArray.read(utcTimingElement, this);
            }
        });
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        UtcTimingElement utcTimingElement = (UtcTimingElement) objArr[0];
        createStringSparseArray createstringsparsearray = (createStringSparseArray) objArr[1];
        int i = 2 % 2;
        String string = utcTimingElement.RemoteActionCompatParcelizer.getText().toString();
        String string2 = TestGroupLSModel.AudioAttributesImplApi26Parcelizer((CharSequence) utcTimingElement.read.getText().toString()).toString();
        Object obj = null;
        if (!(true ^ TextUtils.isEmpty(string))) {
            createStringSparseArray createstringsparsearray2 = createstringsparsearray;
            String string3 = createstringsparsearray.getString(R.string.text_country_code_empty);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string3, "");
            PlayerControlViewExternalSyntheticLambda1.write(createstringsparsearray2, string3);
            int i2 = MediaMetadataCompat + 57;
            MediaDescriptionCompat = i2 % 128;
            if (i2 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int iAudioAttributesCompatParcelizer = updateRepeatModeButton.AudioAttributesCompatParcelizer(string);
        if (iAudioAttributesCompatParcelizer == 0) {
            createStringSparseArray createstringsparsearray3 = createstringsparsearray;
            String string4 = createstringsparsearray.getString(R.string.text_country_code_invalid);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string4, "");
            PlayerControlViewExternalSyntheticLambda1.write(createstringsparsearray3, string4);
            return null;
        }
        String str = string2;
        if (str.length() == 0) {
            int i3 = MediaMetadataCompat + 13;
            MediaDescriptionCompat = i3 % 128;
            int i4 = i3 % 2;
            utcTimingElement.read.setError(createstringsparsearray.getString(R.string.invalid_mobile_number));
            createStringSparseArray createstringsparsearray4 = createstringsparsearray;
            String string5 = createstringsparsearray.getString(R.string.invalid_mobile_number);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string5, "");
            PlayerControlViewExternalSyntheticLambda1.write(createstringsparsearray4, string5);
            return null;
        }
        if (!TextUtils.isDigitsOnly(str)) {
            String string6 = createstringsparsearray.getString(R.string.invalid_mobile_number);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string6, "");
            PlayerControlViewExternalSyntheticLambda1.write(createstringsparsearray, string6);
            utcTimingElement.read.setError(createstringsparsearray.getString(R.string.invalid_mobile_number));
            return null;
        }
        createstringsparsearray.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer(new readHeader.read(iAudioAttributesCompatParcelizer, string2, limit.AudioAttributesCompatParcelizer));
        int i5 = MediaMetadataCompat + 47;
        MediaDescriptionCompat = i5 % 128;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static final void AudioAttributesImplApi21Parcelizer(createStringSparseArray createstringsparsearray) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 23;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        createstringsparsearray.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer(readHeader.RemoteActionCompatParcelizer.INSTANCE);
        int i4 = MediaDescriptionCompat + 43;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final void MediaBrowserCompatItemReceiver(createStringSparseArray createstringsparsearray) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 121;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        createstringsparsearray.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer(readHeader.write.INSTANCE);
        int i4 = MediaDescriptionCompat + 65;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        DashDownloader dashDownloader = (DashDownloader) objArr[0];
        createStringSparseArray createstringsparsearray = (createStringSparseArray) objArr[1];
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 71;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        if (String.valueOf(dashDownloader.write.getText()).length() <= 0) {
            return null;
        }
        createstringsparsearray.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer(new readHeader.AudioAttributesImplApi21Parcelizer(String.valueOf(dashDownloader.write.getText())));
        int i4 = MediaMetadataCompat + 117;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void write(final int p0, final String p1) {
        String str;
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 29;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
        parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptors = this.write;
        if (parseselectionflagsfromroledescriptors == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            parseselectionflagsfromroledescriptors = null;
        }
        ScrollView scrollViewIconCompatParcelizer = parseselectionflagsfromroledescriptors.write.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollViewIconCompatParcelizer, "");
        bytesRead.MediaBrowserCompatCustomActionResultReceiver(scrollViewIconCompatParcelizer);
        parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptors2 = this.write;
        if (parseselectionflagsfromroledescriptors2 == null) {
            int i3 = MediaMetadataCompat + 3;
            MediaDescriptionCompat = i3 % 128;
            if (i3 % 2 == 0) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                throw null;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            parseselectionflagsfromroledescriptors2 = null;
        }
        final DashDownloader dashDownloader = parseselectionflagsfromroledescriptors2.read;
        ScrollView scrollViewIconCompatParcelizer2 = dashDownloader.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(scrollViewIconCompatParcelizer2, "");
        bytesRead.AudioAttributesImplApi21Parcelizer(scrollViewIconCompatParcelizer2);
        if (p0 == 0 || p1.length() == 0) {
            return;
        }
        StringBuilder sb = new StringBuilder("OTP sent to +");
        sb.append(p0);
        sb.append(" ");
        sb.append(p1);
        sb.append(" ");
        String string = sb.toString();
        StringBuilder sb2 = new StringBuilder("OTP sent to +");
        sb2.append(p0);
        sb2.append(" ");
        sb2.append(p1);
        sb2.append(". Kindly re-check your number as it looks incorrect");
        String string2 = sb2.toString();
        boolean zRemoteActionCompatParcelizer = updateRepeatModeButton.RemoteActionCompatParcelizer(p0, Long.parseLong(p1));
        TextView textView = dashDownloader.AudioAttributesImplApi21Parcelizer;
        if (zRemoteActionCompatParcelizer) {
            int i4 = MediaDescriptionCompat + 81;
            MediaMetadataCompat = i4 % 128;
            if (i4 % 2 != 0) {
                throw null;
            }
            str = string;
        } else {
            str = string2;
        }
        textView.setText(str);
        dashDownloader.read.setOnClickListener(new View.OnClickListener() { // from class: o.createStringList
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                createStringSparseArray.write(this.read);
            }
        });
        dashDownloader.MediaBrowserCompatCustomActionResultReceiver.setOnClickListener(new View.OnClickListener() { // from class: o.getFieldId
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                createStringSparseArray.IconCompatParcelizer(this.AudioAttributesCompatParcelizer);
            }
        });
        TextInputEditText textInputEditText = dashDownloader.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textInputEditText, "");
        textInputEditText.addTextChangedListener(new AudioAttributesImplApi21Parcelizer(dashDownloader));
        dashDownloader.write.requestFocus();
        dashDownloader.AudioAttributesImplBaseParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.createTypedArray
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                createStringSparseArray.write(dashDownloader, this);
            }
        });
        LinearLayout linearLayout = dashDownloader.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        linearLayout.setVisibility(8);
        dashDownloader.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.createTypedList
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                createStringSparseArray.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, p0, p1);
            }
        });
    }

    private static final void read(createStringSparseArray createstringsparsearray, int i, String str) {
        int i2 = 2 % 2;
        createstringsparsearray.AudioAttributesImplApi26Parcelizer().IconCompatParcelizer(new readHeader.read(i, str, limit.IconCompatParcelizer));
        int i3 = MediaDescriptionCompat + 61;
        MediaMetadataCompat = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 65 / 0;
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 115;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptors = this.write;
        parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptors2 = null;
        if (parseselectionflagsfromroledescriptors == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            parseselectionflagsfromroledescriptors = null;
        }
        TextView textView = parseselectionflagsfromroledescriptors.read.IconCompatParcelizer;
        parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptors3 = this.write;
        if (parseselectionflagsfromroledescriptors3 == null) {
            int i4 = MediaDescriptionCompat + 37;
            MediaMetadataCompat = i4 % 128;
            int i5 = i4 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            parseselectionflagsfromroledescriptors3 = null;
        }
        parseselectionflagsfromroledescriptors3.read.write.setText("");
        parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptors4 = this.write;
        if (parseselectionflagsfromroledescriptors4 == null) {
            int i6 = MediaMetadataCompat + 119;
            MediaDescriptionCompat = i6 % 128;
            if (i6 % 2 == 0) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                parseselectionflagsfromroledescriptors2.hashCode();
                throw null;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            parseselectionflagsfromroledescriptors4 = null;
        }
        parseselectionflagsfromroledescriptors4.read.AudioAttributesImplApi26Parcelizer.setError(getString(R.string.text_incorrect_otp));
        parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptors5 = this.write;
        if (parseselectionflagsfromroledescriptors5 == null) {
            int i7 = MediaDescriptionCompat + 97;
            MediaMetadataCompat = i7 % 128;
            int i8 = i7 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            parseselectionflagsfromroledescriptors5 = null;
        }
        parseselectionflagsfromroledescriptors5.read.AudioAttributesImplApi26Parcelizer.requestFocus();
        parseSelectionFlagsFromRoleDescriptors parseselectionflagsfromroledescriptors6 = this.write;
        if (parseselectionflagsfromroledescriptors6 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            parseselectionflagsfromroledescriptors2 = parseselectionflagsfromroledescriptors6;
        }
        parseselectionflagsfromroledescriptors2.read.write.setSelection(0);
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0179  */
    @Override // kotlin.createString, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 500
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createStringSparseArray.onResume():void");
    }

    @Override // kotlin.createString, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onPause() throws Throwable {
        int i = 2 % 2;
        Context baseContext = getBaseContext();
        if (baseContext == null) {
            Object[] objArr = new Object[1];
            e(((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(1) - 1766938738, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 81), Color.argb(0, 0, 0, 0) - 1581613047, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 99, (short) ((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 120), objArr);
            Class<?> cls = Class.forName((String) objArr[0]);
            Object[] objArr2 = new Object[1];
            e((((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) - 1766938688, (byte) (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() + 35), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1581613057, (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 107, (short) ((-103) - TextUtils.lastIndexOf("", '0', 0, 0)), objArr2);
            baseContext = (Context) cls.getMethod((String) objArr2[0], new Class[0]).invoke(null, null);
        }
        if (baseContext != null) {
            if ((baseContext instanceof ContextWrapper) && ((ContextWrapper) baseContext).getBaseContext() == null) {
                baseContext = null;
            } else {
                baseContext = baseContext.getApplicationContext();
                int i2 = MediaMetadataCompat + 109;
                MediaDescriptionCompat = i2 % 128;
                int i3 = i2 % 2;
            }
        }
        if (baseContext != null) {
            int i4 = MediaDescriptionCompat + 43;
            MediaMetadataCompat = i4 % 128;
            int i5 = i4 % 2;
            try {
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) ((ViewConfiguration.getLongPressTimeout() >> 16) + 4535), TextUtils.indexOf("", "") + 6054, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 41, -764908173, false, "IconCompatParcelizer", new Class[0]);
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(null, null);
                Object[] objArr3 = {baseContext};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1293416902);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getWindowTouchSlop() >> 8), 6030 - Gravity.getAbsoluteGravity(0, 0), View.getDefaultSize(0, 0) + 24, -861814097, false, "read", new Class[]{Context.class});
                }
                ((Method) objRemoteActionCompatParcelizer2).invoke(objInvoke, objArr3);
                int i6 = MediaDescriptionCompat + 73;
                MediaMetadataCompat = i6 % 128;
                int i7 = i6 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause == null) {
                    throw th;
                }
                throw cause;
            }
        }
        super.onPause();
    }

    /* JADX WARN: Removed duplicated region for block: B:119:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0a01 A[Catch: all -> 0x0aba, TryCatch #11 {all -> 0x0aba, blocks: (B:125:0x09fb, B:127:0x0a01, B:128:0x0a2a), top: B:280:0x09fb, outer: #9 }] */
    @Override // kotlin.createString, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r31) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 5578
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.createStringSparseArray.attachBaseContext(android.content.Context):void");
    }

    public static /* synthetic */ void IconCompatParcelizer(createStringSparseArray createstringsparsearray) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 125;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        MediaBrowserCompatItemReceiver(createstringsparsearray);
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void read(UtcTimingElement utcTimingElement, createStringSparseArray createstringsparsearray) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 107;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        int iRemoteActionCompatParcelizer = zba.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = zba.RemoteActionCompatParcelizer();
        write(iRemoteActionCompatParcelizer, zba.RemoteActionCompatParcelizer(), 203097242, zba.RemoteActionCompatParcelizer(), -203097238, new Object[]{utcTimingElement, createstringsparsearray}, iRemoteActionCompatParcelizer2);
        int i4 = MediaDescriptionCompat + 113;
        MediaMetadataCompat = i4 % 128;
        if (i4 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void write(DashDownloader dashDownloader, createStringSparseArray createstringsparsearray) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 77;
        MediaMetadataCompat = i2 % 128;
        if (i2 % 2 == 0) {
            int iRemoteActionCompatParcelizer = zba.RemoteActionCompatParcelizer();
            int iRemoteActionCompatParcelizer2 = zba.RemoteActionCompatParcelizer();
            write(iRemoteActionCompatParcelizer, zba.RemoteActionCompatParcelizer(), 1892865750, zba.RemoteActionCompatParcelizer(), -1892865749, new Object[]{dashDownloader, createstringsparsearray}, iRemoteActionCompatParcelizer2);
            return;
        }
        int iRemoteActionCompatParcelizer3 = zba.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer4 = zba.RemoteActionCompatParcelizer();
        write(iRemoteActionCompatParcelizer3, zba.RemoteActionCompatParcelizer(), 1892865750, zba.RemoteActionCompatParcelizer(), -1892865749, new Object[]{dashDownloader, createstringsparsearray}, iRemoteActionCompatParcelizer4);
        int i3 = 64 / 0;
    }

    public static /* synthetic */ void write(UtcTimingElement utcTimingElement) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 19;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        read(utcTimingElement);
        int i4 = MediaMetadataCompat + 47;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 89 / 0;
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(createStringSparseArray createstringsparsearray, int i, String str) {
        int i2 = 2 % 2;
        int i3 = MediaMetadataCompat + 77;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        read(createstringsparsearray, i, str);
        int i5 = MediaMetadataCompat + 41;
        MediaDescriptionCompat = i5 % 128;
        int i6 = i5 % 2;
    }

    public static /* synthetic */ void write(createStringSparseArray createstringsparsearray) {
        int i = 2 % 2;
        int i2 = MediaMetadataCompat + 97;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesImplApi21Parcelizer(createstringsparsearray);
        if (i3 == 0) {
            throw null;
        }
        int i4 = MediaDescriptionCompat + 79;
        MediaMetadataCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    static {
        MediaBrowserCompatMediaItem = 0;
        MediaBrowserCompatCustomActionResultReceiver();
        INSTANCE = new Companion(null);
        int i = onAddQueueItem + 63;
        MediaBrowserCompatMediaItem = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ void write(createStringSparseArray createstringsparsearray, int i, String str) {
        Object[] objArr = {createstringsparsearray, Integer.valueOf(i), str};
        write(zba.RemoteActionCompatParcelizer(), zba.RemoteActionCompatParcelizer(), 863699000, zba.RemoteActionCompatParcelizer(), -863698998, objArr, zba.RemoteActionCompatParcelizer());
    }

    private static final void AudioAttributesCompatParcelizer(DashDownloader dashDownloader, createStringSparseArray createstringsparsearray) {
        int iRemoteActionCompatParcelizer = zba.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = zba.RemoteActionCompatParcelizer();
        write(iRemoteActionCompatParcelizer, zba.RemoteActionCompatParcelizer(), 1892865750, zba.RemoteActionCompatParcelizer(), -1892865749, new Object[]{dashDownloader, createstringsparsearray}, iRemoteActionCompatParcelizer2);
    }

    private static final void write(UtcTimingElement utcTimingElement, createStringSparseArray createstringsparsearray) {
        int iRemoteActionCompatParcelizer = zba.RemoteActionCompatParcelizer();
        int iRemoteActionCompatParcelizer2 = zba.RemoteActionCompatParcelizer();
        write(iRemoteActionCompatParcelizer, zba.RemoteActionCompatParcelizer(), 203097242, zba.RemoteActionCompatParcelizer(), -203097238, new Object[]{utcTimingElement, createstringsparsearray}, iRemoteActionCompatParcelizer2);
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public final void onBackPressed() {
        write(setTabTextColors.RemoteActionCompatParcelizer(), setTabTextColors.RemoteActionCompatParcelizer(), -1844619918, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(7) - 511618018, 1844619918, new Object[]{this}, zba.RemoteActionCompatParcelizer());
    }

    @Override // kotlin.createString, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onCreate(Bundle p0) {
        int iRemoteActionCompatParcelizer = setTabTextColors.RemoteActionCompatParcelizer();
        write(iRemoteActionCompatParcelizer, setTabTextColors.RemoteActionCompatParcelizer(), -112638003, zba.RemoteActionCompatParcelizer(), 112638006, new Object[]{this, p0}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 1996628952);
    }

    @Override // kotlin.createString, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 41;
        MediaMetadataCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onStart();
        if (i3 != 0) {
            int i4 = 82 / 0;
        }
        int i5 = MediaMetadataCompat + 37;
        MediaDescriptionCompat = i5 % 128;
        int i6 = i5 % 2;
    }

    static void MediaBrowserCompatCustomActionResultReceiver() {
        IconCompatParcelizer = -1855192385;
        RemoteActionCompatParcelizer = -819363125;
        MediaBrowserCompatCustomActionResultReceiver = -1502029291;
        AudioAttributesImplBaseParcelizer = new byte[]{62, TarConstants.LF_BLK, TarConstants.LF_NORMAL, -54, -61, 16, 16, -103, 58, 127, -120, -39, -40, -61, TarConstants.LF_BLK, -52, TarConstants.LF_CHR, -122, 11, 118, -99, -109, 110, -124, -98, 118, -100, 116, -88, -91, -106, -55, -121, -102, -74, 93, 14, 13, 12, -103, 113, -100, -113, 38, -119, 19, -114, -118, -127, -128, 36, -33, -15, 38, 61, -13, 36, -127, 18, TarConstants.LF_PAX_EXTENDED_HEADER_LC, 97, 110, 8, 86, -79, 122, 59, -96, 60, 102, 105, 121, 126, 98, -67, 33, 126, 104, -75, 37, 121, 107, -78, 46, 116, 86, 11, 99, 121, 104, 117, 86, 11, 105, -66, 61, 102, 85, 121, 8, 84, 123, 116, 109, 115, -95, 60, 104, 113, 126, 97, 122, 126, 106, 100, 111, 122, -78, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 114, 32, 100, 123, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, 107, -30, 100, -19, -19, 115, 39, -67, -69, 56, 37, -70, 37, -65, 36, -80, -57, -62, -52, -40, -50, -62, -54, -40, -52, -61, -73, -73, -73, -73, -73, -73, -73};
        AudioAttributesImplApi21Parcelizer = new char[]{28290, 28310, 28410, 28294, 28301, 28300, 28378, 28353, 28299, 28302, 28303, 28381, 28379, 28380, 28374, 28298, 28377, 28382, 28383, 28376, 28354, 28295, 28315, 28355, 28293, 28291, 28296, 28412, 28316, 28317, 28393, 28297, 28396, 28288, 28319, 28292, 28289, 28415};
        AudioAttributesImplApi26Parcelizer = 411397905;
        RatingCompat = true;
        MediaBrowserCompatSearchResultReceiver = true;
    }
}
