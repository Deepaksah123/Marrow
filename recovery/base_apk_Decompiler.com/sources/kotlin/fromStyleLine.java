package kotlin;

import android.content.Context;
import android.content.ContextWrapper;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Looper;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.android.exoplayer2.drm.UnsupportedDrmException;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.data.api.models.Failed;
import com.marrow.data.api.models.MarrowError;
import com.marrow.data.api.models.MarrowResponse;
import com.marrow.data.api.models.Success;
import com.marrow.data.api.models.response.ApiResponse;
import com.marrow.data.api.models.response.lesson.MarkIncompleteResponseBody;
import com.marrow.data.api.models.response.sync.CrossDeviceSyncResponseObject;
import com.marrow.data.api.models.response.user.LoggedUserResponse;
import com.marrow.data.models.ResponseError;
import com.marrow.data.models.common.ApplicationData;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.common.CourseConfigV2;
import com.marrow.data.models.common.PresenterBundle;
import com.marrow.data.models.content.VideoInfo;
import com.marrow.data.models.home.HomeMainModel;
import com.marrow.data.models.home.video.HomeVideoModel;
import com.marrow.data.models.lesson.LessonIndex;
import com.marrow.data.models.lesson.StepIndex;
import com.marrow.data.models.lesson.tab.LessonTabItem;
import com.marrow.data.models.video.DownloadOptionsUIModel;
import com.marrow.data.models.video.DownloadableResolution;
import com.marrow.data.models.video.ThemeState;
import com.marrow.data.models.video.Timeline;
import com.marrow.data.models.video.cache.VideoCacheInfo;
import com.marrow.data.utils.product.exceptions.EmptyResponseException;
import com.marrow.data.utils.product.exceptions.ResponseErrorException;
import com.marrow.ui.fragments.learn.model.ActiveRecallQbankLessonUiModel;
import com.marrow2.data.inapprating.remote.model.InAppRatingThreshHoldRemoteModel;
import com.marrow2.ui.video.downloaded_videos.model.MaxDownloadReachedArgs;
import in.juspay.hypersdk.core.PaymentConstants;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.AdsMediaSourceAdLoadException;
import kotlin.MagicModuleUseCaseImplWhenMappings;
import kotlin.MergingMediaSource;
import kotlin.Metadata;
import kotlin.StandardIntegrityVerdictOptOut;
import kotlin.WebvttSubtitleExternalSyntheticLambda0;
import kotlin.buildFormat;
import kotlin.evaluateQueueSize;
import kotlin.getChildCount;
import kotlin.getExternalPeriodUid;
import kotlin.getLatestBitrateEstimate;
import kotlin.getSampleFormats;
import kotlin.parseAlignment;
import kotlin.parseCea708AccessibilityChannel;
import kotlin.readFromInput;
import kotlin.skipComment;
import org.apache.commons.compress.archivers.tar.TarConstants;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ú\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0010\u0003\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b?\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u0000 Û\u00022\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u0004:\u0004Ú\u0002Û\u0002BÉ\u0002\b\u0007\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u0012\u0006\u0010\u0014\u001a\u00020\u0015\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\u0006\u0010\u0018\u001a\u00020\u0019\u0012\u0006\u0010\u001a\u001a\u00020\u001b\u0012\u0006\u0010\u001c\u001a\u00020\u001d\u0012\u0006\u0010\u001e\u001a\u00020\u001f\u0012\u0006\u0010 \u001a\u00020!\u0012\u0006\u0010\"\u001a\u00020#\u0012\b\b\u0001\u0010$\u001a\u00020%\u0012\b\b\u0001\u0010&\u001a\u00020%\u0012\u0006\u0010'\u001a\u00020(\u0012\u0006\u0010)\u001a\u00020*\u0012\u0006\u0010+\u001a\u00020,\u0012\u0006\u0010-\u001a\u00020.\u0012\u0006\u0010/\u001a\u000200\u0012\u0006\u00101\u001a\u00020\u0002\u0012\u0006\u00102\u001a\u00020\u000f\u0012\u0006\u00103\u001a\u000204\u0012\u0006\u00105\u001a\u000206\u0012\b\b\u0001\u00107\u001a\u000208\u0012\b\b\u0001\u00109\u001a\u00020:\u0012\u0006\u0010;\u001a\u00020<\u0012\b\b\u0001\u0010=\u001a\u00020>\u0012\u0006\u0010?\u001a\u00020@\u0012\u0006\u0010A\u001a\u00020B\u0012\u0006\u0010C\u001a\u00020D\u0012\u0006\u0010E\u001a\u00020F\u0012\u0006\u0010G\u001a\u00020H\u0012\u0006\u0010I\u001a\u00020J\u0012\b\b\u0001\u0010K\u001a\u00020L\u0012\b\b\u0001\u0010M\u001a\u00020L¢\u0006\u0004\bN\u0010OJ\u0012\u0010k\u001a\u0004\u0018\u00010Q2\u0006\u0010l\u001a\u00020QH\u0002J#\u0010\u0096\u0001\u001a\u00030\u0097\u00012\u0006\u0010V\u001a\u00020W2\u0006\u0010X\u001a\u00020Y2\u0007\u0010\u0098\u0001\u001a\u00020[H\u0016J\n\u0010\u0099\u0001\u001a\u00030\u0097\u0001H\u0002J\u0013\u0010\u009a\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u009b\u0001\u001a\u00020UH\u0002J\n\u0010\u009c\u0001\u001a\u00030\u0097\u0001H\u0002J\n\u0010\u009d\u0001\u001a\u00030\u0097\u0001H\u0016J\n\u0010\u009e\u0001\u001a\u00030\u0097\u0001H\u0016J\n\u0010\u009f\u0001\u001a\u00030\u0097\u0001H\u0016J\t\u0010 \u0001\u001a\u00020UH\u0002J\n\u0010¡\u0001\u001a\u00030\u0097\u0001H\u0002J\n\u0010¢\u0001\u001a\u00030£\u0001H\u0016J%\u0010¤\u0001\u001a\u00030\u0097\u00012\u0007\u0010¥\u0001\u001a\u00020U2\u0007\u0010¦\u0001\u001a\u00020]2\u0007\u0010§\u0001\u001a\u00020UH\u0016J\n\u0010¨\u0001\u001a\u00030\u0097\u0001H\u0016J\t\u0010©\u0001\u001a\u00020wH\u0016J\u0013\u0010ª\u0001\u001a\u00030\u0097\u00012\u0007\u0010«\u0001\u001a\u00020aH\u0002J\n\u0010¬\u0001\u001a\u00030\u0097\u0001H\u0002J\u0012\u0010\u00ad\u0001\u001a\u00030\u0097\u00012\u0006\u0010R\u001a\u00020SH\u0002J$\u0010®\u0001\u001a\u00030\u0097\u00012\u0007\u0010¯\u0001\u001a\u00020s2\u0006\u0010l\u001a\u00020Q2\u0007\u0010°\u0001\u001a\u00020UH\u0002J\u0014\u0010±\u0001\u001a\u00030\u0097\u00012\b\u0010²\u0001\u001a\u00030³\u0001H\u0002J\n\u0010´\u0001\u001a\u00030\u0097\u0001H\u0002J\n\u0010µ\u0001\u001a\u00030\u0097\u0001H\u0002J\n\u0010¶\u0001\u001a\u00030\u0097\u0001H\u0016J\n\u0010·\u0001\u001a\u00030\u0097\u0001H\u0016J\n\u0010¸\u0001\u001a\u00030\u0097\u0001H\u0016J\u0013\u0010¹\u0001\u001a\u00030\u0097\u00012\u0007\u0010º\u0001\u001a\u00020QH\u0002J\n\u0010»\u0001\u001a\u00030\u0097\u0001H\u0002J)\u0010¼\u0001\u001a\u00030\u0097\u00012\t\u0010½\u0001\u001a\u0004\u0018\u00010Q2\u0007\u0010¾\u0001\u001a\u00020]2\t\u0010¿\u0001\u001a\u0004\u0018\u00010QH\u0016J\u0013\u0010À\u0001\u001a\u00030\u0097\u00012\u0007\u0010Á\u0001\u001a\u00020]H\u0016J\n\u0010Â\u0001\u001a\u00030\u0097\u0001H\u0016J\n\u0010Ã\u0001\u001a\u00030\u0097\u0001H\u0016J\n\u0010Ä\u0001\u001a\u00030\u0097\u0001H\u0016J\u0013\u0010Å\u0001\u001a\u00030\u0097\u00012\u0007\u0010¯\u0001\u001a\u00020sH\u0002J*\u0010Æ\u0001\u001a\u00030\u0097\u00012\b\u0010Ç\u0001\u001a\u00030È\u00012\u0007\u0010É\u0001\u001a\u00020Q2\u000b\b\u0002\u0010Ê\u0001\u001a\u0004\u0018\u00010QH\u0002JK\u0010Ë\u0001\u001a\u00030\u0097\u00012\u0007\u0010¯\u0001\u001a\u00020s2\u0007\u0010Ì\u0001\u001a\u00020]2\u0007\u0010Í\u0001\u001a\u00020Q2\u0007\u0010Î\u0001\u001a\u00020U2\n\u0010Ï\u0001\u001a\u0005\u0018\u00010Ð\u00012\u000f\u0010Ñ\u0001\u001a\n\u0012\u0004\u0012\u00020Q\u0018\u00010cH\u0002J\u0014\u0010Ò\u0001\u001a\u00030\u0097\u00012\b\u0010Ó\u0001\u001a\u00030Ô\u0001H\u0002J8\u0010Õ\u0001\u001a\u00030Ô\u00012\u0007\u0010¯\u0001\u001a\u00020s2\u0007\u0010Ì\u0001\u001a\u00020]2\u0007\u0010Í\u0001\u001a\u00020Q2\u0007\u0010Î\u0001\u001a\u00020U2\b\u0010Ï\u0001\u001a\u00030Ð\u0001H\u0002J\u0013\u0010Ö\u0001\u001a\u00030\u0097\u00012\u0007\u0010Ê\u0001\u001a\u00020QH\u0002J\u0014\u0010×\u0001\u001a\u00030\u0097\u00012\b\u0010Ç\u0001\u001a\u00030È\u0001H\u0002J\u001b\u0010Ø\u0001\u001a\u00030\u0097\u00012\u000f\u0010Ù\u0001\u001a\n\u0012\u0005\u0012\u00030Û\u00010Ú\u0001H\u0002J\u0014\u0010Ü\u0001\u001a\u00030\u0097\u00012\b\u0010Ý\u0001\u001a\u00030È\u0001H\u0002J\n\u0010Þ\u0001\u001a\u00030\u0097\u0001H\u0016J\n\u0010ß\u0001\u001a\u00030\u0097\u0001H\u0016J%\u0010à\u0001\u001a\u00030\u0097\u00012\u0007\u0010Ì\u0001\u001a\u00020]2\u0007\u0010Î\u0001\u001a\u00020U2\u0007\u0010á\u0001\u001a\u00020QH\u0002J\n\u0010â\u0001\u001a\u00030\u0097\u0001H\u0016J\n\u0010ã\u0001\u001a\u00030\u0097\u0001H\u0016J\n\u0010ä\u0001\u001a\u00030\u0097\u0001H\u0016J\u0013\u0010å\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u008c\u0001\u001a\u00020UH\u0016J\u0015\u0010æ\u0001\u001a\u00030\u0097\u00012\t\u0010ç\u0001\u001a\u0004\u0018\u00010_H\u0016J\n\u0010è\u0001\u001a\u00030\u0097\u0001H\u0016J\n\u0010é\u0001\u001a\u00030\u0097\u0001H\u0016J#\u0010ê\u0001\u001a\u00030\u0097\u00012\b\u0010ë\u0001\u001a\u00030ì\u00012\r\u0010Ñ\u0001\u001a\b\u0012\u0004\u0012\u00020Q0cH\u0016J\u001c\u0010í\u0001\u001a\u00030\u0097\u00012\u0007\u0010î\u0001\u001a\u00020]2\u0007\u0010ï\u0001\u001a\u00020\u0005H\u0016J\u0013\u0010ð\u0001\u001a\u00030\u0097\u00012\u0007\u0010ñ\u0001\u001a\u00020]H\u0016J\n\u0010ò\u0001\u001a\u00030\u0097\u0001H\u0016J\n\u0010ó\u0001\u001a\u00030\u0097\u0001H\u0002J\u0017\u0010ô\u0001\u001a\u00030\u0097\u00012\u000b\b\u0002\u0010õ\u0001\u001a\u0004\u0018\u00010QH\u0002J\u0018\u0010ö\u0001\u001a\t\u0012\u0004\u0012\u00020U0÷\u00012\u0006\u0010P\u001a\u00020QH\u0002J\u0012\u0010ø\u0001\u001a\u00030\u0097\u00012\u0006\u0010P\u001a\u00020QH\u0002J\n\u0010ù\u0001\u001a\u00030\u0097\u0001H\u0002J\u0013\u0010ú\u0001\u001a\u00030\u0097\u00012\u0007\u0010\u0085\u0001\u001a\u00020]H\u0016J\u0013\u0010û\u0001\u001a\u00030\u0097\u00012\u0007\u0010ü\u0001\u001a\u00020]H\u0016J\n\u0010ý\u0001\u001a\u00030\u0097\u0001H\u0016J\n\u0010þ\u0001\u001a\u00030\u0097\u0001H\u0016J\n\u0010ÿ\u0001\u001a\u00030\u0097\u0001H\u0016J\n\u0010\u0080\u0002\u001a\u00030\u0097\u0001H\u0016J\n\u0010\u0081\u0002\u001a\u00030\u0097\u0001H\u0016J\n\u0010\u0082\u0002\u001a\u00030\u0097\u0001H\u0016J\n\u0010\u0083\u0002\u001a\u00030\u0097\u0001H\u0016J\u0013\u0010\u0084\u0002\u001a\u00030\u0097\u00012\u0007\u0010\u0085\u0002\u001a\u00020UH\u0016J\u001a\u0010\u0086\u0002\u001a\u0013\u0012\u000e\u0012\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030d0c0÷\u0001H\u0016J\n\u0010\u0087\u0002\u001a\u00030\u0097\u0001H\u0016J\u0017\u0010\u0088\u0002\u001a\u00030\u0097\u00012\u000b\u0010\u0089\u0002\u001a\u0006\u0012\u0002\b\u00030dH\u0016J\n\u0010\u008a\u0002\u001a\u00030\u0097\u0001H\u0016J%\u0010\u008b\u0002\u001a\u00030\u0097\u00012\u0007\u0010\u008c\u0002\u001a\u00020]2\u0007\u0010\u008d\u0002\u001a\u00020]2\u0007\u0010ï\u0001\u001a\u00020\u0005H\u0002J\n\u0010\u008e\u0002\u001a\u00030\u0097\u0001H\u0016J\u0013\u0010\u008f\u0002\u001a\u00030\u0097\u00012\u0007\u0010\u0090\u0002\u001a\u00020UH\u0016J\u0013\u0010\u0091\u0002\u001a\u00030\u0097\u00012\u0007\u0010\u0092\u0002\u001a\u00020UH\u0016J\u0013\u0010\u0093\u0002\u001a\u00030\u0097\u00012\u0007\u0010\u0094\u0002\u001a\u00020UH\u0016J\n\u0010\u0095\u0002\u001a\u00030\u0097\u0001H\u0016J\u001c\u0010\u0096\u0002\u001a\u00030\u0097\u00012\u0007\u0010\u0094\u0002\u001a\u00020U2\u0007\u0010\u0097\u0002\u001a\u00020UH\u0002J\n\u0010\u0098\u0002\u001a\u00030\u0097\u0001H\u0016J\n\u0010\u0099\u0002\u001a\u00030\u0097\u0001H\u0016J\n\u0010\u009a\u0002\u001a\u00030\u0097\u0001H\u0016J\n\u0010\u009b\u0002\u001a\u00030\u0097\u0001H\u0016J\u0013\u0010\u009c\u0002\u001a\u00030\u0097\u00012\u0007\u0010\u0094\u0002\u001a\u00020UH\u0016J\u0012\u0010\u009d\u0002\u001a\u00030\u0097\u00012\b\u0010\u009e\u0002\u001a\u00030\u008e\u0001J\n\u0010\u009f\u0002\u001a\u00030\u0097\u0001H\u0016J\n\u0010 \u0002\u001a\u00030\u0097\u0001H\u0016J\n\u0010¡\u0002\u001a\u00030\u0097\u0001H\u0016J\n\u0010¢\u0002\u001a\u00030\u0097\u0001H\u0016J\n\u0010£\u0002\u001a\u0005\u0018\u00010\u008e\u0001J\u0014\u0010¤\u0002\u001a\u00030\u0097\u00012\n\u0010¥\u0002\u001a\u0005\u0018\u00010\u008e\u0001J\u0013\u0010¦\u0002\u001a\u00030\u0097\u00012\u0007\u0010§\u0002\u001a\u00020QH\u0016J\n\u0010¨\u0002\u001a\u00030\u0097\u0001H\u0016J%\u0010©\u0002\u001a\u00030\u0097\u00012\u0007\u0010ª\u0002\u001a\u00020Q2\u0007\u0010«\u0002\u001a\u00020]2\u0007\u0010¬\u0002\u001a\u00020UH\u0016J\n\u0010\u00ad\u0002\u001a\u00030\u0097\u0001H\u0002J\b\u0010®\u0002\u001a\u00030\u0097\u0001J\u001b\u0010¯\u0002\u001a\u00030\u0097\u00012\u0006\u0010P\u001a\u00020Q2\u0007\u0010°\u0002\u001a\u00020wH\u0016J\n\u0010±\u0002\u001a\u00030\u0097\u0001H\u0016J\n\u0010²\u0002\u001a\u00030\u0097\u0001H\u0016J\n\u0010³\u0002\u001a\u00030\u0097\u0001H\u0016J\t\u0010´\u0002\u001a\u00020UH\u0016J\n\u0010µ\u0002\u001a\u00030\u0097\u0001H\u0002J.\u0010¶\u0002\u001a\t\u0012\u0005\u0012\u00030ì\u00010c2\u001c\u0010Ù\u0001\u001a\u0017\u0012\u000b\u0012\t\u0012\u0005\u0012\u00030¸\u00020c\u0012\u0005\u0012\u00030¹\u00020·\u0002H\u0002J\n\u0010º\u0002\u001a\u00030\u0097\u0001H\u0016J\u001c\u0010»\u0002\u001a\u00030\u0097\u00012\u0007\u0010°\u0002\u001a\u00020]2\u0007\u0010¼\u0002\u001a\u00020UH\u0016J\u001c\u0010½\u0002\u001a\u00030\u0097\u00012\u0007\u0010¾\u0002\u001a\u00020U2\u0007\u0010¼\u0002\u001a\u00020UH\u0002J\n\u0010¿\u0002\u001a\u00030\u0097\u0001H\u0016J\u001d\u0010À\u0002\u001a\u00030\u0097\u00012\u0011\u0010Á\u0002\u001a\f\u0018\u00010Â\u0002j\u0005\u0018\u0001`Ã\u0002H\u0016J\n\u0010Ä\u0002\u001a\u00030\u0097\u0001H\u0016J\u0014\u0010Å\u0002\u001a\u00030\u0097\u00012\b\u0010\u008d\u0002\u001a\u00030\u0095\u0001H\u0016J\n\u0010Æ\u0002\u001a\u00030\u0097\u0001H\u0016J&\u0010Ç\u0002\u001a\u00030\u0097\u00012\b\u0010È\u0002\u001a\u00030É\u00022\u0007\u0010Ê\u0002\u001a\u00020]2\u0007\u0010Ë\u0002\u001a\u00020]H\u0016J\u001c\u0010Ì\u0002\u001a\u00030\u0097\u00012\u0007\u0010Í\u0002\u001a\u00020]2\u0007\u0010Î\u0002\u001a\u00020]H\u0016J\n\u0010Ï\u0002\u001a\u00030\u0097\u0001H\u0016J\t\u0010Ð\u0002\u001a\u00020UH\u0016J\u0012\u0010Ñ\u0002\u001a\u00020U2\u0007\u0010°\u0002\u001a\u00020]H\u0002J\u0015\u0010Ò\u0002\u001a\u0005\u0018\u00010Ó\u00022\u0007\u0010Ô\u0002\u001a\u00020]H\u0002J\u0012\u0010Õ\u0002\u001a\u00020U2\u0007\u0010Ö\u0002\u001a\u00020]H\u0002J\b\u0010×\u0002\u001a\u00030\u0097\u0001J&\u0010Ø\u0002\u001a\f\u0012\u0007\u0012\u0005\u0018\u00010\u0093\u00010Ù\u00022\t\b\u0002\u0010\u009b\u0001\u001a\u00020U2\u0006\u0010P\u001a\u00020QH\u0002R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0015X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u001bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020!X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010)\u001a\u00020*X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010+\u001a\u00020,X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020.X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010/\u001a\u000200X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u00102\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00103\u001a\u000204X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00105\u001a\u000206X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00107\u001a\u000208X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u00109\u001a\u00020:X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010=\u001a\u00020>X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010?\u001a\u00020@X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010A\u001a\u00020BX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010C\u001a\u00020DX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010E\u001a\u00020FX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010G\u001a\u00020HX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010I\u001a\u00020JX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010K\u001a\u00020LX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010M\u001a\u00020LX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010P\u001a\u00020QX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010R\u001a\u0004\u0018\u00010SX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010T\u001a\u00020UX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010V\u001a\u00020WX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010X\u001a\u00020YX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010Z\u001a\u00020[X\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\\\u001a\u00020]X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010^\u001a\u0004\u0018\u00010_X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010`\u001a\u00020aX\u0082.¢\u0006\u0002\n\u0000R\u0018\u0010b\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030d0cX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010e\u001a\u00020fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010g\u001a\u0004\u0018\u00010hX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010i\u001a\u00020jX\u0082\u0004¢\u0006\u0002\n\u0000R!\u0010m\u001a\b\u0012\u0004\u0012\u00020\u00050c8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bp\u0010q\u001a\u0004\bn\u0010oR\u0018\u0010r\u001a\u0004\u0018\u00010s8BX\u0082\u000e¢\u0006\b\n\u0000\u001a\u0004\bt\u0010uR\u000e\u0010v\u001a\u00020wX\u0082\u000e¢\u0006\u0002\n\u0000R\u001b\u0010x\u001a\u00020y8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b|\u0010q\u001a\u0004\bz\u0010{R\u000e\u0010}\u001a\u00020UX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010~\u001a\u0004\u0018\u00010\u007fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0080\u0001\u001a\u00020UX\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0081\u0001\u001a\u00020]X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0082\u0001\u001a\u00020UX\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0083\u0001\u001a\u00030\u0084\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0085\u0001\u001a\u00020]X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0086\u0001\u001a\u00020]X\u0082D¢\u0006\u0002\n\u0000R\u001f\u0010\u0087\u0001\u001a\u00020UX\u0096\u000e¢\u0006\u0012\n\u0000\u001a\u0006\b\u0088\u0001\u0010\u0089\u0001\"\u0006\b\u008a\u0001\u0010\u008b\u0001R\u000f\u0010\u008c\u0001\u001a\u00020UX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u008d\u0001\u001a\u0005\u0018\u00010\u008e\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u008f\u0001\u001a\u00020QX\u0082\u000e¢\u0006\u0002\n\u0000R\u000f\u0010\u0090\u0001\u001a\u00020QX\u0082D¢\u0006\u0002\n\u0000R\u000f\u0010\u0091\u0001\u001a\u00020QX\u0082D¢\u0006\u0002\n\u0000R\u0012\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0093\u0001X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\u0094\u0001\u001a\u00030\u0095\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006Ü\u0002"}, d2 = {"Lcom/marrow/ui/activities/learn/video/LessonVideoPresenter;", "Lcom/marrow/kt/base/BasePresenter;", "Lcom/marrow/ui/activities/learn/video/LessonVideoContract$View;", "Lcom/marrow/ui/activities/learn/video/LessonVideoContract$Presenter;", "Lcom/marrow/mvp/BaseAdapterContract$ItemClickListener;", "Lcom/marrow/data/models/video/Timeline;", "subscriptionDataProvider", "Lcom/marrow/data/dataprovider/subscription/ISubscriptionDataProvider;", "rootInfoProvider", "Lcom/marrow/infoprovider/rooting/IRootInfoProvider;", "lessonDetailProvider", "Lcom/marrow/data/dataprovider/lesson/detail/LessonDetailDataSource$Repository;", "resourceProvider", "Lcom/marrow/data/dataprovider/common/IResourceProvider;", "cacheHomeDataProvider", "Lcom/marrow/data/dataprovider/home/ICacheHomeDataProvider;", "remoteConfigProvider", "Lcom/marrow/data/dataprovider/remoteconfig/IRemoteConfigDataProvider;", "lessonDataProvider", "Lcom/marrow/data/dataprovider/lesson/LessonRepository;", "localCacheInfoProvider", "Lcom/marrow/data/dataprovider/video/cache/VideoCacheDataSource;", "securityUseCase", "Lcom/marrow2/domain/security/SecurityUseCase;", "videoDownloadUseCase", "Lcom/marrow2/domain/download_video/VideoDownloadUseCase;", "spaceInfoProvider", "Lcom/marrow/data/dataprovider/video/space/ISpaceInfoProvider;", "stepDataProvider", "Lcom/marrow/data/dataprovider/lesson/step/StepLocalDataSource;", "decryptionDataProvider", "Lcom/marrow/data/dataprovider/common/crypto/video/IDecryptionDataProvider;", "preferenceProvider", "Lcom/marrow/data/dataprovider/preference/IPreferenceDataProvider;", "connectivity", "Lcom/marrow/mvp/Connectivity;", "computationScheduler", "Lio/reactivex/Scheduler;", "uiScheduler", "crashDataProvider", "Lcom/marrow/dataprovider/crash/ICrashDataProvider;", "userProfileProvider", "Lcom/marrow/data/dataprovider/user/IUserProfileProvider;", "lessonHomeProvider", "Lcom/marrow/data/dataprovider/lesson/personalisation/ILessonHomeProvider;", "applicationData", "Lcom/marrow/data/models/common/ApplicationData;", "timelinePresenter", "Lcom/marrow/ui/adapter/video/timeline/TimelineAdapterContract$Presenter;", "view", "homeDataProvider", "courseConfigDataProvider", "Lcom/marrow/data/dataprovider/courseConfig/CourseConfigDataProvider;", "videoResumeDataProvider", "Lcom/marrow/data/dataprovider/video/resume/IVideoResumeDataProvider;", "videoTimelineProvider", "Lcom/marrow/data/dataprovider/video/timeline/IVideoTimelineDataProvider;", "bookmarkDataProvider", "Lcom/marrow/data/dataprovider/bookmark/IBookmarkDataProvider;", "activityArguments", "Lcom/marrow/di/activity/ActivityArguments;", "subjectDataProvider", "Lcom/marrow/data/dataprovider/subject/ISubjectDataProvider;", "playbackUrlRepository", "Lcom/marrow/video/components/playbackurl/repo/PlaybackUrlRepository;", "videoPlayerRepository", "Lcom/marrow/ui/fragments/learn/video/VideoPlayerRepository;", "playbackConfigRepository", "Lcom/marrow/data/dataprovider/video/playbackconfig/repo/PlaybackConfigRepository;", "analytics", "Lcom/marrow/dranalytics/base/AnalyticPublisher;", "videoListUseCase", "Lcom/marrow2/domain/video/lesson_list/VideoListUseCase;", "remoteConfigUseCase", "Lcom/marrow2/domain/remoteconfig/RemoteConfigUseCase;", "ioDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "mainDispatcher", "<init>", "(Lcom/marrow/data/dataprovider/subscription/ISubscriptionDataProvider;Lcom/marrow/infoprovider/rooting/IRootInfoProvider;Lcom/marrow/data/dataprovider/lesson/detail/LessonDetailDataSource$Repository;Lcom/marrow/data/dataprovider/common/IResourceProvider;Lcom/marrow/data/dataprovider/home/ICacheHomeDataProvider;Lcom/marrow/data/dataprovider/remoteconfig/IRemoteConfigDataProvider;Lcom/marrow/data/dataprovider/lesson/LessonRepository;Lcom/marrow/data/dataprovider/video/cache/VideoCacheDataSource;Lcom/marrow2/domain/security/SecurityUseCase;Lcom/marrow2/domain/download_video/VideoDownloadUseCase;Lcom/marrow/data/dataprovider/video/space/ISpaceInfoProvider;Lcom/marrow/data/dataprovider/lesson/step/StepLocalDataSource;Lcom/marrow/data/dataprovider/common/crypto/video/IDecryptionDataProvider;Lcom/marrow/data/dataprovider/preference/IPreferenceDataProvider;Lcom/marrow/mvp/Connectivity;Lio/reactivex/Scheduler;Lio/reactivex/Scheduler;Lcom/marrow/dataprovider/crash/ICrashDataProvider;Lcom/marrow/data/dataprovider/user/IUserProfileProvider;Lcom/marrow/data/dataprovider/lesson/personalisation/ILessonHomeProvider;Lcom/marrow/data/models/common/ApplicationData;Lcom/marrow/ui/adapter/video/timeline/TimelineAdapterContract$Presenter;Lcom/marrow/ui/activities/learn/video/LessonVideoContract$View;Lcom/marrow/data/dataprovider/home/ICacheHomeDataProvider;Lcom/marrow/data/dataprovider/courseConfig/CourseConfigDataProvider;Lcom/marrow/data/dataprovider/video/resume/IVideoResumeDataProvider;Lcom/marrow/data/dataprovider/video/timeline/IVideoTimelineDataProvider;Lcom/marrow/data/dataprovider/bookmark/IBookmarkDataProvider;Lcom/marrow/di/activity/ActivityArguments;Lcom/marrow/data/dataprovider/subject/ISubjectDataProvider;Lcom/marrow/video/components/playbackurl/repo/PlaybackUrlRepository;Lcom/marrow/ui/fragments/learn/video/VideoPlayerRepository;Lcom/marrow/data/dataprovider/video/playbackconfig/repo/PlaybackConfigRepository;Lcom/marrow/dranalytics/base/AnalyticPublisher;Lcom/marrow2/domain/video/lesson_list/VideoListUseCase;Lcom/marrow2/domain/remoteconfig/RemoteConfigUseCase;Lkotlinx/coroutines/CoroutineDispatcher;Lkotlinx/coroutines/CoroutineDispatcher;)V", "lessonId", "", "analyticsSource", "Lcom/marrow2/ui/video/lesson_list/analytics/VideoLessonListAnalytics$Source;", "isFromWatchNext", "", "eventBroadcaster", "Lcom/marrow/ui/activities/learn/video/LessonVideoContract$Broadcaster;", "downloadInterface", "Lcom/marrow/ui/activities/learn/video/LessonVideoContract$DownloadInterface;", "relatedLessonAdapterPresenter", "Lcom/marrow/ui/adapter/lesson/LessonAdapterContract$Presenter;", "kycStatus", "", "videoStateListener", "Lcom/marrow/interfaces/VideoStateManager;", "lessonIndex", "Lcom/marrow/data/models/lesson/LessonIndex;", "relatedModuleList", "", "Lcom/marrow/data/models/lesson/tab/LessonTabItem;", "presenterScope", "Lkotlinx/coroutines/CoroutineScope;", "notesUnavailableConfig", "Lcom/marrow2/data/remoteconfig/repo/model/NotesUnavailableConfig;", "notesUnavailableConfigJob", "Lkotlinx/coroutines/Job;", "resolveNotesUnavailableMessage", "rootSubjectId", "timelines", "getTimelines", "()Ljava/util/List;", "timelines$delegate", "Lkotlin/Lazy;", "videoInfo", "Lcom/marrow/data/models/content/VideoInfo;", "getVideoInfo", "()Lcom/marrow/data/models/content/VideoInfo;", "videoAspectRatio", "", "courseConfig", "Lcom/marrow/data/models/common/CourseConfigV2;", "getCourseConfig", "()Lcom/marrow/data/models/common/CourseConfigV2;", "courseConfig$delegate", "isLessonUnlocked", "selectedTab", "Lcom/marrow/data/models/common/CourseConfigV2$VideoPageItem;", "isSeekBroadcastReceived", "sSeekTimestamp", "isInternalPipWindowClosed", "currentState", "Lcom/marrow/dataprovider/common/VideoDownloadStatus;", "currentNotesPosition", "currentSlidesPosition", "areNotesExpanded", "getAreNotesExpanded", "()Z", "setAreNotesExpanded", "(Z)V", "isInPictureInPictureMode", "currentNoteExpandSource", "Lcom/marrow/ui/activities/learn/video/LessonVideoPresenter$NoteExpandSource;", "imageAttributionLink", "SOURCE_MARK_COMPLETE_BTN", "SOURCE_WATCH_NEXT", "activeRecallLessonUiModel", "Lcom/marrow/ui/fragments/learn/model/ActiveRecallQbankLessonUiModel;", "currentDockPosition", "Lcom/marrow/ui/activities/learn/video/pip/PipDockPosition;", "onCreate", "", "lessonAdapterPresenter", "loadLesson", "loadActiveRecall", "forceFetch", "renderActiveRecallCard", "onConfigurationChanged", "onActiveRecallMcqPlayActivityResultReceived", "refetchActiveRecallQbank", "checkPlaybackCapability", "loadDetailAsync", "getStateVariable", "Lcom/marrow/data/models/common/PresenterBundle;", "setVideoNewHeight", "isFullVideoView", "videoHeight", "isConstraintToLandscapeDesign", "onDestroy", "getVideoAspectRatio", "onLoad", CrossDeviceSyncResponseObject.CONTENT_TYPE_LESSON, "loadItems", "sendVideoOpenedEvent", "onVideoInfoLoad", "vidInfo", "hasNotes", "onCacheInfoAvailable", "videoCacheInfo", "Lcom/marrow/data/models/video/cache/VideoCacheInfo;", "onCacheNotAvailable", "setDownloadStatusIconAndText", "onCurrentTopicClicked", "onAutoMarkComplete", "onMarkCompleteTapped", "onMarkComplete", "subjectId", "onMarkIncomplete", "onVideoDownload", "id", "downloadPercent", "downloadFeedbackText", "updateDownloadButton", "downloadProgress", "onDownloadButtonClicked", "onDownloadButtonTapped", "onOpenSavedVideosClicked", "downloadAndShowPixelOptions", "onCallFailed", "throwable", "", "key", "msg", "onPixelRateSelected", "downloadPixelRate", "downloadSessionId", "videoResumed", "downloadTheme", "Lcom/marrow/data/models/video/ThemeState;", "availableThemes", "applyDecision", "decision", "Lcom/marrow/ui/activities/learn/video/model/DownloadDecisionUIState;", "resolveDownloadDecision", "logd", "recordSimpleCrash", "onRefreshTokenResponse", "response", "Lcom/marrow/data/api/models/response/ApiResponse;", "Lcom/marrow/data/api/models/response/user/LoggedUserResponse;", "uploadCrash", "e", "onStopDownloadTapped", "onDeleteDownloadTapped", "beginDownload", CourseConfigKeyConstantsKt.KEY_THEME, "onDeleteDownloadConfirmationTapped", "onStreamOnlineTapped", "onStreamOfflineTapped", "onPipModeChanged", "setPipInterface", "pipInterface", "onUserLeftScreen", "onResume", "onDownloadResolutionSelected", "downloadableResolution", "Lcom/marrow/data/models/video/DownloadableResolution;", "onItemClicked", "itemPosition", "item", "onSeekBroadcastReceived", "seconds", "onPostResume", "populateRelatedModules", "launchNotesScreen", "launchSource", "getDeleteLessonVideoFlowable", "Lio/reactivex/Flowable;", "deleteLocalDownload", "processLockedLesson", "onNotesResultReceived", "onGalleryResultReceived", "currentTimestamp", "onQueuedClicked", "onDownloadCompletedClicked", "onDeveloperOptionsEnabledDialogDismissed", "onPipPlayTapped", "onPipPauseTapped", "backPress", "onWarningAgreeClick", "onViewInFocus", "hasFocus", "getRelatedModules", "loadRelatedModules", "onRelatedLessonClicked", "model", "onActiveRecallModuleClicked", "onTimelineBookmarkClicked", "buttonId", "position", "pauseVideo", "onVideoTitleClickedV2", "isExpanded", "onNotesCtaClicked", "areEnabled", "onNotesResizeClicked", "forceCollapseNotes", "onNotesDismissIconClicked", "trackNotesResizeAnalytics", "isExpanding", "onGoToInternalPip", "onNotesViewReady", "onExitInternalPip", "closeInternalPip", "shrinkNotesAndExpandVideo", "expandNotesAndShrinkVideo", "source", "logVideoPipCloseEventOnBackPress", "logVideoDockingEvent", "logExternalPipExpandEvent", "requestPipMoveToBottomRight", "getCurrentExpandNoteSource", "updateCurrentExpandNoteSource", "updatedSource", "sendEventBroadcast", "event", "onVideoScreenDestroyed", "updateBookmarkStateInTimelineList", "timelineId", "bookmarkState", "showExpandedList", "checkRootPackages", "checkDeveloperOptions", "setRating", "rating", "logCastingEvent", "onImageAttributionsClick", "onExpandTopicsList", "isImageAttributionLinkAvailable", "checkKycStatus", "processDownloadableResolutions", "Lkotlin/Pair;", "Lcom/marrow/data/dataprovider/video/playbackconfig/repo/models/ResolutionConfigRepoModel;", "Lcom/marrow/video/components/playbackurl/repo/models/VideoResolutionRepoModel;", "onKycCloseClicked", "onVideoSuccessfullyRated", "isUserRatedVideo", "processRatingEligibilityDialog", "isEligible", "onInAppRatingFlowCompleted", "onInAppRatingFlowException", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "recalculateHeightWhenNotesExpanded", "updateDockState", "resetDockState", "handlePostLayoutDocking", PaymentConstants.Category.CONFIG, "Lcom/marrow/ui/activities/learn/video/pip/PipLayoutConfig;", "pipHeight", "pipWidth", "adjustPipPositionWithinBounds", "width", "height", "onWatchNextSubjectClicked", "isLegacyVideoNavPrevTaskEnabled", "isUserEligibleForInAppRatingPopup", "getInAppRatingCourseThreshold", "Lcom/marrow2/data/inapprating/remote/model/InAppRatingThreshHoldRemoteModel;", "courseId", "hasCompletedMinRequiredVideos", "minRequiredVideoCompletions", "resetInternalPipWindowClosedFlag", "getActiveRecallData", "Lio/reactivex/Single;", "NoteExpandSource", "Companion", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class fromStyleLine extends isRtspStartLine<parseAlignment.write> implements parseAlignment.IconCompatParcelizer, readFromInput.RemoteActionCompatParcelizer<Timeline> {
    private static int $10 = 0;
    private static int $11 = 1;
    public static final read IconCompatParcelizer;
    private static char[] addObserverForBackInvoker;
    private static int ensureViewModelStore;
    private final String AudioAttributesCompatParcelizer;
    private final isSeekPending AudioAttributesImplApi21Parcelizer;
    private StandardIntegrityVerdictOptOut.read AudioAttributesImplApi26Parcelizer;
    private final createEmptyAdGroups AudioAttributesImplBaseParcelizer;
    private final ApplicationData MediaBrowserCompatCustomActionResultReceiver;
    private boolean MediaBrowserCompatItemReceiver;
    private final withAllAdsReset MediaBrowserCompatMediaItem;
    private final withLastAdRemoved MediaBrowserCompatSearchResultReceiver;
    private int MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    private maybeSkipComment MediaDescriptionCompat;
    private final getChannel MediaMetadataCompat;
    private final readTimestamp MediaSessionCompatQueueItem;
    private final Object MediaSessionCompatResultReceiverWrapper;
    private final RtspMediaSource1 MediaSessionCompatToken;
    private int ParcelableVolumeInfo;
    private final getSampleFormats PlaybackStateCompat;
    private WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer PlaybackStateCompatCustomAction;
    private final RenewEligible RatingCompat;
    private final releaseDisabledStreams ResultReceiver;
    private final Object _init_lambda2;
    private final getNextChunkIndex _init_lambda3;
    private RtspMediaTrack _init_lambda4;
    private final getStreamIndexToTrackGroupIndex _init_lambda5;
    private final newSampleStreamArray accessaddObserverForBackInvoker;
    private final Object accessensureViewModelStore;
    private final lambdanewSingleThreadScheduledExecutor4 accessgetReportFullyDrawnExecutorp;
    private getVariantWithSubtitleGroup handleMediaPlayPauseIfPendingOnHandler;
    private final withAdGroupTimeUs onAddQueueItem;
    private IconCompatParcelizer onCommand;
    private parseAlignment.RemoteActionCompatParcelizer onCustomAction;
    private parseAlignment.AudioAttributesCompatParcelizer onFastForward;
    private final boolean onMediaButtonEvent;
    private String onPause;
    private final getPlatform onPlay;
    private final withAllAdsReset onPlayFromMediaId;
    private boolean onPlayFromSearch;
    private boolean onPlayFromUri;
    private boolean onPrepare;
    private boolean onPrepareFromMediaId;
    private final int onPrepareFromSearch;
    private final String onPrepareFromUri;
    private final hasMediaSource onRemoveQueueItem;
    private final AdsMediaSourceAdLoadException.IconCompatParcelizer onRemoveQueueItemAt;
    private final onAdPlaybackState onRewind;
    private LessonIndex onSeekTo;
    private final getDataSpec onSetCaptioningEnabled;
    private final getPlatform onSetPlaybackSpeed;
    private final setPassingYear onSetRating;
    private PercentileTimeToFirstByteEstimator onSetRepeatMode;
    private final DashManifestStaleException onSetShuffleMode;
    private final TopUserCompanion onSkipToNext;
    private final Object onSkipToPrevious;
    private List<? extends LessonTabItem<?>> onSkipToQueueItem;
    private skipComment.RemoteActionCompatParcelizer onStop;
    private final BundledChunkExtractorExternalSyntheticLambda0 r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    private final ChunkHolder r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
    private final AdsMediaSourceAdPrepareListener r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    private final RenewEligible r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28;
    private float r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
    private VideoInfo r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
    private ActiveRecallQbankLessonUiModel read;
    private final getStreamPositionUsForContent setSessionImpl;
    private final String write;
    private static final byte[] $$d = {79, -100, -79, 21, 11, -3, -64, 56, 7, -1, -9, 4, -8, -56, TarConstants.LF_SYMLINK, 12, -11, 13, -4, -7, -6, -55, 56, 5, 5, -70, TarConstants.LF_BLK, 11, -3, -1, 1, -2, -65, 58, 4, 5, -16, 12, -5, -14, 10, -63, TarConstants.LF_GNUTYPE_LONGLINK, -26, 0, 18, 7, 1, 4, -16, -37, 33, 16, -12, 5, -2, -44, 43, -3, 2, -16, 18, -37, 16, 16, -16, 1, 6, -4, 16, -22, 12, 11, -3, -64, 62, -13, 16, -1, -4, 7, -74, 70, -13, -60, TarConstants.LF_SYMLINK, 1, 16, -12, 12, -14, 10, -12, -5, 13, -70, TarConstants.LF_FIFO, 12, -1, -4, 2, -69, 22, 44, -1, -4, 2, -29, 18, -5, 17, -43, 33, -12, 0, 6, -73, 77, -14, -5, 2, -14, -5, 2, 4, -65, 59, 10, -3, -4, -16, 23, -76, 57, 16, -10, -12, 12, 0, -16, 6, -62, 64, 4, -20, -52, 35, 18, 6, -8, -5, 17, -15, -35, 43, -2, -9, 2, -3, -29, 40, -66, 21, 32, 0, -6, 19, -10, 7, -52, 44, -14, 10, 12, -6, -12, -7, 15, -49, 43, -4, -1, -8, -3, 16, -6, 2, -46, TarConstants.LF_SYMLINK, -5, -16, 12, -5, -14, 10, -26, 37, -12, 5, -13, -4, 14, -12, -7, -24, 20, 11, -12, 1, -4, -44, -3, -17, 45, 18, 7, 1, 4, -16, -37, 33, 16, -12, 5, -2, -44, 43, -3, 2, -16, 18, -37, 16, 16, -16, 1, 6, -4, 16, -22, 12, 11, -3, -64, 62, -13, 16, -1, -4, 7, -74, 37, 29, -18, 7, 4, -6, 4, -8, -39, 46, -1, -5, -4, -7, -3, 18, -12, 5, -2, TarConstants.LF_CHR, -18, 4, 5, -47, TarConstants.LF_SYMLINK, -1, -3, -10, -8, 18, -2, -16, 13, -43, 35, 2, -5, -43, 30, 17, -15, -22, 16, 16, -16, 1, 6, -4, 16, -22, 12};
    private static final int $$e = 137;
    private static final byte[] $$a = {TarConstants.LF_GNUTYPE_LONGLINK, 94, -43, -123, 7, 11, -9, 17, -24, -10, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, -50, 19, -3, -4, TarConstants.LF_NORMAL, -49, 2, 4, 11, 9, -17, 3, 17, -12, TarConstants.LF_SYMLINK, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, -17, -6, 0, -3, 17, 38, -32, -15, 13, -4, 3, 45, -42, 4, -1, 17, -17, 38, -15, -15, 17, 0, -5, 5, -15, 23, -11, 15, 6, -1};
    private static final int $$b = 146;
    private static int createFullyDrawnExecutor = 1;
    private static int accessonBackPresseds1027565324 = 0;
    private static int addObserverForBackInvokerlambda7 = 1;

    public static final /* synthetic */ class RemoteActionCompatParcelizer {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;
        public static final /* synthetic */ int[] read;

        static {
            int[] iArr = new int[CourseConfigV2.VideoPageItem.values().length];
            try {
                iArr[CourseConfigV2.VideoPageItem.NOTES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CourseConfigV2.VideoPageItem.OVERVIEW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CourseConfigV2.VideoPageItem.RELATED_MODULE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            read = iArr;
            int[] iArr2 = new int[getVariantWithSubtitleGroup.values().length];
            try {
                iArr2[getVariantWithSubtitleGroup.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[getVariantWithSubtitleGroup.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[getVariantWithSubtitleGroup.RemoteActionCompatParcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[getVariantWithSubtitleGroup.write.ordinal()] = 4;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[getVariantWithSubtitleGroup.read.ordinal()] = 5;
            } catch (NoSuchFieldError unused8) {
            }
            RemoteActionCompatParcelizer = iArr2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r6, byte r7, byte r8, java.lang.Object[] r9) {
        /*
            byte[] r0 = kotlin.fromStyleLine.$$a
            int r6 = r6 + 65
            int r1 = 31 - r7
            int r8 = 84 - r8
            byte[] r1 = new byte[r1]
            int r7 = 30 - r7
            r2 = 0
            if (r0 != 0) goto L13
            r6 = r7
            r3 = r8
            r4 = r2
            goto L28
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r1[r3] = r4
            int r4 = r3 + 1
            if (r3 != r7) goto L23
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L23:
            r3 = r0[r8]
            r5 = r3
            r3 = r8
            r8 = r5
        L28:
            int r8 = -r8
            int r6 = r6 + r8
            int r8 = r3 + 1
            int r6 = r6 + 2
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.fromStyleLine.a(int, byte, byte, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0023  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001b  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0023 -> B:11:0x0025). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void c(byte r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            int r0 = 81 - r5
            int r7 = r7 + 4
            byte[] r1 = kotlin.fromStyleLine.$$d
            int r6 = r6 + 65
            byte[] r0 = new byte[r0]
            int r5 = 80 - r5
            r2 = 0
            if (r1 != 0) goto L13
            r3 = r6
            r4 = r2
            r6 = r5
            goto L25
        L13:
            r3 = r2
        L14:
            byte r4 = (byte) r6
            r0[r3] = r4
            int r4 = r3 + 1
            if (r3 != r5) goto L23
            java.lang.String r5 = new java.lang.String
            r5.<init>(r0, r2)
            r8[r2] = r5
            return
        L23:
            r3 = r1[r7]
        L25:
            int r6 = r6 + r3
            int r7 = r7 + 1
            int r6 = r6 + 1
            r3 = r4
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.fromStyleLine.c(byte, int, int, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object write(int i, int i2, int i3, Object[] objArr, int i4, int i5, int i6) {
        int i7 = ~i6;
        int i8 = ~(i7 | i2);
        int i9 = ~i3;
        int i10 = (~(i9 | i6)) | i8;
        int i11 = ~i2;
        int i12 = i11 | i6;
        int i13 = i10 | (~i12);
        int i14 = i7 | i3;
        int i15 = i8 | (~i14);
        int i16 = (~(i2 | i14)) | (~(i7 | i9 | i11)) | (~(i12 | i3));
        int i17 = i6 + i3 + i5 + ((-1254723898) * i4) + ((-1667789834) * i);
        int i18 = i17 * i17;
        int i19 = ((-534547663) * i6) + 1379663872 + ((-481802647) * i3) + ((-17581672) * i13) + (35163344 * i15) + (17581672 * i16) + ((-499384320) * i5) + ((-1033371648) * i4) + ((-106430464) * i) + (1552875520 * i18);
        int i20 = ((i6 * (-402395399)) - 1316031342) + (i3 * (-402392591)) + (i13 * (-936)) + (i15 * 1872) + (i16 * 936) + (i5 * (-402393527)) + (i4 * (-1219896714)) + (i * (-610841306)) + (i18 * (-825819136));
        switch (i19 + (i20 * i20 * (-1063190528))) {
            case 1:
                return write(objArr);
            case 2:
                return RemoteActionCompatParcelizer(objArr);
            case 3:
                return IconCompatParcelizer(objArr);
            case 4:
                return read(objArr);
            case 5:
                return AudioAttributesImplApi26Parcelizer(objArr);
            case 6:
                return MediaBrowserCompatCustomActionResultReceiver(objArr);
            case 7:
                return AudioAttributesImplBaseParcelizer(objArr);
            case 8:
                return AudioAttributesImplApi21Parcelizer(objArr);
            case 9:
                return MediaBrowserCompatItemReceiver(objArr);
            case 10:
                return MediaDescriptionCompat(objArr);
            case 11:
                fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
                int iIntValue = ((Number) objArr[1]).intValue();
                String str = (String) objArr[2];
                int i21 = 2 % 2;
                int i22 = addObserverForBackInvokerlambda7 + 3;
                accessonBackPresseds1027565324 = i22 % 128;
                int i23 = i22 % 2;
                getShowPopup getshowpopupIconCompatParcelizer = IconCompatParcelizer(fromstyleline, iIntValue, str);
                int i24 = addObserverForBackInvokerlambda7 + 87;
                accessonBackPresseds1027565324 = i24 % 128;
                int i25 = i24 % 2;
                return getshowpopupIconCompatParcelizer;
            case 12:
                return RatingCompat(objArr);
            case 13:
                return MediaBrowserCompatMediaItem(objArr);
            case 14:
                return MediaMetadataCompat(objArr);
            case 15:
                return MediaBrowserCompatSearchResultReceiver(objArr);
            case 16:
                return onCommand(objArr);
            case 17:
                final fromStyleLine fromstyleline2 = (fromStyleLine) objArr[0];
                final String str2 = (String) objArr[1];
                int i26 = 2 % 2;
                accessgetEmptyStatecp accessgetemptystatecpAudioAttributesCompatParcelizer = parseCea708AccessibilityChannel.AudioAttributesCompatParcelizer(new parseCea708AccessibilityChannel.RemoteActionCompatParcelizer() { // from class: o.SubripDecoder
                    @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
                    public final Object write() {
                        return fromStyleLine.AudioAttributesCompatParcelizer(this.write, str2);
                    }
                });
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpAudioAttributesCompatParcelizer, "");
                int i27 = accessonBackPresseds1027565324 + 91;
                addObserverForBackInvokerlambda7 = i27 % 128;
                int i28 = i27 % 2;
                return accessgetemptystatecpAudioAttributesCompatParcelizer;
            case 18:
                return onCustomAction(objArr);
            case 19:
                return onAddQueueItem(objArr);
            case 20:
                return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(objArr);
            case 21:
                return handleMediaPlayPauseIfPendingOnHandler(objArr);
            case 22:
                return onMediaButtonEvent(objArr);
            case 23:
                return onFastForward(objArr);
            case 24:
                return onPause(objArr);
            case 25:
                return onPlay(objArr);
            case 26:
                fromStyleLine fromstyleline3 = (fromStyleLine) objArr[0];
                int i29 = 2 % 2;
                int i30 = addObserverForBackInvokerlambda7 + 21;
                accessonBackPresseds1027565324 = i30 % 128;
                int i31 = i30 % 2;
                List list = (List) fromstyleline3.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28.RemoteActionCompatParcelizer();
                int i32 = accessonBackPresseds1027565324 + 121;
                addObserverForBackInvokerlambda7 = i32 % 128;
                int i33 = i32 % 2;
                return list;
            case 27:
                return onPlayFromMediaId(objArr);
            case 28:
                fromStyleLine fromstyleline4 = (fromStyleLine) objArr[0];
                int i34 = 2 % 2;
                int i35 = addObserverForBackInvokerlambda7 + 93;
                int i36 = i35 % 128;
                accessonBackPresseds1027565324 = i36;
                int i37 = i35 % 2;
                IconCompatParcelizer iconCompatParcelizer = fromstyleline4.onCommand;
                int i38 = i36 + 123;
                addObserverForBackInvokerlambda7 = i38 % 128;
                int i39 = i38 % 2;
                return iconCompatParcelizer;
            case 29:
                return onPrepareFromSearch(objArr);
            case 30:
                return onPlayFromSearch(objArr);
            case 31:
                return onPrepare(objArr);
            case 32:
                return onPrepareFromMediaId(objArr);
            case 33:
                return onPlayFromUri(objArr);
            case 34:
                return onSeekTo(objArr);
            case 35:
                return onPrepareFromUri(objArr);
            case 36:
                return onRemoveQueueItemAt(objArr);
            case 37:
                return onRemoveQueueItem(objArr);
            case 38:
                return onRewind(objArr);
            case 39:
                return onSetPlaybackSpeed(objArr);
            case 40:
                return onSetRepeatMode(objArr);
            case 41:
                return onSetShuffleMode(objArr);
            case 42:
                return onSetCaptioningEnabled(objArr);
            case 43:
                return onSetRating(objArr);
            case 44:
                fromStyleLine fromstyleline5 = (fromStyleLine) objArr[0];
                int i40 = 2 % 2;
                int i41 = addObserverForBackInvokerlambda7 + 61;
                int i42 = i41 % 128;
                accessonBackPresseds1027565324 = i42;
                int i43 = i41 % 2;
                Object obj = fromstyleline5.MediaSessionCompatResultReceiverWrapper;
                int i44 = i42 + 59;
                addObserverForBackInvokerlambda7 = i44 % 128;
                int i45 = i44 % 2;
                return obj;
            case 45:
                return onStop(objArr);
            default:
                return AudioAttributesCompatParcelizer(objArr);
        }
    }

    public static final class MediaBrowserCompatSearchResultReceiver<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return getConfigExpirySeconds.read(Integer.valueOf(((DownloadableResolution) t2).getResolutionHeight()), Integer.valueOf(((DownloadableResolution) t).getResolutionHeight()));
        }
    }

    public static final /* synthetic */ ActiveRecallQbankLessonUiModel AudioAttributesImplApi21Parcelizer(fromStyleLine fromstyleline) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 11;
        int i3 = i2 % 128;
        accessonBackPresseds1027565324 = i3;
        int i4 = i2 % 2;
        ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModel = fromstyleline.read;
        int i5 = i3 + 63;
        addObserverForBackInvokerlambda7 = i5 % 128;
        int i6 = i5 % 2;
        return activeRecallQbankLessonUiModel;
    }

    public static final /* synthetic */ getPlatform AudioAttributesImplApi26Parcelizer(fromStyleLine fromstyleline) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7;
        int i3 = i2 + 39;
        accessonBackPresseds1027565324 = i3 % 128;
        int i4 = i3 % 2;
        getPlatform getplatform = fromstyleline.onPlay;
        int i5 = i2 + 109;
        accessonBackPresseds1027565324 = i5 % 128;
        if (i5 % 2 == 0) {
            return getplatform;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object AudioAttributesImplBaseParcelizer(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 91;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        String str = fromstyleline.onPrepareFromUri;
        if (i3 != 0) {
            return str;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ String IconCompatParcelizer(fromStyleLine fromstyleline, String str) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 91;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        String strMediaBrowserCompatSearchResultReceiver = fromstyleline.MediaBrowserCompatSearchResultReceiver(str);
        int i4 = addObserverForBackInvokerlambda7 + 61;
        accessonBackPresseds1027565324 = i4 % 128;
        if (i4 % 2 == 0) {
            return strMediaBrowserCompatSearchResultReceiver;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ getChildCount IconCompatParcelizer(fromStyleLine fromstyleline, VideoInfo videoInfo, int i, String str, boolean z, ThemeState themeState) {
        int i2 = 2 % 2;
        int i3 = accessonBackPresseds1027565324 + 13;
        addObserverForBackInvokerlambda7 = i3 % 128;
        if (i3 % 2 != 0) {
            return fromstyleline.read(videoInfo, i, str, z, themeState);
        }
        fromstyleline.read(videoInfo, i, str, z, themeState);
        throw null;
    }

    public static final /* synthetic */ onAdPlaybackState MediaBrowserCompatCustomActionResultReceiver(fromStyleLine fromstyleline) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 17;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        onAdPlaybackState onadplaybackstate = fromstyleline.onRewind;
        if (i3 != 0) {
            return onadplaybackstate;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ isSeekPending MediaBrowserCompatItemReceiver(fromStyleLine fromstyleline) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324;
        int i3 = i2 + 45;
        addObserverForBackInvokerlambda7 = i3 % 128;
        int i4 = i3 % 2;
        isSeekPending isseekpending = fromstyleline.AudioAttributesImplApi21Parcelizer;
        int i5 = i2 + 59;
        addObserverForBackInvokerlambda7 = i5 % 128;
        int i6 = i5 % 2;
        return isseekpending;
    }

    public static final /* synthetic */ readTimestamp MediaBrowserCompatMediaItem(fromStyleLine fromstyleline) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 109;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        readTimestamp readtimestamp = fromstyleline.MediaSessionCompatQueueItem;
        if (i3 != 0) {
            return readtimestamp;
        }
        throw null;
    }

    public static final /* synthetic */ LessonIndex MediaBrowserCompatSearchResultReceiver(fromStyleLine fromstyleline) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 25;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        LessonIndex lessonIndex = fromstyleline.onSeekTo;
        if (i3 != 0) {
            int i4 = 72 / 0;
        }
        return lessonIndex;
    }

    public static final /* synthetic */ List MediaMetadataCompat(fromStyleLine fromstyleline) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 65;
        int i3 = i2 % 128;
        addObserverForBackInvokerlambda7 = i3;
        int i4 = i2 % 2;
        List<? extends LessonTabItem<?>> list = fromstyleline.onSkipToQueueItem;
        int i5 = i3 + 61;
        accessonBackPresseds1027565324 = i5 % 128;
        int i6 = i5 % 2;
        return list;
    }

    public static final /* synthetic */ setPassingYear RatingCompat(fromStyleLine fromstyleline) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 105;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        setPassingYear setpassingyear = fromstyleline.onSetRating;
        if (i3 != 0) {
            return setpassingyear;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static final /* synthetic */ Object handleMediaPlayPauseIfPendingOnHandler$532eb113(fromStyleLine fromstyleline) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 73;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        Object obj = fromstyleline._init_lambda2;
        if (i3 == 0) {
            return obj;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static final /* synthetic */ lambdanewSingleThreadScheduledExecutor4 onAddQueueItem(fromStyleLine fromstyleline) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7;
        int i3 = i2 + 125;
        accessonBackPresseds1027565324 = i3 % 128;
        int i4 = i3 % 2;
        lambdanewSingleThreadScheduledExecutor4 lambdanewsinglethreadscheduledexecutor4 = fromstyleline.accessgetReportFullyDrawnExecutorp;
        int i5 = i2 + 87;
        accessonBackPresseds1027565324 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 74 / 0;
        }
        return lambdanewsinglethreadscheduledexecutor4;
    }

    public static final /* synthetic */ String onCustomAction(fromStyleLine fromstyleline) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324;
        int i3 = i2 + 109;
        addObserverForBackInvokerlambda7 = i3 % 128;
        int i4 = i3 % 2;
        String str = fromstyleline.write;
        int i5 = i2 + 65;
        addObserverForBackInvokerlambda7 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    public static final /* synthetic */ void read(fromStyleLine fromstyleline, PercentileTimeToFirstByteEstimator percentileTimeToFirstByteEstimator) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7;
        int i3 = i2 + 119;
        accessonBackPresseds1027565324 = i3 % 128;
        int i4 = i3 % 2;
        fromstyleline.onSetRepeatMode = percentileTimeToFirstByteEstimator;
        int i5 = i2 + 73;
        accessonBackPresseds1027565324 = i5 % 128;
        int i6 = i5 % 2;
    }

    public static final /* synthetic */ void write(fromStyleLine fromstyleline, getChildCount getchildcount) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 67;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        fromstyleline.write(getchildcount);
        if (i3 != 0) {
            int i4 = 0 / 0;
        }
    }

    @Override // o.readFromInput.RemoteActionCompatParcelizer
    public final /* synthetic */ void read(int i, Timeline timeline) {
        int i2 = 2 % 2;
        int i3 = accessonBackPresseds1027565324 + 115;
        addObserverForBackInvokerlambda7 = i3 % 128;
        int i4 = i3 % 2;
        AudioAttributesCompatParcelizer(i, timeline);
        int i5 = accessonBackPresseds1027565324 + 91;
        addObserverForBackInvokerlambda7 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @setSdkPayload
    public fromStyleLine(ChunkHolder chunkHolder, RtspMediaSource1 rtspMediaSource1, AdsMediaSourceAdLoadException.IconCompatParcelizer iconCompatParcelizer, endsWithLivePostrollPlaceHolder endswithlivepostrollplaceholder, withAllAdsReset withalladsreset, getSampleFormats getsampleformats, onAdPlaybackState onadplaybackstate, getDataSpec getdataspec, Object obj, Object obj2, releaseDisabledStreams releasedisabledstreams, AdsMediaSourceAdPrepareListener adsMediaSourceAdPrepareListener, withAdGroupTimeUs withadgrouptimeus, getStreamPositionUsForContent getstreampositionusforcontent, getChannel getchannel, getIds getids, getIds getids2, parseLongAttr parselongattr, getNextChunkIndex getnextchunkindex, hasMediaSource hasmediasource, ApplicationData applicationData, WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer iconCompatParcelizer2, parseAlignment.write writeVar, withAllAdsReset withalladsreset2, withLastAdRemoved withlastadremoved, getStreamIndexToTrackGroupIndex getstreamindextotrackgroupindex, newSampleStreamArray newsamplestreamarray, createEmptyAdGroups createemptyadgroups, parseStringAttr parsestringattr, BundledChunkExtractorExternalSyntheticLambda0 bundledChunkExtractorExternalSyntheticLambda0, Object obj3, Object obj4, DashManifestStaleException dashManifestStaleException, isSeekPending isseekpending, lambdanewSingleThreadScheduledExecutor4 lambdanewsinglethreadscheduledexecutor4, readTimestamp readtimestamp, getPlatform getplatform, getPlatform getplatform2) {
        StandardIntegrityVerdictOptOut.read readVar;
        super(parselongattr, endswithlivepostrollplaceholder, getids, getids2, writeVar);
        toMagicModuleMetaRepoModel.write(chunkHolder, "");
        toMagicModuleMetaRepoModel.write(rtspMediaSource1, "");
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(endswithlivepostrollplaceholder, "");
        toMagicModuleMetaRepoModel.write(withalladsreset, "");
        toMagicModuleMetaRepoModel.write(getsampleformats, "");
        toMagicModuleMetaRepoModel.write(onadplaybackstate, "");
        toMagicModuleMetaRepoModel.write(getdataspec, "");
        toMagicModuleMetaRepoModel.write(obj, "");
        toMagicModuleMetaRepoModel.write(obj2, "");
        toMagicModuleMetaRepoModel.write(releasedisabledstreams, "");
        toMagicModuleMetaRepoModel.write(adsMediaSourceAdPrepareListener, "");
        toMagicModuleMetaRepoModel.write(withadgrouptimeus, "");
        toMagicModuleMetaRepoModel.write(getstreampositionusforcontent, "");
        toMagicModuleMetaRepoModel.write(getchannel, "");
        toMagicModuleMetaRepoModel.write(getids, "");
        toMagicModuleMetaRepoModel.write(getids2, "");
        toMagicModuleMetaRepoModel.write(parselongattr, "");
        toMagicModuleMetaRepoModel.write(getnextchunkindex, "");
        toMagicModuleMetaRepoModel.write(hasmediasource, "");
        toMagicModuleMetaRepoModel.write(applicationData, "");
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer2, "");
        toMagicModuleMetaRepoModel.write(writeVar, "");
        toMagicModuleMetaRepoModel.write(withalladsreset2, "");
        toMagicModuleMetaRepoModel.write(withlastadremoved, "");
        toMagicModuleMetaRepoModel.write(getstreamindextotrackgroupindex, "");
        toMagicModuleMetaRepoModel.write(newsamplestreamarray, "");
        toMagicModuleMetaRepoModel.write(createemptyadgroups, "");
        toMagicModuleMetaRepoModel.write(parsestringattr, "");
        toMagicModuleMetaRepoModel.write(bundledChunkExtractorExternalSyntheticLambda0, "");
        toMagicModuleMetaRepoModel.write(obj3, "");
        toMagicModuleMetaRepoModel.write(obj4, "");
        toMagicModuleMetaRepoModel.write(dashManifestStaleException, "");
        toMagicModuleMetaRepoModel.write(isseekpending, "");
        toMagicModuleMetaRepoModel.write(lambdanewsinglethreadscheduledexecutor4, "");
        toMagicModuleMetaRepoModel.write(readtimestamp, "");
        toMagicModuleMetaRepoModel.write(getplatform, "");
        toMagicModuleMetaRepoModel.write(getplatform2, "");
        this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4 = chunkHolder;
        this.MediaSessionCompatToken = rtspMediaSource1;
        this.onRemoveQueueItemAt = iconCompatParcelizer;
        this.MediaBrowserCompatMediaItem = withalladsreset;
        this.PlaybackStateCompat = getsampleformats;
        this.onRewind = onadplaybackstate;
        this.onSetCaptioningEnabled = getdataspec;
        this.MediaSessionCompatResultReceiverWrapper = obj;
        this._init_lambda2 = obj2;
        this.ResultReceiver = releasedisabledstreams;
        this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM = adsMediaSourceAdPrepareListener;
        this.onAddQueueItem = withadgrouptimeus;
        this.setSessionImpl = getstreampositionusforcontent;
        this.MediaMetadataCompat = getchannel;
        this._init_lambda3 = getnextchunkindex;
        this.onRemoveQueueItem = hasmediasource;
        this.MediaBrowserCompatCustomActionResultReceiver = applicationData;
        this.PlaybackStateCompatCustomAction = iconCompatParcelizer2;
        this.onPlayFromMediaId = withalladsreset2;
        this.MediaBrowserCompatSearchResultReceiver = withlastadremoved;
        this._init_lambda5 = getstreamindextotrackgroupindex;
        this.accessaddObserverForBackInvoker = newsamplestreamarray;
        this.AudioAttributesImplBaseParcelizer = createemptyadgroups;
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = bundledChunkExtractorExternalSyntheticLambda0;
        this.onSkipToPrevious = obj3;
        this.accessensureViewModelStore = obj4;
        this.onSetShuffleMode = dashManifestStaleException;
        this.AudioAttributesImplApi21Parcelizer = isseekpending;
        this.accessgetReportFullyDrawnExecutorp = lambdanewsinglethreadscheduledexecutor4;
        this.MediaSessionCompatQueueItem = readtimestamp;
        this.onPlay = getplatform;
        this.onSetPlaybackSpeed = getplatform2;
        this.onPrepareFromUri = PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(parsestringattr.AudioAttributesCompatParcelizer("lesson_id"));
        Serializable serializableWrite = parsestringattr.write("source");
        if (serializableWrite instanceof StandardIntegrityVerdictOptOut.read) {
            readVar = (StandardIntegrityVerdictOptOut.read) serializableWrite;
            int i = accessonBackPresseds1027565324 + 27;
            addObserverForBackInvokerlambda7 = i % 128;
            if (i % 2 == 0) {
                int i2 = 4 % 2;
            } else {
                int i3 = 2 % 2;
            }
        } else {
            int i4 = addObserverForBackInvokerlambda7 + 77;
            accessonBackPresseds1027565324 = i4 % 128;
            if (i4 % 2 == 0) {
                int i5 = 2 % 2;
            }
            readVar = null;
        }
        this.AudioAttributesImplApi26Parcelizer = readVar;
        this.onMediaButtonEvent = parsestringattr.IconCompatParcelizer("is_from_watch_next");
        this.onPrepareFromSearch = getnextchunkindex.IconCompatParcelizer().getInfo().getKycStatus();
        this.onSkipToQueueItem = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        TopUserCompanion topUserCompanionAudioAttributesCompatParcelizer = College.AudioAttributesCompatParcelizer(getAltContact.read(null).plus(getplatform2));
        this.onSkipToNext = topUserCompanionAudioAttributesCompatParcelizer;
        this.onSetRating = CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(topUserCompanionAudioAttributesCompatParcelizer, new MediaBrowserCompatItemReceiver(null), new MagicModuleSubmissionRequestBody() { // from class: o.parseAlignmentOverride
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj5, Object obj6) {
                return fromStyleLine.read((String) obj6);
            }
        });
        this.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.stripStyleOverrides
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return fromStyleLine.AudioAttributesImplBaseParcelizer(this.IconCompatParcelizer);
            }
        });
        this.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = 0.5f;
        this.RatingCompat = getRenewExpiresOn.RemoteActionCompatParcelizer(new getCreatedOnDateMs() { // from class: o.SsaStyleSsaBorderStyle
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return fromStyleLine.write(this.IconCompatParcelizer);
            }
        });
        this.handleMediaPlayPauseIfPendingOnHandler = getVariantWithSubtitleGroup.IconCompatParcelizer;
        this.onPause = "";
        this.write = "mark_complete_button";
        this.AudioAttributesCompatParcelizer = "watch_next";
        this.MediaDescriptionCompat = maybeSkipComment.write;
        this.PlaybackStateCompatCustomAction.write(this);
        this.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(new readFromInput.read() { // from class: o.SsaSubtitle
            @Override // o.readFromInput.read
            public final void IconCompatParcelizer(int i6, int i7, Object obj5) {
                fromStyleLine.read(this.read, i6, i7, (Timeline) obj5);
            }
        });
    }

    private static void b(byte[] bArr, int[] iArr, boolean z, Object[] objArr) throws Throwable {
        int i = 2;
        int i2 = 2 % 2;
        buildSetStopReasonIntent buildsetstopreasonintent = new buildSetStopReasonIntent();
        int i3 = iArr[0];
        int i4 = iArr[1];
        int i5 = iArr[2];
        int i6 = iArr[3];
        char[] cArr = addObserverForBackInvoker;
        long j = 0;
        if (cArr != null) {
            int i7 = $10 + 121;
            $11 = i7 % 128;
            int i8 = i7 % 2;
            int length = cArr.length;
            char[] cArr2 = new char[length];
            int i9 = 0;
            while (i9 < length) {
                int i10 = $11 + 39;
                $10 = i10 % 128;
                int i11 = i10 % i;
                try {
                    Object[] objArr2 = {Integer.valueOf(cArr[i9])};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-338863922);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > j ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == j ? 0 : -1)), 11614 - (SystemClock.uptimeMillis() > j ? 1 : (SystemClock.uptimeMillis() == j ? 0 : -1)), 20 - View.combineMeasuredStates(0, 0), -1786471333, false, "u", new Class[]{Integer.TYPE});
                    }
                    cArr2[i9] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                    i9++;
                    i = 2;
                    j = 0;
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause == null) {
                        throw th;
                    }
                    throw cause;
                }
            }
            cArr = cArr2;
        }
        char[] cArr3 = new char[i4];
        System.arraycopy(cArr, i3, cArr3, 0, i4);
        if (bArr != null) {
            char[] cArr4 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            char c = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                if (bArr[buildsetstopreasonintent.RemoteActionCompatParcelizer] == 1) {
                    int i12 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr3 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1429458299);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (ViewConfiguration.getJumpTapTimeout() >> 16), (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 22959, TextUtils.indexOf("", "", 0) + 43, -729418224, false, "x", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).charValue();
                } else {
                    int i13 = buildsetstopreasonintent.RemoteActionCompatParcelizer;
                    Object[] objArr4 = {Integer.valueOf(cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer]), Integer.valueOf(c)};
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1859710730);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (31588 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 9863, KeyEvent.normalizeMetaState(0) + 65, 277949343, false, "v", new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    cArr4[i13] = ((Character) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).charValue();
                }
                c = cArr4[buildsetstopreasonintent.RemoteActionCompatParcelizer];
                Object[] objArr5 = {buildsetstopreasonintent, buildsetstopreasonintent};
                Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1104966666);
                if (objRemoteActionCompatParcelizer4 == null) {
                    objRemoteActionCompatParcelizer4 = startForeground.read((char) (37822 - (ViewConfiguration.getScrollBarSize() >> 8)), TextUtils.getTrimmedLength("") + 9754, (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 27, 1066774687, false, "B", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5);
            }
            cArr3 = cArr4;
        }
        if (i6 > 0) {
            char[] cArr5 = new char[i4];
            System.arraycopy(cArr3, 0, cArr5, 0, i4);
            int i14 = i4 - i6;
            System.arraycopy(cArr5, 0, cArr3, i14, i6);
            System.arraycopy(cArr5, i6, cArr3, 0, i14);
        }
        if (z) {
            char[] cArr6 = new char[i4];
            buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                int i15 = $10 + 117;
                $11 = i15 % 128;
                int i16 = i15 % 2;
                cArr6[buildsetstopreasonintent.RemoteActionCompatParcelizer] = cArr3[(i4 - buildsetstopreasonintent.RemoteActionCompatParcelizer) - 1];
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
            }
            cArr3 = cArr6;
        }
        if (i5 > 0) {
            int i17 = $11 + 3;
            $10 = i17 % 128;
            char c2 = 2;
            if (i17 % 2 != 0) {
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 1;
            } else {
                buildsetstopreasonintent.RemoteActionCompatParcelizer = 0;
            }
            while (buildsetstopreasonintent.RemoteActionCompatParcelizer < i4) {
                cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] = (char) (cArr3[buildsetstopreasonintent.RemoteActionCompatParcelizer] - iArr[c2]);
                buildsetstopreasonintent.RemoteActionCompatParcelizer++;
                c2 = 2;
            }
        }
        String str = new String(cArr3);
        int i18 = $10 + 69;
        $11 = i18 % 128;
        int i19 = i18 % 2;
        objArr[0] = str;
    }

    static final class MediaBrowserCompatItemReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private Object IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            fromStyleLine fromstyleline;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                fromStyleLine fromstyleline2 = fromStyleLine.this;
                this.IconCompatParcelizer = fromstyleline2;
                this.RemoteActionCompatParcelizer = 1;
                Object objAudioAttributesCompatParcelizer = fromStyleLine.MediaBrowserCompatMediaItem(fromstyleline2).AudioAttributesCompatParcelizer(this);
                if (objAudioAttributesCompatParcelizer == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                obj = objAudioAttributesCompatParcelizer;
                fromstyleline = fromstyleline2;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                fromstyleline = (fromStyleLine) this.IconCompatParcelizer;
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            fromStyleLine.read(fromstyleline, (PercentileTimeToFirstByteEstimator) obj);
            return getShowPopup.INSTANCE;
        }

        MediaBrowserCompatItemReceiver(SampleVideos<? super MediaBrowserCompatItemReceiver> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return fromStyleLine.this.new MediaBrowserCompatItemReceiver(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatItemReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static final getShowPopup MediaDescriptionCompat(String str) {
        getShowPopup getshowpopup;
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 107;
        addObserverForBackInvokerlambda7 = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            getshowpopup = getShowPopup.INSTANCE;
            int i3 = 90 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(str, "");
            getshowpopup = getShowPopup.INSTANCE;
        }
        int i4 = accessonBackPresseds1027565324 + 125;
        addObserverForBackInvokerlambda7 = i4 % 128;
        if (i4 % 2 != 0) {
            return getshowpopup;
        }
        throw null;
    }

    private final String MediaBrowserCompatSearchResultReceiver(String str) {
        List<SlidingPercentileBandwidthStatistic> listAudioAttributesCompatParcelizer;
        Object next;
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 43;
        addObserverForBackInvokerlambda7 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            throw null;
        }
        PercentileTimeToFirstByteEstimator percentileTimeToFirstByteEstimator = this.onSetRepeatMode;
        if (percentileTimeToFirstByteEstimator != null && (listAudioAttributesCompatParcelizer = percentileTimeToFirstByteEstimator.AudioAttributesCompatParcelizer()) != null) {
            int i3 = accessonBackPresseds1027565324 + 1;
            addObserverForBackInvokerlambda7 = i3 % 128;
            int i4 = i3 % 2;
            Iterator<T> it = listAudioAttributesCompatParcelizer.iterator();
            while (true) {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) ((SlidingPercentileBandwidthStatistic) next).getWrite(), (Object) str)) {
                    int i5 = addObserverForBackInvokerlambda7 + 27;
                    accessonBackPresseds1027565324 = i5 % 128;
                    if (i5 % 2 != 0) {
                        obj.hashCode();
                        throw null;
                    }
                }
            }
            SlidingPercentileBandwidthStatistic slidingPercentileBandwidthStatistic = (SlidingPercentileBandwidthStatistic) next;
            if (slidingPercentileBandwidthStatistic != null) {
                String strAudioAttributesCompatParcelizer = slidingPercentileBandwidthStatistic.getRead();
                int i6 = addObserverForBackInvokerlambda7 + 5;
                accessonBackPresseds1027565324 = i6 % 128;
                int i7 = i6 % 2;
                return strAudioAttributesCompatParcelizer;
            }
        }
        return null;
    }

    private static final List onPrepare(fromStyleLine fromstyleline) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 119;
        addObserverForBackInvokerlambda7 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            VideoInfo videoInfoAccessensureViewModelStore = fromstyleline.accessensureViewModelStore();
            if (videoInfoAccessensureViewModelStore != null) {
                int i3 = addObserverForBackInvokerlambda7 + 107;
                accessonBackPresseds1027565324 = i3 % 128;
                if (i3 % 2 != 0) {
                    newSampleStreamArray newsamplestreamarray = fromstyleline.accessaddObserverForBackInvoker;
                    String mediaId = videoInfoAccessensureViewModelStore.getMediaId();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mediaId, "");
                    newsamplestreamarray.AudioAttributesCompatParcelizer(mediaId);
                    obj.hashCode();
                    throw null;
                }
                newSampleStreamArray newsamplestreamarray2 = fromstyleline.accessaddObserverForBackInvoker;
                String mediaId2 = videoInfoAccessensureViewModelStore.getMediaId();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mediaId2, "");
                List<Timeline> listAudioAttributesCompatParcelizer = newsamplestreamarray2.AudioAttributesCompatParcelizer(mediaId2);
                if (listAudioAttributesCompatParcelizer != null) {
                    return listAudioAttributesCompatParcelizer;
                }
            }
            List listRemoteActionCompatParcelizer = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
            int i4 = addObserverForBackInvokerlambda7 + 41;
            accessonBackPresseds1027565324 = i4 % 128;
            int i5 = i4 % 2;
            return listRemoteActionCompatParcelizer;
        }
        fromstyleline.accessensureViewModelStore();
        throw null;
    }

    private final VideoInfo accessensureViewModelStore() {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 11;
        int i3 = i2 % 128;
        addObserverForBackInvokerlambda7 = i3;
        int i4 = i2 % 2;
        VideoInfo videoInfo = this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0;
        if (videoInfo != null) {
            int i5 = i3 + 33;
            accessonBackPresseds1027565324 = i5 % 128;
            int i6 = i5 % 2;
            return videoInfo;
        }
        StepIndex stepIndex = this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM.read(this.onPrepareFromUri, 0);
        if (stepIndex == null) {
            getExternalPeriodUid.Companion companion = getExternalPeriodUid.INSTANCE;
            getExternalPeriodUid.Companion.RemoteActionCompatParcelizer("NULL StepIndex on lessonId ->".concat(String.valueOf(this.onPrepareFromUri)));
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).addOnPictureInPictureModeChangedListener();
            return null;
        }
        VideoInfo videoInfoIconCompatParcelizer = this.onAddQueueItem.IconCompatParcelizer(stepIndex);
        if (videoInfoIconCompatParcelizer == null) {
            getExternalPeriodUid.Companion companion2 = getExternalPeriodUid.INSTANCE;
            getExternalPeriodUid.Companion.RemoteActionCompatParcelizer("NULL VideoInfo on stepIndex ->".concat(String.valueOf(stepIndex.getId())));
        }
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = videoInfoIconCompatParcelizer;
        int i7 = addObserverForBackInvokerlambda7 + 43;
        accessonBackPresseds1027565324 = i7 % 128;
        int i8 = i7 % 2;
        return videoInfoIconCompatParcelizer;
    }

    private static /* synthetic */ Object onFastForward(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 91;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        CourseConfigV2 courseConfigV2 = (CourseConfigV2) fromstyleline.RatingCompat.RemoteActionCompatParcelizer();
        if (i3 != 0) {
            return courseConfigV2;
        }
        throw null;
    }

    private static /* synthetic */ Object handleMediaPlayPauseIfPendingOnHandler(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 73;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        CourseConfigV2 courseConfigV2IconCompatParcelizer = fromstyleline.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer();
        int i4 = addObserverForBackInvokerlambda7 + 79;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
        return courseConfigV2IconCompatParcelizer;
    }

    private static /* synthetic */ Object onPlayFromUri(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 81;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        fromstyleline.MediaBrowserCompatItemReceiver = zBooleanValue;
        if (i3 == 0) {
            return null;
        }
        int i4 = 11 / 0;
        return null;
    }

    public final boolean onCustomAction() {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 105;
        int i3 = i2 % 128;
        addObserverForBackInvokerlambda7 = i3;
        int i4 = i2 % 2;
        boolean z = this.MediaBrowserCompatItemReceiver;
        int i5 = i3 + 23;
        accessonBackPresseds1027565324 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lo/fromStyleLine$IconCompatParcelizer;", "", "<init>", "(Ljava/lang/String;I)V", "IconCompatParcelizer", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class IconCompatParcelizer {
        private static final /* synthetic */ IconCompatParcelizer[] RemoteActionCompatParcelizer;
        public static final IconCompatParcelizer IconCompatParcelizer = new IconCompatParcelizer("PLAYER_CONTROLS", 0);
        public static final IconCompatParcelizer AudioAttributesCompatParcelizer = new IconCompatParcelizer("NOTES_TOGGLE", 1);

        private IconCompatParcelizer(String str, int i) {
        }

        static {
            IconCompatParcelizer[] iconCompatParcelizerArr = read();
            RemoteActionCompatParcelizer = iconCompatParcelizerArr;
            getMagicModuleTimeline.IconCompatParcelizer(iconCompatParcelizerArr);
        }

        private static final /* synthetic */ IconCompatParcelizer[] read() {
            return new IconCompatParcelizer[]{IconCompatParcelizer, AudioAttributesCompatParcelizer};
        }

        public static IconCompatParcelizer valueOf(String str) {
            return (IconCompatParcelizer) Enum.valueOf(IconCompatParcelizer.class, str);
        }

        public static IconCompatParcelizer[] values() {
            return (IconCompatParcelizer[]) RemoteActionCompatParcelizer.clone();
        }
    }

    private static final void read(fromStyleLine fromstyleline, LessonTabItem lessonTabItem) {
        int i = 2 % 2;
        if (lessonTabItem != null) {
            int i2 = accessonBackPresseds1027565324 + 101;
            addObserverForBackInvokerlambda7 = i2 % 128;
            if (i2 % 2 == 0) {
                int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
                int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
                int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
                write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -904311476, new Object[]{fromstyleline, lessonTabItem}, iWrite3, iWrite2, 904311517);
                int i3 = 26 / 0;
            } else {
                int iWrite4 = maybeInvalidateForRendererCapabilitiesChange.write();
                int iWrite5 = maybeInvalidateForRendererCapabilitiesChange.write();
                int iWrite6 = maybeInvalidateForRendererCapabilitiesChange.write();
                write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite4, -904311476, new Object[]{fromstyleline, lessonTabItem}, iWrite6, iWrite5, 904311517);
            }
        }
        int i4 = accessonBackPresseds1027565324 + 39;
        addObserverForBackInvokerlambda7 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void write(parseAlignment.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer, parseAlignment.RemoteActionCompatParcelizer remoteActionCompatParcelizer, skipComment.RemoteActionCompatParcelizer remoteActionCompatParcelizer2) {
        HomeVideoModel[] videoModels;
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 111;
        accessonBackPresseds1027565324 = i2 % 128;
        HomeVideoModel homeVideoModel = null;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
            toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer2, "");
            this.onFastForward = audioAttributesCompatParcelizer;
            this.onCustomAction = remoteActionCompatParcelizer;
            this.onStop = remoteActionCompatParcelizer2;
            throw null;
        }
        toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer, "");
        toMagicModuleMetaRepoModel.write(remoteActionCompatParcelizer2, "");
        this.onFastForward = audioAttributesCompatParcelizer;
        this.onCustomAction = remoteActionCompatParcelizer;
        this.onStop = remoteActionCompatParcelizer2;
        if (remoteActionCompatParcelizer2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            remoteActionCompatParcelizer2 = null;
        }
        remoteActionCompatParcelizer2.write(new readFromInput.RemoteActionCompatParcelizer() { // from class: o.parseBorderStyle
            @Override // o.readFromInput.RemoteActionCompatParcelizer
            public final void read(int i3, Object obj) {
                fromStyleLine.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, (LessonTabItem) obj);
            }
        });
        if (accessgetReportFullyDrawnExecutorp()) {
            this.PlaybackStateCompatCustomAction.RemoteActionCompatParcelizer(((CourseConfigV2) write(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 121768406, new Object[]{this}, maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -121768383)).getVideoItems().contains(CourseConfigV2.VideoItem.KEY_VIDEO_BOOKMARKS));
            getSampleFormats getsampleformats = this.PlaybackStateCompat;
            getSampleFormats.Companion companion = getSampleFormats.INSTANCE;
            if (getsampleformats.read(getSampleFormats.Companion.MediaDescriptionCompat()) > 0) {
                int i3 = addObserverForBackInvokerlambda7 + 55;
                accessonBackPresseds1027565324 = i3 % 128;
                if (i3 % 2 != 0) {
                    this.MediaSessionCompatToken.write();
                    getSampleFormats getsampleformats2 = this.PlaybackStateCompat;
                    getSampleFormats.Companion companion2 = getSampleFormats.INSTANCE;
                    getsampleformats2.read(getSampleFormats.Companion.MediaDescriptionCompat());
                    homeVideoModel.hashCode();
                    throw null;
                }
                int iWrite = this.MediaSessionCompatToken.write();
                getSampleFormats getsampleformats3 = this.PlaybackStateCompat;
                getSampleFormats.Companion companion3 = getSampleFormats.INSTANCE;
                if (iWrite > getsampleformats3.read(getSampleFormats.Companion.MediaDescriptionCompat())) {
                    getSampleFormats getsampleformats4 = this.PlaybackStateCompat;
                    getSampleFormats.Companion companion4 = getSampleFormats.INSTANCE;
                    buildResolutionString.IconCompatParcelizer("ROOTING_STATUS_VALUE", String.valueOf(getsampleformats4.read(getSampleFormats.Companion.MediaDescriptionCompat())));
                    ((parseAlignment.write) this.RemoteActionCompatParcelizer).read(read(R.string.toast_rooted_device_video_blocked_warning));
                    ((parseAlignment.write) this.RemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer();
                    return;
                }
            }
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).onCreatePanelMenu();
            addObserverForBackInvokerlambda7();
            if (this.setSessionImpl.MediaBrowserCompatCustomActionResultReceiver("app_session_video")) {
                HomeMainModel homeMainModelAudioAttributesCompatParcelizer = this.onPlayFromMediaId.AudioAttributesCompatParcelizer();
                boolean z = false;
                if (homeMainModelAudioAttributesCompatParcelizer != null && (videoModels = homeMainModelAudioAttributesCompatParcelizer.getVideoModels()) != null) {
                    int length = videoModels.length;
                    int i4 = 0;
                    while (true) {
                        if (i4 >= length) {
                            break;
                        }
                        HomeVideoModel homeVideoModel2 = videoModels[i4];
                        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) homeVideoModel2.id, (Object) this.onPrepareFromUri)) {
                            homeVideoModel = homeVideoModel2;
                            break;
                        }
                        i4++;
                    }
                }
                if (homeVideoModel != null) {
                    int i5 = accessonBackPresseds1027565324 + 63;
                    addObserverForBackInvokerlambda7 = i5 % 128;
                    int i6 = i5 % 2;
                    z = true;
                }
                getLatestBitrateEstimate.MediaBrowserCompatSearchResultReceiver.AudioAttributesCompatParcelizer(z);
                AdaptationSet.read(this.setSessionImpl, "app_session_video");
            }
            fromAdPlaybackState fromadplaybackstate = fromAdPlaybackState.read;
            if (fromAdPlaybackState.AudioAttributesCompatParcelizer(this.setSessionImpl.ParcelableVolumeInfo(), (61 & 1) != 0 ? 0L : 0L, (61 & 2) != 0 ? 0L : 1L, 0L, 0L, 0L, false)) {
                boolean zR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28 = ((parseAlignment.write) this.RemoteActionCompatParcelizer).r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
                evaluateQueueSize.Companion writeVar = evaluateQueueSize.INSTANCE;
                evaluateQueueSize.Companion.IconCompatParcelizer(zR8lambdah6vvr6zUWA2U1fE0KsKpOgpr28);
                AdaptationSet.read(this.setSessionImpl, "last_adb_defect_check_time_ms", System.currentTimeMillis());
            }
            handleMediaPlayPauseIfPendingOnHandler();
            r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0();
        }
    }

    private final void addObserverForBackInvokerlambda7() {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 99;
        addObserverForBackInvokerlambda7 = i2 % 128;
        if (i2 % 2 != 0) {
            LessonIndex lessonIndexRemoteActionCompatParcelizer = this.onRewind.RemoteActionCompatParcelizer(this.onPrepareFromUri);
            if (lessonIndexRemoteActionCompatParcelizer != null) {
                boolean z = PlayerControlViewComponentListener.read(this.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4, lessonIndexRemoteActionCompatParcelizer.isPaid(), lessonIndexRemoteActionCompatParcelizer.hasVideo(), lessonIndexRemoteActionCompatParcelizer.getRootSubjectId());
                this.onPlayFromUri = z;
                if (!(!z)) {
                    int i3 = accessonBackPresseds1027565324 + 81;
                    addObserverForBackInvokerlambda7 = i3 % 128;
                    int i4 = i3 % 2;
                    ensureViewModelStore();
                    return;
                }
                ((parseAlignment.write) this.RemoteActionCompatParcelizer).createFullyDrawnExecutor();
                parseAlignment.write writeVar = (parseAlignment.write) this.RemoteActionCompatParcelizer;
                String title = lessonIndexRemoteActionCompatParcelizer.getTitle();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(title, "");
                writeVar.MediaBrowserCompatItemReceiver(title);
                getSavedStateRegistryControllerannotations();
                AudioAttributesImplApi21Parcelizer(false);
                return;
            }
            int i5 = addObserverForBackInvokerlambda7 + 11;
            accessonBackPresseds1027565324 = i5 % 128;
            if (i5 % 2 == 0) {
                ensureViewModelStore();
                return;
            } else {
                ensureViewModelStore();
                int i6 = 98 / 0;
                return;
            }
        }
        this.onRewind.RemoteActionCompatParcelizer(this.onPrepareFromUri);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private final void AudioAttributesImplApi21Parcelizer(boolean z) {
        int i = 2 % 2;
        LessonIndex lessonIndex = this.onSeekTo;
        if (lessonIndex == null) {
            return;
        }
        LessonIndex lessonIndex2 = null;
        if (lessonIndex == null) {
            int i2 = addObserverForBackInvokerlambda7 + 31;
            accessonBackPresseds1027565324 = i2 % 128;
            if (i2 % 2 != 0) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                int i3 = 75 / 0;
            } else {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            }
            lessonIndex = null;
        }
        String activeRecallQbankId = lessonIndex.getActiveRecallQbankId();
        if (activeRecallQbankId == null || activeRecallQbankId.length() == 0) {
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).MediaSessionCompatToken();
            return;
        }
        int i4 = accessonBackPresseds1027565324;
        int i5 = i4 + 5;
        addObserverForBackInvokerlambda7 = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
        LessonIndex lessonIndex3 = this.onSeekTo;
        if (lessonIndex3 == null) {
            int i6 = i4 + 123;
            addObserverForBackInvokerlambda7 = i6 % 128;
            if (i6 % 2 == 0) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                lessonIndex2.hashCode();
                throw null;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            lessonIndex2 = lessonIndex3;
        }
        String activeRecallQbankId2 = lessonIndex2.getActiveRecallQbankId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(activeRecallQbankId2, "");
        LessonDynamicResponseBody<ActiveRecallQbankLessonUiModel> lessonDynamicResponseBodyWrite = write(z, activeRecallQbankId2).AudioAttributesCompatParcelizer(aq_()).write(al_());
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.parseStyleIds
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return fromStyleLine.read(this.write, (ActiveRecallQbankLessonUiModel) obj);
            }
        };
        getTimelineId<? super ActiveRecallQbankLessonUiModel> gettimelineid = new getTimelineId() { // from class: o.TtmlDecoderFrameAndTickRate
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) {
                fromStyleLine.write(getanswermap, obj);
            }
        };
        final getAnswerMap getanswermap2 = new getAnswerMap() { // from class: o.getRegionOutputText
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return fromStyleLine.AudioAttributesCompatParcelizer(this.write);
            }
        };
        an_().read(lessonDynamicResponseBodyWrite.RemoteActionCompatParcelizer(gettimelineid, new getTimelineId() { // from class: o.buildNode
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) {
                fromStyleLine.AudioAttributesImplApi21Parcelizer(getanswermap2, obj);
            }
        }));
    }

    private static final void MediaBrowserCompatSearchResultReceiver(getAnswerMap getanswermap, Object obj) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 25;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        getanswermap.invoke(obj);
        if (i3 == 0) {
            int i4 = 44 / 0;
        }
    }

    private static final getShowPopup IconCompatParcelizer(fromStyleLine fromstyleline, ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModel) {
        int i = 2 % 2;
        if (activeRecallQbankLessonUiModel == null) {
            int i2 = accessonBackPresseds1027565324 + 117;
            addObserverForBackInvokerlambda7 = i2 % 128;
            if (i2 % 2 != 0) {
                ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).MediaSessionCompatToken();
                return getShowPopup.INSTANCE;
            }
            ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).MediaSessionCompatToken();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            throw null;
        }
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 55382807, new Object[]{fromstyleline}, iWrite3, iWrite2, -55382783);
        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        int i3 = accessonBackPresseds1027565324 + 105;
        addObserverForBackInvokerlambda7 = i3 % 128;
        if (i3 % 2 != 0) {
            return getshowpopup2;
        }
        throw null;
    }

    private static final void MediaBrowserCompatMediaItem(getAnswerMap getanswermap, Object obj) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 69;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        getanswermap.invoke(obj);
        int i4 = accessonBackPresseds1027565324 + 123;
        addObserverForBackInvokerlambda7 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final getShowPopup onMediaButtonEvent(fromStyleLine fromstyleline) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 13;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).MediaSessionCompatToken();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = addObserverForBackInvokerlambda7 + 117;
        accessonBackPresseds1027565324 = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopup;
        }
        throw null;
    }

    private static /* synthetic */ Object onPause(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7;
        int i3 = i2 + 65;
        accessonBackPresseds1027565324 = i3 % 128;
        int i4 = i3 % 2;
        ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModel = fromstyleline.read;
        if (activeRecallQbankLessonUiModel == null) {
            return null;
        }
        int i5 = i2 + 19;
        accessonBackPresseds1027565324 = i5 % 128;
        int i6 = i5 % 2;
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).read(activeRecallQbankLessonUiModel);
        int i7 = addObserverForBackInvokerlambda7 + 43;
        accessonBackPresseds1027565324 = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    public final void onPrepareFromSearch() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 17;
        accessonBackPresseds1027565324 = i2 % 128;
        AudioAttributesImplApi21Parcelizer(i2 % 2 != 0);
    }

    public final void onMediaButtonEvent() {
        int i = 2 % 2;
        RtspMediaTrack rtspMediaTrack = this._init_lambda4;
        if (rtspMediaTrack != null) {
            int i2 = accessonBackPresseds1027565324 + 113;
            addObserverForBackInvokerlambda7 = i2 % 128;
            int i3 = i2 % 2;
            rtspMediaTrack.AudioAttributesCompatParcelizer();
        }
        AudioAttributesImplApi21Parcelizer(true);
        int i4 = addObserverForBackInvokerlambda7 + 85;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void ResultReceiver() {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 65;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        AudioAttributesImplApi21Parcelizer(true);
        int i4 = addObserverForBackInvokerlambda7 + 45;
        accessonBackPresseds1027565324 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final boolean accessgetReportFullyDrawnExecutorp() {
        int i = 2 % 2;
        boolean zAudioAttributesCompatParcelizer = this.MediaSessionCompatToken.AudioAttributesCompatParcelizer();
        boolean z = this.MediaSessionCompatToken.read();
        if (this.onPrepareFromUri.length() == 0) {
            int i2 = addObserverForBackInvokerlambda7 + 23;
            accessonBackPresseds1027565324 = i2 % 128;
            int i3 = i2 % 2;
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).addOnPictureInPictureModeChangedListener();
            return false;
        }
        if (!z) {
            if (!zAudioAttributesCompatParcelizer) {
                return true;
            }
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).registerForActivityResult();
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).addOnPictureInPictureModeChangedListener();
            return false;
        }
        int i4 = addObserverForBackInvokerlambda7 + 73;
        accessonBackPresseds1027565324 = i4 % 128;
        if (i4 % 2 != 0) {
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).onActivityResult();
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).addOnPictureInPictureModeChangedListener();
            return false;
        }
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).onActivityResult();
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).addOnPictureInPictureModeChangedListener();
        return false;
    }

    private final void ensureViewModelStore() {
        int i = 2 % 2;
        IconCompatParcelizer(this.onRemoveQueueItemAt.RemoteActionCompatParcelizer(this.onPrepareFromUri), new getAnswerMap() { // from class: o.parseWords
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return fromStyleLine.IconCompatParcelizer(this.IconCompatParcelizer, (LessonIndex) obj);
            }
        }, new getAnswerMap() { // from class: o.TextEmphasisPosition
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                Object[] objArr = {this.AudioAttributesCompatParcelizer, (Throwable) obj};
                int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
                int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
                return (getShowPopup) fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -1091237785, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, 1091237828);
            }
        });
        int i2 = accessonBackPresseds1027565324 + 35;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final getShowPopup write(fromStyleLine fromstyleline, LessonIndex lessonIndex) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 61;
        addObserverForBackInvokerlambda7 = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(lessonIndex, "");
            int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
            write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -1390383695, new Object[]{fromstyleline, lessonIndex}, iWrite3, iWrite2, 1390383725);
            return getShowPopup.INSTANCE;
        }
        toMagicModuleMetaRepoModel.write(lessonIndex, "");
        int iWrite4 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite5 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite6 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite4, -1390383695, new Object[]{fromstyleline, lessonIndex}, iWrite6, iWrite5, 1390383725);
        int i3 = 79 / 0;
        return getShowPopup.INSTANCE;
    }

    private static final getShowPopup AudioAttributesImplApi21Parcelizer(fromStyleLine fromstyleline, Throwable th) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 61;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(th, "");
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).createFullyDrawnExecutor();
        if (th instanceof EmptyResponseException) {
            ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).write(ResponseError.INSTANCE.customError(fromstyleline.read(R.string.err_text_video_access_failure)));
            ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            int i4 = accessonBackPresseds1027565324 + 43;
            addObserverForBackInvokerlambda7 = i4 % 128;
            if (i4 % 2 != 0) {
                return getshowpopup;
            }
            throw null;
        }
        fromstyleline.IconCompatParcelizer(th, "video_lesson_detail", fromstyleline.onPrepareFromUri);
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).addOnPictureInPictureModeChangedListener();
        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        int i5 = addObserverForBackInvokerlambda7 + 3;
        accessonBackPresseds1027565324 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 15 / 0;
        }
        return getshowpopup2;
    }

    @Override // kotlin.isRtspStartLine, kotlin.getExtendedEsFrChar
    public final PresenterBundle AudioAttributesImplBaseParcelizer() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 9;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        an_().read();
        PresenterBundle presenterBundleAudioAttributesImplBaseParcelizer = super.AudioAttributesImplBaseParcelizer();
        int i4 = addObserverForBackInvokerlambda7 + 3;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
        return presenterBundleAudioAttributesImplBaseParcelizer;
    }

    public final void RemoteActionCompatParcelizer(boolean z, int i, boolean z2) {
        int i2 = 2 % 2;
        boolean z3 = true;
        if (this.onPrepare || z) {
            i = Integer.MAX_VALUE;
        }
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(z2 ? Integer.MAX_VALUE : i);
        RtspMediaTrack rtspMediaTrack = this._init_lambda4;
        if (rtspMediaTrack != null) {
            if (i == Integer.MAX_VALUE) {
                int i3 = accessonBackPresseds1027565324 + 27;
                addObserverForBackInvokerlambda7 = i3 % 128;
                int i4 = i3 % 2;
            } else {
                z3 = false;
            }
            rtspMediaTrack.AudioAttributesCompatParcelizer(z3);
        }
        if (i != Integer.MAX_VALUE) {
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).onCustomAction();
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).removeMenuProvider();
            if (this.onPrepare) {
                return;
            }
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).onPictureInPictureModeChanged();
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).addOnNewIntentListener();
            return;
        }
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).accessensureViewModelStore();
        if (onCustomAction()) {
            AudioAttributesCompatParcelizer(false);
        }
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).addObserverForBackInvokerlambda7();
        int i5 = addObserverForBackInvokerlambda7 + 55;
        accessonBackPresseds1027565324 = i5 % 128;
        if (i5 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // kotlin.isRtspStartLine, kotlin.getExtendedEsFrChar
    public final void AudioAttributesImplApi26Parcelizer() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 125;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        College.AudioAttributesCompatParcelizer(this.onSkipToNext, null);
        an_().read();
        this._init_lambda4 = null;
        super.AudioAttributesImplApi26Parcelizer();
        int i4 = accessonBackPresseds1027565324 + 65;
        addObserverForBackInvokerlambda7 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7;
        int i3 = i2 + 5;
        accessonBackPresseds1027565324 = i3 % 128;
        int i4 = i3 % 2;
        float f = fromstyleline.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
        int i5 = i2 + 27;
        accessonBackPresseds1027565324 = i5 % 128;
        if (i5 % 2 == 0) {
            return Float.valueOf(f);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onPlayFromSearch(Object[] objArr) {
        boolean z;
        final fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        int i = 1;
        LessonIndex lessonIndex = (LessonIndex) objArr[1];
        int i2 = 2 % 2;
        fromstyleline.onSeekTo = lessonIndex;
        AdsMediaSourceAdPrepareListener adsMediaSourceAdPrepareListener = fromstyleline.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
        String id = lessonIndex.getId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(id, "");
        StepIndex stepIndex = adsMediaSourceAdPrepareListener.read(id, 0);
        if (fromstyleline.onMediaButtonEvent) {
            fromstyleline.IconCompatParcelizer(StandardIntegrityVerdictOptOut.read.MediaBrowserCompatCustomActionResultReceiver);
        }
        StandardIntegrityVerdictOptOut.read readVar = fromstyleline.AudioAttributesImplApi26Parcelizer;
        if (readVar != null) {
            fromstyleline.IconCompatParcelizer(readVar);
        }
        fromstyleline.onPlayFromUri = PlayerControlViewComponentListener.read(fromstyleline.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4, lessonIndex.isPaid(), lessonIndex.hasVideo(), lessonIndex.getRootSubjectId());
        String str = null;
        if (stepIndex != null) {
            int i3 = addObserverForBackInvokerlambda7 + 31;
            accessonBackPresseds1027565324 = i3 % 128;
            if (i3 % 2 != 0) {
                stepIndex.isAspectRatioValid();
                str.hashCode();
                throw null;
            }
            if (stepIndex.isAspectRatioValid()) {
                int i4 = accessonBackPresseds1027565324 + 123;
                addObserverForBackInvokerlambda7 = i4 % 128;
                int i5 = i4 % 2;
                fromstyleline.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8 = (float) stepIndex.getVideoAspectRatio();
            }
        }
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).createFullyDrawnExecutor();
        parseAlignment.write writeVar = (parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer;
        String title = lessonIndex.getTitle();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(title, "");
        writeVar.MediaBrowserCompatItemReceiver(title);
        if (!fromstyleline.onPlayFromUri) {
            fromstyleline.getSavedStateRegistryControllerannotations();
            return null;
        }
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).onNewIntent();
        BundledChunkExtractorExternalSyntheticLambda0 bundledChunkExtractorExternalSyntheticLambda0 = fromstyleline.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
        LessonIndex lessonIndex2 = fromstyleline.onSeekTo;
        if (lessonIndex2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            lessonIndex2 = null;
        }
        String strRemoteActionCompatParcelizer = bundledChunkExtractorExternalSyntheticLambda0.RemoteActionCompatParcelizer(lessonIndex2.getRootSubjectId(), String.valueOf(fromstyleline.setSessionImpl.onPrepareFromUri()));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, "");
        fromstyleline.onPause = strRemoteActionCompatParcelizer;
        parseAlignment.write writeVar2 = (parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer;
        String subTitle = lessonIndex.getSubTitle();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(subTitle, "");
        writeVar2.AudioAttributesImplApi26Parcelizer(subTitle);
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(lessonIndex.getAverageRating(), lessonIndex.getTotalPeopleRated());
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).MediaBrowserCompatItemReceiver(fromstyleline.onPause.length() > 0);
        if (stepIndex == null) {
            int i6 = accessonBackPresseds1027565324 + 89;
            addObserverForBackInvokerlambda7 = i6 % 128;
            if (i6 % 2 != 0) {
                ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).onMultiWindowModeChanged();
                ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).addOnPictureInPictureModeChangedListener();
                return null;
            }
            ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).onMultiWindowModeChanged();
            ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).addOnPictureInPictureModeChangedListener();
            throw null;
        }
        final MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer = new MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer();
        Iterator<T> it = ((CourseConfigV2) write(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 121768406, new Object[]{fromstyleline}, maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -121768383)).getVideoPageTabs().iterator();
        while (it.hasNext()) {
            int i7 = RemoteActionCompatParcelizer.read[((CourseConfigV2.VideoPageItem) it.next()).ordinal()];
            if (i7 == i) {
                iconCompatParcelizer.AudioAttributesCompatParcelizer = stepIndex.getNotesCount();
                final String videoPageNotesTitle = fromstyleline.MediaBrowserCompatSearchResultReceiver.IconCompatParcelizer().getCourseStrings().getVideoPageNotesTitle();
                if (iconCompatParcelizer.AudioAttributesCompatParcelizer > 0) {
                    int i8 = accessonBackPresseds1027565324 + 5;
                    addObserverForBackInvokerlambda7 = i8 % 128;
                    if (i8 % 2 == 0) {
                        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).write(videoPageNotesTitle, iconCompatParcelizer.AudioAttributesCompatParcelizer, str);
                        int i9 = 23 / 0;
                    } else {
                        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).write(videoPageNotesTitle, iconCompatParcelizer.AudioAttributesCompatParcelizer, str);
                    }
                } else {
                    String rootSubjectId = lessonIndex.getRootSubjectId();
                    if (fromstyleline.onSetRating.MediaBrowserCompatMediaItem()) {
                        parseAlignment.write writeVar3 = (parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer;
                        int i10 = iconCompatParcelizer.AudioAttributesCompatParcelizer;
                        toMagicModuleMetaRepoModel.write((Object) rootSubjectId);
                        writeVar3.write(videoPageNotesTitle, i10, fromstyleline.MediaBrowserCompatSearchResultReceiver(rootSubjectId));
                    } else {
                        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(fromstyleline.onSkipToNext, fromstyleline.new AudioAttributesImplBaseParcelizer(videoPageNotesTitle, iconCompatParcelizer, rootSubjectId, null), new MagicModuleSubmissionRequestBody() { // from class: o.parseFromDialogue
                            @Override // kotlin.MagicModuleSubmissionRequestBody
                            public final Object invoke(Object obj, Object obj2) {
                                return fromStyleLine.RemoteActionCompatParcelizer(this.IconCompatParcelizer, videoPageNotesTitle, iconCompatParcelizer, (String) obj2);
                            }
                        });
                        i = 1;
                        str = null;
                    }
                }
            } else {
                if (i7 != 2 && i7 != 3) {
                    throw new RenewEligibleCreator();
                }
                int i11 = accessonBackPresseds1027565324 + 37;
                addObserverForBackInvokerlambda7 = i11 % 128;
                int i12 = i11 % 2;
            }
        }
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).read(lessonIndex.getStatus());
        parseAlignment.write writeVar4 = (parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer;
        if (lessonIndex.getStatus() != 2) {
            int i13 = accessonBackPresseds1027565324 + 15;
            addObserverForBackInvokerlambda7 = i13 % 128;
            int i14 = i13 % 2;
            z = true;
        } else {
            z = false;
        }
        writeVar4.AudioAttributesCompatParcelizer(z);
        VideoInfo videoInfoIconCompatParcelizer = fromstyleline.onAddQueueItem.IconCompatParcelizer(stepIndex);
        toMagicModuleMetaRepoModel.write(videoInfoIconCompatParcelizer);
        String rootSubjectId2 = lessonIndex.getRootSubjectId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rootSubjectId2, "");
        fromstyleline.IconCompatParcelizer(videoInfoIconCompatParcelizer, rootSubjectId2, iconCompatParcelizer.AudioAttributesCompatParcelizer > 0);
        fromstyleline.AudioAttributesImplApi21Parcelizer(false);
        return null;
    }

    static final class AudioAttributesImplBaseParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private /* synthetic */ String IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;
        private /* synthetic */ MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer read;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.RemoteActionCompatParcelizer = 1;
                if (fromStyleLine.RatingCompat(fromStyleLine.this).a_(this) == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            parseAlignment.write writeVar = (parseAlignment.write) fromStyleLine.this.RemoteActionCompatParcelizer;
            String str = this.AudioAttributesCompatParcelizer;
            int i2 = this.read.AudioAttributesCompatParcelizer;
            fromStyleLine fromstyleline = fromStyleLine.this;
            String str2 = this.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.write((Object) str2);
            writeVar.write(str, i2, fromStyleLine.IconCompatParcelizer(fromstyleline, str2));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplBaseParcelizer(String str, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer, String str2, SampleVideos<? super AudioAttributesImplBaseParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
            this.read = iconCompatParcelizer;
            this.IconCompatParcelizer = str2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return fromStyleLine.this.new AudioAttributesImplBaseParcelizer(this.AudioAttributesCompatParcelizer, this.read, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplBaseParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static final getShowPopup AudioAttributesCompatParcelizer(fromStyleLine fromstyleline, String str, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer, String str2) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 125;
        addObserverForBackInvokerlambda7 = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(str2, "");
            ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).write(str, iconCompatParcelizer.AudioAttributesCompatParcelizer, null);
            return getShowPopup.INSTANCE;
        }
        toMagicModuleMetaRepoModel.write(str2, "");
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).write(str, iconCompatParcelizer.AudioAttributesCompatParcelizer, null);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        throw null;
    }

    private final void IconCompatParcelizer(StandardIntegrityVerdictOptOut.read readVar) {
        int i = 2 % 2;
        isSeekPending isseekpending = this.AudioAttributesImplApi21Parcelizer;
        StandardIntegrityVerdictOptOut standardIntegrityVerdictOptOut = StandardIntegrityVerdictOptOut.INSTANCE;
        LessonIndex lessonIndex = this.onSeekTo;
        LessonIndex lessonIndex2 = null;
        if (lessonIndex == null) {
            int i2 = addObserverForBackInvokerlambda7 + 7;
            accessonBackPresseds1027565324 = i2 % 128;
            if (i2 % 2 != 0) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                throw null;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            lessonIndex = null;
        }
        String title = lessonIndex.getTitle();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(title, "");
        LessonIndex lessonIndex3 = this.onSeekTo;
        if (lessonIndex3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            lessonIndex3 = null;
        }
        String rootSubjectId = lessonIndex3.getRootSubjectId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rootSubjectId, "");
        BundledChunkExtractorExternalSyntheticLambda0 bundledChunkExtractorExternalSyntheticLambda0 = this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
        LessonIndex lessonIndex4 = this.onSeekTo;
        if (lessonIndex4 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            lessonIndex4 = null;
        }
        String strRemoteActionCompatParcelizer = bundledChunkExtractorExternalSyntheticLambda0.RemoteActionCompatParcelizer(lessonIndex4.getRootSubjectId());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strRemoteActionCompatParcelizer, "");
        String str = this.onPrepareFromUri;
        LessonIndex lessonIndex5 = this.onSeekTo;
        if (lessonIndex5 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            int i3 = addObserverForBackInvokerlambda7 + 55;
            accessonBackPresseds1027565324 = i3 % 128;
            int i4 = i3 % 2;
        } else {
            lessonIndex2 = lessonIndex5;
        }
        String subjectId = lessonIndex2.getSubjectId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(subjectId, "");
        isseekpending.write(StandardIntegrityVerdictOptOut.IconCompatParcelizer(str, rootSubjectId, subjectId, title, strRemoteActionCompatParcelizer, readVar), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
    }

    private final void IconCompatParcelizer(VideoInfo videoInfo, String str, boolean z) {
        int i = 2 % 2;
        this.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0 = videoInfo;
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        if (!((List) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 111371583, new Object[]{this}, iWrite3, iWrite2, -111371557)).isEmpty()) {
            WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer iconCompatParcelizer = this.PlaybackStateCompatCustomAction;
            int iWrite4 = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite5 = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite6 = maybeInvalidateForRendererCapabilitiesChange.write();
            iconCompatParcelizer.AudioAttributesCompatParcelizer(IntermediateLoginResponseBody.write((Iterable) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite4, 111371583, new Object[]{this}, iWrite6, iWrite5, -111371557), 3).toArray(new Timeline[0]));
            int iWrite7 = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite8 = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite9 = maybeInvalidateForRendererCapabilitiesChange.write();
            if (((List) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite7, 111371583, new Object[]{this}, iWrite9, iWrite8, -111371557)).size() > 3) {
                int i2 = accessonBackPresseds1027565324 + 3;
                addObserverForBackInvokerlambda7 = i2 % 128;
                int i3 = i2 % 2;
                parseAlignment.write writeVar = (parseAlignment.write) this.RemoteActionCompatParcelizer;
                int iWrite10 = maybeInvalidateForRendererCapabilitiesChange.write();
                int iWrite11 = maybeInvalidateForRendererCapabilitiesChange.write();
                int iWrite12 = maybeInvalidateForRendererCapabilitiesChange.write();
                writeVar.AudioAttributesCompatParcelizer(true, ((List) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite10, 111371583, new Object[]{this}, iWrite12, iWrite11, -111371557)).size() - 3);
                int i4 = accessonBackPresseds1027565324 + 31;
                addObserverForBackInvokerlambda7 = i4 % 128;
                int i5 = i4 % 2;
            }
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).removeOnContextAvailableListener();
        }
        this.PlaybackStateCompatCustomAction.write(this.setSessionImpl.RatingCompat());
        LessonDynamicResponseBody lessonDynamicResponseBodyAudioAttributesCompatParcelizer = LessonDynamicResponseBody.AudioAttributesCompatParcelizer(new Callable() { // from class: o.parseCellResolution
            private static int $10 = 0;
            private static int $11 = 1;
            private static final byte[] $$d = {84, -83, -23, -21, 58, -31, -45, 4, -9, 23, -58, -3, -5, 10, -9, -24, -2, -10, 37, -45, 4, -13, -19, -33, -19, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20, -26, -15, -9, -12, 8, 29, -41, -24, 4, -13, -6, 36, -51, -5, -10, 8, -26, 29, -24, -24, 8, -9, -14, -4, -24, 14, -20};
            private static final int $$e = 163;
            private static final byte[] $$a = {34, TarConstants.LF_NORMAL, 18, 42, 17, 6, 0, 3, -17, -38, 32, 15, -13, 4, -3, -45, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, TarConstants.LF_SYMLINK, -19, 3, 4, -48, TarConstants.LF_LINK, -2, -4, -11, -9, 17, -3, -17, 12, -50, 42, -4, 1, -17, 17, -38, 15, 15, -17, 0, 5, -5, 15, -23, 11, -15, -6, 1};
            private static final int $$b = 108;
            private static int IconCompatParcelizer = 0;
            private static int write = 1;
            private static int read = 1000326179;

            /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
            /* JADX WARN: Removed duplicated region for block: B:8:0x001e  */
            /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x0028). Please report as a decompilation issue!!! */
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            private static void a(byte r5, int r6, short r7, java.lang.Object[] r8) {
                /*
                    byte[] r0 = kotlin.parseCellResolution.$$a
                    int r7 = r7 * 3
                    int r7 = 61 - r7
                    int r6 = r6 * 3
                    int r1 = 31 - r6
                    int r5 = 114 - r5
                    byte[] r1 = new byte[r1]
                    int r6 = 30 - r6
                    r2 = 0
                    if (r0 != 0) goto L16
                    r3 = r6
                    r4 = r2
                    goto L28
                L16:
                    r3 = r2
                L17:
                    byte r4 = (byte) r5
                    r1[r3] = r4
                    int r4 = r3 + 1
                    if (r3 != r6) goto L26
                    java.lang.String r5 = new java.lang.String
                    r5.<init>(r1, r2)
                    r8[r2] = r5
                    return
                L26:
                    r3 = r0[r7]
                L28:
                    int r5 = r5 + r3
                    int r7 = r7 + 1
                    int r5 = r5 + 2
                    r3 = r4
                    goto L17
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.parseCellResolution.a(byte, int, short, java.lang.Object[]):void");
            }

            private static void c(int i6, short s, short s2, Object[] objArr) {
                int i7 = i6 * 8;
                int i8 = s2 + 73;
                byte[] bArr = $$d;
                int i9 = 41 - (s * 19);
                byte[] bArr2 = new byte[28 - i7];
                int i10 = 27 - i7;
                int i11 = -1;
                if (bArr == null) {
                    i11 = -1;
                    i8 = (i10 + (-i9)) - 7;
                    i9 = i9;
                }
                while (true) {
                    int i12 = i11 + 1;
                    bArr2[i12] = (byte) i8;
                    if (i12 == i10) {
                        objArr[0] = new String(bArr2, 0);
                        return;
                    }
                    int i13 = i9 + 1;
                    i11 = i12;
                    i8 = (i8 + (-bArr[i13])) - 7;
                    i9 = i13;
                }
            }

            private static void b(int i6, boolean z2, char[] cArr, int i7, int i8, Object[] objArr) throws Throwable {
                int i9 = 2 % 2;
                clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
                char[] cArr2 = new char[i7];
                cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
                while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i7) {
                    int i10 = $11 + 81;
                    $10 = i10 % 128;
                    int i11 = i10 % 2;
                    cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
                    cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i8 + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
                    int i12 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
                    try {
                        Object[] objArr2 = {Integer.valueOf(cArr2[i12]), Integer.valueOf(read)};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 23704, (-16777184) - Color.rgb(0, 0, 0), -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                        }
                        cArr2[i12] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                        Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) (44863 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1))), (ViewConfiguration.getKeyRepeatTimeout() >> 16) + 18944, (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3);
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause == null) {
                            throw th;
                        }
                        throw cause;
                    }
                }
                if (i6 > 0) {
                    int i13 = $10 + 11;
                    $11 = i13 % 128;
                    int i14 = i13 % 2;
                    cleardownloadmanagerhelpers.write = i6;
                    char[] cArr3 = new char[i7];
                    System.arraycopy(cArr2, 0, cArr3, 0, i7);
                    System.arraycopy(cArr3, 0, cArr2, i7 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
                    System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i7 - cleardownloadmanagerhelpers.write);
                }
                if (z2) {
                    char[] cArr4 = new char[i7];
                    cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
                    while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i7) {
                        int i15 = $10 + 9;
                        $11 = i15 % 128;
                        int i16 = i15 % 2;
                        cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i7 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                        Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                        if (objRemoteActionCompatParcelizer3 == null) {
                            objRemoteActionCompatParcelizer3 = startForeground.read((char) (44863 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1))), 18945 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)), (ViewConfiguration.getFadingEdgeLength() >> 16) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                        }
                        ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
                        int i17 = $10 + 53;
                        $11 = i17 % 128;
                        int i18 = i17 % 2;
                    }
                    cArr2 = cArr4;
                }
                objArr[0] = new String(cArr2);
            }

            /* JADX WARN: Removed duplicated region for block: B:59:0x0593  */
            @Override // java.util.concurrent.Callable
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final java.lang.Object call() throws java.lang.Throwable {
                /*
                    Method dump skipped, instruction units count: 2056
                    To view this dump change 'Code comments level' option to 'DEBUG'
                */
                throw new UnsupportedOperationException("Method not decompiled: kotlin.parseCellResolution.call():java.lang.Object");
            }
        }).write(al_()).AudioAttributesCompatParcelizer(al_());
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.parseFrameAndTickRates
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return fromStyleLine.MediaMetadataCompat();
            }
        };
        getTimelineId gettimelineid = new getTimelineId() { // from class: o.parseNode
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) {
                fromStyleLine.MediaBrowserCompatCustomActionResultReceiver(getanswermap, obj);
            }
        };
        final getAnswerMap getanswermap2 = new getAnswerMap() { // from class: o.parseMetadata
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return fromStyleLine.RatingCompat();
            }
        };
        an_().read(lessonDynamicResponseBodyAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(gettimelineid, new getTimelineId() { // from class: o.parseTimeExpression
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) {
                fromStyleLine.AudioAttributesImplApi26Parcelizer(getanswermap2, obj);
            }
        }));
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).write(videoInfo, this.onPrepareFromUri, str, z);
        RtspMediaTrack rtspMediaTrack = this._init_lambda4;
        if (rtspMediaTrack != null) {
            rtspMediaTrack.IconCompatParcelizer(true);
            int i6 = addObserverForBackInvokerlambda7 + 23;
            accessonBackPresseds1027565324 = i6 % 128;
            int i7 = i6 % 2;
        }
        VideoCacheInfo videoCacheInfoAudioAttributesCompatParcelizer = this.onSetCaptioningEnabled.AudioAttributesCompatParcelizer(this.onPrepareFromUri);
        if (videoCacheInfoAudioAttributesCompatParcelizer != null) {
            AudioAttributesCompatParcelizer(videoCacheInfoAudioAttributesCompatParcelizer);
            return;
        }
        int i8 = accessonBackPresseds1027565324 + 61;
        addObserverForBackInvokerlambda7 = i8 % 128;
        if (i8 % 2 != 0) {
            createFullyDrawnExecutor();
        } else {
            createFullyDrawnExecutor();
            throw null;
        }
    }

    static final class AudioAttributesImplApi21Parcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ String AudioAttributesCompatParcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private Object AudioAttributesImplBaseParcelizer;
        private Object IconCompatParcelizer;
        private Object MediaBrowserCompatItemReceiver;
        private int RemoteActionCompatParcelizer;
        private Object read;
        private Object write;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            fromStyleLine fromstyleline;
            parseAlignment.write writeVar;
            String str;
            Object objRatingCompat;
            parseAlignment.write writeVar2;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesImplApi26Parcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                V v = fromStyleLine.this.RemoteActionCompatParcelizer;
                fromstyleline = fromStyleLine.this;
                writeVar = (parseAlignment.write) v;
                writeVar.read(2);
                writeVar.AudioAttributesCompatParcelizer(false);
                int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
                int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
                int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
                writeVar.AudioAttributesCompatParcelizer(2, (String) fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -841951145, new Object[]{fromstyleline}, iWrite3, iWrite2, 841951152));
                int iWrite4 = maybeInvalidateForRendererCapabilitiesChange.write();
                int iWrite5 = maybeInvalidateForRendererCapabilitiesChange.write();
                int iWrite6 = maybeInvalidateForRendererCapabilitiesChange.write();
                str = (String) fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite4, -841951145, new Object[]{fromstyleline}, iWrite6, iWrite5, 841951152);
                lambdanewSingleThreadScheduledExecutor4 lambdanewsinglethreadscheduledexecutor4OnAddQueueItem = fromStyleLine.onAddQueueItem(fromstyleline);
                LessonIndex lessonIndexMediaBrowserCompatSearchResultReceiver = fromStyleLine.MediaBrowserCompatSearchResultReceiver(fromstyleline);
                if (lessonIndexMediaBrowserCompatSearchResultReceiver == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    lessonIndexMediaBrowserCompatSearchResultReceiver = null;
                }
                String rootSubjectId = lessonIndexMediaBrowserCompatSearchResultReceiver.getRootSubjectId();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rootSubjectId, "");
                this.write = v;
                this.read = fromstyleline;
                this.IconCompatParcelizer = writeVar;
                this.AudioAttributesImplBaseParcelizer = str;
                this.MediaBrowserCompatItemReceiver = writeVar;
                this.RemoteActionCompatParcelizer = 0;
                this.AudioAttributesImplApi26Parcelizer = 1;
                objRatingCompat = lambdanewsinglethreadscheduledexecutor4OnAddQueueItem.RatingCompat(rootSubjectId, this);
                if (objRatingCompat == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
                writeVar2 = writeVar;
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                parseAlignment.write writeVar3 = (parseAlignment.write) this.MediaBrowserCompatItemReceiver;
                String str2 = (String) this.AudioAttributesImplBaseParcelizer;
                parseAlignment.write writeVar4 = (parseAlignment.write) this.IconCompatParcelizer;
                fromstyleline = (fromStyleLine) this.read;
                SdkPayloadData.IconCompatParcelizer(obj);
                str = str2;
                objRatingCompat = obj;
                writeVar = writeVar3;
                writeVar2 = writeVar4;
            }
            boolean zBooleanValue = ((Boolean) objRatingCompat).booleanValue();
            onAdPlaybackState onadplaybackstateMediaBrowserCompatCustomActionResultReceiver = fromStyleLine.MediaBrowserCompatCustomActionResultReceiver(fromstyleline);
            int iWrite7 = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite8 = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite9 = maybeInvalidateForRendererCapabilitiesChange.write();
            writeVar.IconCompatParcelizer(str, zBooleanValue, onadplaybackstateMediaBrowserCompatCustomActionResultReceiver.write((String) fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite7, -841951145, new Object[]{fromstyleline}, iWrite9, iWrite8, 841951152)), new IconCompatParcelizer(writeVar2), fromStyleLine.MediaMetadataCompat(fromstyleline), fromStyleLine.AudioAttributesImplApi21Parcelizer(fromstyleline));
            Object[] objArr = {fromStyleLine.this};
            int iWrite10 = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite11 = maybeInvalidateForRendererCapabilitiesChange.write();
            getLatestBitrateEstimate.MediaDescriptionCompat.IconCompatParcelizer((String) fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite10, -841951145, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite11, 841951152), this.AudioAttributesCompatParcelizer, fromStyleLine.onCustomAction(fromStyleLine.this), true);
            fromStyleLine.this.write("popup_shown");
            return getShowPopup.INSTANCE;
        }

        public static final class IconCompatParcelizer implements SubtitleDecoderFactory1 {
            private /* synthetic */ parseAlignment.write write;

            IconCompatParcelizer(parseAlignment.write writeVar) {
                this.write = writeVar;
            }

            @Override // kotlin.SubtitleDecoderFactory1
            public final void IconCompatParcelizer() {
                this.write.AudioAttributesImplBaseParcelizer();
            }

            @Override // kotlin.SubtitleDecoderFactory1
            public final void read() {
                this.write.AudioAttributesImplBaseParcelizer();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesImplApi21Parcelizer(String str, SampleVideos<? super AudioAttributesImplApi21Parcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = str;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return fromStyleLine.this.new AudioAttributesImplApi21Parcelizer(this.AudioAttributesCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesImplApi21Parcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static final getShowPopup onPlay(fromStyleLine fromstyleline) throws Throwable {
        Object[] objArr;
        CharSequence charSequence;
        int i = 2 % 2;
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-1807920290);
        if (objRemoteActionCompatParcelizer == null) {
            char fadingEdgeLength = (char) ((ViewConfiguration.getFadingEdgeLength() >> 16) + 28046);
            int iIndexOf = TextUtils.indexOf("", "") + 707;
            int offsetAfter = 22 - TextUtils.getOffsetAfter("", 0);
            Object[] objArr2 = new Object[1];
            a((byte) 54, (byte) 26, (byte) 80, objArr2);
            objRemoteActionCompatParcelizer = startForeground.read(fadingEdgeLength, iIndexOf, offsetAfter, -361457717, false, (String) objArr2[0], null);
        }
        long j = ((Field) objRemoteActionCompatParcelizer).getLong(null);
        Object[] objArr3 = new Object[1];
        b(new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{0, 22, 80, 0}, true, objArr3);
        Class<?> cls = Class.forName((String) objArr3[0]);
        Object[] objArr4 = new Object[1];
        b(new byte[]{1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0}, new int[]{22, 15, 99, 9}, false, objArr4);
        long jLongValue = ((Long) cls.getDeclaredMethod((String) objArr4[0], new Class[0]).invoke(null, new Object[0])).longValue();
        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1179929327);
        if (objRemoteActionCompatParcelizer2 == null) {
            char c = (char) (28046 - (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFraction(0, BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)));
            int i2 = 707 - (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
            int i3 = (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 21;
            Object[] objArr5 = new Object[1];
            a((byte) (r18[36] - 1), r18[5], (byte) ($$a[0] + 1), objArr5);
            objRemoteActionCompatParcelizer2 = startForeground.read(c, i2, i3, -941461116, false, (String) objArr5[0], null);
        }
        if (j == ((jLongValue - ((((Field) objRemoteActionCompatParcelizer2).getLong(null) << 52) >>> 52)) >> 12)) {
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1213131797);
            if (objRemoteActionCompatParcelizer3 == null) {
                char c2 = (char) (28047 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)));
                int modifierMetaStateMask = ((byte) KeyEvent.getModifierMetaStateMask()) + 708;
                int i4 = 23 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1));
                byte b = $$a[21];
                byte b2 = b;
                Object[] objArr6 = new Object[1];
                a(b, b2, (byte) (b2 | 57), objArr6);
                objRemoteActionCompatParcelizer3 = startForeground.read(c2, modifierMetaStateMask, i4, 906438784, false, (String) objArr6[0], null);
            }
            Object[] objArr7 = (Object[]) ((Field) objRemoteActionCompatParcelizer3).get(null);
            int i5 = ((int[]) objArr7[1])[0];
            int i6 = ((int[]) objArr7[2])[0];
            String[] strArr = (String[]) objArr7[3];
            int startElapsedRealtime = (int) Process.getStartElapsedRealtime();
            int i7 = ((((-1684775212) + (((-136577793) | startElapsedRealtime) * (-627))) + (((~(203769728 | startElapsedRealtime)) | 1001263994) * (-627))) + (((~(startElapsedRealtime | 1001263994)) | (~((~startElapsedRealtime) | (-203769729)))) * 627)) - 1447380116;
            int i8 = (i7 << 13) ^ i7;
            int i9 = i8 ^ (i8 >>> 17);
            ((int[]) objArr[0])[0] = i9 ^ (i9 << 5);
            objArr = new Object[]{new int[1], new int[]{i5}, new int[]{i6}, strArr};
        } else {
            Object[] objArr8 = new Object[1];
            b(new byte[]{1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1}, new int[]{37, 26, 0, 21}, false, objArr8);
            Class<?> cls2 = Class.forName((String) objArr8[0]);
            Object[] objArr9 = new Object[1];
            b(new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, new int[]{63, 18, 0, 0}, true, objArr9);
            Context applicationContext = (Context) cls2.getMethod((String) objArr9[0], new Class[0]).invoke(null, null);
            if (applicationContext != null) {
                applicationContext = ((applicationContext instanceof ContextWrapper) && ((ContextWrapper) applicationContext).getBaseContext() == null) ? null : applicationContext.getApplicationContext();
            }
            Object[] objArr10 = new Object[1];
            b(new byte[]{1, 0, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 0, 1, 0, 1, 1, 1, 0, 1, 1, 1, 0, 0, 0, 0, 1, 1, 1, 0, 1, 0, 0, 0, 0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 1, 0, 0, 1, 1, 1, 1, 1, 1, 0, 0}, new int[]{113, 64, 0, 9}, false, objArr10);
            String[] strArr2 = {(String) objArr10[0]};
            int i10 = addObserverForBackInvokerlambda7 + 19;
            accessonBackPresseds1027565324 = i10 % 128;
            int i11 = i10 % 2;
            try {
                Object[] objArr11 = {applicationContext, strArr2, 0, 17, -1447380116};
                byte[] bArr = $$d;
                byte b3 = (byte) (-bArr[259]);
                Object[] objArr12 = new Object[1];
                c(b3, (byte) (b3 - 5), bArr[44], objArr12);
                Class<?> cls3 = Class.forName((String) objArr12[0]);
                Object[] objArr13 = new Object[1];
                c((byte) (bArr[96] - 1), bArr[110], (short) (bArr[160] + 1), objArr13);
                objArr = (Object[]) cls3.getMethod((String) objArr13[0], Context.class, String[].class, Integer.TYPE, Integer.TYPE, Integer.TYPE).invoke(null, objArr11);
                int i12 = ((int[]) objArr[2])[0];
                int i13 = ((int[]) objArr[1])[0];
                if (applicationContext != null) {
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(1213131797);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        char offsetAfter2 = (char) (28046 - TextUtils.getOffsetAfter("", 0));
                        int i14 = 708 - (ViewConfiguration.getScrollFriction() > BitmapDescriptorFactory.HUE_RED ? 1 : (ViewConfiguration.getScrollFriction() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                        int pressedStateDuration = 22 - (ViewConfiguration.getPressedStateDuration() >> 16);
                        byte b4 = $$a[21];
                        byte b5 = b4;
                        Object[] objArr14 = new Object[1];
                        a(b4, b5, (byte) (b5 | 57), objArr14);
                        objRemoteActionCompatParcelizer4 = startForeground.read(offsetAfter2, i14, pressedStateDuration, 906438784, false, (String) objArr14[0], null);
                    }
                    ((Field) objRemoteActionCompatParcelizer4).set(null, objArr);
                    try {
                        Object[] objArr15 = new Object[1];
                        b(new byte[]{1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 1, 0, 1, 0, 1, 0, 0, 1}, new int[]{0, 22, 80, 0}, true, objArr15);
                        Class<?> cls4 = Class.forName((String) objArr15[0]);
                        Object[] objArr16 = new Object[1];
                        b(new byte[]{1, 0, 1, 0, 1, 0, 1, 0, 0, 0, 1, 1, 1, 1, 0}, new int[]{22, 15, 99, 9}, false, objArr16);
                        long jLongValue2 = ((Long) cls4.getDeclaredMethod((String) objArr16[0], new Class[0]).invoke(null, new Object[0])).longValue();
                        Long lValueOf = Long.valueOf(jLongValue2);
                        Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(-1179929327);
                        if (objRemoteActionCompatParcelizer5 == null) {
                            char cRed = (char) (28046 - Color.red(0));
                            int absoluteGravity = Gravity.getAbsoluteGravity(0, 0) + 707;
                            int iResolveSizeAndState = 22 - View.resolveSizeAndState(0, 0, 0);
                            Object[] objArr17 = new Object[1];
                            a((byte) (r14[36] - 1), r14[5], (byte) ($$a[0] + 1), objArr17);
                            objRemoteActionCompatParcelizer5 = startForeground.read(cRed, absoluteGravity, iResolveSizeAndState, -941461116, false, (String) objArr17[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer5).set(null, lValueOf);
                        Long lValueOf2 = Long.valueOf(jLongValue2 >> 12);
                        Object objRemoteActionCompatParcelizer6 = startForeground.RemoteActionCompatParcelizer(-1807920290);
                        if (objRemoteActionCompatParcelizer6 == null) {
                            char cLastIndexOf = (char) (28045 - TextUtils.lastIndexOf("", '0'));
                            int i15 = 707 - (AudioTrack.getMinVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMinVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1));
                            int doubleTapTimeout = (ViewConfiguration.getDoubleTapTimeout() >> 16) + 22;
                            Object[] objArr18 = new Object[1];
                            a((byte) 54, (byte) 26, (byte) 80, objArr18);
                            objRemoteActionCompatParcelizer6 = startForeground.read(cLastIndexOf, i15, doubleTapTimeout, -361457717, false, (String) objArr18[0], null);
                        }
                        ((Field) objRemoteActionCompatParcelizer6).set(null, lValueOf2);
                    } catch (Exception unused) {
                        throw new RuntimeException();
                    }
                }
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i16 = ((int[]) objArr[2])[0];
        int i17 = ((int[]) objArr[1])[0];
        if (i17 == i16) {
            int i18 = ((int[]) objArr[0])[0];
            int i19 = ((int[]) objArr[1])[0];
            int i20 = ((int[]) objArr[2])[0];
            String[] strArr3 = (String[]) objArr[3];
            int elapsedCpuTime = (int) Process.getElapsedCpuTime();
            int i21 = ~elapsedCpuTime;
            int i22 = i18 + 1469608653 + (((~(49585417 | i21)) | 738206448) * (-108)) + (((~(i21 | 747908848)) | (~((-747908849) | elapsedCpuTime)) | 39883017) * 54) + ((elapsedCpuTime | 39883017) * 54);
            int i23 = (i22 << 13) ^ i22;
            int i24 = i23 ^ (i23 >>> 17);
            ((int[]) objArr[0])[0] = i24 ^ (i24 << 5);
            Object[] objArr19 = {new int[1], new int[]{i19}, new int[]{i20}, strArr3};
            int i25 = ((int[]) objArr19[0])[0];
            int i26 = ((int[]) objArr19[1])[0];
            String[] strArr4 = strArr3;
            int[] iArr = {((int[]) objArr19[2])[0]};
            int i27 = ~(((int) Runtime.getRuntime().freeMemory()) | (-139190653));
            int i28 = i25 + ((((-1584701553) + (((-936684919) | i27) * (-220))) + ((i27 | 134955016) * 220)) - 1450355898);
            int i29 = (i28 << 13) ^ i28;
            int i30 = i29 ^ (i29 >>> 17);
            ((int[]) objArr[0])[0] = i30 ^ (i30 << 5);
            Object[] objArr20 = {new int[1], new int[]{i26}, iArr, strArr4};
            int i31 = ((int[]) objArr20[0])[0];
            int i32 = ((int[]) objArr20[1])[0];
            int[] iArr2 = {((int[]) objArr20[2])[0]};
            int i33 = (int) Runtime.getRuntime().totalMemory();
            int i34 = ~i33;
            int i35 = i31 + (-363911055) + (((~(i34 | 343921253)) | (-528481270) | (~((-269012997) | i33))) * 717) + (((~(i33 | 343921253)) | (~(i34 | (-269012997))) | (-528481270)) * 717);
            int i36 = (i35 << 13) ^ i35;
            int i37 = i36 ^ (i36 >>> 17);
            ((int[]) objArr[0])[0] = i37 ^ (i37 << 5);
            Object[] objArr21 = {new int[1], new int[]{i32}, iArr2, strArr4};
            int i38 = accessonBackPresseds1027565324 + 3;
            addObserverForBackInvokerlambda7 = i38 % 128;
            int i39 = i38 % 2;
            write(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -1113744778, new Object[]{fromstyleline}, maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 1113744815);
            return getShowPopup.INSTANCE;
        }
        ArrayList arrayList = new ArrayList();
        String[] strArr5 = (String[]) objArr[3];
        if (strArr5 != null) {
            int i40 = addObserverForBackInvokerlambda7 + 119;
            accessonBackPresseds1027565324 = i40 % 128;
            int i41 = i40 % 2 != 0 ? 1 : 0;
            while (i41 < strArr5.length) {
                int i42 = accessonBackPresseds1027565324 + 9;
                addObserverForBackInvokerlambda7 = i42 % 128;
                if (i42 % 2 == 0) {
                    arrayList.add(strArr5[i41]);
                    i41 += 119;
                } else {
                    arrayList.add(strArr5[i41]);
                    i41++;
                }
            }
        }
        Object[] objArr22 = new Object[1];
        b(new byte[]{1, 1, 0, 1, 1, 0, 0, 1, 0, 1, 1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 1, 1, 1, 0, 0, 1}, new int[]{37, 26, 0, 21}, false, objArr22);
        Class<?> cls5 = Class.forName((String) objArr22[0]);
        Object[] objArr23 = new Object[1];
        b(new byte[]{0, 1, 0, 1, 1, 0, 0, 1, 0, 0, 1, 1, 0, 1, 1, 0, 1, 0}, new int[]{63, 18, 0, 0}, true, objArr23);
        Context applicationContext2 = (Context) cls5.getMethod((String) objArr23[0], new Class[0]).invoke(null, null);
        if (applicationContext2 != null) {
            applicationContext2 = (((applicationContext2 instanceof ContextWrapper) ^ true) || ((ContextWrapper) applicationContext2).getBaseContext() != null) ? applicationContext2.getApplicationContext() : null;
        }
        if (Looper.myLooper() == null) {
            int i43 = accessonBackPresseds1027565324 + 105;
            addObserverForBackInvokerlambda7 = i43 % 128;
            if (i43 % 2 == 0) {
                throw null;
            }
            applicationContext2 = null;
        }
        long j2 = i16 ^ i17;
        long j3 = -1;
        try {
            Object[] objArr24 = {applicationContext2, Long.valueOf((((j3 - ((j3 >> 63) << 32)) | (((long) 0) << 32)) & j2) ^ 7730352060855484416L), 1799862910L};
            byte[] bArr2 = $$d;
            byte b6 = (byte) (bArr2[163] - 1);
            byte b7 = (byte) (b6 + 3);
            Object[] objArr25 = new Object[1];
            c(b6, b7, (short) (b7 << 1), objArr25);
            Class<?> cls6 = Class.forName((String) objArr25[0]);
            byte b8 = bArr2[117];
            byte b9 = (byte) (-bArr2[178]);
            Object[] objArr26 = new Object[1];
            c(b8, b9, (short) (b9 | 68), objArr26);
            cls6.getMethod((String) objArr26[0], Context.class, Long.TYPE, Long.TYPE).invoke(null, objArr24);
            int i44 = ((int[]) objArr[0])[0];
            int i45 = ((int[]) objArr[1])[0];
            int i46 = ((int[]) objArr[2])[0];
            String[] strArr6 = (String[]) objArr[3];
            int elapsedCpuTime2 = (int) Process.getElapsedCpuTime();
            int i47 = ~elapsedCpuTime2;
            int i48 = i44 + (-1230527883) + (((~(771751929 | i47)) | 25742336) * 220) + (((~(i47 | 32427280)) | 765066985) * (-440)) + ((elapsedCpuTime2 | 771751929) * 220);
            int i49 = (i48 << 13) ^ i48;
            int i50 = i49 ^ (i49 >>> 17);
            ((int[]) objArr[0])[0] = i50 ^ (i50 << 5);
            Object[] objArr27 = {new int[1], new int[]{i45}, new int[]{i46}, strArr6};
            long j4 = -1;
            long j5 = ((((long) 0) << 32) | (j4 - ((j4 >> 63) << 32))) & j2;
            long j6 = 0;
            long j7 = j5 | (((long) 8) << 32) | (j6 - ((j6 >> 63) << 32));
            try {
                Object objRemoteActionCompatParcelizer7 = startForeground.RemoteActionCompatParcelizer(-1407079962);
                if (objRemoteActionCompatParcelizer7 == null) {
                    charSequence = "";
                    objRemoteActionCompatParcelizer7 = startForeground.read((char) (View.resolveSizeAndState(0, 0, 0) + 4535), View.getDefaultSize(0, 0) + 6054, 41 - TextUtils.indexOf(charSequence, '0', 0, 0), -764908173, false, "IconCompatParcelizer", new Class[0]);
                } else {
                    charSequence = "";
                }
                Object objInvoke = ((Method) objRemoteActionCompatParcelizer7).invoke(null, null);
                Object[] objArr28 = {-1031948217, Long.valueOf(j7), arrayList, TrainingApplication.RemoteActionCompatParcelizer(), false, false};
                Object objRemoteActionCompatParcelizer8 = startForeground.RemoteActionCompatParcelizer(1458445422);
                if (objRemoteActionCompatParcelizer8 == null) {
                    objRemoteActionCompatParcelizer8 = startForeground.read((char) KeyEvent.getDeadChar(0, 0), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 6030, 24 - TextUtils.indexOf(charSequence, charSequence, 0, 0), 682088699, false, "IconCompatParcelizer", new Class[]{Integer.TYPE, Long.TYPE, List.class, String.class, Boolean.TYPE, Boolean.TYPE});
                }
                ((Method) objRemoteActionCompatParcelizer8).invoke(objInvoke, objArr28);
                int i51 = ((int[]) objArr27[0])[0];
                int i52 = ((int[]) objArr27[1])[0];
                int i53 = ((int[]) objArr27[2])[0];
                String[] strArr7 = (String[]) objArr27[3];
                int[] iArr3 = {i53};
                int iFreeMemory = (int) Runtime.getRuntime().freeMemory();
                int i54 = (~((-686643767) | iFreeMemory)) | 8998914;
                int i55 = i51 + 377330057 + (i54 * 992) + ((i54 | (~((~iFreeMemory) | 788495351))) * (-496)) + ((iFreeMemory | 110850499) * 496);
                int i56 = (i55 << 13) ^ i55;
                int i57 = i56 ^ (i56 >>> 17);
                ((int[]) objArr[0])[0] = i57 ^ (i57 << 5);
                Object[] objArr29 = {new int[1], new int[]{i52}, iArr3, strArr7};
                throw new RuntimeException(String.valueOf(i17));
            } catch (Throwable th2) {
                Throwable cause2 = th2.getCause();
                if (cause2 != null) {
                    throw cause2;
                }
                throw th2;
            }
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 != null) {
                throw cause3;
            }
            throw th3;
        }
    }

    private static final getShowPopup addContentView() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 29;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        if (i3 == 0) {
            return getshowpopup;
        }
        throw null;
    }

    private static /* synthetic */ Object onPrepareFromSearch(Object[] objArr) {
        getAnswerMap getanswermap = (getAnswerMap) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 41;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        getanswermap.invoke(obj);
        if (i3 != 0) {
            int i4 = 77 / 0;
        }
        int i5 = addObserverForBackInvokerlambda7 + 13;
        accessonBackPresseds1027565324 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 91 / 0;
        }
        return null;
    }

    private static final void MediaDescriptionCompat(getAnswerMap getanswermap, Object obj) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 61;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        getanswermap.invoke(obj);
        if (i3 != 0) {
            throw null;
        }
        int i4 = addObserverForBackInvokerlambda7 + 111;
        accessonBackPresseds1027565324 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 48 / 0;
        }
    }

    private static final getShowPopup menuHostHelperlambda0() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 107;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = accessonBackPresseds1027565324 + 65;
        addObserverForBackInvokerlambda7 = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    static final class AudioAttributesCompatParcelizer extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ int IconCompatParcelizer;
        private int RemoteActionCompatParcelizer;

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) throws Throwable {
            Object objInvoke;
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.RemoteActionCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                Object objHandleMediaPlayPauseIfPendingOnHandler$532eb113 = fromStyleLine.handleMediaPlayPauseIfPendingOnHandler$532eb113(fromStyleLine.this);
                AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this;
                this.RemoteActionCompatParcelizer = 1;
                try {
                    Object[] objArr = {false, audioAttributesCompatParcelizer};
                    Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-997103213);
                    if (objRemoteActionCompatParcelizer == null) {
                        objRemoteActionCompatParcelizer = startForeground.read((char) (TextUtils.getOffsetBefore("", 0) + 1166), 22090 - Color.argb(0, 0, 0, 0), 19 - TextUtils.indexOf("", "", 0), -1160205050, false, "IconCompatParcelizer", new Class[]{Boolean.TYPE, SampleVideos.class});
                    }
                    objInvoke = ((Method) objRemoteActionCompatParcelizer).invoke(objHandleMediaPlayPauseIfPendingOnHandler$532eb113, objArr);
                    if (objInvoke == objIconCompatParcelizer) {
                        return objIconCompatParcelizer;
                    }
                } catch (Throwable th) {
                    Throwable cause = th.getCause();
                    if (cause != null) {
                        throw cause;
                    }
                    throw th;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
                objInvoke = obj;
            }
            List list = (List) objInvoke;
            parseAlignment.write writeVar = (parseAlignment.write) fromStyleLine.this.RemoteActionCompatParcelizer;
            int i2 = this.IconCompatParcelizer;
            Object[] objArr2 = {list};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-355574759);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) - 1), (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 23311, 26 - View.combineMeasuredStates(0, 0), -1803052916, false, "AudioAttributesCompatParcelizer", new Class[]{List.class});
            }
            List list2 = (List) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr2);
            Object[] objArr3 = {list};
            Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(502257889);
            if (objRemoteActionCompatParcelizer3 == null) {
                objRemoteActionCompatParcelizer3 = startForeground.read((char) (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)), 23313 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1)), 27 - (SystemClock.elapsedRealtimeNanos() > 0L ? 1 : (SystemClock.elapsedRealtimeNanos() == 0L ? 0 : -1)), 1671830644, false, "IconCompatParcelizer", new Class[]{List.class});
            }
            writeVar.IconCompatParcelizer(new MaxDownloadReachedArgs(i2, list2, ((Boolean) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr3)).booleanValue()));
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AudioAttributesCompatParcelizer(int i, SampleVideos<? super AudioAttributesCompatParcelizer> sampleVideos) {
            super(1, sampleVideos);
            this.IconCompatParcelizer = i;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return fromStyleLine.this.new AudioAttributesCompatParcelizer(this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((AudioAttributesCompatParcelizer) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void AudioAttributesCompatParcelizer(VideoCacheInfo videoCacheInfo) {
        getVariantWithSubtitleGroup getvariantwithsubtitlegroup;
        int i = 2 % 2;
        int downloadStatus = videoCacheInfo.getDownloadStatus();
        if (downloadStatus != -2) {
            int i2 = addObserverForBackInvokerlambda7 + 101;
            int i3 = i2 % 128;
            accessonBackPresseds1027565324 = i3;
            int i4 = i2 % 2;
            parseAlignment.RemoteActionCompatParcelizer remoteActionCompatParcelizer = null;
            if (downloadStatus != -1) {
                int i5 = i3 + 117;
                addObserverForBackInvokerlambda7 = i5 % 128;
                if (i5 % 2 != 0 ? downloadStatus == 1 : downloadStatus == 0) {
                    if (((parseAlignment.write) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(videoCacheInfo)) {
                        int i6 = addObserverForBackInvokerlambda7 + 45;
                        accessonBackPresseds1027565324 = i6 % 128;
                        if (i6 % 2 != 0) {
                            getVariantWithSubtitleGroup getvariantwithsubtitlegroup2 = getVariantWithSubtitleGroup.read;
                            remoteActionCompatParcelizer.hashCode();
                            throw null;
                        }
                        getvariantwithsubtitlegroup = getVariantWithSubtitleGroup.read;
                    } else {
                        getvariantwithsubtitlegroup = getVariantWithSubtitleGroup.AudioAttributesCompatParcelizer;
                    }
                    this.handleMediaPlayPauseIfPendingOnHandler = getvariantwithsubtitlegroup;
                }
            } else {
                parseAlignment.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.onCustomAction;
                if (remoteActionCompatParcelizer2 == null) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                } else {
                    remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
                }
                this.handleMediaPlayPauseIfPendingOnHandler = remoteActionCompatParcelizer.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() ? getVariantWithSubtitleGroup.write : getVariantWithSubtitleGroup.IconCompatParcelizer;
            }
        } else {
            this.handleMediaPlayPauseIfPendingOnHandler = getVariantWithSubtitleGroup.RemoteActionCompatParcelizer;
        }
        addOnConfigurationChangedListener();
        if (videoCacheInfo.getDownloadPercent() > BitmapDescriptorFactory.HUE_RED) {
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(true);
        }
    }

    private final void createFullyDrawnExecutor() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 91;
        accessonBackPresseds1027565324 = i2 % 128;
        if (i2 % 2 == 0) {
            this.handleMediaPlayPauseIfPendingOnHandler = getVariantWithSubtitleGroup.AudioAttributesCompatParcelizer;
            addOnConfigurationChangedListener();
        } else {
            this.handleMediaPlayPauseIfPendingOnHandler = getVariantWithSubtitleGroup.AudioAttributesCompatParcelizer;
            addOnConfigurationChangedListener();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
    }

    private final void addOnConfigurationChangedListener() {
        int i = 2 % 2;
        int i2 = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer[this.handleMediaPlayPauseIfPendingOnHandler.ordinal()];
        if (i2 == 1 || i2 == 2) {
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).PlaybackStateCompat();
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).getOnBackPressedDispatcherannotations();
            int i3 = accessonBackPresseds1027565324 + 125;
            addObserverForBackInvokerlambda7 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 77 / 0;
                return;
            }
            return;
        }
        int i5 = addObserverForBackInvokerlambda7 + 85;
        accessonBackPresseds1027565324 = i5 % 128;
        if (i5 % 2 == 0 ? i2 == 3 : i2 == 4) {
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).addOnUserLeaveHintListener();
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).addOnMultiWindowModeChangedListener();
            return;
        }
        if (i2 != 4) {
            if (i2 != 5) {
                return;
            }
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).PlaybackStateCompat();
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).menuHostHelperlambda0();
            return;
        }
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).PlaybackStateCompat();
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).addOnContextAvailableListener();
        int i6 = addObserverForBackInvokerlambda7 + 11;
        accessonBackPresseds1027565324 = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 60 / 0;
        }
    }

    public final void onPrepare() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 29;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).onNewIntent();
        int i4 = addObserverForBackInvokerlambda7 + 3;
        accessonBackPresseds1027565324 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static final getShowPopup read(fromStyleLine fromstyleline, MarrowResponse marrowResponse) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 3;
        addObserverForBackInvokerlambda7 = i2 % 128;
        LessonIndex lessonIndex = null;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(marrowResponse, "");
            boolean z = marrowResponse instanceof Success;
            lessonIndex.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        if (marrowResponse instanceof Success) {
            fromstyleline.onRewind.RemoteActionCompatParcelizer(fromstyleline.onPrepareFromUri, 2);
            String str = fromstyleline.onPrepareFromUri;
            LessonIndex lessonIndex2 = fromstyleline.onSeekTo;
            if (lessonIndex2 == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            } else {
                lessonIndex = lessonIndex2;
            }
            getLatestBitrateEstimate.MediaDescriptionCompat.IconCompatParcelizer(str, lessonIndex.getSubjectId(), fromstyleline.AudioAttributesCompatParcelizer, true);
            ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer();
            int i3 = accessonBackPresseds1027565324 + 109;
            addObserverForBackInvokerlambda7 = i3 % 128;
            int i4 = i3 % 2;
        } else if (!(!(marrowResponse instanceof MarrowError))) {
            fromstyleline.RemoteActionCompatParcelizer(((MarrowError) marrowResponse).getThrowable(), "mark_complete");
        }
        return getShowPopup.INSTANCE;
    }

    private static /* synthetic */ Object onSetPlaybackSpeed(Object[] objArr) {
        final fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 105;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        if (((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).onPrepare() == 2) {
            ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer();
            return null;
        }
        fromstyleline.AudioAttributesCompatParcelizer(fromstyleline.onRewind.AudioAttributesCompatParcelizer(fromstyleline.onPrepareFromUri), new getAnswerMap() { // from class: o.SubripSubtitle
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return fromStyleLine.RemoteActionCompatParcelizer(this.read, (MarrowResponse) obj);
            }
        });
        int i4 = accessonBackPresseds1027565324 + 103;
        addObserverForBackInvokerlambda7 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static final LessonIndex onPause(fromStyleLine fromstyleline) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 67;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        onAdPlaybackState onadplaybackstate = fromstyleline.onRewind;
        String str = fromstyleline.onPrepareFromUri;
        if (i3 != 0) {
            return onadplaybackstate.RemoteActionCompatParcelizer(str);
        }
        onadplaybackstate.RemoteActionCompatParcelizer(str);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final Pair read(MarrowResponse marrowResponse, LessonIndex lessonIndex) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        Pair pair = new Pair(marrowResponse, lessonIndex);
        int i2 = addObserverForBackInvokerlambda7 + 45;
        accessonBackPresseds1027565324 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 97 / 0;
        }
        return pair;
    }

    private static final getShowPopup AudioAttributesCompatParcelizer(fromStyleLine fromstyleline, Pair pair) {
        int i = 2 % 2;
        MarrowResponse marrowResponse = (MarrowResponse) pair.write();
        LessonIndex lessonIndex = (LessonIndex) pair.IconCompatParcelizer();
        String strIconCompatParcelizer = PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(lessonIndex != null ? lessonIndex.getSubjectId() : null);
        if (marrowResponse instanceof Success) {
            fromstyleline.MediaBrowserCompatMediaItem(strIconCompatParcelizer);
            int i2 = accessonBackPresseds1027565324 + 121;
            addObserverForBackInvokerlambda7 = i2 % 128;
            int i3 = i2 % 2;
        } else if (marrowResponse instanceof Failed) {
            int i4 = accessonBackPresseds1027565324 + 103;
            addObserverForBackInvokerlambda7 = i4 % 128;
            if (i4 % 2 == 0) {
                ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).write(((Failed) marrowResponse).getError());
                throw null;
            }
            ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).write(((Failed) marrowResponse).getError());
        } else {
            if (!(marrowResponse instanceof MarrowError)) {
                throw new RenewEligibleCreator();
            }
            int i5 = accessonBackPresseds1027565324 + 81;
            addObserverForBackInvokerlambda7 = i5 % 128;
            int i6 = i5 % 2;
            AudioAttributesCompatParcelizer(fromstyleline, ((MarrowError) marrowResponse).getThrowable(), "mark_complete");
        }
        return getShowPopup.INSTANCE;
    }

    public final void onSetRepeatMode() {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 59;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).aj_();
        if (((parseAlignment.write) this.RemoteActionCompatParcelizer).onPrepare() != 2) {
            LessonDynamicResponseBody lessonDynamicResponseBodyWrite = LessonDynamicResponseBody.write(this.onRewind.AudioAttributesCompatParcelizer(this.onPrepareFromUri), parseCea708AccessibilityChannel.write(new parseCea708AccessibilityChannel.RemoteActionCompatParcelizer() { // from class: o.buildTextNode
                @Override // o.parseCea708AccessibilityChannel.RemoteActionCompatParcelizer
                public final Object write() {
                    return fromStyleLine.read(this.IconCompatParcelizer);
                }
            }), new VideoBookmarkTimelineCompanion() { // from class: o.cleanUpText
                @Override // kotlin.VideoBookmarkTimelineCompanion
                public final Object read(Object obj, Object obj2) {
                    return fromStyleLine.write((MarrowResponse) obj, (LessonIndex) obj2);
                }
            });
            toMagicModuleMetaRepoModel.write(lessonDynamicResponseBodyWrite);
            AudioAttributesCompatParcelizer(lessonDynamicResponseBodyWrite, new getAnswerMap() { // from class: o.parseFontSize
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return fromStyleLine.write(this.IconCompatParcelizer, (Pair) obj);
                }
            });
        } else {
            AudioAttributesCompatParcelizer(this.onRewind.MediaBrowserCompatItemReceiver(this.onPrepareFromUri), new getAnswerMap() { // from class: o.SsaStyleOverrides
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj) {
                    return fromStyleLine.IconCompatParcelizer(this.write, (MarrowResponse) obj);
                }
            });
            int i4 = accessonBackPresseds1027565324 + 83;
            addObserverForBackInvokerlambda7 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    static final class MediaBrowserCompatCustomActionResultReceiver extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private /* synthetic */ VideoInfo AudioAttributesCompatParcelizer;
        private /* synthetic */ boolean AudioAttributesImplApi21Parcelizer;
        private int AudioAttributesImplApi26Parcelizer;
        private /* synthetic */ ThemeState IconCompatParcelizer;
        private /* synthetic */ List<String> RemoteActionCompatParcelizer;
        private /* synthetic */ int read;
        private /* synthetic */ String write;

        static final class read extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getChildCount>, Object> {
            private /* synthetic */ String AudioAttributesCompatParcelizer;
            private /* synthetic */ fromStyleLine AudioAttributesImplApi26Parcelizer;
            private /* synthetic */ boolean AudioAttributesImplBaseParcelizer;
            private /* synthetic */ VideoInfo IconCompatParcelizer;
            private int MediaBrowserCompatItemReceiver;
            private /* synthetic */ List<String> RemoteActionCompatParcelizer;
            private /* synthetic */ ThemeState read;
            private /* synthetic */ int write;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) {
                getYear.IconCompatParcelizer();
                SdkPayloadData.IconCompatParcelizer(obj);
                fromStyleLine fromstyleline = this.AudioAttributesImplApi26Parcelizer;
                VideoInfo videoInfo = this.IconCompatParcelizer;
                int i = this.write;
                String str = this.AudioAttributesCompatParcelizer;
                boolean z = this.AudioAttributesImplBaseParcelizer;
                ThemeState themeState = this.read;
                return fromStyleLine.IconCompatParcelizer(fromstyleline, videoInfo, i, str, z, themeState == null ? ThemeState.INSTANCE.getThemeState(ThemeState.LIGHT_SINGLE.getTheme(), this.RemoteActionCompatParcelizer) : themeState);
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            read(fromStyleLine fromstyleline, VideoInfo videoInfo, int i, String str, boolean z, ThemeState themeState, List<String> list, SampleVideos<? super read> sampleVideos) {
                super(2, sampleVideos);
                this.AudioAttributesImplApi26Parcelizer = fromstyleline;
                this.IconCompatParcelizer = videoInfo;
                this.write = i;
                this.AudioAttributesCompatParcelizer = str;
                this.AudioAttributesImplBaseParcelizer = z;
                this.read = themeState;
                this.RemoteActionCompatParcelizer = list;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new read(this.AudioAttributesImplApi26Parcelizer, this.IconCompatParcelizer, this.write, this.AudioAttributesCompatParcelizer, this.AudioAttributesImplBaseParcelizer, this.read, this.RemoteActionCompatParcelizer, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getChildCount> sampleVideos) {
                return ((read) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.AudioAttributesImplApi26Parcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.AudioAttributesImplApi26Parcelizer = 1;
                obj = setModifiedEndTimestampMs.RemoteActionCompatParcelizer(fromStyleLine.AudioAttributesImplApi26Parcelizer(fromStyleLine.this), new read(fromStyleLine.this, this.AudioAttributesCompatParcelizer, this.read, this.write, this.AudioAttributesImplApi21Parcelizer, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, null), this);
                if (obj == objIconCompatParcelizer) {
                    return objIconCompatParcelizer;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                SdkPayloadData.IconCompatParcelizer(obj);
            }
            fromStyleLine.write(fromStyleLine.this, (getChildCount) obj);
            return getShowPopup.INSTANCE;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaBrowserCompatCustomActionResultReceiver(VideoInfo videoInfo, int i, String str, boolean z, ThemeState themeState, List<String> list, SampleVideos<? super MediaBrowserCompatCustomActionResultReceiver> sampleVideos) {
            super(1, sampleVideos);
            this.AudioAttributesCompatParcelizer = videoInfo;
            this.read = i;
            this.write = str;
            this.AudioAttributesImplApi21Parcelizer = z;
            this.IconCompatParcelizer = themeState;
            this.RemoteActionCompatParcelizer = list;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return fromStyleLine.this.new MediaBrowserCompatCustomActionResultReceiver(this.AudioAttributesCompatParcelizer, this.read, this.write, this.AudioAttributesImplApi21Parcelizer, this.IconCompatParcelizer, this.RemoteActionCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaBrowserCompatCustomActionResultReceiver) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private static final getShowPopup write(fromStyleLine fromstyleline, MarrowResponse marrowResponse) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 109;
        addObserverForBackInvokerlambda7 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(marrowResponse, "");
            ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
            boolean z = marrowResponse instanceof Success;
            throw null;
        }
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
        if (!(!(marrowResponse instanceof Success))) {
            if (((MarkIncompleteResponseBody) ((Success) marrowResponse).getData()).isLessonReset) {
                fromstyleline.addObserverForBackInvoker();
            }
        } else if (marrowResponse instanceof Failed) {
            ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).write(((Failed) marrowResponse).getError());
        } else {
            if (!(marrowResponse instanceof MarrowError)) {
                throw new RenewEligibleCreator();
            }
            AudioAttributesCompatParcelizer(fromstyleline, ((MarrowError) marrowResponse).getThrowable(), "mark_incomplete");
        }
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i3 = addObserverForBackInvokerlambda7 + 17;
        accessonBackPresseds1027565324 = i3 % 128;
        if (i3 % 2 == 0) {
            return getshowpopup;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x003e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void MediaBrowserCompatMediaItem(java.lang.String r6) {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7
            int r1 = r1 + 53
            int r2 = r1 % 128
            kotlin.fromStyleLine.accessonBackPresseds1027565324 = r2
            int r1 = r1 % r0
            o.onAdPlaybackState r1 = r5.onRewind
            java.lang.String r2 = r5.onPrepareFromUri
            r1.RemoteActionCompatParcelizer(r2, r0)
            o.hasMediaSource r1 = r5.onRemoveQueueItem
            java.lang.String r2 = r5.onPrepareFromUri
            java.util.List r1 = r1.RemoteActionCompatParcelizer(r2)
            r2 = r1
            java.util.Collection r2 = (java.util.Collection) r2
            if (r2 == 0) goto L3e
            int r3 = kotlin.fromStyleLine.accessonBackPresseds1027565324
            int r3 = r3 + 125
            int r4 = r3 % 128
            kotlin.fromStyleLine.addObserverForBackInvokerlambda7 = r4
            int r3 = r3 % r0
            boolean r2 = r2.isEmpty()
            if (r2 != 0) goto L3e
            o.getStreamPositionUsForContent r2 = r5.setSessionImpl
            r2.RemoteActionCompatParcelizer(r1)
            int r1 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7
            int r1 = r1 + 63
            int r2 = r1 % 128
            kotlin.fromStyleLine.accessonBackPresseds1027565324 = r2
            int r1 = r1 % r0
            goto L43
        L3e:
            o.getStreamPositionUsForContent r0 = r5.setSessionImpl
            r0.onPrepareFromMediaId()
        L43:
            o.TopUserCompanion r0 = r5.onSkipToNext
            o.fromStyleLine$AudioAttributesImplApi21Parcelizer r1 = new o.fromStyleLine$AudioAttributesImplApi21Parcelizer
            r2 = 0
            r1.<init>(r6, r2)
            o.getAnswerMap r1 = (kotlin.getAnswerMap) r1
            o.SsaStyleSsaAlignment r5 = new o.SsaStyleSsaAlignment
            r5.<init>()
            kotlin.CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(r0, r1, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.fromStyleLine.MediaBrowserCompatMediaItem(java.lang.String):void");
    }

    private static final getShowPopup RatingCompat(String str) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 11;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = addObserverForBackInvokerlambda7 + 27;
        accessonBackPresseds1027565324 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 21 / 0;
        }
        return getshowpopup;
    }

    private final void addObserverForBackInvoker() {
        int i;
        int i2 = 2 % 2;
        int i3 = this._init_lambda5.read(this.onPrepareFromUri);
        if (10 <= i3 && i3 < 95) {
            i = 1;
        } else if (i3 > 94) {
            int i4 = addObserverForBackInvokerlambda7 + 79;
            accessonBackPresseds1027565324 = i4 % 128;
            int i5 = i4 % 2;
            i = 2;
        } else {
            int i6 = addObserverForBackInvokerlambda7 + 99;
            accessonBackPresseds1027565324 = i6 % 128;
            int i7 = i6 % 2;
            i = 0;
        }
        this.onRewind.RemoteActionCompatParcelizer(this.onPrepareFromUri, i);
        if (Arrays.equals(this.onRemoveQueueItem.RemoteActionCompatParcelizer(this.onPrepareFromUri).toArray(new String[0]), this.setSessionImpl.onRewind().toArray(new String[0]))) {
            int i8 = accessonBackPresseds1027565324 + 107;
            addObserverForBackInvokerlambda7 = i8 % 128;
            int i9 = i8 % 2;
            this.setSessionImpl.onPrepareFromMediaId();
        }
        parseAlignment.write writeVar = (parseAlignment.write) this.RemoteActionCompatParcelizer;
        writeVar.read(0);
        writeVar.AudioAttributesCompatParcelizer(0, this.onPrepareFromUri);
        writeVar.AudioAttributesCompatParcelizer(true);
        writeVar.AudioAttributesCompatParcelizer("Lesson has been marked incomplete");
        String str = this.onPrepareFromUri;
        LessonIndex lessonIndex = this.onSeekTo;
        if (lessonIndex == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            lessonIndex = null;
        }
        getLatestBitrateEstimate.MediaDescriptionCompat.IconCompatParcelizer(str, lessonIndex.getSubjectId(), this.write, false);
    }

    public final void IconCompatParcelizer(String str, int i, String str2) {
        int i2 = 2 % 2;
        String str3 = str;
        if (str3 == null || str3.length() == 0 || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) this.onPrepareFromUri)) {
            return;
        }
        int i3 = addObserverForBackInvokerlambda7 + 63;
        int i4 = i3 % 128;
        accessonBackPresseds1027565324 = i4;
        int i5 = i3 % 2;
        if (i != -2) {
            int i6 = i4 + 65;
            addObserverForBackInvokerlambda7 = i6 % 128;
            if (i6 % 2 == 0) {
                throw null;
            }
            if (i != -1) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) this.onPrepareFromUri)) {
                    if (i < 99) {
                        this.handleMediaPlayPauseIfPendingOnHandler = getVariantWithSubtitleGroup.RemoteActionCompatParcelizer;
                        addOnConfigurationChangedListener();
                        ((parseAlignment.write) this.RemoteActionCompatParcelizer).IconCompatParcelizer(i);
                        return;
                    } else {
                        int i7 = addObserverForBackInvokerlambda7 + 31;
                        accessonBackPresseds1027565324 = i7 % 128;
                        int i8 = i7 % 2;
                        this.handleMediaPlayPauseIfPendingOnHandler = getVariantWithSubtitleGroup.read;
                        ((parseAlignment.write) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(true);
                        addOnConfigurationChangedListener();
                        return;
                    }
                }
                return;
            }
        }
        VideoInfo videoInfoAccessensureViewModelStore = accessensureViewModelStore();
        if (videoInfoAccessensureViewModelStore != null) {
            getDataSpec getdataspec = this.onSetCaptioningEnabled;
            String mediaId = videoInfoAccessensureViewModelStore.getMediaId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mediaId, "");
            VideoCacheInfo videoCacheInfoWrite = getdataspec.write(mediaId);
            if (videoCacheInfoWrite == null) {
                this.handleMediaPlayPauseIfPendingOnHandler = getVariantWithSubtitleGroup.AudioAttributesCompatParcelizer;
            } else if (videoCacheInfoWrite.getDownloadStatus() != 1) {
                this.handleMediaPlayPauseIfPendingOnHandler = getVariantWithSubtitleGroup.IconCompatParcelizer;
            }
            addOnConfigurationChangedListener();
            if (i == -1) {
                parseAlignment.write writeVar = (parseAlignment.write) this.RemoteActionCompatParcelizer;
                if (str2 == null) {
                    int i9 = accessonBackPresseds1027565324 + 111;
                    addObserverForBackInvokerlambda7 = i9 % 128;
                    int i10 = i9 % 2;
                    str2 = "Video download failed. Please try again.";
                }
                writeVar.write(new ResponseError(-444, str2, false, 4, null));
            }
        }
    }

    public final void onSeekTo() {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 25;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = RemoteActionCompatParcelizer.RemoteActionCompatParcelizer[this.handleMediaPlayPauseIfPendingOnHandler.ordinal()];
        if (i4 == 1 || i4 == 2) {
            int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
            write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 659417572, new Object[]{this}, iWrite3, iWrite2, -659417567);
            return;
        }
        if (i4 == 3) {
            getActivityResultRegistry();
            return;
        }
        if (i4 == 4) {
            addOnNewIntentListener();
            return;
        }
        if (i4 != 5) {
            return;
        }
        int iWrite4 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite5 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite6 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite4, 541174392, new Object[]{this}, iWrite6, iWrite5, -541174376);
        int i5 = accessonBackPresseds1027565324 + 51;
        addObserverForBackInvokerlambda7 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0034, code lost:
    
        if (r3.getPixelRate() > 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003b, code lost:
    
        if (r3.getPixelRate() > 0) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0041, code lost:
    
        if (r1.handleMediaPlayPauseIfPendingOnHandler == kotlin.getVariantWithSubtitleGroup.RemoteActionCompatParcelizer) goto L31;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
    
        r0 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7 + 41;
        kotlin.fromStyleLine.accessonBackPresseds1027565324 = r0 % 128;
        r0 = r0 % 2;
        AudioAttributesImplApi26Parcelizer("downloadTapped, currentState=".concat(java.lang.String.valueOf(r1.handleMediaPlayPauseIfPendingOnHandler.name())));
        r0 = r1.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4;
        r4 = r1.onSeekTo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0063, code lost:
    
        if (r4 != null) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x0065, code lost:
    
        kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0069, code lost:
    
        r4 = r4.isPaid();
        r6 = r1.onSeekTo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x006f, code lost:
    
        if (r6 != null) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0071, code lost:
    
        r6 = kotlin.fromStyleLine.accessonBackPresseds1027565324 + 3;
        kotlin.fromStyleLine.addObserverForBackInvokerlambda7 = r6 % 128;
        r6 = r6 % 2;
        kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x007e, code lost:
    
        r9 = r6.hasVideo();
        r6 = r1.onSeekTo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0084, code lost:
    
        if (r6 != null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0086, code lost:
    
        kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0093, code lost:
    
        if (kotlin.PlayerControlViewComponentListener.read(r0, r4, r9, r6.getRootSubjectId()) == true) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0095, code lost:
    
        ((o.parseAlignment.write) r1.RemoteActionCompatParcelizer).onSaveInstanceState();
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x009c, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x009d, code lost:
    
        r1.write(r2, r3.getPixelRate(), kotlin.PlayerControlViewExternalSyntheticLambda0.IconCompatParcelizer(r3.getDownloadSessionId()), true, com.marrow.data.models.video.ThemeState.Companion.toThemeState(java.lang.Integer.valueOf(r3.getDownloadedThemeState())), null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00bd, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        AudioAttributesImplApi26Parcelizer("stopDownload - changed to interrupted");
        r1.handleMediaPlayPauseIfPendingOnHandler = kotlin.getVariantWithSubtitleGroup.IconCompatParcelizer;
        r0 = r1.onCustomAction;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00c9, code lost:
    
        if (r0 != null) goto L34;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00cb, code lost:
    
        kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        r0 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00cf, code lost:
    
        r2 = r1.onPrepareFromUri;
        r3 = r1.onSeekTo;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00d3, code lost:
    
        if (r3 != null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00d5, code lost:
    
        r3 = kotlin.fromStyleLine.accessonBackPresseds1027565324 + 43;
        kotlin.fromStyleLine.addObserverForBackInvokerlambda7 = r3 % 128;
        r3 = r3 % 2;
        kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00e2, code lost:
    
        r9 = r3.getTitle();
        kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r9, "");
        r0.write(r2, r9);
        r1.addOnConfigurationChangedListener();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ef, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object AudioAttributesImplApi26Parcelizer(java.lang.Object[] r9) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 244
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.fromStyleLine.AudioAttributesImplApi26Parcelizer(java.lang.Object[]):java.lang.Object");
    }

    public final void onSkipToPrevious() {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 67;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).ensureViewModelStore();
        int i4 = accessonBackPresseds1027565324 + 17;
        addObserverForBackInvokerlambda7 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final getShowPopup IconCompatParcelizer(fromStyleLine fromstyleline, int i, String str) {
        int i2 = 2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).IconCompatParcelizer(new MaxDownloadReachedArgs(i, null, false, 6, null));
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i3 = accessonBackPresseds1027565324 + 101;
        addObserverForBackInvokerlambda7 = i3 % 128;
        int i4 = i3 % 2;
        return getshowpopup;
    }

    private static /* synthetic */ Object MediaBrowserCompatMediaItem(Object[] objArr) {
        MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody = (MagicModuleSubmissionRequestBody) objArr[0];
        Object obj = objArr[1];
        Object obj2 = objArr[2];
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 29;
        accessonBackPresseds1027565324 = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(obj, "");
            toMagicModuleMetaRepoModel.write(obj2, "");
            return (DownloadOptionsUIModel) magicModuleSubmissionRequestBody.invoke(obj, obj2);
        }
        toMagicModuleMetaRepoModel.write(obj, "");
        toMagicModuleMetaRepoModel.write(obj2, "");
        Object obj3 = null;
        obj3.hashCode();
        throw null;
    }

    private static final DownloadOptionsUIModel IconCompatParcelizer$4744cdda(List list, Object obj) throws Throwable {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(list, "");
        toMagicModuleMetaRepoModel.write(obj, "");
        List<DownloadableResolution> listWrite = write((Pair<? extends List<getClosedCaptionTrackFormats>, Object>) setAction.write(list, obj));
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-239220375);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (12754 - (ViewConfiguration.getTapTimeout() >> 16)), 13986 - ExpandableListView.getPackedPositionChild(0L), 25 - Drawable.resolveOpacity(0, 0), -1879831044, false, "AudioAttributesCompatParcelizer", new Class[0]);
            }
            DownloadOptionsUIModel downloadOptionsUIModel = new DownloadOptionsUIModel(listWrite, (List) ((Method) objRemoteActionCompatParcelizer).invoke(obj, null));
            int i2 = addObserverForBackInvokerlambda7 + 101;
            accessonBackPresseds1027565324 = i2 % 128;
            if (i2 % 2 != 0) {
                int i3 = 69 / 0;
            }
            return downloadOptionsUIModel;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void write(com.marrow.data.models.content.VideoInfo r25) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 542
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.fromStyleLine.write(com.marrow.data.models.content.VideoInfo):void");
    }

    private static final getShowPopup read(fromStyleLine fromstyleline, int i, DownloadOptionsUIModel downloadOptionsUIModel) {
        int i2 = 2 % 2;
        int i3 = accessonBackPresseds1027565324 + 109;
        addObserverForBackInvokerlambda7 = i3 % 128;
        if (i3 % 2 == 0) {
            ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
            downloadOptionsUIModel.getAvailableResolutions().isEmpty();
            throw null;
        }
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
        if (downloadOptionsUIModel.getAvailableResolutions().isEmpty()) {
            ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).write(ResponseError.INSTANCE.customError("There was no resolutions available to download."));
        } else {
            int i4 = addObserverForBackInvokerlambda7 + 77;
            accessonBackPresseds1027565324 = i4 % 128;
            if (i4 % 2 != 0) {
                fromstyleline.write("popup_shown");
                ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).read(downloadOptionsUIModel.getAvailableResolutions(), i, downloadOptionsUIModel.getAvailableThemes());
                throw null;
            }
            fromstyleline.write("popup_shown");
            ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).read(downloadOptionsUIModel.getAvailableResolutions(), i, downloadOptionsUIModel.getAvailableThemes());
        }
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i5 = addObserverForBackInvokerlambda7 + 15;
        accessonBackPresseds1027565324 = i5 % 128;
        int i6 = i5 % 2;
        return getshowpopup;
    }

    private static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(fromStyleLine fromstyleline, Throwable th) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 75;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(th, "");
        AudioAttributesCompatParcelizer(fromstyleline, th, "download_license_failure");
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = accessonBackPresseds1027565324 + 47;
        addObserverForBackInvokerlambda7 = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    private static /* synthetic */ void AudioAttributesCompatParcelizer(fromStyleLine fromstyleline, Throwable th, String str) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 103;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        fromstyleline.RemoteActionCompatParcelizer(th, str, (String) null);
        if (i3 == 0) {
            throw null;
        }
        int i4 = addObserverForBackInvokerlambda7 + 107;
        accessonBackPresseds1027565324 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private final void RemoteActionCompatParcelizer(Throwable th, String str, String str2) {
        int i = 2 % 2;
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
        if (!parseDescriptor.read(th)) {
            RemoteActionCompatParcelizer(th, str);
            write(th);
            return;
        }
        int i2 = accessonBackPresseds1027565324 + 41;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).MediaBrowserCompatMediaItem();
        int i4 = addObserverForBackInvokerlambda7 + 95;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
    }

    private final void write(VideoInfo videoInfo, int i, String str, boolean z, ThemeState themeState, List<String> list) {
        int i2 = 2 % 2;
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(this.onSkipToNext, new MediaBrowserCompatCustomActionResultReceiver(videoInfo, i, str, z, themeState, list, null), new MagicModuleSubmissionRequestBody() { // from class: o.parseTtsExtent
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
                int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
                int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
                return (getShowPopup) fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -2068943433, new Object[]{(String) obj2}, iWrite3, iWrite2, 2068943434);
            }
        });
        int i3 = addObserverForBackInvokerlambda7 + 13;
        accessonBackPresseds1027565324 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 49 / 0;
        }
    }

    private static final getShowPopup MediaMetadataCompat(String str) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 87;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = addObserverForBackInvokerlambda7 + 57;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    private final void write(getChildCount getchildcount) {
        int i = 2 % 2;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getchildcount, getChildCount.write.INSTANCE)) {
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).MediaBrowserCompatMediaItem();
            AudioAttributesImplApi26Parcelizer("No internet");
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getchildcount, getChildCount.IconCompatParcelizer.INSTANCE)) {
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).write(ResponseError.INSTANCE.customError(read(R.string.vid_dwn_err_no_space)));
            AudioAttributesImplApi26Parcelizer("No space");
            return;
        }
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getchildcount, getChildCount.read.INSTANCE)) {
            int i2 = accessonBackPresseds1027565324 + 69;
            addObserverForBackInvokerlambda7 = i2 % 128;
            if (i2 % 2 != 0) {
                this.handleMediaPlayPauseIfPendingOnHandler = getVariantWithSubtitleGroup.read;
                addOnConfigurationChangedListener();
                AudioAttributesImplApi26Parcelizer("Already downloaded");
                return;
            } else {
                this.handleMediaPlayPauseIfPendingOnHandler = getVariantWithSubtitleGroup.read;
                addOnConfigurationChangedListener();
                AudioAttributesImplApi26Parcelizer("Already downloaded");
                int i3 = 21 / 0;
                return;
            }
        }
        if (!(!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(getchildcount, getChildCount.AudioAttributesCompatParcelizer.INSTANCE))) {
            int i4 = addObserverForBackInvokerlambda7 + 105;
            accessonBackPresseds1027565324 = i4 % 128;
            int i5 = i4 % 2;
            this.handleMediaPlayPauseIfPendingOnHandler = getVariantWithSubtitleGroup.write;
            addOnConfigurationChangedListener();
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(read(R.string.vid_dwn_toast_queue));
            AudioAttributesImplApi26Parcelizer("Queued");
            return;
        }
        if (getchildcount instanceof getChildCount.RemoteActionCompatParcelizer) {
            int i6 = accessonBackPresseds1027565324 + 51;
            addObserverForBackInvokerlambda7 = i6 % 128;
            int i7 = i6 % 2;
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
            getChildCount.RemoteActionCompatParcelizer remoteActionCompatParcelizer = (getChildCount.RemoteActionCompatParcelizer) getchildcount;
            Object[] objArr = {this, Integer.valueOf(remoteActionCompatParcelizer.read()), Boolean.valueOf(remoteActionCompatParcelizer.AudioAttributesCompatParcelizer()), remoteActionCompatParcelizer.RemoteActionCompatParcelizer()};
            write(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -324616736, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 324616750);
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer("Please check the notification for status of the download.");
            return;
        }
        if (!(getchildcount instanceof getChildCount.AudioAttributesImplBaseParcelizer)) {
            throw new RenewEligibleCreator();
        }
        int i8 = addObserverForBackInvokerlambda7 + 17;
        accessonBackPresseds1027565324 = i8 % 128;
        int i9 = i8 % 2;
        getChildCount.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = (getChildCount.AudioAttributesImplBaseParcelizer) getchildcount;
        Object[] objArr2 = {this, Integer.valueOf(audioAttributesImplBaseParcelizer.write()), Boolean.valueOf(audioAttributesImplBaseParcelizer.AudioAttributesCompatParcelizer()), audioAttributesImplBaseParcelizer.IconCompatParcelizer()};
        write(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -324616736, objArr2, maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 324616750);
        parseAlignment.write writeVar = (parseAlignment.write) this.RemoteActionCompatParcelizer;
        String strIconCompatParcelizer = audioAttributesImplBaseParcelizer.IconCompatParcelizer();
        if (strIconCompatParcelizer.length() > 0) {
            StringBuilder sb = new StringBuilder();
            String strValueOf = String.valueOf(strIconCompatParcelizer.charAt(0));
            toMagicModuleMetaRepoModel.read(strValueOf, "");
            String upperCase = strValueOf.toUpperCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(upperCase, "");
            sb.append((Object) upperCase);
            String strSubstring = strIconCompatParcelizer.substring(1);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(strSubstring, "");
            sb.append(strSubstring);
            strIconCompatParcelizer = sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(strIconCompatParcelizer);
        sb2.append(" video is downloading");
        writeVar.RatingCompat(sb2.toString());
    }

    private final getChildCount read(VideoInfo videoInfo, int i, String str, boolean z, ThemeState themeState) {
        int i2 = 2 % 2;
        if (!this.MediaMetadataCompat.aC_()) {
            return getChildCount.write.INSTANCE;
        }
        if (this.ResultReceiver.RemoteActionCompatParcelizer()) {
            return getChildCount.IconCompatParcelizer.INSTANCE;
        }
        String mediaId = videoInfo.getMediaId();
        getDataSpec getdataspec = this.onSetCaptioningEnabled;
        toMagicModuleMetaRepoModel.write((Object) mediaId);
        VideoCacheInfo videoCacheInfoWrite = getdataspec.write(mediaId);
        parseAlignment.RemoteActionCompatParcelizer remoteActionCompatParcelizer = null;
        if (videoCacheInfoWrite != null) {
            int i3 = accessonBackPresseds1027565324 + 57;
            addObserverForBackInvokerlambda7 = i3 % 128;
            int i4 = i3 % 2;
            if (videoCacheInfoWrite.getDownloadStatus() == 1) {
                int i5 = addObserverForBackInvokerlambda7 + 1;
                accessonBackPresseds1027565324 = i5 % 128;
                if (i5 % 2 == 0) {
                    return getChildCount.read.INSTANCE;
                }
                getChildCount.read readVar = getChildCount.read.INSTANCE;
                remoteActionCompatParcelizer.hashCode();
                throw null;
            }
        }
        if (videoCacheInfoWrite == null) {
            videoCacheInfoWrite = this.onSetCaptioningEnabled.AudioAttributesCompatParcelizer(this.onPrepareFromUri, mediaId, i, str, themeState, this.setSessionImpl.onRemoveQueueItem());
        } else if (videoCacheInfoWrite.getDownloadedThemeState() != themeState.getValue()) {
            getChildCount.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizer = new getChildCount.AudioAttributesImplBaseParcelizer(videoCacheInfoWrite.getPixelRate(), z, ThemeState.INSTANCE.toThemeState(Integer.valueOf(videoCacheInfoWrite.getDownloadedThemeState())).getTheme());
            int i6 = accessonBackPresseds1027565324 + 29;
            addObserverForBackInvokerlambda7 = i6 % 128;
            int i7 = i6 % 2;
            return audioAttributesImplBaseParcelizer;
        }
        parseAlignment.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.onCustomAction;
        if (remoteActionCompatParcelizer2 == null) {
            int i8 = accessonBackPresseds1027565324 + 51;
            addObserverForBackInvokerlambda7 = i8 % 128;
            int i9 = i8 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
        }
        if (!remoteActionCompatParcelizer.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8()) {
            return new getChildCount.RemoteActionCompatParcelizer(videoCacheInfoWrite.getPixelRate(), z, ThemeState.INSTANCE.toThemeState(Integer.valueOf(videoCacheInfoWrite.getDownloadedThemeState())).getTheme());
        }
        this.onSetCaptioningEnabled.read(mediaId);
        getChildCount.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = getChildCount.AudioAttributesCompatParcelizer.INSTANCE;
        int i10 = addObserverForBackInvokerlambda7 + 15;
        accessonBackPresseds1027565324 = i10 % 128;
        int i11 = i10 % 2;
        return audioAttributesCompatParcelizer;
    }

    private static void AudioAttributesImplApi26Parcelizer(String str) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 119;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        buildResolutionString.IconCompatParcelizer("VideoDownload123", str);
        int i4 = addObserverForBackInvokerlambda7 + 115;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final getShowPopup AudioAttributesCompatParcelizer(fromStyleLine fromstyleline, ApiResponse apiResponse) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 35;
        addObserverForBackInvokerlambda7 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(apiResponse, "");
            int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
            write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -1949021304, new Object[]{fromstyleline, apiResponse}, iWrite3, iWrite2, 1949021344);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            throw null;
        }
        toMagicModuleMetaRepoModel.write(apiResponse, "");
        int iWrite4 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite5 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite6 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite4, -1949021304, new Object[]{fromstyleline, apiResponse}, iWrite6, iWrite5, 1949021344);
        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        int i3 = accessonBackPresseds1027565324 + 65;
        addObserverForBackInvokerlambda7 = i3 % 128;
        if (i3 % 2 != 0) {
            return getshowpopup2;
        }
        obj.hashCode();
        throw null;
    }

    private final void write(Throwable th) {
        int i = 2 % 2;
        ResponseErrorException responseErrorExceptionIconCompatParcelizer = getIconUrl.IconCompatParcelizer(th);
        if (responseErrorExceptionIconCompatParcelizer == null) {
            read(th);
            return;
        }
        ResponseError.Companion companion = ResponseError.INSTANCE;
        ResponseError error = responseErrorExceptionIconCompatParcelizer.getError();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(error, "");
        if (companion.isTimestampInvalidError(error)) {
            int i2 = accessonBackPresseds1027565324 + 85;
            addObserverForBackInvokerlambda7 = i2 % 128;
            if (i2 % 2 == 0) {
                this.MediaBrowserCompatCustomActionResultReceiver.timestampInvalid(responseErrorExceptionIconCompatParcelizer.getError());
                int i3 = 51 / 0;
            } else {
                this.MediaBrowserCompatCustomActionResultReceiver.timestampInvalid(responseErrorExceptionIconCompatParcelizer.getError());
            }
        } else {
            ResponseError.Companion companion2 = ResponseError.INSTANCE;
            ResponseError error2 = responseErrorExceptionIconCompatParcelizer.getError();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(error2, "");
            if (companion2.isLogoutRequired(error2)) {
                int i4 = addObserverForBackInvokerlambda7 + 7;
                accessonBackPresseds1027565324 = i4 % 128;
                int i5 = i4 % 2;
                this.MediaBrowserCompatCustomActionResultReceiver.logout(responseErrorExceptionIconCompatParcelizer.getError());
            } else {
                ResponseError.Companion companion3 = ResponseError.INSTANCE;
                ResponseError error3 = responseErrorExceptionIconCompatParcelizer.getError();
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(error3, "");
                if (companion3.isAuthError(error3)) {
                    accessgetEmptyStatecp<ApiResponse<LoggedUserResponse>> accessgetemptystatecpWrite = this._init_lambda3.write();
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(accessgetemptystatecpWrite, "");
                    IconCompatParcelizer(accessgetemptystatecpWrite, new getAnswerMap() { // from class: o.getFractionalPositionForAnchorType
                        @Override // kotlin.getAnswerMap
                        public final Object invoke(Object obj) {
                            return fromStyleLine.write(this.write, (ApiResponse) obj);
                        }
                    }, "load_license");
                } else {
                    ((parseAlignment.write) this.RemoteActionCompatParcelizer).write(responseErrorExceptionIconCompatParcelizer.getError());
                    int i6 = addObserverForBackInvokerlambda7 + 65;
                    accessonBackPresseds1027565324 = i6 % 128;
                    int i7 = i6 % 2;
                }
            }
        }
        read((Throwable) responseErrorExceptionIconCompatParcelizer);
    }

    private static /* synthetic */ Object onSetRepeatMode(Object[] objArr) throws Throwable {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        ApiResponse apiResponse = (ApiResponse) objArr[1];
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 73;
        addObserverForBackInvokerlambda7 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            apiResponse.hasData();
            obj.hashCode();
            throw null;
        }
        if (!apiResponse.hasData()) {
            if (apiResponse.code != 1203) {
                fromstyleline.write(new ResponseErrorException(apiResponse.getError()));
                ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).write(apiResponse.getError());
                return null;
            }
            int i3 = addObserverForBackInvokerlambda7 + 51;
            accessonBackPresseds1027565324 = i3 % 128;
            int i4 = i3 % 2;
            fromstyleline.MediaBrowserCompatCustomActionResultReceiver.logout(apiResponse.getError());
            return null;
        }
        VideoInfo videoInfoAccessensureViewModelStore = fromstyleline.accessensureViewModelStore();
        if (videoInfoAccessensureViewModelStore != null) {
            int i5 = accessonBackPresseds1027565324 + 7;
            addObserverForBackInvokerlambda7 = i5 % 128;
            int i6 = i5 % 2;
            fromstyleline.write(videoInfoAccessensureViewModelStore);
        }
        int i7 = addObserverForBackInvokerlambda7 + 101;
        accessonBackPresseds1027565324 = i7 % 128;
        if (i7 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void read(Throwable th) {
        int i = 2 % 2;
        HashMap map = new HashMap();
        if (th instanceof UnsupportedDrmException) {
            int i2 = accessonBackPresseds1027565324 + 23;
            addObserverForBackInvokerlambda7 = i2 % 128;
            int i3 = i2 % 2;
            map.put("drm_issue_reason", String.valueOf(((UnsupportedDrmException) th).reason));
            int i4 = addObserverForBackInvokerlambda7 + 111;
            accessonBackPresseds1027565324 = i4 % 128;
            int i5 = i4 % 2;
        }
        am_().write(th, map);
        int i6 = accessonBackPresseds1027565324 + 113;
        addObserverForBackInvokerlambda7 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 5 / 0;
        }
    }

    private void getActivityResultRegistry() {
        int i = 2 % 2;
        parseAlignment.RemoteActionCompatParcelizer remoteActionCompatParcelizer = this.onCustomAction;
        LessonIndex lessonIndex = null;
        if (remoteActionCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            remoteActionCompatParcelizer = null;
        }
        String str = this.onPrepareFromUri;
        LessonIndex lessonIndex2 = this.onSeekTo;
        if (lessonIndex2 == null) {
            int i2 = addObserverForBackInvokerlambda7 + 43;
            accessonBackPresseds1027565324 = i2 % 128;
            if (i2 % 2 != 0) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                int i3 = 62 / 0;
            } else {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            }
        } else {
            int i4 = accessonBackPresseds1027565324 + 125;
            addObserverForBackInvokerlambda7 = i4 % 128;
            int i5 = i4 % 2;
            lessonIndex = lessonIndex2;
        }
        String title = lessonIndex.getTitle();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(title, "");
        remoteActionCompatParcelizer.write(str, title);
        this.AudioAttributesImplApi21Parcelizer.write(traverseForStyle.RemoteActionCompatParcelizer(this.onPrepareFromUri), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        this.handleMediaPlayPauseIfPendingOnHandler = getVariantWithSubtitleGroup.IconCompatParcelizer;
        AudioAttributesImplApi26Parcelizer("currentState changed to interrupted");
        addOnConfigurationChangedListener();
    }

    private static /* synthetic */ Object AudioAttributesCompatParcelizer(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        int i = 2 % 2;
        parseAlignment.write writeVar = (parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer;
        LessonIndex lessonIndex = fromstyleline.onSeekTo;
        Object obj = null;
        if (lessonIndex == null) {
            int i2 = addObserverForBackInvokerlambda7 + 31;
            accessonBackPresseds1027565324 = i2 % 128;
            int i3 = i2 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            if (i3 != 0) {
                obj.hashCode();
                throw null;
            }
            lessonIndex = null;
        }
        writeVar.AudioAttributesCompatParcelizer(lessonIndex);
        int i4 = accessonBackPresseds1027565324 + 99;
        addObserverForBackInvokerlambda7 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 73 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object MediaMetadataCompat(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        String str = (String) objArr[3];
        int i = 2 % 2;
        Object obj = null;
        if (zBooleanValue) {
            fromstyleline.AudioAttributesImplApi21Parcelizer.write(traverseForStyle.read(fromstyleline.onPrepareFromUri), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        } else {
            buildFormat.Companion writeVar = buildFormat.INSTANCE;
            String lowerCase = buildFormat.Companion.IconCompatParcelizer(iIntValue).toString().toLowerCase(Locale.ROOT);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
            isSeekPending isseekpending = fromstyleline.AudioAttributesImplApi21Parcelizer;
            String str2 = fromstyleline.onPrepareFromUri;
            LessonIndex lessonIndex = fromstyleline.onSeekTo;
            if (lessonIndex == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                lessonIndex = null;
            }
            String subjectId = lessonIndex.getSubjectId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(subjectId, "");
            isseekpending.write(traverseForStyle.AudioAttributesCompatParcelizer(str2, subjectId, lowerCase, str), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            int i2 = accessonBackPresseds1027565324 + 63;
            addObserverForBackInvokerlambda7 = i2 % 128;
            int i3 = i2 % 2;
        }
        fromstyleline.handleMediaPlayPauseIfPendingOnHandler = getVariantWithSubtitleGroup.RemoteActionCompatParcelizer;
        AudioAttributesImplApi26Parcelizer("currentState changed to resumed");
        fromstyleline.addOnConfigurationChangedListener();
        parseAlignment.RemoteActionCompatParcelizer remoteActionCompatParcelizer = fromstyleline.onCustomAction;
        if (remoteActionCompatParcelizer == null) {
            int i4 = accessonBackPresseds1027565324 + 55;
            addObserverForBackInvokerlambda7 = i4 % 128;
            int i5 = i4 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            remoteActionCompatParcelizer = null;
        }
        String str3 = fromstyleline.onPrepareFromUri;
        LessonIndex lessonIndex2 = fromstyleline.onSeekTo;
        if (lessonIndex2 == null) {
            int i6 = addObserverForBackInvokerlambda7 + 39;
            accessonBackPresseds1027565324 = i6 % 128;
            if (i6 % 2 != 0) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                obj.hashCode();
                throw null;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            lessonIndex2 = null;
        }
        String title = lessonIndex2.getTitle();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(title, "");
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(str3, title);
        return null;
    }

    public final void onPlayFromUri() {
        int i = 2 % 2;
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).aj_();
        Object[] objArr = {this, this.onPrepareFromUri};
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        IconCompatParcelizer((accessgetEmptyStatecp) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 564256362, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -564256345), new getAnswerMap() { // from class: o.parseColor
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return fromStyleLine.RemoteActionCompatParcelizer(this.IconCompatParcelizer);
            }
        }, new getAnswerMap() { // from class: o.parsePosition
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return fromStyleLine.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, (Throwable) obj);
            }
        });
        int i2 = addObserverForBackInvokerlambda7 + 31;
        accessonBackPresseds1027565324 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final getShowPopup onFastForward(fromStyleLine fromstyleline) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 113;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 1558954021, new Object[]{fromstyleline}, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -1558953985);
        parseAlignment.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = fromstyleline.onFastForward;
        if (audioAttributesCompatParcelizer == null) {
            int i4 = accessonBackPresseds1027565324 + 101;
            addObserverForBackInvokerlambda7 = i4 % 128;
            Object obj = null;
            if (i4 % 2 == 0) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                obj.hashCode();
                throw null;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            audioAttributesCompatParcelizer = null;
        }
        audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(fromstyleline.onPrepareFromUri);
        fromstyleline.AudioAttributesImplApi21Parcelizer.write(traverseForStyle.write(fromstyleline.onPrepareFromUri), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        fromstyleline.handleMediaPlayPauseIfPendingOnHandler = getVariantWithSubtitleGroup.AudioAttributesCompatParcelizer;
        fromstyleline.addOnConfigurationChangedListener();
        return getShowPopup.INSTANCE;
    }

    private static final getShowPopup MediaBrowserCompatItemReceiver(fromStyleLine fromstyleline, Throwable th) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 115;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(th, "");
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer();
        fromstyleline.RemoteActionCompatParcelizer(th, "video_delete_failed");
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = accessonBackPresseds1027565324 + 57;
        addObserverForBackInvokerlambda7 = i4 % 128;
        if (i4 % 2 != 0) {
            return getshowpopup;
        }
        throw null;
    }

    private static /* synthetic */ Object onRemoveQueueItemAt(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 25;
        addObserverForBackInvokerlambda7 = i2 % 128;
        if (i2 % 2 == 0) {
            isSeekPending isseekpending = fromstyleline.AudioAttributesImplApi21Parcelizer;
            getNotesSlot getnotesslot = getNotesSlot.INSTANCE;
            isseekpending.write(getNotesSlot.IconCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            parseAlignment.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = fromstyleline.onFastForward;
            throw null;
        }
        isSeekPending isseekpending2 = fromstyleline.AudioAttributesImplApi21Parcelizer;
        getNotesSlot getnotesslot2 = getNotesSlot.INSTANCE;
        isseekpending2.write(getNotesSlot.IconCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        parseAlignment.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer2 = fromstyleline.onFastForward;
        if (audioAttributesCompatParcelizer2 == null) {
            int i3 = accessonBackPresseds1027565324 + 49;
            addObserverForBackInvokerlambda7 = i3 % 128;
            int i4 = i3 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            audioAttributesCompatParcelizer2 = null;
        }
        audioAttributesCompatParcelizer2.AudioAttributesImplApi21Parcelizer(fromstyleline.onPrepareFromUri);
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(false);
        return null;
    }

    public final void MediaSessionCompatQueueItem() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 29;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        isSeekPending isseekpending = this.AudioAttributesImplApi21Parcelizer;
        getNotesSlot getnotesslot = getNotesSlot.INSTANCE;
        isseekpending.write(getNotesSlot.IconCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        parseAlignment.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onFastForward;
        if (audioAttributesCompatParcelizer == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            int i4 = accessonBackPresseds1027565324 + 67;
            addObserverForBackInvokerlambda7 = i4 % 128;
            int i5 = i4 % 2;
            audioAttributesCompatParcelizer = null;
        }
        audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer(this.onPrepareFromUri);
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(true);
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void read(boolean r5) {
        /*
            r4 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7
            int r2 = r1 + 111
            int r3 = r2 % 128
            kotlin.fromStyleLine.accessonBackPresseds1027565324 = r3
            int r2 = r2 % r0
            r4.onPrepare = r5
            if (r5 == 0) goto L11
            goto L23
        L11:
            int r1 = r1 + 61
            int r2 = r1 % 128
            kotlin.fromStyleLine.accessonBackPresseds1027565324 = r2
            int r1 = r1 % r0
            V extends o.handleMiscCode r1 = r4.RemoteActionCompatParcelizer
            o.parseAlignment$write r1 = (o.parseAlignment.write) r1
            boolean r1 = r1._init_lambda2()
            r2 = 1
            if (r1 == r2) goto L42
        L23:
            V extends o.handleMiscCode r1 = r4.RemoteActionCompatParcelizer
            o.parseAlignment$write r1 = (o.parseAlignment.write) r1
            r1.RemoteActionCompatParcelizer()
            V extends o.handleMiscCode r1 = r4.RemoteActionCompatParcelizer
            o.parseAlignment$write r1 = (o.parseAlignment.write) r1
            r1.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw()
            V extends o.handleMiscCode r1 = r4.RemoteActionCompatParcelizer
            o.parseAlignment$write r1 = (o.parseAlignment.write) r1
            r1.getSavedStateRegistryControllerannotations()
            int r1 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7
            int r1 = r1 + 71
            int r2 = r1 % 128
            kotlin.fromStyleLine.accessonBackPresseds1027565324 = r2
            int r1 = r1 % r0
            goto L52
        L42:
            int r1 = kotlin.fromStyleLine.accessonBackPresseds1027565324
            int r1 = r1 + 113
            int r2 = r1 % 128
            kotlin.fromStyleLine.addObserverForBackInvokerlambda7 = r2
            int r1 = r1 % r0
            V extends o.handleMiscCode r1 = r4.RemoteActionCompatParcelizer
            o.parseAlignment$write r1 = (o.parseAlignment.write) r1
            r1.onPictureInPictureModeChanged()
        L52:
            o.RtspMediaTrack r4 = r4._init_lambda4
            if (r4 == 0) goto L62
            r4.IconCompatParcelizer(r5)
            int r4 = kotlin.fromStyleLine.accessonBackPresseds1027565324
            int r4 = r4 + 123
            int r5 = r4 % 128
            kotlin.fromStyleLine.addObserverForBackInvokerlambda7 = r5
            int r4 = r4 % r0
        L62:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.fromStyleLine.read(boolean):void");
    }

    private static /* synthetic */ Object RatingCompat(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        RtspMediaTrack rtspMediaTrack = (RtspMediaTrack) objArr[1];
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 77;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        fromstyleline._init_lambda4 = rtspMediaTrack;
        if (i3 == 0) {
            return null;
        }
        int i4 = 22 / 0;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0020 A[PHI: r2
      0x0020: PHI (r2v5 o.RtspMediaTrack) = (r2v4 o.RtspMediaTrack), (r2v8 o.RtspMediaTrack) binds: [B:8:0x001e, B:5:0x0019] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(java.lang.Object[] r6) {
        /*
            r0 = 0
            r6 = r6[r0]
            o.fromStyleLine r6 = (kotlin.fromStyleLine) r6
            r1 = 2
            int r2 = r1 % r1
            int r2 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7
            int r2 = r2 + 109
            int r3 = r2 % 128
            kotlin.fromStyleLine.accessonBackPresseds1027565324 = r3
            int r2 = r2 % r1
            r3 = 0
            if (r2 == 0) goto L1c
            o.RtspMediaTrack r2 = r6._init_lambda4
            r4 = 56
            int r4 = r4 / r0
            if (r2 == 0) goto L83
            goto L20
        L1c:
            o.RtspMediaTrack r2 = r6._init_lambda4
            if (r2 == 0) goto L83
        L20:
            boolean r4 = r2.read()
            r5 = 1
            r4 = r4 ^ r5
            if (r4 == r5) goto L83
            V extends o.handleMiscCode r4 = r6.RemoteActionCompatParcelizer
            o.parseAlignment$write r4 = (o.parseAlignment.write) r4
            boolean r4 = r4.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0()
            if (r4 == 0) goto L80
            int r4 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7
            int r4 = r4 + 87
            int r5 = r4 % 128
            kotlin.fromStyleLine.accessonBackPresseds1027565324 = r5
            int r4 = r4 % r1
            if (r4 == 0) goto L55
            V extends o.handleMiscCode r1 = r6.RemoteActionCompatParcelizer
            o.parseAlignment$write r1 = (o.parseAlignment.write) r1
            r1.onPlayFromMediaId()
            V extends o.handleMiscCode r1 = r6.RemoteActionCompatParcelizer
            o.parseAlignment$write r1 = (o.parseAlignment.write) r1
            r1.onFastForward()
            boolean r1 = r2.IconCompatParcelizer()
            r2 = 34
            int r2 = r2 / r0
            if (r1 == 0) goto L71
            goto L69
        L55:
            V extends o.handleMiscCode r0 = r6.RemoteActionCompatParcelizer
            o.parseAlignment$write r0 = (o.parseAlignment.write) r0
            r0.onPlayFromMediaId()
            V extends o.handleMiscCode r0 = r6.RemoteActionCompatParcelizer
            o.parseAlignment$write r0 = (o.parseAlignment.write) r0
            r0.onFastForward()
            boolean r0 = r2.IconCompatParcelizer()
            if (r0 == 0) goto L71
        L69:
            V extends o.handleMiscCode r0 = r6.RemoteActionCompatParcelizer
            o.parseAlignment$write r0 = (o.parseAlignment.write) r0
            r0.onRequestPermissionsResult()
            goto L78
        L71:
            V extends o.handleMiscCode r0 = r6.RemoteActionCompatParcelizer
            o.parseAlignment$write r0 = (o.parseAlignment.write) r0
            r0.onPreparePanel()
        L78:
            V extends o.handleMiscCode r6 = r6.RemoteActionCompatParcelizer
            o.parseAlignment$write r6 = (o.parseAlignment.write) r6
            r6.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw()
            return r3
        L80:
            r2.write()
        L83:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.fromStyleLine.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(java.lang.Object[]):java.lang.Object");
    }

    @Override // kotlin.isRtspStartLine, kotlin.getExtendedEsFrChar
    public final void MediaBrowserCompatCustomActionResultReceiver() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 117;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        super.MediaBrowserCompatCustomActionResultReceiver();
        MediaDescriptionCompat();
        _init_lambda4();
        int i4 = addObserverForBackInvokerlambda7 + 25;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void AudioAttributesCompatParcelizer(DownloadableResolution downloadableResolution, List<String> list) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 93;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(downloadableResolution, "");
        toMagicModuleMetaRepoModel.write(list, "");
        VideoInfo videoInfoAccessensureViewModelStore = accessensureViewModelStore();
        if (videoInfoAccessensureViewModelStore != null) {
            this.setSessionImpl.write(downloadableResolution.getResolutionHeight());
            write(videoInfoAccessensureViewModelStore, downloadableResolution.getResolutionHeight(), downloadableResolution.getDownloadSessionId(), false, null, list);
        }
        int i4 = addObserverForBackInvokerlambda7 + 43;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
    }

    private void AudioAttributesCompatParcelizer(int i, Timeline timeline) {
        int i2 = 2 % 2;
        int i3 = accessonBackPresseds1027565324 + 23;
        addObserverForBackInvokerlambda7 = i3 % 128;
        if (i3 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(timeline, "");
            ((parseAlignment.write) this.RemoteActionCompatParcelizer)._init_lambda5();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(timeline, "");
        if (((parseAlignment.write) this.RemoteActionCompatParcelizer)._init_lambda5()) {
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(timeline.getStartTime());
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).AudioAttributesImplApi26Parcelizer(i);
            int i4 = accessonBackPresseds1027565324 + 77;
            addObserverForBackInvokerlambda7 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    private void AudioAttributesImplApi26Parcelizer(int i) {
        int i2 = 2 % 2;
        int i3 = accessonBackPresseds1027565324;
        int i4 = i3 + 45;
        addObserverForBackInvokerlambda7 = i4 % 128;
        int i5 = i4 % 2;
        this.ParcelableVolumeInfo = i;
        this.onPrepareFromMediaId = true;
        int i6 = i3 + 87;
        addObserverForBackInvokerlambda7 = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onPrepareFromMediaId(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 101;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        if (!fromstyleline.onPrepareFromMediaId) {
            return null;
        }
        fromstyleline.onPrepareFromMediaId = false;
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(fromstyleline.ParcelableVolumeInfo);
        int i4 = accessonBackPresseds1027565324 + 13;
        addObserverForBackInvokerlambda7 = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        int i5 = 4 % 3;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x001c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void getOnBackPressedDispatcherannotations() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7
            int r1 = r1 + 3
            int r2 = r1 % 128
            kotlin.fromStyleLine.accessonBackPresseds1027565324 = r2
            int r1 = r1 % r0
            r2 = 0
            r3 = 0
            if (r1 == 0) goto L18
            o.skipComment$RemoteActionCompatParcelizer r1 = r5.onStop
            r4 = 89
            int r4 = r4 / r2
            if (r1 != 0) goto L22
            goto L1c
        L18:
            o.skipComment$RemoteActionCompatParcelizer r1 = r5.onStop
            if (r1 != 0) goto L22
        L1c:
            java.lang.String r1 = ""
            kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r1)
            r1 = r3
        L22:
            java.util.List<? extends com.marrow.data.models.lesson.tab.LessonTabItem<?>> r4 = r5.onSkipToQueueItem
            java.util.Collection r4 = (java.util.Collection) r4
            com.marrow.data.models.lesson.tab.LessonTabItem[] r2 = new com.marrow.data.models.lesson.tab.LessonTabItem[r2]
            java.lang.Object[] r2 = r4.toArray(r2)
            r1.AudioAttributesCompatParcelizer(r2)
            java.util.List<? extends com.marrow.data.models.lesson.tab.LessonTabItem<?>> r1 = r5.onSkipToQueueItem
            java.util.Collection r1 = (java.util.Collection) r1
            boolean r1 = r1.isEmpty()
            r2 = 1
            r1 = r1 ^ r2
            if (r1 == r2) goto L4c
            V extends o.handleMiscCode r5 = r5.RemoteActionCompatParcelizer
            o.parseAlignment$write r5 = (o.parseAlignment.write) r5
            r5.PlaybackStateCompatCustomAction()
            int r5 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7
            int r5 = r5 + 91
            int r1 = r5 % 128
            kotlin.fromStyleLine.accessonBackPresseds1027565324 = r1
            int r5 = r5 % r0
            return
        L4c:
            int r1 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7
            int r1 = r1 + 83
            int r2 = r1 % 128
            kotlin.fromStyleLine.accessonBackPresseds1027565324 = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L6b
            V extends o.handleMiscCode r5 = r5.RemoteActionCompatParcelizer
            o.parseAlignment$write r5 = (o.parseAlignment.write) r5
            r5.onTrimMemory()
            int r5 = kotlin.fromStyleLine.accessonBackPresseds1027565324
            int r5 = r5 + 101
            int r1 = r5 % 128
            kotlin.fromStyleLine.addObserverForBackInvokerlambda7 = r1
            int r5 = r5 % r0
            if (r5 == 0) goto L6a
            return
        L6a:
            throw r3
        L6b:
            V extends o.handleMiscCode r5 = r5.RemoteActionCompatParcelizer
            o.parseAlignment$write r5 = (o.parseAlignment.write) r5
            r5.onTrimMemory()
            r3.hashCode()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.fromStyleLine.getOnBackPressedDispatcherannotations():void");
    }

    private static /* synthetic */ Object AudioAttributesImplApi21Parcelizer(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 69;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -1120834353, new Object[]{fromstyleline, null}, iWrite3, iWrite2, 1120834388);
        int i4 = accessonBackPresseds1027565324 + 43;
        addObserverForBackInvokerlambda7 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private static /* synthetic */ Object onPrepareFromUri(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        if (!fromstyleline.setSessionImpl.MediaBrowserCompatCustomActionResultReceiver("notes_legal_agreed")) {
            int i2 = addObserverForBackInvokerlambda7 + 33;
            accessonBackPresseds1027565324 = i2 % 128;
            if (i2 % 2 != 0) {
                ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).onConfigurationChanged();
                int i3 = 15 / 0;
            } else {
                ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).onConfigurationChanged();
            }
        }
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).onPanelClosed();
        parseAlignment.write writeVar = (parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer;
        String str2 = fromstyleline.onPrepareFromUri;
        int i4 = fromstyleline.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        LessonIndex lessonIndex = fromstyleline.onSeekTo;
        if (lessonIndex == null) {
            int i5 = accessonBackPresseds1027565324 + 5;
            addObserverForBackInvokerlambda7 = i5 % 128;
            int i6 = i5 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            int i7 = addObserverForBackInvokerlambda7 + 7;
            accessonBackPresseds1027565324 = i7 % 128;
            int i8 = i7 % 2;
            lessonIndex = null;
        }
        String rootSubjectId = lessonIndex.getRootSubjectId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rootSubjectId, "");
        writeVar.IconCompatParcelizer(str2, 0, rootSubjectId, str);
        return null;
    }

    private static final Boolean RemoteActionCompatParcelizer(fromStyleLine fromstyleline, String str) {
        int i = 2 % 2;
        fromstyleline.AudioAttributesImplApi21Parcelizer(str);
        parseAlignment.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = fromstyleline.onFastForward;
        if (audioAttributesCompatParcelizer == null) {
            int i2 = addObserverForBackInvokerlambda7 + 17;
            accessonBackPresseds1027565324 = i2 % 128;
            int i3 = i2 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            int i4 = accessonBackPresseds1027565324 + 95;
            addObserverForBackInvokerlambda7 = i4 % 128;
            int i5 = i4 % 2;
            audioAttributesCompatParcelizer = null;
        }
        audioAttributesCompatParcelizer.AudioAttributesImplApi21Parcelizer(str);
        return Boolean.TRUE;
    }

    private final void AudioAttributesImplApi21Parcelizer(String str) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 1;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        releaseDisabledStreams releasedisabledstreams = this.ResultReceiver;
        VideoInfo videoInfoAccessensureViewModelStore = accessensureViewModelStore();
        parseAlignment.RemoteActionCompatParcelizer remoteActionCompatParcelizer = null;
        releasedisabledstreams.read(videoInfoAccessensureViewModelStore != null ? videoInfoAccessensureViewModelStore.getMediaId() : null);
        this.ResultReceiver.read(str);
        this.onSetCaptioningEnabled.RemoteActionCompatParcelizer(str);
        getDataSpec getdataspec = this.onSetCaptioningEnabled;
        VideoInfo videoInfoAccessensureViewModelStore2 = accessensureViewModelStore();
        toMagicModuleMetaRepoModel.write(videoInfoAccessensureViewModelStore2);
        String mediaId = videoInfoAccessensureViewModelStore2.getMediaId();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(mediaId, "");
        getdataspec.IconCompatParcelizer(mediaId);
        this.MediaBrowserCompatMediaItem.AudioAttributesCompatParcelizer(al_());
        parseAlignment.RemoteActionCompatParcelizer remoteActionCompatParcelizer2 = this.onCustomAction;
        if (remoteActionCompatParcelizer2 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            int i4 = accessonBackPresseds1027565324 + 117;
            addObserverForBackInvokerlambda7 = i4 % 128;
            int i5 = i4 % 2;
        } else {
            remoteActionCompatParcelizer = remoteActionCompatParcelizer2;
        }
        remoteActionCompatParcelizer.RemoteActionCompatParcelizer(str, accessensureViewModelStore());
    }

    static final class write extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int IconCompatParcelizer;

        /* JADX INFO: renamed from: o.fromStyleLine$write$4, reason: invalid class name */
        static final class AnonymousClass4 extends getMagicModuleStats implements MagicModuleSubmissionRequestBody<TopUserCompanion, SampleVideos<? super getShowPopup>, Object> {
            private int IconCompatParcelizer;
            private /* synthetic */ fromStyleLine read;

            @Override // kotlin.getMonthName
            public final Object invokeSuspend(Object obj) throws Throwable {
                Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
                int i = this.IconCompatParcelizer;
                if (i == 0) {
                    SdkPayloadData.IconCompatParcelizer(obj);
                    Object objMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver$13f1e0a5 = fromStyleLine.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver$13f1e0a5(this.read);
                    AnonymousClass4 anonymousClass4 = this;
                    this.IconCompatParcelizer = 1;
                    try {
                        Object[] objArr = {2, anonymousClass4};
                        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(246872773);
                        if (objRemoteActionCompatParcelizer == null) {
                            objRemoteActionCompatParcelizer = startForeground.read((char) ((AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) - 1), 24193 - (ViewConfiguration.getScrollBarSize() >> 8), TextUtils.lastIndexOf("", '0', 0) + 12, 1895775824, false, "write", new Class[]{Integer.TYPE, SampleVideos.class});
                        }
                        if (((Method) objRemoteActionCompatParcelizer).invoke(objMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver$13f1e0a5, objArr) == objIconCompatParcelizer) {
                            return objIconCompatParcelizer;
                        }
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
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
            AnonymousClass4(fromStyleLine fromstyleline, SampleVideos<? super AnonymousClass4> sampleVideos) {
                super(2, sampleVideos);
                this.read = fromstyleline;
            }

            @Override // kotlin.getMonthName
            public final SampleVideos<getShowPopup> create(Object obj, SampleVideos<?> sampleVideos) {
                return new AnonymousClass4(this.read, sampleVideos);
            }

            /* JADX INFO: Access modifiers changed from: private */
            @Override // kotlin.MagicModuleSubmissionRequestBody
            /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
            public Object invoke(TopUserCompanion topUserCompanion, SampleVideos<? super getShowPopup> sampleVideos) {
                return ((AnonymousClass4) create(topUserCompanion, sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
            }
        }

        @Override // kotlin.getMonthName
        public final Object invokeSuspend(Object obj) {
            Object objIconCompatParcelizer = getYear.IconCompatParcelizer();
            int i = this.IconCompatParcelizer;
            if (i == 0) {
                SdkPayloadData.IconCompatParcelizer(obj);
                this.IconCompatParcelizer = 1;
                if (setModifiedEndTimestampMs.RemoteActionCompatParcelizer(fromStyleLine.AudioAttributesImplApi26Parcelizer(fromStyleLine.this), new AnonymousClass4(fromStyleLine.this, null), this) == objIconCompatParcelizer) {
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

        write(SampleVideos<? super write> sampleVideos) {
            super(1, sampleVideos);
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return fromStyleLine.this.new write(sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((write) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    private final void getSavedStateRegistryControllerannotations() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 101;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).write(read(R.string.video_for_paid_user));
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).MediaSessionCompatQueueItem();
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).accessgetReportFullyDrawnExecutorp();
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).ParcelableVolumeInfo();
        int i4 = addObserverForBackInvokerlambda7 + 23;
        accessonBackPresseds1027565324 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    public final void IconCompatParcelizer(int i) {
        int i2 = 2 % 2;
        int i3 = addObserverForBackInvokerlambda7;
        int i4 = i3 + 119;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
        if (i != -1) {
            int i6 = i3 + 31;
            accessonBackPresseds1027565324 = i6 % 128;
            int i7 = i6 % 2;
            AudioAttributesImplApi26Parcelizer(i);
        }
        int i8 = accessonBackPresseds1027565324 + 99;
        addObserverForBackInvokerlambda7 = i8 % 128;
        int i9 = i8 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0031 A[PHI: r1 r2
      0x0031: PHI (r1v6 o.parseAlignment$write) = (r1v5 o.parseAlignment$write), (r1v9 o.parseAlignment$write) binds: [B:8:0x002f, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]
      0x0031: PHI (r2v3 java.lang.String) = (r2v2 java.lang.String), (r2v5 java.lang.String) binds: [B:8:0x002f, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void addOnNewIntentListener() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7
            int r1 = r1 + 11
            int r2 = r1 % 128
            kotlin.fromStyleLine.accessonBackPresseds1027565324 = r2
            int r1 = r1 % r0
            java.lang.String r2 = "popup_shown"
            java.lang.String r3 = ""
            if (r1 == 0) goto L24
            r5.write(r2)
            V extends o.handleMiscCode r1 = r5.RemoteActionCompatParcelizer
            o.parseAlignment$write r1 = (o.parseAlignment.write) r1
            java.lang.String r2 = r5.onPrepareFromUri
            com.marrow.data.models.lesson.LessonIndex r5 = r5.onSeekTo
            r4 = 64
            int r4 = r4 / 0
            if (r5 != 0) goto L44
            goto L31
        L24:
            r5.write(r2)
            V extends o.handleMiscCode r1 = r5.RemoteActionCompatParcelizer
            o.parseAlignment$write r1 = (o.parseAlignment.write) r1
            java.lang.String r2 = r5.onPrepareFromUri
            com.marrow.data.models.lesson.LessonIndex r5 = r5.onSeekTo
            if (r5 != 0) goto L44
        L31:
            int r5 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7
            int r5 = r5 + 105
            int r4 = r5 % 128
            kotlin.fromStyleLine.accessonBackPresseds1027565324 = r4
            int r5 = r5 % r0
            kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r3)
            if (r5 == 0) goto L43
            r5 = 49
            int r5 = r5 / 0
        L43:
            r5 = 0
        L44:
            java.lang.String r5 = r5.getTitle()
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r5, r3)
            r1.IconCompatParcelizer(r2, r5)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.fromStyleLine.addOnNewIntentListener():void");
    }

    private static /* synthetic */ Object onCommand(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 53;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).onMenuItemSelected();
        int i4 = accessonBackPresseds1027565324 + 107;
        addObserverForBackInvokerlambda7 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    public final void onRemoveQueueItemAt() {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 65;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).addOnPictureInPictureModeChangedListener();
        int i4 = accessonBackPresseds1027565324 + 115;
        addObserverForBackInvokerlambda7 = i4 % 128;
        int i5 = i4 % 2;
    }

    public final void onSkipToNext() {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324;
        int i3 = i2 + 3;
        addObserverForBackInvokerlambda7 = i3 % 128;
        int i4 = i3 % 2;
        RtspMediaTrack rtspMediaTrack = this._init_lambda4;
        if (rtspMediaTrack != null) {
            int i5 = i2 + 115;
            addObserverForBackInvokerlambda7 = i5 % 128;
            int i6 = i5 % 2;
            rtspMediaTrack.az_();
        }
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).onRequestPermissionsResult();
        int i7 = accessonBackPresseds1027565324 + 69;
        addObserverForBackInvokerlambda7 = i7 % 128;
        int i8 = i7 % 2;
    }

    public final void onSkipToQueueItem() {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324;
        int i3 = i2 + 99;
        addObserverForBackInvokerlambda7 = i3 % 128;
        int i4 = i3 % 2;
        RtspMediaTrack rtspMediaTrack = this._init_lambda4;
        if (rtspMediaTrack != null) {
            int i5 = i2 + 97;
            addObserverForBackInvokerlambda7 = i5 % 128;
            if (i5 % 2 != 0) {
                rtspMediaTrack.MediaBrowserCompatItemReceiver();
            } else {
                rtspMediaTrack.MediaBrowserCompatItemReceiver();
                throw null;
            }
        }
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).onPreparePanel();
    }

    public final void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 13;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        this.setSessionImpl.IconCompatParcelizer("notes_legal_agreed", true);
    }

    private static /* synthetic */ Object MediaBrowserCompatSearchResultReceiver(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        RtspMediaTrack rtspMediaTrack = fromstyleline._init_lambda4;
        Object obj = null;
        if (rtspMediaTrack != null) {
            int i2 = accessonBackPresseds1027565324 + 43;
            addObserverForBackInvokerlambda7 = i2 % 128;
            if (i2 % 2 == 0) {
                rtspMediaTrack.IconCompatParcelizer();
                obj.hashCode();
                throw null;
            }
            if (!(!rtspMediaTrack.IconCompatParcelizer())) {
                rtspMediaTrack.IconCompatParcelizer(zBooleanValue);
                int i3 = accessonBackPresseds1027565324 + 95;
                addObserverForBackInvokerlambda7 = i3 % 128;
                int i4 = i3 % 2;
            }
        }
        return null;
    }

    private accessgetEmptyStatecp<List<LessonTabItem<?>>> addOnContextAvailableListener() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 83;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        accessgetEmptyStatecp<List<LessonTabItem<?>>> accessgetemptystatecpIconCompatParcelizer = this.onRewind.IconCompatParcelizer(this.onPrepareFromUri);
        int i4 = accessonBackPresseds1027565324 + 125;
        addObserverForBackInvokerlambda7 = i4 % 128;
        int i5 = i4 % 2;
        return accessgetemptystatecpIconCompatParcelizer;
    }

    public final void handleMediaPlayPauseIfPendingOnHandler() {
        int i = 2 % 2;
        IconCompatParcelizer(addOnContextAvailableListener(), new getAnswerMap() { // from class: o.createIfNull
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return fromStyleLine.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, (List) obj);
            }
        }, new getAnswerMap() { // from class: o.isSupportedTag
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return fromStyleLine.IconCompatParcelizer(this.IconCompatParcelizer, (Throwable) obj);
            }
        });
        int i2 = accessonBackPresseds1027565324 + 91;
        addObserverForBackInvokerlambda7 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 25 / 0;
        }
    }

    private static final getShowPopup RemoteActionCompatParcelizer(fromStyleLine fromstyleline, List list) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 31;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(list, "");
        fromstyleline.onSkipToQueueItem = list;
        skipComment.RemoteActionCompatParcelizer remoteActionCompatParcelizer = fromstyleline.onStop;
        if (remoteActionCompatParcelizer == null) {
            int i4 = addObserverForBackInvokerlambda7 + 3;
            accessonBackPresseds1027565324 = i4 % 128;
            int i5 = i4 % 2;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            remoteActionCompatParcelizer = null;
        }
        remoteActionCompatParcelizer.AudioAttributesCompatParcelizer(list.toArray(new LessonTabItem[0]));
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).onTrimMemory();
        if (!fromstyleline.onSkipToQueueItem.isEmpty()) {
            ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).removeOnConfigurationChangedListener();
        }
        fromstyleline.getOnBackPressedDispatcherannotations();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i6 = accessonBackPresseds1027565324 + 77;
        addObserverForBackInvokerlambda7 = i6 % 128;
        if (i6 % 2 == 0) {
            int i7 = 86 / 0;
        }
        return getshowpopup;
    }

    private static final getShowPopup AudioAttributesImplBaseParcelizer(fromStyleLine fromstyleline, Throwable th) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 93;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).PlaybackStateCompatCustomAction();
        fromstyleline.write(th, "video_related_mcq");
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = accessonBackPresseds1027565324 + 63;
        addObserverForBackInvokerlambda7 = i4 % 128;
        if (i4 % 2 != 0) {
            return getshowpopup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003f, code lost:
    
        if (r5.isComingSoon() != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        r8 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7 + 41;
        kotlin.fromStyleLine.accessonBackPresseds1027565324 = r8 % 128;
        r8 = r8 % 2;
        ((o.parseAlignment.write) r1.RemoteActionCompatParcelizer).AudioAttributesCompatParcelizer(r1.read(com.marrow.R.string.text_lesson_coming_soon));
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0059, code lost:
    
        r8 = (o.parseAlignment.write) r1.RemoteActionCompatParcelizer;
        r0 = r5.getId();
        kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r0, "");
        r1 = r5.getTitle();
        kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r1, "");
        r8.read(r0, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0038, code lost:
    
        if ((!r5.isComingSoon()) != true) goto L13;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object onSetShuffleMode(java.lang.Object[] r8) {
        /*
            r0 = 0
            r1 = r8[r0]
            o.fromStyleLine r1 = (kotlin.fromStyleLine) r1
            r2 = 1
            r8 = r8[r2]
            com.marrow.data.models.lesson.tab.LessonTabItem r8 = (com.marrow.data.models.lesson.tab.LessonTabItem) r8
            r3 = 2
            int r4 = r3 % r3
            java.lang.String r4 = ""
            kotlin.toMagicModuleMetaRepoModel.write(r8, r4)
            T r5 = r8.item
            kotlin.toMagicModuleMetaRepoModel.read(r5, r4)
            com.marrow.data.models.lesson.LessonIndex r5 = (com.marrow.data.models.lesson.LessonIndex) r5
            int r8 = r8.type
            r6 = 4
            r7 = 0
            if (r8 != r6) goto L6e
            boolean r8 = r5.hasVideo()
            if (r8 != 0) goto L6e
            int r8 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7
            int r8 = r8 + 113
            int r6 = r8 % 128
            kotlin.fromStyleLine.accessonBackPresseds1027565324 = r6
            int r8 = r8 % r3
            if (r8 == 0) goto L3b
            boolean r8 = r5.isComingSoon()
            r6 = 88
            int r6 = r6 / r0
            r8 = r8 ^ r2
            if (r8 == r2) goto L59
            goto L41
        L3b:
            boolean r8 = r5.isComingSoon()
            if (r8 == 0) goto L59
        L41:
            int r8 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7
            int r8 = r8 + 41
            int r0 = r8 % 128
            kotlin.fromStyleLine.accessonBackPresseds1027565324 = r0
            int r8 = r8 % r3
            V extends o.handleMiscCode r8 = r1.RemoteActionCompatParcelizer
            o.parseAlignment$write r8 = (o.parseAlignment.write) r8
            r0 = 2131953210(0x7f13063a, float:1.9542885E38)
            java.lang.String r0 = r1.read(r0)
            r8.AudioAttributesCompatParcelizer(r0)
            return r7
        L59:
            V extends o.handleMiscCode r8 = r1.RemoteActionCompatParcelizer
            o.parseAlignment$write r8 = (o.parseAlignment.write) r8
            java.lang.String r0 = r5.getId()
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r0, r4)
            java.lang.String r1 = r5.getTitle()
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r1, r4)
            r8.read(r0, r1)
        L6e:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.fromStyleLine.onSetShuffleMode(java.lang.Object[]):java.lang.Object");
    }

    public final void onPlayFromSearch() {
        int i = 2 % 2;
        if (this.onSeekTo != null) {
            int i2 = accessonBackPresseds1027565324 + 35;
            addObserverForBackInvokerlambda7 = i2 % 128;
            int i3 = i2 % 2;
            parseAlignment.write writeVar = (parseAlignment.write) this.RemoteActionCompatParcelizer;
            LessonIndex lessonIndex = this.onSeekTo;
            if (lessonIndex == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                int i4 = addObserverForBackInvokerlambda7 + 73;
                accessonBackPresseds1027565324 = i4 % 128;
                int i5 = i4 % 2;
                lessonIndex = null;
            }
            String activeRecallQbankId = lessonIndex.getActiveRecallQbankId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(activeRecallQbankId, "");
            writeVar.IconCompatParcelizer(activeRecallQbankId);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005b A[PHI: r5
      0x005b: PHI (r5v5 java.lang.String) = (r5v4 java.lang.String), (r5v8 java.lang.String) binds: [B:17:0x0059, B:14:0x0052] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object onPrepare(java.lang.Object[] r9) {
        /*
            r0 = 0
            r1 = r9[r0]
            o.fromStyleLine r1 = (kotlin.fromStyleLine) r1
            r2 = 1
            r2 = r9[r2]
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            r3 = 2
            r4 = r9[r3]
            java.lang.Number r4 = (java.lang.Number) r4
            int r4 = r4.intValue()
            r5 = 3
            r9 = r9[r5]
            com.marrow.data.models.video.Timeline r9 = (com.marrow.data.models.video.Timeline) r9
            int r6 = r3 % r3
            int r6 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7
            int r6 = r6 + 59
            int r7 = r6 % 128
            kotlin.fromStyleLine.accessonBackPresseds1027565324 = r7
            int r6 = r6 % r3
            r7 = 0
            if (r6 == 0) goto L2d
            if (r2 != r5) goto L8d
            goto L2f
        L2d:
            if (r2 != r3) goto L8d
        L2f:
            o.WebvttSubtitleExternalSyntheticLambda0$IconCompatParcelizer r2 = r1.PlaybackStateCompatCustomAction
            r2.IconCompatParcelizer(r4)
            com.marrow.data.models.content.VideoInfo r2 = r1.accessensureViewModelStore()
            if (r2 == 0) goto L8d
            java.lang.String r2 = r2.getMediaId()
            if (r2 == 0) goto L8d
            int r5 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7
            int r5 = r5 + 9
            int r6 = r5 % 128
            kotlin.fromStyleLine.accessonBackPresseds1027565324 = r6
            int r5 = r5 % r3
            if (r5 == 0) goto L55
            java.lang.String r5 = r1.onPrepareFromUri
            com.marrow.data.models.lesson.LessonIndex r6 = r1.onSeekTo
            r8 = 87
            int r8 = r8 / r0
            if (r6 != 0) goto L61
            goto L5b
        L55:
            java.lang.String r5 = r1.onPrepareFromUri
            com.marrow.data.models.lesson.LessonIndex r6 = r1.onSeekTo
            if (r6 != 0) goto L61
        L5b:
            java.lang.String r0 = ""
            kotlin.toMagicModuleMetaRepoModel.IconCompatParcelizer(r0)
            r6 = r7
        L61:
            java.lang.String r0 = r6.getRootSubjectId()
            java.lang.String r6 = "overview"
            int r8 = r9.getBookmarkType()
            o.getLatestBitrateEstimate.MediaDescriptionCompat.AudioAttributesCompatParcelizer(r5, r0, r6, r8)
            o.createEmptyAdGroups r0 = r1.AudioAttributesImplBaseParcelizer
            com.marrow.data.api.models.response.lesson.VideoBookmarkTimeline r2 = r9.toVideoBookmarkTimeline(r2)
            int r5 = r9.getBookmarkType()
            o.accessgetEmptyStatecp r0 = r0.read(r2, r5)
            o.TextEmphasis r2 = new o.TextEmphasis
            r2.<init>()
            r1.read(r0, r2)
            int r9 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7
            int r9 = r9 + 115
            int r0 = r9 % 128
            kotlin.fromStyleLine.accessonBackPresseds1027565324 = r0
            int r9 = r9 % r3
        L8d:
            int r9 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7
            int r9 = r9 + 65
            int r0 = r9 % 128
            kotlin.fromStyleLine.accessonBackPresseds1027565324 = r0
            int r9 = r9 % r3
            if (r9 != 0) goto L99
            return r7
        L99:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.fromStyleLine.onPrepare(java.lang.Object[]):java.lang.Object");
    }

    private static final getShowPopup AudioAttributesCompatParcelizer(fromStyleLine fromstyleline, int i, Timeline timeline, MarrowResponse marrowResponse) {
        int i2 = 2 % 2;
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        if (marrowResponse instanceof Failed) {
            fromstyleline.PlaybackStateCompatCustomAction.IconCompatParcelizer(i);
        } else if (marrowResponse instanceof MarrowError) {
            int i3 = addObserverForBackInvokerlambda7 + 99;
            accessonBackPresseds1027565324 = i3 % 128;
            int i4 = i3 % 2;
            fromstyleline.PlaybackStateCompatCustomAction.IconCompatParcelizer(i);
            fromstyleline.RemoteActionCompatParcelizer(((MarrowError) marrowResponse).getThrowable(), "video_detail_bookmark");
        } else {
            if (!(marrowResponse instanceof Success)) {
                throw new RenewEligibleCreator();
            }
            int i5 = addObserverForBackInvokerlambda7 + 95;
            accessonBackPresseds1027565324 = i5 % 128;
            if (i5 % 2 != 0) {
                ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).read(timeline.getTimelineId(), timeline.getBookmarkType());
                int i6 = 3 / 0;
            } else {
                ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).read(timeline.getTimelineId(), timeline.getBookmarkType());
            }
        }
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i7 = accessonBackPresseds1027565324 + 41;
        addObserverForBackInvokerlambda7 = i7 % 128;
        if (i7 % 2 == 0) {
            int i8 = 31 / 0;
        }
        return getshowpopup;
    }

    public final void r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 45;
        int i3 = i2 % 128;
        accessonBackPresseds1027565324 = i3;
        int i4 = i2 % 2;
        RtspMediaTrack rtspMediaTrack = this._init_lambda4;
        if (rtspMediaTrack != null) {
            int i5 = i3 + 125;
            addObserverForBackInvokerlambda7 = i5 % 128;
            int i6 = i5 % 2;
            rtspMediaTrack.MediaBrowserCompatItemReceiver();
            if (i6 == 0) {
                throw null;
            }
        }
    }

    private static /* synthetic */ Object MediaDescriptionCompat(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 13;
        addObserverForBackInvokerlambda7 = i2 % 128;
        if (i2 % 2 == 0) {
            throw null;
        }
        if (zBooleanValue) {
            ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).onPlay();
            return null;
        }
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).onPlayFromSearch();
        int i3 = accessonBackPresseds1027565324 + 51;
        addObserverForBackInvokerlambda7 = i3 % 128;
        if (i3 % 2 != 0) {
            return null;
        }
        throw null;
    }

    static final class MediaMetadataCompat extends getMagicModuleStats implements getAnswerMap<SampleVideos<? super getShowPopup>, Object> {
        private int AudioAttributesCompatParcelizer;
        private /* synthetic */ boolean IconCompatParcelizer;
        private /* synthetic */ boolean RemoteActionCompatParcelizer;
        private boolean read;
        private Object write;

        /* JADX WARN: Removed duplicated region for block: B:31:0x00ac  */
        /* JADX WARN: Removed duplicated region for block: B:35:0x00c8  */
        /* JADX WARN: Removed duplicated region for block: B:38:0x00d2  */
        /* JADX WARN: Removed duplicated region for block: B:44:0x0132  */
        /* JADX WARN: Removed duplicated region for block: B:54:0x0173  */
        /* JADX WARN: Removed duplicated region for block: B:55:0x017d  */
        @Override // kotlin.getMonthName
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r10) {
            /*
                Method dump skipped, instruction units count: 394
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: o.fromStyleLine.MediaMetadataCompat.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        MediaMetadataCompat(boolean z, boolean z2, SampleVideos<? super MediaMetadataCompat> sampleVideos) {
            super(1, sampleVideos);
            this.RemoteActionCompatParcelizer = z;
            this.IconCompatParcelizer = z2;
        }

        @Override // kotlin.getMonthName
        public final SampleVideos<getShowPopup> create(SampleVideos<?> sampleVideos) {
            return fromStyleLine.this.new MediaMetadataCompat(this.RemoteActionCompatParcelizer, this.IconCompatParcelizer, sampleVideos);
        }

        /* JADX INFO: Access modifiers changed from: private */
        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: write, reason: merged with bridge method [inline-methods] */
        public Object invoke(SampleVideos<? super getShowPopup> sampleVideos) {
            return ((MediaMetadataCompat) create(sampleVideos)).invokeSuspend(getShowPopup.INSTANCE);
        }
    }

    public final void IconCompatParcelizer(boolean z) {
        int i = 2 % 2;
        getLatestBitrateEstimate.MediaDescriptionCompat.AudioAttributesCompatParcelizer(CourseConfigKeyConstantsKt.KEY_NOTES);
        if (z) {
            int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
            write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -2117145969, new Object[]{this}, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, 2117145977);
            return;
        }
        LessonIndex lessonIndex = this.onSeekTo;
        LessonIndex lessonIndex2 = null;
        if (lessonIndex != null) {
            if (lessonIndex == null) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                lessonIndex = null;
            }
            String rootSubjectId = lessonIndex.getRootSubjectId();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(rootSubjectId, "");
            if (MediaBrowserCompatSearchResultReceiver(rootSubjectId) != null) {
                return;
            }
            LessonIndex lessonIndex3 = this.onSeekTo;
            if (lessonIndex3 == null) {
                int i2 = addObserverForBackInvokerlambda7 + 95;
                accessonBackPresseds1027565324 = i2 % 128;
                if (i2 % 2 != 0) {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                    int i3 = 51 / 0;
                } else {
                    toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                }
            } else {
                lessonIndex2 = lessonIndex3;
            }
            String rootSubjectId2 = lessonIndex2.getRootSubjectId();
            StringBuilder sb = new StringBuilder();
            sb.append(rootSubjectId2);
            sb.append("_notes");
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).MediaBrowserCompatMediaItem(DataSpecBuilder.write(this.setSessionImpl.read(sb.toString()), read(R.string.f_no_notes_present)));
            return;
        }
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).MediaBrowserCompatMediaItem(read(R.string.f_no_notes_present));
        int i4 = accessonBackPresseds1027565324 + 119;
        addObserverForBackInvokerlambda7 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0030  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object onSetCaptioningEnabled(java.lang.Object[] r12) {
        /*
            r0 = 0
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r0)
            r2 = r12[r0]
            o.fromStyleLine r2 = (kotlin.fromStyleLine) r2
            r3 = 1
            r12 = r12[r3]
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            r4 = 2
            int r5 = r4 % r4
            int r5 = kotlin.fromStyleLine.accessonBackPresseds1027565324
            int r5 = r5 + 79
            int r6 = r5 % 128
            kotlin.fromStyleLine.addObserverForBackInvokerlambda7 = r6
            int r5 = r5 % r4
            if (r5 != 0) goto L2a
            boolean r5 = r2.onCustomAction()
            r6 = 63
            int r6 = r6 / r0
            if (r5 != 0) goto L65
            goto L30
        L2a:
            boolean r5 = r2.onCustomAction()
            if (r5 != 0) goto L65
        L30:
            if (r12 != 0) goto L65
            int r12 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7
            int r12 = r12 + 7
            int r0 = r12 % 128
            kotlin.fromStyleLine.accessonBackPresseds1027565324 = r0
            int r12 = r12 % r4
            o.fromStyleLine$IconCompatParcelizer r12 = o.fromStyleLine.IconCompatParcelizer.AudioAttributesCompatParcelizer
            r2.IconCompatParcelizer(r12)
            o.getLatestBitrateEstimate.MediaDescriptionCompat.RemoteActionCompatParcelizer(r3)
            java.lang.Boolean r12 = java.lang.Boolean.valueOf(r3)
            java.lang.Object[] r8 = new java.lang.Object[]{r2, r1, r12}
            int r6 = kotlin.maybeInvalidateForRendererCapabilitiesChange.write()
            int r10 = kotlin.maybeInvalidateForRendererCapabilitiesChange.write()
            int r9 = kotlin.maybeInvalidateForRendererCapabilitiesChange.write()
            int r5 = kotlin.maybeInvalidateForRendererCapabilitiesChange.write()
            r11 = -1849153369(0xffffffff91c828a7, float:-3.157949E-28)
            r7 = 1849153394(0x6e37d772, float:1.4224054E28)
            write(r5, r6, r7, r8, r9, r10, r11)
            goto L93
        L65:
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r12)
            java.lang.Object[] r8 = new java.lang.Object[]{r2, r3, r1}
            int r6 = kotlin.maybeInvalidateForRendererCapabilitiesChange.write()
            int r10 = kotlin.maybeInvalidateForRendererCapabilitiesChange.write()
            int r9 = kotlin.maybeInvalidateForRendererCapabilitiesChange.write()
            int r5 = kotlin.maybeInvalidateForRendererCapabilitiesChange.write()
            r11 = -1849153369(0xffffffff91c828a7, float:-3.157949E-28)
            r7 = 1849153394(0x6e37d772, float:1.4224054E28)
            write(r5, r6, r7, r8, r9, r10, r11)
            V extends o.handleMiscCode r1 = r2.RemoteActionCompatParcelizer
            o.parseAlignment$write r1 = (o.parseAlignment.write) r1
            r1.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()
            r2.AudioAttributesCompatParcelizer(r12)
            o.getLatestBitrateEstimate.MediaDescriptionCompat.RemoteActionCompatParcelizer(r0)
        L93:
            V extends o.handleMiscCode r12 = r2.RemoteActionCompatParcelizer
            o.parseAlignment$write r12 = (o.parseAlignment.write) r12
            boolean r12 = r12._init_lambda3()
            if (r12 == 0) goto Lad
            int r12 = kotlin.fromStyleLine.accessonBackPresseds1027565324
            int r12 = r12 + 121
            int r0 = r12 % 128
            kotlin.fromStyleLine.addObserverForBackInvokerlambda7 = r0
            int r12 = r12 % r4
            V extends o.handleMiscCode r12 = r2.RemoteActionCompatParcelizer
            o.parseAlignment$write r12 = (o.parseAlignment.write) r12
            r12.addOnConfigurationChangedListener()
        Lad:
            int r12 = kotlin.fromStyleLine.accessonBackPresseds1027565324
            int r12 = r12 + 103
            int r0 = r12 % 128
            kotlin.fromStyleLine.addObserverForBackInvokerlambda7 = r0
            int r12 = r12 % r4
            r0 = 0
            if (r12 == 0) goto Lba
            return r0
        Lba:
            r0.hashCode()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.fromStyleLine.onSetCaptioningEnabled(java.lang.Object[]):java.lang.Object");
    }

    public final void onStop() {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 99;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        if (onCustomAction()) {
            int i4 = addObserverForBackInvokerlambda7 + 83;
            accessonBackPresseds1027565324 = i4 % 128;
            if (i4 % 2 == 0) {
                AudioAttributesCompatParcelizer(false);
            } else {
                AudioAttributesCompatParcelizer(false);
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).onPlayFromMediaId();
    }

    private static /* synthetic */ Object onPlay(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 83;
        addObserverForBackInvokerlambda7 = i2 % 128;
        if (i2 % 2 == 0) {
            ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer)._init_lambda4();
            throw null;
        }
        if (((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer)._init_lambda4()) {
            if (zBooleanValue2) {
                fromstyleline.AudioAttributesImplApi21Parcelizer.write(standardContainsKey.write("notes_fullscreen_icon"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                return null;
            }
            if (!zBooleanValue) {
                int i3 = accessonBackPresseds1027565324 + 109;
                addObserverForBackInvokerlambda7 = i3 % 128;
                if (i3 % 2 == 0) {
                    fromstyleline.AudioAttributesImplApi21Parcelizer.write(standardContainsKey.RemoteActionCompatParcelizer("exit_notes_fullscreen"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                    int i4 = 75 / 0;
                } else {
                    fromstyleline.AudioAttributesImplApi21Parcelizer.write(standardContainsKey.RemoteActionCompatParcelizer("exit_notes_fullscreen"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
                }
            }
        }
        return null;
    }

    private static /* synthetic */ Object onPlayFromMediaId(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 79;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -1120834353, new Object[]{fromstyleline, "player_controls"}, iWrite3, iWrite2, 1120834388);
        int i4 = accessonBackPresseds1027565324 + 39;
        addObserverForBackInvokerlambda7 = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    public final void setSessionImpl() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 31;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        IconCompatParcelizer(IconCompatParcelizer.IconCompatParcelizer);
        if (!(!((parseAlignment.write) this.RemoteActionCompatParcelizer)._init_lambda3())) {
            int i4 = addObserverForBackInvokerlambda7 + 113;
            accessonBackPresseds1027565324 = i4 % 128;
            int i5 = i4 % 2;
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).addOnConfigurationChangedListener();
        }
    }

    public final void onRemoveQueueItem() {
        int i = 2 % 2;
        this.AudioAttributesImplApi21Parcelizer.write(standardContainsKey.RemoteActionCompatParcelizer("exit_pip_icon"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        AudioAttributesCompatParcelizer(false);
        if (((parseAlignment.write) this.RemoteActionCompatParcelizer)._init_lambda3()) {
            int i2 = addObserverForBackInvokerlambda7 + 7;
            accessonBackPresseds1027565324 = i2 % 128;
            int i3 = i2 % 2;
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).addOnConfigurationChangedListener();
            int i4 = accessonBackPresseds1027565324 + 3;
            addObserverForBackInvokerlambda7 = i4 % 128;
            int i5 = i4 % 2;
        }
        int i6 = accessonBackPresseds1027565324 + 33;
        addObserverForBackInvokerlambda7 = i6 % 128;
        if (i6 % 2 == 0) {
            throw null;
        }
    }

    public final void MediaBrowserCompatMediaItem() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 81;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        this.AudioAttributesImplApi21Parcelizer.write(standardContainsKey.RemoteActionCompatParcelizer("close_button"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        this.onPlayFromSearch = true;
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).ResultReceiver();
        int i4 = addObserverForBackInvokerlambda7 + 43;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.parseAlignment.IconCompatParcelizer
    public final void AudioAttributesCompatParcelizer(boolean z) {
        int i = 2 % 2;
        buildResolutionString.IconCompatParcelizer("orientation  shrinkNotes", "Started");
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 1446814096, new Object[]{this, false}, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -1446814063);
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).getSavedStateRegistryControllerannotations();
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).read(z);
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).removeOnMultiWindowModeChangedListener();
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).onCreate();
        this.MediaDescriptionCompat = maybeSkipComment.write;
        RtspMediaTrack rtspMediaTrack = this._init_lambda4;
        if (rtspMediaTrack != null) {
            int i2 = addObserverForBackInvokerlambda7 + 27;
            accessonBackPresseds1027565324 = i2 % 128;
            int i3 = i2 % 2;
            rtspMediaTrack.IconCompatParcelizer(true);
        }
        parseAlignment.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onFastForward;
        if (audioAttributesCompatParcelizer == null) {
            int i4 = addObserverForBackInvokerlambda7 + 19;
            accessonBackPresseds1027565324 = i4 % 128;
            if (i4 % 2 != 0) {
                toMagicModuleMetaRepoModel.IconCompatParcelizer("");
                throw null;
            }
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            audioAttributesCompatParcelizer = null;
        }
        audioAttributesCompatParcelizer.addMenuProvider();
        buildResolutionString.IconCompatParcelizer("orientation  shrinkNotes", "DONE");
        int i5 = accessonBackPresseds1027565324 + 25;
        addObserverForBackInvokerlambda7 = i5 % 128;
        int i6 = i5 % 2;
    }

    private void IconCompatParcelizer(IconCompatParcelizer iconCompatParcelizer) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 59;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(iconCompatParcelizer, "");
        buildResolutionString.IconCompatParcelizer("orientation  expandNotes", "Started");
        write(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 1446814096, new Object[]{this, true}, maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -1446814063);
        read(iconCompatParcelizer);
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).onMediaButtonEvent();
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).MediaSessionCompatQueueItem();
        RtspMediaTrack rtspMediaTrack = this._init_lambda4;
        if (rtspMediaTrack != null) {
            if (rtspMediaTrack.IconCompatParcelizer() && ((parseAlignment.write) this.RemoteActionCompatParcelizer)._init_lambda5()) {
                int i4 = addObserverForBackInvokerlambda7 + 47;
                accessonBackPresseds1027565324 = i4 % 128;
                int i5 = i4 % 2;
                ((parseAlignment.write) this.RemoteActionCompatParcelizer).addContentView();
                ((parseAlignment.write) this.RemoteActionCompatParcelizer).removeMenuProvider();
                rtspMediaTrack.IconCompatParcelizer(true);
            } else {
                ((parseAlignment.write) this.RemoteActionCompatParcelizer).ResultReceiver();
                rtspMediaTrack.IconCompatParcelizer(false);
            }
        }
        buildResolutionString.IconCompatParcelizer("orientation  expandNotes", "DONE");
        int i6 = addObserverForBackInvokerlambda7 + 27;
        accessonBackPresseds1027565324 = i6 % 128;
        if (i6 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void onPlay() {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 115;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        isSeekPending isseekpending = this.AudioAttributesImplApi21Parcelizer;
        if (i3 == 0) {
            isseekpending.write(standardContainsKey.RemoteActionCompatParcelizer("notes_page_back_button"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            int i4 = 27 / 0;
        } else {
            isseekpending.write(standardContainsKey.RemoteActionCompatParcelizer("notes_page_back_button"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        }
        int i5 = addObserverForBackInvokerlambda7 + 107;
        accessonBackPresseds1027565324 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 98 / 0;
        }
    }

    public final void onPlayFromMediaId() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 119;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        this.AudioAttributesImplApi21Parcelizer.write(standardContainsKey.RemoteActionCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        int i4 = addObserverForBackInvokerlambda7 + 67;
        accessonBackPresseds1027565324 = i4 % 128;
        if (i4 % 2 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object onAddQueueItem(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 81;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        fromstyleline.AudioAttributesImplApi21Parcelizer.write(standardContainsKey.AudioAttributesCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
        int i4 = addObserverForBackInvokerlambda7 + 99;
        accessonBackPresseds1027565324 = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    public final void r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() {
        boolean z;
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 21;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        parseAlignment.write writeVar = (parseAlignment.write) this.RemoteActionCompatParcelizer;
        if (this.MediaDescriptionCompat != maybeSkipComment.write) {
            int i4 = accessonBackPresseds1027565324 + 75;
            addObserverForBackInvokerlambda7 = i4 % 128;
            int i5 = i4 % 2;
            z = true;
        } else {
            z = false;
        }
        writeVar.write(z);
    }

    public static final class AudioAttributesImplApi26Parcelizer extends TypeReference<Map<String, ? extends InAppRatingThreshHoldRemoteModel>> {
        AudioAttributesImplApi26Parcelizer() {
        }
    }

    public final void read(IconCompatParcelizer iconCompatParcelizer) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 97;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        this.onCommand = iconCompatParcelizer;
        if (i3 == 0) {
            int i4 = 64 / 0;
        }
    }

    public final void write(String str) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 7;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        parseAlignment.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = this.onFastForward;
        if (audioAttributesCompatParcelizer == null) {
            int i4 = accessonBackPresseds1027565324 + 25;
            addObserverForBackInvokerlambda7 = i4 % 128;
            int i5 = i4 % 2;
            Object obj = null;
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            if (i5 == 0) {
                obj.hashCode();
                throw null;
            }
            audioAttributesCompatParcelizer = null;
        }
        audioAttributesCompatParcelizer.RemoteActionCompatParcelizer("LessonVideoPres", str);
    }

    public final void MediaSessionCompatResultReceiverWrapper() {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324;
        int i3 = i2 + 7;
        addObserverForBackInvokerlambda7 = i3 % 128;
        int i4 = i3 % 2;
        RtspMediaTrack rtspMediaTrack = this._init_lambda4;
        if (rtspMediaTrack != null) {
            int i5 = i2 + 41;
            addObserverForBackInvokerlambda7 = i5 % 128;
            int i6 = i5 % 2;
            rtspMediaTrack.read(false);
            int i7 = addObserverForBackInvokerlambda7 + 11;
            accessonBackPresseds1027565324 = i7 % 128;
            int i8 = i7 % 2;
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lo/fromStyleLine$read;", "", "<init>", "()V"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read {
        private read() {
        }

        public /* synthetic */ read(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    private final void _init_lambda4() {
        int i = 2 % 2;
        CmcdHeadersFactoryCmcdObjectBuilder.read(this.onSkipToNext, "rpd", new write(null), new MagicModuleSubmissionRequestBody() { // from class: o.DeleteTextSpan
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
                int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
                int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
                return (getShowPopup) fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -538092231, new Object[]{(String) obj2}, iWrite3, iWrite2, 538092240);
            }
        });
        int i2 = addObserverForBackInvokerlambda7 + 117;
        accessonBackPresseds1027565324 = i2 % 128;
        if (i2 % 2 != 0) {
            throw null;
        }
    }

    private static final getShowPopup MediaBrowserCompatCustomActionResultReceiver(String str) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 47;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = accessonBackPresseds1027565324 + 109;
        addObserverForBackInvokerlambda7 = i4 % 128;
        if (i4 % 2 != 0) {
            return getshowpopup;
        }
        throw null;
    }

    public final void MediaDescriptionCompat() {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 79;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        if (((parseAlignment.write) this.RemoteActionCompatParcelizer).r8lambdaKUbBm7ckfqTc9QCgukC86fguu4()) {
            int i4 = addObserverForBackInvokerlambda7 + 39;
            accessonBackPresseds1027565324 = i4 % 128;
            int i5 = i4 % 2;
            r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
            this.AudioAttributesImplApi21Parcelizer.write("video_launched", StyledPlayerControlViewLayoutManagerExternalSyntheticLambda12.IconCompatParcelizer(((parseAlignment.write) this.RemoteActionCompatParcelizer).onPrepareFromMediaId(), this.onPrepareFromUri), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.RemoteActionCompatParcelizer));
            MergingMediaSource.Companion readVar = MergingMediaSource.INSTANCE;
            MergingMediaSource.Companion.RemoteActionCompatParcelizer();
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).addOnTrimMemoryListener();
        }
    }

    public final void RemoteActionCompatParcelizer(final String str, final float f) {
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        read(this.onRewind.write(str, (int) f, new String[0]), new getAnswerMap() { // from class: o.processLine
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return fromStyleLine.RemoteActionCompatParcelizer(str, this, f, (MarrowResponse) obj);
            }
        });
        int i2 = addObserverForBackInvokerlambda7 + 1;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
    }

    private static final getShowPopup write(String str, fromStyleLine fromstyleline, float f, MarrowResponse marrowResponse) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 109;
        accessonBackPresseds1027565324 = i2 % 128;
        LessonIndex lessonIndex = null;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(marrowResponse, "");
            LessonIndex lessonIndex2 = fromstyleline.onSeekTo;
            throw null;
        }
        toMagicModuleMetaRepoModel.write(marrowResponse, "");
        LessonIndex lessonIndex3 = fromstyleline.onSeekTo;
        if (lessonIndex3 == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
        } else {
            lessonIndex = lessonIndex3;
        }
        getLatestBitrateEstimate.MediaDescriptionCompat.IconCompatParcelizer(str, lessonIndex.getRootSubjectId(), (int) f, "mark_complete");
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i3 = addObserverForBackInvokerlambda7 + 41;
        accessonBackPresseds1027565324 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 66 / 0;
        }
        return getshowpopup;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0045 A[PHI: r1
      0x0045: PHI (r1v7 java.lang.String) = (r1v6 java.lang.String), (r1v11 java.lang.String) binds: [B:8:0x0043, B:5:0x002b] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onFastForward() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = kotlin.fromStyleLine.accessonBackPresseds1027565324
            int r1 = r1 + 115
            int r2 = r1 % 128
            kotlin.fromStyleLine.addObserverForBackInvokerlambda7 = r2
            int r1 = r1 % r0
            java.lang.String r2 = "security_suspicious_activity"
            java.lang.String r3 = "VideoWatch"
            if (r1 != 0) goto L2e
            o.isSeekPending r1 = r5.AudioAttributesImplApi21Parcelizer
            java.util.Map r3 = kotlin.StyledPlayerControlViewLayoutManagerExternalSyntheticLambda12.RemoteActionCompatParcelizer(r3)
            o.updateLoadingFinished r4 = kotlin.updateLoadingFinished.IconCompatParcelizer
            java.util.List r4 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r4)
            r1.write(r2, r3, r4)
            o.getStreamPositionUsForContent r1 = r5.setSessionImpl
            java.lang.String r1 = r1.AudioAttributesImplBaseParcelizer()
            r2 = 87
            int r2 = r2 / 0
            if (r1 == 0) goto L4c
            goto L45
        L2e:
            o.isSeekPending r1 = r5.AudioAttributesImplApi21Parcelizer
            java.util.Map r3 = kotlin.StyledPlayerControlViewLayoutManagerExternalSyntheticLambda12.RemoteActionCompatParcelizer(r3)
            o.updateLoadingFinished r4 = kotlin.updateLoadingFinished.IconCompatParcelizer
            java.util.List r4 = kotlin.IntermediateLoginResponseBody.RemoteActionCompatParcelizer(r4)
            r1.write(r2, r3, r4)
            o.getStreamPositionUsForContent r1 = r5.setSessionImpl
            java.lang.String r1 = r1.AudioAttributesImplBaseParcelizer()
            if (r1 == 0) goto L4c
        L45:
            V extends o.handleMiscCode r5 = r5.RemoteActionCompatParcelizer
            o.parseAlignment$write r5 = (o.parseAlignment.write) r5
            r5.MediaBrowserCompatCustomActionResultReceiver(r1)
        L4c:
            int r5 = kotlin.fromStyleLine.addObserverForBackInvokerlambda7
            int r5 = r5 + 83
            int r1 = r5 % 128
            kotlin.fromStyleLine.accessonBackPresseds1027565324 = r1
            int r5 = r5 % r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.fromStyleLine.onFastForward():void");
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        final fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        int i = 2 % 2;
        Object obj = null;
        if (fromstyleline.MediaMetadataCompat.aC_()) {
            LessonDynamicResponseBody<Boolean> lessonDynamicResponseBodyWrite = getTrackName.write();
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyWrite, "");
            fromstyleline.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyWrite, new getAnswerMap() { // from class: o.parseShear
                @Override // kotlin.getAnswerMap
                public final Object invoke(Object obj2) {
                    return fromStyleLine.write(this.write, (Boolean) obj2);
                }
            });
            return null;
        }
        int i2 = accessonBackPresseds1027565324 + 113;
        addObserverForBackInvokerlambda7 = i2 % 128;
        if (i2 % 2 == 0) {
            ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).MediaBrowserCompatMediaItem();
            obj.hashCode();
            throw null;
        }
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).MediaBrowserCompatMediaItem();
        int i3 = addObserverForBackInvokerlambda7 + 81;
        accessonBackPresseds1027565324 = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    private static /* synthetic */ Object onStop(Object[] objArr) {
        boolean z = false;
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        Boolean bool = (Boolean) objArr[1];
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 83;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        if (bool.booleanValue() && fromstyleline.onPause.length() > 0) {
            int i4 = addObserverForBackInvokerlambda7;
            int i5 = i4 + 21;
            accessonBackPresseds1027565324 = i5 % 128;
            int i6 = i5 % 2;
            int i7 = i4 + 13;
            accessonBackPresseds1027565324 = i7 % 128;
            int i8 = i7 % 2;
            z = true;
        }
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).RemoteActionCompatParcelizer(fromstyleline.onPause, z);
        return getShowPopup.INSTANCE;
    }

    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 55;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer iconCompatParcelizer = fromstyleline.PlaybackStateCompatCustomAction;
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        iconCompatParcelizer.AudioAttributesCompatParcelizer(((List) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 111371583, new Object[]{fromstyleline}, iWrite3, iWrite2, -111371557)).toArray(new Timeline[0]));
        parseAlignment.write writeVar = (parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer;
        int iWrite4 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite5 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite6 = maybeInvalidateForRendererCapabilitiesChange.write();
        writeVar.AudioAttributesCompatParcelizer(false, ((List) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite4, 111371583, new Object[]{fromstyleline}, iWrite6, iWrite5, -111371557)).size());
        int i4 = addObserverForBackInvokerlambda7 + 95;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
        return null;
    }

    private final void r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 19;
        accessonBackPresseds1027565324 = i2 % 128;
        if (i2 % 2 == 0 ? this.onPrepareFromSearch == 2 : this.onPrepareFromSearch == 2) {
            if (!this.setSessionImpl.addObserverForBackInvoker()) {
                int i3 = accessonBackPresseds1027565324 + 43;
                addObserverForBackInvokerlambda7 = i3 % 128;
                int i4 = i3 % 2;
                ((parseAlignment.write) this.RemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer(this.onPrepareFromSearch);
                int i5 = addObserverForBackInvokerlambda7 + 23;
                accessonBackPresseds1027565324 = i5 % 128;
                if (i5 % 2 == 0) {
                    return;
                }
                Object obj = null;
                obj.hashCode();
                throw null;
            }
        }
        ((parseAlignment.write) this.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper();
    }

    public final void onSetRating() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 25;
        accessonBackPresseds1027565324 = i2 % 128;
        if (i2 % 2 != 0) {
            this.setSessionImpl.addOnUserLeaveHintListener();
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper();
            int i3 = 95 / 0;
        } else {
            this.setSessionImpl.addOnUserLeaveHintListener();
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).MediaSessionCompatResultReceiverWrapper();
        }
        int i4 = addObserverForBackInvokerlambda7 + 111;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final Boolean IconCompatParcelizer(fromStyleLine fromstyleline, int i) {
        int i2 = 2 % 2;
        int i3 = accessonBackPresseds1027565324 + 93;
        addObserverForBackInvokerlambda7 = i3 % 128;
        int i4 = i3 % 2;
        Object[] objArr = {fromstyleline, Integer.valueOf(i)};
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        Boolean boolValueOf = Boolean.valueOf(((Boolean) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 1941693754, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -1941693716)).booleanValue());
        int i5 = accessonBackPresseds1027565324 + 43;
        addObserverForBackInvokerlambda7 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 19 / 0;
        }
        return boolValueOf;
    }

    private static /* synthetic */ Object onMediaButtonEvent(Object[] objArr) {
        getAnswerMap getanswermap = (getAnswerMap) objArr[0];
        Object obj = objArr[1];
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 25;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        getanswermap.invoke(obj);
        int i4 = accessonBackPresseds1027565324 + 87;
        addObserverForBackInvokerlambda7 = i4 % 128;
        if (i4 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        Boolean bool = (Boolean) objArr[2];
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 51;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(bool);
        Object[] objArr2 = {fromstyleline, Boolean.valueOf(bool.booleanValue()), Boolean.valueOf(zBooleanValue)};
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -15182303, objArr2, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, 15182321);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = addObserverForBackInvokerlambda7 + 105;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    private static final void onCommand(getAnswerMap getanswermap, Object obj) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 121;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        getanswermap.invoke(obj);
        int i4 = addObserverForBackInvokerlambda7 + 37;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
    }

    private static final getShowPopup AudioAttributesImplApi26Parcelizer(fromStyleLine fromstyleline, Throwable th) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 101;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        fromstyleline.write(th, "in_app_rating");
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).setSessionImpl();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = addObserverForBackInvokerlambda7 + 39;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopup;
    }

    public final void write(final int i, final boolean z) {
        int i2 = 2 % 2;
        LessonDynamicResponseBody lessonDynamicResponseBodyAudioAttributesCompatParcelizer = LessonDynamicResponseBody.AudioAttributesCompatParcelizer(new Callable() { // from class: o.applyStyleToOutput
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fromStyleLine.read(this.IconCompatParcelizer, i);
            }
        }).write(PlanBUpgradeData.read()).AudioAttributesCompatParcelizer(getDeeplink.read());
        final getAnswerMap getanswermap = new getAnswerMap() { // from class: o.TtmlDecoderCellResolution
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return fromStyleLine.AudioAttributesCompatParcelizer(this.IconCompatParcelizer, z, (Boolean) obj);
            }
        };
        getTimelineId gettimelineid = new getTimelineId() { // from class: o.TtmlNode
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) {
                fromStyleLine.AudioAttributesImplBaseParcelizer(getanswermap, obj);
            }
        };
        final getAnswerMap getanswermap2 = new getAnswerMap() { // from class: o.TtmlDecoderTtsExtent
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return fromStyleLine.write(this.IconCompatParcelizer, (Throwable) obj);
            }
        };
        an_().read(lessonDynamicResponseBodyAudioAttributesCompatParcelizer.RemoteActionCompatParcelizer(gettimelineid, new getTimelineId() { // from class: o.isValidAlignment
            @Override // kotlin.getTimelineId
            public final void RemoteActionCompatParcelizer(Object obj) {
                fromStyleLine.MediaBrowserCompatItemReceiver(getanswermap2, obj);
            }
        }));
        int i3 = accessonBackPresseds1027565324 + 105;
        addObserverForBackInvokerlambda7 = i3 % 128;
        int i4 = i3 % 2;
    }

    private static /* synthetic */ Object onCustomAction(Object[] objArr) {
        final fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        CmcdHeadersFactoryCmcdObjectBuilder.RemoteActionCompatParcelizer(fromstyleline.onSkipToNext, fromstyleline.new MediaMetadataCompat(((Boolean) objArr[2]).booleanValue(), zBooleanValue, null), new MagicModuleSubmissionRequestBody() { // from class: o.TtmlDecoder
            @Override // kotlin.MagicModuleSubmissionRequestBody
            public final Object invoke(Object obj, Object obj2) {
                return fromStyleLine.read(this.RemoteActionCompatParcelizer, (String) obj2);
            }
        });
        int i2 = addObserverForBackInvokerlambda7 + 39;
        accessonBackPresseds1027565324 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 63 / 0;
        }
        return null;
    }

    private static final getShowPopup write(fromStyleLine fromstyleline, String str) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 41;
        accessonBackPresseds1027565324 = i2 % 128;
        if (i2 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).setSessionImpl();
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(str, "");
        ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).setSessionImpl();
        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        int i3 = addObserverForBackInvokerlambda7 + 61;
        accessonBackPresseds1027565324 = i3 % 128;
        if (i3 % 2 != 0) {
            int i4 = 90 / 0;
        }
        return getshowpopup2;
    }

    public final void onSetCaptioningEnabled() {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 77;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        isSeekPending isseekpending = this.AudioAttributesImplApi21Parcelizer;
        if (i3 != 0) {
            isseekpending.write(immediateFailedResult.write("video"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
            return;
        }
        isseekpending.write(immediateFailedResult.write("video"), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void read(Exception exc) {
        int i = 2 % 2;
        if (exc != null) {
            int i2 = accessonBackPresseds1027565324 + 91;
            addObserverForBackInvokerlambda7 = i2 % 128;
            int i3 = i2 % 2;
            write(exc, "in_app_rating");
            if (i3 == 0) {
                int i4 = 87 / 0;
            }
            int i5 = addObserverForBackInvokerlambda7 + 23;
            accessonBackPresseds1027565324 = i5 % 128;
            int i6 = i5 % 2;
        }
    }

    private static /* synthetic */ Object onSeekTo(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 93;
        accessonBackPresseds1027565324 = i2 % 128;
        if (i2 % 2 == 0) {
            if (fromstyleline.onPlayFromSearch) {
                ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).ResultReceiver();
                return null;
            }
            ((parseAlignment.write) fromstyleline.RemoteActionCompatParcelizer).addContentView();
            int i3 = accessonBackPresseds1027565324 + 1;
            addObserverForBackInvokerlambda7 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 40 / 0;
            }
            return null;
        }
        boolean z = fromstyleline.onPlayFromSearch;
        throw null;
    }

    public final void RemoteActionCompatParcelizer(maybeSkipComment maybeskipcomment) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 31;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(maybeskipcomment, "");
        this.MediaDescriptionCompat = maybeskipcomment;
        int i4 = accessonBackPresseds1027565324 + 93;
        addObserverForBackInvokerlambda7 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void _init_lambda2() {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 95;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        this.MediaDescriptionCompat = maybeSkipComment.write;
        if (i3 == 0) {
            throw null;
        }
    }

    public final void RemoteActionCompatParcelizer(maybeSkipWhitespace maybeskipwhitespace, int i, int i2) {
        int i3 = 2 % 2;
        int i4 = accessonBackPresseds1027565324 + 69;
        addObserverForBackInvokerlambda7 = i4 % 128;
        if (i4 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(maybeskipwhitespace, "");
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).write(maybeskipwhitespace, i, i2, this.MediaDescriptionCompat);
        } else {
            toMagicModuleMetaRepoModel.write(maybeskipwhitespace, "");
            ((parseAlignment.write) this.RemoteActionCompatParcelizer).write(maybeskipwhitespace, i, i2, this.MediaDescriptionCompat);
            int i5 = 10 / 0;
        }
    }

    public final void write(int i, int i2) {
        int i3 = 2 % 2;
        int i4 = accessonBackPresseds1027565324 + 123;
        addObserverForBackInvokerlambda7 = i4 % 128;
        try {
            if (i4 % 2 == 0) {
                ((parseAlignment.write) this.RemoteActionCompatParcelizer).IconCompatParcelizer(i, i2, this.MediaDescriptionCompat);
                int i5 = 94 / 0;
            } else {
                ((parseAlignment.write) this.RemoteActionCompatParcelizer).IconCompatParcelizer(i, i2, this.MediaDescriptionCompat);
            }
            int i6 = addObserverForBackInvokerlambda7 + 95;
            accessonBackPresseds1027565324 = i6 % 128;
            int i7 = i6 % 2;
        } catch (Exception e) {
            getExternalPeriodUid.Companion companion = getExternalPeriodUid.INSTANCE;
            getExternalPeriodUid.Companion.read(e, VideoTimelineResponseBody.read(setAction.write("key", "video_pip_adjust_bounds")), 4);
        }
    }

    public final void PlaybackStateCompatCustomAction() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 57;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        RtspMediaTrack rtspMediaTrack = this._init_lambda4;
        if (rtspMediaTrack != null) {
            rtspMediaTrack.ay_();
            int i4 = addObserverForBackInvokerlambda7 + 79;
            accessonBackPresseds1027565324 = i4 % 128;
            int i5 = i4 % 2;
        }
    }

    public final boolean onCommand() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 65;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        boolean zAudioAttributesImplBaseParcelizer = this.PlaybackStateCompat.AudioAttributesImplBaseParcelizer();
        int i4 = accessonBackPresseds1027565324 + 111;
        addObserverForBackInvokerlambda7 = i4 % 128;
        int i5 = i4 % 2;
        return zAudioAttributesImplBaseParcelizer;
    }

    private static /* synthetic */ Object onRewind(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        int i = 2 % 2;
        if (((Number) objArr[1]).intValue() < 5) {
            int i2 = accessonBackPresseds1027565324 + 125;
            addObserverForBackInvokerlambda7 = i2 % 128;
            int i3 = i2 % 2;
            return false;
        }
        if (!fromstyleline.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4.IconCompatParcelizer("video")) {
            int i4 = accessonBackPresseds1027565324 + 71;
            addObserverForBackInvokerlambda7 = i4 % 128;
            int i5 = i4 % 2;
            return false;
        }
        InAppRatingThreshHoldRemoteModel inAppRatingThreshHoldRemoteModelAudioAttributesCompatParcelizer = fromstyleline.AudioAttributesCompatParcelizer(fromstyleline.setSessionImpl.onRemoveQueueItem());
        if (inAppRatingThreshHoldRemoteModelAudioAttributesCompatParcelizer != null) {
            int i6 = addObserverForBackInvokerlambda7 + 13;
            accessonBackPresseds1027565324 = i6 % 128;
            int i7 = i6 % 2;
            Integer videoThreshold = inAppRatingThreshHoldRemoteModelAudioAttributesCompatParcelizer.getVideoThreshold();
            if (videoThreshold != null) {
                return Boolean.valueOf(fromstyleline.write(videoThreshold.intValue()));
            }
        }
        return false;
    }

    private final InAppRatingThreshHoldRemoteModel AudioAttributesCompatParcelizer(int i) {
        Map map;
        int i2 = 2 % 2;
        try {
            map = (Map) new ObjectMapper().readValue(this.PlaybackStateCompat.IconCompatParcelizer(), new AudioAttributesImplApi26Parcelizer());
            int i3 = accessonBackPresseds1027565324 + 1;
            addObserverForBackInvokerlambda7 = i3 % 128;
            if (i3 % 2 == 0) {
                int i4 = 5 % 4;
            }
        } catch (Exception e) {
            write(e, "in_app_rating");
            map = null;
        }
        if (map == null) {
            return null;
        }
        int i5 = accessonBackPresseds1027565324 + 69;
        addObserverForBackInvokerlambda7 = i5 % 128;
        int i6 = i5 % 2;
        return (InAppRatingThreshHoldRemoteModel) map.getOrDefault(String.valueOf(i), null);
    }

    private final boolean write(int i) {
        int i2 = 2 % 2;
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (this.onRewind.IconCompatParcelizer(jCurrentTimeMillis - TimeUnit.DAYS.toMillis(30L), jCurrentTimeMillis) < i) {
            return false;
        }
        int i3 = addObserverForBackInvokerlambda7 + 51;
        int i4 = i3 % 128;
        accessonBackPresseds1027565324 = i4;
        int i5 = i3 % 2;
        int i6 = i4 + 13;
        addObserverForBackInvokerlambda7 = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public final void _init_lambda3() {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 45;
        int i3 = i2 % 128;
        addObserverForBackInvokerlambda7 = i3;
        int i4 = i2 % 2;
        this.onPlayFromSearch = false;
        int i5 = i3 + 57;
        accessonBackPresseds1027565324 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 43 / 0;
        }
    }

    private static final ActiveRecallQbankLessonUiModel AudioAttributesCompatParcelizer(fromStyleLine fromstyleline, boolean z, String str) {
        ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModel;
        int i = 2 % 2;
        if (fromstyleline.read == null || z) {
            LessonIndex lessonIndexRemoteActionCompatParcelizer = fromstyleline.onRewind.RemoteActionCompatParcelizer(str);
            if (lessonIndexRemoteActionCompatParcelizer != null) {
                activeRecallQbankLessonUiModel = traverseForImage.read(lessonIndexRemoteActionCompatParcelizer);
                int i2 = accessonBackPresseds1027565324 + 99;
                addObserverForBackInvokerlambda7 = i2 % 128;
                if (i2 % 2 == 0) {
                    int i3 = 3 % 4;
                }
            } else {
                activeRecallQbankLessonUiModel = null;
            }
            fromstyleline.read = activeRecallQbankLessonUiModel;
            int i4 = addObserverForBackInvokerlambda7 + 69;
            accessonBackPresseds1027565324 = i4 % 128;
            int i5 = i4 % 2;
        }
        return fromstyleline.read;
    }

    private final LessonDynamicResponseBody<ActiveRecallQbankLessonUiModel> write(final boolean z, final String str) {
        int i = 2 % 2;
        LessonDynamicResponseBody<ActiveRecallQbankLessonUiModel> lessonDynamicResponseBodyWrite = LessonDynamicResponseBody.AudioAttributesCompatParcelizer(new Callable() { // from class: o.parseTimecode
            @Override // java.util.concurrent.Callable
            public final Object call() {
                return fromStyleLine.read(this.read, z, str);
            }
        }).write(al_());
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonDynamicResponseBodyWrite, "");
        int i2 = addObserverForBackInvokerlambda7 + 5;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        return lessonDynamicResponseBodyWrite;
    }

    private static final void AudioAttributesCompatParcelizer(fromStyleLine fromstyleline, int i, int i2, Timeline timeline) {
        int i3 = 2 % 2;
        int i4 = addObserverForBackInvokerlambda7 + 43;
        accessonBackPresseds1027565324 = i4 % 128;
        if (i4 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(timeline, "");
            Object[] objArr = {fromstyleline, Integer.valueOf(i), Integer.valueOf(i2), timeline};
            int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
            write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 585424467, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -585424436);
            return;
        }
        toMagicModuleMetaRepoModel.write(timeline, "");
        Object[] objArr2 = {fromstyleline, Integer.valueOf(i), Integer.valueOf(i2), timeline};
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite4 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite3, 585424467, objArr2, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite4, -585424436);
        throw null;
    }

    public final void write(String str, int i, boolean z) {
        int i2 = 2 % 2;
        int i3 = accessonBackPresseds1027565324 + 23;
        addObserverForBackInvokerlambda7 = i3 % 128;
        int i4 = i3 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        for (Timeline timeline : (List) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 111371583, new Object[]{this}, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -111371557)) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) timeline.getTimelineId(), (Object) str)) {
                int i5 = accessonBackPresseds1027565324 + 9;
                addObserverForBackInvokerlambda7 = i5 % 128;
                if (i5 % 2 == 0) {
                    timeline.setBookmarkType(i);
                    Object obj = null;
                    obj.hashCode();
                    throw null;
                }
                timeline.setBookmarkType(i);
                if (!(!z)) {
                    WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer iconCompatParcelizer = this.PlaybackStateCompatCustomAction;
                    int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
                    int iWrite4 = maybeInvalidateForRendererCapabilitiesChange.write();
                    iconCompatParcelizer.AudioAttributesCompatParcelizer(((List) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite3, 111371583, new Object[]{this}, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite4, -111371557)).toArray(new Timeline[0]));
                    return;
                }
                WebvttSubtitleExternalSyntheticLambda0.IconCompatParcelizer iconCompatParcelizer2 = this.PlaybackStateCompatCustomAction;
                int iWrite5 = maybeInvalidateForRendererCapabilitiesChange.write();
                int iWrite6 = maybeInvalidateForRendererCapabilitiesChange.write();
                iconCompatParcelizer2.AudioAttributesCompatParcelizer(IntermediateLoginResponseBody.write((Iterable) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite5, 111371583, new Object[]{this}, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite6, -111371557), 3).toArray(new Timeline[0]));
                return;
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    private static List<DownloadableResolution> write(Pair<? extends List<getClosedCaptionTrackFormats>, Object> pair) throws Throwable {
        int iIntValue;
        Object next;
        DownloadableResolution downloadableResolution;
        int i = 2 % 2;
        List<getClosedCaptionTrackFormats> listWrite = pair.write();
        Object objIconCompatParcelizer = pair.IconCompatParcelizer();
        try {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1455813682);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)) + 12753), 13987 - (ViewConfiguration.getJumpTapTimeout() >> 16), TextUtils.getCapsMode("", 0, 0) + 25, 680276135, false, "write", new Class[0]);
            }
            Object obj = null;
            Map map = (Map) ((Method) objRemoteActionCompatParcelizer).invoke(objIconCompatParcelizer, null);
            ArrayList arrayList = new ArrayList(map.size());
            Iterator it = map.entrySet().iterator();
            while (it.hasNext()) {
                Integer numAudioAttributesImplApi26Parcelizer = TestGroupLSModel.AudioAttributesImplApi26Parcelizer((String) ((Map.Entry) it.next()).getValue());
                if (numAudioAttributesImplApi26Parcelizer != null) {
                    int i2 = accessonBackPresseds1027565324 + 109;
                    addObserverForBackInvokerlambda7 = i2 % 128;
                    int i3 = i2 % 2;
                    iIntValue = numAudioAttributesImplApi26Parcelizer.intValue();
                } else {
                    iIntValue = 1;
                }
                int i4 = iIntValue;
                int i5 = (int) (i4 * 2.0f);
                buildFormat.Companion writeVar = buildFormat.INSTANCE;
                getChunkEndTimeUs getchunkendtimeusIconCompatParcelizer = buildFormat.Companion.IconCompatParcelizer(i4);
                Iterator<T> it2 = listWrite.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    int i6 = addObserverForBackInvokerlambda7 + 75;
                    accessonBackPresseds1027565324 = i6 % 128;
                    if (i6 % 2 != 0) {
                        ((getClosedCaptionTrackFormats) it2.next()).getWrite();
                        obj.hashCode();
                        throw null;
                    }
                    next = it2.next();
                    if (((getClosedCaptionTrackFormats) next).getWrite() == getchunkendtimeusIconCompatParcelizer) {
                        break;
                    }
                }
                getClosedCaptionTrackFormats getclosedcaptiontrackformats = (getClosedCaptionTrackFormats) next;
                buildFormat.Companion writeVar2 = buildFormat.INSTANCE;
                boolean zIconCompatParcelizer = buildFormat.Companion.IconCompatParcelizer(i5, i4);
                if (getclosedcaptiontrackformats != null && !getclosedcaptiontrackformats.getIconCompatParcelizer()) {
                    try {
                        Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-1093442826);
                        if (objRemoteActionCompatParcelizer2 == null) {
                            objRemoteActionCompatParcelizer2 = startForeground.read((char) ((ViewConfiguration.getDoubleTapTimeout() >> 16) + 12754), 13988 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)), 25 - ExpandableListView.getPackedPositionType(0L), -1063606685, false, "RemoteActionCompatParcelizer", new Class[0]);
                        }
                        downloadableResolution = new DownloadableResolution((String) ((Method) objRemoteActionCompatParcelizer2).invoke(objIconCompatParcelizer, null), i4, false, getclosedcaptiontrackformats.getAudioAttributesCompatParcelizer());
                        int i7 = addObserverForBackInvokerlambda7 + 73;
                        accessonBackPresseds1027565324 = i7 % 128;
                        int i8 = i7 % 2;
                    } catch (Throwable th) {
                        Throwable cause = th.getCause();
                        if (cause != null) {
                            throw cause;
                        }
                        throw th;
                    }
                } else if (zIconCompatParcelizer) {
                    Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-1093442826);
                    if (objRemoteActionCompatParcelizer3 == null) {
                        objRemoteActionCompatParcelizer3 = startForeground.read((char) (Color.red(0) + 12754), 13987 - ExpandableListView.getPackedPositionType(0L), 25 - (ViewConfiguration.getLongPressTimeout() >> 16), -1063606685, false, "RemoteActionCompatParcelizer", new Class[0]);
                    }
                    downloadableResolution = new DownloadableResolution((String) ((Method) objRemoteActionCompatParcelizer3).invoke(objIconCompatParcelizer, null), i4, true, null, 8, null);
                } else {
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-1093442826);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) (12754 - KeyEvent.normalizeMetaState(0)), 13987 - TextUtils.getOffsetAfter("", 0), 25 - TextUtils.getCapsMode("", 0, 0), -1063606685, false, "RemoteActionCompatParcelizer", new Class[0]);
                    }
                    String str = (String) ((Method) objRemoteActionCompatParcelizer4).invoke(objIconCompatParcelizer, null);
                    String str2 = getchunkendtimeusIconCompatParcelizer.getWrite();
                    StringBuilder sb = new StringBuilder("Your device does not support ");
                    sb.append(str2);
                    sb.append(" resolution");
                    downloadableResolution = new DownloadableResolution(str, i4, false, sb.toString());
                }
                arrayList.add(downloadableResolution);
            }
            return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Iterable) arrayList, (Comparator) new MediaBrowserCompatSearchResultReceiver());
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0831  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x01af  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object onRemoveQueueItem(java.lang.Object[] r34) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 4117
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.fromStyleLine.onRemoveQueueItem(java.lang.Object[]):java.lang.Object");
    }

    public static /* synthetic */ void write(getAnswerMap getanswermap, Object obj) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 83;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        MediaBrowserCompatSearchResultReceiver(getanswermap, obj);
        int i4 = addObserverForBackInvokerlambda7 + 35;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ void MediaBrowserCompatItemReceiver(getAnswerMap getanswermap, Object obj) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 25;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        onCommand(getanswermap, obj);
        if (i3 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup read(fromStyleLine fromstyleline, Throwable th) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        return (getShowPopup) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -1091237785, new Object[]{fromstyleline, th}, iWrite3, iWrite2, 1091237828);
    }

    public static /* synthetic */ DownloadOptionsUIModel IconCompatParcelizer(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, Object obj, Object obj2) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 61;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        DownloadOptionsUIModel downloadOptionsUIModel = (DownloadOptionsUIModel) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -2048453287, new Object[]{magicModuleSubmissionRequestBody, obj, obj2}, iWrite3, iWrite2, 2048453300);
        int i4 = addObserverForBackInvokerlambda7 + 91;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
        return downloadOptionsUIModel;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(fromStyleLine fromstyleline) throws Throwable {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 19;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupOnPlay = onPlay(fromstyleline);
        int i4 = accessonBackPresseds1027565324 + 119;
        addObserverForBackInvokerlambda7 = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupOnPlay;
    }

    public static /* synthetic */ getShowPopup read(fromStyleLine fromstyleline, ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModel) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 35;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupIconCompatParcelizer = IconCompatParcelizer(fromstyleline, activeRecallQbankLessonUiModel);
        int i4 = addObserverForBackInvokerlambda7 + 109;
        accessonBackPresseds1027565324 = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopupIconCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(fromStyleLine fromstyleline) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 21;
        addObserverForBackInvokerlambda7 = i2 % 128;
        if (i2 % 2 != 0) {
            return onMediaButtonEvent(fromstyleline);
        }
        onMediaButtonEvent(fromstyleline);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ DownloadOptionsUIModel read$2ac9cfd6(fromStyleLine fromstyleline, List list, Object obj) throws Throwable {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 15;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        DownloadOptionsUIModel downloadOptionsUIModelIconCompatParcelizer$4744cdda = IconCompatParcelizer$4744cdda(list, obj);
        if (i3 == 0) {
            int i4 = 41 / 0;
        }
        int i5 = addObserverForBackInvokerlambda7 + 51;
        accessonBackPresseds1027565324 = i5 % 128;
        if (i5 % 2 == 0) {
            return downloadOptionsUIModelIconCompatParcelizer$4744cdda;
        }
        throw null;
    }

    public static /* synthetic */ getShowPopup write(fromStyleLine fromstyleline, Pair pair) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 43;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(fromstyleline, pair);
        int i4 = addObserverForBackInvokerlambda7 + 33;
        accessonBackPresseds1027565324 = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopupAudioAttributesCompatParcelizer;
        }
        throw null;
    }

    public static /* synthetic */ void AudioAttributesImplApi21Parcelizer(getAnswerMap getanswermap, Object obj) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 7;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        MediaBrowserCompatMediaItem(getanswermap, obj);
        int i4 = accessonBackPresseds1027565324 + 113;
        addObserverForBackInvokerlambda7 = i4 % 128;
        if (i4 % 2 != 0) {
            return;
        }
        Object obj2 = null;
        obj2.hashCode();
        throw null;
    }

    public static /* synthetic */ void MediaBrowserCompatCustomActionResultReceiver(getAnswerMap getanswermap, Object obj) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 55;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -1848523201, new Object[]{getanswermap, obj}, iWrite3, iWrite2, 1848523230);
        int i4 = accessonBackPresseds1027565324 + 109;
        addObserverForBackInvokerlambda7 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ getShowPopup read(String str) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 23;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupMediaDescriptionCompat = MediaDescriptionCompat(str);
        int i4 = accessonBackPresseds1027565324 + 57;
        addObserverForBackInvokerlambda7 = i4 % 128;
        if (i4 % 2 != 0) {
            return getshowpopupMediaDescriptionCompat;
        }
        throw null;
    }

    public static /* synthetic */ LessonIndex read(fromStyleLine fromstyleline) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 123;
        addObserverForBackInvokerlambda7 = i2 % 128;
        if (i2 % 2 != 0) {
            return onPause(fromstyleline);
        }
        onPause(fromstyleline);
        throw null;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(String str) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        return (getShowPopup) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -2068943433, new Object[]{str}, iWrite3, iWrite2, 2068943434);
    }

    public static /* synthetic */ getShowPopup MediaMetadataCompat() {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 15;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupAddContentView = addContentView();
        int i4 = accessonBackPresseds1027565324 + 47;
        addObserverForBackInvokerlambda7 = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupAddContentView;
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(fromStyleLine fromstyleline, List list) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 89;
        accessonBackPresseds1027565324 = i2 % 128;
        if (i2 % 2 == 0) {
            return RemoteActionCompatParcelizer(fromstyleline, list);
        }
        RemoteActionCompatParcelizer(fromstyleline, list);
        throw null;
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(fromStyleLine fromstyleline, boolean z, Boolean bool) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 123;
        addObserverForBackInvokerlambda7 = i2 % 128;
        if (i2 % 2 == 0) {
            Object[] objArr = {fromstyleline, Boolean.valueOf(z), bool};
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        Object[] objArr2 = {fromstyleline, Boolean.valueOf(z), bool};
        getShowPopup getshowpopup = (getShowPopup) write(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 1632515751, objArr2, maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -1632515745);
        int i3 = accessonBackPresseds1027565324 + 123;
        addObserverForBackInvokerlambda7 = i3 % 128;
        int i4 = i3 % 2;
        return getshowpopup;
    }

    public static /* synthetic */ Pair write(MarrowResponse marrowResponse, LessonIndex lessonIndex) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 29;
        addObserverForBackInvokerlambda7 = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            read(marrowResponse, lessonIndex);
            obj.hashCode();
            throw null;
        }
        Pair pair = read(marrowResponse, lessonIndex);
        int i3 = accessonBackPresseds1027565324 + 77;
        addObserverForBackInvokerlambda7 = i3 % 128;
        if (i3 % 2 != 0) {
            return pair;
        }
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ Boolean AudioAttributesCompatParcelizer(fromStyleLine fromstyleline, String str) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 71;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        Boolean boolRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(fromstyleline, str);
        int i4 = addObserverForBackInvokerlambda7 + 39;
        accessonBackPresseds1027565324 = i4 % 128;
        if (i4 % 2 == 0) {
            return boolRemoteActionCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(fromStyleLine fromstyleline, int i, Timeline timeline, MarrowResponse marrowResponse) {
        int i2 = 2 % 2;
        int i3 = accessonBackPresseds1027565324 + 31;
        addObserverForBackInvokerlambda7 = i3 % 128;
        int i4 = i3 % 2;
        getShowPopup getshowpopupAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(fromstyleline, i, timeline, marrowResponse);
        int i5 = addObserverForBackInvokerlambda7 + 17;
        accessonBackPresseds1027565324 = i5 % 128;
        int i6 = i5 % 2;
        return getshowpopupAudioAttributesCompatParcelizer;
    }

    public static /* synthetic */ Boolean read(fromStyleLine fromstyleline, int i) {
        int i2 = 2 % 2;
        int i3 = accessonBackPresseds1027565324 + 15;
        addObserverForBackInvokerlambda7 = i3 % 128;
        int i4 = i3 % 2;
        Boolean boolIconCompatParcelizer = IconCompatParcelizer(fromstyleline, i);
        int i5 = accessonBackPresseds1027565324 + 25;
        addObserverForBackInvokerlambda7 = i5 % 128;
        int i6 = i5 % 2;
        return boolIconCompatParcelizer;
    }

    public static /* synthetic */ getShowPopup write(fromStyleLine fromstyleline, Boolean bool) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 125;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        getShowPopup getshowpopup = (getShowPopup) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 1574310694, new Object[]{fromstyleline, bool}, iWrite3, iWrite2, -1574310649);
        int i4 = addObserverForBackInvokerlambda7 + 119;
        accessonBackPresseds1027565324 = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ CourseConfigV2 write(fromStyleLine fromstyleline) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 91;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        CourseConfigV2 courseConfigV2 = (CourseConfigV2) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -1079826980, new Object[]{fromstyleline}, iWrite3, iWrite2, 1079827001);
        int i4 = accessonBackPresseds1027565324 + 17;
        addObserverForBackInvokerlambda7 = i4 % 128;
        int i5 = i4 % 2;
        return courseConfigV2;
    }

    public static /* synthetic */ void AudioAttributesImplApi26Parcelizer(getAnswerMap getanswermap, Object obj) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 55;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        MediaDescriptionCompat(getanswermap, obj);
        if (i3 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(String str) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        return (getShowPopup) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -538092231, new Object[]{str}, iWrite3, iWrite2, 538092240);
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(fromStyleLine fromstyleline, LessonIndex lessonIndex) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 75;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupWrite = write(fromstyleline, lessonIndex);
        int i4 = addObserverForBackInvokerlambda7 + 67;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupWrite;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(fromStyleLine fromstyleline, Throwable th) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 87;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupAudioAttributesImplBaseParcelizer = AudioAttributesImplBaseParcelizer(fromstyleline, th);
        if (i3 != 0) {
            int i4 = 28 / 0;
        }
        return getshowpopupAudioAttributesImplBaseParcelizer;
    }

    public static /* synthetic */ void read(fromStyleLine fromstyleline, int i, int i2, Timeline timeline) {
        int i3 = 2 % 2;
        int i4 = addObserverForBackInvokerlambda7 + 81;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
        AudioAttributesCompatParcelizer(fromstyleline, i, i2, timeline);
        int i6 = accessonBackPresseds1027565324 + 91;
        addObserverForBackInvokerlambda7 = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ getShowPopup read(fromStyleLine fromstyleline, String str) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 87;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupWrite = write(fromstyleline, str);
        if (i3 == 0) {
            int i4 = 60 / 0;
        }
        return getshowpopupWrite;
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(fromStyleLine fromstyleline) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 51;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupOnFastForward = onFastForward(fromstyleline);
        int i4 = addObserverForBackInvokerlambda7 + 107;
        accessonBackPresseds1027565324 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 8 / 0;
        }
        return getshowpopupOnFastForward;
    }

    public static /* synthetic */ getShowPopup write(fromStyleLine fromstyleline, int i, String str) {
        Object[] objArr = {fromstyleline, Integer.valueOf(i), str};
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        return (getShowPopup) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 942556149, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -942556138);
    }

    public static /* synthetic */ void AudioAttributesImplBaseParcelizer(getAnswerMap getanswermap, Object obj) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 75;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 2039631126, new Object[]{getanswermap, obj}, iWrite3, iWrite2, -2039631104);
        int i4 = addObserverForBackInvokerlambda7 + 45;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ ActiveRecallQbankLessonUiModel read(fromStyleLine fromstyleline, boolean z, String str) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 21;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModelAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(fromstyleline, z, str);
        int i4 = addObserverForBackInvokerlambda7 + 85;
        accessonBackPresseds1027565324 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 88 / 0;
        }
        return activeRecallQbankLessonUiModelAudioAttributesCompatParcelizer;
    }

    public static /* synthetic */ List AudioAttributesImplBaseParcelizer(fromStyleLine fromstyleline) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 41;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        List listOnPrepare = onPrepare(fromstyleline);
        int i4 = accessonBackPresseds1027565324 + 35;
        addObserverForBackInvokerlambda7 = i4 % 128;
        int i5 = i4 % 2;
        return listOnPrepare;
    }

    public static /* synthetic */ getShowPopup write(fromStyleLine fromstyleline, Throwable th) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 11;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupAudioAttributesImplApi26Parcelizer = AudioAttributesImplApi26Parcelizer(fromstyleline, th);
        int i4 = addObserverForBackInvokerlambda7 + 81;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupAudioAttributesImplApi26Parcelizer;
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(fromStyleLine fromstyleline, String str, MagicModuleUseCaseImplWhenMappings.IconCompatParcelizer iconCompatParcelizer, String str2) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 79;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(fromstyleline, str, iconCompatParcelizer, str2);
        int i4 = accessonBackPresseds1027565324 + 99;
        addObserverForBackInvokerlambda7 = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupAudioAttributesCompatParcelizer;
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(fromStyleLine fromstyleline, Throwable th) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 93;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupMediaBrowserCompatCustomActionResultReceiver = MediaBrowserCompatCustomActionResultReceiver(fromstyleline, th);
        if (i3 == 0) {
            int i4 = 45 / 0;
        }
        return getshowpopupMediaBrowserCompatCustomActionResultReceiver;
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(fromStyleLine fromstyleline, MarrowResponse marrowResponse) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 73;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopup = read(fromstyleline, marrowResponse);
        int i4 = addObserverForBackInvokerlambda7 + 11;
        accessonBackPresseds1027565324 = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup write(fromStyleLine fromstyleline, ApiResponse apiResponse) {
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 11;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(fromstyleline, apiResponse);
        if (i3 != 0) {
            int i4 = 81 / 0;
        }
        int i5 = addObserverForBackInvokerlambda7 + 21;
        accessonBackPresseds1027565324 = i5 % 128;
        if (i5 % 2 == 0) {
            return getshowpopupAudioAttributesCompatParcelizer;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup RatingCompat() {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 105;
        addObserverForBackInvokerlambda7 = i2 % 128;
        if (i2 % 2 == 0) {
            menuHostHelperlambda0();
            throw null;
        }
        getShowPopup getshowpopupMenuHostHelperlambda0 = menuHostHelperlambda0();
        int i3 = accessonBackPresseds1027565324 + 109;
        addObserverForBackInvokerlambda7 = i3 % 128;
        int i4 = i3 % 2;
        return getshowpopupMenuHostHelperlambda0;
    }

    public static /* synthetic */ getShowPopup AudioAttributesCompatParcelizer(fromStyleLine fromstyleline, int i, DownloadOptionsUIModel downloadOptionsUIModel) {
        int i2 = 2 % 2;
        int i3 = accessonBackPresseds1027565324 + 67;
        addObserverForBackInvokerlambda7 = i3 % 128;
        int i4 = i3 % 2;
        getShowPopup getshowpopup = read(fromstyleline, i, downloadOptionsUIModel);
        int i5 = addObserverForBackInvokerlambda7 + 103;
        accessonBackPresseds1027565324 = i5 % 128;
        int i6 = i5 % 2;
        return getshowpopup;
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(fromStyleLine fromstyleline, Throwable th) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 5;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupMediaBrowserCompatItemReceiver = MediaBrowserCompatItemReceiver(fromstyleline, th);
        int i4 = addObserverForBackInvokerlambda7 + 33;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupMediaBrowserCompatItemReceiver;
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(String str, fromStyleLine fromstyleline, float f, MarrowResponse marrowResponse) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 9;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupWrite = write(str, fromstyleline, f, marrowResponse);
        int i4 = addObserverForBackInvokerlambda7 + 31;
        accessonBackPresseds1027565324 = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopupWrite;
        }
        throw null;
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer(fromStyleLine fromstyleline, LessonTabItem lessonTabItem) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 53;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        read(fromstyleline, lessonTabItem);
        if (i3 == 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = addObserverForBackInvokerlambda7 + 5;
        accessonBackPresseds1027565324 = i4 % 128;
        int i5 = i4 % 2;
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(String str) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 69;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupRatingCompat = RatingCompat(str);
        int i4 = accessonBackPresseds1027565324 + 123;
        addObserverForBackInvokerlambda7 = i4 % 128;
        int i5 = i4 % 2;
        return getshowpopupRatingCompat;
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(fromStyleLine fromstyleline, MarrowResponse marrowResponse) {
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 59;
        addObserverForBackInvokerlambda7 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupWrite = write(fromstyleline, marrowResponse);
        if (i3 == 0) {
            int i4 = 61 / 0;
        }
        int i5 = addObserverForBackInvokerlambda7 + 83;
        accessonBackPresseds1027565324 = i5 % 128;
        if (i5 % 2 == 0) {
            return getshowpopupWrite;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    static {
        ensureViewModelStore = 0;
        r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28();
        IconCompatParcelizer = new read(null);
        int i = createFullyDrawnExecutor + 93;
        ensureViewModelStore = i % 128;
        int i2 = i % 2;
    }

    public static final /* synthetic */ String MediaDescriptionCompat(fromStyleLine fromstyleline) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        return (String) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -841951145, new Object[]{fromstyleline}, iWrite3, iWrite2, 841951152);
    }

    public static final /* synthetic */ Object MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver$13f1e0a5(fromStyleLine fromstyleline) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        return write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 804314355, new Object[]{fromstyleline}, iWrite3, iWrite2, -804314311);
    }

    private final void IconCompatParcelizer(int i, boolean z, String str) {
        Object[] objArr = {this, Integer.valueOf(i), Boolean.valueOf(z), str};
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -324616736, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, 324616750);
    }

    private static final CourseConfigV2 onCommand(fromStyleLine fromstyleline) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        return (CourseConfigV2) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -1079826980, new Object[]{fromstyleline}, iWrite3, iWrite2, 1079827001);
    }

    private static final DownloadOptionsUIModel write(MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, Object obj, Object obj2) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        return (DownloadOptionsUIModel) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -2048453287, new Object[]{magicModuleSubmissionRequestBody, obj, obj2}, iWrite3, iWrite2, 2048453300);
    }

    private final CourseConfigV2 accessaddObserverForBackInvoker() {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        return (CourseConfigV2) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 121768406, new Object[]{this}, iWrite3, iWrite2, -121768383);
    }

    private final accessgetEmptyStatecp<Boolean> MediaBrowserCompatItemReceiver(String str) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        return (accessgetEmptyStatecp) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 564256362, new Object[]{this, str}, iWrite3, iWrite2, -564256345);
    }

    private final List<Timeline> _init_lambda5() {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        return (List) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 111371583, new Object[]{this}, iWrite3, iWrite2, -111371557);
    }

    private final boolean RemoteActionCompatParcelizer(int i) {
        Object[] objArr = {this, Integer.valueOf(i)};
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        return ((Boolean) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 1941693754, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -1941693716)).booleanValue();
    }

    private final void AudioAttributesImplBaseParcelizer(String str) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -1120834353, new Object[]{this, str}, iWrite3, iWrite2, 1120834388);
    }

    private static /* synthetic */ void onPlayFromMediaId(fromStyleLine fromstyleline) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -2117145969, new Object[]{fromstyleline}, iWrite3, iWrite2, 2117145977);
    }

    private final void accessonBackPresseds1027565324() {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -1113744778, new Object[]{this}, iWrite3, iWrite2, 1113744815);
    }

    private static final getShowPopup IconCompatParcelizer(fromStyleLine fromstyleline, Boolean bool) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        return (getShowPopup) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 1574310694, new Object[]{fromstyleline, bool}, iWrite3, iWrite2, -1574310649);
    }

    private final void IconCompatParcelizer(LessonIndex lessonIndex) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -1390383695, new Object[]{this, lessonIndex}, iWrite3, iWrite2, 1390383725);
    }

    private final void AudioAttributesCompatParcelizer(ApiResponse<LoggedUserResponse> apiResponse) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -1949021304, new Object[]{this, apiResponse}, iWrite3, iWrite2, 1949021344);
    }

    private final void IconCompatParcelizer(int i, int i2, Timeline timeline) {
        Object[] objArr = {this, Integer.valueOf(i), Integer.valueOf(i2), timeline};
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 585424467, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -585424436);
    }

    private static final void MediaMetadataCompat(getAnswerMap getanswermap, Object obj) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -1848523201, new Object[]{getanswermap, obj}, iWrite3, iWrite2, 1848523230);
    }

    private static final getShowPopup RemoteActionCompatParcelizer(fromStyleLine fromstyleline, boolean z, Boolean bool) {
        Object[] objArr = {fromstyleline, Boolean.valueOf(z), bool};
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        return (getShowPopup) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 1632515751, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -1632515745);
    }

    private static final void RatingCompat(getAnswerMap getanswermap, Object obj) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 2039631126, new Object[]{getanswermap, obj}, iWrite3, iWrite2, -2039631104);
    }

    private final void IconCompatParcelizer(boolean z, boolean z2) {
        Object[] objArr = {this, Boolean.valueOf(z), Boolean.valueOf(z2)};
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -15182303, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, 15182321);
    }

    private final void addMenuProvider() {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 55382807, new Object[]{this}, iWrite3, iWrite2, -55382783);
    }

    private final void RemoteActionCompatParcelizer(boolean z, boolean z2) {
        Object[] objArr = {this, Boolean.valueOf(z), Boolean.valueOf(z2)};
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 1849153394, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -1849153369);
    }

    public final IconCompatParcelizer MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        return (IconCompatParcelizer) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -2081535384, new Object[]{this}, iWrite3, iWrite2, 2081535412);
    }

    public final float onAddQueueItem() {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        return ((Float) write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -991587359, new Object[]{this}, iWrite3, iWrite2, 991587363)).floatValue();
    }

    public final void onPause() {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -658448674, new Object[]{this}, iWrite3, iWrite2, 658448693);
    }

    public final void onPrepareFromMediaId() {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 953389748, new Object[]{this}, iWrite3, iWrite2, -953389709);
    }

    public final void onRewind() {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -664498931, new Object[]{this}, iWrite3, iWrite2, 664498931);
    }

    private void addOnMultiWindowModeChangedListener() {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 659417572, new Object[]{this}, iWrite3, iWrite2, -659417567);
    }

    private void addOnPictureInPictureModeChangedListener() {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 541174392, new Object[]{this}, iWrite3, iWrite2, -541174376);
    }

    public final void onPrepareFromUri() {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -746018476, new Object[]{this}, iWrite3, iWrite2, 746018478);
    }

    public final void onSetShuffleMode() {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -2094602083, new Object[]{this}, iWrite3, iWrite2, 2094602110);
    }

    public final void onSetPlaybackSpeed() {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 1294042990, new Object[]{this}, iWrite3, iWrite2, -1294042987);
    }

    @Override // o.parseAlignment.IconCompatParcelizer
    public final void RemoteActionCompatParcelizer(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -186734645, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, 186734687);
    }

    public final void MediaSessionCompatToken() {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 770039839, new Object[]{this}, iWrite3, iWrite2, -770039807);
    }

    public final void AudioAttributesCompatParcelizer(LessonTabItem<?> lessonTabItem) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -904311476, new Object[]{this, lessonTabItem}, iWrite3, iWrite2, 904311517);
    }

    public final void PlaybackStateCompat() {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 1558954021, new Object[]{this}, iWrite3, iWrite2, -1558953985);
    }

    public final void ParcelableVolumeInfo() {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 667122472, new Object[]{this}, iWrite3, iWrite2, -667122452);
    }

    public final void write(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 1721202249, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -1721202239);
    }

    public final void MediaBrowserCompatItemReceiver(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 555181817, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -555181802);
    }

    public final void r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -1924333117, new Object[]{this}, iWrite3, iWrite2, 1924333151);
    }

    private void AudioAttributesImplBaseParcelizer(boolean z) {
        Object[] objArr = {this, Boolean.valueOf(z)};
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 1446814096, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -1446814063);
    }

    public final void RemoteActionCompatParcelizer(RtspMediaTrack rtspMediaTrack) {
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
        write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 1289497580, new Object[]{this, rtspMediaTrack}, iWrite3, iWrite2, -1289497568);
    }

    static void r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() {
        addObserverForBackInvoker = new char[]{45015, 44861, 44851, 44855, 44845, 44834, 44851, 44854, 44873, 44876, 44860, 44826, 44842, 44875, 44820, 44819, 44860, 44854, 44874, 44849, 44851, 44861, 45033, 44852, 44852, 44876, 44867, 44889, 44891, 44868, 44870, 44866, 44865, 44867, 44865, 44894, 44869, 44990, 45036, 44995, 45005, 45026, 45050, 44997, 44989, 45016, 45025, 45028, 45029, 45029, 45028, 45052, 45036, 45012, 45031, 45025, 45033, 45032, 45032, 45037, 45027, 45025, 45050, 44989, 45028, 45030, 45028, 45024, 45032, 45036, 45024, 45028, 45050, 45010, 45008, 45051, 45027, 45025, 45048, 45049, 45030, 45017, 44840, 44834, 44834, 44814, 44800, 44841, 44846, 44845, 44813, 45047, 44841, 44857, 44858, 44835, 44844, 44989, 45051, 45028, 45028, 45052, 45034, 45022, 45024, 45031, 45023, 45011, 45027, 45038, 45037, 45036, 45038, 44946, 44987, 44990, 44989, 44989, 44991, 44998, 44996, 44988, 44991, 44984, 44987, 44991, 44999, 45032, 44993, 44993, 45032, 45035, 45032, 45038, 45039, 44992, 44995, 45032, 44995, 44992, 44998, 44990, 44988, 44999, 44998, 44998, 44999, 44991, 44992, 45032, 44992, 44991, 44996, 44996, 44991, 44984, 44991, 44991, 44985, 44999, 44999, 44990, 44993, 44996, 44997, 45039, 44996, 44996, 44993, 44993, 44992, 44985, 44999, 44999, 44988, 44991, 44990};
    }

    private static /* synthetic */ Object write(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 29;
        accessonBackPresseds1027565324 = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupMediaMetadataCompat = MediaMetadataCompat(str);
        int i4 = addObserverForBackInvokerlambda7 + 117;
        accessonBackPresseds1027565324 = i4 % 128;
        if (i4 % 2 == 0) {
            return getshowpopupMediaMetadataCompat;
        }
        throw null;
    }

    private static /* synthetic */ Object MediaBrowserCompatItemReceiver(Object[] objArr) {
        String str = (String) objArr[0];
        int i = 2 % 2;
        int i2 = accessonBackPresseds1027565324 + 55;
        addObserverForBackInvokerlambda7 = i2 % 128;
        if (i2 % 2 != 0) {
            return MediaBrowserCompatCustomActionResultReceiver(str);
        }
        MediaBrowserCompatCustomActionResultReceiver(str);
        throw null;
    }

    private static /* synthetic */ Object onSetRating(Object[] objArr) {
        fromStyleLine fromstyleline = (fromStyleLine) objArr[0];
        Throwable th = (Throwable) objArr[1];
        int i = 2 % 2;
        int i2 = addObserverForBackInvokerlambda7 + 17;
        accessonBackPresseds1027565324 = i2 % 128;
        if (i2 % 2 == 0) {
            return AudioAttributesImplApi21Parcelizer(fromstyleline, th);
        }
        AudioAttributesImplApi21Parcelizer(fromstyleline, th);
        throw null;
    }
}
