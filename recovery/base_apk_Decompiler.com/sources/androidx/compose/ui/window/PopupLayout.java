package androidx.compose.ui.window;

import android.R;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.WindowManager;
import androidx.compose.ui.platform.AbstractComposeView;
import androidx.compose.ui.window.PopupLayout;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.UUID;
import kotlin.CoercionConfigs;
import kotlin.CollectionDeserializer;
import kotlin.ContainerDeserializerBase;
import kotlin.DateDeserializers;
import kotlin.DateDeserializersCalendarDeserializer;
import kotlin.InputAccessor;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MagicModuleUseCase;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.Metadata;
import kotlin.ReadableObjectId;
import kotlin.RenewEligibleCreator;
import kotlin._appendEscaped;
import kotlin._handleApos;
import kotlin._handleUnrecognizedCharacterEscape;
import kotlin._qbuf;
import kotlin._validJsonValueList;
import kotlin.appendReferring;
import kotlin.assignParameter;
import kotlin.available;
import kotlin.bufferMapProperty;
import kotlin.convertNumberToLong;
import kotlin.g0;
import kotlin.getAnswerMap;
import kotlin.getCreatedOnDateMs;
import kotlin.getKey;
import kotlin.getShowPopup;
import kotlin.hasRawClass;
import kotlin.hasReferringProperties;
import kotlin.isAbstract;
import kotlin.isCreatorVisible;
import kotlin.isFieldVisible;
import kotlin.parseDouble;
import kotlin.popOrNull;
import kotlin.push;
import kotlin.releaseNameCopyBuffer;
import kotlin.setCenterTextRadiusPercent;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.tryToResolveUnresolved;
import kotlin.withDateFormat;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\b\u0000\u0018\u0000 .2\u00020\u00012\u00020\u0002:\u0001.BY\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J\r\u0010\u0018\u001a\u00020\u0004¢\u0006\u0004\b\u0018\u0010\u0019J#\u0010\u001b\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u001a2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0004H\u0014¢\u0006\u0004\b\u001f\u0010\u0019J\u000f\u0010 \u001a\u00020\u0004H\u0014¢\u0006\u0004\b \u0010\u0019J\u001f\u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020!H\u0010¢\u0006\u0004\b\"\u0010#J7\u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00122\u0006\u0010\u0007\u001a\u00020!2\u0006\u0010\t\u001a\u00020!2\u0006\u0010\u000b\u001a\u00020!2\u0006\u0010\r\u001a\u00020!H\u0010¢\u0006\u0004\b\"\u0010$J\u0017\u0010&\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020%H\u0016¢\u0006\u0004\b&\u0010'J\u000f\u0010(\u001a\u00020\u0004H\u0002¢\u0006\u0004\b(\u0010\u0019J\u000f\u0010)\u001a\u00020\u0004H\u0002¢\u0006\u0004\b)\u0010\u0019J5\u0010\"\u001a\u00020\u00042\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020*¢\u0006\u0004\b\"\u0010+J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\"\u0010,J\u0015\u0010.\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020-¢\u0006\u0004\b.\u0010/J\r\u00100\u001a\u00020\u0004¢\u0006\u0004\b0\u0010\u0019J\u000f\u00101\u001a\u00020\u0004H\u0000¢\u0006\u0004\b1\u0010\u0019J\r\u00102\u001a\u00020\u0004¢\u0006\u0004\b2\u0010\u0019J\r\u0010.\u001a\u00020\u0004¢\u0006\u0004\b.\u0010\u0019J\u0019\u00104\u001a\u00020\u00122\b\u0010\u0005\u001a\u0004\u0018\u000103H\u0016¢\u0006\u0004\b4\u00105J\u0017\u00106\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020!H\u0016¢\u0006\u0004\b6\u00107J\u0017\u0010\"\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020*H\u0002¢\u0006\u0004\b\"\u00108J\u000f\u0010:\u001a\u000209H\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010=\u001a\u00020<H\u0002¢\u0006\u0004\b=\u0010>R\u001e\u0010@\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010?R\u0016\u0010.\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bA\u0010BR\"\u0010C\u001a\u00020\b8\u0007@\u0007X\u0086\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u0014\u0010J\u001a\u00020\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b:\u0010IR\u0014\u0010\u001d\u001a\u00020\u00128\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010KR\u0014\u0010\"\u001a\u00020\u00148\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bL\u0010MR\u0014\u00100\u001a\u00020N8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u00102\u001a\u0002098\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b=\u0010QR\"\u0010R\u001a\u00020\u000e8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR\"\u0010X\u001a\u00020*8\u0007@\u0007X\u0087\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u00108R/\u0010d\u001a\u0004\u0018\u00010]2\b\u0010\u0005\u001a\u0004\u0018\u00010]8G@GX\u0087\u008e\u0002¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR/\u0010:\u001a\u0004\u0018\u00010-2\b\u0010\u0005\u001a\u0004\u0018\u00010-8C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b)\u0010_\u001a\u0004\be\u0010f\"\u0004\b\"\u0010/R\u0018\u00101\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\be\u0010gR\u001b\u0010\u0018\u001a\u00020\u00128GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010h\u001a\u0004\b@\u0010iR\u0014\u0010e\u001a\u00020j8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010kR\u0014\u0010(\u001a\u00020l8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010L\u001a\u00020o8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0018\u0010)\u001a\u0004\u0018\u00010r8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bJ\u0010sR7\u0010=\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00038C@CX\u0083\u008e\u0002¢\u0006\u0012\n\u0004\b1\u0010_\u001a\u0004\bL\u0010t\"\u0004\b.\u0010uR$\u0010A\u001a\u00020\u00122\u0006\u0010\u0005\u001a\u00020\u00128\u0015@RX\u0095\u000e¢\u0006\f\n\u0004\bv\u0010K\u001a\u0004\b\"\u0010iR\u0014\u0010v\u001a\u00020w8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b2\u0010x"}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "Landroidx/compose/ui/platform/AbstractComposeView;", "Lo/CoercionConfigs;", "Lkotlin/Function0;", "", "p0", "Lo/withDateFormat;", "p1", "", "p2", "Landroid/view/View;", "p3", "Lo/bufferMapProperty;", "p4", "Lo/DateDeserializersCalendarDeserializer;", "p5", "Ljava/util/UUID;", "p6", "", "p7", "Lo/DateDeserializers;", "p8", "<init>", "(Lo/getCreatedOnDateMs;Lo/withDateFormat;Ljava/lang/String;Landroid/view/View;Lo/bufferMapProperty;Lo/DateDeserializersCalendarDeserializer;Ljava/util/UUID;ZLo/DateDeserializers;)V", "AudioAttributesImplApi26Parcelizer", "()V", "Lo/convertNumberToLong;", "setContent", "(Lo/convertNumberToLong;Lo/MagicModuleSubmissionRequestBody;)V", "IconCompatParcelizer", "(Lo/_handleUnrecognizedCharacterEscape;I)V", "onAttachedToWindow", "onDetachedFromWindow", "", "write", "(II)V", "(ZIIII)V", "Landroid/view/KeyEvent;", "dispatchKeyEvent", "(Landroid/view/KeyEvent;)Z", "MediaBrowserCompatMediaItem", "MediaBrowserCompatSearchResultReceiver", "Lo/tryToResolveUnresolved;", "(Lo/getCreatedOnDateMs;Lo/withDateFormat;Ljava/lang/String;Lo/tryToResolveUnresolved;)V", "(Lo/withDateFormat;)V", "Lo/isAbstract;", "AudioAttributesCompatParcelizer", "(Lo/isAbstract;)V", "AudioAttributesImplBaseParcelizer", "AudioAttributesImplApi21Parcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Landroid/view/MotionEvent;", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "setLayoutDirection", "(I)V", "(Lo/tryToResolveUnresolved;)V", "Landroid/view/WindowManager$LayoutParams;", "MediaBrowserCompatItemReceiver", "()Landroid/view/WindowManager$LayoutParams;", "Lo/appendReferring;", "MediaDescriptionCompat", "()Lo/appendReferring;", "Lo/getCreatedOnDateMs;", "read", "onAddQueueItem", "Lo/withDateFormat;", "testTag", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "Landroid/view/View;", "RemoteActionCompatParcelizer", "Z", "MediaMetadataCompat", "Lo/DateDeserializers;", "Landroid/view/WindowManager;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Landroid/view/WindowManager;", "Landroid/view/WindowManager$LayoutParams;", "positionProvider", "Lo/DateDeserializersCalendarDeserializer;", "getPositionProvider", "()Lo/DateDeserializersCalendarDeserializer;", "setPositionProvider", "(Lo/DateDeserializersCalendarDeserializer;)V", "parentLayoutDirection", "Lo/tryToResolveUnresolved;", "getParentLayoutDirection", "()Lo/tryToResolveUnresolved;", "setParentLayoutDirection", "Lo/getKey;", "popupContentSize$delegate", "Lo/InputAccessor;", "getPopupContentSize-bOM6tXw", "()Lo/getKey;", "setPopupContentSize-fhxjrPA", "(Lo/getKey;)V", "popupContentSize", "RatingCompat", "()Lo/isAbstract;", "Lo/appendReferring;", "Lo/parseDouble;", "()Z", "Lo/assignParameter;", "F", "Landroid/graphics/Rect;", "onCommand", "Landroid/graphics/Rect;", "Lo/g0;", "handleMediaPlayPauseIfPendingOnHandler", "Lo/g0;", "", "Ljava/lang/Object;", "()Lo/MagicModuleSubmissionRequestBody;", "(Lo/MagicModuleSubmissionRequestBody;)V", "onCustomAction", "", "[I"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class PopupLayout extends AbstractComposeView implements CoercionConfigs {
    private static final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer(null);
    public static final int IconCompatParcelizer = 8;
    private static final getAnswerMap<PopupLayout, getShowPopup> read = AnonymousClass3.write;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final InputAccessor MediaDescriptionCompat;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private final boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private final float RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int[] onCustomAction;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final View RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private getCreatedOnDateMs<getShowPopup> read;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final InputAccessor MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final WindowManager AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final WindowManager.LayoutParams MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final DateDeserializers write;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private appendReferring AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private Object MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final g0 MediaMetadataCompat;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private withDateFormat AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final Rect MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private boolean onAddQueueItem;
    private tryToResolveUnresolved parentLayoutDirection;

    /* JADX INFO: renamed from: popupContentSize$delegate, reason: from kotlin metadata */
    private final InputAccessor popupContentSize;
    private DateDeserializersCalendarDeserializer positionProvider;
    private String testTag;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final parseDouble AudioAttributesImplApi26Parcelizer;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> {
        final /* synthetic */ int write;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(int i) {
            super(2);
            this.write = i;
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ getShowPopup invoke(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Integer num) {
            read(_handleunrecognizedcharacterescape, num.intValue());
            return getShowPopup.INSTANCE;
        }

        public final void read(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
            PopupLayout.this.IconCompatParcelizer(_handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(this.write | 1));
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[tryToResolveUnresolved.values().length];
            try {
                iArr[tryToResolveUnresolved.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[tryToResolveUnresolved.RemoteActionCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            write = iArr;
        }
    }

    @Override // android.view.View
    public final void setLayoutDirection(int p0) {
    }

    public final String getTestTag() {
        return this.testTag;
    }

    public final void setTestTag(String str) {
        this.testTag = str;
    }

    public /* synthetic */ PopupLayout(getCreatedOnDateMs getcreatedondatems, withDateFormat withdateformat, String str, View view, bufferMapProperty buffermapproperty, DateDeserializersCalendarDeserializer dateDeserializersCalendarDeserializer, UUID uuid, boolean z, DateDeserializers dateDeserializers, int i, MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
        this(getcreatedondatems, withdateformat, str, view, buffermapproperty, dateDeserializersCalendarDeserializer, uuid, z, (i & 256) != 0 ? new ContainerDeserializerBase() : dateDeserializers);
    }

    public PopupLayout(getCreatedOnDateMs<getShowPopup> getcreatedondatems, withDateFormat withdateformat, String str, View view, bufferMapProperty buffermapproperty, DateDeserializersCalendarDeserializer dateDeserializersCalendarDeserializer, UUID uuid, boolean z, DateDeserializers dateDeserializers) {
        super(view.getContext(), null, 0, 6, null);
        this.read = getcreatedondatems;
        this.AudioAttributesCompatParcelizer = withdateformat;
        this.testTag = str;
        this.RemoteActionCompatParcelizer = view;
        this.IconCompatParcelizer = z;
        this.write = dateDeserializers;
        Object systemService = view.getContext().getSystemService("window");
        toMagicModuleMetaRepoModel.read(systemService, "");
        this.AudioAttributesImplBaseParcelizer = (WindowManager) systemService;
        this.MediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatItemReceiver();
        this.positionProvider = dateDeserializersCalendarDeserializer;
        this.parentLayoutDirection = tryToResolveUnresolved.write;
        this.popupContentSize = available.RemoteActionCompatParcelizer$default(null, null, 2, null);
        this.MediaBrowserCompatItemReceiver = available.RemoteActionCompatParcelizer$default(null, null, 2, null);
        this.AudioAttributesImplApi26Parcelizer = _qbuf.RemoteActionCompatParcelizer(new AnonymousClass4());
        float fIconCompatParcelizer = assignParameter.IconCompatParcelizer(8.0f);
        this.RatingCompat = fIconCompatParcelizer;
        this.MediaBrowserCompatMediaItem = new Rect();
        this.MediaMetadataCompat = new g0(new AnonymousClass1());
        setId(R.id.content);
        PopupLayout popupLayout = this;
        isCreatorVisible.IconCompatParcelizer(popupLayout, isCreatorVisible.write(view));
        isFieldVisible.AudioAttributesCompatParcelizer(popupLayout, isFieldVisible.write(view));
        setCenterTextRadiusPercent.read(popupLayout, setCenterTextRadiusPercent.IconCompatParcelizer(view));
        setTag(_handleApos.AudioAttributesCompatParcelizer.compose_view_saveable_id_tag, "Popup:".concat(String.valueOf(uuid)));
        setClipChildren(false);
        setElevation(buffermapproperty.AudioAttributesCompatParcelizer(fIconCompatParcelizer));
        setOutlineProvider(new ViewOutlineProvider() { // from class: androidx.compose.ui.window.PopupLayout.5
            @Override // android.view.ViewOutlineProvider
            public final void getOutline(View p0, Outline p1) {
                p1.setRect(0, 0, p0.getWidth(), p0.getHeight());
                p1.setAlpha(BitmapDescriptorFactory.HUE_RED);
            }
        });
        this.MediaDescriptionCompat = available.RemoteActionCompatParcelizer$default(push.write.read(), null, 2, null);
        this.onCustomAction = new int[2];
    }

    public final DateDeserializersCalendarDeserializer getPositionProvider() {
        return this.positionProvider;
    }

    public final void setPositionProvider(DateDeserializersCalendarDeserializer dateDeserializersCalendarDeserializer) {
        this.positionProvider = dateDeserializersCalendarDeserializer;
    }

    public final tryToResolveUnresolved getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    public final void setParentLayoutDirection(tryToResolveUnresolved trytoresolveunresolved) {
        this.parentLayoutDirection = trytoresolveunresolved;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final getKey m5getPopupContentSizebOM6tXw() {
        return (getKey) this.popupContentSize.getRemoteActionCompatParcelizer();
    }

    /* JADX INFO: renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m6setPopupContentSizefhxjrPA(getKey getkey) {
        this.popupContentSize.write(getkey);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final isAbstract RatingCompat() {
        return (isAbstract) this.MediaBrowserCompatItemReceiver.getRemoteActionCompatParcelizer();
    }

    private final void write(isAbstract isabstract) {
        this.MediaBrowserCompatItemReceiver.write(isabstract);
    }

    /* JADX INFO: renamed from: androidx.compose.ui.window.PopupLayout$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AudioAttributesCompatParcelizer", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getCreatedOnDateMs<Boolean> {
        @Override // kotlin.getCreatedOnDateMs
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke() {
            isAbstract isabstractRatingCompat = PopupLayout.this.RatingCompat();
            if (isabstractRatingCompat == null || !isabstractRatingCompat.MediaBrowserCompatItemReceiver()) {
                isabstractRatingCompat = null;
            }
            return Boolean.valueOf((isabstractRatingCompat == null || PopupLayout.this.m5getPopupContentSizebOM6tXw() == null) ? false : true);
        }

        AnonymousClass4() {
            super(0);
        }
    }

    public final boolean read() {
        return ((Boolean) this.AudioAttributesImplApi26Parcelizer.getRemoteActionCompatParcelizer()).booleanValue();
    }

    /* JADX INFO: renamed from: androidx.compose.ui.window.PopupLayout$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u00012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/Function0;", "", "p0", "read", "(Lo/getCreatedOnDateMs;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<getCreatedOnDateMs<? extends getShowPopup>, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(getCreatedOnDateMs<? extends getShowPopup> getcreatedondatems) {
            read(getcreatedondatems);
            return getShowPopup.INSTANCE;
        }

        public final void read(final getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
            Handler handler = PopupLayout.this.getHandler();
            if ((handler != null ? handler.getLooper() : null) == Looper.myLooper()) {
                getcreatedondatems.invoke();
                return;
            }
            Handler handler2 = PopupLayout.this.getHandler();
            if (handler2 != null) {
                handler2.post(new Runnable() { // from class: o.getContentDeserializer
                    @Override // java.lang.Runnable
                    public final void run() {
                        PopupLayout.AnonymousClass1.RemoteActionCompatParcelizer(getcreatedondatems);
                    }
                });
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void RemoteActionCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
            getcreatedondatems.invoke();
        }

        AnonymousClass1() {
            super(1);
        }
    }

    private final void AudioAttributesCompatParcelizer(MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody) {
        this.MediaDescriptionCompat.write(magicModuleSubmissionRequestBody);
    }

    private final MagicModuleSubmissionRequestBody<_handleUnrecognizedCharacterEscape, Integer, getShowPopup> MediaMetadataCompat() {
        return (MagicModuleSubmissionRequestBody) this.MediaDescriptionCompat.getRemoteActionCompatParcelizer();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    /* JADX INFO: renamed from: write, reason: from getter */
    public final boolean getAudioAttributesImplBaseParcelizer() {
        return this.onAddQueueItem;
    }

    public final void AudioAttributesImplApi26Parcelizer() {
        this.AudioAttributesImplBaseParcelizer.addView(this, this.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final void setContent(convertNumberToLong p0, MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> p1) {
        setParentCompositionContext(p0);
        AudioAttributesCompatParcelizer(p1);
        this.onAddQueueItem = true;
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void IconCompatParcelizer(_handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-857613600);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(this) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-857613600, i2, -1, "androidx.compose.ui.window.PopupLayout.Content (AndroidPopup.android.kt:591)");
            }
            MediaMetadataCompat().invoke(_handleunrecognizedcharacterescapeWrite, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new IconCompatParcelizer(i));
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.MediaMetadataCompat.AudioAttributesCompatParcelizer();
        MediaBrowserCompatMediaItem();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.MediaMetadataCompat.read();
        this.MediaMetadataCompat.RemoteActionCompatParcelizer();
        MediaBrowserCompatSearchResultReceiver();
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void write(int p0, int p1) {
        if (this.AudioAttributesCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver()) {
            super.write(p0, p1);
        } else {
            appendReferring appendreferringMediaDescriptionCompat = MediaDescriptionCompat();
            super.write(View.MeasureSpec.makeMeasureSpec(appendreferringMediaDescriptionCompat.MediaBrowserCompatItemReceiver(), Integer.MIN_VALUE), View.MeasureSpec.makeMeasureSpec(appendreferringMediaDescriptionCompat.IconCompatParcelizer(), Integer.MIN_VALUE));
        }
    }

    @Override // androidx.compose.ui.platform.AbstractComposeView
    public final void write(boolean p0, int p1, int p2, int p3, int p4) {
        View childAt;
        super.write(p0, p1, p2, p3, p4);
        if (this.AudioAttributesCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver() || (childAt = getChildAt(0)) == null) {
            return;
        }
        ((ViewGroup.LayoutParams) this.MediaBrowserCompatCustomActionResultReceiver).width = childAt.getMeasuredWidth();
        ((ViewGroup.LayoutParams) this.MediaBrowserCompatCustomActionResultReceiver).height = childAt.getMeasuredHeight();
        this.write.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this, this.MediaBrowserCompatCustomActionResultReceiver);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(KeyEvent p0) {
        if (!this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer()) {
            return super.dispatchKeyEvent(p0);
        }
        if (p0.getKeyCode() == 4 || p0.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(p0);
            }
            if (p0.getAction() == 0 && p0.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(p0, this);
                return true;
            }
            if (p0.getAction() == 1 && keyDispatcherState.isTracking(p0) && !p0.isCanceled()) {
                getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.read;
                if (getcreatedondatems != null) {
                    getcreatedondatems.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(p0);
    }

    private final void MediaBrowserCompatMediaItem() {
        if (!this.AudioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer() || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.MediaBrowserCompatSearchResultReceiver == null) {
            this.MediaBrowserCompatSearchResultReceiver = CollectionDeserializer.ci_(this.read);
        }
        CollectionDeserializer.AudioAttributesCompatParcelizer(this, this.MediaBrowserCompatSearchResultReceiver);
    }

    private final void MediaBrowserCompatSearchResultReceiver() {
        if (Build.VERSION.SDK_INT >= 33) {
            CollectionDeserializer.write(this, this.MediaBrowserCompatSearchResultReceiver);
        }
        this.MediaBrowserCompatSearchResultReceiver = null;
    }

    public final void write(getCreatedOnDateMs<getShowPopup> p0, withDateFormat p1, String p2, tryToResolveUnresolved p3) {
        this.read = p0;
        this.testTag = p2;
        write(p1);
        write(p3);
    }

    private final void write(withDateFormat p0) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, p0)) {
            return;
        }
        if (p0.getMediaBrowserCompatCustomActionResultReceiver() && !this.AudioAttributesCompatParcelizer.getMediaBrowserCompatCustomActionResultReceiver()) {
            ((ViewGroup.LayoutParams) this.MediaBrowserCompatCustomActionResultReceiver).width = -2;
            ((ViewGroup.LayoutParams) this.MediaBrowserCompatCustomActionResultReceiver).height = -2;
        }
        this.AudioAttributesCompatParcelizer = p0;
        this.MediaBrowserCompatCustomActionResultReceiver.flags = popOrNull.read(p0, popOrNull.IconCompatParcelizer(this.RemoteActionCompatParcelizer));
        this.write.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this, this.MediaBrowserCompatCustomActionResultReceiver);
    }

    public final void AudioAttributesCompatParcelizer(isAbstract p0) {
        write(p0);
        AudioAttributesImplApi21Parcelizer();
    }

    public final void AudioAttributesImplBaseParcelizer() {
        if (isAttachedToWindow()) {
            int[] iArr = this.onCustomAction;
            int i = iArr[0];
            int i2 = iArr[1];
            this.RemoteActionCompatParcelizer.getLocationOnScreen(iArr);
            int[] iArr2 = this.onCustomAction;
            if (i == iArr2[0] && i2 == iArr2[1]) {
                return;
            }
            AudioAttributesImplApi21Parcelizer();
        }
    }

    public final void AudioAttributesImplApi21Parcelizer() {
        long jAudioAttributesImplApi26Parcelizer;
        isAbstract isabstractRatingCompat = RatingCompat();
        if (isabstractRatingCompat != null) {
            if (!isabstractRatingCompat.MediaBrowserCompatItemReceiver()) {
                isabstractRatingCompat = null;
            }
            if (isabstractRatingCompat != null) {
                long jWrite = isabstractRatingCompat.write();
                if (this.IconCompatParcelizer) {
                    jAudioAttributesImplApi26Parcelizer = hasRawClass.MediaBrowserCompatCustomActionResultReceiver(isabstractRatingCompat);
                } else {
                    jAudioAttributesImplApi26Parcelizer = hasRawClass.AudioAttributesImplApi26Parcelizer(isabstractRatingCompat);
                }
                long j = -1;
                appendReferring appendreferringRemoteActionCompatParcelizer = ReadableObjectId.RemoteActionCompatParcelizer(hasReferringProperties.read((((long) Math.round(Float.intBitsToFloat((int) (jAudioAttributesImplApi26Parcelizer >> 32)))) << 32) | (((((long) 0) << 32) | (j - ((j >> 63) << 32))) & ((long) Math.round(Float.intBitsToFloat((int) jAudioAttributesImplApi26Parcelizer))))), jWrite);
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(appendreferringRemoteActionCompatParcelizer, this.AudioAttributesImplApi21Parcelizer)) {
                    return;
                }
                this.AudioAttributesImplApi21Parcelizer = appendreferringRemoteActionCompatParcelizer;
                MediaBrowserCompatCustomActionResultReceiver();
            }
        }
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        getKey getkeyM5getPopupContentSizebOM6tXw;
        appendReferring appendreferring = this.AudioAttributesImplApi21Parcelizer;
        if (appendreferring == null || (getkeyM5getPopupContentSizebOM6tXw = m5getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        long remoteActionCompatParcelizer = getkeyM5getPopupContentSizebOM6tXw.getRemoteActionCompatParcelizer();
        appendReferring appendreferringMediaDescriptionCompat = MediaDescriptionCompat();
        long j = -1;
        long j2 = getKey.read((((long) appendreferringMediaDescriptionCompat.MediaBrowserCompatItemReceiver()) << 32) | (((long) appendreferringMediaDescriptionCompat.IconCompatParcelizer()) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))));
        MagicModuleUseCaseImplWhenMappings.read readVar = new MagicModuleUseCaseImplWhenMappings.read();
        readVar.IconCompatParcelizer = hasReferringProperties.INSTANCE.write();
        this.MediaMetadataCompat.IconCompatParcelizer(this, read, new AnonymousClass2(readVar, this, appendreferring, j2, remoteActionCompatParcelizer));
        this.MediaBrowserCompatCustomActionResultReceiver.x = hasReferringProperties.IconCompatParcelizer(readVar.IconCompatParcelizer);
        this.MediaBrowserCompatCustomActionResultReceiver.y = hasReferringProperties.AudioAttributesCompatParcelizer(readVar.IconCompatParcelizer);
        if (this.AudioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()) {
            this.write.write(this, (int) (j2 >> 32), (int) j2);
        }
        this.write.IconCompatParcelizer(this.AudioAttributesImplBaseParcelizer, this, this.MediaBrowserCompatCustomActionResultReceiver);
    }

    /* JADX INFO: renamed from: androidx.compose.ui.window.PopupLayout$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "read", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        final /* synthetic */ appendReferring $IconCompatParcelizer;
        final /* synthetic */ long $RemoteActionCompatParcelizer;
        final /* synthetic */ long $read;
        final /* synthetic */ MagicModuleUseCaseImplWhenMappings.read $write;
        final /* synthetic */ PopupLayout AudioAttributesCompatParcelizer;

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            read();
            return getShowPopup.INSTANCE;
        }

        public final void read() {
            this.$write.IconCompatParcelizer = this.AudioAttributesCompatParcelizer.getPositionProvider().AudioAttributesCompatParcelizer(this.$IconCompatParcelizer, this.$read, this.AudioAttributesCompatParcelizer.getParentLayoutDirection(), this.$RemoteActionCompatParcelizer);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(MagicModuleUseCaseImplWhenMappings.read readVar, PopupLayout popupLayout, appendReferring appendreferring, long j, long j2) {
            super(0);
            this.$write = readVar;
            this.AudioAttributesCompatParcelizer = popupLayout;
            this.$IconCompatParcelizer = appendreferring;
            this.$read = j;
            this.$RemoteActionCompatParcelizer = j2;
        }
    }

    public final void AudioAttributesCompatParcelizer() {
        PopupLayout popupLayout = this;
        isCreatorVisible.IconCompatParcelizer(popupLayout, null);
        this.AudioAttributesImplBaseParcelizer.removeViewImmediate(popupLayout);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent p0) {
        if (!this.AudioAttributesCompatParcelizer.getRead()) {
            return super.onTouchEvent(p0);
        }
        if (p0 != null && p0.getAction() == 0 && (p0.getX() < BitmapDescriptorFactory.HUE_RED || p0.getX() >= getWidth() || p0.getY() < BitmapDescriptorFactory.HUE_RED || p0.getY() >= getHeight())) {
            getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.read;
            if (getcreatedondatems != null) {
                getcreatedondatems.invoke();
            }
            return true;
        }
        if (p0 != null && p0.getAction() == 4) {
            getCreatedOnDateMs<getShowPopup> getcreatedondatems2 = this.read;
            if (getcreatedondatems2 != null) {
                getcreatedondatems2.invoke();
            }
            return true;
        }
        return super.onTouchEvent(p0);
    }

    private final void write(tryToResolveUnresolved p0) {
        int i = WhenMappings.write[p0.ordinal()];
        int i2 = 1;
        if (i == 1) {
            i2 = 0;
        } else if (i != 2) {
            throw new RenewEligibleCreator();
        }
        super.setLayoutDirection(i2);
    }

    private final WindowManager.LayoutParams MediaBrowserCompatItemReceiver() {
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = popOrNull.read(this.AudioAttributesCompatParcelizer, popOrNull.IconCompatParcelizer(this.RemoteActionCompatParcelizer));
        layoutParams.type = 1002;
        layoutParams.token = this.RemoteActionCompatParcelizer.getApplicationWindowToken();
        ((ViewGroup.LayoutParams) layoutParams).width = -2;
        ((ViewGroup.LayoutParams) layoutParams).height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(this.RemoteActionCompatParcelizer.getContext().getResources().getString(_handleApos.IconCompatParcelizer.default_popup_window_title));
        return layoutParams;
    }

    private final appendReferring MediaDescriptionCompat() {
        Rect rect = this.MediaBrowserCompatMediaItem;
        this.write.write(this.RemoteActionCompatParcelizer, rect);
        return popOrNull.IconCompatParcelizer(rect);
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b"}, d2 = {"Landroidx/compose/ui/window/PopupLayout$AudioAttributesCompatParcelizer;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/window/PopupLayout;", "", "read", "Lo/getAnswerMap;", "IconCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class AudioAttributesCompatParcelizer {
        private AudioAttributesCompatParcelizer() {
        }

        public /* synthetic */ AudioAttributesCompatParcelizer(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.window.PopupLayout$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/window/PopupLayout;", "p0", "", "RemoteActionCompatParcelizer", "(Landroidx/compose/ui/window/PopupLayout;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<PopupLayout, getShowPopup> {
        public static final AnonymousClass3 write = new AnonymousClass3();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(PopupLayout popupLayout) {
            RemoteActionCompatParcelizer(popupLayout);
            return getShowPopup.INSTANCE;
        }

        public final void RemoteActionCompatParcelizer(PopupLayout popupLayout) {
            if (popupLayout.isAttachedToWindow()) {
                popupLayout.MediaBrowserCompatCustomActionResultReceiver();
            }
        }

        AnonymousClass3() {
            super(1);
        }
    }
}
