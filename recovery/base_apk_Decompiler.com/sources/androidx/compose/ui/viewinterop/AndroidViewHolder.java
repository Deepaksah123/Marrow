package androidx.compose.ui.viewinterop;

import android.content.Context;
import android.graphics.Rect;
import android.graphics.Region;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.compose.ui.viewinterop.AndroidViewHolder;
import androidx.core.view.WindowInsetsCompat;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import java.util.List;
import kotlin.AtomicReferenceDeserializer;
import kotlin.C0201setMcqCount;
import kotlin.ConfigOverride;
import kotlin.InvalidTypeIdException;
import kotlin.JsonPOJOBuilder;
import kotlin.JsonParserDelegate;
import kotlin.MagicModuleSubmissionRequestBody;
import kotlin.MagicModuleUseCase;
import kotlin.Metadata;
import kotlin.NioPathSerializer;
import kotlin.PieChart;
import kotlin.PropertyMetadata;
import kotlin.PropertyValueAny;
import kotlin.SampleVideos;
import kotlin.SdkPayloadData;
import kotlin.TopUserCompanion;
import kotlin.ValueInjector;
import kotlin.VersionUtil;
import kotlin.WritableTypeIdInclusion;
import kotlin.WriterBasedJsonGenerator;
import kotlin._assertNotNull;
import kotlin._bindAndClose;
import kotlin._configureGenerator;
import kotlin._getByteArrayBuilder;
import kotlin._handleOddName;
import kotlin._parser;
import kotlin._verifyEndArrayForSingle;
import kotlin._verifyNoLeadingZeroes;
import kotlin.balloc;
import kotlin.bufferAnyProperty;
import kotlin.bufferMapProperty;
import kotlin.convertNumberToLong;
import kotlin.createDummyDeserializationContext;
import kotlin.findSetterInfo;
import kotlin.finishBranchObject;
import kotlin.getAnswerMap;
import kotlin.getConfigOverride;
import kotlin.getCreatedOnDateMs;
import kotlin.getKey;
import kotlin.getMagicModuleStats;
import kotlin.getNullAccessPattern;
import kotlin.getQues;
import kotlin.getReferencedType;
import kotlin.getShowPopup;
import kotlin.getValueHandler;
import kotlin.getYear;
import kotlin.handleUnexpectedToken;
import kotlin.hasGetter;
import kotlin.hasHandlers;
import kotlin.hasRawClass;
import kotlin.hasReferringProperties;
import kotlin.isAbstract;
import kotlin.isCreatorVisible;
import kotlin.isTypeOrSuperTypeOf;
import kotlin.objectIdResolverInstance;
import kotlin.referringProperties;
import kotlin.reportBadDefinition;
import kotlin.reportWrongTokenException;
import kotlin.resetAsObject;
import kotlin.rootArrayScope;
import kotlin.setCenterTextRadiusPercent;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.updateReference;
import kotlin.withContentValueHandler;
import kotlin.withHandlersFrom;
import kotlin.withTypeHandler;
import kotlin.withValueInstantiators;

/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u0000ö\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0015\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0010\u0018\u0000 \u001d2\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u001dB9\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\n\u0018\u00010\u000ej\u0004\u0018\u0001`\u0014¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u001f\u0010\u001f\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001f\u0010 J\r\u0010!\u001a\u00020\u001a¢\u0006\u0004\b!\u0010\u001cJ7\u0010#\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\"2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\nH\u0014¢\u0006\u0004\b#\u0010$J\u0011\u0010&\u001a\u0004\u0018\u00010%H\u0016¢\u0006\u0004\b&\u0010'J\u0017\u0010(\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\"H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\u001aH\u0014¢\u0006\u0004\b*\u0010\u001cJ\u000f\u0010+\u001a\u00020\u001aH\u0014¢\u0006\u0004\b+\u0010\u001cJ%\u0010/\u001a\u0004\u0018\u00010.2\b\u0010\u0007\u001a\u0004\u0018\u00010,2\b\u0010\t\u001a\u0004\u0018\u00010-H\u0016¢\u0006\u0004\b/\u00100J\u001f\u00101\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000eH\u0016¢\u0006\u0004\b1\u00102J)\u00103\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u000e2\b\u0010\t\u001a\u0004\u0018\u00010-2\u0006\u0010\u000b\u001a\u00020\"H\u0016¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u001a¢\u0006\u0004\b5\u0010\u001cJ\u0017\u00106\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\nH\u0014¢\u0006\u0004\b6\u00107J\u0019\u00109\u001a\u00020\"2\b\u0010\u0007\u001a\u0004\u0018\u000108H\u0016¢\u0006\u0004\b9\u0010:J'\u0010;\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b;\u0010<J\u000f\u0010=\u001a\u00020\"H\u0016¢\u0006\u0004\b=\u0010>J/\u0010;\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b;\u0010?J\u000f\u0010@\u001a\u00020\nH\u0016¢\u0006\u0004\b@\u0010AJ/\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001b\u0010BJ\u001f\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010CJG\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\n2\u0006\u0010D\u001a\u00020,H\u0016¢\u0006\u0004\b\u001b\u0010EJ?\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\n2\u0006\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0011\u001a\u00020\nH\u0016¢\u0006\u0004\b\u001d\u0010FJ7\u0010\u0015\u001a\u00020\u001a2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020,2\u0006\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0015\u0010GJ/\u0010I\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020H2\u0006\u0010\u000b\u001a\u00020H2\u0006\u0010\r\u001a\u00020\"H\u0016¢\u0006\u0004\bI\u0010JJ'\u0010K\u001a\u00020\"2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020H2\u0006\u0010\u000b\u001a\u00020HH\u0016¢\u0006\u0004\bK\u0010LJ\u000f\u0010M\u001a\u00020\"H\u0016¢\u0006\u0004\bM\u0010>J\u001f\u0010O\u001a\u00020N2\u0006\u0010\u0007\u001a\u00020\u000e2\u0006\u0010\t\u001a\u00020NH\u0016¢\u0006\u0004\bO\u0010PJ\u0017\u0010;\u001a\u00020N2\u0006\u0010\u0007\u001a\u00020NH\u0002¢\u0006\u0004\b;\u0010QJ\u0017\u0010\u001e\u001a\u00020R2\u0006\u0010\u0007\u001a\u00020RH\u0002¢\u0006\u0004\b\u001e\u0010SJ3\u0010\u001e\u001a\u00020T*\u00020T2\u0006\u0010\u0007\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\nH\u0002¢\u0006\u0004\b\u001e\u0010UR\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010VR\u0014\u0010\u001b\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0017\u0010;\u001a\u00020\u000e8\u0007¢\u0006\f\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\u0016R\u0014\u0010\u001e\u001a\u00020\u00108\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\\\u0010]R6\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u001a0^2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001a0^8\u0007@EX\u0087\u000e¢\u0006\u0012\n\u0004\b_\u0010`\u001a\u0004\ba\u0010b\"\u0004\b\u0015\u0010cR\u0016\u0010a\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b[\u0010dR0\u0010!\u001a\b\u0012\u0004\u0012\u00020\u001a0^2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001a0^8\u0006@EX\u0087\u000e¢\u0006\f\n\u0004\be\u0010`\"\u0004\b\u001e\u0010cR0\u00105\u001a\b\u0012\u0004\u0012\u00020\u001a0^2\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u001a0^8\u0006@EX\u0087\u000e¢\u0006\f\n\u0004\bf\u0010`\"\u0004\b\u001b\u0010cR*\u0010h\u001a\u00020g2\u0006\u0010\u0007\u001a\u00020g8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\bh\u0010i\u001a\u0004\bj\u0010k\"\u0004\bl\u0010mR0\u0010o\u001a\u0010\u0012\u0004\u0012\u00020g\u0012\u0004\u0012\u00020\u001a\u0018\u00010n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\bo\u0010p\u001a\u0004\bq\u0010r\"\u0004\bs\u0010tR*\u0010v\u001a\u00020u2\u0006\u0010\u0007\u001a\u00020u8\u0007@GX\u0087\u000e¢\u0006\u0012\n\u0004\bv\u0010w\u001a\u0004\bx\u0010y\"\u0004\bz\u0010{R0\u0010|\u001a\u0010\u0012\u0004\u0012\u00020u\u0012\u0004\u0012\u00020\u001a\u0018\u00010n8\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b|\u0010p\u001a\u0004\b}\u0010r\"\u0004\b~\u0010tR5\u0010\u0080\u0001\u001a\u0004\u0018\u00010\u007f2\b\u0010\u0007\u001a\u0004\u0018\u00010\u007f8\u0007@GX\u0087\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R7\u0010\u0087\u0001\u001a\u0005\u0018\u00010\u0086\u00012\t\u0010\u0007\u001a\u0005\u0018\u00010\u0086\u00018\u0007@GX\u0087\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010[\u001a\u00020,8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u0019\u0010W\u001a\u00030\u008f\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R\u001a\u0010\u0093\u0001\u001a\u0004\u0018\u00010N8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b!\u0010\u0092\u0001R/\u0010\u0096\u0001\u001a\u001a\u0012\u0007\u0012\u0005\u0018\u00010\u0094\u0001\u0012\u0004\u0012\u00020\u001a\u0018\u00010nj\u0005\u0018\u0001`\u0095\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b;\u0010pR\u0018\u0010\u0099\u0001\u001a\u00030\u0097\u00018CX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0096\u0001\u0010\u0098\u0001R\u001c\u0010\u009b\u0001\u001a\b\u0012\u0004\u0012\u00020\u001a0^8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u009a\u0001\u0010`R\u001b\u0010\\\u001a\b\u0012\u0004\u0012\u00020\u001a0^8\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u009c\u0001\u0010`R4\u0010\u009d\u0001\u001a\u0010\u0012\u0004\u0012\u00020\"\u0012\u0004\u0012\u00020\u001a\u0018\u00010n8\u0001@\u0001X\u0081\u000e¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010p\u001a\u0005\b\u009e\u0001\u0010r\"\u0005\b\u009f\u0001\u0010tR\u0016\u0010e\u001a\u00020,8\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0096\u0001\u0010\u008e\u0001R\u0018\u0010\u008d\u0001\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u0093\u0001\u0010VR\u0017\u0010\u009a\u0001\u001a\u00020\n8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\ba\u0010VR\u0018\u0010\u009c\u0001\u001a\u00030 \u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u009b\u0001\u0010¡\u0001R\u0016\u0010f\u001a\u00020\"8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\b5\u0010dR\u0016\u0010\u0090\u0001\u001a\u00020\"8WX\u0096\u0004¢\u0006\u0007\u001a\u0005\b¢\u0001\u0010>R\u001f\u0010¦\u0001\u001a\u00030£\u00018\u0007X\u0087\u0004¢\u0006\u000f\n\u0006\b\u0099\u0001\u0010¤\u0001\u001a\u0005\bW\u0010¥\u0001"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "Landroid/view/ViewGroup;", "Lo/resetAsObject;", "Lo/_getByteArrayBuilder;", "Lo/createDummyDeserializationContext;", "Lo/finishBranchObject;", "Landroid/content/Context;", "p0", "Lo/convertNumberToLong;", "p1", "", "p2", "Lo/reportBadDefinition;", "p3", "Landroid/view/View;", "p4", "Lo/_configureGenerator;", "p5", "<init>", "(Landroid/content/Context;Lo/convertNumberToLong;ILo/reportBadDefinition;Landroid/view/View;Lo/_configureGenerator;)V", "Lo/write;", "RemoteActionCompatParcelizer", "()Landroid/view/View;", "", "getAccessibilityClassName", "()Ljava/lang/CharSequence;", "", "read", "()V", "AudioAttributesCompatParcelizer", "write", "onMeasure", "(II)V", "AudioAttributesImplBaseParcelizer", "", "onLayout", "(ZIIII)V", "Landroid/view/ViewGroup$LayoutParams;", "getLayoutParams", "()Landroid/view/ViewGroup$LayoutParams;", "requestDisallowInterceptTouchEvent", "(Z)V", "onAttachedToWindow", "onDetachedFromWindow", "", "Landroid/graphics/Rect;", "Landroid/view/ViewParent;", "invalidateChildInParent", "([ILandroid/graphics/Rect;)Landroid/view/ViewParent;", "onDescendantInvalidated", "(Landroid/view/View;Landroid/view/View;)V", "requestChildRectangleOnScreen", "(Landroid/view/View;Landroid/graphics/Rect;Z)Z", "MediaBrowserCompatCustomActionResultReceiver", "onWindowVisibilityChanged", "(I)V", "Landroid/graphics/Region;", "gatherTransparentRegion", "(Landroid/graphics/Region;)Z", "IconCompatParcelizer", "(III)I", "shouldDelayChildPressedState", "()Z", "(Landroid/view/View;Landroid/view/View;II)Z", "getNestedScrollAxes", "()I", "(Landroid/view/View;Landroid/view/View;II)V", "(Landroid/view/View;I)V", "p6", "(Landroid/view/View;IIIII[I)V", "(Landroid/view/View;IIIII)V", "(Landroid/view/View;II[II)V", "", "onNestedFling", "(Landroid/view/View;FFZ)Z", "onNestedPreFling", "(Landroid/view/View;FF)Z", "isNestedScrollingEnabled", "Landroidx/core/view/WindowInsetsCompat;", "onApplyWindowInsets", "(Landroid/view/View;Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "(Landroidx/core/view/WindowInsetsCompat;)Landroidx/core/view/WindowInsetsCompat;", "Lo/NioPathSerializer$RemoteActionCompatParcelizer;", "(Lo/NioPathSerializer$RemoteActionCompatParcelizer;)Lo/NioPathSerializer$RemoteActionCompatParcelizer;", "Lo/_verifyEndArrayForSingle;", "(Lo/_verifyEndArrayForSingle;IIII)Lo/_verifyEndArrayForSingle;", "I", "AudioAttributesImplApi21Parcelizer", "Lo/reportBadDefinition;", "onFastForward", "Landroid/view/View;", "MediaBrowserCompatItemReceiver", "MediaMetadataCompat", "Lo/_configureGenerator;", "Lkotlin/Function0;", "onPlay", "Lo/getCreatedOnDateMs;", "AudioAttributesImplApi26Parcelizer", "()Lo/getCreatedOnDateMs;", "(Lo/getCreatedOnDateMs;)V", "Z", "onAddQueueItem", "handleMediaPlayPauseIfPendingOnHandler", "Lo/_handleOddName;", "modifier", "Lo/_handleOddName;", "getModifier", "()Lo/_handleOddName;", "setModifier", "(Lo/_handleOddName;)V", "Lkotlin/Function1;", "onModifierChanged", "Lo/getAnswerMap;", "getOnModifierChanged$ui", "()Lo/getAnswerMap;", "setOnModifierChanged$ui", "(Lo/getAnswerMap;)V", "Lo/bufferMapProperty;", "density", "Lo/bufferMapProperty;", "getDensity", "()Lo/bufferMapProperty;", "setDensity", "(Lo/bufferMapProperty;)V", "onDensityChanged", "getOnDensityChanged$ui", "setOnDensityChanged$ui", "Lo/hasGetter;", "lifecycleOwner", "Lo/hasGetter;", "getLifecycleOwner", "()Lo/hasGetter;", "setLifecycleOwner", "(Lo/hasGetter;)V", "Lo/PieChart;", "savedStateRegistryOwner", "Lo/PieChart;", "getSavedStateRegistryOwner", "()Lo/PieChart;", "setSavedStateRegistryOwner", "(Lo/PieChart;)V", "onCustomAction", "[I", "Lo/getKey;", "onMediaButtonEvent", "J", "Landroidx/core/view/WindowInsetsCompat;", "RatingCompat", "Lo/WritableTypeIdInclusion;", "Lo/BringIntoViewRequester;", "MediaBrowserCompatMediaItem", "Lo/PropertyMetadata;", "()Lo/PropertyMetadata;", "MediaBrowserCompatSearchResultReceiver", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "MediaDescriptionCompat", "onCommand", "onRequestDisallowInterceptTouchEvent", "getOnRequestDisallowInterceptTouchEvent$ui", "setOnRequestDisallowInterceptTouchEvent$ui", "Lo/rootArrayScope;", "Lo/rootArrayScope;", "onRemoveQueueItem", "Lo/_assertNotNull;", "Lo/_assertNotNull;", "()Lo/_assertNotNull;", "onPause"}, k = 1, mv = {2, 0, 0}, xi = 48)
public class AndroidViewHolder extends ViewGroup implements resetAsObject, _getByteArrayBuilder, createDummyDeserializationContext, finishBranchObject {

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private final reportBadDefinition read;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private WindowInsetsCompat RatingCompat;

    /* JADX INFO: renamed from: IconCompatParcelizer, reason: from kotlin metadata */
    private getAnswerMap<? super WritableTypeIdInclusion, getShowPopup> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private boolean handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private final int[] onAddQueueItem;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private final _assertNotNull onPause;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final rootArrayScope onCommand;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final _configureGenerator write;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private int onCustomAction;
    private bufferMapProperty density;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private getCreatedOnDateMs<getShowPopup> MediaBrowserCompatCustomActionResultReceiver;
    private hasGetter lifecycleOwner;
    private _handleOddName modifier;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private getCreatedOnDateMs<getShowPopup> AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final getCreatedOnDateMs<getShowPopup> MediaMetadataCompat;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final int[] MediaBrowserCompatItemReceiver;
    private getAnswerMap<? super bufferMapProperty, getShowPopup> onDensityChanged;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private final View IconCompatParcelizer;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private long AudioAttributesImplApi21Parcelizer;
    private getAnswerMap<? super _handleOddName, getShowPopup> onModifierChanged;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private getCreatedOnDateMs<getShowPopup> RemoteActionCompatParcelizer;
    private getAnswerMap<? super Boolean, getShowPopup> onRequestDisallowInterceptTouchEvent;
    private PieChart savedStateRegistryOwner;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int AudioAttributesCompatParcelizer;
    public static final int read = 8;
    private static final getAnswerMap<AndroidViewHolder, getShowPopup> RemoteActionCompatParcelizer = AnonymousClass3.write;

    @Override // kotlin.resetAsArray
    public boolean IconCompatParcelizer(View p0, View p1, int p2, int p3) {
        return ((p2 & 2) == 0 && (p2 & 1) == 0) ? false : true;
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    public AndroidViewHolder(Context context, convertNumberToLong convertnumbertolong, int i, reportBadDefinition reportbaddefinition, View view, _configureGenerator _configuregenerator) {
        super(context);
        this.AudioAttributesCompatParcelizer = i;
        this.read = reportbaddefinition;
        this.IconCompatParcelizer = view;
        this.write = _configuregenerator;
        if (convertnumbertolong != null) {
            ConfigOverride.read(this, convertnumbertolong);
        }
        setSaveFromParentEnabled(false);
        addView(view);
        AndroidViewHolder androidViewHolder = this;
        InvalidTypeIdException.IconCompatParcelizer(androidViewHolder, new NioPathSerializer.read() { // from class: androidx.compose.ui.viewinterop.AndroidViewHolder.5
            {
                super(1);
            }

            @Override // o.NioPathSerializer.read
            public final NioPathSerializer.RemoteActionCompatParcelizer write(NioPathSerializer p0, NioPathSerializer.RemoteActionCompatParcelizer p1) {
                return AndroidViewHolder.this.write(p1);
            }

            @Override // o.NioPathSerializer.read
            public final WindowInsetsCompat AudioAttributesCompatParcelizer(WindowInsetsCompat p0, List<NioPathSerializer> p1) {
                return AndroidViewHolder.this.IconCompatParcelizer(p0);
            }
        });
        InvalidTypeIdException.read(androidViewHolder, this);
        this.RemoteActionCompatParcelizer = AnonymousClass14.IconCompatParcelizer;
        this.AudioAttributesImplBaseParcelizer = AnonymousClass15.RemoteActionCompatParcelizer;
        this.MediaBrowserCompatCustomActionResultReceiver = AnonymousClass11.AudioAttributesCompatParcelizer;
        this.modifier = _handleOddName.INSTANCE;
        this.density = bufferAnyProperty.IconCompatParcelizer$default(1.0f, BitmapDescriptorFactory.HUE_RED, 2, null);
        this.MediaBrowserCompatItemReceiver = new int[2];
        this.AudioAttributesImplApi21Parcelizer = getKey.INSTANCE.RemoteActionCompatParcelizer();
        this.MediaDescriptionCompat = new AnonymousClass12();
        this.MediaMetadataCompat = new AnonymousClass13();
        this.onAddQueueItem = new int[2];
        this.onCustomAction = Integer.MIN_VALUE;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = Integer.MIN_VALUE;
        this.onCommand = new rootArrayScope();
        _assertNotNull _assertnotnull = new _assertNotNull(false, 0, 3, null);
        _assertnotnull.write(this);
        _handleOddName _handleoddnameAudioAttributesCompatParcelizer = getNullAccessPattern.write(WriterBasedJsonGenerator.read(handleUnexpectedToken.read(withValueInstantiators.read(objectIdResolverInstance.AudioAttributesCompatParcelizer(_handleOddName.INSTANCE, AtomicReferenceDeserializer.write, reportbaddefinition), true, AnonymousClass9.read), this), new AnonymousClass10(_assertnotnull, this)), new AnonymousClass6(_assertnotnull)).AudioAttributesCompatParcelizer(new updateReference(new AnonymousClass7()));
        _assertnotnull.RemoteActionCompatParcelizer(i);
        _assertnotnull.read(this.modifier.AudioAttributesCompatParcelizer(_handleoddnameAudioAttributesCompatParcelizer));
        this.onModifierChanged = new AnonymousClass4(_assertnotnull, _handleoddnameAudioAttributesCompatParcelizer);
        _assertnotnull.AudioAttributesCompatParcelizer(this.density);
        this.onDensityChanged = new AnonymousClass1(_assertnotnull);
        _assertnotnull.RemoteActionCompatParcelizer(new AnonymousClass2(_assertnotnull));
        _assertnotnull.AudioAttributesCompatParcelizer(new AnonymousClass8());
        _assertnotnull.AudioAttributesCompatParcelizer(new RemoteActionCompatParcelizer(_assertnotnull));
        this.onPause = _assertnotnull;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from getter */
    public final View getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    public final View RemoteActionCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$14, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "read", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass14 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        public static final AnonymousClass14 IconCompatParcelizer = new AnonymousClass14();

        public final void read() {
        }

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            read();
            return getShowPopup.INSTANCE;
        }

        AnonymousClass14() {
            super(0);
        }
    }

    public final getCreatedOnDateMs<getShowPopup> AudioAttributesImplApi26Parcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    protected final void RemoteActionCompatParcelizer(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        this.RemoteActionCompatParcelizer = getcreatedondatems;
        this.AudioAttributesImplApi26Parcelizer = true;
        this.MediaDescriptionCompat.invoke();
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$15, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AudioAttributesCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass15 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        public static final AnonymousClass15 RemoteActionCompatParcelizer = new AnonymousClass15();

        public final void AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            AudioAttributesCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        AnonymousClass15() {
            super(0);
        }
    }

    protected final void write(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        this.AudioAttributesImplBaseParcelizer = getcreatedondatems;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$11, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AudioAttributesCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass11 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        public static final AnonymousClass11 AudioAttributesCompatParcelizer = new AnonymousClass11();

        public final void AudioAttributesCompatParcelizer() {
        }

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            AudioAttributesCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        AnonymousClass11() {
            super(0);
        }
    }

    protected final void read(getCreatedOnDateMs<getShowPopup> getcreatedondatems) {
        this.MediaBrowserCompatCustomActionResultReceiver = getcreatedondatems;
    }

    public final _handleOddName getModifier() {
        return this.modifier;
    }

    public final void setModifier(_handleOddName _handleoddname) {
        if (_handleoddname != this.modifier) {
            this.modifier = _handleoddname;
            getAnswerMap<? super _handleOddName, getShowPopup> getanswermap = this.onModifierChanged;
            if (getanswermap != null) {
                getanswermap.invoke(_handleoddname);
            }
        }
    }

    public final getAnswerMap<_handleOddName, getShowPopup> getOnModifierChanged$ui() {
        return this.onModifierChanged;
    }

    public final void setOnModifierChanged$ui(getAnswerMap<? super _handleOddName, getShowPopup> getanswermap) {
        this.onModifierChanged = getanswermap;
    }

    public final bufferMapProperty getDensity() {
        return this.density;
    }

    public final void setDensity(bufferMapProperty buffermapproperty) {
        if (buffermapproperty != this.density) {
            this.density = buffermapproperty;
            getAnswerMap<? super bufferMapProperty, getShowPopup> getanswermap = this.onDensityChanged;
            if (getanswermap != null) {
                getanswermap.invoke(buffermapproperty);
            }
        }
    }

    public final getAnswerMap<bufferMapProperty, getShowPopup> getOnDensityChanged$ui() {
        return this.onDensityChanged;
    }

    public final void setOnDensityChanged$ui(getAnswerMap<? super bufferMapProperty, getShowPopup> getanswermap) {
        this.onDensityChanged = getanswermap;
    }

    public final hasGetter getLifecycleOwner() {
        return this.lifecycleOwner;
    }

    public final void setLifecycleOwner(hasGetter hasgetter) {
        if (hasgetter != this.lifecycleOwner) {
            this.lifecycleOwner = hasgetter;
            isCreatorVisible.IconCompatParcelizer(this, hasgetter);
        }
    }

    public final PieChart getSavedStateRegistryOwner() {
        return this.savedStateRegistryOwner;
    }

    public final void setSavedStateRegistryOwner(PieChart pieChart) {
        if (pieChart != this.savedStateRegistryOwner) {
            this.savedStateRegistryOwner = pieChart;
            setCenterTextRadiusPercent.read(this, pieChart);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final PropertyMetadata MediaBrowserCompatMediaItem() {
        if (!isAttachedToWindow()) {
            reportWrongTokenException.read("Expected AndroidViewHolder to be attached when observing reads.");
        }
        return this.write.getAddOnNewIntentListener();
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$12, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "RemoteActionCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass12 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            RemoteActionCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        public final void RemoteActionCompatParcelizer() {
            if (AndroidViewHolder.this.AudioAttributesImplApi26Parcelizer && AndroidViewHolder.this.isAttachedToWindow()) {
                ViewParent parent = AndroidViewHolder.this.getIconCompatParcelizer().getParent();
                AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
                if (parent == androidViewHolder) {
                    PropertyMetadata propertyMetadataMediaBrowserCompatMediaItem = androidViewHolder.MediaBrowserCompatMediaItem();
                    propertyMetadataMediaBrowserCompatMediaItem.IconCompatParcelizer.IconCompatParcelizer(AndroidViewHolder.this, (getAnswerMap<? super AndroidViewHolder, getShowPopup>) AndroidViewHolder.RemoteActionCompatParcelizer, AndroidViewHolder.this.AudioAttributesImplApi26Parcelizer());
                }
            }
        }

        AnonymousClass12() {
            super(0);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$13, reason: invalid class name */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"", "AudioAttributesCompatParcelizer", "()V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass13 extends MagicModuleUseCase implements getCreatedOnDateMs<getShowPopup> {
        public final void AudioAttributesCompatParcelizer() {
            AndroidViewHolder.this.getOnPause().ensureViewModelStore();
        }

        @Override // kotlin.getCreatedOnDateMs
        public final /* synthetic */ getShowPopup invoke() {
            AudioAttributesCompatParcelizer();
            return getShowPopup.INSTANCE;
        }

        AnonymousClass13() {
            super(0);
        }
    }

    public final getAnswerMap<Boolean, getShowPopup> getOnRequestDisallowInterceptTouchEvent$ui() {
        return this.onRequestDisallowInterceptTouchEvent;
    }

    public final void setOnRequestDisallowInterceptTouchEvent$ui(getAnswerMap<? super Boolean, getShowPopup> getanswermap) {
        this.onRequestDisallowInterceptTouchEvent = getanswermap;
    }

    @Override // kotlin.createDummyDeserializationContext
    public boolean onRemoveQueueItem() {
        return isAttachedToWindow();
    }

    @Override // android.view.ViewGroup, android.view.View
    public CharSequence getAccessibilityClassName() {
        return getClass().getName();
    }

    @Override // kotlin._getByteArrayBuilder
    public void read() {
        if (this.IconCompatParcelizer.getParent() != this) {
            addView(this.IconCompatParcelizer);
        } else {
            this.AudioAttributesImplBaseParcelizer.invoke();
        }
    }

    @Override // kotlin._getByteArrayBuilder
    public void AudioAttributesCompatParcelizer() {
        this.AudioAttributesImplBaseParcelizer.invoke();
        removeAllViewsInLayout();
    }

    @Override // kotlin._getByteArrayBuilder
    public void write() {
        this.MediaBrowserCompatCustomActionResultReceiver.invoke();
    }

    @Override // android.view.View
    protected void onMeasure(int p0, int p1) {
        if (this.IconCompatParcelizer.getParent() != this) {
            setMeasuredDimension(View.MeasureSpec.getSize(p0), View.MeasureSpec.getSize(p1));
            return;
        }
        if (this.IconCompatParcelizer.getVisibility() == 8) {
            setMeasuredDimension(0, 0);
            return;
        }
        this.IconCompatParcelizer.measure(p0, p1);
        setMeasuredDimension(this.IconCompatParcelizer.getMeasuredWidth(), this.IconCompatParcelizer.getMeasuredHeight());
        this.onCustomAction = p0;
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = p1;
    }

    public final void AudioAttributesImplBaseParcelizer() {
        int i;
        int i2 = this.onCustomAction;
        if (i2 == Integer.MIN_VALUE || (i = this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver) == Integer.MIN_VALUE) {
            return;
        }
        measure(i2, i);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean p0, int p1, int p2, int p3, int p4) {
        this.IconCompatParcelizer.layout(0, 0, p3 - p1, p4 - p2);
    }

    @Override // android.view.View
    public ViewGroup.LayoutParams getLayoutParams() {
        ViewGroup.LayoutParams layoutParams = this.IconCompatParcelizer.getLayoutParams();
        return layoutParams == null ? new ViewGroup.LayoutParams(-1, -1) : layoutParams;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean p0) {
        getAnswerMap<? super Boolean, getShowPopup> getanswermap = this.onRequestDisallowInterceptTouchEvent;
        if (getanswermap != null) {
            getanswermap.invoke(Boolean.valueOf(p0));
        }
        super.requestDisallowInterceptTouchEvent(p0);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.MediaDescriptionCompat.invoke();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        MediaBrowserCompatMediaItem().write(this);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ViewParent invalidateChildInParent(int[] p0, Rect p1) {
        super.invalidateChildInParent(p0, p1);
        MediaBrowserCompatCustomActionResultReceiver();
        return null;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void onDescendantInvalidated(View p0, View p1) {
        super.onDescendantInvalidated(p0, p1);
        MediaBrowserCompatCustomActionResultReceiver();
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View p0, Rect p1, boolean p2) {
        getAnswerMap<? super WritableTypeIdInclusion, getShowPopup> getanswermap = this.MediaBrowserCompatMediaItem;
        if (getanswermap == null) {
            return true;
        }
        getanswermap.invoke(p1 != null ? VersionUtil.write(p1) : null);
        return true;
    }

    public final void MediaBrowserCompatCustomActionResultReceiver() {
        if (this.handleMediaPlayPauseIfPendingOnHandler) {
            View view = this.IconCompatParcelizer;
            final getCreatedOnDateMs<getShowPopup> getcreatedondatems = this.MediaMetadataCompat;
            view.postOnAnimation(new Runnable() { // from class: o.referenceValue
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidViewHolder.IconCompatParcelizer(getcreatedondatems);
                }
            });
            return;
        }
        this.onPause.ensureViewModelStore();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
        getcreatedondatems.invoke();
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int p0) {
        super.onWindowVisibilityChanged(p0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean gatherTransparentRegion(Region p0) {
        if (p0 == null) {
            return true;
        }
        getLocationInWindow(this.onAddQueueItem);
        int[] iArr = this.onAddQueueItem;
        int i = iArr[0];
        int i2 = iArr[1];
        int width = getWidth();
        p0.op(i, i2, i + width, this.onAddQueueItem[1] + getHeight(), Region.Op.DIFFERENCE);
        return true;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from getter */
    public final _assertNotNull getOnPause() {
        return this.onPause;
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$9, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/getConfigOverride;", "", "IconCompatParcelizer", "(Lo/getConfigOverride;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass9 extends MagicModuleUseCase implements getAnswerMap<getConfigOverride, getShowPopup> {
        public static final AnonymousClass9 read = new AnonymousClass9();

        public final void IconCompatParcelizer(getConfigOverride getconfigoverride) {
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(getConfigOverride getconfigoverride) {
            IconCompatParcelizer(getconfigoverride);
            return getShowPopup.INSTANCE;
        }

        AnonymousClass9() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$10, reason: invalid class name */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/findSetterInfo;", "", "AudioAttributesCompatParcelizer", "(Lo/findSetterInfo;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass10 extends MagicModuleUseCase implements getAnswerMap<findSetterInfo, getShowPopup> {
        final /* synthetic */ _assertNotNull $write;
        final /* synthetic */ AndroidViewHolder RemoteActionCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(findSetterInfo findsetterinfo) {
            AudioAttributesCompatParcelizer(findsetterinfo);
            return getShowPopup.INSTANCE;
        }

        public final void AudioAttributesCompatParcelizer(findSetterInfo findsetterinfo) {
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            _assertNotNull _assertnotnull = this.$write;
            AndroidViewHolder androidViewHolder2 = this.RemoteActionCompatParcelizer;
            JsonParserDelegate jsonParserDelegateIconCompatParcelizer = findsetterinfo.getIconCompatParcelizer().IconCompatParcelizer();
            if (androidViewHolder.getIconCompatParcelizer().getVisibility() != 8) {
                androidViewHolder.handleMediaPlayPauseIfPendingOnHandler = true;
                _configureGenerator onMediaButtonEvent = _assertnotnull.getOnMediaButtonEvent();
                AndroidComposeView androidComposeView = onMediaButtonEvent instanceof AndroidComposeView ? (AndroidComposeView) onMediaButtonEvent : null;
                if (androidComposeView != null) {
                    androidComposeView.IconCompatParcelizer(androidViewHolder2, balloc.RemoteActionCompatParcelizer(jsonParserDelegateIconCompatParcelizer));
                }
                androidViewHolder.handleMediaPlayPauseIfPendingOnHandler = false;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass10(_assertNotNull _assertnotnull, AndroidViewHolder androidViewHolder) {
            super(1);
            this.$write = _assertnotnull;
            this.RemoteActionCompatParcelizer = androidViewHolder;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$6, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/isAbstract;", "p0", "", "IconCompatParcelizer", "(Lo/isAbstract;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass6 extends MagicModuleUseCase implements getAnswerMap<isAbstract, getShowPopup> {
        final /* synthetic */ _assertNotNull $write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(isAbstract isabstract) {
            IconCompatParcelizer(isabstract);
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(isAbstract isabstract) {
            WindowInsets windowInsetsMediaBrowserCompatMediaItem;
            AtomicReferenceDeserializer.write(AndroidViewHolder.this, this.$write);
            AndroidViewHolder.this.write.read(AndroidViewHolder.this);
            int i = AndroidViewHolder.this.MediaBrowserCompatItemReceiver[0];
            int i2 = AndroidViewHolder.this.MediaBrowserCompatItemReceiver[1];
            AndroidViewHolder.this.getIconCompatParcelizer().getLocationOnScreen(AndroidViewHolder.this.MediaBrowserCompatItemReceiver);
            long j = AndroidViewHolder.this.AudioAttributesImplApi21Parcelizer;
            AndroidViewHolder.this.AudioAttributesImplApi21Parcelizer = isabstract.write();
            WindowInsetsCompat windowInsetsCompat = AndroidViewHolder.this.RatingCompat;
            if (windowInsetsCompat != null) {
                if ((i == AndroidViewHolder.this.MediaBrowserCompatItemReceiver[0] && i2 == AndroidViewHolder.this.MediaBrowserCompatItemReceiver[1] && getKey.AudioAttributesCompatParcelizer(j, AndroidViewHolder.this.AudioAttributesImplApi21Parcelizer)) || (windowInsetsMediaBrowserCompatMediaItem = AndroidViewHolder.this.IconCompatParcelizer(windowInsetsCompat).MediaBrowserCompatMediaItem()) == null) {
                    return;
                }
                AndroidViewHolder.this.getIconCompatParcelizer().dispatchApplyWindowInsets(windowInsetsMediaBrowserCompatMediaItem);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass6(_assertNotNull _assertnotnull) {
            super(1);
            this.$write = _assertnotnull;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$7, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u001c\u0010\u0004\u001a\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u0001\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0000j\u0004\u0018\u0001`\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlin/Function1;", "Lo/WritableTypeIdInclusion;", "", "Lo/BringIntoViewRequester;", "p0", "RemoteActionCompatParcelizer", "(Lo/getAnswerMap;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass7 extends MagicModuleUseCase implements getAnswerMap<getAnswerMap<? super WritableTypeIdInclusion, ? extends getShowPopup>, getShowPopup> {
        public final void RemoteActionCompatParcelizer(getAnswerMap<? super WritableTypeIdInclusion, getShowPopup> getanswermap) {
            AndroidViewHolder.this.MediaBrowserCompatMediaItem = getanswermap;
        }

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(getAnswerMap<? super WritableTypeIdInclusion, ? extends getShowPopup> getanswermap) {
            RemoteActionCompatParcelizer(getanswermap);
            return getShowPopup.INSTANCE;
        }

        AnonymousClass7() {
            super(1);
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$4, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_handleOddName;", "p0", "", "write", "(Lo/_handleOddName;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass4 extends MagicModuleUseCase implements getAnswerMap<_handleOddName, getShowPopup> {
        final /* synthetic */ _assertNotNull $AudioAttributesCompatParcelizer;
        final /* synthetic */ _handleOddName $IconCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_handleOddName _handleoddname) {
            write(_handleoddname);
            return getShowPopup.INSTANCE;
        }

        public final void write(_handleOddName _handleoddname) {
            this.$AudioAttributesCompatParcelizer.read(_handleoddname.AudioAttributesCompatParcelizer(this.$IconCompatParcelizer));
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass4(_assertNotNull _assertnotnull, _handleOddName _handleoddname) {
            super(1);
            this.$AudioAttributesCompatParcelizer = _assertnotnull;
            this.$IconCompatParcelizer = _handleoddname;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$1, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/bufferMapProperty;", "p0", "", "write", "(Lo/bufferMapProperty;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass1 extends MagicModuleUseCase implements getAnswerMap<bufferMapProperty, getShowPopup> {
        final /* synthetic */ _assertNotNull $IconCompatParcelizer;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(bufferMapProperty buffermapproperty) {
            write(buffermapproperty);
            return getShowPopup.INSTANCE;
        }

        public final void write(bufferMapProperty buffermapproperty) {
            this.$IconCompatParcelizer.AudioAttributesCompatParcelizer(buffermapproperty);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass1(_assertNotNull _assertnotnull) {
            super(1);
            this.$IconCompatParcelizer = _assertnotnull;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$2, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_configureGenerator;", "p0", "", "IconCompatParcelizer", "(Lo/_configureGenerator;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<_configureGenerator, getShowPopup> {
        final /* synthetic */ _assertNotNull $write;

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_configureGenerator _configuregenerator) {
            IconCompatParcelizer(_configuregenerator);
            return getShowPopup.INSTANCE;
        }

        public final void IconCompatParcelizer(_configureGenerator _configuregenerator) {
            AndroidComposeView androidComposeView = _configuregenerator instanceof AndroidComposeView ? (AndroidComposeView) _configuregenerator : null;
            if (androidComposeView != null) {
                androidComposeView.read(AndroidViewHolder.this, this.$write);
            }
            ViewParent parent = AndroidViewHolder.this.getIconCompatParcelizer().getParent();
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            if (parent != androidViewHolder) {
                androidViewHolder.addView(androidViewHolder.getIconCompatParcelizer());
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(_assertNotNull _assertnotnull) {
            super(1);
            this.$write = _assertnotnull;
        }
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$8, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lo/_configureGenerator;", "p0", "", "read", "(Lo/_configureGenerator;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass8 extends MagicModuleUseCase implements getAnswerMap<_configureGenerator, getShowPopup> {
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(_configureGenerator _configuregenerator) {
            read(_configuregenerator);
            return getShowPopup.INSTANCE;
        }

        public final void read(_configureGenerator _configuregenerator) {
            if (_verifyNoLeadingZeroes.RemoteActionCompatParcelizer && AndroidViewHolder.this.hasFocus()) {
                _configuregenerator.getOnPlayFromSearch().RemoteActionCompatParcelizer(true);
            }
            AndroidComposeView androidComposeView = _configuregenerator instanceof AndroidComposeView ? (AndroidComposeView) _configuregenerator : null;
            if (androidComposeView != null) {
                androidComposeView.IconCompatParcelizer(AndroidViewHolder.this);
            }
            AndroidViewHolder.this.removeAllViewsInLayout();
        }

        AnonymousClass8() {
            super(1);
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\n\u0018\u00002\u00020\u0001J)\u0010\t\u001a\u00020\b*\u00020\u00022\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ)\u0010\u000e\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0007\u001a\u00020\rH\u0016¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0010\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0007\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\t\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0002¢\u0006\u0004\b\t\u0010\u0011J)\u0010\t\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0007\u001a\u00020\rH\u0016¢\u0006\u0004\b\t\u0010\u000fJ)\u0010\u0012\u001a\u00020\r*\u00020\u000b2\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\f0\u00032\u0006\u0010\u0007\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u000fJ\u0017\u0010\u000e\u001a\u00020\r2\u0006\u0010\u0005\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u0011"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder$RemoteActionCompatParcelizer;", "Lo/withTypeHandler;", "Lo/withContentValueHandler;", "", "Lo/isTypeOrSuperTypeOf;", "p0", "Lo/PropertyValueAny;", "p1", "Lo/withHandlersFrom;", "AudioAttributesCompatParcelizer", "(Lo/withContentValueHandler;Ljava/util/List;J)Lo/withHandlersFrom;", "Lo/getValueHandler;", "Lo/hasHandlers;", "", "write", "(Lo/getValueHandler;Ljava/util/List;I)I", "RemoteActionCompatParcelizer", "(I)I", "read"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer implements withTypeHandler {
        final /* synthetic */ _assertNotNull read;

        RemoteActionCompatParcelizer(_assertNotNull _assertnotnull) {
            this.read = _assertnotnull;
        }

        /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$RemoteActionCompatParcelizer$3, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "RemoteActionCompatParcelizer", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
            public static final AnonymousClass3 write = new AnonymousClass3();

            public final void RemoteActionCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer) {
            }

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
                RemoteActionCompatParcelizer(iconCompatParcelizer);
                return getShowPopup.INSTANCE;
            }

            AnonymousClass3() {
                super(1);
            }
        }

        @Override // kotlin.withTypeHandler
        public final withHandlersFrom AudioAttributesCompatParcelizer(withContentValueHandler withcontentvaluehandler, List<? extends isTypeOrSuperTypeOf> list, long j) {
            if (AndroidViewHolder.this.getChildCount() == 0) {
                return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, PropertyValueAny.MediaBrowserCompatItemReceiver(j), PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j), null, AnonymousClass3.write, 4, null);
            }
            if (PropertyValueAny.MediaBrowserCompatItemReceiver(j) != 0) {
                AndroidViewHolder.this.getChildAt(0).setMinimumWidth(PropertyValueAny.MediaBrowserCompatItemReceiver(j));
            }
            if (PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j) != 0) {
                AndroidViewHolder.this.getChildAt(0).setMinimumHeight(PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j));
            }
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            int iMediaBrowserCompatItemReceiver = PropertyValueAny.MediaBrowserCompatItemReceiver(j);
            int iAudioAttributesImplBaseParcelizer = PropertyValueAny.AudioAttributesImplBaseParcelizer(j);
            ViewGroup.LayoutParams layoutParams = AndroidViewHolder.this.getLayoutParams();
            toMagicModuleMetaRepoModel.write(layoutParams);
            int iIconCompatParcelizer = androidViewHolder.IconCompatParcelizer(iMediaBrowserCompatItemReceiver, iAudioAttributesImplBaseParcelizer, layoutParams.width);
            AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
            int iMediaBrowserCompatCustomActionResultReceiver = PropertyValueAny.MediaBrowserCompatCustomActionResultReceiver(j);
            int iAudioAttributesImplApi21Parcelizer = PropertyValueAny.AudioAttributesImplApi21Parcelizer(j);
            ViewGroup.LayoutParams layoutParams2 = AndroidViewHolder.this.getLayoutParams();
            toMagicModuleMetaRepoModel.write(layoutParams2);
            androidViewHolder.measure(iIconCompatParcelizer, androidViewHolder2.IconCompatParcelizer(iMediaBrowserCompatCustomActionResultReceiver, iAudioAttributesImplApi21Parcelizer, layoutParams2.height));
            return withContentValueHandler.AudioAttributesCompatParcelizer$default(withcontentvaluehandler, AndroidViewHolder.this.getMeasuredWidth(), AndroidViewHolder.this.getMeasuredHeight(), null, new AnonymousClass2(AndroidViewHolder.this, this.read), 4, null);
        }

        /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$RemoteActionCompatParcelizer$2, reason: invalid class name */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/_parser$IconCompatParcelizer;", "", "AudioAttributesCompatParcelizer", "(Lo/_parser$IconCompatParcelizer;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
        static final class AnonymousClass2 extends MagicModuleUseCase implements getAnswerMap<_parser.IconCompatParcelizer, getShowPopup> {
            final /* synthetic */ _assertNotNull $AudioAttributesCompatParcelizer;
            final /* synthetic */ AndroidViewHolder $RemoteActionCompatParcelizer;

            public final void AudioAttributesCompatParcelizer(_parser.IconCompatParcelizer iconCompatParcelizer) {
                AtomicReferenceDeserializer.write(this.$RemoteActionCompatParcelizer, this.$AudioAttributesCompatParcelizer);
            }

            @Override // kotlin.getAnswerMap
            public final /* synthetic */ getShowPopup invoke(_parser.IconCompatParcelizer iconCompatParcelizer) {
                AudioAttributesCompatParcelizer(iconCompatParcelizer);
                return getShowPopup.INSTANCE;
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            AnonymousClass2(AndroidViewHolder androidViewHolder, _assertNotNull _assertnotnull) {
                super(1);
                this.$RemoteActionCompatParcelizer = androidViewHolder;
                this.$AudioAttributesCompatParcelizer = _assertnotnull;
            }
        }

        @Override // kotlin.withTypeHandler
        public final int write(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
            return AudioAttributesCompatParcelizer(i);
        }

        @Override // kotlin.withTypeHandler
        public final int RemoteActionCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
            return AudioAttributesCompatParcelizer(i);
        }

        private final int AudioAttributesCompatParcelizer(int p0) {
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
            AndroidViewHolder androidViewHolder2 = AndroidViewHolder.this;
            ViewGroup.LayoutParams layoutParams = androidViewHolder2.getLayoutParams();
            toMagicModuleMetaRepoModel.write(layoutParams);
            androidViewHolder.measure(iMakeMeasureSpec, androidViewHolder2.IconCompatParcelizer(0, p0, layoutParams.height));
            return AndroidViewHolder.this.getMeasuredWidth();
        }

        @Override // kotlin.withTypeHandler
        public final int AudioAttributesCompatParcelizer(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
            return write(i);
        }

        @Override // kotlin.withTypeHandler
        public final int read(getValueHandler getvaluehandler, List<? extends hasHandlers> list, int i) {
            return write(i);
        }

        private final int write(int p0) {
            AndroidViewHolder androidViewHolder = AndroidViewHolder.this;
            ViewGroup.LayoutParams layoutParams = androidViewHolder.getLayoutParams();
            toMagicModuleMetaRepoModel.write(layoutParams);
            androidViewHolder.measure(androidViewHolder.IconCompatParcelizer(0, p0, layoutParams.width), View.MeasureSpec.makeMeasureSpec(0, 0));
            return AndroidViewHolder.this.getMeasuredHeight();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int IconCompatParcelizer(int p0, int p1, int p2) {
        if (p2 >= 0 || p0 == p1) {
            return View.MeasureSpec.makeMeasureSpec(getQues.write(p2, p0, p1), 1073741824);
        }
        if (p2 == -2 && p1 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(p1, Integer.MIN_VALUE);
        }
        if (p2 == -1 && p1 != Integer.MAX_VALUE) {
            return View.MeasureSpec.makeMeasureSpec(p1, 1073741824);
        }
        return View.MeasureSpec.makeMeasureSpec(0, 0);
    }

    @Override // android.view.ViewGroup
    public int getNestedScrollAxes() {
        return this.onCommand.IconCompatParcelizer();
    }

    @Override // kotlin.resetAsArray
    public void read(View p0, View p1, int p2, int p3) {
        this.onCommand.write(p2, p3);
    }

    @Override // kotlin.resetAsArray
    public void RemoteActionCompatParcelizer(View p0, int p1) {
        this.onCommand.read(p1);
    }

    @Override // kotlin.resetAsObject
    public void read(View p0, int p1, int p2, int p3, int p4, int p5, int[] p6) {
        if (isNestedScrollingEnabled()) {
            long j = -1;
            long j2 = -1;
            long j3 = this.read.read(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(AtomicReferenceDeserializer.read(p2))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(AtomicReferenceDeserializer.read(p1))) << 32)), getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(AtomicReferenceDeserializer.read(p4))) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) Float.floatToRawIntBits(AtomicReferenceDeserializer.read(p3))) << 32)), AtomicReferenceDeserializer.AudioAttributesCompatParcelizer(p5));
            p6[0] = JsonPOJOBuilder.AudioAttributesCompatParcelizer(Float.intBitsToFloat((int) (j3 >> 32)));
            p6[1] = JsonPOJOBuilder.AudioAttributesCompatParcelizer(Float.intBitsToFloat((int) j3));
        }
    }

    @Override // kotlin.resetAsArray
    public void AudioAttributesCompatParcelizer(View p0, int p1, int p2, int p3, int p4, int p5) {
        if (isNestedScrollingEnabled()) {
            long j = -1;
            long j2 = -1;
            this.read.read(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(AtomicReferenceDeserializer.read(p2))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(AtomicReferenceDeserializer.read(p1))) << 32)), getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(AtomicReferenceDeserializer.read(p4))) & ((((long) 0) << 32) | (j2 - ((j2 >> 63) << 32)))) | (((long) Float.floatToRawIntBits(AtomicReferenceDeserializer.read(p3))) << 32)), AtomicReferenceDeserializer.AudioAttributesCompatParcelizer(p5));
        }
    }

    @Override // kotlin.resetAsArray
    public void RemoteActionCompatParcelizer(View p0, int p1, int p2, int[] p3, int p4) {
        if (isNestedScrollingEnabled()) {
            long j = -1;
            long jAudioAttributesCompatParcelizer = this.read.AudioAttributesCompatParcelizer(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(AtomicReferenceDeserializer.read(p2))) & ((((long) 0) << 32) | (j - ((j >> 63) << 32)))) | (((long) Float.floatToRawIntBits(AtomicReferenceDeserializer.read(p1))) << 32)), AtomicReferenceDeserializer.AudioAttributesCompatParcelizer(p4));
            p3[0] = JsonPOJOBuilder.AudioAttributesCompatParcelizer(Float.intBitsToFloat((int) (jAudioAttributesCompatParcelizer >> 32)));
            p3[1] = JsonPOJOBuilder.AudioAttributesCompatParcelizer(Float.intBitsToFloat((int) jAudioAttributesCompatParcelizer));
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedFling(View p0, float p1, float p2, boolean p3) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        C0201setMcqCount.IconCompatParcelizer(this.read.IconCompatParcelizer(), null, null, new IconCompatParcelizer(p3, this, ValueInjector.read(AtomicReferenceDeserializer.RemoteActionCompatParcelizer(p1), AtomicReferenceDeserializer.RemoteActionCompatParcelizer(p2)), null), 3);
        return false;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class IconCompatParcelizer extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        int IconCompatParcelizer;
        final /* synthetic */ boolean RemoteActionCompatParcelizer;
        final /* synthetic */ long read;
        final /* synthetic */ AndroidViewHolder write;

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003c, code lost:
        
            if (r11 != r0) goto L14;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x005b, code lost:
        
            if (r11 == r0) goto L17;
         */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.getYear.IconCompatParcelizer()
                int r1 = r10.IconCompatParcelizer
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1e
                if (r1 == r3) goto L1a
                if (r1 != r2) goto L12
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                goto L5e
            L12:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r11)
                throw r10
            L1a:
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                goto L3e
            L1e:
                kotlin.SdkPayloadData.IconCompatParcelizer(r11)
                boolean r11 = r10.RemoteActionCompatParcelizer
                if (r11 != 0) goto L44
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r10.write
                o.reportBadDefinition r4 = androidx.compose.ui.viewinterop.AndroidViewHolder.read(r11)
                o.UnsupportedTypeDeserializer$write r11 = kotlin.UnsupportedTypeDeserializer.INSTANCE
                long r5 = r11.write()
                long r7 = r10.read
                r9 = r10
                o.SampleVideos r9 = (kotlin.SampleVideos) r9
                r10.IconCompatParcelizer = r3
                java.lang.Object r11 = r4.write(r5, r7, r9)
                if (r11 == r0) goto L5d
            L3e:
                o.UnsupportedTypeDeserializer r11 = (kotlin.UnsupportedTypeDeserializer) r11
                r11.getIconCompatParcelizer()
                goto L63
            L44:
                androidx.compose.ui.viewinterop.AndroidViewHolder r11 = r10.write
                o.reportBadDefinition r3 = androidx.compose.ui.viewinterop.AndroidViewHolder.read(r11)
                long r4 = r10.read
                o.UnsupportedTypeDeserializer$write r11 = kotlin.UnsupportedTypeDeserializer.INSTANCE
                long r6 = r11.write()
                r8 = r10
                o.SampleVideos r8 = (kotlin.SampleVideos) r8
                r10.IconCompatParcelizer = r2
                java.lang.Object r11 = r3.write(r4, r6, r8)
                if (r11 != r0) goto L5e
            L5d:
                return r0
            L5e:
                o.UnsupportedTypeDeserializer r11 = (kotlin.UnsupportedTypeDeserializer) r11
                r11.getIconCompatParcelizer()
            L63:
                o.getShowPopup r10 = kotlin.getShowPopup.INSTANCE
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.viewinterop.AndroidViewHolder.IconCompatParcelizer.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        IconCompatParcelizer(boolean z, AndroidViewHolder androidViewHolder, long j, SampleVideos<? super IconCompatParcelizer> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = z;
            this.write = androidViewHolder;
            this.read = j;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return new IconCompatParcelizer(this.RemoteActionCompatParcelizer, this.write, this.read, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((IconCompatParcelizer) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean onNestedPreFling(View p0, float p1, float p2) {
        if (!isNestedScrollingEnabled()) {
            return false;
        }
        C0201setMcqCount.IconCompatParcelizer(this.read.IconCompatParcelizer(), null, null, new read(ValueInjector.read(AtomicReferenceDeserializer.RemoteActionCompatParcelizer(p1), AtomicReferenceDeserializer.RemoteActionCompatParcelizer(p2)), null), 3);
        return false;
    }

    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
        final /* synthetic */ long RemoteActionCompatParcelizer;
        int read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.read;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.read = 1;
                if (AndroidViewHolder.this.read.RemoteActionCompatParcelizer(this.RemoteActionCompatParcelizer, this) == objIconCompatParcelizer) {
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
        read(long j, SampleVideos<? super read> sampleVideos) {
            super(2, sampleVideos);
            this.RemoteActionCompatParcelizer = j;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
            return AndroidViewHolder.this.new read(this.RemoteActionCompatParcelizer, sampleVideos);
        }

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
            return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    @Override // android.view.View
    public boolean isNestedScrollingEnabled() {
        return this.IconCompatParcelizer.isNestedScrollingEnabled();
    }

    @Override // kotlin.finishBranchObject
    public WindowInsetsCompat onApplyWindowInsets(View p0, WindowInsetsCompat p1) {
        this.RatingCompat = new WindowInsetsCompat(p1);
        return IconCompatParcelizer(p1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WindowInsetsCompat IconCompatParcelizer(WindowInsetsCompat p0) {
        if (!p0.MediaMetadataCompat()) {
            return p0;
        }
        _bindAndClose _bindandcloseOnPrepareFromUri = this.onPause.onPrepareFromUri();
        if (!_bindandcloseOnPrepareFromUri.MediaBrowserCompatItemReceiver()) {
            return p0;
        }
        _bindAndClose _bindandclose = _bindandcloseOnPrepareFromUri;
        long jAudioAttributesCompatParcelizer = referringProperties.AudioAttributesCompatParcelizer(hasRawClass.AudioAttributesCompatParcelizer(_bindandclose));
        int iIconCompatParcelizer = hasReferringProperties.IconCompatParcelizer(jAudioAttributesCompatParcelizer);
        if (iIconCompatParcelizer < 0) {
            iIconCompatParcelizer = 0;
        }
        int iAudioAttributesCompatParcelizer = hasReferringProperties.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer);
        if (iAudioAttributesCompatParcelizer < 0) {
            iAudioAttributesCompatParcelizer = 0;
        }
        long jWrite = hasRawClass.RemoteActionCompatParcelizer(_bindandclose).write();
        int i = (int) (jWrite >> 32);
        int i2 = (int) jWrite;
        long jWrite2 = _bindandcloseOnPrepareFromUri.write();
        long j = -1;
        long jAudioAttributesCompatParcelizer2 = referringProperties.AudioAttributesCompatParcelizer(_bindandcloseOnPrepareFromUri.IconCompatParcelizer(getReferencedType.AudioAttributesCompatParcelizer((((j - ((j >> 63) << 32)) | (((long) 0) << 32)) & ((long) Float.floatToRawIntBits((int) jWrite2))) | (((long) Float.floatToRawIntBits((int) (jWrite2 >> 32))) << 32))));
        int iIconCompatParcelizer2 = i - hasReferringProperties.IconCompatParcelizer(jAudioAttributesCompatParcelizer2);
        if (iIconCompatParcelizer2 < 0) {
            iIconCompatParcelizer2 = 0;
        }
        int iAudioAttributesCompatParcelizer2 = i2 - hasReferringProperties.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer2);
        int i3 = iAudioAttributesCompatParcelizer2 >= 0 ? iAudioAttributesCompatParcelizer2 : 0;
        return (iIconCompatParcelizer == 0 && iAudioAttributesCompatParcelizer == 0 && iIconCompatParcelizer2 == 0 && i3 == 0) ? p0 : p0.IconCompatParcelizer(iIconCompatParcelizer, iAudioAttributesCompatParcelizer, iIconCompatParcelizer2, i3);
    }

    private final _verifyEndArrayForSingle write(_verifyEndArrayForSingle _verifyendarrayforsingle, int i, int i2, int i3, int i4) {
        int i5 = _verifyendarrayforsingle.read - i;
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = _verifyendarrayforsingle.write - i2;
        if (i6 < 0) {
            i6 = 0;
        }
        int i7 = _verifyendarrayforsingle.IconCompatParcelizer - i3;
        if (i7 < 0) {
            i7 = 0;
        }
        int i8 = _verifyendarrayforsingle.AudioAttributesCompatParcelizer - i4;
        return _verifyEndArrayForSingle.read(i5, i6, i7, i8 >= 0 ? i8 : 0);
    }

    /* JADX INFO: renamed from: androidx.compose.ui.viewinterop.AndroidViewHolder$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/viewinterop/AndroidViewHolder;", "p0", "", "AudioAttributesCompatParcelizer", "(Landroidx/compose/ui/viewinterop/AndroidViewHolder;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<AndroidViewHolder, getShowPopup> {
        public static final AnonymousClass3 write = new AnonymousClass3();

        @Override // kotlin.getAnswerMap
        public final /* synthetic */ getShowPopup invoke(AndroidViewHolder androidViewHolder) {
            AudioAttributesCompatParcelizer(androidViewHolder);
            return getShowPopup.INSTANCE;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void AudioAttributesCompatParcelizer(getCreatedOnDateMs getcreatedondatems) {
            getcreatedondatems.invoke();
        }

        public final void AudioAttributesCompatParcelizer(AndroidViewHolder androidViewHolder) {
            Handler handler = androidViewHolder.getHandler();
            final getCreatedOnDateMs getcreatedondatems = androidViewHolder.MediaDescriptionCompat;
            handler.post(new Runnable() { // from class: o.getReferenced
                @Override // java.lang.Runnable
                public final void run() {
                    AndroidViewHolder.AnonymousClass3.AudioAttributesCompatParcelizer(getcreatedondatems);
                }
            });
        }

        AnonymousClass3() {
            super(1);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NioPathSerializer.RemoteActionCompatParcelizer write(NioPathSerializer.RemoteActionCompatParcelizer p0) {
        _bindAndClose _bindandcloseOnPrepareFromUri = this.onPause.onPrepareFromUri();
        if (_bindandcloseOnPrepareFromUri.MediaBrowserCompatItemReceiver()) {
            _bindAndClose _bindandclose = _bindandcloseOnPrepareFromUri;
            long jAudioAttributesCompatParcelizer = referringProperties.AudioAttributesCompatParcelizer(hasRawClass.AudioAttributesCompatParcelizer(_bindandclose));
            int iIconCompatParcelizer = hasReferringProperties.IconCompatParcelizer(jAudioAttributesCompatParcelizer);
            int i = iIconCompatParcelizer < 0 ? 0 : iIconCompatParcelizer;
            int iAudioAttributesCompatParcelizer = hasReferringProperties.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer);
            int i2 = iAudioAttributesCompatParcelizer < 0 ? 0 : iAudioAttributesCompatParcelizer;
            long jWrite = hasRawClass.RemoteActionCompatParcelizer(_bindandclose).write();
            int i3 = (int) (jWrite >> 32);
            int i4 = (int) jWrite;
            long jWrite2 = _bindandcloseOnPrepareFromUri.write();
            long j = -1;
            long jAudioAttributesCompatParcelizer2 = referringProperties.AudioAttributesCompatParcelizer(_bindandcloseOnPrepareFromUri.IconCompatParcelizer(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits((int) (jWrite2 >> 32))) << 32) | (((j - ((j >> 63) << 32)) | (((long) 0) << 32)) & ((long) Float.floatToRawIntBits((int) jWrite2))))));
            int iIconCompatParcelizer2 = i3 - hasReferringProperties.IconCompatParcelizer(jAudioAttributesCompatParcelizer2);
            int i5 = iIconCompatParcelizer2 < 0 ? 0 : iIconCompatParcelizer2;
            int iAudioAttributesCompatParcelizer2 = i4 - hasReferringProperties.AudioAttributesCompatParcelizer(jAudioAttributesCompatParcelizer2);
            int i6 = iAudioAttributesCompatParcelizer2 >= 0 ? iAudioAttributesCompatParcelizer2 : 0;
            if (i != 0 || i2 != 0 || i5 != 0 || i6 != 0) {
                int i7 = i;
                int i8 = i2;
                int i9 = i5;
                int i10 = i6;
                return new NioPathSerializer.RemoteActionCompatParcelizer(write(p0.IconCompatParcelizer(), i7, i8, i9, i10), write(p0.write(), i7, i8, i9, i10));
            }
        }
        return p0;
    }
}
