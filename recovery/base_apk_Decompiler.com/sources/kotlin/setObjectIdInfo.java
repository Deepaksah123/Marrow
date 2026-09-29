package kotlin;

import android.graphics.Rect;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@getRenewGrpId
@Metadata(d1 = {"\u0000¦\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u0001:\u0001\u001eB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bB\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\fJ\u0017\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0003\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\r\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0012\u0010\u0013JM\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020\u00152\u0018\u0010\u0007\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u00190\u00162\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00190\u0016H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001b\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u001f\u0010\u001dJ\u000f\u0010\u000f\u001a\u00020\u0019H\u0016¢\u0006\u0004\b\u000f\u0010\u001dJ\u0017\u0010\u001b\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020 H\u0002¢\u0006\u0004\b\u001b\u0010!J\u000f\u0010\"\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\"\u0010\u001dJ!\u0010\u001b\u001a\u00020\u00192\b\u0010\u0003\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0005\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u001b\u0010#J\u0017\u0010\u000f\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020$H\u0017¢\u0006\u0004\b\u000f\u0010%JK\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u00142\u0006\u0010\u0005\u001a\u00020&2\u0006\u0010\u0007\u001a\u00020'2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020(\u0012\u0004\u0012\u00020\u00190\u00162\u0006\u0010)\u001a\u00020$2\u0006\u0010*\u001a\u00020$H\u0016¢\u0006\u0004\b\u001e\u0010+J\u000f\u0010,\u001a\u00020\u0019H\u0002¢\u0006\u0004\b,\u0010\u001dJ\u0017\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u0003\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001e\u0010-R\u001a\u0010\u001b\u001a\u00020\u00028\u0007X\u0087\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R\u0014\u0010\u001e\u001a\u00020\u00068\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u0010\u0012\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u00104R\u0016\u0010\u000f\u001a\u00020\u00118\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u0012\u00105R(\u00100\u001a\u0014\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u0017\u0012\u0004\u0012\u00020\u00190\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b6\u00107R\"\u0010,\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\u00190\u00168\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b8\u00107R\u001e\u00102\u001a\u00020\u00142\u0006\u0010\u0003\u001a\u00020\u00148\u0000@BX\u0081\u000e¢\u0006\u0006\n\u0004\b0\u00109R\u0016\u0010;\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001f\u0010:R\"\u0010\"\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020>0=0<8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010?R\u001b\u0010\u001f\u001a\u00020@8CX\u0083\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010A\u001a\u0004\b;\u0010BR\u0018\u0010E\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010DR\u0014\u00106\u001a\u00020F8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010GR\u001a\u00108\u001a\b\u0012\u0004\u0012\u00020 0H8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010IR\u0018\u0010L\u001a\u0004\u0018\u00010J8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b\"\u0010K"}, d2 = {"Lo/setObjectIdInfo;", "Lo/getNullValueProvider;", "Landroid/view/View;", "p0", "Lo/useRootWrapping;", "p1", "Lo/getClassName;", "p2", "Ljava/util/concurrent/Executor;", "p3", "<init>", "(Landroid/view/View;Lo/useRootWrapping;Lo/getClassName;Ljava/util/concurrent/Executor;)V", "(Landroid/view/View;Lo/useRootWrapping;)V", "Landroid/view/inputmethod/EditorInfo;", "Landroid/view/inputmethod/InputConnection;", "AudioAttributesCompatParcelizer", "(Landroid/view/inputmethod/EditorInfo;)Landroid/view/inputmethod/InputConnection;", "", "write", "()Z", "Lo/hasValueTypeDeserializer;", "Lo/KeyDeserializers;", "Lkotlin/Function1;", "", "Lo/findBeanDeserializer;", "", "Lo/ResolvableDeserializer;", "RemoteActionCompatParcelizer", "(Lo/hasValueTypeDeserializer;Lo/KeyDeserializers;Lo/getAnswerMap;Lo/getAnswerMap;)V", "()V", "read", "AudioAttributesImplApi26Parcelizer", "Lo/setObjectIdInfo$read;", "(Lo/setObjectIdInfo$read;)V", "MediaBrowserCompatCustomActionResultReceiver", "(Lo/hasValueTypeDeserializer;Lo/hasValueTypeDeserializer;)V", "Lo/WritableTypeIdInclusion;", "(Lo/WritableTypeIdInclusion;)V", "Lo/SettableBeanProperty;", "Lo/deserializeFromNumber;", "Lo/resetWithShared;", "p4", "p5", "(Lo/hasValueTypeDeserializer;Lo/SettableBeanProperty;Lo/deserializeFromNumber;Lo/getAnswerMap;Lo/WritableTypeIdInclusion;Lo/WritableTypeIdInclusion;)V", "MediaBrowserCompatItemReceiver", "(Z)V", "MediaMetadataCompat", "Landroid/view/View;", "IconCompatParcelizer", "()Landroid/view/View;", "AudioAttributesImplBaseParcelizer", "Lo/getClassName;", "Ljava/util/concurrent/Executor;", "Z", "RatingCompat", "Lo/getAnswerMap;", "MediaDescriptionCompat", "Lo/hasValueTypeDeserializer;", "Lo/KeyDeserializers;", "AudioAttributesImplApi21Parcelizer", "", "Ljava/lang/ref/WeakReference;", "Lo/assignIndex;", "Ljava/util/List;", "Landroid/view/inputmethod/BaseInputConnection;", "Lo/RenewEligible;", "()Landroid/view/inputmethod/BaseInputConnection;", "Landroid/graphics/Rect;", "Landroid/graphics/Rect;", "MediaBrowserCompatSearchResultReceiver", "Lo/DeserializerFactory;", "Lo/DeserializerFactory;", "Lo/UTF32Reader;", "Lo/UTF32Reader;", "Ljava/lang/Runnable;", "Ljava/lang/Runnable;", "MediaBrowserCompatMediaItem"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class setObjectIdInfo implements getNullValueProvider {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final DeserializerFactory RatingCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private List<WeakReference<assignIndex>> MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private KeyDeserializers AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final getClassName read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    public hasValueTypeDeserializer AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private Runnable MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final Executor write;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final UTF32Reader<read> MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private getAnswerMap<? super ResolvableDeserializer, getShowPopup> MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final View RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private getAnswerMap<? super List<? extends findBeanDeserializer>, getShowPopup> IconCompatParcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final RenewEligible AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private Rect MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private boolean AudioAttributesCompatParcelizer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] AudioAttributesCompatParcelizer;

        static {
            int[] iArr = new int[read.values().length];
            try {
                iArr[read.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[read.read.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[read.IconCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[read.write.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            AudioAttributesCompatParcelizer = iArr;
        }
    }

    public setObjectIdInfo(View view, useRootWrapping userootwrapping, getClassName getclassname, Executor executor) {
        this.RemoteActionCompatParcelizer = view;
        this.read = getclassname;
        this.write = executor;
        this.IconCompatParcelizer = AnonymousClass2.read;
        this.MediaBrowserCompatItemReceiver = AnonymousClass5.write;
        this.AudioAttributesImplBaseParcelizer = new hasValueTypeDeserializer("", findProperty.INSTANCE.AudioAttributesCompatParcelizer(), (findProperty) null, 4, (MagicModuleRepositoryImplExternalSyntheticLambda0) null);
        this.AudioAttributesImplApi21Parcelizer = KeyDeserializers.INSTANCE.read();
        this.MediaBrowserCompatCustomActionResultReceiver = new ArrayList();
        this.AudioAttributesImplApi26Parcelizer = getRenewExpiresOn.write(RenewEligibleCompanion.read, new AnonymousClass1());
        this.RatingCompat = new DeserializerFactory(userootwrapping, getclassname);
        this.MediaDescriptionCompat = new UTF32Reader<>(new read[16], 0);
    }

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from getter */
    public final View getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    public /* synthetic */ setObjectIdInfo(View view, useRootWrapping userootwrapping, getClassName getclassname, Executor executor, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(view, userootwrapping, getclassname, (i & 8) != 0 ? SettableBeanPropertyDelegating.read(Choreographer.getInstance()) : executor);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0082\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007"}, d2 = {"Lo/setObjectIdInfo$read;", "", "<init>", "(Ljava/lang/String;I)V", "RemoteActionCompatParcelizer", "read", "IconCompatParcelizer", "write"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class read {
        private static final /* synthetic */ getMagicModuleSavedMcqCount AudioAttributesCompatParcelizer;
        private static final /* synthetic */ read[] AudioAttributesImplApi26Parcelizer;
        public static final read RemoteActionCompatParcelizer = new read("StartInput", 0);
        public static final read read = new read("StopInput", 1);
        public static final read IconCompatParcelizer = new read("ShowKeyboard", 2);
        public static final read write = new read("HideKeyboard", 3);

        private read(String str, int i) {
        }

        static {
            read[] readVarArr = read();
            AudioAttributesImplApi26Parcelizer = readVarArr;
            AudioAttributesCompatParcelizer = getMagicModuleTimeline.IconCompatParcelizer(readVarArr);
        }

        private static final /* synthetic */ read[] read() {
            return new read[]{RemoteActionCompatParcelizer, read, IconCompatParcelizer, write};
        }

        public static read valueOf(String str) {
            return (read) Enum.valueOf(read.class, str);
        }

        public static read[] values() {
            return (read[]) AudioAttributesImplApi26Parcelizer.clone();
        }
    }

    /* JADX INFO: renamed from: o.setObjectIdInfo$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lo/findBeanDeserializer;", "p0", "", "IconCompatParcelizer", "(Ljava/util/List;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<List<? extends findBeanDeserializer>, getShowPopup> {
        public static final AnonymousClass2 read = new AnonymousClass2();

        public final void IconCompatParcelizer(List<? extends findBeanDeserializer> list) {
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(List<? extends findBeanDeserializer> list) {
            IconCompatParcelizer(list);
            return getShowPopup.INSTANCE;
        }

        AnonymousClass2() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.setObjectIdInfo$5, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/ResolvableDeserializer;", "p0", "", "read", "(I)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass5 extends MagicModuleUseCase implements getAnswerMap<ResolvableDeserializer, getShowPopup> {
        public static final AnonymousClass5 write = new AnonymousClass5();

        public final void read(int i) {
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(ResolvableDeserializer resolvableDeserializer) {
            read(resolvableDeserializer.getAudioAttributesCompatParcelizer());
            return getShowPopup.INSTANCE;
        }

        AnonymousClass5() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: o.setObjectIdInfo$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroid/view/inputmethod/BaseInputConnection;", "IconCompatParcelizer", "()Landroid/view/inputmethod/BaseInputConnection;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getCreatedOnDateMs<BaseInputConnection> {
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final BaseInputConnection invoke() {
            return new BaseInputConnection(setObjectIdInfo.this.getRemoteActionCompatParcelizer(), false);
        }

        AnonymousClass1() {
            super(0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final BaseInputConnection AudioAttributesImplApi21Parcelizer() {
        return (BaseInputConnection) this.AudioAttributesImplApi26Parcelizer.RemoteActionCompatParcelizer();
    }

    public setObjectIdInfo(View view, useRootWrapping userootwrapping) {
        this(view, userootwrapping, new constructForMethod(view), null, 8, null);
    }

    public final InputConnection AudioAttributesCompatParcelizer(EditorInfo p0) {
        if (!this.AudioAttributesCompatParcelizer) {
            return null;
        }
        SettableBeanPropertyDelegating.RemoteActionCompatParcelizer(p0, this.AudioAttributesImplApi21Parcelizer, this.AudioAttributesImplBaseParcelizer);
        SettableBeanPropertyDelegating.write(p0);
        assignIndex assignindex = new assignIndex(this.AudioAttributesImplBaseParcelizer, new RemoteActionCompatParcelizer(), this.AudioAttributesImplApi21Parcelizer.getRemoteActionCompatParcelizer());
        this.MediaBrowserCompatCustomActionResultReceiver.add(new WeakReference<>(assignindex));
        return assignindex;
    }

    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001J\u001d\u0010\u0006\u001a\u00020\u00052\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\f\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ?\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0006\u0010\u0014J\u0017\u0010\t\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\t\u0010\u0016"}, d2 = {"Lo/setObjectIdInfo$RemoteActionCompatParcelizer;", "Lo/_throwAsIOE;", "", "Lo/findBeanDeserializer;", "p0", "", "RemoteActionCompatParcelizer", "(Ljava/util/List;)V", "Lo/ResolvableDeserializer;", "read", "(I)V", "Landroid/view/KeyEvent;", "AudioAttributesCompatParcelizer", "(Landroid/view/KeyEvent;)V", "", "p1", "p2", "p3", "p4", "p5", "(ZZZZZZ)V", "Lo/assignIndex;", "(Lo/assignIndex;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements _throwAsIOE {
        RemoteActionCompatParcelizer() {
        }

        @Override // kotlin._throwAsIOE
        public final void RemoteActionCompatParcelizer(List<? extends findBeanDeserializer> p0) {
            setObjectIdInfo.this.IconCompatParcelizer.invoke(p0);
        }

        @Override // kotlin._throwAsIOE
        public final void read(int p0) {
            setObjectIdInfo.this.MediaBrowserCompatItemReceiver.invoke(ResolvableDeserializer.read(p0));
        }

        @Override // kotlin._throwAsIOE
        public final void AudioAttributesCompatParcelizer(KeyEvent p0) {
            setObjectIdInfo.this.AudioAttributesImplApi21Parcelizer().sendKeyEvent(p0);
        }

        @Override // kotlin._throwAsIOE
        public final void RemoteActionCompatParcelizer(boolean p0, boolean p1, boolean p2, boolean p3, boolean p4, boolean p5) {
            setObjectIdInfo.this.RatingCompat.read(p0, p1, p2, p3, p4, p5);
        }

        @Override // kotlin._throwAsIOE
        public final void read(assignIndex p0) {
            int size = setObjectIdInfo.this.MediaBrowserCompatCustomActionResultReceiver.size();
            for (int i = 0; i < size; i++) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(((WeakReference) setObjectIdInfo.this.MediaBrowserCompatCustomActionResultReceiver.get(i)).get(), p0)) {
                    setObjectIdInfo.this.MediaBrowserCompatCustomActionResultReceiver.remove(i);
                    return;
                }
            }
        }
    }

    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getAudioAttributesCompatParcelizer() {
        return this.AudioAttributesCompatParcelizer;
    }

    @Override // kotlin.getNullValueProvider
    public final void RemoteActionCompatParcelizer(hasValueTypeDeserializer p0, KeyDeserializers p1, getAnswerMap<? super List<? extends findBeanDeserializer>, getShowPopup> p2, getAnswerMap<? super ResolvableDeserializer, getShowPopup> p3) {
        this.AudioAttributesCompatParcelizer = true;
        this.AudioAttributesImplBaseParcelizer = p0;
        this.AudioAttributesImplApi21Parcelizer = p1;
        this.IconCompatParcelizer = p2;
        this.MediaBrowserCompatItemReceiver = p3;
        RemoteActionCompatParcelizer(read.RemoteActionCompatParcelizer);
    }

    @Override // kotlin.getNullValueProvider
    public final void RemoteActionCompatParcelizer() {
        RemoteActionCompatParcelizer(read.RemoteActionCompatParcelizer);
    }

    /* JADX INFO: renamed from: o.setObjectIdInfo$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lo/findBeanDeserializer;", "p0", "", "read", "(Ljava/util/List;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<List<? extends findBeanDeserializer>, getShowPopup> {
        public static final AnonymousClass3 write = new AnonymousClass3();

        public final void read(List<? extends findBeanDeserializer> list) {
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(List<? extends findBeanDeserializer> list) {
            read(list);
            return getShowPopup.INSTANCE;
        }

        AnonymousClass3() {
            super(1);
        }
    }

    @Override // kotlin.getNullValueProvider
    public final void read() {
        this.AudioAttributesCompatParcelizer = false;
        this.IconCompatParcelizer = AnonymousClass3.write;
        this.MediaBrowserCompatItemReceiver = AnonymousClass4.AudioAttributesCompatParcelizer;
        this.MediaBrowserCompatSearchResultReceiver = null;
        RemoteActionCompatParcelizer(read.read);
    }

    /* JADX INFO: renamed from: o.setObjectIdInfo$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/ResolvableDeserializer;", "p0", "", "RemoteActionCompatParcelizer", "(I)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<ResolvableDeserializer, getShowPopup> {
        public static final AnonymousClass4 AudioAttributesCompatParcelizer = new AnonymousClass4();

        public final void RemoteActionCompatParcelizer(int i) {
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(ResolvableDeserializer resolvableDeserializer) {
            RemoteActionCompatParcelizer(resolvableDeserializer.getAudioAttributesCompatParcelizer());
            return getShowPopup.INSTANCE;
        }

        AnonymousClass4() {
            super(1);
        }
    }

    @Override // kotlin.getNullValueProvider
    public final void AudioAttributesImplApi26Parcelizer() {
        RemoteActionCompatParcelizer(read.IconCompatParcelizer);
    }

    @Override // kotlin.getNullValueProvider
    public final void AudioAttributesCompatParcelizer() {
        RemoteActionCompatParcelizer(read.write);
    }

    private final void RemoteActionCompatParcelizer(read p0) {
        this.MediaDescriptionCompat.read(p0);
        if (this.MediaBrowserCompatMediaItem == null) {
            Runnable runnable = new Runnable() { // from class: o.visibleInView
                @Override // java.lang.Runnable
                public final void run() {
                    setObjectIdInfo.AudioAttributesImplBaseParcelizer(this.read);
                }
            };
            this.write.execute(runnable);
            this.MediaBrowserCompatMediaItem = runnable;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AudioAttributesImplBaseParcelizer(setObjectIdInfo setobjectidinfo) {
        setobjectidinfo.MediaBrowserCompatMediaItem = null;
        setobjectidinfo.MediaBrowserCompatCustomActionResultReceiver();
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void MediaBrowserCompatCustomActionResultReceiver() {
        View viewFindFocus;
        if (!this.RemoteActionCompatParcelizer.isFocused() && (viewFindFocus = this.RemoteActionCompatParcelizer.getRootView().findFocus()) != null && viewFindFocus.onCheckIsTextEditor()) {
            this.MediaDescriptionCompat.RemoteActionCompatParcelizer();
            return;
        }
        MagicModuleUseCaseImplWhenMappings.write writeVar = new MagicModuleUseCaseImplWhenMappings.write();
        MagicModuleUseCaseImplWhenMappings.write writeVar2 = new MagicModuleUseCaseImplWhenMappings.write();
        UTF32Reader<read> uTF32Reader = this.MediaDescriptionCompat;
        read[] readVarArr = uTF32Reader.IconCompatParcelizer;
        int audioAttributesCompatParcelizer = uTF32Reader.getAudioAttributesCompatParcelizer();
        for (int i = 0; i < audioAttributesCompatParcelizer; i++) {
            RemoteActionCompatParcelizer(readVarArr[i], writeVar, writeVar2);
        }
        this.MediaDescriptionCompat.RemoteActionCompatParcelizer();
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeVar.write, Boolean.TRUE)) {
            MediaBrowserCompatItemReceiver();
        }
        Boolean bool = (Boolean) writeVar2.write;
        if (bool != null) {
            read(bool.booleanValue());
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeVar.write, Boolean.FALSE)) {
            MediaBrowserCompatItemReceiver();
        }
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v1, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v2, types: [T, java.lang.Boolean] */
    /* JADX WARN: Type inference failed for: r3v3, types: [T, java.lang.Boolean] */
    private static final void RemoteActionCompatParcelizer(read readVar, MagicModuleUseCaseImplWhenMappings.write<Boolean> writeVar, MagicModuleUseCaseImplWhenMappings.write<Boolean> writeVar2) {
        int i = WhenMappings.AudioAttributesCompatParcelizer[readVar.ordinal()];
        ?? r1 = Boolean.TRUE;
        if (i == 1) {
            writeVar.write = r1;
            writeVar2.write = r1;
        } else if (i == 2) {
            writeVar.write = Boolean.FALSE;
            writeVar2.write = Boolean.FALSE;
        } else {
            if (i != 3 && i != 4) {
                throw new RenewEligibleCreator();
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(writeVar.write, Boolean.FALSE)) {
                return;
            }
            writeVar2.write = Boolean.valueOf(readVar == read.IconCompatParcelizer);
        }
    }

    @Override // kotlin.getNullValueProvider
    public final void RemoteActionCompatParcelizer(hasValueTypeDeserializer p0, hasValueTypeDeserializer p1) {
        boolean z = (findProperty.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer.getAudioAttributesCompatParcelizer(), p1.getAudioAttributesCompatParcelizer()) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer.getIconCompatParcelizer(), p1.getIconCompatParcelizer())) ? false : true;
        this.AudioAttributesImplBaseParcelizer = p1;
        int size = this.MediaBrowserCompatCustomActionResultReceiver.size();
        for (int i = 0; i < size; i++) {
            assignIndex assignindex = this.MediaBrowserCompatCustomActionResultReceiver.get(i).get();
            if (assignindex != null) {
                assignindex.IconCompatParcelizer(p1);
            }
        }
        this.RatingCompat.write();
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0, p1)) {
            if (z) {
                getClassName getclassname = this.read;
                int iMediaBrowserCompatCustomActionResultReceiver = findProperty.MediaBrowserCompatCustomActionResultReceiver(p1.getAudioAttributesCompatParcelizer());
                int iAudioAttributesImplApi26Parcelizer = findProperty.AudioAttributesImplApi26Parcelizer(p1.getAudioAttributesCompatParcelizer());
                findProperty iconCompatParcelizer = this.AudioAttributesImplBaseParcelizer.getIconCompatParcelizer();
                int iMediaBrowserCompatCustomActionResultReceiver2 = iconCompatParcelizer != null ? findProperty.MediaBrowserCompatCustomActionResultReceiver(iconCompatParcelizer.getIconCompatParcelizer()) : -1;
                findProperty iconCompatParcelizer2 = this.AudioAttributesImplBaseParcelizer.getIconCompatParcelizer();
                getclassname.RemoteActionCompatParcelizer(iMediaBrowserCompatCustomActionResultReceiver, iAudioAttributesImplApi26Parcelizer, iMediaBrowserCompatCustomActionResultReceiver2, iconCompatParcelizer2 != null ? findProperty.AudioAttributesImplApi26Parcelizer(iconCompatParcelizer2.getIconCompatParcelizer()) : -1);
                return;
            }
            return;
        }
        if (p0 != null && (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) p0.AudioAttributesCompatParcelizer(), (Object) p1.AudioAttributesCompatParcelizer()) || (findProperty.IconCompatParcelizer(p0.getAudioAttributesCompatParcelizer(), p1.getAudioAttributesCompatParcelizer()) && !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(p0.getIconCompatParcelizer(), p1.getIconCompatParcelizer())))) {
            MediaBrowserCompatItemReceiver();
            return;
        }
        int size2 = this.MediaBrowserCompatCustomActionResultReceiver.size();
        for (int i2 = 0; i2 < size2; i2++) {
            assignIndex assignindex2 = this.MediaBrowserCompatCustomActionResultReceiver.get(i2).get();
            if (assignindex2 != null) {
                assignindex2.RemoteActionCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this.read);
            }
        }
    }

    @Override // kotlin.getNullValueProvider
    @getRenewGrpId
    public final void AudioAttributesCompatParcelizer(WritableTypeIdInclusion p0) {
        Rect rect;
        this.MediaBrowserCompatSearchResultReceiver = new Rect(getOnline.RemoteActionCompatParcelizer(p0.getAudioAttributesCompatParcelizer()), getOnline.RemoteActionCompatParcelizer(p0.getRemoteActionCompatParcelizer()), getOnline.RemoteActionCompatParcelizer(p0.getWrite()), getOnline.RemoteActionCompatParcelizer(p0.getIconCompatParcelizer()));
        if (!this.MediaBrowserCompatCustomActionResultReceiver.isEmpty() || (rect = this.MediaBrowserCompatSearchResultReceiver) == null) {
            return;
        }
        this.RemoteActionCompatParcelizer.requestRectangleOnScreen(new Rect(rect));
    }

    @Override // kotlin.getNullValueProvider
    public final void read(hasValueTypeDeserializer p0, SettableBeanProperty p1, deserializeFromNumber p2, getAnswerMap<? super resetWithShared, getShowPopup> p3, WritableTypeIdInclusion p4, WritableTypeIdInclusion p5) {
        this.RatingCompat.RemoteActionCompatParcelizer(p0, p1, p2, p3, p4, p5);
    }

    private final void MediaBrowserCompatItemReceiver() {
        this.read.write();
    }

    private final void read(boolean p0) {
        if (p0) {
            this.read.IconCompatParcelizer();
        } else {
            this.read.RemoteActionCompatParcelizer();
        }
    }
}
