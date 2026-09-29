package com.marrow.ui.dialogs;

import android.app.Dialog;
import android.content.Context;
import android.content.res.Configuration;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.TextView;
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.fasterxml.jackson.databind.introspect.AnnotatedField;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.data.models.ResponseError;
import com.marrow.data.models.lesson.tab.LessonTabItem;
import com.marrow.ui.dialogs.LessonCompletedDialog;
import com.marrow.ui.fragments.learn.model.ActiveRecallQbankLessonUiModel;
import com.marrow.ui.views.CustomButton;
import com.marrow.ui.views.CustomTextView;
import com.marrow.ui.views.LottieRatingBar;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import kotlin.CmcdConfigurationRequestConfig;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda1;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MarkIncompleteResponseBody;
import kotlin.Metadata;
import kotlin.PlayerControlViewExternalSyntheticLambda1;
import kotlin.UnexpectedSampleTimestampException;
import kotlin.af;
import kotlin.argCount;
import kotlin.buildDownloadCompletedNotification;
import kotlin.formatsMatch;
import kotlin.getCipherInstance;
import kotlin.getNextEvent;
import kotlin.getSampleFormats;
import kotlin.getTrackName;
import kotlin.maybeGetTypeVariable;
import kotlin.setSdkPayload;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.toMagicModuleStatusUcModel;
import kotlin.updateNavigation;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u0000 \u00172\u00020\u0001:\u0003\u0017\u001a&B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\t\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\u0003J\u0017\u0010\u000b\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\r\u0010\u0003J+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u00122\b\u0010\u0010\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0017\u0010\u0003J\u001b\u0010\u0017\u001a\u00020\u00062\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0018H\u0002¢\u0006\u0004\b\u0017\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u001a\u0010\u0003J\u0017\u0010\u001c\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001e\u0010\u0003J\u000f\u0010\u001f\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u001f\u0010\u0003R\u0016\u0010\u0017\u001a\u00020 8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b!\u0010\"R\u0016\u0010&\u001a\u00020#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R \u0010\r\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00180'8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b(\u0010)R\u0018\u0010+\u001a\u0004\u0018\u00010*8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0016\u0010\u001a\u001a\u00020-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R\"\u00101\u001a\u0002008\u0007@\u0007X\u0087.¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u0018\u0010!\u001a\u0004\u0018\u0001078\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b&\u00108R\u0018\u0010(\u001a\u0004\u0018\u0001098\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\r\u0010:R\u0018\u0010=\u001a\u0004\u0018\u00010;8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010<R\u0014\u0010.\u001a\u00020;8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010>"}, d2 = {"Lcom/marrow/ui/dialogs/LessonCompletedDialog;", "Lo/argCount;", "<init>", "()V", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "onStart", "Landroid/content/res/Configuration;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "IconCompatParcelizer", "Landroid/view/LayoutInflater;", "Landroid/view/ViewGroup;", "p1", "p2", "Landroid/view/View;", "onCreateView", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;Landroid/os/Bundle;)Landroid/view/View;", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "RemoteActionCompatParcelizer", "Lcom/marrow/data/models/lesson/tab/LessonTabItem;", "(Lcom/marrow/data/models/lesson/tab/LessonTabItem;)V", "read", "Landroid/content/Context;", "onAttach", "(Landroid/content/Context;)V", "onDetach", "onDestroyView", "", "AudioAttributesImplApi21Parcelizer", "Ljava/lang/String;", "", "MediaBrowserCompatItemReceiver", "I", "AudioAttributesCompatParcelizer", "", "AudioAttributesImplBaseParcelizer", "Ljava/util/List;", "Lcom/marrow/ui/fragments/learn/model/ActiveRecallQbankLessonUiModel;", "write", "Lcom/marrow/ui/fragments/learn/model/ActiveRecallQbankLessonUiModel;", "", "MediaBrowserCompatCustomActionResultReceiver", "Z", "Lo/getNextEvent;", "relatedModuleAdapter", "Lo/getNextEvent;", "getRelatedModuleAdapter", "()Lo/getNextEvent;", "setRelatedModuleAdapter", "(Lo/getNextEvent;)V", "Lcom/marrow/ui/dialogs/LessonCompletedDialog$read;", "Lcom/marrow/ui/dialogs/LessonCompletedDialog$read;", "Lo/MarkIncompleteResponseBody;", "Lo/MarkIncompleteResponseBody;", "Lo/getCipherInstance;", "Lo/getCipherInstance;", "AudioAttributesImplApi26Parcelizer", "()Lo/getCipherInstance;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LessonCompletedDialog extends argCount {
    private static int AudioAttributesImplApi26Parcelizer;
    private static int MediaBrowserCompatMediaItem;
    private static byte[] MediaBrowserCompatSearchResultReceiver;
    private static int MediaMetadataCompat;
    private static short[] RatingCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int onAddQueueItem;

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private read AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private List<? extends LessonTabItem<?>> IconCompatParcelizer;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private MarkIncompleteResponseBody AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private int AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private getCipherInstance AudioAttributesImplApi26Parcelizer;

    @setSdkPayload
    public getNextEvent relatedModuleAdapter;
    private ActiveRecallQbankLessonUiModel write;
    private static final byte[] $$c = {42, 85, 82, -118};
    private static final int $$f = 101;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$d = {104, 109, 121, 73, -56, 33, 56, 0, 9, -16, 27, 11, 15, 1, 18, 15, -38, TarConstants.LF_SYMLINK, -2, 24, 16, 0, 13, -2, 15, 8, -26, 35, 29, -45, 39, 11, 14, 6, -43, 4, 0, 20, -6, 28, 17, 11, 14, -6, -27, 43, 26, -2, 15, 8, -34, TarConstants.LF_DIR, 7, 12, -6, 28, -27, 26, 26, -6, 11, 16, 6, 26, -12, 22};
    private static final int $$e = 199;
    private static final byte[] $$a = {30, -87, -70, -33, -25, 0, -6, 7, 30, -49, 2, -9, 3, 13, -14, 46, -45, 1, -4, 14, -20, TarConstants.LF_NORMAL, -51, 1, -2, 4, 1, 43, -35, -18, 10, -7, 0, 27, -20, -15, -3, 8, -9, 33, -20, 1, -3, -5, -14, 16, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, 0, -32, -18, -18, 14, -3, -8, 2, -18, 20, -14, -53, 16, -6, -7, 45, -52, -1, 1, 8, 6, -20, 0, 14, -15, 41, -37, -4, 3, 42, -48, 6, TarConstants.LF_FIFO, -5, -27, -18, -18, 14, -3, -8, 2, -18, 20, -14};
    private static final int $$b = 185;
    private static int onCommand = 1;
    private static int MediaDescriptionCompat = 0;
    private static int handleMediaPlayPauseIfPendingOnHandler = 1;

    public interface read {
        void AudioAttributesCompatParcelizer(LessonTabItem<?> lessonTabItem);

        void accessonBackPresseds1027565324();

        void addObserverForBackInvoker();

        void read(int i, boolean z);

        void write(String str, float f);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$g(byte r7, byte r8, short r9) {
        /*
            int r7 = r7 * 4
            int r7 = r7 + 112
            byte[] r0 = com.marrow.ui.dialogs.LessonCompletedDialog.$$c
            int r9 = r9 * 4
            int r9 = 1 - r9
            int r8 = r8 * 3
            int r8 = 4 - r8
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L17
            r3 = r8
            r7 = r9
            r4 = r2
            goto L2a
        L17:
            r3 = r2
        L18:
            int r4 = r3 + 1
            byte r5 = (byte) r7
            r1[r3] = r5
            if (r4 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            return r7
        L25:
            r3 = r0[r8]
            r6 = r3
            r3 = r8
            r8 = r6
        L2a:
            int r8 = -r8
            int r7 = r7 + r8
            int r8 = r3 + 1
            r3 = r4
            goto L18
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.dialogs.LessonCompletedDialog.$$g(byte, byte, short):java.lang.String");
    }

    public static /* synthetic */ Object AudioAttributesCompatParcelizer(int i, int i2, Object[] objArr, int i3, int i4, int i5, int i6) {
        int i7 = ~i4;
        int i8 = ~i2;
        int i9 = ~(i7 | i8);
        int i10 = i3 | i9;
        int i11 = (~(i7 | i3)) | i9 | (~(i8 | i3));
        int i12 = ~((~i3) | i4 | i2);
        int i13 = i4 + i2 + i6 + ((-2027816600) * i) + ((-1234684791) * i5);
        int i14 = i13 * i13;
        int i15 = (i4 * (-132237830)) + 1711013888 + ((-132237830) * i2) + (i10 * 228444679) + (228444679 * i11) + ((-228444679) * i12) + (96206848 * i6) + (811597824 * i) + (1100742656 * i5) + (1751056384 * i14);
        int i16 = ((i4 * 572746074) - 905264446) + (i2 * 572746074) + (i10 * (-489)) + (i11 * (-489)) + (i12 * 489) + (i6 * 572745585) + (i * 982511336) + (i5 * (-774025351)) + (i14 * 1257177088);
        int i17 = i15 + (i16 * i16 * 1874919424);
        return i17 != 1 ? i17 != 2 ? i17 != 3 ? IconCompatParcelizer(objArr) : RemoteActionCompatParcelizer(objArr) : write(objArr) : read(objArr);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(byte r7, byte r8, byte r9, java.lang.Object[] r10) {
        /*
            int r9 = r9 * 10
            int r9 = 44 - r9
            int r7 = r7 * 12
            int r7 = r7 + 65
            int r8 = r8 + 4
            byte[] r0 = com.marrow.ui.dialogs.LessonCompletedDialog.$$a
            byte[] r1 = new byte[r9]
            r2 = 0
            if (r0 != 0) goto L15
            r3 = r8
            r8 = r9
            r5 = r2
            goto L2d
        L15:
            r3 = r2
        L16:
            byte r4 = (byte) r7
            int r5 = r3 + 1
            r1[r3] = r4
            if (r5 != r9) goto L25
            java.lang.String r7 = new java.lang.String
            r7.<init>(r1, r2)
            r10[r2] = r7
            return
        L25:
            int r8 = r8 + 1
            r3 = r0[r8]
            r6 = r8
            r8 = r7
            r7 = r3
            r3 = r6
        L2d:
            int r7 = -r7
            int r8 = r8 + r7
            int r7 = r8 + (-1)
            r8 = r3
            r3 = r5
            goto L16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.dialogs.LessonCompletedDialog.a(byte, byte, byte, java.lang.Object[]):void");
    }

    private static void c(int i, short s, short s2, Object[] objArr) {
        byte[] bArr = $$d;
        int i2 = s2 + 82;
        int i3 = i + 4;
        byte[] bArr2 = new byte[s + 5];
        int i4 = s + 4;
        int i5 = -1;
        if (bArr == null) {
            int i6 = i2 + i3;
            i3++;
            i2 = i6 - 9;
            i5 = -1;
        }
        while (true) {
            int i7 = i5 + 1;
            bArr2[i7] = (byte) i2;
            if (i7 == i4) {
                objArr[0] = new String(bArr2, 0);
                return;
            }
            i3++;
            i2 = (i2 + bArr[i3]) - 9;
            i5 = i7;
        }
    }

    public static final /* synthetic */ void IconCompatParcelizer(LessonCompletedDialog lessonCompletedDialog, LessonTabItem lessonTabItem) {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 53;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        lessonCompletedDialog.RemoteActionCompatParcelizer((LessonTabItem<?>) lessonTabItem);
        if (i3 != 0) {
            throw null;
        }
    }

    /* JADX INFO: renamed from: com.marrow.ui.dialogs.LessonCompletedDialog$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JA\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0010\u0010\n\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\t0\b2\b\u0010\f\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u0011"}, d2 = {"Lcom/marrow/ui/dialogs/LessonCompletedDialog$RemoteActionCompatParcelizer;", "", "<init>", "()V", "", "p0", "", "p1", "", "Lcom/marrow/data/models/lesson/tab/LessonTabItem;", "p2", "Lcom/marrow/ui/fragments/learn/model/ActiveRecallQbankLessonUiModel;", "p3", "", "p4", "Lcom/marrow/ui/dialogs/LessonCompletedDialog;", "write", "(Ljava/lang/String;ILjava/util/List;Lcom/marrow/ui/fragments/learn/model/ActiveRecallQbankLessonUiModel;Z)Lcom/marrow/ui/dialogs/LessonCompletedDialog;"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static LessonCompletedDialog write(String p0, int p1, List<? extends LessonTabItem<?>> p2, ActiveRecallQbankLessonUiModel p3, boolean p4) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            LessonCompletedDialog lessonCompletedDialog = new LessonCompletedDialog();
            Bundle bundle = new Bundle();
            bundle.putString("lesson_id", p0);
            bundle.putInt("my_rating", p1);
            bundle.putBoolean("is_revision_subject", p4);
            bundle.putSerializable("related_modules", new ArrayList(p2));
            bundle.putParcelable("active_recall_lesson", p3);
            lessonCompletedDialog.setArguments(bundle);
            return lessonCompletedDialog;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public final getNextEvent getRelatedModuleAdapter() {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 31;
        MediaDescriptionCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            obj.hashCode();
            throw null;
        }
        getNextEvent getnextevent = this.relatedModuleAdapter;
        if (getnextevent != null) {
            return getnextevent;
        }
        toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        int i3 = handleMediaPlayPauseIfPendingOnHandler + 17;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void setRelatedModuleAdapter(getNextEvent getnextevent) {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 53;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(getnextevent, "");
            this.relatedModuleAdapter = getnextevent;
        } else {
            toMagicModuleMetaRepoModel.write(getnextevent, "");
            this.relatedModuleAdapter = getnextevent;
            int i3 = 56 / 0;
        }
    }

    private final getCipherInstance write() {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 113;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        getCipherInstance getcipherinstance = this.AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.write(getcipherinstance);
        if (i3 != 0) {
            throw null;
        }
        int i4 = MediaDescriptionCompat + 47;
        handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
        int i5 = i4 % 2;
        return getcipherinstance;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void b(byte r23, int r24, int r25, short r26, int r27, java.lang.Object[] r28) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 767
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.dialogs.LessonCompletedDialog.b(byte, int, int, short, int, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0111  */
    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r24) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.dialogs.LessonCompletedDialog.onCreate(android.os.Bundle):void");
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        LessonCompletedDialog lessonCompletedDialog = (LessonCompletedDialog) objArr[0];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 55;
        MediaDescriptionCompat = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            super.onStart();
            lessonCompletedDialog.IconCompatParcelizer();
            int i3 = handleMediaPlayPauseIfPendingOnHandler + 17;
            MediaDescriptionCompat = i3 % 128;
            if (i3 % 2 != 0) {
                int i4 = 55 / 0;
            }
            return null;
        }
        super.onStart();
        lessonCompletedDialog.IconCompatParcelizer();
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        LessonCompletedDialog lessonCompletedDialog = (LessonCompletedDialog) objArr[0];
        Configuration configuration = (Configuration) objArr[1];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 119;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(configuration, "");
            super.onConfigurationChanged(configuration);
            lessonCompletedDialog.IconCompatParcelizer();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(configuration, "");
        super.onConfigurationChanged(configuration);
        lessonCompletedDialog.IconCompatParcelizer();
        int i3 = handleMediaPlayPauseIfPendingOnHandler + 87;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 27 / 0;
        }
        return null;
    }

    private final void IconCompatParcelizer() {
        Window window;
        int i = 2 % 2;
        Context contextRequireContext = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
        if (!CmcdConfigurationRequestConfig.AudioAttributesImplApi21Parcelizer(contextRequireContext)) {
            int i2 = MediaDescriptionCompat + 67;
            handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
            int i3 = i2 % 2;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(requireContext(), "");
            if (!CmcdConfigurationRequestConfig.IconCompatParcelizer(r1)) {
                int i4 = MediaDescriptionCompat + 105;
                handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
                if (i4 % 2 == 0) {
                    getDialog();
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                Dialog dialog = getDialog();
                if (dialog != null) {
                    int i5 = handleMediaPlayPauseIfPendingOnHandler + 103;
                    MediaDescriptionCompat = i5 % 128;
                    int i6 = i5 % 2;
                    Window window2 = dialog.getWindow();
                    if (window2 != null) {
                        int i7 = MediaDescriptionCompat + 121;
                        handleMediaPlayPauseIfPendingOnHandler = i7 % 128;
                        int i8 = i7 % 2;
                        window2.setLayout(-1, -2);
                        return;
                    }
                    return;
                }
                return;
            }
        }
        Dialog dialog2 = getDialog();
        if (dialog2 == null || (window = dialog2.getWindow()) == null) {
            return;
        }
        int i9 = handleMediaPlayPauseIfPendingOnHandler + 33;
        MediaDescriptionCompat = i9 % 128;
        int i10 = i9 % 2;
        Context contextRequireContext2 = requireContext();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
        if (i10 != 0) {
            window.setLayout(DataSourceBitmapLoaderExternalSyntheticLambda1.read(contextRequireContext2, 28513), 5);
        } else {
            window.setLayout(DataSourceBitmapLoaderExternalSyntheticLambda1.read(contextRequireContext2, ResponseError.NO_INTERNET_ERROR), -2);
        }
        int i11 = handleMediaPlayPauseIfPendingOnHandler + 99;
        MediaDescriptionCompat = i11 % 128;
        int i12 = i11 % 2;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater p0, ViewGroup p1, Bundle p2) {
        getCipherInstance getcipherinstanceWrite;
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 41;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.AudioAttributesImplApi26Parcelizer = getCipherInstance.RemoteActionCompatParcelizer(p0, p1);
            getcipherinstanceWrite = write();
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            this.AudioAttributesImplApi26Parcelizer = getCipherInstance.RemoteActionCompatParcelizer(p0, p1);
            getcipherinstanceWrite = write();
        }
        LinearLayout linearLayoutIconCompatParcelizer = getcipherinstanceWrite.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        setCancelable(false);
        LinearLayout linearLayout = linearLayoutIconCompatParcelizer;
        int i3 = handleMediaPlayPauseIfPendingOnHandler + 55;
        MediaDescriptionCompat = i3 % 128;
        int i4 = i3 % 2;
        return linearLayout;
    }

    public final class AudioAttributesCompatParcelizer extends RecyclerView.IconCompatParcelizer<write> {
        private UnexpectedSampleTimestampException AudioAttributesCompatParcelizer;
        final /* synthetic */ LessonCompletedDialog IconCompatParcelizer;
        private final List<LessonTabItem<?>> write;

        /* JADX WARN: Multi-variable type inference failed */
        public AudioAttributesCompatParcelizer(LessonCompletedDialog lessonCompletedDialog, List<? extends LessonTabItem<?>> list) {
            toMagicModuleMetaRepoModel.write(list, "");
            this.IconCompatParcelizer = lessonCompletedDialog;
            this.write = list;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public final /* synthetic */ RecyclerView.onMediaButtonEvent onCreateViewHolder(ViewGroup viewGroup, int i) {
            return AudioAttributesCompatParcelizer(viewGroup);
        }

        private UnexpectedSampleTimestampException read() {
            UnexpectedSampleTimestampException unexpectedSampleTimestampException = this.AudioAttributesCompatParcelizer;
            if (unexpectedSampleTimestampException != null) {
                return unexpectedSampleTimestampException;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            return null;
        }

        private void write(UnexpectedSampleTimestampException unexpectedSampleTimestampException) {
            toMagicModuleMetaRepoModel.write(unexpectedSampleTimestampException, "");
            this.AudioAttributesCompatParcelizer = unexpectedSampleTimestampException;
        }

        private write AudioAttributesCompatParcelizer(ViewGroup viewGroup) {
            toMagicModuleMetaRepoModel.write(viewGroup, "");
            UnexpectedSampleTimestampException unexpectedSampleTimestampExceptionIconCompatParcelizer = UnexpectedSampleTimestampException.IconCompatParcelizer(LayoutInflater.from(viewGroup.getContext()), viewGroup);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(unexpectedSampleTimestampExceptionIconCompatParcelizer, "");
            viewGroup.getLayoutParams().width = -1;
            unexpectedSampleTimestampExceptionIconCompatParcelizer.IconCompatParcelizer.getLayoutParams().width = -1;
            write(unexpectedSampleTimestampExceptionIconCompatParcelizer);
            return new write(this, read());
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public void onBindViewHolder(write writeVar, int i) {
            toMagicModuleMetaRepoModel.write(writeVar, "");
            writeVar.write(this.write.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.IconCompatParcelizer
        public final int getItemCount() {
            return this.write.size();
        }

        public final class write extends RecyclerView.onMediaButtonEvent {
            private final UnexpectedSampleTimestampException AudioAttributesCompatParcelizer;
            private /* synthetic */ AudioAttributesCompatParcelizer write;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public write(AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, UnexpectedSampleTimestampException unexpectedSampleTimestampException) {
                super(unexpectedSampleTimestampException.IconCompatParcelizer());
                toMagicModuleMetaRepoModel.write(unexpectedSampleTimestampException, "");
                this.write = audioAttributesCompatParcelizer;
                this.AudioAttributesCompatParcelizer = unexpectedSampleTimestampException;
            }

            public final void write(final LessonTabItem<?> lessonTabItem) {
                String string;
                toMagicModuleMetaRepoModel.write(lessonTabItem, "");
                View view = this.itemView;
                final LessonCompletedDialog lessonCompletedDialog = this.write.IconCompatParcelizer;
                view.setOnClickListener(new View.OnClickListener() { // from class: o.DefaultTrackSelectorExternalSyntheticLambda1
                    @Override // android.view.View.OnClickListener
                    public final void onClick(View view2) {
                        LessonCompletedDialog.AudioAttributesCompatParcelizer.write.AudioAttributesCompatParcelizer(lessonCompletedDialog, lessonTabItem);
                    }
                });
                buildDownloadCompletedNotification.write(this.AudioAttributesCompatParcelizer.MediaBrowserCompatCustomActionResultReceiver, lessonTabItem.lessonImageUrl);
                this.AudioAttributesCompatParcelizer.RatingCompat.setText(lessonTabItem.title);
                boolean z = lessonTabItem.isPaid;
                boolean z2 = false;
                boolean z3 = lessonTabItem.status == 2;
                boolean z4 = lessonTabItem.status == 1;
                int i = lessonTabItem.mcqCount;
                float f = lessonTabItem.averageRating;
                String str = lessonTabItem.lessonReadTimeText;
                if (str == null || str.length() == 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append(" MCQs");
                    string = sb.toString();
                } else {
                    string = lessonTabItem.lessonReadTimeText;
                }
                this.AudioAttributesCompatParcelizer.AudioAttributesImplApi26Parcelizer.setText(string);
                this.AudioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer.setRating(f);
                CustomTextView customTextView = this.AudioAttributesCompatParcelizer.MediaBrowserCompatItemReceiver;
                toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
                String str2 = String.format(Locale.getDefault(), "(%.1f)", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
                customTextView.setText(str2);
                CustomTextView customTextView2 = this.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView2, "");
                customTextView2.setVisibility(lessonTabItem.isComingSoon ? 0 : 8);
                if (z) {
                    LinearLayout linearLayout = this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                    PlayerControlViewExternalSyntheticLambda1.write(linearLayout);
                    ImageView imageView = this.AudioAttributesCompatParcelizer.MediaMetadataCompat;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
                    imageView.setVisibility(lessonTabItem.isLessonUnlocked ? 8 : 0);
                } else {
                    LinearLayout linearLayout2 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatMediaItem;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
                    PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout2);
                }
                if (z3) {
                    ImageView imageView2 = this.AudioAttributesCompatParcelizer.write;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
                    PlayerControlViewExternalSyntheticLambda1.write(imageView2);
                    ImageView imageView3 = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView3, "");
                    PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView3);
                } else if (z4) {
                    ImageView imageView4 = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView4, "");
                    PlayerControlViewExternalSyntheticLambda1.write(imageView4);
                    ImageView imageView5 = this.AudioAttributesCompatParcelizer.write;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView5, "");
                    PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView5);
                } else {
                    ImageView imageView6 = this.AudioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView6, "");
                    PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView6);
                    ImageView imageView7 = this.AudioAttributesCompatParcelizer.write;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView7, "");
                    PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView7);
                }
                if (z4) {
                    return;
                }
                int i2 = lessonTabItem.newMcqCount;
                int i3 = lessonTabItem.updatedMcqCount;
                boolean z5 = i2 != 0;
                if (z3 && i3 != 0) {
                    z2 = true;
                }
                CustomTextView customTextView3 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView3, "");
                PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(customTextView3);
                CustomTextView customTextView4 = this.AudioAttributesCompatParcelizer.read;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView4, "");
                PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(customTextView4);
                CustomTextView customTextView5 = this.AudioAttributesCompatParcelizer.MediaDescriptionCompat;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView5, "");
                PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(customTextView5);
                if (z5 && z2) {
                    write(this, 1, 2);
                    CustomTextView customTextView6 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
                    toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
                    String str3 = String.format("%d New", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str3, "");
                    customTextView6.setText(str3);
                    CustomTextView customTextView7 = this.AudioAttributesCompatParcelizer.read;
                    toMagicModuleStatusUcModel tomagicmodulestatusucmodel3 = toMagicModuleStatusUcModel.INSTANCE;
                    String str4 = String.format("%d Revised", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str4, "");
                    customTextView7.setText(str4);
                    return;
                }
                if (z5) {
                    write(this, 1);
                    CustomTextView customTextView8 = this.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
                    toMagicModuleStatusUcModel tomagicmodulestatusucmodel4 = toMagicModuleStatusUcModel.INSTANCE;
                    String str5 = String.format("%d New", Arrays.copyOf(new Object[]{Integer.valueOf(i2)}, 1));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str5, "");
                    customTextView8.setText(str5);
                    return;
                }
                if (z2) {
                    write(this, 2);
                    CustomTextView customTextView9 = this.AudioAttributesCompatParcelizer.read;
                    toMagicModuleStatusUcModel tomagicmodulestatusucmodel5 = toMagicModuleStatusUcModel.INSTANCE;
                    String str6 = String.format("%d Revised", Arrays.copyOf(new Object[]{Integer.valueOf(i3)}, 1));
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str6, "");
                    customTextView9.setText(str6);
                    return;
                }
                LinearLayout linearLayout3 = this.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout3, "");
                PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout3);
            }

            /* JADX INFO: Access modifiers changed from: private */
            public static final void AudioAttributesCompatParcelizer(LessonCompletedDialog lessonCompletedDialog, LessonTabItem lessonTabItem) {
                LessonCompletedDialog.IconCompatParcelizer(lessonCompletedDialog, lessonTabItem);
            }

            private static final void write(write writeVar, int... iArr) {
                for (int i : iArr) {
                    LinearLayout linearLayout = writeVar.AudioAttributesCompatParcelizer.MediaBrowserCompatSearchResultReceiver;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                    PlayerControlViewExternalSyntheticLambda1.write(linearLayout);
                    if (i == 1) {
                        CustomTextView customTextView = writeVar.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
                        PlayerControlViewExternalSyntheticLambda1.write((View) customTextView);
                    } else if (i == 2) {
                        CustomTextView customTextView2 = writeVar.AudioAttributesCompatParcelizer.read;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView2, "");
                        PlayerControlViewExternalSyntheticLambda1.write((View) customTextView2);
                    } else if (i == 4) {
                        CustomTextView customTextView3 = writeVar.AudioAttributesCompatParcelizer.MediaDescriptionCompat;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView3, "");
                        PlayerControlViewExternalSyntheticLambda1.write((View) customTextView3);
                    }
                }
            }
        }
    }

    private static final void write(LessonCompletedDialog lessonCompletedDialog, float f) {
        int i = 2 % 2;
        String str = null;
        if (!getTrackName.write(lessonCompletedDialog.getContext())) {
            int i2 = handleMediaPlayPauseIfPendingOnHandler + 103;
            MediaDescriptionCompat = i2 % 128;
            if (i2 % 2 == 0) {
                lessonCompletedDialog.RemoteActionCompatParcelizer();
                return;
            } else {
                lessonCompletedDialog.RemoteActionCompatParcelizer();
                throw null;
            }
        }
        read readVar = lessonCompletedDialog.AudioAttributesImplApi21Parcelizer;
        if (readVar != null) {
            String str2 = lessonCompletedDialog.RemoteActionCompatParcelizer;
            if (str2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                str = str2;
            }
            readVar.write(str, f);
        }
        lessonCompletedDialog.write().AudioAttributesImplApi21Parcelizer.setRatingChangeAllowed(false);
        lessonCompletedDialog.read();
        if (lessonCompletedDialog.read) {
            int i3 = handleMediaPlayPauseIfPendingOnHandler + 21;
            int i4 = i3 % 128;
            MediaDescriptionCompat = i4;
            int i5 = i3 % 2;
            if (lessonCompletedDialog.write != null) {
                int i6 = i4 + 45;
                handleMediaPlayPauseIfPendingOnHandler = i6 % 128;
                int i7 = i6 % 2;
                LinearLayout linearLayout = lessonCompletedDialog.write().AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
                PlayerControlViewExternalSyntheticLambda1.write(linearLayout);
                View view = lessonCompletedDialog.write().RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
                PlayerControlViewExternalSyntheticLambda1.write(view);
            }
        }
    }

    private static final void IconCompatParcelizer(LessonCompletedDialog lessonCompletedDialog) {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 111;
        int i3 = i2 % 128;
        MediaDescriptionCompat = i3;
        Object obj = null;
        if (i2 % 2 == 0) {
            read readVar = lessonCompletedDialog.AudioAttributesImplApi21Parcelizer;
            if (readVar != null) {
                int i4 = i3 + 105;
                handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
                if (i4 % 2 != 0) {
                    readVar.addObserverForBackInvoker();
                } else {
                    readVar.addObserverForBackInvoker();
                    obj.hashCode();
                    throw null;
                }
            }
            lessonCompletedDialog.dismiss();
            return;
        }
        read readVar2 = lessonCompletedDialog.AudioAttributesImplApi21Parcelizer;
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static final void RemoteActionCompatParcelizer(com.marrow.ui.dialogs.LessonCompletedDialog r4) {
        /*
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.marrow.ui.dialogs.LessonCompletedDialog.MediaDescriptionCompat
            int r1 = r1 + 111
            int r2 = r1 % 128
            com.marrow.ui.dialogs.LessonCompletedDialog.handleMediaPlayPauseIfPendingOnHandler = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L17
            com.marrow.ui.fragments.learn.model.ActiveRecallQbankLessonUiModel r1 = r4.write
            r3 = 59
            int r3 = r3 / 0
            if (r1 == 0) goto L29
            goto L1b
        L17:
            com.marrow.ui.fragments.learn.model.ActiveRecallQbankLessonUiModel r1 = r4.write
            if (r1 == 0) goto L29
        L1b:
            int r2 = r2 + 115
            int r1 = r2 % 128
            com.marrow.ui.dialogs.LessonCompletedDialog.MediaDescriptionCompat = r1
            int r2 = r2 % r0
            com.marrow.ui.dialogs.LessonCompletedDialog$read r0 = r4.AudioAttributesImplApi21Parcelizer
            if (r0 == 0) goto L29
            r0.accessonBackPresseds1027565324()
        L29:
            r4.dismiss()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.dialogs.LessonCompletedDialog.RemoteActionCompatParcelizer(com.marrow.ui.dialogs.LessonCompletedDialog):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View p0, Bundle p1) throws Throwable {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 111;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            super.onViewCreated(p0, p1);
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onViewCreated(p0, p1);
        if (this.read) {
            LinearLayout linearLayout = write().MediaBrowserCompatCustomActionResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout);
            LinearLayout linearLayout2 = write().AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
            linearLayout2.setVisibility(this.write != null ? 0 : 8);
            formatsMatch formatsmatch = write().read;
            formatsmatch.read.setBackgroundColor(0);
            ImageView imageView = formatsmatch.write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
            imageView.setVisibility(8);
            TextView textView = formatsmatch.AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            textView.setVisibility(8);
            TextView textView2 = formatsmatch.AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
            textView2.setVisibility(8);
            TextView textView3 = formatsmatch.MediaBrowserCompatCustomActionResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView3, "");
            textView3.setVisibility(8);
            ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModel = this.write;
            if (activeRecallQbankLessonUiModel != null) {
                toMagicModuleMetaRepoModel.write(formatsmatch);
                af.RemoteActionCompatParcelizer(formatsmatch, activeRecallQbankLessonUiModel);
            }
            toMagicModuleMetaRepoModel.write(formatsmatch);
        } else {
            LinearLayout linearLayout3 = write().AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout3, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout3);
        }
        write().AudioAttributesImplApi21Parcelizer.setRating(this.AudioAttributesCompatParcelizer);
        final maybeGetTypeVariable activity = getActivity();
        write().MediaBrowserCompatItemReceiver.setLayoutManager(new LinearLayoutManager(activity) { // from class: com.marrow.ui.dialogs.LessonCompletedDialog$onViewCreated$llm$1
            @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.MediaBrowserCompatItemReceiver
            public final boolean RatingCompat() {
                return false;
            }
        });
        if (this.AudioAttributesCompatParcelizer > 0) {
            write().AudioAttributesImplApi21Parcelizer.setRatingChangeAllowed(false);
            CustomTextView customTextView = write().AudioAttributesImplApi26Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
            LottieRatingBar lottieRatingBar = write().AudioAttributesImplApi21Parcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lottieRatingBar, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(customTextView, lottieRatingBar);
            read();
            if (this.read && this.write != null) {
                int i3 = MediaDescriptionCompat + 37;
                handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
                if (i3 % 2 == 0) {
                    LinearLayout linearLayout4 = write().AudioAttributesCompatParcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout4, "");
                    PlayerControlViewExternalSyntheticLambda1.write(linearLayout4);
                    View view = write().RemoteActionCompatParcelizer;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
                    PlayerControlViewExternalSyntheticLambda1.write(view);
                    throw null;
                }
                LinearLayout linearLayout5 = write().AudioAttributesCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout5, "");
                PlayerControlViewExternalSyntheticLambda1.write(linearLayout5);
                View view2 = write().RemoteActionCompatParcelizer;
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
                PlayerControlViewExternalSyntheticLambda1.write(view2);
            }
        } else {
            View view3 = write().RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view3, "");
            CustomTextView customTextView2 = write().AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView2, "");
            RecyclerView recyclerView = write().MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
            LinearLayout linearLayout6 = write().AudioAttributesCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout6, "");
            CustomButton customButton = write().write;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(view3, customTextView2, recyclerView, linearLayout6, customButton);
        }
        write().AudioAttributesImplApi21Parcelizer.setOnRatingBarChangedListener(new RatingBar.OnRatingBarChangeListener() { // from class: o.selectAllTracks
            @Override // android.widget.RatingBar.OnRatingBarChangeListener
            public final void onRatingChanged(RatingBar ratingBar, float f, boolean z) {
                LessonCompletedDialog.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, f);
            }
        });
        ImageView imageView2 = write().IconCompatParcelizer;
        getSampleFormats getsampleformatsMediaBrowserCompatSearchResultReceiver = TrainingApplication.IconCompatParcelizer(getContext()).MediaBrowserCompatSearchResultReceiver();
        getSampleFormats.Companion companion = getSampleFormats.INSTANCE;
        imageView2.setVisibility(!getsampleformatsMediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(getSampleFormats.Companion.MediaMetadataCompat()) ? 4 : 0);
        write().IconCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.lambdaselectAudioTrack3comgoogleandroidexoplayer2trackselectionDefaultTrackSelector
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                LessonCompletedDialog.read(this.RemoteActionCompatParcelizer);
            }
        });
        write().read.AudioAttributesCompatParcelizer.setOnClickListener(new View.OnClickListener() { // from class: o.isSetParametersSupported
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                LessonCompletedDialog.write(this.read);
            }
        });
        write().write.setOnClickListener(new View.OnClickListener() { // from class: o.selectAudioTrack
            @Override // android.view.View.OnClickListener
            public final void onClick(View view4) {
                LessonCompletedDialog.AudioAttributesCompatParcelizer(this.read);
            }
        });
    }

    private static final void MediaBrowserCompatItemReceiver(LessonCompletedDialog lessonCompletedDialog) {
        boolean z;
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler;
        int i3 = i2 + 87;
        MediaDescriptionCompat = i3 % 128;
        if (i3 % 2 == 0) {
            read readVar = lessonCompletedDialog.AudioAttributesImplApi21Parcelizer;
            if (readVar != null) {
                int i4 = i2 + 5;
                MediaDescriptionCompat = i4 % 128;
                if (i4 % 2 == 0) {
                    int rating = lessonCompletedDialog.write().AudioAttributesImplApi21Parcelizer.getRating();
                    if (lessonCompletedDialog.AudioAttributesCompatParcelizer == 0) {
                        z = true;
                    } else {
                        int i5 = handleMediaPlayPauseIfPendingOnHandler + 85;
                        MediaDescriptionCompat = i5 % 128;
                        int i6 = i5 % 2;
                        z = false;
                    }
                    readVar.read(rating, z);
                } else {
                    lessonCompletedDialog.write().AudioAttributesImplApi21Parcelizer.getRating();
                    int i7 = lessonCompletedDialog.AudioAttributesCompatParcelizer;
                    throw null;
                }
            }
            lessonCompletedDialog.dismiss();
            return;
        }
        read readVar2 = lessonCompletedDialog.AudioAttributesImplApi21Parcelizer;
        throw null;
    }

    private final void RemoteActionCompatParcelizer() {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 43;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        Toast.makeText(getContext(), R.string.app_error_no_internet, 1).show();
        int i4 = handleMediaPlayPauseIfPendingOnHandler + 117;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void RemoteActionCompatParcelizer(LessonTabItem<?> p0) {
        int i = 2 % 2;
        read readVar = this.AudioAttributesImplApi21Parcelizer;
        if (readVar != null) {
            readVar.AudioAttributesCompatParcelizer(p0);
            int i2 = handleMediaPlayPauseIfPendingOnHandler + 55;
            MediaDescriptionCompat = i2 % 128;
            int i3 = i2 % 2;
        }
        dismiss();
        int i4 = handleMediaPlayPauseIfPendingOnHandler + 9;
        MediaDescriptionCompat = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void read() {
        int i;
        int i2 = 2 % 2;
        write().AudioAttributesImplApi26Parcelizer.setText(getString(R.string.rating_success_msg));
        CustomButton customButton = write().write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton, "");
        PlayerControlViewExternalSyntheticLambda1.write((View) customButton);
        List<? extends LessonTabItem<?>> list = this.IconCompatParcelizer;
        List<? extends LessonTabItem<?>> list2 = null;
        if (list == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            list = null;
        }
        int size = list.size();
        if (size <= 0) {
            View view = write().RemoteActionCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view, "");
            CustomTextView customTextView = write().AudioAttributesImplBaseParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView, "");
            RecyclerView recyclerView = write().MediaBrowserCompatItemReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(view, customTextView, recyclerView);
            return;
        }
        write().AudioAttributesImplBaseParcelizer.setText(getString(R.string.related_module_header, Integer.valueOf(size)));
        ViewGroup.LayoutParams layoutParams = write().MediaBrowserCompatItemReceiver.getLayoutParams();
        if (size <= 2) {
            Context contextRequireContext = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext, "");
            i = updateNavigation.read(contextRequireContext, size * 120);
            int i3 = MediaDescriptionCompat + 119;
            handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 4 % 3;
            }
        } else {
            Context contextRequireContext2 = requireContext();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(contextRequireContext2, "");
            i = updateNavigation.read(contextRequireContext2, 300);
        }
        layoutParams.height = i;
        List<? extends LessonTabItem<?>> list3 = this.IconCompatParcelizer;
        if (list3 == null) {
            int i5 = MediaDescriptionCompat + 23;
            handleMediaPlayPauseIfPendingOnHandler = i5 % 128;
            if (i5 % 2 == 0) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                throw null;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            list2 = list3;
        }
        write().MediaBrowserCompatItemReceiver.setAdapter(new AudioAttributesCompatParcelizer(this, list2));
        View view2 = write().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(view2, "");
        CustomTextView customTextView2 = write().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customTextView2, "");
        RecyclerView recyclerView2 = write().MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(recyclerView2, "");
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(view2, customTextView2, recyclerView2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onAttach(Context p0) {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 83;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            super.onAttach(p0);
            this.AudioAttributesImplApi21Parcelizer = (read) p0;
            throw null;
        }
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onAttach(p0);
        this.AudioAttributesImplApi21Parcelizer = (read) p0;
        int i3 = MediaDescriptionCompat + 103;
        handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 7 / 0;
        }
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        LessonCompletedDialog lessonCompletedDialog = (LessonCompletedDialog) objArr[0];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 45;
        MediaDescriptionCompat = i2 % 128;
        if (i2 % 2 == 0) {
            super.onDetach();
            lessonCompletedDialog.AudioAttributesImplApi21Parcelizer = null;
            int i3 = MediaDescriptionCompat + 101;
            handleMediaPlayPauseIfPendingOnHandler = i3 % 128;
            int i4 = i3 % 2;
            return null;
        }
        super.onDetach();
        lessonCompletedDialog.AudioAttributesImplApi21Parcelizer = null;
        throw null;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        LessonCompletedDialog lessonCompletedDialog = (LessonCompletedDialog) objArr[0];
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 21;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        super.onDestroyView();
        lessonCompletedDialog.AudioAttributesImplApi26Parcelizer = null;
        MarkIncompleteResponseBody markIncompleteResponseBody = lessonCompletedDialog.AudioAttributesImplBaseParcelizer;
        int i4 = MediaDescriptionCompat + 79;
        handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public static /* synthetic */ void write(LessonCompletedDialog lessonCompletedDialog) {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 13;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        RemoteActionCompatParcelizer(lessonCompletedDialog);
        int i4 = MediaDescriptionCompat + 11;
        handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ void read(LessonCompletedDialog lessonCompletedDialog) {
        int i = 2 % 2;
        int i2 = handleMediaPlayPauseIfPendingOnHandler + 115;
        MediaDescriptionCompat = i2 % 128;
        int i3 = i2 % 2;
        IconCompatParcelizer(lessonCompletedDialog);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(LessonCompletedDialog lessonCompletedDialog, float f) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 45;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
        write(lessonCompletedDialog, f);
        int i4 = handleMediaPlayPauseIfPendingOnHandler + 29;
        MediaDescriptionCompat = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 9 / 0;
        }
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer(LessonCompletedDialog lessonCompletedDialog) {
        int i = 2 % 2;
        int i2 = MediaDescriptionCompat + 39;
        handleMediaPlayPauseIfPendingOnHandler = i2 % 128;
        int i3 = i2 % 2;
        MediaBrowserCompatItemReceiver(lessonCompletedDialog);
        int i4 = MediaDescriptionCompat + 39;
        handleMediaPlayPauseIfPendingOnHandler = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    static {
        onAddQueueItem = 0;
        AudioAttributesCompatParcelizer();
        INSTANCE = new Companion(null);
        int i = onCommand + 81;
        onAddQueueItem = i % 128;
        if (i % 2 != 0) {
            throw null;
        }
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration p0) {
        int i = AnnotatedField.Serialization.read();
        int i2 = AnnotatedField.Serialization.read();
        AudioAttributesCompatParcelizer(AnnotatedField.Serialization.read(), -1852952860, new Object[]{this, p0}, i, 1852952860, AnnotatedField.Serialization.read(), i2);
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        int i = AnnotatedField.Serialization.read();
        int i2 = AnnotatedField.Serialization.read();
        AudioAttributesCompatParcelizer(AnnotatedField.Serialization.read(), 1879224626, new Object[]{this}, i, -1879224623, AnnotatedField.Serialization.read(), i2);
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onDetach() {
        int i = AnnotatedField.Serialization.read();
        int i2 = AnnotatedField.Serialization.read();
        AudioAttributesCompatParcelizer(AnnotatedField.Serialization.read(), 1549396570, new Object[]{this}, i, -1549396568, AnnotatedField.Serialization.read(), i2);
    }

    @Override // kotlin.argCount, androidx.fragment.app.Fragment
    public final void onStart() {
        int i = AnnotatedField.Serialization.read();
        int i2 = AnnotatedField.Serialization.read();
        AudioAttributesCompatParcelizer(AnnotatedField.Serialization.read(), -720175629, new Object[]{this}, i, 720175630, AnnotatedField.Serialization.read(), i2);
    }

    static void AudioAttributesCompatParcelizer() {
        AudioAttributesImplApi26Parcelizer = -518827307;
        MediaMetadataCompat = -819363122;
        MediaBrowserCompatMediaItem = -1236156679;
        MediaBrowserCompatSearchResultReceiver = new byte[]{-65, 70, -74, 77, -111, -110, 112, 78, -70, 66, -119, 122, 92, -94, 64, -74, 66, -101, 108, 66, -91, -82, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -78, -68, 66, -79, -66, -74, TarConstants.LF_GNUTYPE_LONGNAME, -65, 67, -76, -98, 97, -65, 70, -74, 77, -111, -110, 12, -77, -10, 125, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -70, 79, -77, 66, -65, -68, TarConstants.LF_GNUTYPE_LONGLINK, -92, 89, 72, 69, -76, -72, 66, -80, -73, -73, -73, -73};
    }
}
