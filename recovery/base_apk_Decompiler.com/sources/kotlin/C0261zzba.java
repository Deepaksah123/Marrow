package kotlin;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.util.DeviceProperties;
import com.google.android.material.tabs.TabLayout;
import com.marrow.R;
import com.marrow2.ui.qbank.lesson_list.QBankLessonListViewModel;
import com.marrow2.ui.qbank.lesson_list.model.SealedLessonDetailsModel;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.AbstractC0251zzar;
import kotlin.Error;
import kotlin.Metadata;
import kotlin.VisibilityChecker;
import kotlin.fromBytes;
import kotlin.parseFromJson;
import kotlin.setTokenBinding;
import kotlin.withFieldVisibility;

/* JADX INFO: renamed from: o.zzba, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000 \u001a2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u001aB\u0007¢\u0006\u0004\b\u0004\u0010\u0005J+\u0010\r\u001a\u00020\f2\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0010\u0010\u0005J!\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0005J\u000f\u0010\u0014\u001a\u00020\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0005J\u000f\u0010\u0015\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0005J\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0005J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u0017H\u0002¢\u0006\u0004\b\u001a\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001b\u0010\u0005J\u000f\u0010\u001c\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001c\u0010\u0005J\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\u0013\u001a\u00020\u001d2\u0006\u0010\u0007\u001a\u00020 H\u0002¢\u0006\u0004\b\u0013\u0010!J\u000f\u0010\"\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010\u0005J\u0017\u0010\u001e\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020#H\u0002¢\u0006\u0004\b\u001e\u0010$J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u0018\u0010\u001fJ\u001d\u0010\u001e\u001a\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020&0%H\u0002¢\u0006\u0004\b\u001e\u0010'J\u001f\u0010(\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020 2\u0006\u0010\t\u001a\u00020\u001dH\u0002¢\u0006\u0004\b(\u0010)J\u001d\u0010\u0013\u001a\u00020\u000f2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020*0%H\u0002¢\u0006\u0004\b\u0013\u0010'J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020+H\u0016¢\u0006\u0004\b\u0018\u0010,J\u000f\u0010(\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010\u0005J'\u0010\u001a\u001a\u00020\u000f2\u0006\u0010\u0007\u001a\u00020 2\u0006\u0010\t\u001a\u00020 2\u0006\u0010\u000b\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001a\u0010-J\u000f\u0010.\u001a\u00020\u000fH\u0002¢\u0006\u0004\b.\u0010\u0005R\u0018\u0010\u001e\u001a\u0004\u0018\u00010/8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u00100R\u0014\u0010(\u001a\u00020/8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001e\u00101R\u001b\u0010\u0013\u001a\u0002028CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001c\u00103\u001a\u0004\b\u001a\u00104R\u0014\u0010\u001a\u001a\u0002058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u00106R\u0014\u0010\u0018\u001a\u0002078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u00108R\u0014\u0010\u0016\u001a\u0002098\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010:R\u0014\u0010\"\u001a\u00020;8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010<"}, d2 = {"Lo/zzba;", "Landroidx/fragment/app/Fragment;", "Lo/Error$IconCompatParcelizer;", "Lo/parseFromJson$AudioAttributesCompatParcelizer;", "<init>", "()V", "Landroid/view/LayoutInflater;", "p0", "Landroid/view/ViewGroup;", "p1", "Landroid/os/Bundle;", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "", "onDestroyView", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "read", "onResume", "MediaBrowserCompatItemReceiver", "AudioAttributesImplBaseParcelizer", "Lo/zzar$MediaBrowserCompatItemReceiver;", "IconCompatParcelizer", "(Lo/zzar$MediaBrowserCompatItemReceiver;)V", "AudioAttributesCompatParcelizer", "MediaMetadataCompat", "MediaBrowserCompatCustomActionResultReceiver", "", "RemoteActionCompatParcelizer", "(Ljava/lang/String;)V", "", "(I)Ljava/lang/String;", "AudioAttributesImplApi26Parcelizer", "", "(Z)V", "", "Lo/ProtocolVersion;", "(Ljava/util/List;)V", "write", "(ILjava/lang/String;)V", "Lcom/marrow2/ui/qbank/lesson_list/model/SealedLessonDetailsModel;", "Lcom/marrow2/ui/qbank/lesson_list/model/SealedLessonDetailsModel$Lesson;", "(Lcom/marrow2/ui/qbank/lesson_list/model/SealedLessonDetailsModel$Lesson;)V", "(IILjava/lang/String;)V", "AudioAttributesImplApi21Parcelizer", "Lo/buildDataSource;", "Lo/buildDataSource;", "()Lo/buildDataSource;", "Lcom/marrow2/ui/qbank/lesson_list/QBankLessonListViewModel;", "Lo/RenewEligible;", "()Lcom/marrow2/ui/qbank/lesson_list/QBankLessonListViewModel;", "Lo/Error;", "Lo/Error;", "Lo/parseFromJson;", "Lo/parseFromJson;", "Lo/getVersionCode;", "Lo/getVersionCode;", "Lo/onBindingDied;", "Lo/onBindingDied;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class C0261zzba extends AbstractC0256zzaw implements Error.IconCompatParcelizer, parseFromJson.AudioAttributesCompatParcelizer {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final onBindingDied AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final Error AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final RenewEligible read;
    private buildDataSource RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final getVersionCode AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final parseFromJson IconCompatParcelizer;

    public C0261zzba() {
        C0261zzba c0261zzba = this;
        RenewEligible renewEligibleWrite = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass3(new AnonymousClass5(c0261zzba)));
        this.read = _resolveFieldVsGetter.RemoteActionCompatParcelizer(toMagicModuleMetaDataUcModel.write(QBankLessonListViewModel.class), new AnonymousClass1(renewEligibleWrite), new AnonymousClass4(renewEligibleWrite), new AnonymousClass2(c0261zzba, renewEligibleWrite));
        Error error = new Error(this);
        this.AudioAttributesCompatParcelizer = error;
        this.IconCompatParcelizer = new parseFromJson(this);
        this.AudioAttributesImplBaseParcelizer = new getVersionCode(0, 0, null, error, 7, null);
        this.AudioAttributesImplApi26Parcelizer = new onBindingDied(new getAnswerMap() { // from class: o.U2fPendingIntent
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return C0261zzba.IconCompatParcelizer(this.RemoteActionCompatParcelizer, (registerEvent) obj);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final buildDataSource RemoteActionCompatParcelizer() {
        buildDataSource builddatasource = this.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.write(builddatasource);
        return builddatasource;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final QBankLessonListViewModel AudioAttributesCompatParcelizer() {
        return (QBankLessonListViewModel) this.read.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(C0261zzba c0261zzba, registerEvent registerevent) {
        toMagicModuleMetaRepoModel.write(registerevent, "");
        c0261zzba.RemoteActionCompatParcelizer(registerevent.read());
        return getShowPopup.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        toMagicModuleMetaRepoModel.write(p0, "");
        this.RemoteActionCompatParcelizer = buildDataSource.RemoteActionCompatParcelizer(p0, p1);
        ConstraintLayout constraintLayoutIconCompatParcelizer = RemoteActionCompatParcelizer().IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutIconCompatParcelizer, "");
        return constraintLayoutIconCompatParcelizer;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.RemoteActionCompatParcelizer = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        read();
        AudioAttributesImplApi26Parcelizer();
        MediaBrowserCompatItemReceiver();
        MediaBrowserCompatCustomActionResultReceiver();
        AudioAttributesImplBaseParcelizer();
        MediaMetadataCompat();
        AudioAttributesImplApi21Parcelizer();
    }

    private final void read() {
        ConstraintLayout constraintLayout = RemoteActionCompatParcelizer().RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        getHttpMethodString.read((View) constraintLayout, true, false, true, true, 0, 50);
        TabLayout tabLayout = RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(tabLayout, "");
        getHttpMethodString.read((View) tabLayout, false, false, true, true, 0, 51);
        RecyclerView recyclerView = RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        getHttpMethodString.RemoteActionCompatParcelizer(recyclerView, false, false, true, true, 0, 51);
        LinearLayout linearLayoutIconCompatParcelizer = RemoteActionCompatParcelizer().IconCompatParcelizer.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        getHttpMethodString.read((View) linearLayoutIconCompatParcelizer, false, false, true, true, 0, 51);
        RecyclerView recyclerView2 = RemoteActionCompatParcelizer().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView2, "");
        getHttpMethodString.RemoteActionCompatParcelizer(recyclerView2, false, true, true, true, 0, 49);
        ConstraintLayout constraintLayout2 = RemoteActionCompatParcelizer().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout2, "");
        getHttpMethodString.read((View) constraintLayout2, false, false, false, true, 0, 55);
        RecyclerView recyclerView3 = RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView3, "");
        getHttpMethodString.RemoteActionCompatParcelizer(recyclerView3, false, false, false, true, 0, 55);
    }

    /* JADX INFO: renamed from: o.zzba$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Landroidx/fragment/app/Fragment;", "IconCompatParcelizer", "()Landroidx/fragment/app/Fragment;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass5 extends MagicModuleUseCase implements getCreatedOnDateMs<Fragment> {
        private static int $10 = 0;
        private static int $11 = 1;
        private /* synthetic */ Fragment $AudioAttributesCompatParcelizer;
        private static final byte[] $$a = {121, 72, 116, 113, 8, -1, -8};
        private static final int $$b = 128;
        private static int $write = 0;
        private static int $read = 1;
        private static char[] IconCompatParcelizer = {6510, 6480, 6425, 6491, 6509, 6406, 6489, 6486, 6492, 6471, 6474, 6485, 6482, 6476, 6495, 6475, 6470, 6484, 6473, 6519, 6511, 6481, 6407, 6487, 6479, 6467, 6488, 6477, 6465, 6483, 6468, 6490, 6478, 6508, 6493, 6507};
        private static char RemoteActionCompatParcelizer = 11444;

        /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002c). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void b(byte r7, short r8, int r9, java.lang.Object[] r10) {
            /*
                int r7 = r7 * 4
                int r7 = 114 - r7
                int r8 = r8 * 3
                int r8 = 4 - r8
                int r9 = r9 * 4
                int r9 = r9 + 4
                byte[] r0 = kotlin.C0261zzba.AnonymousClass5.$$a
                byte[] r1 = new byte[r9]
                r2 = 0
                if (r0 != 0) goto L17
                r3 = r8
                r7 = r9
                r4 = r2
                goto L2c
            L17:
                r3 = r2
            L18:
                int r4 = r3 + 1
                byte r5 = (byte) r7
                r1[r3] = r5
                if (r4 != r9) goto L27
                java.lang.String r7 = new java.lang.String
                r7.<init>(r1, r2)
                r10[r2] = r7
                return
            L27:
                r3 = r0[r8]
                r6 = r3
                r3 = r8
                r8 = r6
            L2c:
                int r8 = -r8
                int r7 = r7 + r8
                int r8 = r3 + 1
                int r7 = r7 + (-5)
                r3 = r4
                goto L18
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C0261zzba.AnonymousClass5.b(byte, short, int, java.lang.Object[]):void");
        }

        public final Fragment IconCompatParcelizer() {
            int i = 2 % 2;
            int i2 = $read;
            int i3 = i2 + 109;
            $write = i3 % 128;
            if (i3 % 2 != 0) {
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            Fragment fragment = this.$AudioAttributesCompatParcelizer;
            int i4 = i2 + 101;
            $write = i4 % 128;
            int i5 = i4 % 2;
            return fragment;
        }

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ Fragment invoke() {
            int i = 2 % 2;
            int i2 = $write + 17;
            $read = i2 % 128;
            int i3 = i2 % 2;
            Fragment fragmentIconCompatParcelizer = IconCompatParcelizer();
            int i4 = $write + 117;
            $read = i4 % 128;
            int i5 = i4 % 2;
            return fragmentIconCompatParcelizer;
        }

        /* JADX WARN: Removed duplicated region for block: B:47:0x0167  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x0189  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        private static void a(int r31, char[] r32, byte r33, java.lang.Object[] r34) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 893
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C0261zzba.AnonymousClass5.a(int, char[], byte, java.lang.Object[]):void");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass5(Fragment fragment) {
            super(0);
            this.$AudioAttributesCompatParcelizer = fragment;
        }

        /* JADX WARN: Can't wrap try/catch for region: R(43:0|2|153|3|4|(2:6|7)(2:8|9)|10|(1:12)(1:13)|14|15|16|(1:18)|19|(1:(4:21|22|23|(3:25|26|(1:28)(3:163|29|(1:IC)(1:32)))(5:162|33|147|34|35))(1:161))|38|40|154|41|(1:43)|44|45|151|46|47|48|49|(1:51)(10:146|53|144|54|55|(1:57)(1:58)|59|142|60|(14:62|158|72|(1:74)(11:75|159|76|77|(3:79|80|(5:82|83|156|84|(0)(13:93|149|94|95|96|97|(2:99|100)(1:102)|101|104|(2:106|(1:(1:109))(2:110|111))|119|(1:121)(1:122)|123))(2:90|(1:92)(0)))|124|(1:126)(1:127)|128|(1:130)(1:131)|132|133)|118|119|(0)(0)|123|124|(0)(0)|128|(0)(0)|132|133)(16:63|64|71|158|72|(0)(0)|118|119|(0)(0)|123|124|(0)(0)|128|(0)(0)|132|133))|52|71|158|72|(0)(0)|118|119|(0)(0)|123|124|(0)(0)|128|(0)(0)|132|133|(1:(0))) */
        /* JADX WARN: Removed duplicated region for block: B:121:0x0796  */
        /* JADX WARN: Removed duplicated region for block: B:122:0x079d  */
        /* JADX WARN: Removed duplicated region for block: B:126:0x07d4  */
        /* JADX WARN: Removed duplicated region for block: B:127:0x07e9  */
        /* JADX WARN: Removed duplicated region for block: B:130:0x0816  */
        /* JADX WARN: Removed duplicated region for block: B:131:0x082f  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0523  */
        /* JADX WARN: Removed duplicated region for block: B:75:0x0525 A[Catch: Exception -> 0x0775, TRY_LEAVE, TryCatch #9 {Exception -> 0x0775, blocks: (B:72:0x04ad, B:75:0x0525, B:77:0x0561, B:79:0x0569, B:82:0x064f, B:84:0x0656, B:93:0x0666, B:104:0x0733, B:113:0x0766, B:114:0x076c, B:90:0x065e, B:116:0x076e, B:117:0x0774, B:94:0x0670, B:96:0x0696, B:100:0x06ff, B:101:0x070e, B:102:0x0713, B:76:0x052f), top: B:158:0x04ad, inners: #4, #10 }] */
        /* JADX WARN: Removed duplicated region for block: B:93:0x0666 A[Catch: Exception -> 0x0775, TRY_LEAVE, TryCatch #9 {Exception -> 0x0775, blocks: (B:72:0x04ad, B:75:0x0525, B:77:0x0561, B:79:0x0569, B:82:0x064f, B:84:0x0656, B:93:0x0666, B:104:0x0733, B:113:0x0766, B:114:0x076c, B:90:0x065e, B:116:0x076e, B:117:0x0774, B:94:0x0670, B:96:0x0696, B:100:0x06ff, B:101:0x070e, B:102:0x0713, B:76:0x052f), top: B:158:0x04ad, inners: #4, #10 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public static java.lang.Object[] write(int r29, int r30) throws java.lang.Throwable {
            /*
                Method dump skipped, instruction units count: 2436
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: kotlin.C0261zzba.AnonymousClass5.write(int, int):java.lang.Object[]");
        }
    }

    /* JADX INFO: renamed from: o.zzba$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/TypeResolutionContext;", "AudioAttributesCompatParcelizer", "()Lo/TypeResolutionContext;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getCreatedOnDateMs<TypeResolutionContext> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final TypeResolutionContext invoke() {
            return (TypeResolutionContext) this.$RemoteActionCompatParcelizer.invoke();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass3(getCreatedOnDateMs getcreatedondatems) {
            super(0);
            this.$RemoteActionCompatParcelizer = getcreatedondatems;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(fromBytes.IconCompatParcelizer.INSTANCE);
    }

    /* JADX INFO: renamed from: o.zzba$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/hasMixIns;", "AudioAttributesCompatParcelizer", "()Lo/hasMixIns;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<hasMixIns> {
        private /* synthetic */ RenewEligible $IconCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final hasMixIns invoke() {
            return _resolveFieldVsGetter.write(this.$IconCompatParcelizer).getViewModelStore();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(RenewEligible renewEligible) {
            super(0);
            this.$IconCompatParcelizer = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.zzba$read */
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<DataSourceBitmapLoaderExternalSyntheticLambda0<List<SealedLessonDetailsModel>>> setupdatedstatus = C0261zzba.this.AudioAttributesCompatParcelizer().read();
                final C0261zzba c0261zzba = C0261zzba.this;
                this.write = 1;
                if (setupdatedstatus.write(new getValidationToken() { // from class: o.zzba.read.3
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return AudioAttributesCompatParcelizer((DataSourceBitmapLoaderExternalSyntheticLambda0) obj2);
                    }

                    private Object AudioAttributesCompatParcelizer(DataSourceBitmapLoaderExternalSyntheticLambda0<List<SealedLessonDetailsModel>> dataSourceBitmapLoaderExternalSyntheticLambda0) {
                        c0261zzba.RemoteActionCompatParcelizer(dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof setStreamingFormat);
                        if (dataSourceBitmapLoaderExternalSyntheticLambda0 instanceof decodeBitmap) {
                            decodeBitmap decodebitmap = (decodeBitmap) dataSourceBitmapLoaderExternalSyntheticLambda0;
                            if (!((List) decodebitmap.RemoteActionCompatParcelizer()).isEmpty()) {
                                c0261zzba.read((List<? extends SealedLessonDetailsModel>) decodebitmap.RemoteActionCompatParcelizer());
                            } else {
                                C0261zzba c0261zzba2 = c0261zzba;
                                c0261zzba2.write(c0261zzba2.AudioAttributesCompatParcelizer().RatingCompat().IconCompatParcelizer().AudioAttributesCompatParcelizer(), c0261zzba.AudioAttributesCompatParcelizer().MediaBrowserCompatSearchResultReceiver().IconCompatParcelizer());
                            }
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

        read(SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return C0261zzba.this.new read(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.zzba$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/withFieldVisibility;", "IconCompatParcelizer", "()Lo/withFieldVisibility;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<withFieldVisibility> {
        private /* synthetic */ getCreatedOnDateMs $RemoteActionCompatParcelizer = null;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final withFieldVisibility invoke() {
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return anyexplicitswithoutignoral != null ? anyexplicitswithoutignoral.getDefaultViewModelCreationExtras() : withFieldVisibility.write.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass4(RenewEligible renewEligible) {
            super(0);
            this.$write = renewEligible;
        }
    }

    private final void MediaBrowserCompatItemReceiver() {
        C0261zzba c0261zzba = this;
        setBitrateKbps.RemoteActionCompatParcelizer(c0261zzba, new read(null));
        setBitrateKbps.RemoteActionCompatParcelizer(c0261zzba, new write(null));
        setBitrateKbps.RemoteActionCompatParcelizer(c0261zzba, new IconCompatParcelizer(null));
        setBitrateKbps.IconCompatParcelizer(c0261zzba, new AudioAttributesImplBaseParcelizer(null));
        setBitrateKbps.read(c0261zzba, new AudioAttributesImplApi26Parcelizer(null));
        setBitrateKbps.IconCompatParcelizer(c0261zzba, new MediaBrowserCompatCustomActionResultReceiver(null));
        setBitrateKbps.IconCompatParcelizer(c0261zzba, new AudioAttributesImplApi21Parcelizer(null));
        setBitrateKbps.read(c0261zzba, new MediaBrowserCompatItemReceiver(null));
        setBitrateKbps.read(c0261zzba, new MediaBrowserCompatSearchResultReceiver(null));
    }

    /* JADX INFO: renamed from: o.zzba$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/POJOPropertyBuilderWithMember;", "VM", "Lo/VisibilityChecker$RemoteActionCompatParcelizer;", "write", "()Lo/VisibilityChecker$RemoteActionCompatParcelizer;"}, k = 3, mv = {2, 2, 0}, xi = 48)
    public static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<VisibilityChecker.RemoteActionCompatParcelizer> {
        private /* synthetic */ Fragment $read;
        private /* synthetic */ RenewEligible $write;

        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public final VisibilityChecker.RemoteActionCompatParcelizer invoke() {
            VisibilityChecker.RemoteActionCompatParcelizer defaultViewModelProviderFactory;
            TypeResolutionContext typeResolutionContextWrite = _resolveFieldVsGetter.write(this.$write);
            anyExplicitsWithoutIgnoral anyexplicitswithoutignoral = typeResolutionContextWrite instanceof anyExplicitsWithoutIgnoral ? (anyExplicitsWithoutIgnoral) typeResolutionContextWrite : null;
            return (anyexplicitswithoutignoral == null || (defaultViewModelProviderFactory = anyexplicitswithoutignoral.getDefaultViewModelProviderFactory()) == null) ? this.$read.getDefaultViewModelProviderFactory() : defaultViewModelProviderFactory;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Fragment fragment, RenewEligible renewEligible) {
            super(0);
            this.$read = fragment;
            this.$write = renewEligible;
        }
    }

    /* JADX INFO: renamed from: o.zzba$write */
    static final class write extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<List<ProtocolVersion>> setupdatedstatusAudioAttributesImplBaseParcelizer = C0261zzba.this.AudioAttributesCompatParcelizer().AudioAttributesImplBaseParcelizer();
                final C0261zzba c0261zzba = C0261zzba.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusAudioAttributesImplBaseParcelizer.write(new getValidationToken() { // from class: o.zzba.write.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((List) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(List<ProtocolVersion> list) {
                        c0261zzba.RemoteActionCompatParcelizer(list);
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
            return C0261zzba.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.zzba$IconCompatParcelizer */
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<String> setupdatedstatusMediaBrowserCompatSearchResultReceiver = C0261zzba.this.AudioAttributesCompatParcelizer().MediaBrowserCompatSearchResultReceiver();
                final C0261zzba c0261zzba = C0261zzba.this;
                this.read = 1;
                if (setupdatedstatusMediaBrowserCompatSearchResultReceiver.write(new getValidationToken() { // from class: o.zzba.IconCompatParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer((String) obj2);
                    }

                    private Object IconCompatParcelizer(String str) {
                        c0261zzba.IconCompatParcelizer(str);
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
            return C0261zzba.this.new IconCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.zzba$AudioAttributesImplBaseParcelizer */
    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<String> setupdatedstatusMediaBrowserCompatMediaItem = C0261zzba.this.AudioAttributesCompatParcelizer().MediaBrowserCompatMediaItem();
                final C0261zzba c0261zzba = C0261zzba.this;
                this.RemoteActionCompatParcelizer = 1;
                if (setupdatedstatusMediaBrowserCompatMediaItem.write(new getValidationToken() { // from class: o.zzba.AudioAttributesImplBaseParcelizer.5
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((String) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(String str) {
                        onBindingDied.write(c0261zzba.AudioAttributesImplApi26Parcelizer, null, str, 1);
                        int iAudioAttributesCompatParcelizer = c0261zzba.AudioAttributesImplApi26Parcelizer.AudioAttributesCompatParcelizer(str);
                        RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = c0261zzba.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer.AudioAttributesImplApi21Parcelizer();
                        toMagicModuleMetaRepoModel.read(mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer, "");
                        ((LinearLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer).read(iAudioAttributesCompatParcelizer, 0);
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

        AudioAttributesImplBaseParcelizer(SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return C0261zzba.this.new AudioAttributesImplBaseParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.zzba$AudioAttributesImplApi26Parcelizer */
    static final class AudioAttributesImplApi26Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<List<registerEvent>> setupdatedstatusIconCompatParcelizer = C0261zzba.this.AudioAttributesCompatParcelizer().IconCompatParcelizer();
                final C0261zzba c0261zzba = C0261zzba.this;
                this.write = 1;
                if (setupdatedstatusIconCompatParcelizer.write(new getValidationToken() { // from class: o.zzba.AudioAttributesImplApi26Parcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((List) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(List<registerEvent> list) {
                        if (list.isEmpty()) {
                            c0261zzba.RemoteActionCompatParcelizer().read.setClickable(false);
                            c0261zzba.RemoteActionCompatParcelizer().read.setAlpha(0.5f);
                        } else {
                            c0261zzba.RemoteActionCompatParcelizer().read.setClickable(true);
                            c0261zzba.RemoteActionCompatParcelizer().read.setAlpha(1.0f);
                            onBindingDied.write(c0261zzba.AudioAttributesImplApi26Parcelizer, list, null, 2);
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

        AudioAttributesImplApi26Parcelizer(SampleVideos<? super AudioAttributesImplApi26Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return C0261zzba.this.new AudioAttributesImplApi26Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi26Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.zzba$MediaBrowserCompatCustomActionResultReceiver */
    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<Boolean> setupdatedstatusMediaBrowserCompatCustomActionResultReceiver = C0261zzba.this.AudioAttributesCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver();
                final C0261zzba c0261zzba = C0261zzba.this;
                this.read = 1;
                if (setupdatedstatusMediaBrowserCompatCustomActionResultReceiver.write(new getValidationToken() { // from class: o.zzba.MediaBrowserCompatCustomActionResultReceiver.3
                    @Override // kotlin.getValidationToken
                    public final /* bridge */ /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return IconCompatParcelizer(((Boolean) obj2).booleanValue());
                    }

                    private Object IconCompatParcelizer(boolean z) {
                        c0261zzba.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(z);
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
            return C0261zzba.this.new MediaBrowserCompatCustomActionResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.zzba$AudioAttributesImplApi21Parcelizer */
    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                isDark<String> isdarkAudioAttributesImplApi21Parcelizer = C0261zzba.this.AudioAttributesCompatParcelizer().AudioAttributesImplApi21Parcelizer();
                final C0261zzba c0261zzba = C0261zzba.this;
                this.write = 1;
                if (isdarkAudioAttributesImplApi21Parcelizer.write(new getValidationToken() { // from class: o.zzba.AudioAttributesImplApi21Parcelizer.1
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((String) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(String str) {
                        c0261zzba.RemoteActionCompatParcelizer().MediaMetadataCompat.setText(str);
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

        AudioAttributesImplApi21Parcelizer(SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return C0261zzba.this.new AudioAttributesImplApi21Parcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.zzba$MediaBrowserCompatItemReceiver */
    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<AbstractC0251zzar.MediaBrowserCompatItemReceiver> setupdatedstatusAudioAttributesImplApi26Parcelizer = C0261zzba.this.AudioAttributesCompatParcelizer().AudioAttributesImplApi26Parcelizer();
                final C0261zzba c0261zzba = C0261zzba.this;
                this.read = 1;
                if (setupdatedstatusAudioAttributesImplApi26Parcelizer.write(new getValidationToken() { // from class: o.zzba.MediaBrowserCompatItemReceiver.4
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((AbstractC0251zzar.MediaBrowserCompatItemReceiver) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(AbstractC0251zzar.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiver) {
                        LinearLayout linearLayoutIconCompatParcelizer = c0261zzba.RemoteActionCompatParcelizer().IconCompatParcelizer.IconCompatParcelizer();
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
                        linearLayoutIconCompatParcelizer.setVisibility(mediaBrowserCompatItemReceiver != null ? 0 : 8);
                        if (mediaBrowserCompatItemReceiver != null) {
                            c0261zzba.AudioAttributesCompatParcelizer(mediaBrowserCompatItemReceiver);
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

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return C0261zzba.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    /* JADX INFO: renamed from: o.zzba$MediaBrowserCompatSearchResultReceiver */
    static final class MediaBrowserCompatSearchResultReceiver extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<fromBytes> setupdatedstatusMediaBrowserCompatItemReceiver = C0261zzba.this.AudioAttributesCompatParcelizer().MediaBrowserCompatItemReceiver();
                final C0261zzba c0261zzba = C0261zzba.this;
                this.read = 1;
                if (setupdatedstatusMediaBrowserCompatItemReceiver.write(new getValidationToken() { // from class: o.zzba.MediaBrowserCompatSearchResultReceiver.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((fromBytes) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(fromBytes frombytes) {
                        if (frombytes instanceof fromBytes.AudioAttributesCompatParcelizer) {
                            c0261zzba.IconCompatParcelizer(((fromBytes.AudioAttributesCompatParcelizer) frombytes).read());
                        }
                        c0261zzba.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(fromBytes.AudioAttributesImplApi21Parcelizer.INSTANCE);
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

        MediaBrowserCompatSearchResultReceiver(SampleVideos<? super MediaBrowserCompatSearchResultReceiver> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return C0261zzba.this.new MediaBrowserCompatSearchResultReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatSearchResultReceiver) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesImplBaseParcelizer() {
        RemoteActionCompatParcelizer().RemoteActionCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.U2fApiClient
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0261zzba.MediaMetadataCompat(this.AudioAttributesCompatParcelizer);
            }
        });
        RemoteActionCompatParcelizer().read.setOnClickListener(new View.OnClickListener() { // from class: o.getObjectValue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0261zzba.RatingCompat(this.IconCompatParcelizer);
            }
        });
        RemoteActionCompatParcelizer().MediaDescriptionCompat.setOnClickListener(new View.OnClickListener() { // from class: o.ChannelIdValue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0261zzba.MediaBrowserCompatMediaItem(this.RemoteActionCompatParcelizer);
            }
        });
        RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.toChannelIdValueType
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0261zzba.MediaBrowserCompatSearchResultReceiver(this.RemoteActionCompatParcelizer);
            }
        });
        RemoteActionCompatParcelizer().AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.getStringValue
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0261zzba.MediaDescriptionCompat(this.RemoteActionCompatParcelizer);
            }
        });
        RemoteActionCompatParcelizer().IconCompatParcelizer.read.setOnClickListener(new View.OnClickListener() { // from class: o.getObjectValueAsString
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                C0261zzba.onCustomAction(this.IconCompatParcelizer);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaMetadataCompat(C0261zzba c0261zzba) {
        RecyclerView recyclerView = c0261zzba.RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        if (recyclerView.getVisibility() == 0) {
            c0261zzba.RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer.setVisibility(8);
            c0261zzba.RemoteActionCompatParcelizer().MediaDescriptionCompat.setVisibility(8);
        } else {
            c0261zzba.RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer.setVisibility(0);
            c0261zzba.RemoteActionCompatParcelizer().MediaDescriptionCompat.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void RatingCompat(C0261zzba c0261zzba) {
        c0261zzba.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(fromBytes.read.INSTANCE);
        RecyclerView recyclerView = c0261zzba.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        if (recyclerView.getVisibility() == 0) {
            c0261zzba.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer.setVisibility(8);
            c0261zzba.RemoteActionCompatParcelizer().MediaDescriptionCompat.setVisibility(8);
        } else {
            c0261zzba.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer.setVisibility(0);
            c0261zzba.RemoteActionCompatParcelizer().MediaDescriptionCompat.setVisibility(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatMediaItem(C0261zzba c0261zzba) {
        RecyclerView recyclerView = c0261zzba.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
        if (recyclerView.getVisibility() == 0) {
            c0261zzba.RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer.setVisibility(8);
        }
        RecyclerView recyclerView2 = c0261zzba.RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView2, "");
        if (recyclerView2.getVisibility() == 0) {
            c0261zzba.RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer.setVisibility(8);
        }
        c0261zzba.RemoteActionCompatParcelizer().MediaDescriptionCompat.setVisibility(8);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaBrowserCompatSearchResultReceiver(C0261zzba c0261zzba) {
        c0261zzba.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void MediaDescriptionCompat(C0261zzba c0261zzba) {
        c0261zzba.requireActivity().onBackPressed();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void onCustomAction(C0261zzba c0261zzba) {
        c0261zzba.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(fromBytes.MediaBrowserCompatItemReceiver.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(AbstractC0251zzar.MediaBrowserCompatItemReceiver p0) {
        setTokenBinding.Companion companion = setTokenBinding.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        requireActivity().startActivity(setTokenBinding.Companion.IconCompatParcelizer(contextRequireContext, p0.RemoteActionCompatParcelizer(), 2, "suggested_qb"));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void AudioAttributesCompatParcelizer(AbstractC0251zzar.MediaBrowserCompatItemReceiver p0) {
        String string;
        createTrackGroupArrayWithDrmInfo createtrackgrouparraywithdrminfo = RemoteActionCompatParcelizer().IconCompatParcelizer;
        Context context = RemoteActionCompatParcelizer().IconCompatParcelizer().getContext();
        TextView textView = createtrackgrouparraywithdrminfo.IconCompatParcelizer;
        if (p0.AudioAttributesCompatParcelizer() == 1) {
            string = context.getString(R.string.suggestion_continue_solving);
        } else {
            string = context.getString(R.string.suggestion_solve_next);
        }
        textView.setText(string);
        createtrackgrouparraywithdrminfo.read.setVisibility(0);
        createtrackgrouparraywithdrminfo.AudioAttributesCompatParcelizer.setText(p0.read());
        if (p0.write() > 0) {
            createtrackgrouparraywithdrminfo.RemoteActionCompatParcelizer.setVisibility(0);
            createtrackgrouparraywithdrminfo.RemoteActionCompatParcelizer.setMax(p0.IconCompatParcelizer());
            createtrackgrouparraywithdrminfo.RemoteActionCompatParcelizer.setProgress(p0.write());
            return;
        }
        createtrackgrouparraywithdrminfo.RemoteActionCompatParcelizer.setVisibility(8);
    }

    /* JADX INFO: renamed from: o.zzba$MediaDescriptionCompat */
    public static final class MediaDescriptionCompat extends RecyclerView.MediaBrowserCompatSearchResultReceiver {
        MediaDescriptionCompat() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatSearchResultReceiver
        public final void RemoteActionCompatParcelizer(RecyclerView recyclerView, int i, int i2) {
            toMagicModuleMetaRepoModel.write(recyclerView, "");
            RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = C0261zzba.this.RemoteActionCompatParcelizer().MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer();
            toMagicModuleMetaRepoModel.read(mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer, "");
            int iMediaBrowserCompatCustomActionResultReceiver = ((LinearLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer).MediaBrowserCompatCustomActionResultReceiver();
            int itemCount = C0261zzba.this.AudioAttributesCompatParcelizer.getItemCount();
            if (iMediaBrowserCompatCustomActionResultReceiver < 0 || iMediaBrowserCompatCustomActionResultReceiver >= itemCount) {
                return;
            }
            C0261zzba.this.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(new fromBytes.AudioAttributesImplApi26Parcelizer(C0261zzba.this.AudioAttributesCompatParcelizer.read(iMediaBrowserCompatCustomActionResultReceiver)));
        }
    }

    private final void MediaMetadataCompat() {
        RemoteActionCompatParcelizer().MediaBrowserCompatItemReceiver.RemoteActionCompatParcelizer(new MediaDescriptionCompat());
    }

    private final void MediaBrowserCompatCustomActionResultReceiver() {
        RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver.write((TabLayout.AudioAttributesCompatParcelizer) new DataSourceBitmapLoader(new getAnswerMap() { // from class: o.ChannelIdValueUnsupportedChannelIdValueTypeException
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return C0261zzba.read(this.write, (TabLayout.MediaBrowserCompatCustomActionResultReceiver) obj);
            }
        }));
        setBitrateKbps.RemoteActionCompatParcelizer(this, new RemoteActionCompatParcelizer(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(C0261zzba c0261zzba, TabLayout.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiver) {
        toMagicModuleMetaRepoModel.write(mediaBrowserCompatCustomActionResultReceiver, "");
        c0261zzba.AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(new fromBytes.RemoteActionCompatParcelizer(mediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer()));
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: renamed from: o.zzba$RemoteActionCompatParcelizer */
    static final class RemoteActionCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        private int write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.write;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                setUpdatedStatus<getChallengeValue> setupdatedstatusRatingCompat = C0261zzba.this.AudioAttributesCompatParcelizer().RatingCompat();
                final C0261zzba c0261zzba = C0261zzba.this;
                this.write = 1;
                if (setupdatedstatusRatingCompat.write(new getValidationToken() { // from class: o.zzba.RemoteActionCompatParcelizer.2
                    @Override // kotlin.getValidationToken
                    public final /* synthetic */ Object IconCompatParcelizer(Object obj2, SampleVideos sampleVideos) {
                        return RemoteActionCompatParcelizer((getChallengeValue) obj2);
                    }

                    private Object RemoteActionCompatParcelizer(getChallengeValue getchallengevalue) {
                        if (!getchallengevalue.write().isEmpty()) {
                            if (c0261zzba.RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver.write() == 0) {
                                List<Integer> listWrite = getchallengevalue.write();
                                C0261zzba c0261zzba2 = c0261zzba;
                                Iterator<T> it = listWrite.iterator();
                                while (it.hasNext()) {
                                    c0261zzba2.RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(c0261zzba2.RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer().write(c0261zzba2.read(((Number) it.next()).intValue())), false);
                                }
                            }
                            c0261zzba.RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer(c0261zzba.RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(getchallengevalue.getWrite()));
                            return getShowPopup.INSTANCE;
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

        RemoteActionCompatParcelizer(SampleVideos<? super RemoteActionCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return C0261zzba.this.new RemoteActionCompatParcelizer(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((RemoteActionCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void RemoteActionCompatParcelizer(String p0) {
        RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer.setVisibility(8);
        RemoteActionCompatParcelizer().MediaDescriptionCompat.setVisibility(8);
        int i = this.AudioAttributesCompatParcelizer.read(p0);
        RecyclerView.MediaBrowserCompatItemReceiver mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer = RemoteActionCompatParcelizer().MediaBrowserCompatItemReceiver.AudioAttributesImplApi21Parcelizer();
        toMagicModuleMetaRepoModel.read(mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer, "");
        ((LinearLayoutManager) mediaBrowserCompatItemReceiverAudioAttributesImplApi21Parcelizer).read(i, 0);
        AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(new fromBytes.AudioAttributesImplApi26Parcelizer(this.AudioAttributesCompatParcelizer.read(i)));
        AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(fromBytes.write.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.String read(int r2) {
        /*
            r1 = this;
            r0 = -1
            if (r2 == r0) goto L2e
            if (r2 == 0) goto L26
            r0 = 1
            if (r2 == r0) goto L1e
            r0 = 2
            if (r2 == r0) goto L16
            r0 = 3
            if (r2 != r0) goto L2e
            r2 = 2131953177(0x7f130619, float:1.9542818E38)
            java.lang.String r1 = r1.getString(r2)
            goto L35
        L16:
            r2 = 2131953112(0x7f1305d8, float:1.9542686E38)
            java.lang.String r1 = r1.getString(r2)
            goto L35
        L1e:
            r2 = 2131953241(0x7f130659, float:1.9542947E38)
            java.lang.String r1 = r1.getString(r2)
            goto L35
        L26:
            r2 = 2131953344(0x7f1306c0, float:1.9543156E38)
            java.lang.String r1 = r1.getString(r2)
            goto L35
        L2e:
            r2 = 2131953078(0x7f1305b6, float:1.9542617E38)
            java.lang.String r1 = r1.getString(r2)
        L35:
            kotlin.toMagicModuleMetaRepoModel.write(r1)
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.C0261zzba.read(int):java.lang.String");
    }

    private final void AudioAttributesImplApi26Parcelizer() {
        RemoteActionCompatParcelizer().MediaBrowserCompatItemReceiver.setAdapter(this.AudioAttributesCompatParcelizer);
        write();
        RemoteActionCompatParcelizer().AudioAttributesImplBaseParcelizer.setAdapter(this.AudioAttributesImplApi26Parcelizer);
        RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer.setAdapter(this.IconCompatParcelizer);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(boolean p0) {
        if (p0) {
            RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer.setVisibility(0);
        } else {
            RemoteActionCompatParcelizer().AudioAttributesImplApi26Parcelizer.setVisibility(8);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void IconCompatParcelizer(String p0) {
        RemoteActionCompatParcelizer().MediaBrowserCompatSearchResultReceiver.setText(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void RemoteActionCompatParcelizer(List<ProtocolVersion> p0) {
        this.IconCompatParcelizer.read(p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void write(int p0, String p1) {
        String string = getString(R.string.f_no_lesson_in_lesson_status_type, read(p0), p1);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
        RemoteActionCompatParcelizer().MediaBrowserCompatMediaItem.setText(string);
        RemoteActionCompatParcelizer().MediaBrowserCompatItemReceiver.setVisibility(8);
        RemoteActionCompatParcelizer().write.setVisibility(0);
        RemoteActionCompatParcelizer().MediaBrowserCompatMediaItem.setVisibility(0);
        RemoteActionCompatParcelizer().RemoteActionCompatParcelizer.setVisibility(8);
        RemoteActionCompatParcelizer(false);
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(), AudioAttributesCompatParcelizer().getAudioAttributesImplApi26Parcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void read(List<? extends SealedLessonDetailsModel> p0) {
        RemoteActionCompatParcelizer().write.setVisibility(8);
        RemoteActionCompatParcelizer().MediaBrowserCompatMediaItem.setVisibility(8);
        RemoteActionCompatParcelizer().MediaBrowserCompatItemReceiver.setVisibility(0);
        RemoteActionCompatParcelizer().RemoteActionCompatParcelizer.setVisibility(0);
        this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(p0, AudioAttributesCompatParcelizer().getAudioAttributesImplApi26Parcelizer());
    }

    @Override // o.Error.IconCompatParcelizer
    public final void IconCompatParcelizer(SealedLessonDetailsModel.Lesson p0) {
        String string;
        toMagicModuleMetaRepoModel.write(p0, "");
        if (p0.getMediaDescriptionCompat()) {
            if (lambdaonPrepareComplete0comgoogleandroidexoplayer2sourceadsAdsMediaSourceAdPrepareListener.AudioAttributesCompatParcelizer().contains(p0.getIconCompatParcelizer())) {
                string = getString(R.string.text_lesson_coming_soon_short);
                toMagicModuleMetaRepoModel.write((Object) string);
            } else {
                string = getString(R.string.text_lesson_coming_soon);
                toMagicModuleMetaRepoModel.write((Object) string);
            }
            Toast.makeText(requireContext(), string, 1).show();
            return;
        }
        TabLayout.MediaBrowserCompatCustomActionResultReceiver mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer = RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer(RemoteActionCompatParcelizer().MediaBrowserCompatCustomActionResultReceiver.AudioAttributesCompatParcelizer());
        String strValueOf = String.valueOf(mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer != null ? mediaBrowserCompatCustomActionResultReceiverAudioAttributesCompatParcelizer.write() : null);
        setTokenBinding.Companion companion = setTokenBinding.INSTANCE;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        String read2 = p0.getRead();
        String lowerCase = strValueOf.toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        startActivity(setTokenBinding.Companion.IconCompatParcelizer(contextRequireContext, read2, 1, "qb_".concat(String.valueOf(lowerCase))));
    }

    private final void write() {
        RemoteActionCompatParcelizer().MediaBrowserCompatItemReceiver.AudioAttributesCompatParcelizer(this.AudioAttributesImplBaseParcelizer);
    }

    @Override // o.parseFromJson.AudioAttributesCompatParcelizer
    public final void AudioAttributesCompatParcelizer(int p0, int p1, String p2) {
        toMagicModuleMetaRepoModel.write(p2, "");
        this.IconCompatParcelizer.read(p0);
        RemoteActionCompatParcelizer().AudioAttributesImplApi21Parcelizer.setVisibility(8);
        RemoteActionCompatParcelizer().MediaDescriptionCompat.setVisibility(8);
        AudioAttributesCompatParcelizer().AudioAttributesCompatParcelizer(new fromBytes.AudioAttributesImplBaseParcelizer(p1, p2));
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        if (DeviceProperties.isTablet(requireContext())) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            RecyclerView recyclerView = RemoteActionCompatParcelizer().MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
            PlayerControlViewExternalSyntheticLambda1.IconCompatParcelizer(contextRequireContext, recyclerView);
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            TextView textView = RemoteActionCompatParcelizer().MediaMetadataCompat;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            PlayerControlViewExternalSyntheticLambda1.write(contextRequireContext2, textView);
        }
    }

    /* JADX INFO: renamed from: o.zzba$AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lo/zzba$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lo/isCompatible;", "p0", "Lo/zzba;", "read", "(Lo/isCompatible;)Lo/zzba;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static C0261zzba read(isCompatible p0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            C0261zzba c0261zzba = new C0261zzba();
            c0261zzba.setArguments(p0.read());
            return c0261zzba;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }
}
