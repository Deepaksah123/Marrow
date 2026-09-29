package androidx.compose.ui.tooling;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.DashPathEffect;
import android.graphics.Paint;
import android.graphics.Rect;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.tooling.ComposeViewAdapter;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.CoercionInputShape;
import kotlin.ContentReference;
import kotlin.FastIntegerMathUInt128;
import kotlin.IntermediateLoginResponseBody;
import kotlin.JavaUtilCollectionsDeserializers;
import kotlin.JsonReadContext;
import kotlin.JsonReadFeature;
import kotlin.MagicModuleRepositoryImpl_Factory;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MagicModuleUseCaseDefaultImpls;
import kotlin.MediaSessionCompatQueueItem;
import kotlin.Metadata;
import kotlin.ObjectIdReferenceProperty;
import kotlin.ObjectIdValueProperty;
import kotlin.PieChart;
import kotlin.PlaybackStateCompat;
import kotlin.PropertyBasedCreatorCaseInsensitiveMap;
import kotlin.PropertyBasedObjectIdGenerator;
import kotlin.PropertyValueMap;
import kotlin.RequestPayload;
import kotlin.StreamReadException;
import kotlin.TestGroupLSModel;
import kotlin.TypeResolutionContext;
import kotlin._appendEscaped;
import kotlin._checkFloatToStringCoercion;
import kotlin._deserializeMissingToken;
import kotlin._handleUnrecognizedCharacterEscape;
import kotlin._init_lambda3;
import kotlin._reportMissingSetter;
import kotlin._validJsonValueList;
import kotlin.accessaddObserverForBackInvoker;
import kotlin.addExternal;
import kotlin.addStringCreator;
import kotlin.anyIgnorals;
import kotlin.appendReferring;
import kotlin.complete;
import kotlin.deserializeAndSet;
import kotlin.findImplicitParamName;
import kotlin.getAnswerMap;
import kotlin.getCreatedOnDateMs;
import kotlin.getCreatorIndex;
import kotlin.getDefaultNullValueSerializer;
import kotlin.getMagicModuleStat;
import kotlin.getModuleData;
import kotlin.getSetterUnchecked;
import kotlin.getShowPopup;
import kotlin.getTypeProperty;
import kotlin.handleTypePropertyValue;
import kotlin.hasDefaultCreator;
import kotlin.hasDelegatingCreator;
import kotlin.hasMixIns;
import kotlin.injection;
import kotlin.isCreatorVisible;
import kotlin.isEnumImplType;
import kotlin.isFieldVisible;
import kotlin.multiplyFft;
import kotlin.onSetRating;
import kotlin.onSetShuffleMode;
import kotlin.parseDigitsRecursive;
import kotlin.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
import kotlin.releaseNameCopyBuffer;
import kotlin.resetAsNaN;
import kotlin.setCenterTextRadiusPercent;
import kotlin.setCurrentName;
import kotlin.setOnChartValueSelectedListener;
import kotlin.setRenderer;
import kotlin.startBuilding;
import kotlin.switchToNext;
import kotlin.toMagicModuleMetaRepoModel;

/* JADX INFO: loaded from: classes4.dex */
@Metadata(d1 = {"\u0000Ä\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\u0006\u0010\nJ=\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\f2\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u000e0\r2\u000e\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J7\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u00152\u0006\u0010\u0005\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\u000f\u001a\u00020\b2\u0006\u0010\u0016\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0019\u0010\u0014J\u000f\u0010\u001a\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u0014J\u000f\u0010\u0010\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0010\u0010\u0014J\u0013\u0010\u001c\u001a\u00020\u0015*\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u001d\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\u001b2\u0006\u0010\u0003\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u0015\u0010\u001c\u001a\u0004\u0018\u00010#*\u00020\"H\u0002¢\u0006\u0004\b\u001c\u0010$J%\u0010 \u001a\u0004\u0018\u00010\u001f*\u00020\"2\u0006\u0010\u0003\u001a\u00020\b2\u0006\u0010\u0005\u001a\u00020\bH\u0002¢\u0006\u0004\b \u0010%J\u0017\u0010'\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020&H\u0014¢\u0006\u0004\b'\u0010(J\u001d\u0010\u0010\u001a\u00020\u00122\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00120)H\u0002¢\u0006\u0004\b\u0010\u0010*J\u0095\u0001\u0010\u0010\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u001f2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\n\b\u0001\u0012\u0006\u0012\u0002\b\u00030,\u0018\u00010+2\b\b\u0002\u0010\u000f\u001a\u00020\b2\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010-\u001a\u00020\u00152\b\b\u0002\u0010/\u001a\u00020.2\b\b\u0002\u00100\u001a\u00020\u00152\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u001f2\u000e\b\u0002\u00102\u001a\b\u0012\u0004\u0012\u00020\u00120)2\u000e\b\u0002\u00103\u001a\b\u0012\u0004\u0012\u00020\u00120)H\u0000¢\u0006\u0004\b\u0010\u00104J\u0017\u0010\u001a\u001a\u00020\u00122\u0006\u0010\u0003\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u001a\u00105R\u0014\u0010\u0010\u001a\u00020\u001f8\u0002X\u0083D¢\u0006\u0006\n\u0004\b\u0010\u00106R\u0014\u0010 \u001a\u0002078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0016\u0010\u001c\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u0016\u0010\u001a\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b<\u0010;R(\u0010=\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b=\u0010>\u001a\u0004\b?\u0010@\"\u0004\bA\u0010BR(\u0010C\u001a\b\u0012\u0004\u0012\u00020\u001f0\r8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bC\u0010>\u001a\u0004\bD\u0010@\"\u0004\bE\u0010BR\u0014\u0010I\u001a\u00020F8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bG\u0010HR\u0016\u0010:\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bJ\u00106R\u0016\u0010<\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bK\u0010;R\u0014\u00108\u001a\u00020L8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bM\u0010NR\u001c\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u0010PR\u0016\u0010J\u001a\u00020\u00158\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bQ\u0010;R\u0016\u0010R\u001a\u00020\u001f8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bR\u00106R\u001c\u0010S\u001a\b\u0012\u0004\u0012\u00020\u00120)8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bS\u0010TR\u0014\u0010K\u001a\u00020U8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010VR\"\u0010X\u001a\u00020W8\u0001@\u0001X\u0081.¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u0014\u0010M\u001a\u00020^8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bI\u0010_R\u0014\u0010Q\u001a\u00020`8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010aR\u0014\u0010d\u001a\u00020b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010cR\u0014\u0010g\u001a\u00020e8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010f"}, d2 = {"Landroidx/compose/ui/tooling/ComposeViewAdapter;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "p0", "Landroid/util/AttributeSet;", "p1", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "", "p2", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lo/JsonReadFeature;", "Lo/PropertyBasedObjectIdGenerator;", "", "Lo/complete;", "p3", "write", "(Lo/JsonReadFeature;Lo/PropertyBasedObjectIdGenerator;Ljava/util/List;Ljava/util/List;)Lo/complete;", "", "AudioAttributesImplApi21Parcelizer", "()V", "", "p4", "onLayout", "(ZIIII)V", "onAttachedToWindow", "IconCompatParcelizer", "Lo/ObjectIdReferenceProperty;", "read", "(Lo/ObjectIdReferenceProperty;)Z", "Lo/appendReferring;", "", "RemoteActionCompatParcelizer", "(Lo/ObjectIdReferenceProperty;Lo/appendReferring;)Ljava/lang/String;", "", "Ljava/lang/reflect/Method;", "(Ljava/lang/Object;)Ljava/lang/reflect/Method;", "(Ljava/lang/Object;II)Ljava/lang/String;", "Landroid/graphics/Canvas;", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "Lkotlin/Function0;", "(Lo/MagicModuleSubmissionRequestBody;Lo/_handleUnrecognizedCharacterEscape;I)V", "Ljava/lang/Class;", "Lo/PropertyValueMap;", "p5", "", "p6", "p7", "p8", "p9", "p10", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Class;IZZJZLjava/lang/String;Lo/getCreatedOnDateMs;Lo/getCreatedOnDateMs;)V", "(Landroid/util/AttributeSet;)V", "Ljava/lang/String;", "Landroidx/compose/ui/platform/ComposeView;", "MediaBrowserCompatItemReceiver", "Landroidx/compose/ui/platform/ComposeView;", "AudioAttributesImplBaseParcelizer", "Z", "AudioAttributesImplApi26Parcelizer", "viewInfos", "Ljava/util/List;", "getViewInfos$ui_tooling", "()Ljava/util/List;", "setViewInfos$ui_tooling", "(Ljava/util/List;)V", "designInfoList", "getDesignInfoList$ui_tooling", "setDesignInfoList$ui_tooling", "Lo/hasDelegatingCreator;", "onCustomAction", "Lo/hasDelegatingCreator;", "AudioAttributesCompatParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "MediaBrowserCompatMediaItem", "Lo/handleTypePropertyValue;", "MediaBrowserCompatSearchResultReceiver", "Lo/handleTypePropertyValue;", "onAddQueueItem", "Lo/MagicModuleSubmissionRequestBody;", "MediaMetadataCompat", "RatingCompat", "MediaDescriptionCompat", "Lo/getCreatedOnDateMs;", "Landroid/graphics/Paint;", "Landroid/graphics/Paint;", "Lo/JavaUtilCollectionsDeserializers;", "clock", "Lo/JavaUtilCollectionsDeserializers;", "getClock$ui_tooling", "()Lo/JavaUtilCollectionsDeserializers;", "setClock$ui_tooling", "(Lo/JavaUtilCollectionsDeserializers;)V", "Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;", "Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;", "Landroidx/compose/ui/tooling/ComposeViewAdapter$IconCompatParcelizer;", "Landroidx/compose/ui/tooling/ComposeViewAdapter$IconCompatParcelizer;", "Landroidx/compose/ui/tooling/ComposeViewAdapter$read;", "Landroidx/compose/ui/tooling/ComposeViewAdapter$read;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Landroidx/compose/ui/tooling/ComposeViewAdapter$write;", "Landroidx/compose/ui/tooling/ComposeViewAdapter$write;", "onCommand"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class ComposeViewAdapter extends FrameLayout {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    private final AudioAttributesCompatParcelizer MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final Paint MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private boolean IconCompatParcelizer;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private boolean read;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private final write onCommand;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private String AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private final ComposeView RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final handleTypePropertyValue MediaBrowserCompatItemReceiver;
    private getCreatedOnDateMs<getShowPopup> MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private boolean MediaBrowserCompatCustomActionResultReceiver;
    private String RatingCompat;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private final IconCompatParcelizer MediaMetadataCompat;
    public JavaUtilCollectionsDeserializers clock;
    private List<String> designInfoList;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final hasDelegatingCreator AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    private final read MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private List<complete> viewInfos;
    private final String write;

    /* JADX INFO: Access modifiers changed from: private */
    public static final complete read(setCurrentName setcurrentname, complete completeVar, List list) {
        return completeVar;
    }

    public final List<complete> getViewInfos$ui_tooling() {
        return this.viewInfos;
    }

    public final void setViewInfos$ui_tooling(List<complete> list) {
        this.viewInfos = list;
    }

    public final List<String> getDesignInfoList$ui_tooling() {
        return this.designInfoList;
    }

    public final void setDesignInfoList$ui_tooling(List<String> list) {
        this.designInfoList = list;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatItemReceiver() {
        return getShowPopup.INSTANCE;
    }

    public ComposeViewAdapter(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.write = "ComposeViewAdapter";
        this.RemoteActionCompatParcelizer = new ComposeView(getContext(), null, 0, 6, null);
        this.viewInfos = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        this.designInfoList = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        this.AudioAttributesCompatParcelizer = hasDelegatingCreator.INSTANCE.IconCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer = "";
        this.MediaBrowserCompatItemReceiver = new handleTypePropertyValue();
        this.AudioAttributesImplApi21Parcelizer = findImplicitParamName.read.IconCompatParcelizer();
        this.RatingCompat = "";
        this.MediaDescriptionCompat = new getCreatedOnDateMs() { // from class: o._computeDelegateType
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return ComposeViewAdapter.MediaBrowserCompatItemReceiver();
            }
        };
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, BitmapDescriptorFactory.HUE_RED));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(RequestPayload.IconCompatParcelizer(switchToNext.INSTANCE.read()));
        this.MediaBrowserCompatMediaItem = paint;
        this.MediaBrowserCompatSearchResultReceiver = new AudioAttributesCompatParcelizer();
        this.MediaMetadataCompat = new IconCompatParcelizer();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new read();
        this.onCommand = new write();
        IconCompatParcelizer(attributeSet);
    }

    public ComposeViewAdapter(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.write = "ComposeViewAdapter";
        this.RemoteActionCompatParcelizer = new ComposeView(getContext(), null, 0, 6, null);
        this.viewInfos = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        this.designInfoList = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        this.AudioAttributesCompatParcelizer = hasDelegatingCreator.INSTANCE.IconCompatParcelizer();
        this.AudioAttributesImplBaseParcelizer = "";
        this.MediaBrowserCompatItemReceiver = new handleTypePropertyValue();
        this.AudioAttributesImplApi21Parcelizer = findImplicitParamName.read.IconCompatParcelizer();
        this.RatingCompat = "";
        this.MediaDescriptionCompat = new getCreatedOnDateMs() { // from class: o._computeDelegateType
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return ComposeViewAdapter.MediaBrowserCompatItemReceiver();
            }
        };
        Paint paint = new Paint();
        paint.setPathEffect(new DashPathEffect(new float[]{5.0f, 10.0f, 15.0f, 20.0f}, BitmapDescriptorFactory.HUE_RED));
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(RequestPayload.IconCompatParcelizer(switchToNext.INSTANCE.read()));
        this.MediaBrowserCompatMediaItem = paint;
        this.MediaBrowserCompatSearchResultReceiver = new AudioAttributesCompatParcelizer();
        this.MediaMetadataCompat = new IconCompatParcelizer();
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new read();
        this.onCommand = new write();
        IconCompatParcelizer(attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final complete write(JsonReadFeature p0, PropertyBasedObjectIdGenerator p1, List<complete> p2, List<complete> p3) {
        String audioAttributesCompatParcelizer;
        if (p3 != null) {
            p2 = IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) p2, (Iterable) p3);
        }
        List<complete> list = p2;
        PropertyBasedCreatorCaseInsensitiveMap propertyBasedCreatorCaseInsensitiveMapWrite = p1.write();
        if (propertyBasedCreatorCaseInsensitiveMapWrite == null || (audioAttributesCompatParcelizer = propertyBasedCreatorCaseInsensitiveMapWrite.getAudioAttributesCompatParcelizer()) == null) {
            audioAttributesCompatParcelizer = "";
        }
        String str = audioAttributesCompatParcelizer;
        PropertyBasedCreatorCaseInsensitiveMap propertyBasedCreatorCaseInsensitiveMapWrite2 = p1.write();
        int write2 = propertyBasedCreatorCaseInsensitiveMapWrite2 != null ? propertyBasedCreatorCaseInsensitiveMapWrite2.getWrite() : -1;
        appendReferring audioAttributesImplApi21Parcelizer = p1.getAudioAttributesImplApi21Parcelizer();
        PropertyBasedCreatorCaseInsensitiveMap propertyBasedCreatorCaseInsensitiveMapWrite3 = p1.write();
        Object objIconCompatParcelizer = p0.IconCompatParcelizer();
        return new complete(str, write2, audioAttributesImplApi21Parcelizer, propertyBasedCreatorCaseInsensitiveMapWrite3, list, objIconCompatParcelizer instanceof isEnumImplType ? (isEnumImplType) objIconCompatParcelizer : null, p1.IconCompatParcelizer());
    }

    private final void AudioAttributesImplApi21Parcelizer() {
        List<complete> listIconCompatParcelizer$default = ObjectIdValueProperty.IconCompatParcelizer$default(this.AudioAttributesCompatParcelizer.write(), new getAnswerMap() { // from class: o.addBigDecimalCreator
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return ComposeViewAdapter.read((setCurrentName) obj);
            }
        }, new AudioAttributesImplBaseParcelizer(this), new getModuleData() { // from class: o.addBooleanCreator
            @Override // kotlin.getModuleData
            public final Object AudioAttributesCompatParcelizer(Object obj, Object obj2, Object obj3) {
                return ComposeViewAdapter.read((setCurrentName) obj, (complete) obj2, (List) obj3);
            }
        }, null, 8, null);
        this.viewInfos = listIconCompatParcelizer$default;
        if (this.read) {
            addExternal.AudioAttributesCompatParcelizer$default(listIconCompatParcelizer$default, 0, null, 3, null);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final /* synthetic */ class AudioAttributesImplBaseParcelizer extends MagicModuleRepositoryImpl_Factory implements getMagicModuleStat<JsonReadFeature, PropertyBasedObjectIdGenerator, List<? extends complete>, List<? extends complete>, complete> {
        @Override // kotlin.getMagicModuleStat
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final complete write(JsonReadFeature jsonReadFeature, PropertyBasedObjectIdGenerator propertyBasedObjectIdGenerator, List<complete> list, List<complete> list2) {
            return ((ComposeViewAdapter) this.AudioAttributesImplApi26Parcelizer).write(jsonReadFeature, propertyBasedObjectIdGenerator, list, list2);
        }

        AudioAttributesImplBaseParcelizer(Object obj) {
            super(4, obj, ComposeViewAdapter.class, "write", "write(Lo/JsonReadFeature;Lo/PropertyBasedObjectIdGenerator;Ljava/util/List;Ljava/util/List;)Lo/complete;", 0);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(setCurrentName setcurrentname) {
        return getShowPopup.INSTANCE;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected final void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
        super.onLayout(p0, p1, p2, p3, p4);
        this.MediaBrowserCompatItemReceiver.read();
        AudioAttributesImplApi21Parcelizer();
        if (this.AudioAttributesImplBaseParcelizer.length() > 0) {
            IconCompatParcelizer();
            if (this.MediaBrowserCompatCustomActionResultReceiver) {
                write();
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void onAttachedToWindow() {
        isCreatorVisible.IconCompatParcelizer(this.RemoteActionCompatParcelizer.getRootView(), this.MediaBrowserCompatSearchResultReceiver);
        super.onAttachedToWindow();
    }

    private final void IconCompatParcelizer() {
        Set<JsonReadContext> setWrite = this.AudioAttributesCompatParcelizer.write();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(setWrite, 10));
        Iterator<T> it = setWrite.iterator();
        while (it.hasNext()) {
            arrayList.add(startBuilding.IconCompatParcelizer((JsonReadContext) it.next()));
        }
        ArrayList arrayList2 = arrayList;
        boolean z = this.clock != null;
        getTypeProperty gettypeproperty = new getTypeProperty(new MagicModuleUseCaseDefaultImpls(this) { // from class: androidx.compose.ui.tooling.ComposeViewAdapter.RemoteActionCompatParcelizer
            @Override // kotlin.MagicModuleUseCaseDefaultImpls, kotlin.ResponseErrorCompanion
            public final Object read() {
                return ((ComposeViewAdapter) this.AudioAttributesImplApi26Parcelizer).getClock();
            }
        }, new MediaBrowserCompatItemReceiver(this));
        ArrayList arrayList3 = arrayList2;
        boolean zWrite = gettypeproperty.write(arrayList3);
        this.AudioAttributesImplApi26Parcelizer = zWrite;
        if (z && zWrite) {
            gettypeproperty.read(arrayList3);
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final /* synthetic */ class MediaBrowserCompatItemReceiver extends MagicModuleRepositoryImpl_Factory implements getCreatedOnDateMs<getShowPopup> {
        public final void AudioAttributesCompatParcelizer() {
            ((ComposeViewAdapter) this.AudioAttributesImplApi26Parcelizer).requestLayout();
        }

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            AudioAttributesCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatItemReceiver(Object obj) {
            super(0, obj, ComposeViewAdapter.class, "requestLayout", "requestLayout()V", 0);
        }
    }

    private final void write() {
        Set<JsonReadContext> setWrite = this.AudioAttributesCompatParcelizer.write();
        ArrayList arrayList = new ArrayList(IntermediateLoginResponseBody.RemoteActionCompatParcelizer(setWrite, 10));
        Iterator<T> it = setWrite.iterator();
        while (it.hasNext()) {
            arrayList.add(startBuilding.IconCompatParcelizer((JsonReadContext) it.next()));
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            List<ObjectIdReferenceProperty> listAudioAttributesCompatParcelizer = _deserializeMissingToken.AudioAttributesCompatParcelizer((ObjectIdReferenceProperty) it2.next(), new getAnswerMap() { // from class: o.addDoubleCreator
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return Boolean.valueOf(ComposeViewAdapter.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, (ObjectIdReferenceProperty) obj));
                }
            });
            ArrayList arrayList3 = new ArrayList();
            for (ObjectIdReferenceProperty objectIdReferenceProperty : listAudioAttributesCompatParcelizer) {
                String strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(objectIdReferenceProperty, objectIdReferenceProperty.getIconCompatParcelizer());
                if (strRemoteActionCompatParcelizer == null) {
                    Iterator<T> it3 = objectIdReferenceProperty.read().iterator();
                    while (true) {
                        if (!it3.hasNext()) {
                            strRemoteActionCompatParcelizer = null;
                            break;
                        }
                        String strRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer((ObjectIdReferenceProperty) it3.next(), objectIdReferenceProperty.getIconCompatParcelizer());
                        if (strRemoteActionCompatParcelizer2 != null) {
                            strRemoteActionCompatParcelizer = strRemoteActionCompatParcelizer2;
                            break;
                        }
                    }
                }
                if (strRemoteActionCompatParcelizer != null) {
                    arrayList3.add(strRemoteActionCompatParcelizer);
                }
            }
            IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList2, (Iterable) arrayList3);
        }
        this.designInfoList = arrayList2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean RemoteActionCompatParcelizer(ComposeViewAdapter composeViewAdapter, ObjectIdReferenceProperty objectIdReferenceProperty) {
        if (!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) objectIdReferenceProperty.getWrite(), (Object) "remember") && composeViewAdapter.read(objectIdReferenceProperty)) {
            return true;
        }
        Collection<ObjectIdReferenceProperty> collection = objectIdReferenceProperty.read();
        if ((collection instanceof Collection) && collection.isEmpty()) {
            return false;
        }
        for (ObjectIdReferenceProperty objectIdReferenceProperty2 : collection) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) objectIdReferenceProperty2.getWrite(), (Object) "remember") && composeViewAdapter.read(objectIdReferenceProperty2)) {
                return true;
            }
        }
        return false;
    }

    private final boolean read(ObjectIdReferenceProperty objectIdReferenceProperty) {
        Collection<Object> collectionRemoteActionCompatParcelizer = objectIdReferenceProperty.RemoteActionCompatParcelizer();
        if ((collectionRemoteActionCompatParcelizer instanceof Collection) && collectionRemoteActionCompatParcelizer.isEmpty()) {
            return false;
        }
        Iterator<T> it = collectionRemoteActionCompatParcelizer.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if ((next != null ? read(next) : null) != null) {
                return true;
            }
        }
        return false;
    }

    private final String RemoteActionCompatParcelizer(ObjectIdReferenceProperty objectIdReferenceProperty, appendReferring appendreferring) {
        String strRemoteActionCompatParcelizer;
        Iterator<T> it = objectIdReferenceProperty.RemoteActionCompatParcelizer().iterator();
        do {
            strRemoteActionCompatParcelizer = null;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (next != null) {
                strRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(next, appendreferring.getRead(), appendreferring.getAudioAttributesCompatParcelizer());
            }
        } while (strRemoteActionCompatParcelizer == null);
        return strRemoteActionCompatParcelizer;
    }

    private final Method read(Object obj) {
        try {
            return obj.getClass().getDeclaredMethod("getDesignInfo", Integer.TYPE, Integer.TYPE, String.class);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    private final String RemoteActionCompatParcelizer(Object obj, int i, int i2) {
        Method method = read(obj);
        if (method == null) {
            return null;
        }
        try {
            Object objInvoke = method.invoke(obj, Integer.valueOf(i), Integer.valueOf(i2), this.RatingCompat);
            toMagicModuleMetaRepoModel.read(objInvoke, "");
            String str = (String) objInvoke;
            if (str.length() == 0) {
                str = null;
            }
            return str;
        } catch (Exception unused) {
            return null;
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected final void dispatchDraw(Canvas p0) {
        super.dispatchDraw(p0);
        this.MediaDescriptionCompat.invoke();
        if (this.IconCompatParcelizer) {
            List<complete> list = this.viewInfos;
            ArrayList<complete> arrayList = new ArrayList();
            for (complete completeVar : list) {
                IntermediateLoginResponseBody.IconCompatParcelizer((Collection) arrayList, (Iterable) IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Collection) IntermediateLoginResponseBody.RemoteActionCompatParcelizer(completeVar), (Iterable) completeVar.write()));
            }
            for (complete completeVar2 : arrayList) {
                if (completeVar2.AudioAttributesImplApi21Parcelizer()) {
                    p0.drawRect(new Rect(completeVar2.getWrite().getRead(), completeVar2.getWrite().getWrite(), completeVar2.getWrite().getAudioAttributesCompatParcelizer(), completeVar2.getWrite().getIconCompatParcelizer()), this.MediaBrowserCompatMediaItem);
                }
            }
        }
    }

    /* JADX INFO: renamed from: getClock$ui_tooling, reason: from getter */
    public final JavaUtilCollectionsDeserializers getClock() {
        return this.clock;
    }

    public final void setClock$ui_tooling(JavaUtilCollectionsDeserializers javaUtilCollectionsDeserializers) {
        this.clock = javaUtilCollectionsDeserializers;
    }

    private final void write(final MagicModuleSubmissionRequestBody<? super _handleUnrecognizedCharacterEscape, ? super Integer, getShowPopup> magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, final int i) {
        int i2;
        _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescapeWrite = _handleunrecognizedcharacterescape.write(-265259911);
        if ((i & 6) == 0) {
            i2 = (_handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(magicModuleSubmissionRequestBody) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= _handleunrecognizedcharacterescapeWrite.IconCompatParcelizer(this) ? 32 : 16;
        }
        if (!_handleunrecognizedcharacterescapeWrite.RemoteActionCompatParcelizer((i2 & 19) != 18, i2 & 1)) {
            _handleunrecognizedcharacterescapeWrite.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-265259911, i2, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview (ComposeViewAdapter.android.kt:405)");
            }
            ContentReference<deserializeAndSet.RemoteActionCompatParcelizer> contentReferenceAudioAttributesCompatParcelizer = getDefaultNullValueSerializer.AudioAttributesImplApi21Parcelizer().AudioAttributesCompatParcelizer(new hasDefaultCreator(getContext()));
            ContentReference<_reportMissingSetter.write> contentReferenceAudioAttributesCompatParcelizer2 = getDefaultNullValueSerializer.AudioAttributesImplBaseParcelizer().AudioAttributesCompatParcelizer(getCreatorIndex.write(getContext()));
            MediaSessionCompatQueueItem mediaSessionCompatQueueItem = MediaSessionCompatQueueItem.INSTANCE;
            ContentReference<onSetShuffleMode> contentReference = MediaSessionCompatQueueItem.read(this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver);
            PlaybackStateCompat playbackStateCompat = PlaybackStateCompat.INSTANCE;
            resetAsNaN.AudioAttributesCompatParcelizer(new ContentReference[]{contentReferenceAudioAttributesCompatParcelizer, contentReferenceAudioAttributesCompatParcelizer2, contentReference, PlaybackStateCompat.AudioAttributesCompatParcelizer(this.onCommand)}, multiplyFft.AudioAttributesCompatParcelizer(-874838087, true, new MagicModuleSubmissionRequestBody() { // from class: o.addBigIntegerCreator
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeViewAdapter.read(this.IconCompatParcelizer, magicModuleSubmissionRequestBody, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescapeWrite, 54), _handleunrecognizedcharacterescapeWrite, ContentReference.write | 48);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        releaseNameCopyBuffer releasenamecopybufferMediaBrowserCompatSearchResultReceiver = _handleunrecognizedcharacterescapeWrite.MediaBrowserCompatSearchResultReceiver();
        if (releasenamecopybufferMediaBrowserCompatSearchResultReceiver != null) {
            releasenamecopybufferMediaBrowserCompatSearchResultReceiver.read(new MagicModuleSubmissionRequestBody() { // from class: o.CreatorCollector
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeViewAdapter.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, magicModuleSubmissionRequestBody, i, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup read(ComposeViewAdapter composeViewAdapter, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i & 3) != 2, i & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-874838087, i, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.WrapPreview.<anonymous> (ComposeViewAdapter.android.kt:416)");
            }
            addStringCreator.write(composeViewAdapter.AudioAttributesCompatParcelizer, magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, 0);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup AudioAttributesImplApi26Parcelizer() {
        return getShowPopup.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void write$default(ComposeViewAdapter composeViewAdapter, String str, String str2, Class cls, int i, boolean z, boolean z2, long j, boolean z3, String str3, getCreatedOnDateMs getcreatedondatems, getCreatedOnDateMs getcreatedondatems2, int i2, Object obj) {
        composeViewAdapter.write(str, str2, (i2 & 4) != 0 ? null : cls, (i2 & 8) != 0 ? 0 : i, (i2 & 16) != 0 ? false : z, (i2 & 32) != 0 ? false : z2, (i2 & 64) != 0 ? -1L : j, (i2 & 128) != 0 ? false : z3, (i2 & 256) != 0 ? null : str3, (i2 & 512) != 0 ? new getCreatedOnDateMs() { // from class: o.addIntCreator
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return ComposeViewAdapter.AudioAttributesImplApi26Parcelizer();
            }
        } : getcreatedondatems, (i2 & 1024) != 0 ? new getCreatedOnDateMs() { // from class: o.addPropertyCreator
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return ComposeViewAdapter.MediaBrowserCompatCustomActionResultReceiver();
            }
        } : getcreatedondatems2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup MediaBrowserCompatCustomActionResultReceiver() {
        return getShowPopup.INSTANCE;
    }

    public final void write(final String p0, final String p1, final Class<? extends PropertyValueMap<?>> p2, final int p3, boolean p4, boolean p5, final long p6, boolean p7, String p8, final getCreatedOnDateMs<getShowPopup> p9, getCreatedOnDateMs<getShowPopup> p10) {
        this.IconCompatParcelizer = p4;
        this.read = p5;
        this.AudioAttributesImplBaseParcelizer = p1;
        this.MediaBrowserCompatCustomActionResultReceiver = p7;
        this.RatingCompat = p8 == null ? "" : p8;
        this.MediaDescriptionCompat = p10;
        FastIntegerMathUInt128 fastIntegerMathUInt128IconCompatParcelizer = multiplyFft.IconCompatParcelizer(-658298446, true, new MagicModuleSubmissionRequestBody() { // from class: o._isEnumValueOf
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return ComposeViewAdapter.IconCompatParcelizer(p9, this, p0, p1, p2, p3, p6, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
            }
        });
        this.AudioAttributesImplApi21Parcelizer = fastIntegerMathUInt128IconCompatParcelizer;
        this.RemoteActionCompatParcelizer.setContent(fastIntegerMathUInt128IconCompatParcelizer);
        invalidate();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(getCreatedOnDateMs getcreatedondatems, final ComposeViewAdapter composeViewAdapter, final String str, final String str2, final Class cls, final int i, final long j, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-658298446, i2, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous> (ComposeViewAdapter.android.kt:465)");
            }
            StreamReadException.write(getcreatedondatems, _handleunrecognizedcharacterescape, 0);
            composeViewAdapter.write(multiplyFft.AudioAttributesCompatParcelizer(-1310372571, true, new MagicModuleSubmissionRequestBody() { // from class: o._reportDuplicateCreator
                @Override // kotlin.MagicModuleSubmissionRequestBody
                public final Object invoke(Object obj, Object obj2) {
                    return ComposeViewAdapter.IconCompatParcelizer(str, str2, cls, i, composeViewAdapter, j, (_handleUnrecognizedCharacterEscape) obj, ((Integer) obj2).intValue());
                }
            }, _handleunrecognizedcharacterescape, 54), _handleunrecognizedcharacterescape, 6);
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(final String str, final String str2, final Class cls, final int i, final ComposeViewAdapter composeViewAdapter, long j, final _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        if (!_handleunrecognizedcharacterescape.RemoteActionCompatParcelizer((i2 & 3) != 2, i2 & 1)) {
            _handleunrecognizedcharacterescape.onPrepareFromSearch();
        } else {
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesCompatParcelizer(-1310372571, i2, -1, "androidx.compose.ui.tooling.ComposeViewAdapter.init.<anonymous>.<anonymous> (ComposeViewAdapter.android.kt:468)");
            }
            boolean zAudioAttributesCompatParcelizer = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(str);
            boolean zAudioAttributesCompatParcelizer2 = _handleunrecognizedcharacterescape.AudioAttributesCompatParcelizer(str2);
            boolean zIconCompatParcelizer = _handleunrecognizedcharacterescape.IconCompatParcelizer(_handleunrecognizedcharacterescape);
            boolean zIconCompatParcelizer2 = _handleunrecognizedcharacterescape.IconCompatParcelizer(cls);
            boolean zRemoteActionCompatParcelizer = _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(i);
            boolean zIconCompatParcelizer3 = _handleunrecognizedcharacterescape.IconCompatParcelizer(composeViewAdapter);
            Object objOnPause = _handleunrecognizedcharacterescape.onPause();
            if ((zAudioAttributesCompatParcelizer | zAudioAttributesCompatParcelizer2 | zIconCompatParcelizer | zIconCompatParcelizer2 | zRemoteActionCompatParcelizer | zIconCompatParcelizer3) || objOnPause == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                objOnPause = new getCreatedOnDateMs() { // from class: o.addLongCreator
                    @Override // kotlin.getCreatedOnDateMs
                    public final Object invoke() {
                        return ComposeViewAdapter.write(str, str2, _handleunrecognizedcharacterescape, cls, i, composeViewAdapter);
                    }
                };
                _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause);
            }
            getCreatedOnDateMs getcreatedondatems = (getCreatedOnDateMs) objOnPause;
            if (j >= 0) {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-349877568);
                boolean zIconCompatParcelizer4 = _handleunrecognizedcharacterescape.IconCompatParcelizer(composeViewAdapter);
                Object objOnPause2 = _handleunrecognizedcharacterescape.onPause();
                if (zIconCompatParcelizer4 || objOnPause2 == _handleUnrecognizedCharacterEscape.INSTANCE.IconCompatParcelizer()) {
                    objOnPause2 = new getCreatedOnDateMs() { // from class: o.addDelegatingCreator
                        @Override // kotlin.getCreatedOnDateMs
                        public final Object invoke() {
                            return ComposeViewAdapter.write(this.AudioAttributesCompatParcelizer);
                        }
                    };
                    _handleunrecognizedcharacterescape.RemoteActionCompatParcelizer(objOnPause2);
                }
                composeViewAdapter.setClock$ui_tooling(new JavaUtilCollectionsDeserializers((getCreatedOnDateMs) objOnPause2));
            } else {
                _handleunrecognizedcharacterescape.IconCompatParcelizer(-369947619);
            }
            _handleunrecognizedcharacterescape.MediaBrowserCompatCustomActionResultReceiver();
            getcreatedondatems.invoke();
            if (_validJsonValueList.AudioAttributesImplApi26Parcelizer()) {
                _validJsonValueList.AudioAttributesImplApi21Parcelizer();
            }
        }
        return getShowPopup.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(String str, String str2, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, Class cls, int i, ComposeViewAdapter composeViewAdapter) {
        Throwable cause;
        try {
            injection injectionVar = injection.INSTANCE;
            Object[] objArrWrite = _deserializeMissingToken.write(cls, i);
            injectionVar.read(str, str2, _handleunrecognizedcharacterescape, Arrays.copyOf(objArrWrite, objArrWrite.length));
            return getShowPopup.INSTANCE;
        } catch (Throwable th) {
            Throwable th2 = th;
            while ((th2 instanceof ReflectiveOperationException) && (cause = th2.getCause()) != null) {
                th2 = cause;
            }
            composeViewAdapter.MediaBrowserCompatItemReceiver.read(th2);
            throw th;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup write(ComposeViewAdapter composeViewAdapter) {
        View childAt = composeViewAdapter.getChildAt(0);
        toMagicModuleMetaRepoModel.read(childAt, "");
        KeyEvent.Callback childAt2 = ((ComposeView) childAt).getChildAt(0);
        CoercionInputShape coercionInputShape = childAt2 instanceof CoercionInputShape ? (CoercionInputShape) childAt2 : null;
        if (coercionInputShape != null) {
            coercionInputShape.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4();
        }
        parseDigitsRecursive.INSTANCE.read();
        return getShowPopup.INSTANCE;
    }

    private final void IconCompatParcelizer(AttributeSet p0) {
        long j;
        ComposeViewAdapter composeViewAdapter = this;
        isCreatorVisible.IconCompatParcelizer(composeViewAdapter, this.MediaBrowserCompatSearchResultReceiver);
        setCenterTextRadiusPercent.read(composeViewAdapter, this.MediaBrowserCompatSearchResultReceiver);
        isFieldVisible.AudioAttributesCompatParcelizer(composeViewAdapter, this.MediaMetadataCompat);
        addView(this.RemoteActionCompatParcelizer);
        String attributeValue = p0.getAttributeValue("http://schemas.android.com/tools", "composableName");
        if (attributeValue == null) {
            return;
        }
        String str = TestGroupLSModel.read(attributeValue, '.', attributeValue);
        String strAudioAttributesCompatParcelizer = TestGroupLSModel.AudioAttributesCompatParcelizer(attributeValue, '.', attributeValue);
        int attributeIntValue = p0.getAttributeIntValue("http://schemas.android.com/tools", "parameterProviderIndex", 0);
        String attributeValue2 = p0.getAttributeValue("http://schemas.android.com/tools", "parameterProviderClass");
        Class<? extends PropertyValueMap<?>> cls = attributeValue2 != null ? _deserializeMissingToken.read(attributeValue2) : null;
        try {
            j = Long.parseLong(p0.getAttributeValue("http://schemas.android.com/tools", "animationClockStartTime"));
        } catch (Exception unused) {
            j = -1;
        }
        write$default(this, str, strAudioAttributesCompatParcelizer, cls, attributeIntValue, p0.getAttributeBooleanValue("http://schemas.android.com/tools", "paintBounds", this.IconCompatParcelizer), p0.getAttributeBooleanValue("http://schemas.android.com/tools", "printViewInfos", this.read), j, p0.getAttributeBooleanValue("http://schemas.android.com/tools", "findDesignInfoProviders", this.MediaBrowserCompatCustomActionResultReceiver), p0.getAttributeValue("http://schemas.android.com/tools", "designInfoProvidersArgument"), null, null, 1536, null);
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001R\u0017\u0010\u0007\u001a\u00020\u00028\u0007¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\tR\u0014\u0010\u0005\u001a\u00020\u000b8WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0003\u001a\u00020\u00028WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\u0006"}, d2 = {"Landroidx/compose/ui/tooling/ComposeViewAdapter$AudioAttributesCompatParcelizer;", "Lo/PieChart;", "Lo/getSetterUnchecked;", "read", "Lo/getSetterUnchecked;", "AudioAttributesCompatParcelizer", "()Lo/getSetterUnchecked;", "RemoteActionCompatParcelizer", "Lo/setRenderer;", "Lo/setRenderer;", "write", "Lo/setOnChartValueSelectedListener;", "getSavedStateRegistry", "()Lo/setOnChartValueSelectedListener;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AudioAttributesCompatParcelizer implements PieChart {

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
        private final setRenderer write;

        /* JADX INFO: renamed from: read, reason: from kotlin metadata */
        private final getSetterUnchecked RemoteActionCompatParcelizer;

        AudioAttributesCompatParcelizer() {
            getSetterUnchecked.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getSetterUnchecked.read;
            getSetterUnchecked getsetteruncheckedRemoteActionCompatParcelizer = getSetterUnchecked.AudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(this);
            this.RemoteActionCompatParcelizer = getsetteruncheckedRemoteActionCompatParcelizer;
            setRenderer.RemoteActionCompatParcelizer remoteActionCompatParcelizer = setRenderer.AudioAttributesCompatParcelizer;
            setRenderer setrendererRemoteActionCompatParcelizer = setRenderer.RemoteActionCompatParcelizer.RemoteActionCompatParcelizer(this);
            setrendererRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(new Bundle());
            this.write = setrendererRemoteActionCompatParcelizer;
            getsetteruncheckedRemoteActionCompatParcelizer.RemoteActionCompatParcelizer(anyIgnorals.write.write);
        }

        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from getter */
        public final getSetterUnchecked getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.PieChart
        public final setOnChartValueSelectedListener getSavedStateRegistry() {
            return this.write.getRead();
        }

        @Override // kotlin.hasGetter
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final getSetterUnchecked getLifecycle() {
            return this.RemoteActionCompatParcelizer;
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\n\u0018\u00002\u00020\u0001R\u0014\u0010\u0005\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0004R\u001a\u0010\b\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0004\u001a\u0004\b\u0006\u0010\u0007"}, d2 = {"Landroidx/compose/ui/tooling/ComposeViewAdapter$IconCompatParcelizer;", "Lo/TypeResolutionContext;", "Lo/hasMixIns;", "RemoteActionCompatParcelizer", "Lo/hasMixIns;", "IconCompatParcelizer", "getViewModelStore", "()Lo/hasMixIns;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class IconCompatParcelizer implements TypeResolutionContext {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final hasMixIns read;

        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
        private final hasMixIns IconCompatParcelizer;

        IconCompatParcelizer() {
            hasMixIns hasmixins = new hasMixIns();
            this.IconCompatParcelizer = hasmixins;
            this.read = hasmixins;
        }

        @Override // kotlin.TypeResolutionContext
        /* JADX INFO: renamed from: getViewModelStore, reason: from getter */
        public final hasMixIns getRead() {
            return this.read;
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0003\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00078WX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\t"}, d2 = {"Landroidx/compose/ui/tooling/ComposeViewAdapter$read;", "Lo/onSetShuffleMode;", "Lo/onSetRating;", "RemoteActionCompatParcelizer", "Lo/onSetRating;", "getOnBackPressedDispatcher", "()Lo/onSetRating;", "Lo/getSetterUnchecked;", "AudioAttributesCompatParcelizer", "()Lo/getSetterUnchecked;", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class read implements onSetShuffleMode {
        private final onSetRating RemoteActionCompatParcelizer = new onSetRating(null, 1, null);

        read() {
        }

        @Override // kotlin.onSetShuffleMode
        /* JADX INFO: renamed from: getOnBackPressedDispatcher, reason: from getter */
        public final onSetRating getRemoteActionCompatParcelizer() {
            return this.RemoteActionCompatParcelizer;
        }

        @Override // kotlin.hasGetter
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final getSetterUnchecked getLifecycle() {
            return ComposeViewAdapter.this.MediaBrowserCompatSearchResultReceiver.getRemoteActionCompatParcelizer();
        }
    }

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001R\u001a\u0010\u0007\u001a\u00020\u00028\u0017X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0004\u001a\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/ui/tooling/ComposeViewAdapter$write;", "Lo/_init_lambda3;", "Landroidx/compose/ui/tooling/ComposeViewAdapter$write$AudioAttributesCompatParcelizer;", "IconCompatParcelizer", "Landroidx/compose/ui/tooling/ComposeViewAdapter$write$AudioAttributesCompatParcelizer;", "write", "()Landroidx/compose/ui/tooling/ComposeViewAdapter$write$AudioAttributesCompatParcelizer;", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write implements _init_lambda3 {

        /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
        private final AudioAttributesCompatParcelizer AudioAttributesCompatParcelizer = new AudioAttributesCompatParcelizer();

        write() {
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\b\n\u0018\u00002\u00020\u0001JU\u0010\r\u001a\u00020\f\"\n\b\u0000\u0010\u0003*\u0004\u0018\u00010\u0002\"\n\b\u0001\u0010\u0004*\u0004\u0018\u00010\u00022\u0006\u0010\u0006\u001a\u00020\u00052\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00072\u0006\u0010\t\u001a\u00028\u00002\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b\r\u0010\u000e"}, d2 = {"Landroidx/compose/ui/tooling/ComposeViewAdapter$write$AudioAttributesCompatParcelizer;", "Lo/r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;", "", "I", "O", "", "p0", "Lo/accessaddObserverForBackInvoker;", "p1", "p2", "Lo/_checkFloatToStringCoercion;", "p3", "", "RemoteActionCompatParcelizer", "(ILo/accessaddObserverForBackInvoker;Ljava/lang/Object;Lo/_checkFloatToStringCoercion;)V"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class AudioAttributesCompatParcelizer extends r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 {
            AudioAttributesCompatParcelizer() {
            }

            @Override // kotlin.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0
            public final <I, O> void RemoteActionCompatParcelizer(int p0, accessaddObserverForBackInvoker<I, O> p1, I p2, _checkFloatToStringCoercion p3) {
                throw new IllegalStateException("Calling launch() is not supported in Preview");
            }
        }

        @Override // kotlin._init_lambda3
        /* JADX INFO: renamed from: write, reason: from getter and merged with bridge method [inline-methods] */
        public final AudioAttributesCompatParcelizer getActivityResultRegistry() {
            return this.AudioAttributesCompatParcelizer;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getShowPopup IconCompatParcelizer(ComposeViewAdapter composeViewAdapter, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, _handleUnrecognizedCharacterEscape _handleunrecognizedcharacterescape, int i2) {
        composeViewAdapter.write(magicModuleSubmissionRequestBody, _handleunrecognizedcharacterescape, _appendEscaped.RemoteActionCompatParcelizer(i | 1));
        return getShowPopup.INSTANCE;
    }
}
