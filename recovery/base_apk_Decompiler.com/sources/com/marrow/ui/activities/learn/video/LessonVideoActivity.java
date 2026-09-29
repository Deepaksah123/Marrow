package com.marrow.ui.activities.learn.video;

import android.app.Activity;
import android.app.Application;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.media.AudioTrack;
import android.os.Bundle;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.text.style.ImageSpan;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.animation.LinearInterpolator;
import android.widget.Button;
import android.widget.ExpandableListView;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.transition.ChangeBounds;
import com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda4;
import com.google.android.exoplayer2.upstream.CmcdHeadersFactory;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSource;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.marrow.R;
import com.marrow.TrainingApplication;
import com.marrow.data.models.common.CourseConfigKeyConstantsKt;
import com.marrow.data.models.content.VideoInfo;
import com.marrow.data.models.lesson.LessonIndex;
import com.marrow.data.models.lesson.tab.LessonTabItem;
import com.marrow.data.models.video.DownloadableResolution;
import com.marrow.data.models.video.PixelInfo;
import com.marrow.data.models.video.cache.VideoCacheInfo;
import com.marrow.di.app.data.video.FileProviderModule;
import com.marrow.ui.activities.learn.video.LessonVideoActivity;
import com.marrow.ui.activities.plan.PlanActivity;
import com.marrow.ui.dialogs.LessonCompletedDialog;
import com.marrow.ui.fragments.learn.model.ActiveRecallQbankLessonUiModel;
import com.marrow.ui.views.CustomButton;
import com.marrow2.core.services.video_download.VideoDownloadFGService;
import com.marrow2.ui.qbank.score.model.RevisionSubjectUIModel;
import com.marrow2.ui.video.downloaded_videos.model.MaxDownloadReachedArgs;
import in.juspay.hyper.constants.LogCategory;
import java.io.File;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import kotlin.Cea608DecoderCueBuilder;
import kotlin.Cea708Decoder;
import kotlin.CmcdConfigurationRequestConfig;
import kotlin.CmcdHeadersFactory1;
import kotlin.DataSourceBitmapLoaderExternalSyntheticLambda1;
import kotlin.DefaultTrackSelectorExternalSyntheticLambda6;
import kotlin.HlsTrackMetadataEntry1;
import kotlin.IntermediateLoginResponseBody;
import kotlin.InvalidTypeIdException;
import kotlin.MagicModuleRepositoryImplExternalSyntheticLambda0;
import kotlin.Metadata;
import kotlin.NavigationBarViewSavedState;
import kotlin.OnFailureListener;
import kotlin.Pair;
import kotlin.PgsDecoder;
import kotlin.PlayerControlViewExternalSyntheticLambda1;
import kotlin.ReferenceTypeDeserializer;
import kotlin.RenewEligibleCreator;
import kotlin.ResolvableApiException;
import kotlin.RtspHeadersBuilder;
import kotlin.RtspMediaTrack;
import kotlin.SessionDescriptionParser;
import kotlin.Slider;
import kotlin.StandardIntegrityVerdictOptOut;
import kotlin.SubtitleDecoderFactory1;
import kotlin.TestGroupLSModel;
import kotlin.WebvttParserUtil;
import kotlin.WebvttSubtitle;
import kotlin._doAddInjectable;
import kotlin._getIndexResolver;
import kotlin._init_lambda4;
import kotlin._verifyEndArrayForSingle;
import kotlin.af;
import kotlin.areRendererDisabledFlagsEqual;
import kotlin.argCount;
import kotlin.backspace;
import kotlin.buildCurrentLine;
import kotlin.buildFormat;
import kotlin.buildResolutionString;
import kotlin.buildResumeDownloadsIntent;
import kotlin.canceledPendingResult;
import kotlin.clearDownloadManagerHelpers;
import kotlin.dispatchTouchEvent;
import kotlin.downloadMagicModuleMetalambda0;
import kotlin.finalizeCurrentPacket;
import kotlin.findFormatOverrides;
import kotlin.findNameForMutator;
import kotlin.formatsMatch;
import kotlin.fromStyleLine;
import kotlin.getAnswerMap;
import kotlin.getCause;
import kotlin.getColorInfoString;
import kotlin.getCreatedOnDateMs;
import kotlin.getDefaultViewModelCreationExtras;
import kotlin.getLatestBitrateEstimate;
import kotlin.getMagicModuleMeta;
import kotlin.getMagicModuleTimeline;
import kotlin.getNextEvent;
import kotlin.getOnline;
import kotlin.getProvider;
import kotlin.getQues;
import kotlin.getRetryPredicate;
import kotlin.getRoleFlagMatchScore;
import kotlin.getShowPopup;
import kotlin.getTokenExpiration;
import kotlin.getTrackGroup;
import kotlin.handlePreambleAddressCode;
import kotlin.invokeSuspend;
import kotlin.isCompatibleForAdaptationWith;
import kotlin.isDolbyAudio;
import kotlin.isExtendedWestEuropeanChar;
import kotlin.isResolutionNotSupported;
import kotlin.isSeekPending;
import kotlin.isSpecialNorthAmericanChar;
import kotlin.isXdsControlCode;
import kotlin.maybeInvalidateForRendererCapabilitiesChange;
import kotlin.maybeSkipComment;
import kotlin.maybeSkipWhitespace;
import kotlin.maybeUpdateIsInCaptionService;
import kotlin.normalizeUndeterminedLanguageToNull;
import kotlin.onMeasure;
import kotlin.onPageFinished;
import kotlin.parseAlignment;
import kotlin.parseIdentifierSection;
import kotlin.parseRangedUrl;
import kotlin.parseTrackTiming;
import kotlin.r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk;
import kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
import kotlin.r8lambdaeUjbdMLtxuENSTQFzrQsjYjNrI;
import kotlin.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;
import kotlin.rendererSupportsTunneling;
import kotlin.reportWithProductId;
import kotlin.requestPlayPauseAccessibilityFocus;
import kotlin.selectTracksForType;
import kotlin.setAction;
import kotlin.setBitrateKbps;
import kotlin.setCaptionRowCount;
import kotlin.setItalicSpan;
import kotlin.setResultCallback;
import kotlin.setSdkPayload;
import kotlin.setSessionInfo;
import kotlin.setSmallestDisplacement;
import kotlin.setThumbRadius;
import kotlin.setTokenBinding;
import kotlin.setViewportSizeToPhysicalDisplaySize;
import kotlin.skipComment;
import kotlin.startForeground;
import kotlin.toMagicModuleMetaDataUcModel;
import kotlin.toMagicModuleMetaRepoModel;
import kotlin.toMagicModuleStatusUcModel;
import kotlin.updateLoadingFinished;
import kotlin.updateNavigation;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.apache.commons.compress.archivers.zip.UnixStat;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000ú\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b0\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000 <2\b\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b:\u0002\u0018<B\u0007¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u000f\u0010\u001a\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u001a\u0010\nJ\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0010H\u0002¢\u0006\u0004\b \u0010\nJ\u0017\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u001b\u0010\u0015J\u000f\u0010!\u001a\u00020\u0010H\u0016¢\u0006\u0004\b!\u0010\nJ\u000f\u0010\"\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\"\u0010\nJ\u0019\u0010#\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b#\u0010\u0012J\u0019\u0010%\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010$H\u0016¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0010H\u0016¢\u0006\u0004\b'\u0010\nJ\u000f\u0010(\u001a\u00020\u0010H\u0016¢\u0006\u0004\b(\u0010\nJ\u000f\u0010*\u001a\u00020)H\u0016¢\u0006\u0004\b*\u0010+J/\u0010%\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020\u00132\u0006\u0010/\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u00100J!\u00102\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020)2\b\u0010-\u001a\u0004\u0018\u000101H\u0016¢\u0006\u0004\b2\u00103J\u0017\u0010%\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010\u0015J\u0017\u00104\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020)H\u0016¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0010H\u0016¢\u0006\u0004\b6\u0010\nJ\u000f\u00107\u001a\u00020\u0010H\u0016¢\u0006\u0004\b7\u0010\nJ\u000f\u00108\u001a\u00020\u0010H\u0016¢\u0006\u0004\b8\u0010\nJ\u000f\u00109\u001a\u00020\u0010H\u0016¢\u0006\u0004\b9\u0010\nJ\u000f\u0010:\u001a\u00020\u0010H\u0016¢\u0006\u0004\b:\u0010\nJ\u0017\u0010;\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013H\u0016¢\u0006\u0004\b;\u0010\u0015J\u0017\u0010<\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b<\u0010\u0012J\u001f\u0010<\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020=2\u0006\u0010-\u001a\u00020\u0013H\u0002¢\u0006\u0004\b<\u0010>J!\u0010<\u001a\u0004\u0018\u00010?2\u0006\u0010\u000f\u001a\u00020=2\u0006\u0010-\u001a\u00020)H\u0002¢\u0006\u0004\b<\u0010@J\u000f\u0010A\u001a\u00020\u0010H\u0016¢\u0006\u0004\bA\u0010\nJ\u000f\u0010B\u001a\u00020\u0010H\u0016¢\u0006\u0004\bB\u0010\nJ\u000f\u0010C\u001a\u00020\u0010H\u0016¢\u0006\u0004\bC\u0010\nJ\u0017\u0010<\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b<\u0010\u001cJ\u0019\u00104\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010DH\u0016¢\u0006\u0004\b4\u0010EJ\u0017\u0010;\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020)H\u0016¢\u0006\u0004\b;\u00105J\u0019\u00104\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b4\u0010\u0012J\u0017\u0010F\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bF\u0010\u001cJ\u000f\u0010G\u001a\u00020\u0010H\u0002¢\u0006\u0004\bG\u0010\nJ\u000f\u0010H\u001a\u00020\u0010H\u0002¢\u0006\u0004\bH\u0010\nJ\u0017\u0010J\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020IH\u0016¢\u0006\u0004\bJ\u0010KJ\u000f\u0010L\u001a\u00020\u0010H\u0002¢\u0006\u0004\bL\u0010\nJ\u0017\u0010M\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020)H\u0002¢\u0006\u0004\bM\u00105J\u000f\u0010N\u001a\u00020\u000bH\u0016¢\u0006\u0004\bN\u0010\rJ\u000f\u0010O\u001a\u00020\u0010H\u0002¢\u0006\u0004\bO\u0010\nJ\u0017\u0010P\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013H\u0002¢\u0006\u0004\bP\u0010\u0015J\u000f\u0010Q\u001a\u00020)H\u0002¢\u0006\u0004\bQ\u0010+J\u000f\u0010\u0014\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0014\u0010\rJ\u000f\u0010R\u001a\u00020\u0010H\u0016¢\u0006\u0004\bR\u0010\nJ\u000f\u0010S\u001a\u00020\u0010H\u0002¢\u0006\u0004\bS\u0010\nJ\u000f\u0010T\u001a\u00020\u0010H\u0002¢\u0006\u0004\bT\u0010\nJ\u000f\u0010U\u001a\u00020\u0010H\u0016¢\u0006\u0004\bU\u0010\nJ\u0017\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020W\u0018\u00010VH\u0016¢\u0006\u0004\b\u001b\u0010XJ\u0017\u0010Y\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013H\u0016¢\u0006\u0004\bY\u0010\u0015J\u0017\u0010M\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013H\u0016¢\u0006\u0004\bM\u0010\u0015JK\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u000b2\u0006\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020Z2\u0010\u0010]\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\\0[2\b\u0010^\u001a\u0004\u0018\u00010\u0017H\u0016¢\u0006\u0004\b\u0016\u0010_J\u000f\u0010`\u001a\u00020\u0010H\u0016¢\u0006\u0004\b`\u0010\nJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\u0011\u0010\nJ\u000f\u0010a\u001a\u00020\u0010H\u0016¢\u0006\u0004\ba\u0010\nJ\u000f\u0010b\u001a\u00020\u0010H\u0016¢\u0006\u0004\bb\u0010\nJ\u000f\u0010c\u001a\u00020\u0010H\u0016¢\u0006\u0004\bc\u0010\nJ\u000f\u0010d\u001a\u00020\u0010H\u0016¢\u0006\u0004\bd\u0010\nJ\u001f\u00107\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020IH\u0016¢\u0006\u0004\b7\u0010eJ\u000f\u0010f\u001a\u00020\u0010H\u0016¢\u0006\u0004\bf\u0010\nJ\u000f\u0010g\u001a\u00020\u0010H\u0016¢\u0006\u0004\bg\u0010\nJ\u000f\u0010h\u001a\u00020\u0010H\u0016¢\u0006\u0004\bh\u0010\nJ\u000f\u0010i\u001a\u00020\u0010H\u0016¢\u0006\u0004\bi\u0010\nJ\u000f\u0010j\u001a\u00020\u0010H\u0016¢\u0006\u0004\bj\u0010\nJ3\u0010\u0018\u001a\u00020\u00102\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020k0[2\u0006\u0010-\u001a\u00020)2\f\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00130[H\u0016¢\u0006\u0004\b\u0018\u0010lJ\u000f\u0010m\u001a\u00020\u0010H\u0016¢\u0006\u0004\bm\u0010\nJ\u001f\u00104\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b4\u0010nJ\u000f\u0010o\u001a\u00020\u000bH\u0016¢\u0006\u0004\bo\u0010\rJ\u001f\u0010%\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b%\u0010nJ!\u0010<\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00132\b\u0010-\u001a\u0004\u0018\u00010,H\u0016¢\u0006\u0004\b<\u0010pJ)\u0010'\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020)2\u0006\u0010-\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010qH\u0016¢\u0006\u0004\b'\u0010rJ\u000f\u0010s\u001a\u00020\u0010H\u0014¢\u0006\u0004\bs\u0010\nJ\u001f\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0016\u0010nJ\u000f\u0010t\u001a\u00020\u0010H\u0016¢\u0006\u0004\bt\u0010\nJ\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020uH\u0016¢\u0006\u0004\b\u0016\u0010vJ\u000f\u0010w\u001a\u00020\u0010H\u0016¢\u0006\u0004\bw\u0010\nJ\u000f\u0010x\u001a\u00020\u0010H\u0016¢\u0006\u0004\bx\u0010\nJ\u000f\u0010y\u001a\u00020\u000bH\u0016¢\u0006\u0004\by\u0010\rJ\u000f\u0010{\u001a\u00020zH\u0016¢\u0006\u0004\b{\u0010|J\u000f\u0010}\u001a\u00020\u000bH\u0014¢\u0006\u0004\b}\u0010\rJ\u0017\u0010<\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020~H\u0016¢\u0006\u0004\b<\u0010\u007fJ\u0011\u0010\u0080\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u0080\u0001\u0010\nJ\u0011\u0010\u0081\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0081\u0001\u0010\rJ*\u0010%\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010-\u001a\u00020)2\b\u0010.\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0005\b%\u0010\u0082\u0001J\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020)H\u0016¢\u0006\u0004\b\u0018\u00105J\u0011\u0010\u0083\u0001\u001a\u00020)H\u0016¢\u0006\u0005\b\u0083\u0001\u0010+J\u0017\u00104\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b4\u0010\u001cJ\u0011\u0010\u0084\u0001\u001a\u00020\u0010H\u0014¢\u0006\u0005\b\u0084\u0001\u0010\nJ\u0011\u0010\u0085\u0001\u001a\u00020\u000bH\u0014¢\u0006\u0005\b\u0085\u0001\u0010\rJ\u000f\u0010J\u001a\u00020\u0010H\u0016¢\u0006\u0004\bJ\u0010\nJ2\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020\u00132\b\u0010/\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0005\b\u0016\u0010\u0086\u0001J\u0011\u0010\u0087\u0001\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0087\u0001\u0010\rJ\u0011\u0010\u0088\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u0088\u0001\u0010\nJ\u0011\u0010\u0089\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u0089\u0001\u0010\nJ\u0011\u0010\u008a\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u008a\u0001\u0010\nJ\u000f\u0010P\u001a\u00020\u0010H\u0016¢\u0006\u0004\bP\u0010\nJ\u0011\u0010\u008b\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u008b\u0001\u0010\nJ\u0011\u0010\u008c\u0001\u001a\u00020\u0010H\u0002¢\u0006\u0005\b\u008c\u0001\u0010\nJ\u0015\u00104\u001a\u00020\u0010*\u00030\u008d\u0001H\u0002¢\u0006\u0005\b4\u0010\u008e\u0001J\u0013\u0010\u0090\u0001\u001a\u00030\u008f\u0001H\u0002¢\u0006\u0006\b\u0090\u0001\u0010\u0091\u0001J\u0011\u0010\u0092\u0001\u001a\u00020)H\u0002¢\u0006\u0005\b\u0092\u0001\u0010+J\u0011\u0010\u0093\u0001\u001a\u00020)H\u0002¢\u0006\u0005\b\u0093\u0001\u0010+J\u0011\u0010\u0094\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b\u0094\u0001\u0010\nJ\u0011\u0010\u0095\u0001\u001a\u00020\u0010H\u0002¢\u0006\u0005\b\u0095\u0001\u0010\nJ\u0011\u0010\u0096\u0001\u001a\u00020\u0010H\u0002¢\u0006\u0005\b\u0096\u0001\u0010\nJ\u0017\u0010%\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b%\u0010\u001cJ2\u0010%\u001a\u00020\u00102\u0007\u0010\u000f\u001a\u00030\u008f\u00012\u0006\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020)2\u0007\u0010/\u001a\u00030\u0097\u0001H\u0016¢\u0006\u0005\b%\u0010\u0098\u0001J\u0011\u0010\u0099\u0001\u001a\u00020\u0010H\u0002¢\u0006\u0005\b\u0099\u0001\u0010\nJ\"\u0010\u0016\u001a\u00020\u00102\u0007\u0010\u000f\u001a\u00030\u009a\u00012\u0007\u0010-\u001a\u00030\u009a\u0001H\u0002¢\u0006\u0005\b\u0016\u0010\u009b\u0001J\u0019\u0010%\u001a\u00020\u00102\u0007\u0010\u000f\u001a\u00030\u009a\u0001H\u0002¢\u0006\u0005\b%\u0010\u009c\u0001J\u0011\u0010\u009d\u0001\u001a\u00020\u0010H\u0002¢\u0006\u0005\b\u009d\u0001\u0010\nJ\u0011\u0010\u009e\u0001\u001a\u00020\u0010H\u0002¢\u0006\u0005\b\u009e\u0001\u0010\nJ\u0011\u0010\u009f\u0001\u001a\u00020\u0010H\u0002¢\u0006\u0005\b\u009f\u0001\u0010\nJ\u0017\u0010M\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0004\bM\u0010\u001cJ\u0019\u0010 \u0001\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0002¢\u0006\u0005\b \u0001\u0010\nJ\u0019\u0010\u0018\u001a\u00020\u00102\u0007\u0010\u000f\u001a\u00030\u009a\u0001H\u0002¢\u0006\u0005\b\u0018\u0010\u009c\u0001J)\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020)2\u0006\u0010-\u001a\u00020)2\u0007\u0010.\u001a\u00030\u0097\u0001H\u0016¢\u0006\u0005\b\u0016\u0010¡\u0001J*\u0010\u0018\u001a\u00020\u00102\u0007\u0010\u000f\u001a\u00030\u009a\u00012\u0007\u0010-\u001a\u00030\u009a\u00012\u0006\u0010.\u001a\u00020\u000bH\u0002¢\u0006\u0005\b\u0018\u0010¢\u0001J\u0011\u0010£\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b£\u0001\u0010\nJ\u0011\u0010¤\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b¤\u0001\u0010\nJ\u0019\u0010¥\u0001\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0005\b¥\u0001\u0010\u001cJ \u00104\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020)2\u0006\u0010-\u001a\u00020\u0013H\u0016¢\u0006\u0005\b4\u0010¦\u0001J\u0011\u0010§\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b§\u0001\u0010\nJ\u0011\u0010¨\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b¨\u0001\u0010\nJ\u0011\u0010©\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b©\u0001\u0010\nJ'\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u00132\u0006\u0010.\u001a\u00020)H\u0016¢\u0006\u0004\b\u0018\u0010nJ\u0011\u0010ª\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bª\u0001\u0010\nJ\u0011\u0010«\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b«\u0001\u0010\nJ\u0011\u0010¬\u0001\u001a\u00020\u0010H\u0014¢\u0006\u0005\b¬\u0001\u0010\nJ!\u0010<\u001a\u00020\u00102\u0007\u0010\u000f\u001a\u00030\u009a\u00012\u0006\u0010-\u001a\u00020)H\u0016¢\u0006\u0005\b<\u0010\u00ad\u0001J\u0017\u0010;\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b;\u0010\u001cJ\u0017\u0010F\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013H\u0016¢\u0006\u0004\bF\u0010\u0015J\u0011\u0010®\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b®\u0001\u0010\nJ\u0019\u0010¯\u0001\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0013H\u0016¢\u0006\u0005\b¯\u0001\u0010\u0015J\u0011\u0010°\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b°\u0001\u0010\nJ \u00104\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000b2\u0006\u0010-\u001a\u00020)H\u0016¢\u0006\u0005\b4\u0010±\u0001J\u0011\u0010²\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b²\u0001\u0010\nJ\u0011\u0010³\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b³\u0001\u0010\nJ\u0017\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u0018\u0010\u001cJ\u0011\u0010´\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b´\u0001\u0010\rJ\u0011\u0010µ\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bµ\u0001\u0010\nJ \u0010<\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010-\u001a\u00020\u000bH\u0016¢\u0006\u0005\b<\u0010¶\u0001J\u0017\u0010Y\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020)H\u0016¢\u0006\u0004\bY\u00105J\u0011\u0010·\u0001\u001a\u00020\u0010H\u0002¢\u0006\u0005\b·\u0001\u0010\nJ\u0011\u0010¸\u0001\u001a\u00020\u0010H\u0002¢\u0006\u0005\b¸\u0001\u0010\nJ\u0011\u0010¹\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b¹\u0001\u0010\nJ\u0011\u0010º\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bº\u0001\u0010\nJ\u0011\u0010»\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b»\u0001\u0010\rJ\u0011\u0010¼\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\b¼\u0001\u0010\rJ\u0011\u0010½\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b½\u0001\u0010\nJ \u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010-\u001a\u00020)H\u0016¢\u0006\u0005\b\u0018\u0010¾\u0001J\u0017\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020)H\u0016¢\u0006\u0004\b\u0016\u00105J\u0011\u0010¿\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\b¿\u0001\u0010\nJ\u0011\u0010À\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bÀ\u0001\u0010\nJ\u0011\u0010Á\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bÁ\u0001\u0010\nJ\u0011\u0010Â\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bÂ\u0001\u0010\nJ\u0011\u0010Ã\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bÃ\u0001\u0010\nJ\u0011\u0010Ä\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bÄ\u0001\u0010\nJ \u0010\u0018\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020)2\u0006\u0010-\u001a\u00020\u000bH\u0016¢\u0006\u0005\b\u0018\u0010Å\u0001J!\u0010%\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00132\u0007\u0010-\u001a\u00030\u009a\u0001H\u0016¢\u0006\u0005\b%\u0010Æ\u0001J\u001c\u00104\u001a\u00020\u00102\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\\H\u0016¢\u0006\u0005\b4\u0010Ç\u0001J\u0011\u0010È\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bÈ\u0001\u0010\nJ\u0011\u0010É\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bÉ\u0001\u0010\nJ\u0017\u0010F\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020)H\u0016¢\u0006\u0004\bF\u00105J\u0011\u0010Ê\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bÊ\u0001\u0010\nJ\u0019\u00104\u001a\u00020\u00102\u0007\u0010\u000f\u001a\u00030Ë\u0001H\u0016¢\u0006\u0005\b4\u0010Ì\u0001J8\u0010<\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u00132\u0006\u0010-\u001a\u00020)2\u0006\u0010.\u001a\u00020)2\u0006\u0010/\u001a\u00020)2\u0006\u0010]\u001a\u00020)H\u0016¢\u0006\u0005\b<\u0010Í\u0001J\u0011\u0010Î\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bÎ\u0001\u0010\nJ\u0011\u0010Ï\u0001\u001a\u00020\u000bH\u0016¢\u0006\u0005\bÏ\u0001\u0010\rJ\u0011\u0010Ð\u0001\u001a\u00020\u0010H\u0016¢\u0006\u0005\bÐ\u0001\u0010\nJ\u001a\u0010Ð\u0001\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020qH\u0014¢\u0006\u0006\bÐ\u0001\u0010Ñ\u0001R \u0010\u0016\u001a\u00030Ò\u00018CX\u0082\u0084\u0002¢\u0006\u0010\n\u0006\bÓ\u0001\u0010Ô\u0001\u001a\u0006\bÕ\u0001\u0010Ö\u0001R\u0018\u0010%\u001a\u00030×\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\u001e\u0010Ø\u0001R\u0018\u00104\u001a\u00030Ù\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b{\u0010Ú\u0001R\u001a\u0010\u0018\u001a\u0005\u0018\u00010Û\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bc\u0010Ü\u0001R\u001b\u0010<\u001a\u0005\u0018\u00010Ý\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bÞ\u0001\u0010ß\u0001R\u0018\u0010M\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b°\u0001\u0010à\u0001R\u0018\u0010\u001b\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b\u0083\u0001\u0010à\u0001R\u0018\u0010;\u001a\u00020\u00138\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bá\u0001\u0010â\u0001R\u0018\u0010Y\u001a\u00020)8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bã\u0001\u0010ä\u0001R\u0018\u0010F\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b³\u0001\u0010à\u0001R\u0019\u0010å\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bº\u0001\u0010à\u0001R\u0019\u0010Ó\u0001\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\b¯\u0001\u0010à\u0001R\u001a\u0010¯\u0001\u001a\u00030\u009a\u00018C@\u0002X\u0082\u000e¢\u0006\b\u001a\u0006\bæ\u0001\u0010ç\u0001R\u0019\u0010\u0014\u001a\u00030\u009a\u00018C@\u0002X\u0082\u000e¢\u0006\b\u001a\u0006\bè\u0001\u0010ç\u0001R\u001c\u0010á\u0001\u001a\u0005\u0018\u00010é\u00018\u0002@\u0002X\u0083\u000e¢\u0006\b\n\u0006\bê\u0001\u0010ë\u0001R\u001a\u0010\u001e\u001a\u0005\u0018\u00010ì\u00018\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\b\f\u0010í\u0001R\u0017\u0010\"\u001a\u00020\u000b8\u0002@\u0002X\u0083\u000e¢\u0006\u0007\n\u0005\bh\u0010à\u0001R\u001d\u0010*\u001a\t\u0012\u0004\u0012\u00020q0î\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\b®\u0001\u0010ï\u0001R\u0017\u0010P\u001a\u00030ð\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0006\bå\u0001\u0010ñ\u0001R*\u0010ó\u0001\u001a\u00030ò\u00018\u0007@\u0007X\u0087.¢\u0006\u0018\n\u0006\bó\u0001\u0010ô\u0001\u001a\u0006\bõ\u0001\u0010ö\u0001\"\u0006\b÷\u0001\u0010ø\u0001R\u0017\u0010û\u0001\u001a\u00030ù\u00018\u0006X\u0087\u0004¢\u0006\u0007\n\u0005\bd\u0010ú\u0001R\u0017\u0010h\u001a\u00030ü\u00018\u0006X\u0087\u0004¢\u0006\b\n\u0006\bý\u0001\u0010þ\u0001R\u0016\u0010°\u0001\u001a\u00020)8\u0002X\u0083D¢\u0006\u0007\n\u0005\b\u001b\u0010ä\u0001R\u0016\u0010³\u0001\u001a\u00020)8\u0002X\u0083D¢\u0006\u0007\n\u0005\b%\u0010ä\u0001R\u0017\u0010ã\u0001\u001a\u00030ÿ\u00018\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\bP\u0010\u0080\u0002R\u0018\u0010º\u0001\u001a\u00030\u0081\u00028\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0082\u0002\u0010\u0083\u0002R\u0016\u0010c\u001a\u00030\u0081\u00028\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010\u0083\u0002R\u0017\u0010d\u001a\u00030\u0084\u00028\u0002X\u0083\u0004¢\u0006\b\n\u0006\b\u0085\u0002\u0010\u0086\u0002R\u0018\u0010\u0083\u0001\u001a\u00030\u0087\u00028\u0002X\u0083\u0004¢\u0006\b\n\u0006\bû\u0001\u0010\u0088\u0002R\u0016\u0010{\u001a\u00030\u0089\u00028\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b\"\u0010\u008a\u0002R\u0017\u0010®\u0001\u001a\u00030\u008b\u00028\u0002X\u0083\u0004¢\u0006\u0007\n\u0005\b*\u0010\u008c\u0002"}, d2 = {"Lcom/marrow/ui/activities/learn/video/LessonVideoActivity;", "Lcom/marrow/kt/base/BaseDaggerActivity;", "Lo/fromStyleLine;", "Lo/parseAlignment$write;", "Lo/parseAlignment$AudioAttributesCompatParcelizer;", "Lo/parseAlignment$RemoteActionCompatParcelizer;", "Lo/DefaultTrackSelectorExternalSyntheticLambda6$read;", "Lcom/marrow/ui/dialogs/LessonCompletedDialog$read;", "Lo/setViewportSizeToPhysicalDisplaySize$read;", "<init>", "()V", "", "onSetCaptioningEnabled", "()Z", "Landroid/os/Bundle;", "p0", "", "onCreate", "(Landroid/os/Bundle;)V", "", "RatingCompat", "(Ljava/lang/String;)V", "IconCompatParcelizer", "Lcom/marrow/ui/fragments/learn/model/ActiveRecallQbankLessonUiModel;", "read", "(Lcom/marrow/ui/fragments/learn/model/ActiveRecallQbankLessonUiModel;)V", "MediaSessionCompatToken", "MediaBrowserCompatCustomActionResultReceiver", "(Z)V", "Lo/NavigationBarViewSavedState;", "onAddQueueItem", "()Lo/NavigationBarViewSavedState;", "handleOnBackProgressed", "accessensureViewModelStore", "onCustomAction", "onPostCreate", "Lo/RtspMediaTrack;", "write", "(Lo/RtspMediaTrack;)V", "onActivityResult", "registerForActivityResult", "", "handleMediaPlayPauseIfPendingOnHandler", "()I", "Lcom/marrow/data/models/content/VideoInfo;", "p1", "p2", "p3", "(Lcom/marrow/data/models/content/VideoInfo;Ljava/lang/String;Ljava/lang/String;Z)V", "Landroid/view/KeyEvent;", "onKeyUp", "(ILandroid/view/KeyEvent;)Z", "AudioAttributesCompatParcelizer", "(I)V", "r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw", "onPictureInPictureModeChanged", "getSavedStateRegistryControllerannotations", "r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM", "removeMenuProvider", "MediaBrowserCompatItemReceiver", "RemoteActionCompatParcelizer", "Landroid/widget/TextView;", "(Landroid/widget/TextView;Ljava/lang/String;)V", "Landroid/graphics/drawable/Drawable;", "(Landroid/widget/TextView;I)Landroid/graphics/drawable/Drawable;", "onCreatePanelMenu", "createFullyDrawnExecutor", "onMultiWindowModeChanged", "Lcom/marrow/data/models/lesson/LessonIndex;", "(Lcom/marrow/data/models/lesson/LessonIndex;)V", "AudioAttributesImplApi26Parcelizer", "setPositiveButton", "create", "Landroid/content/res/Configuration;", "onConfigurationChanged", "(Landroid/content/res/Configuration;)V", "removeOnNewIntentListener", "AudioAttributesImplApi21Parcelizer", "_init_lambda2", "ActionBarLayoutParams", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "handleOnBackPressed", "onBackPressed", "removeOnTrimMemoryListener", "isEnabled", "addMenuProvider", "", "Lo/handlePreambleAddressCode;", "()[Lo/handlePreambleAddressCode;", "AudioAttributesImplBaseParcelizer", "Lo/SubtitleDecoderFactory1;", "", "Lcom/marrow/data/models/lesson/tab/LessonTabItem;", "p4", "p5", "(Ljava/lang/String;ZILo/SubtitleDecoderFactory1;Ljava/util/List;Lcom/marrow/ui/fragments/learn/model/ActiveRecallQbankLessonUiModel;)V", "MediaSessionCompatQueueItem", "accessgetReportFullyDrawnExecutorp", "onSaveInstanceState", "onPlayFromUri", "onPrepareFromSearch", "(ZLandroid/content/res/Configuration;)V", "finish", "onUserLeaveHint", "onFastForward", "onRequestPermissionsResult", "onPreparePanel", "Lcom/marrow/data/models/video/DownloadableResolution;", "(Ljava/util/List;ILjava/util/List;)V", "ParcelableVolumeInfo", "(Ljava/lang/String;Ljava/lang/String;)V", "r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8", "(Ljava/lang/String;Lcom/marrow/data/models/content/VideoInfo;)V", "Landroid/content/Intent;", "(IILandroid/content/Intent;)V", "onPostResume", "onMenuItemSelected", "Lcom/marrow2/ui/video/downloaded_videos/model/MaxDownloadReachedArgs;", "(Lcom/marrow2/ui/video/downloaded_videos/model/MaxDownloadReachedArgs;)V", "ensureViewModelStore", "addOnTrimMemoryListener", "r8lambdaKUbBm7ckfqTc9QCgukC86fguu4", "Lo/requestPlayPauseAccessibilityFocus$RemoteActionCompatParcelizer;", "onPrepareFromMediaId", "()Lo/requestPlayPauseAccessibilityFocus$RemoteActionCompatParcelizer;", "onSetShuffleMode", "Lcom/marrow/data/models/video/cache/VideoCacheInfo;", "(Lcom/marrow/data/models/video/cache/VideoCacheInfo;)Z", "addOnPictureInPictureModeChangedListener", "r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0", "(Ljava/lang/String;ILjava/lang/String;)V", "onPrepare", "onDestroy", "onSetPlaybackSpeed", "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;)V", "remove", "setHasDecor", "onPanelClosed", "ResultReceiver", "removeOnMultiWindowModeChangedListener", "IntentSenderRequest", "Lo/ReferenceTypeDeserializer;", "(Lo/ReferenceTypeDeserializer;)V", "Lo/maybeSkipWhitespace;", "handleOnBackCancelled", "()Lo/maybeSkipWhitespace;", "addCancellable", "setContentView", "addContentView", "getEnabledChangedCallbackactivity_release", "handleOnBackStarted", "Lo/maybeSkipComment;", "(Lo/maybeSkipWhitespace;IILo/maybeSkipComment;)V", "Keep", "", "(FF)V", "(F)V", "AlertControllerRecycleListView", "ActivityResult", "setEnabled", "getContext", "(IILo/maybeSkipComment;)V", "(FFZ)V", "addOnNewIntentListener", "addObserverForBackInvokerlambda7", "onWindowFocusChanged", "(ILjava/lang/String;)V", "removeOnConfigurationChangedListener", "onTrimMemory", "PlaybackStateCompatCustomAction", "onStart", "onResume", "onSkipToPrevious", "(FI)V", "onPlayFromSearch", "MediaBrowserCompatMediaItem", "onPlay", "(ZI)V", "removeOnContextAvailableListener", "onMediaButtonEvent", "r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28", "onSkipToNext", "(Ljava/lang/String;Z)V", "setEnabledChangedCallbackactivity_release", "removeCancellable", "addOnConfigurationChangedListener", "onPlayFromMediaId", "_init_lambda3", "_init_lambda5", "MediaSessionCompatResultReceiverWrapper", "(Ljava/lang/String;I)V", "addOnUserLeaveHintListener", "PlaybackStateCompat", "getOnBackPressedDispatcherannotations", "addOnContextAvailableListener", "menuHostHelperlambda0", "addOnMultiWindowModeChangedListener", "(IZ)V", "(Ljava/lang/String;F)V", "(Lcom/marrow/data/models/lesson/tab/LessonTabItem;)V", "accessonBackPresseds1027565324", "addObserverForBackInvoker", "accessaddObserverForBackInvoker", "Lcom/marrow2/ui/qbank/score/model/RevisionSubjectUIModel;", "(Lcom/marrow2/ui/qbank/score/model/RevisionSubjectUIModel;)V", "(Ljava/lang/String;IIII)V", "setSessionImpl", "_init_lambda4", "onNewIntent", "(Landroid/content/Intent;)V", "Lo/parseRangedUrl;", "MediaDescriptionCompat", "Lo/setSessionInfo;", "removeOnPictureInPictureModeChangedListener", "()Lo/parseRangedUrl;", "Lcom/marrow/ui/activities/learn/video/LessonVideoActivity$read;", "Lcom/marrow/ui/activities/learn/video/LessonVideoActivity$read;", "", "[I", "Landroid/app/PictureInPictureParams$Builder;", "Landroid/app/PictureInPictureParams$Builder;", "Lo/setViewportSizeToPhysicalDisplaySize;", "onPrepareFromUri", "Lo/setViewportSizeToPhysicalDisplaySize;", "Z", "MediaBrowserCompatSearchResultReceiver", "Ljava/lang/String;", "onPause", "I", "MediaMetadataCompat", "startIntentSenderForResult", "()F", "startActivityForResult", "Ljava/lang/Runnable;", "onRemoveQueueItemAt", "Ljava/lang/Runnable;", "Lo/findNameForMutator;", "Lo/findNameForMutator;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Lo/r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8;", "Lcom/marrow/ui/activities/learn/video/LessonVideoActivity$AudioAttributesCompatParcelizer;", "Lcom/marrow/ui/activities/learn/video/LessonVideoActivity$AudioAttributesCompatParcelizer;", "Lo/WebvttSubtitle;", "timelineAdapter", "Lo/WebvttSubtitle;", "getTimelineAdapter", "()Lo/WebvttSubtitle;", "setTimelineAdapter", "(Lo/WebvttSubtitle;)V", "Lo/skipComment$RemoteActionCompatParcelizer;", "Lo/skipComment$RemoteActionCompatParcelizer;", "onCommand", "Lo/getNextEvent;", "onSeekTo", "Lo/getNextEvent;", "Lo/setCaptionRowCount;", "Lo/setCaptionRowCount;", "Landroid/content/BroadcastReceiver;", "onRewind", "Landroid/content/BroadcastReceiver;", "Lo/Cea608DecoderCueBuilder;", "onRemoveQueueItem", "Lo/Cea608DecoderCueBuilder;", "Lo/isExtendedWestEuropeanChar;", "Lo/isExtendedWestEuropeanChar;", "Lo/Cea708Decoder;", "Lo/Cea708Decoder;", "Lo/isSpecialNorthAmericanChar;", "Lo/isSpecialNorthAmericanChar;"}, k = 1, mv = {2, 2, 0}, xi = 48)
public final class LessonVideoActivity extends parseIdentifierSection<fromStyleLine> implements parseAlignment.write, parseAlignment.AudioAttributesCompatParcelizer, parseAlignment.RemoteActionCompatParcelizer, DefaultTrackSelectorExternalSyntheticLambda6.read, LessonCompletedDialog.read, setViewportSizeToPhysicalDisplaySize.read {
    private static final int[] AudioAttributesCompatParcelizer;
    private static /* synthetic */ isResolutionNotSupported<Object>[] IconCompatParcelizer;
    private static int MediaSessionCompatResultReceiverWrapper;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    public static final Companion INSTANCE;
    private static int onSetPlaybackSpeed;
    private static byte[] onSetRating;
    private static int onSetRepeatMode;
    private static int onSetShuffleMode;
    private static int onSkipToPrevious;
    private static int onSkipToQueueItem;
    private static short[] onStop;
    private static final int[] read;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private final int onPlay;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private boolean MediaDescriptionCompat;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private final setCaptionRowCount onPause;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private final BroadcastReceiver onPlayFromUri;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private final isSpecialNorthAmericanChar onPlayFromSearch;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private final isExtendedWestEuropeanChar onPrepare;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private final Cea708Decoder onPrepareFromMediaId;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private boolean onCustomAction;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private int AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: onPlay, reason: from kotlin metadata */
    private boolean AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private boolean MediaMetadataCompat;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private PictureInPictureParams.Builder read;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private boolean MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private final skipComment.RemoteActionCompatParcelizer onCommand;

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private setViewportSizeToPhysicalDisplaySize RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from kotlin metadata */
    private final Cea608DecoderCueBuilder onPrepareFromSearch;

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
    private Runnable MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
    private final BroadcastReceiver onPlayFromMediaId;

    /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
    private final getNextEvent onFastForward;

    /* JADX INFO: renamed from: onSetCaptioningEnabled, reason: from kotlin metadata */
    private findNameForMutator onAddQueueItem;

    @setSdkPayload
    public WebvttSubtitle timelineAdapter;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private final int onMediaButtonEvent;
    private static final byte[] $$s = {TarConstants.LF_GNUTYPE_LONGLINK, 94, -43, -123};
    private static final int $$t = 140;
    private static int $10 = 0;
    private static int $11 = 1;
    private static final byte[] $$p = {37, -1, TarConstants.LF_CONTIG, -26, -15, -1, 60, -66, 9, -20, -3, 0, -11, 70, -41, -33, 14, -11, -8, 2, -8, 4, 35, -50, -3, 1, 0, 3, -1, -22, 8, -9, -2, -29, -15, -2, 40, -47, -1, -6, 12, -22, 33, -20, -20, 12, -5, -10, 0, -20, 18, -16, 62, -56, -5, -12, -9, 12, -16, 10, 1, -6, 62, -60, -1, -18, 47, -48, 8, -24, 82, -32, -55, 14, -8, -9, 43, -54, -3, -1, 6, 4, -22, -2, 12, -17, 39, -39, -6, 1, 39, -34, -21, 11, 18, -20, -20, 12, -5, -10, 0, -20, 18, -16, 2, 6, -14, 12, -22, -11, -5, -8, 12, 33, -37, -20, 8, -9, -2, 40, -47, -1, -6, 12, -22, 33, -20, -20, 12, -5, -10, 0, -20, 18, -16, -15, -1, 60, -60, -11, -3, 5, -8, 4, TarConstants.LF_BLK, -54, -16, 7, -17, 0, 3, 2, TarConstants.LF_CHR, -66, 9, -22, 12, -16, 6, 5, -14, 59, -73, 16, -4, -20, 66, -41, -16, -4, 19, -24, -27, 7, -9, -2, 77, -81, 10, 1, -6};
    private static final int $$q = 119;
    private static final byte[] $$g = {TarConstants.LF_GNUTYPE_LONGLINK, 94, -43, -123, -12, -3, 4, -4, -8, 12, -14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -47, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 27, 13, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -48, TarConstants.LF_CHR, -1, 2, -4, -1, -43, 35, 18, -10, 7, 0, -27, 20, 15, 3, -8, 9, -33, 20, -1, 3, 5, 14, -16, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 0, 32, 18, 18, -14, 3, 8, -2, 18, -20, 14, TarConstants.LF_DIR, -16, 6, 7, -45, TarConstants.LF_BLK, 1, -1, -8, -6, 20, 0, -14, 15, -41, 37, 4, -3, -42, TarConstants.LF_NORMAL, -6, -54, 5, 27, 18, 18, -14, 3, 8, -2, 18, -20, 14, 20, 9, 3, 6, -14, -35, 35, 18, -10, 7, 0, -42, 45, -1, 4, -14, 20, -35, 18, 18, -14, 3, 8, -2, 18, -20, 14, 25, 0, 6, -7, -30, TarConstants.LF_LINK, -2, 9, -3, -13, 14, -46, 45, -1, 4, -14, 20, -42, 44, -14, 9, -26, 20, -1, 3, 5, 14, -16, 14};
    private static final int $$h = 215;
    private static int onSkipToNext = 0;
    private static int setSessionImpl = 1;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private final setSessionInfo IconCompatParcelizer = parseTrackTiming.write(this, SessionDescriptionParser.RemoteActionCompatParcelizer(), new MediaDescriptionCompat());

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private read write = read.IconCompatParcelizer;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private int[] AudioAttributesCompatParcelizer = read;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private String MediaBrowserCompatItemReceiver = "";

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private final r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8<Intent> handleMediaPlayPauseIfPendingOnHandler = registerForActivityResult(new _init_lambda4.AudioAttributesImplApi26Parcelizer(), new r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() { // from class: o.addCuePlacerholderByTime
        @Override // kotlin.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM
        public final void IconCompatParcelizer(Object obj) {
            LessonVideoActivity.write(new Object[]{this.RemoteActionCompatParcelizer, (ActivityResult) obj}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1597455560, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1597455631);
        }
    });

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private final AudioAttributesCompatParcelizer MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = new AudioAttributesCompatParcelizer();

    public static final /* synthetic */ class write {
        public static final /* synthetic */ int[] RemoteActionCompatParcelizer;

        static {
            int[] iArr = new int[maybeSkipComment.values().length];
            try {
                iArr[maybeSkipComment.RemoteActionCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[maybeSkipComment.AudioAttributesCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[maybeSkipComment.write.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            RemoteActionCompatParcelizer = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0025  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0025 -> B:11:0x002c). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.lang.String $$u(short r6, short r7, byte r8) {
        /*
            int r6 = r6 * 4
            int r6 = r6 + 112
            byte[] r0 = com.marrow.ui.activities.learn.video.LessonVideoActivity.$$s
            int r8 = r8 * 3
            int r1 = 1 - r8
            int r7 = r7 * 2
            int r7 = 4 - r7
            byte[] r1 = new byte[r1]
            r2 = 0
            int r8 = 0 - r8
            if (r0 != 0) goto L19
            r6 = r7
            r4 = r8
            r3 = r2
            goto L2c
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L25
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            return r6
        L25:
            r4 = r0[r7]
            int r3 = r3 + 1
            r5 = r7
            r7 = r6
            r6 = r5
        L2c:
            int r4 = -r4
            int r7 = r7 + r4
            int r6 = r6 + 1
            r5 = r7
            r7 = r6
            r6 = r5
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.$$u(short, short, byte):java.lang.String");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001d  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0026 -> B:11:0x002d). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void i(byte r6, int r7, short r8, java.lang.Object[] r9) {
        /*
            int r7 = r7 + 4
            int r0 = r6 + 4
            byte[] r1 = com.marrow.ui.activities.learn.video.LessonVideoActivity.$$g
            int r8 = r8 + 65
            byte[] r0 = new byte[r0]
            int r6 = r6 + 3
            r2 = -1
            if (r1 != 0) goto L13
            r3 = r8
            r4 = r2
            r8 = r7
            goto L2d
        L13:
            r3 = r2
        L14:
            int r3 = r3 + 1
            int r7 = r7 + 1
            byte r4 = (byte) r8
            r0[r3] = r4
            if (r3 != r6) goto L26
            java.lang.String r6 = new java.lang.String
            r7 = 0
            r6.<init>(r0, r7)
            r9[r7] = r6
            return
        L26:
            r4 = r1[r7]
            r5 = r8
            r8 = r7
            r7 = r4
            r4 = r3
            r3 = r5
        L2d:
            int r3 = r3 + r7
            int r7 = r3 + (-1)
            r3 = r4
            r5 = r8
            r8 = r7
            r7 = r5
            goto L14
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.i(byte, int, short, java.lang.Object[]):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0024  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001c  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0024 -> B:11:0x0028). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void k(int r6, short r7, short r8, java.lang.Object[] r9) {
        /*
            int r6 = r6 + 4
            byte[] r0 = com.marrow.ui.activities.learn.video.LessonVideoActivity.$$p
            int r7 = r7 + 73
            int r1 = r8 + 4
            byte[] r1 = new byte[r1]
            int r8 = r8 + 3
            r2 = 0
            if (r0 != 0) goto L13
            r7 = r6
            r4 = r8
            r3 = r2
            goto L28
        L13:
            r3 = r2
            r5 = r7
            r7 = r6
            r6 = r5
        L17:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r8) goto L24
            java.lang.String r6 = new java.lang.String
            r6.<init>(r1, r2)
            r9[r2] = r6
            return
        L24:
            int r3 = r3 + 1
            r4 = r0[r7]
        L28:
            int r4 = -r4
            int r6 = r6 + r4
            int r6 = r6 + (-3)
            int r7 = r7 + 1
            goto L17
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.k(int, short, short, java.lang.Object[]):void");
    }

    public static /* synthetic */ Object write(Object[] objArr, int i, int i2, int i3, int i4, int i5, int i6) {
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16 = ~i6;
        int i17 = ~i3;
        int i18 = ~i;
        int i19 = (~(i17 | i18)) | i16;
        int i20 = ~(i17 | i6 | i);
        int i21 = (~(i | i6)) | (~(i16 | i18)) | i17;
        int i22 = i3 + i6 + i5 + (62936680 * i2) + ((-2032430997) * i4);
        int i23 = i22 * i22;
        int i24 = ((-476632153) * i3) + 797966336 + (1756943451 * i6) + (i19 * (-1030695846)) + ((-1030695846) * i20) + (1030695846 * i21) + ((-1507328000) * i5) + ((-264241152) * i2) + ((-222822400) * i4) + (2040594432 * i23);
        int i25 = ((i3 * 1175661207) - 43826732) + (i6 * 1175659659) + (i19 * (-774)) + (i20 * (-774)) + (i21 * 774) + (i5 * 1175660433) + (i2 * 1188219112) + (i4 * (-816965221)) + (i23 * 1798373376);
        switch (i24 + (i25 * i25 * 914292736)) {
            case 1:
                return IconCompatParcelizer(objArr);
            case 2:
                return read(objArr);
            case 3:
                return RemoteActionCompatParcelizer(objArr);
            case 4:
                return AudioAttributesImplApi26Parcelizer(objArr);
            case 5:
                return MediaBrowserCompatCustomActionResultReceiver(objArr);
            case 6:
                return AudioAttributesImplBaseParcelizer(objArr);
            case 7:
                return MediaBrowserCompatItemReceiver(objArr);
            case 8:
                return AudioAttributesImplApi21Parcelizer(objArr);
            case 9:
                return MediaMetadataCompat(objArr);
            case 10:
                return RatingCompat(objArr);
            case 11:
                return MediaBrowserCompatMediaItem(objArr);
            case 12:
                return MediaDescriptionCompat(objArr);
            case 13:
                return MediaBrowserCompatSearchResultReceiver(objArr);
            case 14:
                return onCommand(objArr);
            case 15:
                return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(objArr);
            case 16:
                return onCustomAction(objArr);
            case 17:
                return onAddQueueItem(objArr);
            case 18:
                return handleMediaPlayPauseIfPendingOnHandler(objArr);
            case 19:
                return onPlayFromMediaId(objArr);
            case 20:
                return onPause(objArr);
            case 21:
                return onMediaButtonEvent(objArr);
            case 22:
                return onFastForward(objArr);
            case 23:
                return onPlay(objArr);
            case 24:
                return onPrepareFromMediaId(objArr);
            case 25:
                return onPrepareFromSearch(objArr);
            case 26:
                return onPlayFromSearch(objArr);
            case 27:
                return onPrepare(objArr);
            case 28:
                return onPlayFromUri(objArr);
            case 29:
                return onSeekTo(objArr);
            case 30:
                return onRemoveQueueItem(objArr);
            case 31:
                return onRemoveQueueItemAt(objArr);
            case 32:
                return onRewind(objArr);
            case 33:
                return onPrepareFromUri(objArr);
            case 34:
                return onSetRating(objArr);
            case 35:
                return onSetRepeatMode(objArr);
            case 36:
                return onSetShuffleMode(objArr);
            case 37:
                return onSetCaptioningEnabled(objArr);
            case 38:
                return onSetPlaybackSpeed(objArr);
            case 39:
                return setSessionImpl(objArr);
            case 40:
                return onSkipToQueueItem(objArr);
            case 41:
                return onStop(objArr);
            case 42:
                return onSkipToNext(objArr);
            case 43:
                return onSkipToPrevious(objArr);
            case 44:
                return ParcelableVolumeInfo(objArr);
            case 45:
                return PlaybackStateCompat(objArr);
            case 46:
                return MediaSessionCompatResultReceiverWrapper(objArr);
            case 47:
                return MediaSessionCompatQueueItem(objArr);
            case 48:
                return MediaSessionCompatToken(objArr);
            case 49:
                return r8lambdaKUbBm7ckfqTc9QCgukC86fguu4(objArr);
            case 50:
                return ResultReceiver(objArr);
            case 51:
                return PlaybackStateCompatCustomAction(objArr);
            case 52:
                return r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(objArr);
            case 53:
                return r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw(objArr);
            case 54:
                return r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0(objArr);
            case 55:
                return _init_lambda3(objArr);
            case 56:
                return r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(objArr);
            case 57:
                return _init_lambda2(objArr);
            case 58:
                return r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28(objArr);
            case 59:
                return accessensureViewModelStore(objArr);
            case 60:
                return _init_lambda5(objArr);
            case 61:
                return accessaddObserverForBackInvoker(objArr);
            case 62:
                return accessgetReportFullyDrawnExecutorp(objArr);
            case 63:
                return _init_lambda4(objArr);
            case 64:
                return accessonBackPresseds1027565324(objArr);
            case 65:
                return addObserverForBackInvoker(objArr);
            case 66:
                return createFullyDrawnExecutor(objArr);
            case 67:
                return addObserverForBackInvokerlambda7(objArr);
            case 68:
                LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
                int i26 = 2 % 2;
                ReferenceTypeDeserializer referenceTypeDeserializer = new ReferenceTypeDeserializer();
                referenceTypeDeserializer.RemoteActionCompatParcelizer(lessonVideoActivity.removeOnPictureInPictureModeChangedListener().AudioAttributesCompatParcelizer);
                int i27 = onSkipToNext;
                int i28 = ((i27 | 15) << 1) - (((~i27) & 15) | (i27 & (-16)));
                setSessionImpl = i28 % 128;
                int i29 = i28 % 2;
                referenceTypeDeserializer.read(R.id.video_fragment_container, 3, R.id.gl_top, 3, 0);
                int i30 = setSessionImpl;
                int i31 = i30 & 79;
                int i32 = (((i30 | 79) & (~i31)) - (~(i31 << 1))) - 1;
                onSkipToNext = i32 % 128;
                int i33 = i32 % 2;
                referenceTypeDeserializer.read(R.id.video_fragment_container, 1, R.id.gl_left, 1, 0);
                int i34 = setSessionImpl;
                int i35 = (i34 & (-54)) | ((~i34) & 53);
                int i36 = -(-((i34 & 53) << 1));
                int i37 = (i35 & i36) + (i36 | i35);
                onSkipToNext = i37 % 128;
                int i38 = i37 % 2;
                referenceTypeDeserializer.read(R.id.video_fragment_container, 2, R.id.gl_right, 2, 0);
                referenceTypeDeserializer.RemoteActionCompatParcelizer(R.id.video_fragment_container, 4);
                int i39 = setSessionImpl;
                int i40 = i39 & 61;
                int i41 = (i39 | 61) & (~i40);
                int i42 = i40 << 1;
                int i43 = (i41 ^ i42) + ((i41 & i42) << 1);
                onSkipToNext = i43 % 128;
                int i44 = i43 % 2;
                referenceTypeDeserializer.write(R.id.bottomVideoContainer);
                referenceTypeDeserializer.read(R.id.bottomVideoContainer, 3, R.id.video_fragment_container, 4, 0);
                int i45 = onSkipToNext;
                int i46 = (i45 ^ 91) + ((i45 & 91) << 1);
                setSessionImpl = i46 % 128;
                if (i46 % 2 == 0) {
                    referenceTypeDeserializer.read(R.id.bottomVideoContainer, 1, 1, 0, 1);
                    i8 = 5;
                    i7 = 4;
                } else {
                    referenceTypeDeserializer.read(R.id.bottomVideoContainer, 1, 0, 1, 0);
                    i7 = 2;
                    i8 = 2;
                }
                referenceTypeDeserializer.read(R.id.bottomVideoContainer, i7, 0, i8, 0);
                referenceTypeDeserializer.read(R.id.bottomVideoContainer, 4, 0, 4, 0);
                int i47 = onSkipToNext;
                int i48 = ((i47 ^ 3) - (~(-(-((i47 & 3) << 1))))) - 1;
                setSessionImpl = i48 % 128;
                int i49 = i48 % 2;
                referenceTypeDeserializer.write(lessonVideoActivity.removeOnPictureInPictureModeChangedListener().AudioAttributesCompatParcelizer);
                int i50 = onSkipToNext + 119;
                setSessionImpl = i50 % 128;
                int i51 = i50 % 2;
                return null;
            case 69:
                return ensureViewModelStore(objArr);
            case 70:
                return menuHostHelperlambda0(objArr);
            case 71:
                return addMenuProvider(objArr);
            case 72:
                return getOnBackPressedDispatcherannotations(objArr);
            case 73:
                return addContentView(objArr);
            case 74:
                return getSavedStateRegistryControllerannotations(objArr);
            case 75:
                return addOnPictureInPictureModeChangedListener(objArr);
            case 76:
                return addOnContextAvailableListener(objArr);
            case 77:
                return addOnNewIntentListener(objArr);
            case 78:
                return addOnConfigurationChangedListener(objArr);
            case 79:
                return addOnMultiWindowModeChangedListener(objArr);
            case 80:
                return addOnTrimMemoryListener(objArr);
            case 81:
                return getDefaultViewModelCreationExtras(objArr);
            case 82:
                return addOnUserLeaveHintListener(objArr);
            case 83:
                return getActivityResultRegistry(objArr);
            case 84:
                return getDefaultViewModelProviderFactory(objArr);
            case 85:
                return getOnBackPressedDispatcher(objArr);
            case 86:
                return getFullyDrawnReporter(objArr);
            case 87:
                return getLifecycle(objArr);
            case 88:
                return getSavedStateRegistry(objArr);
            case 89:
                return getLastCustomNonConfigurationInstance(objArr);
            case 90:
                ReferenceTypeDeserializer referenceTypeDeserializer2 = (ReferenceTypeDeserializer) objArr[0];
                int i52 = 2 % 2;
                int i53 = onSkipToNext + 105;
                setSessionImpl = i53 % 128;
                int i54 = i53 % 2;
                referenceTypeDeserializer2.read(R.id.video_fragment_container, 3, R.id.gl_top, 3, 0);
                int i55 = setSessionImpl;
                int i56 = (((i55 & (-10)) | ((~i55) & 9)) - (~(-(-((i55 & 9) << 1))))) - 1;
                onSkipToNext = i56 % 128;
                if (i56 % 2 != 0) {
                    i9 = R.id.video_fragment_container;
                    i10 = 0;
                    i11 = R.id.gl_left;
                    i12 = 0;
                } else {
                    i9 = R.id.video_fragment_container;
                    i10 = 1;
                    i11 = R.id.gl_left;
                    i12 = 1;
                }
                referenceTypeDeserializer2.read(i9, i10, i11, i12, 0);
                int i57 = onSkipToNext;
                int i58 = ((i57 | 72) << 1) - (i57 ^ 72);
                int i59 = (i58 ^ (-1)) + (i58 << 1);
                setSessionImpl = i59 % 128;
                if (i59 % 2 == 0) {
                    i13 = 5;
                    i14 = R.id.gl_right;
                    i15 = 3;
                } else {
                    i13 = 2;
                    i14 = R.id.gl_right;
                    i15 = 2;
                }
                referenceTypeDeserializer2.read(R.id.video_fragment_container, i13, i14, i15, 0);
                int i60 = onSkipToNext;
                int i61 = ((i60 ^ 39) | (i60 & 39)) << 1;
                int i62 = -(((~i60) & 39) | (i60 & (-40)));
                int i63 = (i61 ^ i62) + ((i62 & i61) << 1);
                setSessionImpl = i63 % 128;
                int i64 = i63 % 2;
                return null;
            case 91:
                return initializeViewTreeOwners(objArr);
            case 92:
                return getViewModelStore(objArr);
            case 93:
                return onActivityResult(objArr);
            case 94:
                return onBackPressed(objArr);
            case 95:
                return invalidateMenu(objArr);
            case 96:
                return onCreate(objArr);
            case 97:
                return onMultiWindowModeChanged(objArr);
            case 98:
                return onMenuItemSelected(objArr);
            case 99:
                return onConfigurationChanged(objArr);
            case 100:
                return onCreatePanelMenu(objArr);
            case 101:
                return onPanelClosed(objArr);
            case 102:
                return onPreparePanel(objArr);
            case 103:
                return onNewIntent(objArr);
            case 104:
                return onRequestPermissionsResult(objArr);
            case 105:
                return onPictureInPictureModeChanged(objArr);
            case 106:
                return onTrimMemory(objArr);
            case 107:
                return onSaveInstanceState(objArr);
            case 108:
                return onRetainNonConfigurationInstance(objArr);
            case 109:
                return onUserLeaveHint(objArr);
            case 110:
                return onRetainCustomNonConfigurationInstance(objArr);
            case 111:
                return removeMenuProvider(objArr);
            default:
                return write(objArr);
        }
    }

    public static final class MediaDescriptionCompat implements getAnswerMap<LessonVideoActivity, parseRangedUrl> {
        private static parseRangedUrl RemoteActionCompatParcelizer(LessonVideoActivity lessonVideoActivity) {
            toMagicModuleMetaRepoModel.write(lessonVideoActivity, "");
            return parseRangedUrl.read(SessionDescriptionParser.AudioAttributesCompatParcelizer(lessonVideoActivity));
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [o.getApplicationLabel, o.parseRangedUrl] */
        @Override // kotlin.getAnswerMap
        public final /* synthetic */ parseRangedUrl invoke(LessonVideoActivity lessonVideoActivity) {
            return RemoteActionCompatParcelizer(lessonVideoActivity);
        }
    }

    private static void l(boolean z, int i, int i2, char[] cArr, int i3, Object[] objArr) throws Throwable {
        int i4 = 2 % 2;
        clearDownloadManagerHelpers cleardownloadmanagerhelpers = new clearDownloadManagerHelpers();
        char[] cArr2 = new char[i3];
        cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
        while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
            cleardownloadmanagerhelpers.RemoteActionCompatParcelizer = cArr[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer];
            cArr2[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = (char) (i + cleardownloadmanagerhelpers.RemoteActionCompatParcelizer);
            int i5 = cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer;
            try {
                Object[] objArr2 = {Integer.valueOf(cArr2[i5]), Integer.valueOf(onSkipToQueueItem)};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-579447922);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getScrollBarSize() >> 8) + 23704, (ViewConfiguration.getScrollBarSize() >> 8) + 32, -1556113637, false, CmcdHeadersFactory.OBJECT_TYPE_AUDIO_ONLY, new Class[]{Integer.TYPE, Integer.TYPE});
                }
                cArr2[i5] = ((Character) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).charValue();
                Object[] objArr3 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (44862 - (ViewConfiguration.getTouchSlop() >> 8)), View.resolveSize(0, 0) + 18944, ExpandableListView.getPackedPositionType(0L) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
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
        if (i2 > 0) {
            int i6 = $10 + 63;
            $11 = i6 % 128;
            int i7 = i6 % 2;
            cleardownloadmanagerhelpers.write = i2;
            char[] cArr3 = new char[i3];
            System.arraycopy(cArr2, 0, cArr3, 0, i3);
            System.arraycopy(cArr3, 0, cArr2, i3 - cleardownloadmanagerhelpers.write, cleardownloadmanagerhelpers.write);
            System.arraycopy(cArr3, cleardownloadmanagerhelpers.write, cArr2, 0, i3 - cleardownloadmanagerhelpers.write);
        }
        if (z) {
            char[] cArr4 = new char[i3];
            cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer = 0;
            while (cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer < i3) {
                int i8 = $10 + 75;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                cArr4[cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer] = cArr2[(i3 - cleardownloadmanagerhelpers.AudioAttributesCompatParcelizer) - 1];
                Object[] objArr4 = {cleardownloadmanagerhelpers, cleardownloadmanagerhelpers};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(-322440307);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) (44862 - (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1))), (ViewConfiguration.getKeyRepeatDelay() >> 16) + 18944, TextUtils.indexOf("", "", 0) + 28, -1836173544, false, "c", new Class[]{Object.class, Object.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4);
            }
            cArr2 = cArr4;
        }
        objArr[0] = new String(cArr2);
    }

    public LessonVideoActivity() {
        WebvttParserUtil webvttParserUtil = new WebvttParserUtil();
        this.onCommand = webvttParserUtil;
        this.onFastForward = new getNextEvent(webvttParserUtil);
        this.onPlay = 99;
        this.onMediaButtonEvent = 113;
        this.onPause = new setCaptionRowCount(new getCreatedOnDateMs() { // from class: o.detectUtfCharset
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return (getShowPopup) LessonVideoActivity.write(new Object[]{this.IconCompatParcelizer}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -2090775742, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 2090775802);
            }
        });
        this.onPlayFromMediaId = new MediaBrowserCompatItemReceiver();
        this.onPlayFromUri = new IconCompatParcelizer();
        this.onPrepareFromSearch = new AudioAttributesImplApi21Parcelizer();
        this.onPrepare = new AudioAttributesImplBaseParcelizer();
        this.onPrepareFromMediaId = new Cea708Decoder(new AudioAttributesImplApi26Parcelizer());
        this.onPlayFromSearch = new MediaBrowserCompatCustomActionResultReceiver();
    }

    public static final /* synthetic */ void MediaBrowserCompatMediaItem(LessonVideoActivity lessonVideoActivity) throws NoSuchMethodException {
        int i = 2 % 2;
        int i2 = setSessionImpl + 121;
        onSkipToNext = i2 % 128;
        if (i2 % 2 == 0) {
            write(new Object[]{lessonVideoActivity}, OnFailureListener.AudioAttributesCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 364838920, 1911335814, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 1715553490, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1739477460, -1911335762);
            return;
        }
        write(new Object[]{lessonVideoActivity}, OnFailureListener.AudioAttributesCompatParcelizer(), 364838920 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length(), 1911335814, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 1715553490, (-1739477460) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, -1911335762);
        throw null;
    }

    private static /* synthetic */ Object getSavedStateRegistry(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (((i2 | 32) << 1) - (i2 ^ 32)) - 1;
        onSkipToNext = i3 % 128;
        int i4 = i3 % 2;
        parseRangedUrl parserangedurlRemoveOnPictureInPictureModeChangedListener = lessonVideoActivity.removeOnPictureInPictureModeChangedListener();
        int i5 = setSessionImpl;
        int i6 = (-2) - (((i5 ^ 16) + ((i5 & 16) << 1)) ^ (-1));
        onSkipToNext = i6 % 128;
        if (i6 % 2 != 0) {
            int i7 = 20 / 0;
        }
        return parserangedurlRemoveOnPictureInPictureModeChangedListener;
    }

    public static final /* synthetic */ void onAddQueueItem(LessonVideoActivity lessonVideoActivity) {
        int i = 2 % 2;
        int i2 = onSkipToNext + 35;
        setSessionImpl = i2 % 128;
        int i3 = i2 % 2;
        lessonVideoActivity.setEnabledChangedCallbackactivity_release();
        if (i3 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final parseRangedUrl removeOnPictureInPictureModeChangedListener() {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = ((i2 ^ 122) + ((i2 & 122) << 1)) - 1;
        onSkipToNext = i3 % 128;
        int i4 = i3 % 2;
        T t = this.IconCompatParcelizer.read(this, IconCompatParcelizer[0]);
        int i5 = setSessionImpl;
        int i6 = i5 & 53;
        int i7 = (i6 - (~((i5 ^ 53) | i6))) - 1;
        onSkipToNext = i7 % 128;
        parseRangedUrl parserangedurl = (parseRangedUrl) t;
        if (i7 % 2 == 0) {
            return parserangedurl;
        }
        throw null;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005"}, d2 = {"Lcom/marrow/ui/activities/learn/video/LessonVideoActivity$read;", "", "<init>", "(Ljava/lang/String;I)V", "read", "IconCompatParcelizer"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class read {
        private static final /* synthetic */ read[] AudioAttributesCompatParcelizer;
        public static final read read = new read("FULL_SCREEN", 0);
        public static final read IconCompatParcelizer = new read("NO_FULL_SCREEN", 1);

        private read(String str, int i) {
        }

        static {
            read[] readVarArr = read();
            AudioAttributesCompatParcelizer = readVarArr;
            getMagicModuleTimeline.IconCompatParcelizer(readVarArr);
        }

        private static final /* synthetic */ read[] read() {
            return new read[]{read, IconCompatParcelizer};
        }

        public static read valueOf(String str) {
            return (read) Enum.valueOf(read.class, str);
        }

        public static read[] values() {
            return (read[]) AudioAttributesCompatParcelizer.clone();
        }
    }

    private static void j(int i, short s, int i2, int i3, byte b, Object[] objArr) throws Throwable {
        int i4;
        boolean z;
        int i5 = 2;
        int i6 = 2 % 2;
        buildResumeDownloadsIntent buildresumedownloadsintent = new buildResumeDownloadsIntent();
        StringBuilder sb = new StringBuilder();
        try {
            Object[] objArr2 = {Integer.valueOf(i3), Integer.valueOf(onSetShuffleMode)};
            int i7 = 0;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(559968424);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (ViewConfiguration.getTapTimeout() >> 16), 24297 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), 12 - (ViewConfiguration.getScrollDefaultDelay() >> 16), 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
            }
            Object obj = null;
            int iIntValue = ((Integer) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr2)).intValue();
            if (iIntValue == -1) {
                int i8 = $10 + 77;
                $11 = i8 % 128;
                int i9 = i8 % 2;
                i4 = 1;
            } else {
                i4 = 0;
            }
            if (i4 != 0) {
                int i10 = $11 + 33;
                $10 = i10 % 128;
                if (i10 % 2 != 0) {
                    obj.hashCode();
                    throw null;
                }
                byte[] bArr = onSetRating;
                if (bArr != null) {
                    int length = bArr.length;
                    byte[] bArr2 = new byte[length];
                    int i11 = 0;
                    while (i11 < length) {
                        int i12 = $10 + 119;
                        $11 = i12 % 128;
                        if (i12 % i5 == 0) {
                            try {
                                Object[] objArr3 = new Object[1];
                                objArr3[i7] = Integer.valueOf(bArr[i11]);
                                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(28234468);
                                if (objRemoteActionCompatParcelizer2 == null) {
                                    byte b2 = (byte) i7;
                                    byte b3 = b2;
                                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (1 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1))), 3082 - TextUtils.indexOf("", "", i7, i7), (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) > BitmapDescriptorFactory.HUE_RED ? 1 : (PointF.length(BitmapDescriptorFactory.HUE_RED, BitmapDescriptorFactory.HUE_RED) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 128, 2145850993, false, $$u(b2, b3, b3), new Class[]{Integer.TYPE});
                                }
                                bArr2[i11] = ((Byte) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr3)).byteValue();
                                i11 <<= 1;
                            } catch (Throwable th) {
                                Throwable cause = th.getCause();
                                if (cause == null) {
                                    throw th;
                                }
                                throw cause;
                            }
                        } else {
                            try {
                                Object[] objArr4 = {Integer.valueOf(bArr[i11])};
                                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(28234468);
                                if (objRemoteActionCompatParcelizer3 == null) {
                                    byte b4 = (byte) 0;
                                    byte b5 = b4;
                                    objRemoteActionCompatParcelizer3 = startForeground.read((char) Color.red(0), 3082 - (ViewConfiguration.getEdgeSlop() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 128, 2145850993, false, $$u(b4, b5, b5), new Class[]{Integer.TYPE});
                                }
                                bArr2[i11] = ((Byte) ((Method) objRemoteActionCompatParcelizer3).invoke(null, objArr4)).byteValue();
                                i11++;
                            } catch (Throwable th2) {
                                Throwable cause2 = th2.getCause();
                                if (cause2 == null) {
                                    throw th2;
                                }
                                throw cause2;
                            }
                        }
                        i5 = 2;
                        i7 = 0;
                    }
                    bArr = bArr2;
                }
                if (bArr != null) {
                    byte[] bArr3 = onSetRating;
                    Object[] objArr5 = {Integer.valueOf(i2), Integer.valueOf(onSetRepeatMode)};
                    Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(559968424);
                    if (objRemoteActionCompatParcelizer4 == null) {
                        objRemoteActionCompatParcelizer4 = startForeground.read((char) ('0' - AndroidCharacter.getMirror('0')), View.MeasureSpec.getMode(0) + 24297, (ViewConfiguration.getEdgeSlop() >> 16) + 12, 1596568637, false, CmcdHeadersFactory.STREAM_TYPE_LIVE, new Class[]{Integer.TYPE, Integer.TYPE});
                    }
                    iIntValue = (byte) (((byte) (((long) bArr3[((Integer) ((Method) objRemoteActionCompatParcelizer4).invoke(null, objArr5)).intValue()]) ^ 7899112766888837815L)) + ((int) (((long) onSetShuffleMode) ^ 7899112766888837815L)));
                } else {
                    iIntValue = (short) (((short) (((long) onStop[i2 + ((int) (((long) onSetRepeatMode) ^ 7899112766888837815L))]) ^ 7899112766888837815L)) + ((int) (((long) onSetShuffleMode) ^ 7899112766888837815L)));
                }
            }
            if (iIntValue > 0) {
                int i13 = $11 + 91;
                $10 = i13 % 128;
                int i14 = i13 % 2;
                buildresumedownloadsintent.read = ((i2 + iIntValue) - 2) + ((int) (((long) onSetRepeatMode) ^ 7899112766888837815L)) + i4;
                Object[] objArr6 = {buildresumedownloadsintent, Integer.valueOf(i), Integer.valueOf(onSetPlaybackSpeed), sb};
                Object objRemoteActionCompatParcelizer5 = startForeground.RemoteActionCompatParcelizer(107629512);
                if (objRemoteActionCompatParcelizer5 == null) {
                    objRemoteActionCompatParcelizer5 = startForeground.read((char) (34134 - (ViewConfiguration.getTapTimeout() >> 16)), 13480 - AndroidCharacter.getMirror('0'), 21 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), 2015596381, false, "t", new Class[]{Object.class, Integer.TYPE, Integer.TYPE, Object.class});
                }
                ((StringBuilder) ((Method) objRemoteActionCompatParcelizer5).invoke(null, objArr6)).append(buildresumedownloadsintent.IconCompatParcelizer);
                buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                byte[] bArr4 = onSetRating;
                if (bArr4 != null) {
                    int length2 = bArr4.length;
                    byte[] bArr5 = new byte[length2];
                    for (int i15 = 0; i15 < length2; i15++) {
                        bArr5[i15] = (byte) (((long) bArr4[i15]) ^ 7899112766888837815L);
                    }
                    bArr4 = bArr5;
                }
                if (bArr4 != null) {
                    int i16 = $11 + 109;
                    $10 = i16 % 128;
                    int i17 = i16 % 2;
                    z = true;
                } else {
                    z = false;
                }
                buildresumedownloadsintent.AudioAttributesCompatParcelizer = 1;
                while (buildresumedownloadsintent.AudioAttributesCompatParcelizer < iIntValue) {
                    if (z) {
                        byte[] bArr6 = onSetRating;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((byte) (((byte) (((long) bArr6[r1]) ^ 7899112766888837815L)) + s)) ^ b));
                    } else {
                        short[] sArr = onStop;
                        buildresumedownloadsintent.read = buildresumedownloadsintent.read - 1;
                        buildresumedownloadsintent.IconCompatParcelizer = (char) (buildresumedownloadsintent.RemoteActionCompatParcelizer + (((short) (((short) (((long) sArr[r1]) ^ 7899112766888837815L)) + s)) ^ b));
                        int i18 = $11 + 39;
                        $10 = i18 % 128;
                        int i19 = i18 % 2;
                    }
                    sb.append(buildresumedownloadsintent.IconCompatParcelizer);
                    buildresumedownloadsintent.RemoteActionCompatParcelizer = buildresumedownloadsintent.IconCompatParcelizer;
                    buildresumedownloadsintent.AudioAttributesCompatParcelizer++;
                }
            }
            objArr[0] = sb.toString();
        } catch (Throwable th3) {
            Throwable cause3 = th3.getCause();
            if (cause3 == null) {
                throw th3;
            }
            throw cause3;
        }
    }

    private static /* synthetic */ Object onPrepareFromSearch(Object[] objArr) {
        float x;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 79;
        int i4 = (((i2 | 79) & (~i3)) - (~(i3 << 1))) - 1;
        onSkipToNext = i4 % 128;
        int i5 = i4 % 2;
        FrameLayout frameLayout = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver;
        if (i5 != 0) {
            x = frameLayout.getX();
            int i6 = 54 / 0;
        } else {
            x = frameLayout.getX();
        }
        return Float.valueOf(x);
    }

    private static /* synthetic */ Object getSavedStateRegistryControllerannotations(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (((i2 & (-62)) | ((~i2) & 61)) - (~((i2 & 61) << 1))) - 1;
        onSkipToNext = i3 % 128;
        int i4 = i3 % 2;
        float y = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver.getY();
        int i5 = onSkipToNext;
        int i6 = i5 ^ 113;
        int i7 = -(-((i5 & 113) << 1));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        setSessionImpl = i8 % 128;
        if (i8 % 2 != 0) {
            return Float.valueOf(y);
        }
        int i9 = 85 / 0;
        return Float.valueOf(y);
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object removeMenuProvider(java.lang.Object[] r8) {
        /*
            r0 = 0
            r1 = r8[r0]
            com.marrow.ui.activities.learn.video.LessonVideoActivity r1 = (com.marrow.ui.activities.learn.video.LessonVideoActivity) r1
            r2 = 1
            r8 = r8[r2]
            androidx.activity.result.ActivityResult r8 = (androidx.activity.result.ActivityResult) r8
            r3 = 2
            int r4 = r3 % r3
            int r4 = com.marrow.ui.activities.learn.video.LessonVideoActivity.onSkipToNext
            r5 = r4 & (-56)
            int r6 = ~r4
            r7 = 55
            r6 = r6 & r7
            r5 = r5 | r6
            r4 = r4 & r7
            int r4 = r4 << r2
            int r5 = r5 + r4
            int r4 = r5 % 128
            com.marrow.ui.activities.learn.video.LessonVideoActivity.setSessionImpl = r4
            int r5 = r5 % r3
            r4 = -1
            java.lang.String r6 = ""
            if (r5 != 0) goto L30
            kotlin.toMagicModuleMetaRepoModel.write(r8, r6)
            int r8 = r8.getRemoteActionCompatParcelizer()
            r5 = 19
            int r5 = r5 / r0
            if (r8 != r4) goto L72
            goto L39
        L30:
            kotlin.toMagicModuleMetaRepoModel.write(r8, r6)
            int r8 = r8.getRemoteActionCompatParcelizer()
            if (r8 != r4) goto L72
        L39:
            o.parseRangedUrl r8 = r1.removeOnPictureInPictureModeChangedListener()
            androidx.constraintlayout.widget.ConstraintLayout r8 = r8.AudioAttributesImplApi21Parcelizer
            int r0 = com.marrow.ui.activities.learn.video.LessonVideoActivity.onSkipToNext
            r1 = r0 ^ 37
            r4 = r0 & 37
            r1 = r1 | r4
            int r1 = r1 << r2
            int r4 = ~r4
            r0 = r0 | 37
            r0 = r0 & r4
            int r0 = -r0
            r4 = r1 | r0
            int r4 = r4 << r2
            r0 = r0 ^ r1
            int r4 = r4 - r0
            int r0 = r4 % 128
            com.marrow.ui.activities.learn.video.LessonVideoActivity.setSessionImpl = r0
            int r4 = r4 % r3
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r8, r6)
            android.view.View r8 = (android.view.View) r8
            kotlin.PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(r8)
            int r8 = com.marrow.ui.activities.learn.video.LessonVideoActivity.setSessionImpl
            r0 = r8 & 29
            int r1 = ~r0
            r8 = r8 | 29
            r8 = r8 & r1
            int r0 = r0 << r2
            int r0 = -r0
            int r0 = -r0
            r1 = r8 & r0
            r8 = r8 | r0
            int r1 = r1 + r8
            int r8 = r1 % 128
            com.marrow.ui.activities.learn.video.LessonVideoActivity.onSkipToNext = r8
            int r1 = r1 % r3
        L72:
            int r8 = com.marrow.ui.activities.learn.video.LessonVideoActivity.onSkipToNext
            int r8 = r8 + 79
            int r0 = r8 % 128
            com.marrow.ui.activities.learn.video.LessonVideoActivity.setSessionImpl = r0
            int r8 = r8 % r3
            r8 = 0
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.removeMenuProvider(java.lang.Object[]):java.lang.Object");
    }

    public static final class AudioAttributesCompatParcelizer extends maybeUpdateIsInCaptionService {
        AudioAttributesCompatParcelizer() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.maybeUpdateIsInCaptionService
        public final void RemoteActionCompatParcelizer(String str, int i) {
            toMagicModuleMetaRepoModel.write(str, "");
            fromStyleLine fromstyleline = (fromStyleLine) LessonVideoActivity.this.getMPresenter();
            TextView textView = ((parseRangedUrl) LessonVideoActivity.write(new Object[]{LessonVideoActivity.this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 2008546449, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -2008546361)).MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
            fromstyleline.write(str, i, !(textView.getVisibility() == 0));
        }

        @Override // kotlin.maybeUpdateIsInCaptionService, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public final WebvttSubtitle getTimelineAdapter() {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 11;
        int i4 = (i3 - (~((i2 ^ 11) | i3))) - 1;
        int i5 = i4 % 128;
        onSkipToNext = i5;
        int i6 = i4 % 2;
        WebvttSubtitle webvttSubtitle = this.timelineAdapter;
        if (webvttSubtitle == null) {
            toMagicModuleMetaRepoModel.IconCompatParcelizer("");
            int i7 = onSkipToNext;
            int i8 = i7 & 105;
            int i9 = (i7 ^ 105) | i8;
            int i10 = (i8 & i9) + (i9 | i8);
            setSessionImpl = i10 % 128;
            int i11 = i10 % 2;
            return null;
        }
        int i12 = (i5 & (-76)) | ((~i5) & 75);
        int i13 = -(-((i5 & 75) << 1));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        int i15 = i14 % 128;
        setSessionImpl = i15;
        int i16 = i14 % 2;
        int i17 = (i15 ^ 107) + ((i15 & 107) << 1);
        onSkipToNext = i17 % 128;
        if (i17 % 2 == 0) {
            return webvttSubtitle;
        }
        throw null;
    }

    public final void setTimelineAdapter(WebvttSubtitle webvttSubtitle) throws NoSuchMethodException {
        int i = 2 % 2;
        OnFailureListener.AudioAttributesCompatParcelizer();
        ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length();
        toMagicModuleMetaRepoModel.write(webvttSubtitle, "");
        this.timelineAdapter = webvttSubtitle;
        int i2 = onSkipToNext;
        int i3 = i2 & 105;
        int i4 = -(-(i2 | 105));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        setSessionImpl = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 65 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext + 19;
        setSessionImpl = i2 % 128;
        int i3 = i2 % 2;
        ((fromStyleLine) lessonVideoActivity.getMPresenter()).MediaDescriptionCompat();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = setSessionImpl;
        int i5 = i4 & 85;
        int i6 = ((i4 ^ 85) | i5) << 1;
        int i7 = -((i4 | 85) & (~i5));
        int i8 = (i6 & i7) + (i7 | i6);
        onSkipToNext = i8 % 128;
        int i9 = i8 % 2;
        return getshowpopup;
    }

    public static final class MediaBrowserCompatItemReceiver extends BroadcastReceiver {
        MediaBrowserCompatItemReceiver() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            toMagicModuleMetaRepoModel.write(context, "");
            if (intent == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "media_control", (Object) intent.getAction())) {
                return;
            }
            int intExtra = intent.getIntExtra("control_type", 0);
            if (intExtra == 1) {
                ((fromStyleLine) LessonVideoActivity.this.getMPresenter()).onSkipToNext();
            } else if (intExtra == 2) {
                ((fromStyleLine) LessonVideoActivity.this.getMPresenter()).onSkipToQueueItem();
            }
        }
    }

    public static final class IconCompatParcelizer extends BroadcastReceiver {
        IconCompatParcelizer() {
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            toMagicModuleMetaRepoModel.write(context, "");
            if (intent == null || !toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "activity_finish", (Object) intent.getAction())) {
                return;
            }
            LessonVideoActivity.this.finish();
        }
    }

    public static final class AudioAttributesImplApi21Parcelizer extends Cea608DecoderCueBuilder {
        AudioAttributesImplApi21Parcelizer() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.Cea608DecoderCueBuilder
        public final void read(boolean z) {
            if (LessonVideoActivity.this.isInPictureInPictureMode()) {
                if (z) {
                    ((fromStyleLine) LessonVideoActivity.this.getMPresenter()).onSkipToNext();
                } else {
                    ((fromStyleLine) LessonVideoActivity.this.getMPresenter()).onSkipToQueueItem();
                }
            }
        }

        @Override // kotlin.Cea608DecoderCueBuilder, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static final class AudioAttributesImplBaseParcelizer extends isExtendedWestEuropeanChar {
        AudioAttributesImplBaseParcelizer() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.isExtendedWestEuropeanChar
        public final void write(Context context, int i, int i2) {
            toMagicModuleMetaRepoModel.write(context, "");
            LessonVideoActivity.this.RemoteActionCompatParcelizer();
            if (i2 == 1) {
                if (i == 11) {
                    ((fromStyleLine) LessonVideoActivity.this.getMPresenter()).onPlayFromUri();
                } else {
                    if (i != 21) {
                        return;
                    }
                    LessonVideoActivity.this.AudioAttributesImplBaseParcelizer();
                }
            }
        }

        @Override // kotlin.isExtendedWestEuropeanChar, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    public static final class AudioAttributesImplApi26Parcelizer implements Cea708Decoder.IconCompatParcelizer {
        AudioAttributesImplApi26Parcelizer() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.Cea708Decoder.IconCompatParcelizer
        public final void write(String str, int i, String str2) {
            ((fromStyleLine) LessonVideoActivity.this.getMPresenter()).IconCompatParcelizer(str, i, str2);
        }
    }

    public static final class MediaBrowserCompatCustomActionResultReceiver extends isSpecialNorthAmericanChar {
        MediaBrowserCompatCustomActionResultReceiver() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.isSpecialNorthAmericanChar
        public final void RemoteActionCompatParcelizer(String str, String str2) throws NoSuchMethodException {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str, (Object) "VideoNotesFragment") && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) str2, (Object) "feedback-dialog-open")) {
                ((fromStyleLine) LessonVideoActivity.this.getMPresenter()).r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw();
                return;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "LearnVideoPresenter", (Object) str) && toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "auto_mark_complete", (Object) str2)) {
                Object[] objArr = {(fromStyleLine) LessonVideoActivity.this.getMPresenter()};
                int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
                int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
                fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 953389748, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -953389709);
                return;
            }
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "video_screen", (Object) str)) {
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "current_topic_clicked", (Object) str2)) {
                    ((fromStyleLine) LessonVideoActivity.this.getMPresenter()).onPrepare();
                    return;
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "FULLSCREEN", (Object) str2)) {
                    LessonVideoActivity.onAddQueueItem(LessonVideoActivity.this);
                    return;
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "NORMAL", (Object) str2)) {
                    LessonVideoActivity.MediaBrowserCompatMediaItem(LessonVideoActivity.this);
                    return;
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "TAG_INTERNAL_PIP_VIEW", (Object) str2)) {
                    Object[] objArr2 = {(fromStyleLine) LessonVideoActivity.this.getMPresenter()};
                    int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
                    int iWrite4 = maybeInvalidateForRendererCapabilitiesChange.write();
                    fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite3, -2094602083, objArr2, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite4, 2094602110);
                    return;
                }
                if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "TAG_INTERNAL_TO_NORMAL_PIP_VIEW", (Object) str2)) {
                    ((fromStyleLine) LessonVideoActivity.this.getMPresenter()).onRemoveQueueItem();
                } else if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer((Object) "TAG_CLOSE_INTERNAL_PIP_VIEW", (Object) str2)) {
                    ((fromStyleLine) LessonVideoActivity.this.getMPresenter()).MediaBrowserCompatMediaItem();
                }
            }
        }

        @Override // kotlin.isSpecialNorthAmericanChar, android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            super.onReceive(context, intent);
        }
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final boolean onSetCaptioningEnabled() {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (i2 & 19) + (i2 | 19);
        onSkipToNext = i3 % 128;
        int i4 = i3 % 2;
        DataSourceBitmapLoaderExternalSyntheticLambda1 dataSourceBitmapLoaderExternalSyntheticLambda1 = DataSourceBitmapLoaderExternalSyntheticLambda1.INSTANCE;
        boolean zRemoteActionCompatParcelizer = DataSourceBitmapLoaderExternalSyntheticLambda1.RemoteActionCompatParcelizer(this);
        int i5 = onSkipToNext;
        int i6 = i5 & 123;
        int i7 = i5 | 123;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        setSessionImpl = i8 % 128;
        if (i8 % 2 != 0) {
            return zRemoteActionCompatParcelizer;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object addOnNewIntentListener(Object[] objArr) {
        getShowPopup getshowpopup;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (-2) - (((i2 ^ 38) + ((i2 & 38) << 1)) ^ (-1));
        onSkipToNext = i3 % 128;
        if (i3 % 2 != 0) {
            Object[] objArr2 = {(fromStyleLine) lessonVideoActivity.getMPresenter()};
            int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
            fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 1294042990, objArr2, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -1294042987);
            getshowpopup = getShowPopup.INSTANCE;
            int i4 = 74 / 0;
        } else {
            Object[] objArr3 = {(fromStyleLine) lessonVideoActivity.getMPresenter()};
            int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite4 = maybeInvalidateForRendererCapabilitiesChange.write();
            fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite3, 1294042990, objArr3, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite4, -1294042987);
            getshowpopup = getShowPopup.INSTANCE;
        }
        int i5 = setSessionImpl + 27;
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        return getshowpopup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void handleMediaPlayPauseIfPendingOnHandler(LessonVideoActivity lessonVideoActivity) {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 111;
        int i4 = i3 + ((i2 ^ 111) | i3);
        onSkipToNext = i4 % 128;
        int i5 = i4 % 2;
        fromStyleLine fromstyleline = (fromStyleLine) lessonVideoActivity.getMPresenter();
        if (i5 != 0) {
            int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
            fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -746018476, new Object[]{fromstyleline}, iWrite3, iWrite2, 746018478);
            throw null;
        }
        int iWrite4 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite5 = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite6 = maybeInvalidateForRendererCapabilitiesChange.write();
        fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite4, -746018476, new Object[]{fromstyleline}, iWrite6, iWrite5, 746018478);
        int i6 = setSessionImpl;
        int i7 = (i6 ^ 53) + ((i6 & 53) << 1);
        onSkipToNext = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 16 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void onMediaButtonEvent(LessonVideoActivity lessonVideoActivity) {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (i2 & (-60)) | ((~i2) & 59);
        int i4 = (i2 & 59) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        setSessionImpl = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            HlsTrackMetadataEntry1 hlsTrackMetadataEntry1 = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver;
            obj.hashCode();
            throw null;
        }
        fromStyleLine fromstyleline = (fromStyleLine) lessonVideoActivity.getMPresenter();
        HlsTrackMetadataEntry1 hlsTrackMetadataEntry12 = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver;
        int i6 = setSessionImpl;
        int i7 = i6 & 37;
        int i8 = (i6 | 37) & (~i7);
        int i9 = -(-(i7 << 1));
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        onSkipToNext = i10 % 128;
        int i11 = i10 % 2;
        Object[] objArr = {fromstyleline, Boolean.valueOf(hlsTrackMetadataEntry12.onAddQueueItem.isSelected())};
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 1721202249, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -1721202239);
        int i12 = onSkipToNext;
        int i13 = (i12 & 66) + (i12 | 66);
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        setSessionImpl = i14 % 128;
        if (i14 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object initializeViewTreeOwners(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 111;
        int i4 = (((i2 ^ 111) | i3) << 1) - ((i2 | 111) & (~i3));
        setSessionImpl = i4 % 128;
        int i5 = i4 % 2;
        fromStyleLine fromstyleline = (fromStyleLine) lessonVideoActivity.getMPresenter();
        LinearLayout linearLayout = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.MediaMetadataCompat;
        int i6 = onSkipToNext;
        int i7 = i6 & 51;
        int i8 = (i6 ^ 51) | i7;
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        setSessionImpl = i9 % 128;
        int i10 = i9 % 2;
        Object obj = null;
        Object tag = linearLayout.getTag();
        if (i10 == 0) {
            fromstyleline.IconCompatParcelizer(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(tag, Boolean.TRUE));
            obj.hashCode();
            throw null;
        }
        fromstyleline.IconCompatParcelizer(toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(tag, Boolean.TRUE));
        int i11 = onSkipToNext;
        int i12 = (i11 | 103) << 1;
        int i13 = -(((~i11) & 103) | (i11 & (-104)));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        setSessionImpl = i14 % 128;
        int i15 = i14 % 2;
        return null;
    }

    private static /* synthetic */ Object MediaDescriptionCompat(Object[] objArr) {
        getShowPopup getshowpopup;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext + 87;
        setSessionImpl = i2 % 128;
        int i3 = i2 % 2;
        parseAlignment.IconCompatParcelizer iconCompatParcelizer = (parseAlignment.IconCompatParcelizer) lessonVideoActivity.getMPresenter();
        if (i3 == 0) {
            iconCompatParcelizer.RemoteActionCompatParcelizer(false);
            getshowpopup = getShowPopup.INSTANCE;
            int i4 = 2 / 0;
        } else {
            iconCompatParcelizer.RemoteActionCompatParcelizer(false);
            getshowpopup = getShowPopup.INSTANCE;
        }
        int i5 = setSessionImpl;
        int i6 = ((i5 ^ 3) - (~((i5 & 3) << 1))) - 1;
        onSkipToNext = i6 % 128;
        int i7 = i6 % 2;
        return getshowpopup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final getShowPopup onPlayFromMediaId(LessonVideoActivity lessonVideoActivity) {
        int i = 2 % 2;
        int i2 = onSkipToNext + 33;
        setSessionImpl = i2 % 128;
        int i3 = i2 % 2;
        ((fromStyleLine) lessonVideoActivity.getMPresenter()).onStop();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = setSessionImpl;
        int i5 = i4 & 37;
        int i6 = (i4 | 37) & (~i5);
        int i7 = i5 << 1;
        int i8 = ((i6 | i7) << 1) - (i6 ^ i7);
        onSkipToNext = i8 % 128;
        int i9 = i8 % 2;
        return getshowpopup;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final getShowPopup onPrepare(LessonVideoActivity lessonVideoActivity) {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = ((i2 & (-120)) | ((~i2) & 119)) + ((i2 & 119) << 1);
        onSkipToNext = i3 % 128;
        if (i3 % 2 == 0) {
            ((fromStyleLine) lessonVideoActivity.getMPresenter()).onSetRepeatMode();
            return getShowPopup.INSTANCE;
        }
        ((fromStyleLine) lessonVideoActivity.getMPresenter()).onSetRepeatMode();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object addOnPictureInPictureModeChangedListener(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 1;
        int i4 = (i3 - (~(-(-((i2 ^ 1) | i3))))) - 1;
        setSessionImpl = i4 % 128;
        int i5 = i4 % 2;
        lessonVideoActivity.onBackPressed();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i6 = setSessionImpl + 52;
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        onSkipToNext = i7 % 128;
        if (i7 % 2 == 0) {
            return getshowpopup;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object onSkipToPrevious(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 35;
        int i4 = (i3 - (~((i2 ^ 35) | i3))) - 1;
        setSessionImpl = i4 % 128;
        int i5 = i4 % 2;
        ((fromStyleLine) lessonVideoActivity.getMPresenter()).onSeekTo();
        int i6 = setSessionImpl;
        int i7 = i6 & 9;
        int i8 = (((i6 | 9) & (~i7)) - (~(i7 << 1))) - 1;
        onSkipToNext = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 79 / 0;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void MediaDescriptionCompat(LessonVideoActivity lessonVideoActivity, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 61;
        int i4 = ((i2 ^ 61) | i3) << 1;
        int i5 = -((i2 | 61) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        setSessionImpl = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            throw null;
        }
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        String string = bundle.getString("selected_option");
        int i7 = onSkipToNext;
        int i8 = (i7 & 42) + (i7 | 42);
        int i9 = (i8 ^ (-1)) + (i8 << 1);
        setSessionImpl = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
        if (string != null) {
            int iHashCode = string.hashCode();
            if (iHashCode != -1768979420) {
                int i10 = setSessionImpl;
                int i11 = i10 & 93;
                int i12 = (i10 ^ 93) | i11;
                int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
                onSkipToNext = i13 % 128;
                int i14 = i13 % 2;
                if (iHashCode != -1289822325) {
                    int i15 = i10 + 59;
                    onSkipToNext = i15 % 128;
                    if (i15 % 2 != 0) {
                        throw null;
                    }
                    if (iHashCode == 504689650 && string.equals("stream_online")) {
                        int i16 = onSkipToNext + 49;
                        setSessionImpl = i16 % 128;
                        if (i16 % 2 != 0) {
                            Object[] objArr = {(fromStyleLine) lessonVideoActivity.getMPresenter()};
                            fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 1558954021, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -1558953985);
                            return;
                        }
                        Object[] objArr2 = {(fromStyleLine) lessonVideoActivity.getMPresenter()};
                        fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 1558954021, objArr2, maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -1558953985);
                        int i17 = 5 / 0;
                        return;
                    }
                } else if (string.equals("delete_offline_video")) {
                    int i18 = onSkipToNext;
                    int i19 = (i18 ^ 7) + ((i18 & 7) << 1);
                    setSessionImpl = i19 % 128;
                    int i20 = i19 % 2;
                    Object[] objArr3 = {(fromStyleLine) lessonVideoActivity.getMPresenter()};
                    fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -664498931, objArr3, maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 664498931);
                    int i21 = onSkipToNext;
                    int i22 = i21 ^ 27;
                    int i23 = (i21 & 27) << 1;
                    int i24 = (i22 ^ i23) + ((i23 & i22) << 1);
                    setSessionImpl = i24 % 128;
                    if (i24 % 2 != 0) {
                        return;
                    }
                    obj.hashCode();
                    throw null;
                }
            } else if (!(!string.equals("stream_offline"))) {
                int i25 = setSessionImpl;
                int i26 = i25 & 17;
                int i27 = (i25 | 17) & (~i26);
                int i28 = i26 << 1;
                int i29 = ((i27 | i28) << 1) - (i27 ^ i28);
                onSkipToNext = i29 % 128;
                if (i29 % 2 != 0) {
                    ((fromStyleLine) lessonVideoActivity.getMPresenter()).MediaSessionCompatQueueItem();
                    throw null;
                }
                ((fromStyleLine) lessonVideoActivity.getMPresenter()).MediaSessionCompatQueueItem();
                int i30 = setSessionImpl;
                int i31 = i30 & 121;
                int i32 = i30 | 121;
                int i33 = (i31 & i32) + (i32 | i31);
                onSkipToNext = i33 % 128;
                int i34 = i33 % 2;
            }
        }
        int i35 = onSkipToNext;
        int i36 = i35 & 15;
        int i37 = -(-(i35 | 15));
        int i38 = ((i36 | i37) << 1) - (i37 ^ i36);
        setSessionImpl = i38 % 128;
        int i39 = i38 % 2;
    }

    private static final void MediaBrowserCompatItemReceiver(LessonVideoActivity lessonVideoActivity, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 ^ 123;
        int i4 = (((i2 & 123) | i3) << 1) - i3;
        onSkipToNext = i4 % 128;
        int i5 = i4 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        int i6 = onSkipToNext;
        int i7 = (i6 | 77) << 1;
        int i8 = -(((~i6) & 77) | (i6 & (-78)));
        int i9 = (i7 & i8) + (i8 | i7);
        setSessionImpl = i9 % 128;
        int i10 = i9 % 2;
        lessonVideoActivity.AudioAttributesCompatParcelizer(bundle);
        if (i10 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object setSessionImpl(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        String str = (String) objArr[1];
        Bundle bundle = (Bundle) objArr[2];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = ((i2 & 14) + (i2 | 14)) - 1;
        setSessionImpl = i3 % 128;
        if (i3 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(bundle, "");
            int i4 = 17 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(bundle, "");
        }
        Object obj = null;
        if (!(!bundle.getBoolean("is_video_notes_ready"))) {
            int i5 = setSessionImpl;
            int i6 = (i5 ^ 19) + ((i5 & 19) << 1);
            onSkipToNext = i6 % 128;
            int i7 = i6 % 2;
            fromStyleLine fromstyleline = (fromStyleLine) lessonVideoActivity.getMPresenter();
            if (i7 != 0) {
                fromstyleline.setSessionImpl();
                obj.hashCode();
                throw null;
            }
            fromstyleline.setSessionImpl();
            int i8 = onSkipToNext;
            int i9 = (((i8 ^ 113) | (i8 & 113)) << 1) - (((~i8) & 113) | (i8 & (-114)));
            setSessionImpl = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 3 / 4;
            }
        }
        int i11 = setSessionImpl;
        int i12 = (i11 & (-12)) | ((~i11) & 11);
        int i13 = (i11 & 11) << 1;
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        onSkipToNext = i14 % 128;
        int i15 = i14 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final void AudioAttributesImplApi26Parcelizer(LessonVideoActivity lessonVideoActivity, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 11;
        int i4 = i3 + ((i2 ^ 11) | i3);
        setSessionImpl = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(bundle, "");
            lessonVideoActivity.getMPresenter();
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        P mPresenter = lessonVideoActivity.getMPresenter();
        int i5 = setSessionImpl;
        int i6 = i5 & 51;
        int i7 = (i5 | 51) & (~i6);
        int i8 = i6 << 1;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        onSkipToNext = i9 % 128;
        int i10 = i9 % 2;
        ((fromStyleLine) mPresenter).ResultReceiver();
        int i11 = setSessionImpl;
        int i12 = ((i11 ^ 3) | (i11 & 3)) << 1;
        int i13 = -(((~i11) & 3) | (i11 & (-4)));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        onSkipToNext = i14 % 128;
        if (i14 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object RemoteActionCompatParcelizer(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        String str = (String) objArr[1];
        Bundle bundle = (Bundle) objArr[2];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = ((i2 ^ 52) + ((i2 & 52) << 1)) - 1;
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        int i5 = onSkipToNext;
        int i6 = i5 & 31;
        int i7 = (i6 - (~((i5 ^ 31) | i6))) - 1;
        setSessionImpl = i7 % 128;
        int i8 = i7 % 2;
        String string = bundle.getString("action");
        Object obj = null;
        if (string != null) {
            int i9 = setSessionImpl + 7;
            onSkipToNext = i9 % 128;
            if (i9 % 2 != 0) {
                string.hashCode();
                obj.hashCode();
                throw null;
            }
            int iHashCode = string.hashCode();
            if (iHashCode != 101847376) {
                int i10 = onSkipToNext;
                int i11 = (i10 & (-90)) | ((~i10) & 89);
                int i12 = (i10 & 89) << 1;
                int i13 = ((i11 | i12) << 1) - (i11 ^ i12);
                setSessionImpl = i13 % 128;
                int i14 = i13 % 2;
                if (iHashCode == 1661063709) {
                    int i15 = (i10 & (-94)) | ((~i10) & 93);
                    int i16 = (i10 & 93) << 1;
                    int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
                    setSessionImpl = i17 % 128;
                    if (i17 % 2 == 0) {
                        string.equals("related_schema_clicked");
                        obj.hashCode();
                        throw null;
                    }
                    if (string.equals("related_schema_clicked")) {
                        String string2 = lessonVideoActivity.getString(R.string.solve_related_schema_message);
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
                        int i18 = onSkipToNext;
                        int i19 = (-2) - ((((i18 | 84) << 1) - (i18 ^ 84)) ^ (-1));
                        setSessionImpl = i19 % 128;
                        int i20 = i19 % 2;
                        lessonVideoActivity.AudioAttributesCompatParcelizer(string2);
                        lessonVideoActivity.onBackPressed();
                        int i21 = onSkipToNext + 65;
                        setSessionImpl = i21 % 128;
                        int i22 = i21 % 2;
                        return null;
                    }
                }
            } else if (!(!string.equals("watch_next_subject"))) {
                int i23 = setSessionImpl;
                int i24 = (i23 ^ 25) + ((i23 & 25) << 1);
                onSkipToNext = i24 % 128;
                int i25 = i24 % 2;
                ((fromStyleLine) lessonVideoActivity.getMPresenter()).PlaybackStateCompatCustomAction();
                if (i25 != 0) {
                    obj.hashCode();
                    throw null;
                }
            }
        }
        int i26 = onSkipToNext;
        int i27 = (i26 ^ 35) + ((i26 & 35) << 1);
        setSessionImpl = i27 % 128;
        int i28 = i27 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object RatingCompat(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        String str = (String) objArr[1];
        Bundle bundle = (Bundle) objArr[2];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 ^ 95;
        int i4 = (((i2 & 95) | i3) << 1) - i3;
        setSessionImpl = i4 % 128;
        int i5 = i4 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        int i6 = onSkipToNext;
        int i7 = (((i6 | 82) << 1) - (i6 ^ 82)) - 1;
        setSessionImpl = i7 % 128;
        int i8 = i7 % 2;
        if (!(!bundle.getBoolean("result_open_saved_videos"))) {
            int i9 = setSessionImpl;
            int i10 = i9 & 73;
            int i11 = -(-((i9 ^ 73) | i10));
            int i12 = (i10 & i11) + (i11 | i10);
            onSkipToNext = i12 % 128;
            int i13 = i12 % 2;
            ((fromStyleLine) lessonVideoActivity.getMPresenter()).onSkipToPrevious();
            int i14 = setSessionImpl;
            int i15 = ((((i14 ^ 105) | (i14 & 105)) << 1) - (~(-(((~i14) & 105) | (i14 & (-106)))))) - 1;
            onSkipToNext = i15 % 128;
            int i16 = i15 % 2;
        }
        int i17 = onSkipToNext;
        int i18 = ((i17 ^ 73) | (i17 & 73)) << 1;
        int i19 = -(((~i17) & 73) | (i17 & (-74)));
        int i20 = (i18 ^ i19) + ((i19 & i18) << 1);
        setSessionImpl = i20 % 128;
        int i21 = i20 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object addOnTrimMemoryListener(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        ((fromStyleLine) lessonVideoActivity.getMPresenter()).onPlayFromSearch();
        int i2 = onSkipToNext;
        int i3 = ((i2 ^ 38) + ((i2 & 38) << 1)) - 1;
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x028d  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x1428 A[PHI: r0 r1
      0x1428: PHI (r0v106 int) = (r0v105 int), (r0v130 int) binds: [B:76:0x1426, B:73:0x1420] A[DONT_GENERATE, DONT_INLINE]
      0x1428: PHI (r1v179 int) = (r1v178 int), (r1v258 int) binds: [B:76:0x1426, B:73:0x1420] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.parseIdentifierSection, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onCreate(android.os.Bundle r38) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 6648
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.onCreate(android.os.Bundle):void");
    }

    private static final WindowInsetsCompat AudioAttributesCompatParcelizer(LessonVideoActivity lessonVideoActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        int i;
        int i2;
        int i3;
        int paddingTop;
        int i4 = 2 % 2;
        OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.write(view, "");
        toMagicModuleMetaRepoModel.write(windowInsetsCompat, "");
        int i5 = (-2) - ((setSessionImpl + 96) ^ (-1));
        onSkipToNext = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            String.valueOf(lessonVideoActivity.write);
            throw null;
        }
        buildResolutionString.IconCompatParcelizer("StatusBarIssue", "Current Video Type: ".concat(String.valueOf(lessonVideoActivity.write)));
        _verifyEndArrayForSingle _verifyendarrayforsingle = windowInsetsCompat.read(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer());
        int i6 = onSkipToNext;
        int i7 = ((i6 ^ 80) + ((i6 & 80) << 1)) - 1;
        setSessionImpl = i7 % 128;
        int i8 = i7 % 2;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(_verifyendarrayforsingle, "");
        read readVar = lessonVideoActivity.write;
        read readVar2 = read.read;
        int i9 = onSkipToNext;
        int i10 = i9 & 103;
        int i11 = i10 + ((i9 ^ 103) | i10);
        setSessionImpl = i11 % 128;
        int i12 = i11 % 2;
        if (readVar != readVar2) {
            int i13 = ((i9 | 52) << 1) - (i9 ^ 52);
            int i14 = (i13 ^ (-1)) + (i13 << 1);
            setSessionImpl = i14 % 128;
            int i15 = i14 % 2;
            if (CmcdConfigurationRequestConfig.MediaBrowserCompatItemReceiver(lessonVideoActivity)) {
                int i16 = onSkipToNext;
                int i17 = i16 & 65;
                int i18 = (i16 ^ 65) | i17;
                int i19 = (i17 ^ i18) + ((i18 & i17) << 1);
                setSessionImpl = i19 % 128;
                if (i19 % 2 == 0) {
                    int i20 = windowInsetsCompat.RemoteActionCompatParcelizer(WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver()).write;
                    obj.hashCode();
                    throw null;
                }
                i = windowInsetsCompat.RemoteActionCompatParcelizer(WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver()).write;
            } else {
                i = 0;
            }
            StringBuilder sb = new StringBuilder("systemBars: ");
            int i21 = setSessionImpl;
            int i22 = i21 & 11;
            int i23 = -(-(i21 | 11));
            int i24 = (i22 & i23) + (i23 | i22);
            onSkipToNext = i24 % 128;
            int i25 = i24 % 2;
            sb.append(_verifyendarrayforsingle);
            sb.append(" statusBarInsets ");
            if (i25 != 0) {
                sb.append(i);
                throw null;
            }
            sb.append(i);
            buildResolutionString.IconCompatParcelizer("StatusBarIssue", sb.toString());
            int i26 = onSkipToNext;
            int i27 = (i26 & 87) + (i26 | 87);
            setSessionImpl = i27 % 128;
            if (i27 % 2 == 0) {
                i2 = _verifyendarrayforsingle.read;
                i3 = _verifyendarrayforsingle.IconCompatParcelizer;
                int i28 = 30 / 0;
            } else {
                i2 = _verifyendarrayforsingle.read;
                i3 = _verifyendarrayforsingle.IconCompatParcelizer;
            }
            int i29 = setSessionImpl + 5;
            onSkipToNext = i29 % 128;
            if (i29 % 2 != 0) {
                int i30 = _verifyendarrayforsingle.AudioAttributesCompatParcelizer;
                throw null;
            }
            int i31 = _verifyendarrayforsingle.AudioAttributesCompatParcelizer;
            int i32 = onSkipToNext;
            int i33 = i32 | 13;
            int i34 = ((i33 << 1) - (~(-((~(i32 & 13)) & i33)))) - 1;
            setSessionImpl = i34 % 128;
            if (i34 % 2 == 0) {
                view.setPadding(i2, i, i3, i31);
                paddingTop = view.getPaddingTop();
                int i35 = 74 / 0;
            } else {
                view.setPadding(i2, i, i3, i31);
                paddingTop = view.getPaddingTop();
            }
            String strConcat = "view.top ".concat(String.valueOf(paddingTop));
            int i36 = onSkipToNext;
            int i37 = i36 ^ 71;
            int i38 = (i36 & 71) << 1;
            int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
            setSessionImpl = i39 % 128;
            int i40 = i39 % 2;
            buildResolutionString.IconCompatParcelizer("StatusBarIssue", strConcat);
            int i41 = setSessionImpl + 113;
            onSkipToNext = i41 % 128;
            if (i41 % 2 != 0) {
                int i42 = 4 % 5;
            }
        } else {
            int i43 = _verifyendarrayforsingle.read;
            int i44 = _verifyendarrayforsingle.IconCompatParcelizer;
            int i45 = setSessionImpl;
            int i46 = ((i45 | 95) << 1) - (i45 ^ 95);
            onSkipToNext = i46 % 128;
            int i47 = i46 % 2;
            view.setPadding(i43, 0, i44, 0);
            int paddingTop2 = view.getPaddingTop();
            int i48 = setSessionImpl;
            int i49 = ((i48 | 100) << 1) - (i48 ^ 100);
            int i50 = (i49 ^ (-1)) + (i49 << 1);
            onSkipToNext = i50 % 128;
            if (i50 % 2 != 0) {
                buildResolutionString.IconCompatParcelizer("StatusBarIssue", "view.top ".concat(String.valueOf(paddingTop2)));
                obj.hashCode();
                throw null;
            }
            buildResolutionString.IconCompatParcelizer("StatusBarIssue", "view.top ".concat(String.valueOf(paddingTop2)));
        }
        WindowInsetsCompat windowInsetsCompat2 = WindowInsetsCompat.IconCompatParcelizer;
        int i51 = onSkipToNext;
        int i52 = (i51 & 69) + (i51 | 69);
        setSessionImpl = i52 % 128;
        int i53 = i52 % 2;
        return windowInsetsCompat2;
    }

    private static /* synthetic */ Object getDefaultViewModelCreationExtras(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 ^ 3;
        int i4 = (i2 & 3) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        lessonVideoActivity.AudioAttributesCompatParcelizer(str);
        int i7 = setSessionImpl;
        int i8 = ((i7 ^ 50) + ((i7 & 50) << 1)) - 1;
        onSkipToNext = i8 % 128;
        int i9 = i8 % 2;
        return null;
    }

    @Override // o.parseAlignment.write
    public final void IconCompatParcelizer(String p0) {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (i2 & 3) + (i2 | 3);
        onSkipToNext = i3 % 128;
        int i4 = i3 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        int i5 = setSessionImpl + 79;
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        setTokenBinding.Companion readVar = setTokenBinding.INSTANCE;
        int i7 = setSessionImpl;
        int i8 = (i7 ^ 83) + ((i7 & 83) << 1);
        onSkipToNext = i8 % 128;
        int i9 = i8 % 2;
        Intent intentIconCompatParcelizer = setTokenBinding.Companion.IconCompatParcelizer(this, p0, 11, "portrait");
        int i10 = this.onMediaButtonEvent;
        int i11 = setSessionImpl;
        int i12 = ((i11 | 83) << 1) - (((~i11) & 83) | (i11 & (-84)));
        onSkipToNext = i12 % 128;
        int i13 = i12 % 2;
        startActivityForResult(intentIconCompatParcelizer, i10);
        if (i13 != 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object AudioAttributesImplApi21Parcelizer(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModel = (ActiveRecallQbankLessonUiModel) objArr[1];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (((i2 ^ 55) | (i2 & 55)) << 1) - (((~i2) & 55) | (i2 & (-56)));
        onSkipToNext = i3 % 128;
        int i4 = i3 % 2;
        toMagicModuleMetaRepoModel.write(activeRecallQbankLessonUiModel, "");
        HlsTrackMetadataEntry1 hlsTrackMetadataEntry1 = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver;
        int i5 = setSessionImpl;
        int i6 = ((i5 | 105) << 1) - (i5 ^ 105);
        onSkipToNext = i6 % 128;
        if (i6 % 2 != 0) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsTrackMetadataEntry1.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer(), "");
            throw null;
        }
        formatsMatch formatsmatch = hlsTrackMetadataEntry1.AudioAttributesImplApi21Parcelizer;
        ConstraintLayout constraintLayoutWrite = formatsmatch.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutWrite, "");
        int i7 = onSkipToNext;
        int i8 = i7 ^ 115;
        int i9 = -(-((i7 & 115) << 1));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        setSessionImpl = i10 % 128;
        (i10 % 2 == 0 ? constraintLayoutWrite : constraintLayoutWrite).setVisibility(0);
        toMagicModuleMetaRepoModel.write(formatsmatch);
        af.RemoteActionCompatParcelizer(formatsmatch, activeRecallQbankLessonUiModel);
        int i11 = setSessionImpl + 125;
        onSkipToNext = i11 % 128;
        int i12 = i11 % 2;
        return null;
    }

    private static /* synthetic */ Object onNewIntent(Object[] objArr) {
        int i = 0;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i2 = 2 % 2;
        int i3 = setSessionImpl + 93;
        onSkipToNext = i3 % 128;
        int i4 = getOnline.read(i3 % 2 != 0 ? ((double) updateNavigation.read((Context) lessonVideoActivity)) + 0.07d : ((double) updateNavigation.read((Context) lessonVideoActivity)) * 0.07d);
        if (zBooleanValue) {
            i = i4;
        } else {
            int i5 = setSessionImpl;
            int i6 = i5 & 13;
            int i7 = (i5 | 13) & (~i6);
            int i8 = -(-(i6 << 1));
            int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
            int i10 = i9 % 128;
            onSkipToNext = i10;
            int i11 = i9 % 2;
            int i12 = (((i10 | 18) << 1) - (i10 ^ 18)) - 1;
            setSessionImpl = i12 % 128;
            int i13 = i12 % 2;
        }
        ViewGroup.LayoutParams layoutParams = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.RatingCompat.getLayoutParams();
        int i14 = setSessionImpl;
        int i15 = (i14 & 23) + (i14 | 23);
        onSkipToNext = i15 % 128;
        int i16 = i15 % 2;
        toMagicModuleMetaRepoModel.read(layoutParams, "");
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int i17 = setSessionImpl;
        int i18 = i17 & 85;
        int i19 = ((i17 ^ 85) | i18) << 1;
        int i20 = -((i17 | 85) & (~i18));
        int i21 = (i19 & i20) + (i20 | i19);
        onSkipToNext = i21 % 128;
        Object obj = null;
        if (i21 % 2 != 0) {
            marginLayoutParams.leftMargin = i;
            marginLayoutParams.rightMargin = i;
            lessonVideoActivity.removeOnPictureInPictureModeChangedListener();
            throw null;
        }
        marginLayoutParams.leftMargin = i;
        marginLayoutParams.rightMargin = i;
        parseRangedUrl parserangedurlRemoveOnPictureInPictureModeChangedListener = lessonVideoActivity.removeOnPictureInPictureModeChangedListener();
        int i22 = setSessionImpl;
        int i23 = ((i22 | 114) << 1) - (i22 ^ 114);
        int i24 = (i23 ^ (-1)) + (i23 << 1);
        onSkipToNext = i24 % 128;
        if (i24 % 2 == 0) {
            parserangedurlRemoveOnPictureInPictureModeChangedListener.MediaBrowserCompatCustomActionResultReceiver.RatingCompat.setLayoutParams(marginLayoutParams);
            return null;
        }
        parserangedurlRemoveOnPictureInPictureModeChangedListener.MediaBrowserCompatCustomActionResultReceiver.RatingCompat.setLayoutParams(marginLayoutParams);
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onRequestPermissionsResult(Object[] objArr) {
        int i = 2 % 2;
        NavigationBarViewSavedState navigationBarViewSavedState = new NavigationBarViewSavedState(CmcdConfigurationRequestConfig.AudioAttributesCompatParcelizer(), Integer.valueOf(R.attr.colorSurfaceVariant5), Integer.valueOf(R.attr.backgroundColor));
        int i2 = setSessionImpl + 47;
        onSkipToNext = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 32 / 0;
        }
        return navigationBarViewSavedState;
    }

    private static /* synthetic */ Object onActivityResult(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (-2) - (((i2 & 16) + (i2 | 16)) ^ (-1));
        setSessionImpl = i3 % 128;
        if (i3 % 2 == 0) {
            lessonVideoActivity.AudioAttributesImplBaseParcelizer = lessonVideoActivity.getResources().getConfiguration().orientation;
            int i4 = 53 / 0;
        } else {
            lessonVideoActivity.AudioAttributesImplBaseParcelizer = lessonVideoActivity.getResources().getConfiguration().orientation;
        }
        int i5 = setSessionImpl + 43;
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        lessonVideoActivity.ActionBarLayoutParams();
        int i7 = onSkipToNext;
        int i8 = (((i7 | 8) << 1) - (i7 ^ 8)) - 1;
        setSessionImpl = i8 % 128;
        Object obj = null;
        if (i8 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.parseAlignment.write
    public final void MediaBrowserCompatCustomActionResultReceiver(String p0) {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (i2 | 43) << 1;
        int i4 = -(i2 ^ 43);
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        setSessionImpl = i5 % 128;
        if (i5 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            getLatestBitrateEstimate.AudioAttributesCompatParcelizer.read(p0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(p0, "");
        getLatestBitrateEstimate.AudioAttributesCompatParcelizer.read(p0);
        int i6 = onSkipToNext;
        int i7 = ((i6 & (-4)) | ((~i6) & 3)) + ((i6 & 3) << 1);
        setSessionImpl = i7 % 128;
        int i8 = i7 % 2;
    }

    @Override // o.parseAlignment.write
    public final void accessensureViewModelStore() {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 11;
        int i4 = ((i2 ^ 11) | i3) << 1;
        int i5 = -((i2 | 11) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        setSessionImpl = i6 % 128;
        int i7 = i6 % 2;
        buildResolutionString.IconCompatParcelizer("StatusBarIssue", "makeFullScreen called");
        this.write = read.read;
        int i8 = onSkipToNext;
        int i9 = ((i8 & (-48)) | ((~i8) & 47)) + ((i8 & 47) << 1);
        int i10 = i9 % 128;
        setSessionImpl = i10;
        int i11 = i9 % 2;
        findNameForMutator findnameformutator = this.onAddQueueItem;
        if (findnameformutator != null) {
            int i12 = i10 + 7;
            onSkipToNext = i12 % 128;
            if (i12 % 2 != 0) {
                findnameformutator.write(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer());
                Object obj = null;
                obj.hashCode();
                throw null;
            }
            findnameformutator.write(WindowInsetsCompat.MediaBrowserCompatItemReceiver.AudioAttributesImplBaseParcelizer());
            int i13 = setSessionImpl;
            int i14 = ((i13 ^ 41) | (i13 & 41)) << 1;
            int i15 = -(((~i13) & 41) | (i13 & (-42)));
            int i16 = ((i14 | i15) << 1) - (i15 ^ i14);
            onSkipToNext = i16 % 128;
            int i17 = i16 % 2;
        }
        int i18 = onSkipToNext;
        int i19 = (i18 & 1) + (i18 | 1);
        setSessionImpl = i19 % 128;
        int i20 = i19 % 2;
    }

    @Override // o.parseAlignment.write
    public final void onCustomAction() {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 21;
        int i4 = -(-((i2 ^ 21) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        onSkipToNext = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            buildResolutionString.IconCompatParcelizer("StatusBarIssue", "clearFullScreenFlags called");
            read readVar = read.IconCompatParcelizer;
            obj.hashCode();
            throw null;
        }
        buildResolutionString.IconCompatParcelizer("StatusBarIssue", "clearFullScreenFlags called");
        read readVar2 = read.IconCompatParcelizer;
        int i6 = onSkipToNext;
        int i7 = ((i6 & (-54)) | ((~i6) & 53)) + ((i6 & 53) << 1);
        setSessionImpl = i7 % 128;
        int i8 = i7 % 2;
        this.write = readVar2;
        findNameForMutator findnameformutator = this.onAddQueueItem;
        if (findnameformutator != null) {
            int i9 = i6 + 113;
            setSessionImpl = i9 % 128;
            if (i9 % 2 == 0) {
                findnameformutator.write(WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver());
                obj.hashCode();
                throw null;
            }
            findnameformutator.write(WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatCustomActionResultReceiver());
            int i10 = setSessionImpl;
            int i11 = i10 & 21;
            int i12 = -(-(i10 | 21));
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            onSkipToNext = i13 % 128;
            int i14 = i13 % 2;
        }
        findNameForMutator findnameformutator2 = this.onAddQueueItem;
        if (findnameformutator2 != null) {
            int i15 = onSkipToNext + 13;
            setSessionImpl = i15 % 128;
            if (i15 % 2 == 0) {
                findnameformutator2.read(WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver());
                int i16 = 99 / 0;
            } else {
                findnameformutator2.read(WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver());
            }
            int i17 = onSkipToNext;
            int i18 = i17 ^ 91;
            int i19 = (((i17 & 91) | i18) << 1) - i18;
            setSessionImpl = i19 % 128;
            int i20 = i19 % 2;
        }
        int i21 = onSkipToNext;
        int i22 = (i21 & 111) + (i21 | 111);
        setSessionImpl = i22 % 128;
        if (i22 % 2 == 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object onRetainNonConfigurationInstance(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        Bundle bundle = (Bundle) objArr[1];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 73;
        int i4 = i3 + ((i2 ^ 73) | i3);
        setSessionImpl = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            super.onPostCreate(bundle);
            ((fromStyleLine) lessonVideoActivity.getMPresenter()).write(lessonVideoActivity, lessonVideoActivity, lessonVideoActivity.onCommand);
            int i5 = onSkipToNext;
            int i6 = i5 ^ 77;
            int i7 = ((i5 & 77) | i6) << 1;
            int i8 = -i6;
            int i9 = (i7 & i8) + (i7 | i8);
            setSessionImpl = i9 % 128;
            if (i9 % 2 == 0) {
                int i10 = 82 / 0;
            }
            return null;
        }
        super.onPostCreate(bundle);
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.setViewportSizeToPhysicalDisplaySize.read
    public final void write(RtspMediaTrack p0) {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = ((i2 | 37) << 1) - (i2 ^ 37);
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        fromStyleLine fromstyleline = (fromStyleLine) getMPresenter();
        if (i4 == 0) {
            int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
            fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 1289497580, new Object[]{fromstyleline, p0}, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -1289497568);
            int i5 = 11 / 0;
        } else {
            int iWrite3 = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite4 = maybeInvalidateForRendererCapabilitiesChange.write();
            fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite3, 1289497580, new Object[]{fromstyleline, p0}, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite4, -1289497568);
        }
        int i6 = onSkipToNext;
        int i7 = i6 & 3;
        int i8 = (i7 - (~((i6 ^ 3) | i7))) - 1;
        setSessionImpl = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // o.parseAlignment.write
    public final void onActivityResult() {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (i2 & (-104)) | ((~i2) & 103);
        int i4 = (i2 & 103) << 1;
        int i5 = (i3 & i4) + (i4 | i3);
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        write(R.string.toast_emulator_error);
        int i7 = setSessionImpl;
        int i8 = (i7 & 103) + (i7 | 103);
        onSkipToNext = i8 % 128;
        if (i8 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.parseAlignment.write
    public final void registerForActivityResult() {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = ((i2 | 85) << 1) - (i2 ^ 85);
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        write(R.string.toast_rooted_device_error);
        if (i4 == 0) {
            int i5 = 77 / 0;
        }
    }

    public static final class MediaBrowserCompatSearchResultReceiver implements areRendererDisabledFlagsEqual.write {
        private /* synthetic */ List<String> AudioAttributesCompatParcelizer;

        MediaBrowserCompatSearchResultReceiver(List<String> list) {
            this.AudioAttributesCompatParcelizer = list;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.areRendererDisabledFlagsEqual.write
        public final void IconCompatParcelizer(DownloadableResolution downloadableResolution) {
            toMagicModuleMetaRepoModel.write(downloadableResolution, "");
            ((fromStyleLine) LessonVideoActivity.this.getMPresenter()).AudioAttributesCompatParcelizer(downloadableResolution, this.AudioAttributesCompatParcelizer);
        }
    }

    public static final class MediaBrowserCompatMediaItem implements getRoleFlagMatchScore.RemoteActionCompatParcelizer {
        MediaBrowserCompatMediaItem() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.getRoleFlagMatchScore.RemoteActionCompatParcelizer
        public final void read() {
            ((fromStyleLine) LessonVideoActivity.this.getMPresenter()).onPlayFromUri();
        }
    }

    public static final class MediaMetadataCompat implements selectTracksForType {
        MediaMetadataCompat() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.selectTracksForType
        public final void write() {
            ((fromStyleLine) LessonVideoActivity.this.getMPresenter()).onRemoveQueueItemAt();
        }

        @Override // kotlin.selectTracksForType
        public final void AudioAttributesCompatParcelizer() {
            LessonVideoActivity lessonVideoActivity = LessonVideoActivity.this;
            ResolvableApiException.Companion iconCompatParcelizer = ResolvableApiException.INSTANCE;
            LessonVideoActivity lessonVideoActivity2 = LessonVideoActivity.this;
            String string = lessonVideoActivity2.getString(R.string.blog_url);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
            lessonVideoActivity.startActivityForResult(ResolvableApiException.Companion.read(lessonVideoActivity2, new canceledPendingResult(string, "Marrow", null, 4, null)), 123);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:136:0x13a4  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x142d  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x142f  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x1850  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x1cf5  */
    /* JADX WARN: Type inference failed for: r11v148, types: [boolean] */
    /* JADX WARN: Type inference failed for: r5v360, types: [int] */
    /* JADX WARN: Type inference failed for: r5v404 */
    /* JADX WARN: Type inference failed for: r5v413 */
    /* JADX WARN: Type inference failed for: r5v484 */
    @Override // o.parseAlignment.write
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void write(com.marrow.data.models.content.VideoInfo r45, java.lang.String r46, java.lang.String r47, boolean r48) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 8158
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.write(com.marrow.data.models.content.VideoInfo, java.lang.String, java.lang.String, boolean):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    @Override // android.app.Activity, android.view.KeyEvent.Callback
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean onKeyUp(int r6, android.view.KeyEvent r7) {
        /*
            Method dump skipped, instruction units count: 290
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.onKeyUp(int, android.view.KeyEvent):boolean");
    }

    private static /* synthetic */ Object PlaybackStateCompatCustomAction(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 25;
        int i4 = (i2 | 25) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = ((i4 | i5) << 1) - (i4 ^ i5);
        onSkipToNext = i6 % 128;
        int i7 = i6 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        onMeasure onmeasureIconCompatParcelizer = onMeasure.IconCompatParcelizer(str);
        int i8 = onSkipToNext;
        int i9 = i8 & 15;
        int i10 = (i8 ^ 15) | i9;
        int i11 = (i9 & i10) + (i10 | i9);
        setSessionImpl = i11 % 128;
        int i12 = i11 % 2;
        Object obj = null;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(onmeasureIconCompatParcelizer, "");
        onMeasure onmeasure = onmeasureIconCompatParcelizer;
        if (i12 == 0) {
            lessonVideoActivity.RemoteActionCompatParcelizer(onmeasure);
            obj.hashCode();
            throw null;
        }
        lessonVideoActivity.RemoteActionCompatParcelizer(onmeasure);
        int i13 = onSkipToNext;
        int i14 = i13 & 25;
        int i15 = (i14 - (~(-(-((i13 ^ 25) | i14))))) - 1;
        setSessionImpl = i15 % 128;
        if (i15 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onAddQueueItem(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (((i2 & (-66)) | ((~i2) & 65)) - (~((i2 & 65) << 1))) - 1;
        setSessionImpl = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            Intent intentWrite = buildCurrentLine.write(iIntValue, CourseConfigKeyConstantsKt.KEY_OVERVIEW);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(intentWrite, "");
            int i4 = setSessionImpl;
            int i5 = (((i4 | 76) << 1) - (i4 ^ 76)) - 1;
            onSkipToNext = i5 % 128;
            int i6 = i5 % 2;
            lessonVideoActivity.AudioAttributesCompatParcelizer(intentWrite);
            int i7 = onSkipToNext;
            int i8 = (-2) - ((((i7 | 120) << 1) - (i7 ^ 120)) ^ (-1));
            setSessionImpl = i8 % 128;
            if (i8 % 2 != 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(buildCurrentLine.write(iIntValue, CourseConfigKeyConstantsKt.KEY_OVERVIEW), "");
        throw null;
    }

    public static final class RatingCompat implements rendererSupportsTunneling.RemoteActionCompatParcelizer {
        RatingCompat() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // o.rendererSupportsTunneling.RemoteActionCompatParcelizer
        public final boolean read() {
            ((fromStyleLine) LessonVideoActivity.this.getMPresenter()).r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM();
            return true;
        }
    }

    private static /* synthetic */ Object onSaveInstanceState(Object[] objArr) {
        int i;
        int i2;
        int i3 = 0;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i4 = 2 % 2;
        int i5 = setSessionImpl;
        int i6 = (-2) - ((i5 + 62) ^ (-1));
        onSkipToNext = i6 % 128;
        int i7 = i6 % 2;
        int[] iArr = lessonVideoActivity.AudioAttributesCompatParcelizer;
        int length = iArr.length;
        int i8 = i5 ^ 17;
        int i9 = ((i5 & 17) | i8) << 1;
        int i10 = -i8;
        int i11 = (i9 & i10) + (i9 | i10);
        onSkipToNext = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 5 / 2;
        }
        while (true) {
            Object obj = null;
            if (i3 >= length) {
                int i13 = onSkipToNext + 93;
                setSessionImpl = i13 % 128;
                if (i13 % 2 != 0) {
                    return null;
                }
                obj.hashCode();
                throw null;
            }
            int i14 = setSessionImpl + 31;
            onSkipToNext = i14 % 128;
            int i15 = i14 % 2;
            View viewFindViewById = lessonVideoActivity.findViewById(iArr[i3]);
            int i16 = setSessionImpl + 27;
            onSkipToNext = i16 % 128;
            int i17 = i16 % 2;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(viewFindViewById);
            if (i17 != 0) {
                throw null;
            }
            int i18 = onSkipToNext;
            int i19 = i18 & 91;
            int i20 = (i19 - (~((i18 ^ 91) | i19))) - 1;
            setSessionImpl = i20 % 128;
            if (i20 % 2 == 0) {
                int i21 = i3 & 55;
                int i22 = -(-(i3 | 55));
                int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
                int i24 = i23 | (-10);
                i = i24 << 1;
                i2 = i24 & (~(i23 & (-10)));
            } else {
                i = ((i3 ^ 1) | (i3 & 1)) << 1;
                i2 = ((~i3) & 1) | (i3 & (-2));
            }
            int i25 = -i2;
            i3 = (i & i25) + (i25 | i);
        }
    }

    @Override // o.parseAlignment.write
    public final void onPictureInPictureModeChanged() {
        int[] iArr;
        int length;
        int i;
        int i2 = 2 % 2;
        int i3 = setSessionImpl + 57;
        int i4 = i3 % 128;
        onSkipToNext = i4;
        if (i3 % 2 != 0) {
            iArr = this.AudioAttributesCompatParcelizer;
            length = iArr.length;
            i = 1;
        } else {
            iArr = this.AudioAttributesCompatParcelizer;
            length = iArr.length;
            i = 0;
        }
        int i5 = i4 ^ 15;
        int i6 = (i4 & 15) << 1;
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        setSessionImpl = i7 % 128;
        int i8 = i7 % 2;
        while (i < length) {
            int i9 = onSkipToNext;
            int i10 = i9 & 121;
            int i11 = (i10 - (~((i9 ^ 121) | i10))) - 1;
            setSessionImpl = i11 % 128;
            int i12 = i11 % 2;
            View viewFindViewById = findViewById(iArr[i]);
            int i13 = setSessionImpl + 75;
            onSkipToNext = i13 % 128;
            int i14 = i13 % 2;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(viewFindViewById, "");
            PlayerControlViewExternalSyntheticLambda1.write(viewFindViewById);
            if (i14 != 0) {
                i += 24;
            } else {
                int i15 = i & 1;
                int i16 = ((i ^ 1) | i15) << 1;
                int i17 = -((i | 1) & (~i15));
                i = ((i16 | i17) << 1) - (i16 ^ i17);
            }
        }
        int i18 = onSkipToNext;
        int i19 = i18 & 7;
        int i20 = (i18 | 7) & (~i19);
        int i21 = -(-(i19 << 1));
        int i22 = (i20 & i21) + (i20 | i21);
        setSessionImpl = i22 % 128;
        int i23 = i22 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.parseAlignment.write
    public final void getSavedStateRegistryControllerannotations() {
        Pair[] pairArr;
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = ((((i2 ^ 101) | (i2 & 101)) << 1) - (~(-(((~i2) & 101) | (i2 & (-102)))))) - 1;
        onSkipToNext = i3 % 128;
        if (i3 % 2 != 0) {
            ((fromStyleLine) getMPresenter())._init_lambda2();
            pairArr = new Pair[0];
        } else {
            ((fromStyleLine) getMPresenter())._init_lambda2();
            pairArr = new Pair[1];
        }
        pairArr[0] = setAction.write("request_action", "reset_dock");
        int i4 = setSessionImpl + 87;
        onSkipToNext = i4 % 128;
        if (i4 % 2 == 0) {
            RemoteActionCompatParcelizer(_getIndexResolver.write(pairArr));
        } else {
            RemoteActionCompatParcelizer(_getIndexResolver.write(pairArr));
            int i5 = 81 / 0;
        }
    }

    @Override // o.parseAlignment.write
    public final void r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 115;
        int i4 = (i2 | 115) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        setSessionImpl = i6 % 128;
        int i7 = i6 % 2;
        View[] viewArr = new View[1];
        ConstraintLayout constraintLayout = removeOnPictureInPictureModeChangedListener().MediaMetadataCompat;
        int i8 = onSkipToNext;
        int i9 = (i8 & 59) + (i8 | 59);
        setSessionImpl = i9 % 128;
        int i10 = i9 % 2;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        if (i10 == 0) {
            viewArr[0] = constraintLayout;
        } else {
            viewArr[0] = constraintLayout;
        }
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(viewArr);
    }

    @Override // o.parseAlignment.write
    public final void removeMenuProvider() {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 87;
        int i4 = (((i2 | 87) & (~i3)) - (~(-(-(i3 << 1))))) - 1;
        setSessionImpl = i4 % 128;
        View[] viewArr = i4 % 2 == 0 ? new View[1] : new View[1];
        ConstraintLayout constraintLayout = removeOnPictureInPictureModeChangedListener().MediaMetadataCompat;
        int i5 = onSkipToNext + 63;
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        viewArr[0] = constraintLayout;
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(viewArr);
        int i7 = onSkipToNext;
        int i8 = i7 & 87;
        int i9 = (i7 ^ 87) | i8;
        int i10 = (i8 & i9) + (i9 | i8);
        setSessionImpl = i10 % 128;
        int i11 = i10 % 2;
    }

    private static /* synthetic */ Object _init_lambda2(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 87;
        int i4 = ((((i2 ^ 87) | i3) << 1) - (~(-((i2 | 87) & (~i3))))) - 1;
        onSkipToNext = i4 % 128;
        int i5 = i4 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        HlsTrackMetadataEntry1 hlsTrackMetadataEntry1 = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver;
        int i6 = setSessionImpl;
        int i7 = ((i6 ^ 11) | (i6 & 11)) << 1;
        int i8 = -(((~i6) & 11) | (i6 & (-12)));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        onSkipToNext = i9 % 128;
        int i10 = i9 % 2;
        TextView textView = hlsTrackMetadataEntry1.onAddQueueItem;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        if (i10 != 0) {
            int i11 = 15 / 0;
        }
        RemoteActionCompatParcelizer(textView, str);
        int i12 = onSkipToNext + 99;
        setSessionImpl = i12 % 128;
        if (i12 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private final void RemoteActionCompatParcelizer(Bundle p0) {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 45;
        int i4 = -(-((i2 ^ 45) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        getSupportFragmentManager().read("video_action_key", p0);
        int i7 = onSkipToNext;
        int i8 = i7 & 37;
        int i9 = (i7 | 37) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
        setSessionImpl = i11 % 128;
        if (i11 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static void RemoteActionCompatParcelizer(TextView p0, String p1) {
        String string;
        int i;
        int i2;
        int i3;
        int i4 = 2 % 2;
        int i5 = setSessionImpl;
        int i6 = (i5 | 21) << 1;
        int i7 = -(i5 ^ 21);
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        onSkipToNext = i8 % 128;
        if (i8 % 2 != 0) {
            string = TestGroupLSModel.MediaBrowserCompatItemReceiver((CharSequence) p1).toString();
            int i9 = 48 / 0;
        } else {
            string = TestGroupLSModel.MediaBrowserCompatItemReceiver((CharSequence) p1).toString();
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
        int i10 = setSessionImpl;
        int i11 = i10 & 101;
        int i12 = -(-((i10 ^ 101) | i11));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        onSkipToNext = i13 % 128;
        if (i13 % 2 != 0) {
            spannableStringBuilder.append((CharSequence) str);
            p0.isSelected();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        SpannableStringBuilder spannableStringBuilderAppend = spannableStringBuilder.append((CharSequence) str);
        if (!(!p0.isSelected())) {
            OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
            OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
            int i14 = onSkipToNext + 115;
            setSessionImpl = i14 % 128;
            int i15 = i14 % 2;
            i = R.drawable.ic_chevron_up;
        } else {
            int i16 = setSessionImpl;
            int i17 = i16 & 79;
            int i18 = (((i16 | 79) & (~i17)) - (~(-(-(i17 << 1))))) - 1;
            onSkipToNext = i18 % 128;
            int i19 = i18 % 2;
            i = R.drawable.ic_chevron_down;
        }
        Drawable drawableRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(p0, i);
        if (drawableRemoteActionCompatParcelizer == null) {
            int i20 = setSessionImpl;
            int i21 = i20 & 23;
            int i22 = (i20 | 23) & (~i21);
            int i23 = i21 << 1;
            int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
            onSkipToNext = i24 % 128;
            if (i24 % 2 == 0) {
                p0.setText(string);
                return;
            } else {
                p0.setText(string);
                int i25 = 42 / 0;
                return;
            }
        }
        int length = spannableStringBuilderAppend.length();
        ImageSpan imageSpan = new ImageSpan(drawableRemoteActionCompatParcelizer, 0);
        int i26 = onSkipToNext + 99;
        setSessionImpl = i26 % 128;
        if (i26 % 2 == 0) {
            i2 = length >> 1;
            i3 = 12;
        } else {
            i2 = (length ^ (-1)) + (length << 1);
            i3 = 33;
        }
        spannableStringBuilderAppend.setSpan(imageSpan, i2, length, i3);
        p0.setText(spannableStringBuilderAppend);
        int i27 = setSessionImpl;
        int i28 = ((i27 | 121) << 1) - (((~i27) & 121) | (i27 & (-122)));
        onSkipToNext = i28 % 128;
        int i29 = i28 % 2;
    }

    private static Drawable RemoteActionCompatParcelizer(TextView p0, int p1) {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 47;
        int i4 = (i2 | 47) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 & i5) + (i4 | i5);
        setSessionImpl = i6 % 128;
        int i7 = i6 % 2;
        int dimensionPixelSize = p0.getResources().getDimensionPixelSize(R.dimen.margin_20dp);
        Context context = p0.getContext();
        int i8 = setSessionImpl;
        int i9 = i8 ^ 107;
        int i10 = (((i8 & 107) | i9) << 1) - i9;
        onSkipToNext = i10 % 128;
        Object obj = null;
        if (i10 % 2 != 0) {
            getDefaultViewModelCreationExtras.write(context, p1);
            throw null;
        }
        Drawable drawableWrite = getDefaultViewModelCreationExtras.write(context, p1);
        if (drawableWrite != null) {
            int i11 = setSessionImpl;
            int i12 = (((i11 ^ 23) | (i11 & 23)) << 1) - (((~i11) & 23) | (i11 & (-24)));
            onSkipToNext = i12 % 128;
            if (i12 % 2 != 0) {
                drawableWrite.mutate();
                obj.hashCode();
                throw null;
            }
            Drawable drawableMutate = drawableWrite.mutate();
            if (drawableMutate != null) {
                int i13 = onSkipToNext;
                int i14 = ((((i13 ^ 83) | (i13 & 83)) << 1) - (~(-(((~i13) & 83) | (i13 & (-84)))))) - 1;
                setSessionImpl = i14 % 128;
                if (i14 % 2 == 0) {
                    drawableMutate.setBounds(1, 0, dimensionPixelSize, dimensionPixelSize);
                } else {
                    drawableMutate.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
                }
                findFormatOverrides.AudioAttributesCompatParcelizer(drawableMutate, p0.getTextColors());
                drawableMutate.setState(p0.getDrawableState());
                int i15 = onSkipToNext;
                int i16 = i15 & 109;
                int i17 = (((i15 | 109) & (~i16)) - (~(i16 << 1))) - 1;
                setSessionImpl = i17 % 128;
                if (i17 % 2 != 0) {
                    return drawableMutate;
                }
                obj.hashCode();
                throw null;
            }
        }
        int i18 = setSessionImpl;
        int i19 = i18 & 73;
        int i20 = ((i18 ^ 73) | i19) << 1;
        int i21 = -((i18 | 73) & (~i19));
        int i22 = (i20 & i21) + (i21 | i20);
        onSkipToNext = i22 % 128;
        int i23 = i22 % 2;
        return null;
    }

    @Override // o.parseAlignment.write
    public final void onCreatePanelMenu() {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (((i2 | 16) << 1) - (i2 ^ 16)) - 1;
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        FrameLayout frameLayout = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatMediaItem;
        int i5 = setSessionImpl;
        int i6 = ((i5 | 69) << 1) - (i5 ^ 69);
        onSkipToNext = i6 % 128;
        int i7 = i6 % 2;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        PlayerControlViewExternalSyntheticLambda1.write(frameLayout);
        int i8 = onSkipToNext;
        int i9 = ((i8 & 38) + (i8 | 38)) - 1;
        setSessionImpl = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 61 / 0;
        }
    }

    private static /* synthetic */ Object read(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 ^ 113;
        int i4 = (i2 & 113) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1158600333, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1158600240);
        FrameLayout frameLayout = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatMediaItem;
        int i7 = onSkipToNext;
        int i8 = (i7 ^ 125) + ((i7 & 125) << 1);
        setSessionImpl = i8 % 128;
        int i9 = i8 % 2;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        FrameLayout frameLayout2 = frameLayout;
        if (i9 != 0) {
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(frameLayout2);
            return null;
        }
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(frameLayout2);
        throw null;
    }

    @Override // o.parseAlignment.write
    public final void onMultiWindowModeChanged() {
        int i = 2 % 2;
        int i2 = (-2) - ((setSessionImpl + 80) ^ (-1));
        onSkipToNext = i2 % 128;
        int i3 = i2 % 2;
        write(R.string.toast_lesson_has_no_video);
        if (i3 != 0) {
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i4 = onSkipToNext;
        int i5 = (((i4 | 38) << 1) - (i4 ^ 38)) - 1;
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
    }

    @Override // o.parseAlignment.write
    public final void RemoteActionCompatParcelizer(boolean p0) {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 95;
        int i4 = (i2 ^ 95) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        ImageButton imageButton = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
        int i7 = setSessionImpl;
        int i8 = i7 & 99;
        int i9 = (((i7 | 99) & (~i8)) - (~(i8 << 1))) - 1;
        onSkipToNext = i9 % 128;
        int i10 = i9 % 2;
        imageButton.setTag(R.id.stream_online, Boolean.valueOf(p0));
        int i11 = onSkipToNext;
        int i12 = i11 | 47;
        int i13 = i12 << 1;
        int i14 = -((~(i11 & 47)) & i12);
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        setSessionImpl = i15 % 128;
        int i16 = i15 % 2;
    }

    @Override // o.parseAlignment.write
    public final void AudioAttributesCompatParcelizer(LessonIndex p0) {
        String string;
        int i = 2 % 2;
        System.identityHashCode(this);
        System.identityHashCode(this);
        RemoteActionCompatParcelizer();
        if (p0 != null) {
            int i2 = setSessionImpl;
            int i3 = i2 ^ 95;
            int i4 = (((i2 & 95) | i3) << 1) - i3;
            onSkipToNext = i4 % 128;
            int i5 = i4 % 2;
            Object[] objArr = {p0.getTitle()};
            int i6 = setSessionImpl;
            int i7 = (i6 ^ 119) + ((i6 & 119) << 1);
            onSkipToNext = i7 % 128;
            int i8 = i7 % 2;
            string = getString(R.string.f_dialog_delete_cache_msg, objArr);
            int i9 = setSessionImpl;
            int i10 = i9 & 45;
            int i11 = (i10 - (~((i9 ^ 45) | i10))) - 1;
            onSkipToNext = i11 % 128;
            int i12 = i11 % 2;
        } else {
            string = getString(R.string.f_dialog_delete_cache_msg_any);
            System.identityHashCode(this);
            System.identityHashCode(this);
        }
        toMagicModuleMetaRepoModel.write((Object) string);
        isDolbyAudio isdolbyaudio = new isDolbyAudio(this, 11, null, 4, null);
        int i13 = setSessionImpl;
        int i14 = (i13 ^ 21) + ((i13 & 21) << 1);
        onSkipToNext = i14 % 128;
        int i15 = i14 % 2;
        isdolbyaudio.read(string);
        isDolbyAudio.read(742101932, new Object[]{isdolbyaudio, Integer.valueOf(R.string.text_dialog_delete_cache_highlight_text)}, getColorInfoString.write(), getColorInfoString.write(), getColorInfoString.write(), -742101932, getColorInfoString.write());
        isdolbyaudio.IconCompatParcelizer();
        int i16 = setSessionImpl;
        int i17 = ((((i16 ^ 1) | (i16 & 1)) << 1) - (~(-(((~i16) & 1) | (i16 & (-2)))))) - 1;
        onSkipToNext = i17 % 128;
        int i18 = i17 % 2;
        this.AudioAttributesImplApi21Parcelizer = isdolbyaudio;
        this.AudioAttributesImplApi21Parcelizer.show();
        int i19 = onSkipToNext;
        int i20 = (i19 & 27) + (i19 | 27);
        setSessionImpl = i20 % 128;
        int i21 = i20 % 2;
    }

    private static /* synthetic */ Object PlaybackStateCompat(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 115;
        int i4 = ((i2 ^ 115) | i3) << 1;
        int i5 = -((i2 | 115) & (~i3));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        setSessionImpl = i6 % 128;
        Object obj = null;
        if (i6 % 2 == 0) {
            lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver.getLayoutParams();
            throw null;
        }
        ViewGroup.LayoutParams layoutParams = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver.getLayoutParams();
        if (iIntValue == Integer.MAX_VALUE) {
            int i7 = setSessionImpl;
            int i8 = i7 & 103;
            int i9 = (i7 ^ 103) | i8;
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            onSkipToNext = i10 % 128;
            int i11 = i10 % 2;
            iIntValue = -1;
        }
        layoutParams.height = iIntValue;
        lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver.setLayoutParams(layoutParams);
        int i12 = setSessionImpl;
        int i13 = i12 & 41;
        int i14 = ((i12 | 41) & (~i13)) + (i13 << 1);
        onSkipToNext = i14 % 128;
        if (i14 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void AudioAttributesCompatParcelizer(android.os.Bundle r18) {
        /*
            Method dump skipped, instruction units count: 1396
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.AudioAttributesCompatParcelizer(android.os.Bundle):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object onSetShuffleMode(Object[] objArr) {
        float width;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 113;
        int i4 = (i2 ^ 113) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        Pair pairWrite = setAction.write("request_action", "hide_dock");
        int i7 = onSkipToNext;
        int i8 = i7 & 27;
        int i9 = (i7 ^ 27) | i8;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        setSessionImpl = i10 % 128;
        int i11 = i10 % 2;
        lessonVideoActivity.RemoteActionCompatParcelizer(_getIndexResolver.write(pairWrite));
        fromStyleLine fromstyleline = (fromStyleLine) lessonVideoActivity.getMPresenter();
        int i12 = onSkipToNext + 43;
        setSessionImpl = i12 % 128;
        int i13 = i12 % 2;
        fromstyleline._init_lambda2();
        if (zBooleanValue) {
            int i14 = setSessionImpl;
            int i15 = i14 & 13;
            int i16 = -(-((i14 ^ 13) | i15));
            int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
            onSkipToNext = i17 % 128;
            int i18 = i17 % 2;
            int i19 = lessonVideoActivity.getResources().getDisplayMetrics().widthPixels;
            parseRangedUrl parserangedurlRemoveOnPictureInPictureModeChangedListener = lessonVideoActivity.removeOnPictureInPictureModeChangedListener();
            int i20 = setSessionImpl;
            int i21 = i20 & 119;
            int i22 = -(-(i20 | 119));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            onSkipToNext = i23 % 128;
            if (i23 % 2 != 0) {
                width = i19 / parserangedurlRemoveOnPictureInPictureModeChangedListener.MediaBrowserCompatSearchResultReceiver.getWidth();
            } else {
                int i24 = -parserangedurlRemoveOnPictureInPictureModeChangedListener.MediaBrowserCompatSearchResultReceiver.getWidth();
                int i25 = i19 | i24;
                int i26 = i25 << 1;
                int i27 = -((~(i19 & i24)) & i25);
                width = ((i26 | i27) << 1) - (i27 ^ i26);
            }
            int i28 = onSkipToNext;
            int i29 = ((i28 & 86) + (i28 | 86)) - 1;
            setSessionImpl = i29 % 128;
            int i30 = i29 % 2;
        } else {
            int i31 = setSessionImpl;
            int i32 = i31 & 29;
            int i33 = (i31 ^ 29) | i32;
            int i34 = ((i32 | i33) << 1) - (i33 ^ i32);
            onSkipToNext = i34 % 128;
            if (i34 % 2 != 0) {
                int i35 = 5 % 2;
            }
            width = BitmapDescriptorFactory.HUE_RED;
        }
        lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver.animate().cancel();
        ViewPropertyAnimator viewPropertyAnimatorX = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver.animate().x(width);
        LinearInterpolator linearInterpolator = new LinearInterpolator();
        int i36 = onSkipToNext;
        int i37 = (i36 & 107) + (i36 | 107);
        setSessionImpl = i37 % 128;
        Object obj = null;
        if (i37 % 2 == 0) {
            viewPropertyAnimatorX.setInterpolator(linearInterpolator).setDuration(250L).start();
            obj.hashCode();
            throw null;
        }
        viewPropertyAnimatorX.setInterpolator(linearInterpolator).setDuration(250L).start();
        write(new Object[]{lessonVideoActivity, true}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 591436899, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -591436835);
        int i38 = onSkipToNext;
        int i39 = i38 & 123;
        int i40 = (((i38 ^ 123) | i39) << 1) - ((i38 | 123) & (~i39));
        setSessionImpl = i40 % 128;
        int i41 = i40 % 2;
        return null;
    }

    private final void setPositiveButton() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = 2 % 2;
        ReferenceTypeDeserializer referenceTypeDeserializer = new ReferenceTypeDeserializer();
        referenceTypeDeserializer.RemoteActionCompatParcelizer(removeOnPictureInPictureModeChangedListener().AudioAttributesCompatParcelizer);
        int i10 = onSkipToNext;
        int i11 = (((i10 | 110) << 1) - (i10 ^ 110)) - 1;
        setSessionImpl = i11 % 128;
        if (i11 % 2 == 0) {
            i = R.id.video_fragment_container;
            i2 = 3;
            i3 = R.id.gl_top;
            i4 = 4;
        } else {
            i = R.id.video_fragment_container;
            i2 = 3;
            i3 = R.id.gl_top;
            i4 = 3;
        }
        referenceTypeDeserializer.read(i, i2, i3, i4, 0);
        referenceTypeDeserializer.read(R.id.video_fragment_container, 1, R.id.gl_left, 1, 0);
        int i12 = setSessionImpl;
        int i13 = i12 & 83;
        int i14 = -(-((i12 ^ 83) | i13));
        int i15 = (i13 & i14) + (i14 | i13);
        onSkipToNext = i15 % 128;
        if (i15 % 2 != 0) {
            referenceTypeDeserializer.read(R.id.video_fragment_container, 2, R.id.gl_landscape_split_mid, 2, 0);
            referenceTypeDeserializer.IconCompatParcelizer(R.id.video_fragment_container, 3, 0, 4);
        } else {
            referenceTypeDeserializer.read(R.id.video_fragment_container, 2, R.id.gl_landscape_split_mid, 2, 0);
            referenceTypeDeserializer.IconCompatParcelizer(R.id.video_fragment_container, 4, 0, 4);
        }
        referenceTypeDeserializer.write(R.id.bottomVideoContainer);
        referenceTypeDeserializer.read(R.id.bottomVideoContainer, 3, 0, 3, 0);
        int i16 = onSkipToNext;
        int i17 = ((((i16 ^ 113) | (i16 & 113)) << 1) - (~(-(((~i16) & 113) | (i16 & (-114)))))) - 1;
        setSessionImpl = i17 % 128;
        if (i17 % 2 == 0) {
            referenceTypeDeserializer.IconCompatParcelizer(R.id.bottomVideoContainer, 1, R.id.gl_landscape_split_mid, 0);
            i5 = R.id.bottomVideoContainer;
            i6 = 2;
            i7 = 1;
            i8 = 5;
        } else {
            referenceTypeDeserializer.IconCompatParcelizer(R.id.bottomVideoContainer, 1, R.id.gl_landscape_split_mid, 1);
            i5 = R.id.bottomVideoContainer;
            i6 = 2;
            i7 = 0;
            i8 = 2;
        }
        referenceTypeDeserializer.read(i5, i6, i7, i8, 0);
        int i18 = onSkipToNext;
        int i19 = i18 ^ 15;
        int i20 = (i18 & 15) << 1;
        int i21 = (i19 & i20) + (i20 | i19);
        setSessionImpl = i21 % 128;
        int i22 = i21 % 2;
        referenceTypeDeserializer.IconCompatParcelizer(R.id.bottomVideoContainer, 4, 0, 4);
        ConstraintLayout constraintLayout = removeOnPictureInPictureModeChangedListener().AudioAttributesCompatParcelizer;
        int i23 = setSessionImpl + 121;
        onSkipToNext = i23 % 128;
        int i24 = i23 % 2;
        referenceTypeDeserializer.write(constraintLayout);
        int i25 = setSessionImpl;
        int i26 = i25 ^ 5;
        int i27 = (i25 & 5) << 1;
        int i28 = (i26 ^ i27) + ((i27 & i26) << 1);
        onSkipToNext = i28 % 128;
        if (i28 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object addObserverForBackInvoker(Object[] objArr) throws NoSuchMethodException {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        Configuration configuration = (Configuration) objArr[1];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 23;
        int i4 = ((i2 | 23) & (~i3)) + (i3 << 1);
        onSkipToNext = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(configuration, "");
            super.onConfigurationChanged(configuration);
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(configuration, "");
        super.onConfigurationChanged(configuration);
        int i5 = onSkipToNext + 61;
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        write(new Object[]{lessonVideoActivity}, 1055635978 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(3), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1036636560, 2086741594, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -2086741548);
        lessonVideoActivity.AudioAttributesImplApi21Parcelizer(configuration.orientation);
        int i7 = setSessionImpl + 117;
        onSkipToNext = i7 % 128;
        if (i7 % 2 != 0) {
            ((fromStyleLine) lessonVideoActivity.getMPresenter()).read((fromStyleLine.IconCompatParcelizer) null);
            obj.hashCode();
            throw null;
        }
        ((fromStyleLine) lessonVideoActivity.getMPresenter()).read((fromStyleLine.IconCompatParcelizer) null);
        if (!((Boolean) write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1159545353, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1159545277)).booleanValue()) {
            int i8 = setSessionImpl;
            int i9 = (i8 & 71) + (i8 | 71);
            int i10 = i9 % 128;
            onSkipToNext = i10;
            if (i9 % 2 != 0) {
                boolean z = lessonVideoActivity.onCustomAction;
                obj.hashCode();
                throw null;
            }
            if (!lessonVideoActivity.onCustomAction) {
                int i11 = i10 + 8;
                int i12 = (i11 ^ (-1)) + (i11 << 1);
                setSessionImpl = i12 % 128;
                int i13 = i12 % 2;
                return null;
            }
        }
        lessonVideoActivity.onCustomAction = false;
        lessonVideoActivity.ActionBarLayoutParams();
        fromStyleLine fromstyleline = (fromStyleLine) lessonVideoActivity.getMPresenter();
        int i14 = setSessionImpl;
        int i15 = i14 & 89;
        int i16 = (((i14 | 89) & (~i15)) - (~(-(-(i15 << 1))))) - 1;
        onSkipToNext = i16 % 128;
        int i17 = i16 % 2;
        fromstyleline.onPrepareFromSearch();
        if (i17 != 0) {
            obj.hashCode();
            throw null;
        }
        int i18 = setSessionImpl;
        int i19 = ((i18 & 64) + (i18 | 64)) - 1;
        onSkipToNext = i19 % 128;
        if (i19 % 2 != 0) {
            int i20 = 91 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object MediaSessionCompatResultReceiverWrapper(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl + 99;
        onSkipToNext = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        FragmentManager supportFragmentManager = lessonVideoActivity.getSupportFragmentManager();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(supportFragmentManager, "");
        if (i3 != 0) {
            obj.hashCode();
            throw null;
        }
        int i4 = onSkipToNext + 45;
        setSessionImpl = i4 % 128;
        int i5 = i4 % 2;
        setBitrateKbps.read(supportFragmentManager, "DownloadedVideoOptions", true);
        if (i5 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private final void AudioAttributesImplApi21Parcelizer(int p0) {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = ((i2 ^ 99) | (i2 & 99)) << 1;
        int i4 = -(((~i2) & 99) | (i2 & (-100)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        int requestedOrientation = getRequestedOrientation();
        Boolean bool = Boolean.TRUE;
        if (requestedOrientation == -1) {
            int i7 = setSessionImpl;
            int i8 = i7 & 111;
            int i9 = i7 | 111;
            int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
            onSkipToNext = i10 % 128;
            if (i10 % 2 == 0 ? p0 == 2 : p0 == 5) {
                getLatestBitrateEstimate.MediaDescriptionCompat.RemoteActionCompatParcelizer(bool);
                int i11 = onSkipToNext;
                int i12 = (i11 & 55) + (i11 | 55);
                setSessionImpl = i12 % 128;
                int i13 = i12 % 2;
                return;
            }
            getLatestBitrateEstimate.MediaDescriptionCompat.write(bool);
            int i14 = setSessionImpl;
            int i15 = (((i14 | 29) << 1) - (~(-(((~i14) & 29) | (i14 & (-30)))))) - 1;
            onSkipToNext = i15 % 128;
            int i16 = i15 % 2;
            return;
        }
        Object obj = null;
        if (getRequestedOrientation() == 6) {
            int i17 = onSkipToNext;
            int i18 = i17 + 77;
            setSessionImpl = i18 % 128;
            int i19 = i18 % 2;
            if (p0 == 2) {
                int i20 = i17 & 5;
                int i21 = -(-((i17 ^ 5) | i20));
                int i22 = (i20 & i21) + (i20 | i21);
                setSessionImpl = i22 % 128;
                if (i22 % 2 == 0) {
                    getLatestBitrateEstimate.MediaDescriptionCompat.RemoteActionCompatParcelizer(Boolean.FALSE);
                    int i23 = 92 / 0;
                } else {
                    getLatestBitrateEstimate.MediaDescriptionCompat.RemoteActionCompatParcelizer(Boolean.FALSE);
                }
                int i24 = onSkipToNext;
                int i25 = i24 & 111;
                int i26 = -(-((i24 ^ 111) | i25));
                int i27 = ((i25 | i26) << 1) - (i26 ^ i25);
                setSessionImpl = i27 % 128;
                if (i27 % 2 != 0) {
                    return;
                }
                obj.hashCode();
                throw null;
            }
        }
        if (getRequestedOrientation() == 7) {
            int i28 = onSkipToNext;
            int i29 = i28 & 37;
            int i30 = (~i29) & (i28 | 37);
            int i31 = -(-(i29 << 1));
            int i32 = (i30 & i31) + (i31 | i30);
            setSessionImpl = i32 % 128;
            int i33 = i32 % 2;
            if (p0 == 1) {
                int i34 = i28 + 83;
                setSessionImpl = i34 % 128;
                if (i34 % 2 == 0) {
                    getLatestBitrateEstimate.MediaDescriptionCompat.write(Boolean.FALSE);
                    int i35 = 99 / 0;
                } else {
                    getLatestBitrateEstimate.MediaDescriptionCompat.write(Boolean.FALSE);
                }
            }
        }
        int i36 = onSkipToNext;
        int i37 = ((i36 ^ 121) | (i36 & 121)) << 1;
        int i38 = -(((~i36) & 121) | (i36 & (-122)));
        int i39 = (i37 ^ i38) + ((i38 & i37) << 1);
        setSessionImpl = i39 % 128;
        if (i39 % 2 == 0) {
            throw null;
        }
    }

    private static /* synthetic */ Object ensureViewModelStore(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 117;
        int i4 = -(-((i2 ^ 117) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        updateNavigation updatenavigation = updateNavigation.INSTANCE;
        LessonVideoActivity lessonVideoActivity2 = lessonVideoActivity;
        if (i6 != 0) {
            return Boolean.valueOf(updateNavigation.read((Activity) lessonVideoActivity2));
        }
        updateNavigation.read((Activity) lessonVideoActivity2);
        throw null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:65:0x05a4, code lost:
    
        if ((!((java.lang.Boolean) write(new java.lang.Object[]{r18}, com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1059214298, com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1059214229)).booleanValue()) != true) goto L66;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:15:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0238  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0290  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x02a0  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x02c9  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03cd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x043b  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0440  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void ActionBarLayoutParams() {
        /*
            Method dump skipped, instruction units count: 1832
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.ActionBarLayoutParams():void");
    }

    private static /* synthetic */ Object MediaSessionCompatToken(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 101;
        int i4 = -(-((i2 ^ 101) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        onSkipToNext = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            isXdsControlCode.Companion writeVar = isXdsControlCode.INSTANCE;
            isXdsControlCode.Companion.write("video_config_changed", str);
            obj.hashCode();
            throw null;
        }
        isXdsControlCode.Companion writeVar2 = isXdsControlCode.INSTANCE;
        Intent intentWrite = isXdsControlCode.Companion.write("video_config_changed", str);
        int i6 = setSessionImpl;
        int i7 = i6 & 67;
        int i8 = i7 + ((i6 ^ 67) | i7);
        onSkipToNext = i8 % 128;
        int i9 = i8 % 2;
        lessonVideoActivity.AudioAttributesCompatParcelizer(intentWrite);
        int i10 = setSessionImpl;
        int i11 = (i10 & (-62)) | ((~i10) & 61);
        int i12 = (i10 & 61) << 1;
        int i13 = (i11 & i12) + (i12 | i11);
        onSkipToNext = i13 % 128;
        if (i13 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object ParcelableVolumeInfo(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (i2 & 80) + (i2 | 80);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        setSessionImpl = i4 % 128;
        int i5 = i4 % 2;
        int i6 = lessonVideoActivity.getResources().getDisplayMetrics().widthPixels;
        Resources resources = lessonVideoActivity.getResources();
        int i7 = setSessionImpl;
        int i8 = i7 & 75;
        int i9 = (i8 - (~(-(-((i7 ^ 75) | i8))))) - 1;
        onSkipToNext = i9 % 128;
        Object obj = null;
        if (i9 % 2 != 0) {
            int i10 = resources.getDisplayMetrics().widthPixels;
            obj.hashCode();
            throw null;
        }
        int i11 = resources.getDisplayMetrics().widthPixels;
        Object[] objArr2 = {(fromStyleLine) lessonVideoActivity.getMPresenter()};
        float fFloatValue = ((Float) fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -991587359, objArr2, maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 991587363)).floatValue();
        StringBuilder sb = new StringBuilder();
        sb.append(i11);
        int i12 = setSessionImpl;
        int i13 = i12 ^ 41;
        int i14 = ((i12 & 41) | i13) << 1;
        int i15 = -i13;
        int i16 = (i14 ^ i15) + ((i14 & i15) << 1);
        onSkipToNext = i16 % 128;
        int i17 = i16 % 2;
        sb.append(" ");
        sb.append(fFloatValue);
        String string = sb.toString();
        int i18 = onSkipToNext;
        int i19 = (i18 ^ 117) + ((i18 & 117) << 1);
        setSessionImpl = i19 % 128;
        if (i19 % 2 == 0) {
            buildResolutionString.IconCompatParcelizer("getNewVideoHeight", string.toString());
            ((Boolean) write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1059214298, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1059214229)).booleanValue();
            throw null;
        }
        buildResolutionString.IconCompatParcelizer("getNewVideoHeight", string.toString());
        if (!(!((Boolean) write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1059214298, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1059214229)).booleanValue())) {
            Object[] objArr3 = {(fromStyleLine) lessonVideoActivity.getMPresenter()};
            int iFloatValue = (int) (i6 * ((Float) fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -991587359, objArr3, maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 991587363)).floatValue());
            int i20 = setSessionImpl + 5;
            onSkipToNext = i20 % 128;
            int i21 = i20 % 2;
            return Integer.valueOf(iFloatValue);
        }
        int i22 = setSessionImpl;
        int i23 = i22 & 21;
        int i24 = ((((i22 ^ 21) | i23) << 1) - (~(-((i22 | 21) & (~i23))))) - 1;
        onSkipToNext = i24 % 128;
        int i25 = i24 % 2;
        int i26 = lessonVideoActivity.getResources().getDisplayMetrics().heightPixels;
        int i27 = setSessionImpl;
        int i28 = i27 & 31;
        int i29 = (((i27 | 31) & (~i28)) - (~(-(-(i28 << 1))))) - 1;
        onSkipToNext = i29 % 128;
        if (i29 % 2 != 0) {
            lessonVideoActivity.onSetCaptioningEnabled();
            obj.hashCode();
            throw null;
        }
        if (!(!lessonVideoActivity.onSetCaptioningEnabled())) {
            int i30 = setSessionImpl;
            int i31 = (((i30 | 12) << 1) - (i30 ^ 12)) - 1;
            onSkipToNext = i31 % 128;
            int i32 = i31 % 2;
            if (lessonVideoActivity.getRequestedOrientation() == 2) {
                int i33 = onSkipToNext;
                int i34 = i33 & 125;
                int i35 = (((i33 ^ 125) | i34) << 1) - ((i33 | 125) & (~i34));
                setSessionImpl = i35 % 128;
                int i36 = i35 % 2;
                Object[] objArr4 = {(fromStyleLine) lessonVideoActivity.getMPresenter()};
                int iFloatValue2 = (int) (((double) i6) * 0.6d * ((double) ((Float) fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -991587359, objArr4, maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 991587363)).floatValue()));
                int i37 = onSkipToNext;
                int i38 = i37 & 93;
                int i39 = (i37 | 93) & (~i38);
                int i40 = -(-(i38 << 1));
                int i41 = (i39 & i40) + (i39 | i40);
                setSessionImpl = i41 % 128;
                int i42 = i41 % 2;
                return Integer.valueOf(iFloatValue2);
            }
        }
        Object[] objArr5 = {(fromStyleLine) lessonVideoActivity.getMPresenter()};
        int iFloatValue3 = (int) (i26 * ((Float) fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -991587359, objArr5, maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 991587363)).floatValue());
        int i43 = setSessionImpl;
        int i44 = (((i43 & (-16)) | ((~i43) & 15)) - (~((i43 & 15) << 1))) - 1;
        onSkipToNext = i44 % 128;
        int i45 = i44 % 2;
        return Integer.valueOf(iFloatValue3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:35:0x012d  */
    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onBackPressed() {
        /*
            Method dump skipped, instruction units count: 462
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.onBackPressed():void");
    }

    private static /* synthetic */ Object onRetainCustomNonConfigurationInstance(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = ((i2 | 41) << 1) - (i2 ^ 41);
        onSkipToNext = i3 % 128;
        int i4 = i3 % 2;
        lessonVideoActivity.write = read.IconCompatParcelizer;
        lessonVideoActivity.setRequestedOrientation(7);
        int i5 = onSkipToNext + 7;
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        lessonVideoActivity.ActionBarLayoutParams();
        if (i6 != 0) {
            return null;
        }
        int i7 = 42 / 0;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object menuHostHelperlambda0(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext + 81;
        setSessionImpl = i2 % 128;
        int i3 = i2 % 2;
        if (!(!((fromStyleLine) lessonVideoActivity.getMPresenter()).onCustomAction())) {
            int i4 = onSkipToNext;
            int i5 = i4 ^ 35;
            int i6 = -(-((i4 & 35) << 1));
            int i7 = (i5 & i6) + (i6 | i5);
            setSessionImpl = i7 % 128;
            int i8 = i7 % 2;
            Object[] objArr2 = {(fromStyleLine) lessonVideoActivity.getMPresenter(), true};
            fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -186734645, objArr2, maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 186734687);
            int i9 = setSessionImpl + 123;
            onSkipToNext = i9 % 128;
            if (i9 % 2 != 0) {
                int i10 = 5 % 5;
            }
        }
        int i11 = setSessionImpl;
        int i12 = i11 & 123;
        int i13 = ((i11 ^ 123) | i12) << 1;
        int i14 = -((i11 | 123) & (~i12));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        onSkipToNext = i15 % 128;
        int i16 = i15 % 2;
        return null;
    }

    private static /* synthetic */ Object getLastCustomNonConfigurationInstance(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext + 43;
        setSessionImpl = i2 % 128;
        int i3 = i2 % 2;
        backspace.Companion iconCompatParcelizer = backspace.INSTANCE;
        lessonVideoActivity.AudioAttributesCompatParcelizer(backspace.Companion.AudioAttributesCompatParcelizer(false));
        int i4 = onSkipToNext;
        int i5 = (i4 & 45) + (i4 | 45);
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        return null;
    }

    private static /* synthetic */ Object createFullyDrawnExecutor(Object[] objArr) {
        handlePreambleAddressCode[] handlepreambleaddresscodeArr;
        char c;
        char c2 = 0;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl + 123;
        int i3 = i2 % 128;
        onSkipToNext = i3;
        if (i2 % 2 != 0) {
            handlepreambleaddresscodeArr = new handlePreambleAddressCode[96];
            handlepreambleaddresscodeArr[0] = lessonVideoActivity.onPrepareFromMediaId;
        } else {
            handlepreambleaddresscodeArr = new handlePreambleAddressCode[6];
            handlepreambleaddresscodeArr[0] = lessonVideoActivity.onPrepareFromMediaId;
            c2 = 1;
        }
        int i4 = i3 & 67;
        int i5 = i4 + ((i3 ^ 67) | i4);
        int i6 = i5 % 128;
        setSessionImpl = i6;
        if (i5 % 2 == 0) {
            handlepreambleaddresscodeArr[c2] = lessonVideoActivity.onPrepare;
            handlepreambleaddresscodeArr[2] = lessonVideoActivity.onPlayFromSearch;
            c = 5;
        } else {
            handlepreambleaddresscodeArr[c2] = lessonVideoActivity.onPrepare;
            handlepreambleaddresscodeArr[2] = lessonVideoActivity.onPlayFromSearch;
            c = 3;
        }
        int i7 = i6 + 17;
        int i8 = i7 % 128;
        onSkipToNext = i8;
        int i9 = i7 % 2;
        handlepreambleaddresscodeArr[c] = lessonVideoActivity.onPrepareFromSearch;
        handlepreambleaddresscodeArr[4] = lessonVideoActivity.onPause;
        AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = lessonVideoActivity.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i10 = ((i8 & (-36)) | ((~i8) & 35)) + ((i8 & 35) << 1);
        int i11 = i10 % 128;
        setSessionImpl = i11;
        if (i10 % 2 == 0) {
            handlepreambleaddresscodeArr[5] = audioAttributesCompatParcelizer;
            throw null;
        }
        handlepreambleaddresscodeArr[5] = audioAttributesCompatParcelizer;
        int i12 = i11 ^ 21;
        int i13 = (i11 & 21) << 1;
        int i14 = (i12 & i13) + (i12 | i13);
        onSkipToNext = i14 % 128;
        int i15 = i14 % 2;
        return handlepreambleaddresscodeArr;
    }

    @Override // o.parseAlignment.AudioAttributesCompatParcelizer
    public final void AudioAttributesImplBaseParcelizer(String p0) {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (i2 & (-106)) | ((~i2) & 105);
        int i4 = -(-((i2 & 105) << 1));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        finalizeCurrentPacket.Companion remoteActionCompatParcelizer = finalizeCurrentPacket.INSTANCE;
        int i7 = onSkipToNext;
        int i8 = (i7 & 71) + (i7 | 71);
        setSessionImpl = i8 % 128;
        int i9 = i8 % 2;
        AudioAttributesCompatParcelizer(finalizeCurrentPacket.Companion.RemoteActionCompatParcelizer(p0, true));
        int i10 = setSessionImpl;
        int i11 = (i10 ^ 27) + ((i10 & 27) << 1);
        onSkipToNext = i11 % 128;
        if (i11 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.parseAlignment.AudioAttributesCompatParcelizer
    public final void AudioAttributesImplApi21Parcelizer(String p0) {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (i2 & 38) + (i2 | 38);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        onSkipToNext = i4 % 128;
        int i5 = i4 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        finalizeCurrentPacket.Companion remoteActionCompatParcelizer = finalizeCurrentPacket.INSTANCE;
        int i6 = onSkipToNext;
        int i7 = (((i6 ^ 47) | (i6 & 47)) << 1) - (((~i6) & 47) | (i6 & (-48)));
        setSessionImpl = i7 % 128;
        AudioAttributesCompatParcelizer(i7 % 2 == 0 ? finalizeCurrentPacket.Companion.RemoteActionCompatParcelizer(p0, true) : finalizeCurrentPacket.Companion.RemoteActionCompatParcelizer(p0, false));
        int i8 = setSessionImpl;
        int i9 = i8 ^ 91;
        int i10 = -(-((i8 & 91) << 1));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        onSkipToNext = i11 % 128;
        int i12 = i11 % 2;
    }

    private static /* synthetic */ Object onConfigurationChanged(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        String str = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int iIntValue = ((Number) objArr[3]).intValue();
        SubtitleDecoderFactory1 subtitleDecoderFactory1 = (SubtitleDecoderFactory1) objArr[4];
        List list = (List) objArr[5];
        ActiveRecallQbankLessonUiModel activeRecallQbankLessonUiModel = (ActiveRecallQbankLessonUiModel) objArr[6];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 83;
        int i4 = (((i2 ^ 83) | i3) << 1) - ((i2 | 83) & (~i3));
        onSkipToNext = i4 % 128;
        int i5 = i4 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(subtitleDecoderFactory1, "");
        int i6 = (-2) - ((onSkipToNext + 80) ^ (-1));
        setSessionImpl = i6 % 128;
        if (i6 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(list, "");
            lessonVideoActivity.RemoteActionCompatParcelizer();
            LessonCompletedDialog.Companion remoteActionCompatParcelizer = LessonCompletedDialog.INSTANCE;
            throw null;
        }
        toMagicModuleMetaRepoModel.write(list, "");
        lessonVideoActivity.RemoteActionCompatParcelizer();
        LessonCompletedDialog.Companion remoteActionCompatParcelizer2 = LessonCompletedDialog.INSTANCE;
        int i7 = onSkipToNext;
        int i8 = i7 & 25;
        int i9 = (i7 ^ 25) | i8;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        setSessionImpl = i10 % 128;
        int i11 = i10 % 2;
        LessonCompletedDialog lessonCompletedDialogWrite = LessonCompletedDialog.Companion.write(str, iIntValue, list, activeRecallQbankLessonUiModel, zBooleanValue);
        int i12 = onSkipToNext;
        int i13 = (i12 ^ 23) + ((i12 & 23) << 1);
        setSessionImpl = i13 % 128;
        int i14 = i13 % 2;
        lessonCompletedDialogWrite.show(lessonVideoActivity.getSupportFragmentManager(), "video_dialog");
        int i15 = onSkipToNext;
        int i16 = (i15 ^ 27) + ((i15 & 27) << 1);
        setSessionImpl = i16 % 128;
        int i17 = i16 % 2;
        lessonVideoActivity.AudioAttributesCompatParcelizer(lessonCompletedDialogWrite);
        int i18 = setSessionImpl;
        int i19 = i18 & 109;
        int i20 = ((i18 | 109) & (~i19)) + (i19 << 1);
        onSkipToNext = i20 % 128;
        int i21 = i20 % 2;
        return null;
    }

    private static /* synthetic */ Object onRewind(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 83;
        int i4 = ((i2 | 83) & (~i3)) + (i3 << 1);
        onSkipToNext = i4 % 128;
        int i5 = i4 % 2;
        LinearLayout linearLayout = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().RatingCompat;
        int i6 = setSessionImpl;
        int i7 = (-2) - (((i6 & 126) + (i6 | 126)) ^ (-1));
        onSkipToNext = i7 % 128;
        int i8 = i7 % 2;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(linearLayout);
        int i9 = onSkipToNext;
        int i10 = i9 & 41;
        int i11 = i10 + ((i9 ^ 41) | i10);
        setSessionImpl = i11 % 128;
        Object obj = null;
        if (i11 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.parseAlignment.write
    public final void onCreate() {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = ((i2 ^ 9) | (i2 & 9)) << 1;
        int i4 = -(((~i2) & 9) | (i2 & (-10)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        LinearLayout linearLayout = removeOnPictureInPictureModeChangedListener().RatingCompat;
        if (i6 != 0) {
            throw null;
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout, "");
        PlayerControlViewExternalSyntheticLambda1.write(linearLayout);
        int i7 = setSessionImpl;
        int i8 = ((i7 ^ 35) | (i7 & 35)) << 1;
        int i9 = -(((~i7) & 35) | (i7 & (-36)));
        int i10 = (i8 & i9) + (i9 | i8);
        onSkipToNext = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // o.parseAlignment.write
    public final void accessgetReportFullyDrawnExecutorp() {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 ^ 19;
        int i4 = (i2 & 19) << 1;
        int i5 = ((i3 | i4) << 1) - (i3 ^ i4);
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        this.AudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer;
        int i7 = i2 & 53;
        int i8 = -(-(i2 | 53));
        int i9 = ((i7 | i8) << 1) - (i7 ^ i8);
        setSessionImpl = i9 % 128;
        if (i9 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.parseAlignment.write
    public final void onSaveInstanceState() {
        int i = 2 % 2;
        RemoteActionCompatParcelizer();
        DefaultTrackSelectorExternalSyntheticLambda6 defaultTrackSelectorExternalSyntheticLambda6 = new DefaultTrackSelectorExternalSyntheticLambda6(this, this, null, 4, null);
        int i2 = setSessionImpl;
        int i3 = (i2 ^ 73) + ((i2 & 73) << 1);
        onSkipToNext = i3 % 128;
        if (i3 % 2 != 0) {
            this.AudioAttributesImplApi21Parcelizer = defaultTrackSelectorExternalSyntheticLambda6;
            this.AudioAttributesImplApi21Parcelizer.show();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        this.AudioAttributesImplApi21Parcelizer = defaultTrackSelectorExternalSyntheticLambda6;
        this.AudioAttributesImplApi21Parcelizer.show();
        int i4 = setSessionImpl;
        int i5 = i4 & 15;
        int i6 = i5 + ((i4 ^ 15) | i5);
        onSkipToNext = i6 % 128;
        int i7 = i6 % 2;
    }

    @Override // o.DefaultTrackSelectorExternalSyntheticLambda6.read
    public final void onPlayFromUri() {
        int i = 2 % 2;
        OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        System.identityHashCode(this);
        PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
        Intent intentIconCompatParcelizer = PlanActivity.AudioAttributesCompatParcelizer.IconCompatParcelizer(this);
        int i2 = setSessionImpl;
        int i3 = (i2 | 113) << 1;
        int i4 = -(i2 ^ 113);
        int i5 = (i3 & i4) + (i4 | i3);
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        startActivity(intentIconCompatParcelizer);
        int i7 = onSkipToNext;
        int i8 = i7 & 121;
        int i9 = ((i7 | 121) & (~i8)) + (i8 << 1);
        setSessionImpl = i9 % 128;
        int i10 = i9 % 2;
    }

    private static /* synthetic */ Object accessgetReportFullyDrawnExecutorp(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 ^ 29;
        int i4 = (i2 & 29) << 1;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        PlanActivity.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer = PlanActivity.RemoteActionCompatParcelizer;
        LessonVideoActivity lessonVideoActivity2 = lessonVideoActivity;
        int i7 = setSessionImpl;
        int i8 = ((i7 | 115) << 1) - (i7 ^ 115);
        onSkipToNext = i8 % 128;
        int i9 = i8 % 2;
        String lowerCase = "PRO_VIDEO_ACCESSED".toLowerCase(Locale.ROOT);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lowerCase, "");
        int i10 = onSkipToNext;
        int i11 = (((i10 & (-90)) | ((~i10) & 89)) - (~((i10 & 89) << 1))) - 1;
        setSessionImpl = i11 % 128;
        if (i11 % 2 == 0) {
            lessonVideoActivity.startActivity(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(lessonVideoActivity2, "Pro Subscription Dialog", lowerCase));
            throw null;
        }
        lessonVideoActivity.startActivity(PlanActivity.AudioAttributesCompatParcelizer.AudioAttributesCompatParcelizer(lessonVideoActivity2, "Pro Subscription Dialog", lowerCase));
        int i12 = onSkipToNext;
        int i13 = (i12 ^ 83) + ((i12 & 83) << 1);
        setSessionImpl = i13 % 128;
        int i14 = i13 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:11:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x00b0  */
    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPictureInPictureModeChanged(boolean r12, android.content.res.Configuration r13) {
        /*
            Method dump skipped, instruction units count: 254
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.onPictureInPictureModeChanged(boolean, android.content.res.Configuration):void");
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x004c, code lost:
    
        if (((kotlin.fromStyleLine) r6.getMPresenter()).onCommand() != false) goto L11;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x004e, code lost:
    
        r6.finishAndRemoveTask();
        kotlin.dispatchTouchEvent.read(r6);
        r6 = com.marrow.ui.activities.learn.video.LessonVideoActivity.onSkipToNext;
        r0 = ((r6 & (-62)) | ((~r6) & 61)) + ((r6 & 61) << 1);
        com.marrow.ui.activities.learn.video.LessonVideoActivity.setSessionImpl = r0 % 128;
        r0 = r0 % 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0068, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x003f, code lost:
    
        if (((kotlin.fromStyleLine) r6.getMPresenter()).onCommand() != false) goto L11;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object onRemoveQueueItem(java.lang.Object[] r6) {
        /*
            r0 = 0
            r6 = r6[r0]
            com.marrow.ui.activities.learn.video.LessonVideoActivity r6 = (com.marrow.ui.activities.learn.video.LessonVideoActivity) r6
            r1 = 2
            int r2 = r1 % r1
            int r2 = com.marrow.ui.activities.learn.video.LessonVideoActivity.setSessionImpl
            int r3 = r2 + 124
            r4 = r3 ^ (-1)
            int r3 = r3 << 1
            int r4 = r4 + r3
            int r3 = r4 % 128
            com.marrow.ui.activities.learn.video.LessonVideoActivity.onSkipToNext = r3
            int r4 = r4 % r1
            boolean r3 = r6.MediaDescriptionCompat
            r4 = 0
            if (r3 == 0) goto L69
            r3 = r2 & 93
            int r5 = ~r3
            r2 = r2 | 93
            r2 = r2 & r5
            int r3 = r3 << 1
            int r3 = -r3
            int r3 = -r3
            r5 = r2 | r3
            int r5 = r5 << 1
            r2 = r2 ^ r3
            int r5 = r5 - r2
            int r2 = r5 % 128
            com.marrow.ui.activities.learn.video.LessonVideoActivity.onSkipToNext = r2
            int r5 = r5 % r1
            if (r5 == 0) goto L42
            o.getExtendedEsFrChar r2 = r6.getMPresenter()
            o.fromStyleLine r2 = (kotlin.fromStyleLine) r2
            boolean r2 = r2.onCommand()
            r3 = 83
            int r3 = r3 / r0
            if (r2 == 0) goto L69
            goto L4e
        L42:
            o.getExtendedEsFrChar r0 = r6.getMPresenter()
            o.fromStyleLine r0 = (kotlin.fromStyleLine) r0
            boolean r0 = r0.onCommand()
            if (r0 == 0) goto L69
        L4e:
            r6.finishAndRemoveTask()
            android.content.Context r6 = (android.content.Context) r6
            kotlin.dispatchTouchEvent.read(r6)
            int r6 = com.marrow.ui.activities.learn.video.LessonVideoActivity.onSkipToNext
            r0 = r6 & (-62)
            int r2 = ~r6
            r2 = r2 & 61
            r0 = r0 | r2
            r6 = r6 & 61
            int r6 = r6 << 1
            int r0 = r0 + r6
            int r6 = r0 % 128
            com.marrow.ui.activities.learn.video.LessonVideoActivity.setSessionImpl = r6
            int r0 = r0 % r1
            return r4
        L69:
            super.finish()
            int r6 = com.marrow.ui.activities.learn.video.LessonVideoActivity.setSessionImpl
            r0 = r6 ^ 95
            r2 = r6 & 95
            r0 = r0 | r2
            int r0 = r0 << 1
            r2 = r6 & (-96)
            int r6 = ~r6
            r6 = r6 & 95
            r6 = r6 | r2
            int r0 = r0 - r6
            int r6 = r0 % 128
            com.marrow.ui.activities.learn.video.LessonVideoActivity.onSkipToNext = r6
            int r0 = r0 % r1
            if (r0 != 0) goto L84
            return r4
        L84:
            r4.hashCode()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.onRemoveQueueItem(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object onPlayFromMediaId(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 ^ 67;
        int i4 = -(-((i2 & 67) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        super.onUserLeaveHint();
        lessonVideoActivity.RemoteActionCompatParcelizer();
        if (!lessonVideoActivity.MediaBrowserCompatCustomActionResultReceiver) {
            int i7 = onSkipToNext;
            int i8 = i7 ^ 95;
            int i9 = ((i7 & 95) | i8) << 1;
            int i10 = -i8;
            int i11 = ((i9 | i10) << 1) - (i9 ^ i10);
            setSessionImpl = i11 % 128;
            int i12 = i11 % 2;
            lessonVideoActivity.onCustomAction = true;
            Object[] objArr2 = {(fromStyleLine) lessonVideoActivity.getMPresenter()};
            int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
            int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
            fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 667122472, objArr2, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -667122452);
            int i13 = onSkipToNext;
            int i14 = i13 ^ 27;
            int i15 = ((i13 & 27) | i14) << 1;
            int i16 = -i14;
            int i17 = (i15 ^ i16) + ((i15 & i16) << 1);
            setSessionImpl = i17 % 128;
            int i18 = i17 % 2;
        }
        int i19 = setSessionImpl;
        int i20 = i19 ^ 91;
        int i21 = -(-((i19 & 91) << 1));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        onSkipToNext = i22 % 128;
        Object obj = null;
        if (i22 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r2
      0x0028: PHI (r2v9 o.setViewportSizeToPhysicalDisplaySize) = (r2v8 o.setViewportSizeToPhysicalDisplaySize), (r2v38 o.setViewportSizeToPhysicalDisplaySize) binds: [B:8:0x0026, B:5:0x0021] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28(java.lang.Object[] r11) {
        /*
            Method dump skipped, instruction units count: 284
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object onPanelClosed(Object[] objArr) {
        Icon iconCreateWithResource;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        LessonVideoActivity lessonVideoActivity2 = lessonVideoActivity;
        Intent intent = new Intent("media_control");
        int i2 = setSessionImpl;
        int i3 = (i2 | 57) << 1;
        int i4 = -(((~i2) & 57) | (i2 & (-58)));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        PendingIntent broadcast = PendingIntent.getBroadcast(lessonVideoActivity2, 1, intent.putExtra("control_type", 2), 67108864);
        int i7 = setSessionImpl + 79;
        onSkipToNext = i7 % 128;
        if (i7 % 2 != 0) {
            iconCreateWithResource = Icon.createWithResource(lessonVideoActivity2, R.drawable.exo_icon_pause);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCreateWithResource, "");
            int i8 = 43 / 0;
        } else {
            iconCreateWithResource = Icon.createWithResource(lessonVideoActivity2, R.drawable.exo_icon_pause);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCreateWithResource, "");
        }
        ArrayList arrayList = new ArrayList();
        RemoteAction remoteAction = new RemoteAction(iconCreateWithResource, "Pause", "", broadcast);
        int i9 = onSkipToNext + 71;
        setSessionImpl = i9 % 128;
        int i10 = i9 % 2;
        arrayList.add(remoteAction);
        PictureInPictureParams.Builder builder = lessonVideoActivity.read;
        toMagicModuleMetaRepoModel.write(builder);
        int i11 = setSessionImpl;
        int i12 = i11 & 101;
        int i13 = (i11 ^ 101) | i12;
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        onSkipToNext = i14 % 128;
        int i15 = i14 % 2;
        builder.setActions(arrayList);
        PictureInPictureParams.Builder builder2 = lessonVideoActivity.read;
        toMagicModuleMetaRepoModel.write(builder2);
        int i16 = setSessionImpl;
        int i17 = (((i16 & (-56)) | ((~i16) & 55)) - (~((i16 & 55) << 1))) - 1;
        onSkipToNext = i17 % 128;
        if (i17 % 2 != 0) {
            lessonVideoActivity.setPictureInPictureParams(builder2.build());
            int i18 = 67 / 0;
        } else {
            lessonVideoActivity.setPictureInPictureParams(builder2.build());
        }
        int i19 = setSessionImpl;
        int i20 = i19 | 79;
        int i21 = (i20 << 1) - ((~(i19 & 79)) & i20);
        onSkipToNext = i21 % 128;
        if (i21 % 2 != 0) {
            int i22 = 13 / 0;
        }
        return null;
    }

    @Override // o.parseAlignment.write
    public final void onPreparePanel() {
        PictureInPictureParams.Builder builder;
        int i = 2 % 2;
        LessonVideoActivity lessonVideoActivity = this;
        Intent intent = new Intent("media_control");
        int i2 = setSessionImpl;
        int i3 = i2 & 29;
        int i4 = (i2 ^ 29) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        PendingIntent broadcast = PendingIntent.getBroadcast(lessonVideoActivity, 2, intent.putExtra("control_type", 1), 67108864);
        int i7 = onSkipToNext + 3;
        setSessionImpl = i7 % 128;
        int i8 = i7 % 2;
        Icon iconCreateWithResource = Icon.createWithResource(lessonVideoActivity, R.drawable.exo_icon_play);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(iconCreateWithResource, "");
        ArrayList arrayList = new ArrayList();
        RemoteAction remoteAction = new RemoteAction(iconCreateWithResource, "Play", "", broadcast);
        int i9 = setSessionImpl;
        int i10 = (i9 & 23) + (i9 | 23);
        onSkipToNext = i10 % 128;
        if (i10 % 2 != 0) {
            arrayList.add(remoteAction);
            builder = this.read;
            toMagicModuleMetaRepoModel.write(builder);
            int i11 = 85 / 0;
        } else {
            arrayList.add(remoteAction);
            builder = this.read;
            toMagicModuleMetaRepoModel.write(builder);
        }
        int i12 = setSessionImpl + 45;
        onSkipToNext = i12 % 128;
        Object obj = null;
        if (i12 % 2 != 0) {
            builder.setActions(arrayList);
            toMagicModuleMetaRepoModel.write(this.read);
            obj.hashCode();
            throw null;
        }
        builder.setActions(arrayList);
        PictureInPictureParams.Builder builder2 = this.read;
        toMagicModuleMetaRepoModel.write(builder2);
        setPictureInPictureParams(builder2.build());
        int i13 = onSkipToNext;
        int i14 = i13 & 21;
        int i15 = (((i13 | 21) & (~i14)) - (~(-(-(i14 << 1))))) - 1;
        setSessionImpl = i15 % 128;
        if (i15 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.parseAlignment.write
    public final void read(List<DownloadableResolution> p0, int p1, List<String> p2) {
        boolean z;
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 111;
        int i4 = -(-((i2 ^ 111) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        setSessionImpl = i5 % 128;
        if (i5 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            buildFormat.Companion writeVar = buildFormat.INSTANCE;
            int i6 = 72 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p2, "");
            buildFormat.Companion writeVar2 = buildFormat.INSTANCE;
        }
        int i7 = onSkipToNext;
        int i8 = i7 & 41;
        int i9 = ((((i7 ^ 41) | i8) << 1) - (~(-((i7 | 41) & (~i8))))) - 1;
        setSessionImpl = i9 % 128;
        int i10 = i9 % 2;
        PixelInfo[] pixelInfoArrAudioAttributesCompatParcelizer = buildFormat.Companion.AudioAttributesCompatParcelizer(p0);
        RemoteActionCompatParcelizer();
        LessonVideoActivity lessonVideoActivity = this;
        MediaBrowserCompatSearchResultReceiver mediaBrowserCompatSearchResultReceiver = new MediaBrowserCompatSearchResultReceiver(p2);
        int i11 = setSessionImpl;
        int i12 = (i11 & (-62)) | ((~i11) & 61);
        int i13 = -(-((i11 & 61) << 1));
        int i14 = (i12 ^ i13) + ((i13 & i12) << 1);
        onSkipToNext = i14 % 128;
        int i15 = i14 % 2;
        if (p2.size() <= 1) {
            int i16 = setSessionImpl + 43;
            int i17 = i16 % 128;
            onSkipToNext = i17;
            int i18 = i16 % 2;
            int i19 = ((i17 ^ 41) | (i17 & 41)) << 1;
            int i20 = -(((~i17) & 41) | (i17 & (-42)));
            int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
            setSessionImpl = i21 % 128;
            int i22 = i21 % 2;
            z = false;
        } else {
            z = true;
        }
        isCompatibleForAdaptationWith iscompatibleforadaptationwith = new isCompatibleForAdaptationWith(lessonVideoActivity, pixelInfoArrAudioAttributesCompatParcelizer, mediaBrowserCompatSearchResultReceiver, p1, z);
        int i23 = setSessionImpl;
        int i24 = (i23 & 113) + (i23 | 113);
        onSkipToNext = i24 % 128;
        int i25 = i24 % 2;
        this.AudioAttributesImplApi21Parcelizer = iscompatibleforadaptationwith;
        this.AudioAttributesImplApi21Parcelizer.show();
        int i26 = setSessionImpl;
        int i27 = i26 & 111;
        int i28 = ((i26 | 111) & (~i27)) + (i27 << 1);
        onSkipToNext = i28 % 128;
        int i29 = i28 % 2;
    }

    @Override // o.parseAlignment.write
    public final void ParcelableVolumeInfo() {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 ^ 101;
        int i4 = ((i2 & 101) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 & i5) + (i4 | i5);
        setSessionImpl = i6 % 128;
        int i7 = i6 % 2;
        HlsTrackMetadataEntry1 hlsTrackMetadataEntry1 = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver;
        if (i7 == 0) {
            FrameLayout frameLayout = hlsTrackMetadataEntry1.read;
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        FrameLayout frameLayout2 = hlsTrackMetadataEntry1.read;
        int i8 = setSessionImpl;
        int i9 = i8 & 3;
        int i10 = ((((i8 ^ 3) | i9) << 1) - (~(-((i8 | 3) & (~i9))))) - 1;
        onSkipToNext = i10 % 128;
        int i11 = i10 % 2;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout2, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(frameLayout2);
        int i12 = onSkipToNext + 61;
        setSessionImpl = i12 % 128;
        int i13 = i12 % 2;
    }

    @Override // o.parseAlignment.RemoteActionCompatParcelizer
    public final void AudioAttributesCompatParcelizer(String p0, String p1) throws Throwable {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (i2 & 119) + (i2 | 119);
        setSessionImpl = i3 % 128;
        if (i3 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
            int i4 = 53 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            toMagicModuleMetaRepoModel.write(p1, "");
        }
        Object obj = VideoDownloadFGService.write;
        try {
            Object[] objArr = {this, p0};
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-961561551);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (38891 - (KeyEvent.getMaxKeyCode() >> 16)), 18062 - ExpandableListView.getPackedPositionType(0L), 68 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), -1192855388, false, "RemoteActionCompatParcelizer", new Class[]{Context.class, String.class});
            }
            startForegroundService((Intent) ((Method) objRemoteActionCompatParcelizer).invoke(obj, objArr));
            int i5 = setSessionImpl;
            int i6 = i5 + 51;
            onSkipToNext = i6 % 128;
            int i7 = i6 % 2;
            int i8 = i5 + 107;
            onSkipToNext = i8 % 128;
            if (i8 % 2 != 0) {
                throw null;
            }
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause == null) {
                throw th;
            }
            throw cause;
        }
    }

    private static /* synthetic */ Object addOnMultiWindowModeChangedListener(Object[] objArr) throws Throwable {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = ~OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        int i3 = ~((i2 ^ (-637238827)) | (i2 & (-637238827)));
        int i4 = ((-750601) & i3) | ((~i3) & 750600);
        int i5 = i3 & 750600;
        int i6 = -(-(((i5 & i4) | (i4 ^ i5)) * (-160)));
        int i7 = (((-699667173) | i6) << 1) - (i6 ^ (-699667173));
        int i8 = (-938478439) & i2;
        int i9 = (i2 | (-938478439)) & (~i8);
        int i10 = ~((i9 & i8) | (i9 ^ i8));
        int i11 = (-637238827) & i10;
        int i12 = (i10 | (-637238827)) & (~i11);
        int i13 = -(-(((i12 & i11) | (i12 ^ i11)) * 160));
        int i14 = i7 & i13;
        int i15 = i14 + ((i13 ^ i7) | i14);
        int iIdentityHashCode = System.identityHashCode(lessonVideoActivity);
        int i16 = ~(((-97128949) ^ iIdentityHashCode) | ((-97128949) & iIdentityHashCode));
        int i17 = ((~i16) & 80351476) | ((-80351477) & i16);
        int i18 = i16 & 80351476;
        int i19 = ((i18 & i17) | (i17 ^ i18)) * (-280);
        int i20 = ((~i19) & 340979585) | ((-340979586) & i19);
        int i21 = -(-((i19 & 340979585) << 1));
        int i22 = ((i20 | i21) << 1) - (i21 ^ i20);
        int i23 = ~(((-97128949) ^ iIdentityHashCode) | ((-97128949) & iIdentityHashCode));
        int i24 = (-590458122) ^ iIdentityHashCode;
        int i25 = ~iIdentityHashCode;
        int i26 = (-590458122) & iIdentityHashCode;
        int i27 = (i24 & i26) | (i24 ^ i26);
        int i28 = (i27 | (~i27)) & (~i27);
        int i29 = i23 & i28;
        int i30 = (i23 | i28) & (~i29);
        int i31 = ((i30 & i29) | (i30 ^ i29)) * 140;
        int i32 = ((((~i31) & i22) | ((~i22) & i31)) - (~((i31 & i22) << 1))) - 1;
        int i33 = ((-16777473) & iIdentityHashCode) | ((-16777473) ^ iIdentityHashCode);
        int i34 = (i33 | (~i33)) & (~i33);
        int i35 = (iIdentityHashCode | i25) & (~iIdentityHashCode);
        int i36 = (-97128949) ^ i35;
        int i37 = (-97128949) & i35;
        int i38 = (i37 & i36) | (i36 ^ i37);
        int i39 = i38 & 590458121;
        int i40 = ((i38 | 590458121) & (~i39)) | i39;
        int i41 = (i40 | (~i40)) & (~i40);
        int i42 = ((~i41) & i34) | ((~i34) & i41);
        int i43 = i41 & i34;
        int i44 = (i43 & i42) | (i42 ^ i43);
        int i45 = (i35 & (-590458122)) | ((-590458122) ^ i35);
        int i46 = i45 & 97128948;
        int i47 = (i45 | 97128948) & (~i46);
        int i48 = ~((i47 & i46) | (i47 ^ i46));
        int i49 = ((i48 & i44) | (i44 ^ i48)) * 140;
        Object obj = null;
        if (i15 > ((i32 | i49) << 1) - (i49 ^ i32)) {
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1200052891);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) ((ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1)) + 5289), 19329 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), (TypedValue.complexToFloat(0) > BitmapDescriptorFactory.HUE_RED ? 1 : (TypedValue.complexToFloat(0) == BitmapDescriptorFactory.HUE_RED ? 0 : -1)) + 21, 969842190, false, "INSTANCE", null);
            }
            Object obj2 = ((Field) objRemoteActionCompatParcelizer).get(null);
            try {
                Object[] objArr2 = {lessonVideoActivity};
                Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-920095149);
                if (objRemoteActionCompatParcelizer2 == null) {
                    objRemoteActionCompatParcelizer2 = startForeground.read((char) (5289 - (ViewConfiguration.getScrollDefaultDelay() >> 16)), 19327 - MotionEvent.axisFromString(""), (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 20, -1218334010, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class});
                }
                ((Boolean) ((Method) objRemoteActionCompatParcelizer2).invoke(obj2, objArr2)).booleanValue();
                obj.hashCode();
                throw null;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(1200052891);
        if (objRemoteActionCompatParcelizer3 == null) {
            objRemoteActionCompatParcelizer3 = startForeground.read((char) (5289 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)), 19328 - ExpandableListView.getPackedPositionGroup(0L), 21 - View.MeasureSpec.makeMeasureSpec(0, 0), 969842190, false, "INSTANCE", null);
        }
        Object obj3 = ((Field) objRemoteActionCompatParcelizer3).get(null);
        try {
            Object[] objArr3 = {lessonVideoActivity};
            Object objRemoteActionCompatParcelizer4 = startForeground.RemoteActionCompatParcelizer(-920095149);
            if (objRemoteActionCompatParcelizer4 == null) {
                objRemoteActionCompatParcelizer4 = startForeground.read((char) (ExpandableListView.getPackedPositionChild(0L) + 5290), 19327 - TextUtils.lastIndexOf("", '0', 0, 0), TextUtils.indexOf("", "", 0) + 21, -1218334010, false, "AudioAttributesCompatParcelizer", new Class[]{Context.class});
            }
            boolean zBooleanValue = ((Boolean) ((Method) objRemoteActionCompatParcelizer4).invoke(obj3, objArr3)).booleanValue();
            int i50 = setSessionImpl;
            int i51 = i50 & 77;
            int i52 = -(-((i50 ^ 77) | i51));
            int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
            onSkipToNext = i53 % 128;
            if (i53 % 2 == 0) {
                return Boolean.valueOf(zBooleanValue);
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    private static /* synthetic */ Object onTrimMemory(Object[] objArr) throws Throwable {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (i2 & 93) + (i2 | 93);
        onSkipToNext = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            toMagicModuleMetaRepoModel.write(str2, "");
            throw null;
        }
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1200052891);
        if (objRemoteActionCompatParcelizer == null) {
            objRemoteActionCompatParcelizer = startForeground.read((char) (AndroidCharacter.getMirror('0') + 5241), 19328 - KeyEvent.normalizeMetaState(0), (Process.myTid() >> 22) + 21, 969842190, false, "INSTANCE", null);
        }
        Object obj2 = ((Field) objRemoteActionCompatParcelizer).get(null);
        try {
            Object[] objArr2 = {lessonVideoActivity, str};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(1647474935);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (5289 - Color.blue(0)), 19329 - (AudioTrack.getMaxVolume() > BitmapDescriptorFactory.HUE_RED ? 1 : (AudioTrack.getMaxVolume() == BitmapDescriptorFactory.HUE_RED ? 0 : -1)), ExpandableListView.getPackedPositionGroup(0L) + 21, 477871202, false, "read", new Class[]{Context.class, String.class});
            }
            ((Method) objRemoteActionCompatParcelizer2).invoke(obj2, objArr2);
            int i4 = setSessionImpl;
            int i5 = (i4 ^ 51) + ((i4 & 51) << 1);
            onSkipToNext = i5 % 128;
            if (i5 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        } catch (Throwable th) {
            Throwable cause = th.getCause();
            if (cause != null) {
                throw cause;
            }
            throw th;
        }
    }

    private static /* synthetic */ Object onMenuItemSelected(Object[] objArr) throws Throwable {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        String str = (String) objArr[1];
        VideoInfo videoInfo = (VideoInfo) objArr[2];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 ^ 111;
        int i4 = ((i2 & 111) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        setSessionImpl = i6 % 128;
        int i7 = i6 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        Object obj = null;
        if (videoInfo != null) {
            int i8 = onSkipToNext;
            int i9 = ((i8 ^ 28) + ((i8 & 28) << 1)) - 1;
            setSessionImpl = i9 % 128;
            int i10 = i9 % 2;
            Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(1200052891);
            if (objRemoteActionCompatParcelizer == null) {
                objRemoteActionCompatParcelizer = startForeground.read((char) (Color.red(0) + 5289), 19329 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), 'E' - AndroidCharacter.getMirror('0'), 969842190, false, "INSTANCE", null);
            }
            Object obj2 = ((Field) objRemoteActionCompatParcelizer).get(null);
            Application application = lessonVideoActivity.getApplication();
            int i11 = onSkipToNext;
            int i12 = ((i11 ^ 86) + ((i11 & 86) << 1)) - 1;
            setSessionImpl = i12 % 128;
            int i13 = i12 % 2;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(application, "");
            try {
                if (i13 == 0) {
                    Object[] objArr2 = {application, videoInfo};
                    Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(496794718);
                    if (objRemoteActionCompatParcelizer2 == null) {
                        objRemoteActionCompatParcelizer2 = startForeground.read((char) (Color.argb(0, 0, 0, 0) + 5289), (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1)) + 19327, (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 20, 1674950859, false, "write", new Class[]{Application.class, VideoInfo.class});
                    }
                    ((Method) objRemoteActionCompatParcelizer2).invoke(obj2, objArr2);
                    obj.hashCode();
                    throw null;
                }
                Object[] objArr3 = {application, videoInfo};
                Object objRemoteActionCompatParcelizer3 = startForeground.RemoteActionCompatParcelizer(496794718);
                if (objRemoteActionCompatParcelizer3 == null) {
                    objRemoteActionCompatParcelizer3 = startForeground.read((char) ((ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) + 5288), View.MeasureSpec.getSize(0) + 19328, 21 - TextUtils.indexOf("", "", 0), 1674950859, false, "write", new Class[]{Application.class, VideoInfo.class});
                }
                ((Method) objRemoteActionCompatParcelizer3).invoke(obj2, objArr3);
                int i14 = setSessionImpl;
                int i15 = (i14 ^ 29) + ((i14 & 29) << 1);
                onSkipToNext = i15 % 128;
                int i16 = i15 % 2;
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        int i17 = setSessionImpl;
        int i18 = i17 & 43;
        int i19 = -(-(i17 | 43));
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        onSkipToNext = i20 % 128;
        int i21 = i20 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0099  */
    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onActivityResult(int r8, int r9, android.content.Intent r10) {
        /*
            Method dump skipped, instruction units count: 309
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.onActivityResult(int, int, android.content.Intent):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public final void onPostResume() {
        int i = 2 % 2;
        int i2 = setSessionImpl + 17;
        onSkipToNext = i2 % 128;
        int i3 = i2 % 2;
        super.onPostResume();
        Object[] objArr = {(fromStyleLine) getMPresenter()};
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 770039839, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -770039807);
        int i4 = onSkipToNext + 109;
        setSessionImpl = i4 % 128;
        int i5 = i4 % 2;
    }

    @Override // o.parseAlignment.write
    public final void IconCompatParcelizer(String p0, String p1) {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (i2 & 76) + (i2 | 76);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        onSkipToNext = i4 % 128;
        int i5 = i4 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        int i6 = setSessionImpl;
        int i7 = i6 & 23;
        int i8 = -(-((i6 ^ 23) | i7));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        onSkipToNext = i9 % 128;
        int i10 = i9 % 2;
        RemoteActionCompatParcelizer();
        getRoleFlagMatchScore.Companion companion = getRoleFlagMatchScore.INSTANCE;
        getRoleFlagMatchScore getroleflagmatchscoreIconCompatParcelizer = getRoleFlagMatchScore.Companion.IconCompatParcelizer(this, p0, p1);
        MediaBrowserCompatMediaItem mediaBrowserCompatMediaItem = new MediaBrowserCompatMediaItem();
        System.identityHashCode(this);
        System.identityHashCode(this);
        int iIconCompatParcelizer = DefaultHttpDataSource.Factory.IconCompatParcelizer();
        getRoleFlagMatchScore.read(DefaultHttpDataSource.Factory.IconCompatParcelizer(), -1866970177, new Object[]{getroleflagmatchscoreIconCompatParcelizer, mediaBrowserCompatMediaItem}, 1866970178, DefaultHttpDataSource.Factory.IconCompatParcelizer(), DefaultHttpDataSource.Factory.IconCompatParcelizer(), iIconCompatParcelizer);
        this.AudioAttributesImplApi21Parcelizer = getroleflagmatchscoreIconCompatParcelizer;
        int i11 = setSessionImpl + 121;
        onSkipToNext = i11 % 128;
        int i12 = i11 % 2;
        this.AudioAttributesImplApi21Parcelizer.show();
        int i13 = onSkipToNext;
        int i14 = ((i13 & (-80)) | ((~i13) & 79)) + ((i13 & 79) << 1);
        setSessionImpl = i14 % 128;
        int i15 = i14 % 2;
    }

    private static /* synthetic */ Object MediaBrowserCompatCustomActionResultReceiver(Object[] objArr) {
        argCount argcount;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 95;
        int i4 = (i2 ^ 95) | i3;
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        Fragment fragmentFindFragmentByTag = lessonVideoActivity.getSupportFragmentManager().findFragmentByTag("DownloadedVideoOptions");
        Object obj = null;
        if (fragmentFindFragmentByTag instanceof argCount) {
            int i7 = setSessionImpl;
            int i8 = i7 & 31;
            int i9 = (((i7 ^ 31) | i8) << 1) - ((i7 | 31) & (~i8));
            int i10 = i9 % 128;
            onSkipToNext = i10;
            int i11 = i9 % 2;
            argcount = (argCount) fragmentFindFragmentByTag;
            int i12 = (i10 ^ 59) + ((i10 & 59) << 1);
            setSessionImpl = i12 % 128;
            int i13 = i12 % 2;
        } else {
            int i14 = onSkipToNext;
            int i15 = i14 & 77;
            int i16 = (i14 ^ 77) | i15;
            int i17 = (i15 ^ i16) + ((i16 & i15) << 1);
            setSessionImpl = i17 % 128;
            int i18 = i17 % 2;
            argcount = null;
        }
        if (argcount != null) {
            int i19 = onSkipToNext;
            int i20 = (i19 & 41) + (i19 | 41);
            setSessionImpl = i20 % 128;
            if (i20 % 2 == 0) {
                argcount.dismissAllowingStateLoss();
                obj.hashCode();
                throw null;
            }
            argcount.dismissAllowingStateLoss();
            int i21 = onSkipToNext;
            int i22 = i21 & 61;
            int i23 = ((i21 | 61) & (~i22)) + (i22 << 1);
            setSessionImpl = i23 % 128;
            int i24 = i23 % 2;
        }
        Object tag = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer.getTag(R.id.stream_online);
        int i25 = onSkipToNext;
        int i26 = (i25 ^ 103) + ((i25 & 103) << 1);
        setSessionImpl = i26 % 128;
        int i27 = i26 % 2;
        boolean zRemoteActionCompatParcelizer = toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(tag, Boolean.TRUE);
        PgsDecoder.Companion iconCompatParcelizer = PgsDecoder.INSTANCE;
        PgsDecoder pgsDecoderAudioAttributesCompatParcelizer = PgsDecoder.Companion.AudioAttributesCompatParcelizer(zRemoteActionCompatParcelizer);
        int i28 = setSessionImpl;
        int i29 = (i28 ^ 51) + ((i28 & 51) << 1);
        onSkipToNext = i29 % 128;
        int i30 = i29 % 2;
        pgsDecoderAudioAttributesCompatParcelizer.show(lessonVideoActivity.getSupportFragmentManager(), "DownloadedVideoOptions");
        if (i30 != 0) {
            int i31 = 18 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object getFullyDrawnReporter(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        MaxDownloadReachedArgs maxDownloadReachedArgs = (MaxDownloadReachedArgs) objArr[1];
        int i = 2 % 2;
        int i2 = onSkipToNext + 43;
        setSessionImpl = i2 % 128;
        if (i2 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(maxDownloadReachedArgs, "");
            lessonVideoActivity.RemoteActionCompatParcelizer();
            Slider.Companion remoteActionCompatParcelizer = Slider.INSTANCE;
            int i3 = 64 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(maxDownloadReachedArgs, "");
            lessonVideoActivity.RemoteActionCompatParcelizer();
            Slider.Companion remoteActionCompatParcelizer2 = Slider.INSTANCE;
        }
        Slider sliderWrite = Slider.Companion.write(maxDownloadReachedArgs);
        sliderWrite.show(lessonVideoActivity.getSupportFragmentManager(), "MaxDownloadReachedDialog");
        int i4 = onSkipToNext;
        int i5 = ((i4 ^ 25) | (i4 & 25)) << 1;
        int i6 = -(((~i4) & 25) | (i4 & (-26)));
        int i7 = (i5 & i6) + (i6 | i5);
        setSessionImpl = i7 % 128;
        int i8 = i7 % 2;
        lessonVideoActivity.AudioAttributesCompatParcelizer(sliderWrite);
        int i9 = setSessionImpl;
        int i10 = (i9 & (-96)) | ((~i9) & 95);
        int i11 = -(-((i9 & 95) << 1));
        int i12 = (i10 ^ i11) + ((i11 & i10) << 1);
        onSkipToNext = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 81 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object onUserLeaveHint(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = ((i2 ^ 122) + ((i2 & 122) << 1)) - 1;
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        setThumbRadius.Companion remoteActionCompatParcelizer = setThumbRadius.INSTANCE;
        lessonVideoActivity.startActivity(setThumbRadius.Companion.RemoteActionCompatParcelizer(lessonVideoActivity));
        int i5 = onSkipToNext + 119;
        setSessionImpl = i5 % 128;
        Object obj = null;
        if (i5 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    @Override // o.parseAlignment.write
    public final void addOnTrimMemoryListener() {
        int i = 2 % 2;
        RemoteActionCompatParcelizer();
        normalizeUndeterminedLanguageToNull normalizeundeterminedlanguagetonull = new normalizeUndeterminedLanguageToNull(this);
        normalizeundeterminedlanguagetonull.RemoteActionCompatParcelizer(new MediaMetadataCompat());
        int i2 = setSessionImpl;
        int i3 = i2 ^ 27;
        int i4 = (i2 & 27) << 1;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        this.AudioAttributesImplApi21Parcelizer = normalizeundeterminedlanguagetonull;
        this.AudioAttributesImplApi21Parcelizer.show();
        int i7 = onSkipToNext;
        int i8 = i7 & 95;
        int i9 = -(-((i7 ^ 95) | i8));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        setSessionImpl = i10 % 128;
        int i11 = i10 % 2;
    }

    @Override // o.parseAlignment.write
    public final boolean r8lambdaKUbBm7ckfqTc9QCgukC86fguu4() {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 121;
        int i4 = (i2 | 121) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 & i5) + (i4 | i5);
        setSessionImpl = i6 % 128;
        int i7 = i6 % 2;
        TrainingApplication trainingApplicationOnRemoveQueueItemAt = onRemoveQueueItemAt();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(trainingApplicationOnRemoveQueueItemAt, "");
        int i8 = setSessionImpl;
        int i9 = (i8 & 113) + (i8 | 113);
        onSkipToNext = i9 % 128;
        TrainingApplication trainingApplication = trainingApplicationOnRemoveQueueItemAt;
        if (i9 % 2 != 0) {
            requestPlayPauseAccessibilityFocus.AudioAttributesCompatParcelizer(trainingApplication);
            throw null;
        }
        boolean zAudioAttributesCompatParcelizer = requestPlayPauseAccessibilityFocus.AudioAttributesCompatParcelizer(trainingApplication);
        int i10 = setSessionImpl;
        int i11 = (i10 & 90) + (i10 | 90);
        int i12 = (i11 ^ (-1)) + (i11 << 1);
        onSkipToNext = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 76 / 0;
        }
        return zAudioAttributesCompatParcelizer;
    }

    @Override // o.parseAlignment.write
    public final requestPlayPauseAccessibilityFocus.RemoteActionCompatParcelizer onPrepareFromMediaId() {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (i2 | 5) << 1;
        int i4 = -(i2 ^ 5);
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        TrainingApplication trainingApplicationOnRemoveQueueItemAt = onRemoveQueueItemAt();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(trainingApplicationOnRemoveQueueItemAt, "");
        int i7 = onSkipToNext + 57;
        setSessionImpl = i7 % 128;
        int i8 = i7 % 2;
        requestPlayPauseAccessibilityFocus.RemoteActionCompatParcelizer remoteActionCompatParcelizerIconCompatParcelizer = requestPlayPauseAccessibilityFocus.IconCompatParcelizer(trainingApplicationOnRemoveQueueItemAt);
        int i9 = onSkipToNext;
        int i10 = ((i9 ^ 87) - (~((i9 & 87) << 1))) - 1;
        setSessionImpl = i10 % 128;
        if (i10 % 2 == 0) {
            int i11 = 82 / 0;
        }
        return remoteActionCompatParcelizerIconCompatParcelizer;
    }

    /* JADX INFO: renamed from: com.marrow.ui.activities.learn.video.LessonVideoActivity$RemoteActionCompatParcelizer, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\u0015\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J8\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00052\b\b\u0002\u0010.\u001a\u00020\u00072\b\b\u0002\u0010/\u001a\u0002002\n\b\u0002\u00101\u001a\u0004\u0018\u000102H\u0007J:\u0010)\u001a\u00020*2\u0006\u0010+\u001a\u00020,2\b\u0010-\u001a\u0004\u0018\u00010\u00052\u0006\u00103\u001a\u0002002\u0006\u00104\u001a\u0002002\u0006\u00105\u001a\u0002002\u0006\u00106\u001a\u000200H\u0007R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\u001dX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010#\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020%X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010&\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010(\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u00067"}, d2 = {"Lcom/marrow/ui/activities/learn/video/LessonVideoActivity$Companion;", "", "<init>", "()V", "TAG", "", "CUSTOM_ACTIVITY_RESULT_ERROR", "", "REQ_TIMESTAMP", "REQ_OPEN_LINK", "EXTRA_RESULT_TIMESTAMP", "EXTRA_LESSON_ID", "EXTRA_VIDEO_AUTOPLAY", "EXTRA_IS_VIDEO_ORIGIN", "EXTRA_IS_FROM_WATCH_NEXT", "EXTRA_EXCLUDE_OPTIONAL_VIDEOS", "EXTRA_START_TIME_OF_VIDEO", "EXTRA_IS_FROM_BOOKMARK_SCREEN", "EVENT_PIP_MOVEMENT", "KEY_PIP_SCALE_FACTOR", "KEY_PIP_ACTION_ADJUST_BOUNDS", "KEY_HANDLE_LEFT_DOCK_CLICKED", "KEY_HANDLE_RIGHT_DOCK_CLICKED", "KEY_PIP_DELTA_X", "KEY_PIP_DELTA_Y", "KEY_IS_IN_INTERNAL_PIP_MODE", "CONTROL_TYPE_PLAY", "CONTROL_TYPE_PAUSE", "FREE_OTHERVIEW_IDS", "", "PAID_OTHERVIEW_IDS", "ACTION_ACTIVITY_FINISH", "ACTION_MEDIA_CONTROL", "EXTRA_CONTROL_TYPE", "EXTRA_ANALYTICS_SOURCE", "AUTO_ROTATE_ENABLED", "TABLET_SCREEN_SIZE", "", "KEY_SETTINGS_RESULT", "TAG_DOWNLOADED_VIDEO_OPTIONS", "REVISION_SUBJECT_VIDEO_COMPLETION_DIALOG", "getLaunchIntent", "Landroid/content/Intent;", LogCategory.CONTEXT, "Landroid/content/Context;", "lessonId", "startTime", "isFromBookmarkScreen", "", "analyticsSource", "Lcom/marrow2/ui/video/lesson_list/analytics/VideoLessonListAnalytics$Source;", "isVideoAutoplay", "isFromVideoScreen", "excludeOptionalVideos", "isFromWatchNext", "app_release"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static /* synthetic */ Intent RemoteActionCompatParcelizer(Context context, String str, int i, boolean z, int i2) {
            if ((i2 & 4) != 0) {
                i = 0;
            }
            if ((i2 & 8) != 0) {
                z = false;
            }
            return AudioAttributesCompatParcelizer(context, str, i, z, null);
        }

        @getMagicModuleMeta
        public static Intent AudioAttributesCompatParcelizer(Context context, String str, int i, boolean z, StandardIntegrityVerdictOptOut.read readVar) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(str, "");
            Intent intent = new Intent(context, (Class<?>) LessonVideoActivity.class);
            if (context.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
                intent.setFlags(268435456);
            }
            intent.putExtra("lesson_id", str);
            intent.putExtra("video_autoplay", false);
            intent.putExtra("is_video_origin", false);
            intent.putExtra("exclude_optional_videos", false);
            intent.putExtra("start_time", i);
            intent.putExtra("is_from_bookmark_screen", z);
            intent.putExtra("source", readVar);
            return intent;
        }

        @getMagicModuleMeta
        public static Intent AudioAttributesCompatParcelizer(Context context, String str, boolean z, boolean z2, boolean z3, boolean z4) {
            toMagicModuleMetaRepoModel.write(context, "");
            Intent intent = new Intent(context, (Class<?>) LessonVideoActivity.class);
            if (context.getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
                intent.setFlags(268435456);
            }
            intent.putExtra("lesson_id", str);
            intent.putExtra("video_autoplay", z);
            intent.putExtra("is_video_origin", z2);
            intent.putExtra("exclude_optional_videos", z3);
            intent.putExtra("is_from_watch_next", z4);
            return intent;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }

        @getMagicModuleMeta
        public final Intent read(Context context, String str, int i) {
            toMagicModuleMetaRepoModel.write(context, "");
            toMagicModuleMetaRepoModel.write(str, "");
            return RemoteActionCompatParcelizer(context, str, 0, false, 24);
        }
    }

    @Override // o.parseAlignment.write
    public final boolean RemoteActionCompatParcelizer(VideoCacheInfo p0) throws Throwable {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (i2 & 52) + (i2 | 52);
        int i4 = (i3 ^ (-1)) + (i3 << 1);
        setSessionImpl = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            FileProviderModule fileProviderModule = FileProviderModule.INSTANCE;
            onRemoveQueueItemAt();
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(p0, "");
        FileProviderModule fileProviderModule2 = FileProviderModule.INSTANCE;
        TrainingApplication trainingApplicationOnRemoveQueueItemAt = onRemoveQueueItemAt();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(trainingApplicationOnRemoveQueueItemAt, "");
        File fileIconCompatParcelizer = fileProviderModule2.IconCompatParcelizer(trainingApplicationOnRemoveQueueItemAt);
        int i5 = setSessionImpl;
        int i6 = (((i5 | 114) << 1) - (i5 ^ 114)) - 1;
        onSkipToNext = i6 % 128;
        if (i6 % 2 == 0) {
            try {
                Object[] objArr = {fileIconCompatParcelizer, p0};
                Object objRemoteActionCompatParcelizer = startForeground.RemoteActionCompatParcelizer(-367321276);
                if (objRemoteActionCompatParcelizer == null) {
                    objRemoteActionCompatParcelizer = startForeground.read((char) (46709 - KeyEvent.keyCodeFromString("")), (ViewConfiguration.getScrollBarFadeDuration() >> 16) + 17371, Color.red(0) + 15, -1806509103, false, "write", new Class[]{File.class, VideoCacheInfo.class});
                }
                return ((Boolean) ((Method) objRemoteActionCompatParcelizer).invoke(null, objArr)).booleanValue();
            } catch (Throwable th) {
                Throwable cause = th.getCause();
                if (cause != null) {
                    throw cause;
                }
                throw th;
            }
        }
        try {
            Object[] objArr2 = {fileIconCompatParcelizer, p0};
            Object objRemoteActionCompatParcelizer2 = startForeground.RemoteActionCompatParcelizer(-367321276);
            if (objRemoteActionCompatParcelizer2 == null) {
                objRemoteActionCompatParcelizer2 = startForeground.read((char) (((byte) KeyEvent.getModifierMetaStateMask()) + 46710), 17371 - (Process.myPid() >> 22), 16 - (SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)), -1806509103, false, "write", new Class[]{File.class, VideoCacheInfo.class});
            }
            ((Boolean) ((Method) objRemoteActionCompatParcelizer2).invoke(null, objArr2)).booleanValue();
            obj.hashCode();
            throw null;
        } catch (Throwable th2) {
            Throwable cause2 = th2.getCause();
            if (cause2 != null) {
                throw cause2;
            }
            throw th2;
        }
    }

    @Override // o.parseAlignment.write
    public final void addOnPictureInPictureModeChangedListener() {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 25;
        int i4 = ((i2 ^ 25) | i3) << 1;
        int i5 = -((i2 | 25) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        setSessionImpl = i6 % 128;
        int i7 = i6 % 2;
        setResult(120);
        finish();
        int i8 = setSessionImpl;
        int i9 = (((i8 | 117) << 1) - (~(-(((~i8) & 117) | (i8 & (-118)))))) - 1;
        onSkipToNext = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.parseAlignment.write
    public final boolean r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0() {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (i2 ^ 59) + ((i2 & 59) << 1);
        setSessionImpl = i3 % 128;
        if (i3 % 2 == 0) {
            getPackageManager().hasSystemFeature("android.software.picture_in_picture");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        if (getPackageManager().hasSystemFeature("android.software.picture_in_picture")) {
            int i4 = onSkipToNext;
            int i5 = ((i4 | 59) << 1) - (i4 ^ 59);
            setSessionImpl = i5 % 128;
            int i6 = i5 % 2;
            if (dispatchTouchEvent.RemoteActionCompatParcelizer(this)) {
                int i7 = setSessionImpl;
                int i8 = (i7 ^ 15) + ((i7 & 15) << 1);
                onSkipToNext = i8 % 128;
                int i9 = i8 % 2;
                return true;
            }
        }
        int i10 = setSessionImpl;
        int i11 = ((i10 ^ 96) + ((i10 & 96) << 1)) - 1;
        onSkipToNext = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 84 / 0;
        }
        return false;
    }

    private static /* synthetic */ Object onCreatePanelMenu(Object[] objArr) {
        String str;
        Object[] objArr2;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        String str2 = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        String str3 = (String) objArr[3];
        int i = 2 % 2;
        int i2 = onSkipToNext + 4;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        toMagicModuleMetaRepoModel.write(str2, "");
        Object obj = null;
        if (iIntValue <= 0) {
            TextView textView = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatMediaItem;
            if (str3 != null) {
                int i5 = onSkipToNext;
                int i6 = i5 & 49;
                int i7 = -(-((i5 ^ 49) | i6));
                int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
                setSessionImpl = i8 % 128;
                str = str3;
                if (i8 % 2 == 0) {
                    obj.hashCode();
                    throw null;
                }
            } else {
                Object[] objArr3 = {str2};
                int i9 = onSkipToNext;
                int i10 = i9 & 49;
                int i11 = i10 + ((i9 ^ 49) | i10);
                setSessionImpl = i11 % 128;
                if (i11 % 2 == 0) {
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonVideoActivity.getString(R.string.notes_not_available, objArr3), "");
                    throw null;
                }
                String string = lessonVideoActivity.getString(R.string.notes_not_available, objArr3);
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string, "");
                int i12 = onSkipToNext;
                int i13 = (i12 & 1) + (i12 | 1);
                int i14 = i13 % 128;
                setSessionImpl = i14;
                int i15 = i13 % 2;
                str = string;
                int i16 = (i14 & 61) + (i14 | 61);
                onSkipToNext = i16 % 128;
                if (i16 % 2 != 0) {
                    int i17 = 5 / 3;
                }
            }
            textView.setText(str);
            int i18 = setSessionImpl;
            int i19 = (i18 & (-84)) | ((~i18) & 83);
            int i20 = -(-((i18 & 83) << 1));
            int i21 = (i19 & i20) + (i20 | i19);
            onSkipToNext = i21 % 128;
            if (i21 % 2 != 0) {
                int i22 = 47 / 0;
            }
            return null;
        }
        int i23 = setSessionImpl;
        int i24 = (i23 & 93) + (i23 | 93);
        onSkipToNext = i24 % 128;
        int i25 = i24 % 2;
        TextView textView2 = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatMediaItem;
        Resources resources = lessonVideoActivity.getResources();
        int i26 = setSessionImpl;
        int i27 = i26 & 101;
        int i28 = (i26 ^ 101) | i27;
        int i29 = ((i27 | i28) << 1) - (i28 ^ i27);
        onSkipToNext = i29 % 128;
        if (i29 % 2 != 0) {
            objArr2 = new Object[4];
            objArr2[0] = str2;
        } else {
            objArr2 = new Object[2];
            objArr2[0] = str2;
        }
        Integer numValueOf = Integer.valueOf(iIntValue);
        int i30 = onSkipToNext + 95;
        setSessionImpl = i30 % 128;
        int i31 = i30 % 2;
        objArr2[1] = numValueOf;
        String quantityString = resources.getQuantityString(R.plurals.notes_pages, iIntValue, objArr2);
        int i32 = onSkipToNext;
        int i33 = (i32 | 123) << 1;
        int i34 = -(((~i32) & 123) | (i32 & (-124)));
        int i35 = (i33 & i34) + (i33 | i34);
        setSessionImpl = i35 % 128;
        if (i35 % 2 == 0) {
            textView2.setText(quantityString);
        } else {
            textView2.setText(quantityString);
        }
        LinearLayout linearLayout = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.MediaMetadataCompat;
        int i36 = setSessionImpl + 103;
        onSkipToNext = i36 % 128;
        if (i36 % 2 != 0) {
            linearLayout.setAlpha(1.0f);
            linearLayout.setTag(Boolean.TRUE);
            toMagicModuleMetaRepoModel.write(linearLayout);
            int i37 = 96 / 0;
        } else {
            linearLayout.setAlpha(1.0f);
            linearLayout.setTag(Boolean.TRUE);
            toMagicModuleMetaRepoModel.write(linearLayout);
        }
        return null;
    }

    @Override // o.parseAlignment.write
    public final void read(int p0) {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 95;
        int i4 = (i3 - (~((i2 ^ 95) | i3))) - 1;
        setSessionImpl = i4 % 128;
        int i5 = i4 % 2;
        removeOnPictureInPictureModeChangedListener().write.setTag(Integer.valueOf(p0));
        int i6 = onSkipToNext + 107;
        setSessionImpl = i6 % 128;
        if (i6 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onSkipToQueueItem(Object[] objArr) {
        String string;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 115;
        int i4 = ((i2 ^ 115) | i3) << 1;
        int i5 = -((i2 | 115) & (~i3));
        int i6 = (i4 & i5) + (i5 | i4);
        onSkipToNext = i6 % 128;
        int i7 = i6 % 2;
        Button button = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().write;
        if (i7 != 0) {
            button.getTag();
            throw null;
        }
        Object tag = button.getTag();
        if (tag == null || (string = tag.toString()) == null) {
            int i8 = setSessionImpl + 57;
            onSkipToNext = i8 % 128;
            if (i8 % 2 == 0) {
                return 0;
            }
            throw null;
        }
        int i9 = onSkipToNext + 43;
        setSessionImpl = i9 % 128;
        int i10 = i9 % 2;
        int i11 = Integer.parseInt(string);
        if (i10 == 0) {
            int i12 = 18 / 0;
        }
        return Integer.valueOf(i11);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0050 A[PHI: r1
      0x0050: PHI (r1v22 java.lang.Integer) = (r1v6 java.lang.Integer), (r1v30 java.lang.Integer) binds: [B:8:0x0026, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028 A[PHI: r1
      0x0028: PHI (r1v7 java.lang.Integer) = (r1v6 java.lang.Integer), (r1v30 java.lang.Integer) binds: [B:8:0x0026, B:5:0x001f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.parseAlignment.write
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void AudioAttributesCompatParcelizer(boolean r10) {
        /*
            Method dump skipped, instruction units count: 341
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.AudioAttributesCompatParcelizer(boolean):void");
    }

    private static /* synthetic */ Object getOnBackPressedDispatcher(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 7;
        int i4 = i3 + ((i2 ^ 7) | i3);
        onSkipToNext = i4 % 128;
        Object obj = null;
        if (i4 % 2 != 0) {
            RecyclerView recyclerView = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver.write;
            throw null;
        }
        if (lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver.write != null) {
            RecyclerView recyclerView2 = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver.write;
            int i5 = onSkipToNext + 3;
            setSessionImpl = i5 % 128;
            int i6 = i5 % 2;
            recyclerView2.setAdapter(null);
            getProvider getprovider = getProvider.getInstance(lessonVideoActivity);
            int i7 = setSessionImpl;
            int i8 = ((i7 & (-102)) | ((~i7) & 101)) + ((i7 & 101) << 1);
            onSkipToNext = i8 % 128;
            int i9 = i8 % 2;
            getprovider.IconCompatParcelizer(lessonVideoActivity.onPlayFromUri);
            BroadcastReceiver broadcastReceiver = lessonVideoActivity.onPlayFromMediaId;
            int i10 = setSessionImpl;
            int i11 = (((i10 & (-76)) | ((~i10) & 75)) - (~((i10 & 75) << 1))) - 1;
            onSkipToNext = i11 % 128;
            int i12 = i11 % 2;
            lessonVideoActivity.unregisterReceiver(broadcastReceiver);
            lessonVideoActivity.RemoteActionCompatParcelizer = null;
            int i13 = onSkipToNext + 111;
            setSessionImpl = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 2 / 4;
            }
        }
        Runnable runnable = lessonVideoActivity.MediaBrowserCompatSearchResultReceiver;
        if (runnable != null) {
            int i15 = onSkipToNext;
            int i16 = (i15 ^ 61) + ((i15 & 61) << 1);
            setSessionImpl = i16 % 128;
            if (i16 % 2 == 0) {
                lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver.removeCallbacks(runnable);
                obj.hashCode();
                throw null;
            }
            lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver.removeCallbacks(runnable);
            int i17 = onSkipToNext;
            int i18 = i17 & 55;
            int i19 = (i17 | 55) & (~i18);
            int i20 = i18 << 1;
            int i21 = ((i19 | i20) << 1) - (i19 ^ i20);
            int i22 = i21 % 128;
            setSessionImpl = i22;
            if (i21 % 2 == 0) {
                int i23 = 1 / 0;
            }
            int i24 = (i22 | 103) << 1;
            int i25 = -(((~i22) & 103) | (i22 & (-104)));
            int i26 = ((i24 | i25) << 1) - (i24 ^ i25);
            onSkipToNext = i26 % 128;
            int i27 = i26 % 2;
        }
        lessonVideoActivity.MediaBrowserCompatSearchResultReceiver = null;
        super.onDestroy();
        int i28 = setSessionImpl;
        int i29 = (-2) - (((i28 & 122) + (i28 | 122)) ^ (-1));
        onSkipToNext = i29 % 128;
        if (i29 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object MediaSessionCompatQueueItem(Object[] objArr) {
        rendererSupportsTunneling renderersupportstunnelingWrite;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        rendererSupportsTunneling.read readVar = new rendererSupportsTunneling.read(lessonVideoActivity);
        int i2 = onSkipToNext + 1;
        setSessionImpl = i2 % 128;
        if (i2 % 2 == 0) {
            readVar.write(lessonVideoActivity.getString(R.string.title_marrow_notes_legal_warning)).read(lessonVideoActivity.getString(R.string.text_marrow_notes_legal_warning));
            throw null;
        }
        rendererSupportsTunneling.read readVarRemoteActionCompatParcelizer = readVar.write(lessonVideoActivity.getString(R.string.title_marrow_notes_legal_warning)).read(lessonVideoActivity.getString(R.string.text_marrow_notes_legal_warning)).RemoteActionCompatParcelizer(lessonVideoActivity.getString(R.string.btn_marrow_notes_legal_warning_dialog));
        RatingCompat ratingCompat = lessonVideoActivity.new RatingCompat();
        int i3 = setSessionImpl;
        int i4 = i3 & 11;
        int i5 = -(-((i3 ^ 11) | i4));
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        onSkipToNext = i6 % 128;
        if (i6 % 2 != 0) {
            renderersupportstunnelingWrite = readVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(ratingCompat).write();
            int i7 = 13 / 0;
        } else {
            renderersupportstunnelingWrite = readVarRemoteActionCompatParcelizer.AudioAttributesCompatParcelizer(ratingCompat).write();
        }
        int iCodePointAt = ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2);
        int i8 = iCodePointAt & (-1395050112);
        int i9 = ((iCodePointAt | (-1395050112)) & (~i8)) + (i8 << 1);
        int i10 = ~i9;
        int i11 = 407475194 ^ i10;
        int i12 = i10 & 407475194;
        int i13 = ~((i12 & i11) | (i11 ^ i12));
        int i14 = (-1938608120) ^ i9;
        int i15 = ~i9;
        int i16 = (-1938608120) & i9;
        int i17 = (i14 & i16) | (i14 ^ i16);
        int i18 = (i17 | (~i17)) & (~i17);
        int i19 = -(-(((i13 & i18) | ((~i18) & i13) | ((~i13) & i18)) * 210));
        int i20 = (547513182 & i19) + (i19 | 547513182);
        int i21 = (~i9) & (i15 | i9);
        int i22 = ((~i21) & (-1938608120)) | (1938608119 & i21);
        int i23 = i21 & (-1938608120);
        int i24 = (i23 & i22) | (i22 ^ i23);
        int i25 = ~((i24 & (-407475195)) | (i24 ^ (-407475195)));
        int i26 = ~((i9 & 2077089791) | (2077089791 & i15) | ((-2077089792) & i9));
        int i27 = ((i26 & i25) | (i25 ^ i26)) * 210;
        int i28 = ((i20 ^ i27) - (~(-(-((i27 & i20) << 1))))) - 1;
        int iAudioAttributesCompatParcelizer = OnFailureListener.AudioAttributesCompatParcelizer();
        int i29 = ~(((-1216479493) ^ iAudioAttributesCompatParcelizer) | ((-1216479493) & iAudioAttributesCompatParcelizer));
        int i30 = 7344256 ^ i29;
        int i31 = i29 & 7344256;
        int i32 = -(-(((i31 & i30) | (i30 ^ i31)) * (-756)));
        int i33 = 583650367 & i32;
        int i34 = (i32 | 583650367) & (~i33);
        int i35 = i33 << 1;
        int i36 = (i34 & i35) + (i34 | i35);
        int i37 = ~iAudioAttributesCompatParcelizer;
        int i38 = ((~i37) & (-1216479493)) | (1216479492 & i37);
        int i39 = i37 & (-1216479493);
        int i40 = -(-(((i39 & i38) | (i38 ^ i39)) * 756));
        int i41 = ((i36 ^ i40) | (i36 & i40)) << 1;
        int i42 = -((i40 & (~i36)) | ((~i40) & i36));
        if (i28 <= (i41 & i42) + (i42 | i41)) {
            lessonVideoActivity.AudioAttributesImplApi21Parcelizer = renderersupportstunnelingWrite;
            lessonVideoActivity.AudioAttributesImplApi21Parcelizer.show();
            throw null;
        }
        lessonVideoActivity.AudioAttributesImplApi21Parcelizer = renderersupportstunnelingWrite;
        lessonVideoActivity.AudioAttributesImplApi21Parcelizer.show();
        int i43 = onSkipToNext;
        int i44 = (i43 ^ 49) + ((i43 & 49) << 1);
        setSessionImpl = i44 % 128;
        int i45 = i44 % 2;
        return null;
    }

    private static /* synthetic */ Object onSetRepeatMode(Object[] objArr) {
        FragmentManager supportFragmentManager;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        String str = (String) objArr[1];
        ((Number) objArr[2]).intValue();
        String str2 = (String) objArr[3];
        String str3 = (String) objArr[4];
        int i = 2 % 2;
        OnFailureListener.AudioAttributesCompatParcelizer();
        OnFailureListener.AudioAttributesCompatParcelizer();
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        int i2 = setSessionImpl;
        int i3 = (i2 & 43) + (i2 | 43);
        onSkipToNext = i3 % 128;
        if (i3 % 2 != 0) {
            lessonVideoActivity.getSupportFragmentManager().write(CourseConfigKeyConstantsKt.KEY_NOTES);
            supportFragmentManager = lessonVideoActivity.getSupportFragmentManager();
            int i4 = 94 / 0;
        } else {
            lessonVideoActivity.getSupportFragmentManager().write(CourseConfigKeyConstantsKt.KEY_NOTES);
            supportFragmentManager = lessonVideoActivity.getSupportFragmentManager();
        }
        int i5 = onSkipToNext;
        int i6 = (i5 & (-118)) | ((~i5) & 117);
        int i7 = -(-((i5 & 117) << 1));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        setSessionImpl = i8 % 128;
        int i9 = i8 % 2;
        _doAddInjectable _doaddinjectableMediaDescriptionCompat = supportFragmentManager.IconCompatParcelizer().MediaDescriptionCompat();
        invokeSuspend.Companion writeVar = invokeSuspend.INSTANCE;
        onPageFinished onpagefinished = new onPageFinished(str, str2, 0, lessonVideoActivity.remove(), str3);
        int i10 = setSessionImpl;
        int i11 = (i10 & (-32)) | ((~i10) & 31);
        int i12 = (i10 & 31) << 1;
        int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
        onSkipToNext = i13 % 128;
        int i14 = i13 % 2;
        invokeSuspend invokesuspendWrite = invokeSuspend.Companion.write(onpagefinished);
        int i15 = onSkipToNext;
        int i16 = ((((i15 ^ 75) | (i15 & 75)) << 1) - (~(-(((~i15) & 75) | (i15 & (-76)))))) - 1;
        setSessionImpl = i16 % 128;
        Object obj = null;
        if (i16 % 2 == 0) {
            _doaddinjectableMediaDescriptionCompat.write(R.id.video_notes_container, invokesuspendWrite, CourseConfigKeyConstantsKt.KEY_NOTES).read(CourseConfigKeyConstantsKt.KEY_NOTES).write();
            obj.hashCode();
            throw null;
        }
        _doaddinjectableMediaDescriptionCompat.write(R.id.video_notes_container, invokesuspendWrite, CourseConfigKeyConstantsKt.KEY_NOTES).read(CourseConfigKeyConstantsKt.KEY_NOTES).write();
        int i17 = setSessionImpl + 99;
        int i18 = i17 % 128;
        onSkipToNext = i18;
        int i19 = i17 % 2;
        lessonVideoActivity.AudioAttributesImplApi21Parcelizer = false;
        int i20 = i18 + 65;
        setSessionImpl = i20 % 128;
        int i21 = i20 % 2;
        return null;
    }

    private final boolean remove() {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 79;
        int i4 = -(-(i2 | 79));
        int i5 = (i3 & i4) + (i4 | i3);
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        if (this.write != read.IconCompatParcelizer) {
            int i7 = setSessionImpl + 52;
            int i8 = (i7 ^ (-1)) + (i7 << 1);
            onSkipToNext = i8 % 128;
            if (i8 % 2 != 0) {
                int i9 = 64 / 0;
            }
            return false;
        }
        int i10 = setSessionImpl;
        int i11 = i10 & 115;
        int i12 = (((i10 | 115) & (~i11)) - (~(i11 << 1))) - 1;
        onSkipToNext = i12 % 128;
        int i13 = i12 % 2;
        return true;
    }

    private static /* synthetic */ Object IconCompatParcelizer(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl + 75;
        onSkipToNext = i2 % 128;
        View[] viewArr = i2 % 2 != 0 ? new View[3] : new View[3];
        FrameLayout frameLayout = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i3 = onSkipToNext;
        int i4 = ((i3 ^ 73) | (i3 & 73)) << 1;
        int i5 = -(((~i3) & 73) | (i3 & (-74)));
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        setSessionImpl = i6 % 128;
        int i7 = i6 % 2;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        viewArr[0] = frameLayout;
        parseRangedUrl parserangedurlRemoveOnPictureInPictureModeChangedListener = lessonVideoActivity.removeOnPictureInPictureModeChangedListener();
        int i8 = setSessionImpl;
        int i9 = i8 & 85;
        int i10 = -(-((i8 ^ 85) | i9));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        onSkipToNext = i11 % 128;
        int i12 = i11 % 2;
        ImageView imageView = parserangedurlRemoveOnPictureInPictureModeChangedListener.MediaBrowserCompatItemReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        viewArr[1] = imageView;
        ImageView imageView2 = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().AudioAttributesImplApi26Parcelizer;
        int i13 = onSkipToNext;
        int i14 = i13 | 65;
        int i15 = (i14 << 1) - ((~(i13 & 65)) & i14);
        setSessionImpl = i15 % 128;
        int i16 = i15 % 2;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
        if (i16 == 0) {
            viewArr[5] = imageView2;
        } else {
            viewArr[2] = imageView2;
        }
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(viewArr);
        return null;
    }

    @Override // o.parseAlignment.write
    public final void onPanelClosed() {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 33;
        int i4 = (i2 ^ 33) | i3;
        int i5 = (i3 & i4) + (i4 | i3);
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        View[] viewArr = new View[3];
        FrameLayout frameLayout = removeOnPictureInPictureModeChangedListener().MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        int i7 = onSkipToNext + 125;
        setSessionImpl = i7 % 128;
        int i8 = i7 % 2;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        if (i8 == 0) {
            viewArr[1] = frameLayout;
        } else {
            viewArr[0] = frameLayout;
        }
        ImageView imageView = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatItemReceiver;
        int i9 = onSkipToNext;
        int i10 = ((i9 | 49) << 1) - (i9 ^ 49);
        setSessionImpl = i10 % 128;
        int i11 = i10 % 2;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        if (i11 == 0) {
            viewArr[1] = imageView;
        } else {
            viewArr[1] = imageView;
        }
        ImageView imageView2 = removeOnPictureInPictureModeChangedListener().AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
        viewArr[2] = imageView2;
        int i12 = setSessionImpl;
        int i13 = (((i12 ^ 25) | (i12 & 25)) << 1) - (((~i12) & 25) | (i12 & (-26)));
        onSkipToNext = i13 % 128;
        int i14 = i13 % 2;
        PlayerControlViewExternalSyntheticLambda1.RemoteActionCompatParcelizer(viewArr);
        int i15 = setSessionImpl;
        int i16 = (((i15 | 92) << 1) - (i15 ^ 92)) - 1;
        onSkipToNext = i16 % 128;
        if (i16 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.parseAlignment.write
    public final void ResultReceiver() {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (i2 ^ 1) + ((i2 & 1) << 1);
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        FrameLayout frameLayout = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver;
        if (i4 == 0) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
            throw null;
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(frameLayout);
        int i5 = onSkipToNext;
        int i6 = (i5 & (-120)) | ((~i5) & 119);
        int i7 = (i5 & 119) << 1;
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        setSessionImpl = i8 % 128;
        int i9 = i8 % 2;
    }

    @Override // o.parseAlignment.write
    public final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        int i;
        int i2;
        int i3 = 2 % 2;
        int i4 = onSkipToNext;
        int i5 = (i4 ^ 14) + ((i4 & 14) << 1);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        setSessionImpl = i6 % 128;
        int i7 = i6 % 2;
        int iFloatValue = (int) ((Float) write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 104299600, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -104299575)).floatValue();
        int width = removeOnPictureInPictureModeChangedListener().MediaDescriptionCompat.getWidth();
        int width2 = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver.getWidth();
        int y = (int) removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver.getY();
        ReferenceTypeDeserializer referenceTypeDeserializer = new ReferenceTypeDeserializer();
        int i8 = setSessionImpl;
        int i9 = i8 ^ 75;
        int i10 = (((i8 & 75) | i9) << 1) - i9;
        onSkipToNext = i10 % 128;
        int i11 = i10 % 2;
        referenceTypeDeserializer.RemoteActionCompatParcelizer(removeOnPictureInPictureModeChangedListener().AudioAttributesCompatParcelizer);
        referenceTypeDeserializer.write(R.id.gl_top, y);
        int i12 = setSessionImpl;
        int i13 = (((i12 & (-84)) | ((~i12) & 83)) - (~((i12 & 83) << 1))) - 1;
        onSkipToNext = i13 % 128;
        int i14 = i13 % 2;
        referenceTypeDeserializer.write(R.id.gl_left, iFloatValue);
        int iAudioAttributesCompatParcelizer = OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        int i15 = onSkipToNext;
        int i16 = (i15 ^ 79) + ((i15 & 79) << 1);
        setSessionImpl = i16 % 128;
        if (i16 % 2 == 0) {
            int i17 = -(-width2);
            int i18 = i17 & 628;
            int i19 = ((i17 ^ 628) | i18) << 1;
            int i20 = -((628 | i17) & (~i18));
            i = (628 % iFloatValue) % (((i19 | i20) << 1) - (i20 ^ i19));
            int i21 = (width2 ^ iAudioAttributesCompatParcelizer) | (width2 & iAudioAttributesCompatParcelizer);
            int i22 = ~iFloatValue;
            int i23 = i21 & i22;
            int i24 = (i21 | i22) & (~i23);
            i2 = (-627) % ((i24 & i23) | (i24 ^ i23));
        } else {
            i = (width2 * 628) + (iFloatValue * 628);
            int i25 = ((~iAudioAttributesCompatParcelizer) & width2) | ((~width2) & iAudioAttributesCompatParcelizer);
            int i26 = width2 & iAudioAttributesCompatParcelizer;
            int i27 = (i25 & i26) | (i25 ^ i26);
            int i28 = ~iFloatValue;
            i2 = ((i27 & i28) | (i27 ^ i28)) * (-627);
        }
        int i29 = i & i2;
        int i30 = (i2 ^ i) | i29;
        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
        int i32 = ~width2;
        int i33 = ~iAudioAttributesCompatParcelizer;
        int i34 = (i32 & i33) | ((~i32) & iAudioAttributesCompatParcelizer);
        int i35 = i32 & iAudioAttributesCompatParcelizer;
        int i36 = ~((i34 & i35) | (i34 ^ i35));
        int i37 = iFloatValue & i36;
        int i38 = (i36 | iFloatValue) & (~i37);
        int i39 = ((i38 & i37) | (i38 ^ i37)) * (-627);
        int i40 = (i31 & i39) + (i31 | i39);
        int i41 = (-2) - ((i15 + 88) ^ (-1));
        setSessionImpl = i41 % 128;
        if (i41 % 2 == 0) {
            int i42 = width2 | i33;
            int i43 = (i42 | (~i42)) & (~i42);
            int i44 = (iFloatValue & i33) | ((~iFloatValue) & iAudioAttributesCompatParcelizer);
            int i45 = iFloatValue & iAudioAttributesCompatParcelizer;
            int i46 = ~((i45 & i44) | (i44 ^ i45));
            int i47 = i40 % (627 << ((i46 & i43) | (i43 ^ i46)));
            referenceTypeDeserializer.MediaBrowserCompatItemReceiver((width ^ i47) + ((width & i47) << 1));
        } else {
            int i48 = ~((width2 & i33) | (i33 & i32) | ((~i33) & width2));
            int i49 = (iFloatValue & i33) | ((~iFloatValue) & iAudioAttributesCompatParcelizer);
            int i50 = iFloatValue & iAudioAttributesCompatParcelizer;
            int i51 = (i50 & i49) | (i49 ^ i50);
            int i52 = i48 & (i51 | (~i51)) & (~i51);
            int i53 = -((i40 - (~(-(-((((r1 | i48) & (~i52)) | i52) * 627))))) - 1);
            referenceTypeDeserializer.MediaBrowserCompatItemReceiver((width ^ i53) + ((i53 & width) << 1));
        }
        int i54 = setSessionImpl;
        int i55 = ((i54 ^ 13) | (i54 & 13)) << 1;
        int i56 = -(((~i54) & 13) | (i54 & (-14)));
        int i57 = (i55 & i56) + (i56 | i55);
        onSkipToNext = i57 % 128;
        if (i57 % 2 == 0) {
            referenceTypeDeserializer.write(R.id.video_fragment_container);
            write(new Object[]{referenceTypeDeserializer}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1262800418, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1262800508);
            referenceTypeDeserializer.write(removeOnPictureInPictureModeChangedListener().AudioAttributesCompatParcelizer);
            return;
        }
        referenceTypeDeserializer.write(R.id.video_fragment_container);
        write(new Object[]{referenceTypeDeserializer}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1262800418, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1262800508);
        referenceTypeDeserializer.write(removeOnPictureInPictureModeChangedListener().AudioAttributesCompatParcelizer);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onBackPressed(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (-2) - (((i2 & 106) + (i2 | 106)) ^ (-1));
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -357719963, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 357719987);
        lessonVideoActivity.ActionBarLayoutParams();
        setViewportSizeToPhysicalDisplaySize setviewportsizetophysicaldisplaysize = lessonVideoActivity.RemoteActionCompatParcelizer;
        int i5 = setSessionImpl;
        int i6 = i5 & 75;
        int i7 = -(-((i5 ^ 75) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        int i9 = i8 % 128;
        onSkipToNext = i9;
        int i10 = i8 % 2;
        Object obj = null;
        if (setviewportsizetophysicaldisplaysize != null) {
            int i11 = i9 & 97;
            int i12 = ((i9 ^ 97) | i11) << 1;
            int i13 = -((~i11) & (i9 | 97));
            int i14 = ((i12 | i13) << 1) - (i12 ^ i13);
            setSessionImpl = i14 % 128;
            if (i14 % 2 == 0) {
                throw null;
            }
            if (setviewportsizetophysicaldisplaysize != null) {
                int i15 = (i9 & (-82)) | ((~i9) & 81);
                int i16 = (i9 & 81) << 1;
                int i17 = ((i15 | i16) << 1) - (i16 ^ i15);
                setSessionImpl = i17 % 128;
                if (i17 % 2 != 0 ? setviewportsizetophysicaldisplaysize.av_() : !setviewportsizetophysicaldisplaysize.av_()) {
                    setViewportSizeToPhysicalDisplaySize setviewportsizetophysicaldisplaysize2 = lessonVideoActivity.RemoteActionCompatParcelizer;
                    if (setviewportsizetophysicaldisplaysize2 != null) {
                        int i18 = setSessionImpl;
                        int i19 = (((i18 | 52) << 1) - (i18 ^ 52)) - 1;
                        onSkipToNext = i19 % 128;
                        int i20 = i19 % 2;
                        setviewportsizetophysicaldisplaysize2.onPictureInPictureModeChanged();
                        if (i20 != 0) {
                            throw null;
                        }
                    }
                }
            }
        }
        int i21 = setSessionImpl;
        int i22 = i21 & 43;
        int i23 = i21 | 43;
        int i24 = (i22 & i23) + (i23 | i22);
        onSkipToNext = i24 % 128;
        if (i24 % 2 == 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onPrepareFromMediaId(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (i2 & (-32)) | ((~i2) & 31);
        int i4 = -(-((i2 & 31) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        FrameLayout frameLayout = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        PlayerControlViewExternalSyntheticLambda1.write(frameLayout);
        ReferenceTypeDeserializer referenceTypeDeserializer = new ReferenceTypeDeserializer();
        int i7 = onSkipToNext + 53;
        setSessionImpl = i7 % 128;
        if (i7 % 2 == 0) {
            referenceTypeDeserializer.RemoteActionCompatParcelizer(lessonVideoActivity.removeOnPictureInPictureModeChangedListener().AudioAttributesCompatParcelizer);
            throw null;
        }
        referenceTypeDeserializer.RemoteActionCompatParcelizer(lessonVideoActivity.removeOnPictureInPictureModeChangedListener().AudioAttributesCompatParcelizer);
        int i8 = setSessionImpl;
        int i9 = ((i8 | 79) << 1) - (i8 ^ 79);
        onSkipToNext = i9 % 128;
        int i10 = i9 % 2;
        referenceTypeDeserializer.write(R.id.gl_top, 0);
        int i11 = onSkipToNext + 61;
        setSessionImpl = i11 % 128;
        if (i11 % 2 == 0) {
            referenceTypeDeserializer.write(R.id.gl_left, 1);
        } else {
            referenceTypeDeserializer.write(R.id.gl_left, 0);
        }
        referenceTypeDeserializer.write();
        referenceTypeDeserializer.write(R.id.video_fragment_container);
        write(new Object[]{referenceTypeDeserializer}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1262800418, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1262800508);
        parseRangedUrl parserangedurlRemoveOnPictureInPictureModeChangedListener = lessonVideoActivity.removeOnPictureInPictureModeChangedListener();
        int i12 = onSkipToNext;
        int i13 = i12 & 109;
        int i14 = (i12 | 109) & (~i13);
        int i15 = i13 << 1;
        int i16 = ((i14 | i15) << 1) - (i14 ^ i15);
        setSessionImpl = i16 % 128;
        if (i16 % 2 == 0) {
            referenceTypeDeserializer.write(parserangedurlRemoveOnPictureInPictureModeChangedListener.AudioAttributesCompatParcelizer);
            int i17 = 15 / 0;
        } else {
            referenceTypeDeserializer.write(parserangedurlRemoveOnPictureInPictureModeChangedListener.AudioAttributesCompatParcelizer);
        }
        return null;
    }

    private final maybeSkipWhitespace handleOnBackCancelled() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6 = 2 % 2;
        int i7 = setSessionImpl;
        int i8 = i7 & 65;
        int i9 = i7 | 65;
        int i10 = (i8 ^ i9) + ((i9 & i8) << 1);
        onSkipToNext = i10 % 128;
        Object obj = null;
        if (i10 % 2 != 0) {
            CmcdHeadersFactory1 cmcdHeadersFactory1 = CmcdHeadersFactory1.INSTANCE;
            CmcdHeadersFactory1.AudioAttributesCompatParcelizer();
            throw null;
        }
        CmcdHeadersFactory1 cmcdHeadersFactory12 = CmcdHeadersFactory1.INSTANCE;
        boolean zAudioAttributesCompatParcelizer = CmcdHeadersFactory1.AudioAttributesCompatParcelizer();
        int i11 = 0;
        if (!zAudioAttributesCompatParcelizer) {
            int i12 = onSkipToNext;
            int i13 = i12 & 53;
            int i14 = (i12 ^ 53) | i13;
            int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
            setSessionImpl = i15 % 128;
            int i16 = i15 % 2;
            i = 0;
        } else {
            int i17 = onSkipToNext + 23;
            setSessionImpl = i17 % 128;
            int i18 = i17 % 2;
            int i19 = updateNavigation.read((Context) this, 24);
            int i20 = onSkipToNext;
            int i21 = (i20 | 5) << 1;
            int i22 = -(i20 ^ 5);
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            setSessionImpl = i23 % 128;
            int i24 = i23 % 2;
            i = i19;
        }
        if (zAudioAttributesCompatParcelizer) {
            int i25 = setSessionImpl;
            int i26 = i25 & 101;
            int i27 = -(-((i25 ^ 101) | i26));
            int i28 = ((i26 | i27) << 1) - (i27 ^ i26);
            onSkipToNext = i28 % 128;
            if (i28 % 2 != 0) {
                updateNavigation.read((Context) this, 120);
                i5 = 0;
            } else {
                i5 = updateNavigation.read((Context) this, 20) << 1;
            }
            i2 = i5;
        } else {
            int i29 = setSessionImpl + 69;
            onSkipToNext = i29 % 128;
            int i30 = i29 % 2;
            i2 = 0;
        }
        if (zAudioAttributesCompatParcelizer) {
            int i31 = onSkipToNext;
            int i32 = i31 & 11;
            int i33 = (i31 | 11) & (~i32);
            int i34 = i32 << 1;
            int i35 = (i33 ^ i34) + ((i33 & i34) << 1);
            setSessionImpl = i35 % 128;
            int i36 = i35 % 2;
            i3 = 0;
        } else {
            int i37 = updateNavigation.read((Context) this, 20);
            System.identityHashCode(this);
            System.identityHashCode(this);
            i3 = i37;
        }
        int i38 = 48;
        if (zAudioAttributesCompatParcelizer) {
            System.identityHashCode(this);
            OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
            LessonVideoActivity lessonVideoActivity = this;
            if (!onSetCaptioningEnabled()) {
                int i39 = onSkipToNext;
                int i40 = i39 & 35;
                int i41 = -(-((i39 ^ 35) | i40));
                int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
                int i43 = i42 % 128;
                setSessionImpl = i43;
                int i44 = i42 % 2 != 0 ? 28 : 53;
                int i45 = i43 & 125;
                int i46 = i43 | 125;
                int i47 = (i45 & i46) + (i46 | i45);
                onSkipToNext = i47 % 128;
                int i48 = i47 % 2;
                i38 = i44;
            }
            i4 = updateNavigation.read((Context) lessonVideoActivity, i38);
            int i49 = onSkipToNext;
            int i50 = (-2) - (((i49 & 80) + (i49 | 80)) ^ (-1));
            setSessionImpl = i50 % 128;
            int i51 = i50 % 2;
        } else {
            LessonVideoActivity lessonVideoActivity2 = this;
            if (onSetCaptioningEnabled()) {
                int i52 = onSkipToNext;
                int i53 = ((i52 & (-92)) | ((~i52) & 91)) + ((i52 & 91) << 1);
                int i54 = i53 % 128;
                setSessionImpl = i54;
                int i55 = i53 % 2;
                int i56 = i54 & 31;
                int i57 = (i54 | 31) & (~i56);
                int i58 = i56 << 1;
                int i59 = ((i57 | i58) << 1) - (i57 ^ i58);
                onSkipToNext = i59 % 128;
                if (i59 % 2 != 0) {
                    int i60 = 2 % 3;
                }
                i38 = 68;
            }
            i4 = updateNavigation.read((Context) lessonVideoActivity2, i38);
            int i61 = onSkipToNext;
            int i62 = i61 & 101;
            int i63 = i62 + ((i61 ^ 101) | i62);
            setSessionImpl = i63 % 128;
            int i64 = i63 % 2;
        }
        int i65 = i4;
        WindowInsetsCompat windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler = InvalidTypeIdException.handleMediaPlayPauseIfPendingOnHandler(removeOnPictureInPictureModeChangedListener().IconCompatParcelizer());
        int i66 = onSkipToNext;
        int i67 = i66 & 97;
        int i68 = (i66 ^ 97) | i67;
        int i69 = ((i67 | i68) << 1) - (i67 ^ i68);
        setSessionImpl = i69 % 128;
        int i70 = i69 % 2;
        if (windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler != null) {
            int i71 = (((i66 | 33) << 1) - (~(-(((~i66) & 33) | (i66 & (-34)))))) - 1;
            setSessionImpl = i71 % 128;
            int i72 = i71 % 2;
            _verifyEndArrayForSingle _verifyendarrayforsingle = windowInsetsCompatHandleMediaPlayPauseIfPendingOnHandler.read(WindowInsetsCompat.MediaBrowserCompatItemReceiver.MediaBrowserCompatItemReceiver());
            if (_verifyendarrayforsingle != null) {
                int i73 = onSkipToNext;
                int i74 = (i73 | 93) << 1;
                int i75 = -(i73 ^ 93);
                int i76 = ((i74 | i75) << 1) - (i75 ^ i74);
                setSessionImpl = i76 % 128;
                int i77 = i76 % 2;
                i11 = _verifyendarrayforsingle.write;
                int i78 = onSkipToNext;
                int i79 = (i78 & 67) + (i78 | 67);
                setSessionImpl = i79 % 128;
                int i80 = i79 % 2;
            }
        }
        maybeSkipWhitespace maybeskipwhitespace = new maybeSkipWhitespace(i, i2, i3, i65, i11, getResources().getDisplayMetrics().widthPixels, getResources().getDisplayMetrics().heightPixels);
        int i81 = onSkipToNext;
        int i82 = i81 ^ 11;
        int i83 = -(-((i81 & 11) << 1));
        int i84 = ((i82 | i83) << 1) - (i83 ^ i82);
        setSessionImpl = i84 % 128;
        if (i84 % 2 != 0) {
            return maybeskipwhitespace;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object invalidateMenu(Object[] objArr) {
        double d;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (i2 & (-88)) | ((~i2) & 87);
        int i4 = -(-((i2 & 87) << 1));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        int i7 = updateNavigation.read((Context) lessonVideoActivity, 170);
        Resources resources = lessonVideoActivity.getResources();
        int i8 = onSkipToNext;
        int i9 = ((i8 & 101) - (~(-(-(i8 | 101))))) - 1;
        setSessionImpl = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = resources.getDisplayMetrics().widthPixels;
            ((Boolean) write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1059214298, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1059214229)).booleanValue();
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i11 = resources.getDisplayMetrics().widthPixels;
        if (!((Boolean) write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1059214298, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1059214229)).booleanValue()) {
            int i12 = setSessionImpl;
            int i13 = (i12 & (-98)) | ((~i12) & 97);
            int i14 = -(-((i12 & 97) << 1));
            int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
            onSkipToNext = i15 % 128;
            int i16 = i15 % 2;
            d = 0.3d;
        } else if (lessonVideoActivity.onSetCaptioningEnabled()) {
            int i17 = onSkipToNext;
            int i18 = ((i17 | 81) << 1) - (((~i17) & 81) | (i17 & (-82)));
            int i19 = i18 % 128;
            setSessionImpl = i19;
            int i20 = i18 % 2;
            int i21 = i19 & 119;
            int i22 = -(-((i19 ^ 119) | i21));
            int i23 = (i21 ^ i22) + ((i22 & i21) << 1);
            onSkipToNext = i23 % 128;
            int i24 = i23 % 2;
            d = 0.4d;
        } else {
            int i25 = setSessionImpl;
            int i26 = (i25 ^ 13) + ((i25 & 13) << 1);
            onSkipToNext = i26 % 128;
            int i27 = i26 % 2;
            d = 0.6d;
        }
        int iMax = Math.max((int) (d * ((double) i11)), i7);
        int i28 = setSessionImpl;
        int i29 = (i28 & (-22)) | ((~i28) & 21);
        int i30 = (i28 & 21) << 1;
        int i31 = ((i29 | i30) << 1) - (i30 ^ i29);
        onSkipToNext = i31 % 128;
        int i32 = i31 % 2;
        return Integer.valueOf(iMax);
    }

    private final int setContentView() {
        double d;
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 ^ 79;
        int i4 = -(-((i2 & 79) << 1));
        int i5 = (i3 & i4) + (i4 | i3);
        onSkipToNext = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            int i6 = getResources().getDisplayMetrics().widthPixels;
            if (!((Boolean) write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1059214298, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1059214229)).booleanValue()) {
                int i7 = setSessionImpl;
                int i8 = (i7 & 89) + (i7 | 89);
                onSkipToNext = i8 % 128;
                int i9 = i8 % 2;
                d = 0.6d;
            } else if (!(!onSetCaptioningEnabled())) {
                int i10 = onSkipToNext;
                int i11 = i10 & 59;
                int i12 = (i10 ^ 59) | i11;
                int i13 = ((i11 | i12) << 1) - (i12 ^ i11);
                int i14 = i13 % 128;
                setSessionImpl = i14;
                if (i13 % 2 == 0) {
                    throw null;
                }
                int i15 = (i14 & 9) + (i14 | 9);
                onSkipToNext = i15 % 128;
                int i16 = i15 % 2;
                d = 0.8d;
            } else {
                int i17 = onSkipToNext;
                int i18 = (((i17 ^ 91) | (i17 & 91)) << 1) - (((~i17) & 91) | (i17 & (-92)));
                setSessionImpl = i18 % 128;
                int i19 = i18 % 2;
                d = 1.0d;
            }
            int i20 = (int) (d * ((double) i6));
            int i21 = onSkipToNext + 3;
            setSessionImpl = i21 % 128;
            int i22 = i21 % 2;
            return i20;
        }
        int i23 = getResources().getDisplayMetrics().widthPixels;
        ((Boolean) write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1059214298, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1059214229)).booleanValue();
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // o.parseAlignment.write
    public final void addContentView() {
        int i = 2 % 2;
        int i2 = setSessionImpl + 77;
        onSkipToNext = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            ((fromStyleLine) getMPresenter()).r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8();
            backspace.Companion iconCompatParcelizer = backspace.INSTANCE;
            AudioAttributesCompatParcelizer(backspace.Companion.AudioAttributesCompatParcelizer(true));
            onCustomAction();
            int i3 = setSessionImpl;
            int i4 = i3 ^ 91;
            int i5 = ((((i3 & 91) | i4) << 1) - (~(-i4))) - 1;
            onSkipToNext = i5 % 128;
            if (i5 % 2 == 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        ((fromStyleLine) getMPresenter()).r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8();
        backspace.Companion iconCompatParcelizer2 = backspace.INSTANCE;
        throw null;
    }

    private static /* synthetic */ Object onSetCaptioningEnabled(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = ((i2 ^ 42) + ((i2 & 42) << 1)) - 1;
        onSkipToNext = i3 % 128;
        int i4 = i3 % 2;
        Pair pairWrite = setAction.write("request_action", "show_left_dock");
        int i5 = setSessionImpl;
        int i6 = i5 & 39;
        int i7 = ((i5 | 39) & (~i6)) + (i6 << 1);
        onSkipToNext = i7 % 128;
        int i8 = i7 % 2;
        lessonVideoActivity.RemoteActionCompatParcelizer(_getIndexResolver.write(pairWrite));
        int i9 = setSessionImpl + 63;
        onSkipToNext = i9 % 128;
        int i10 = i9 % 2;
        return null;
    }

    private final void handleOnBackStarted() {
        Pair[] pairArr;
        Pair pairWrite;
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 59;
        int i4 = (((i2 | 59) & (~i3)) - (~(i3 << 1))) - 1;
        onSkipToNext = i4 % 128;
        char c = 0;
        if (i4 % 2 != 0) {
            pairArr = new Pair[0];
            pairWrite = setAction.write("request_action", "show_right_dock");
            c = 1;
        } else {
            pairArr = new Pair[1];
            pairWrite = setAction.write("request_action", "show_right_dock");
        }
        pairArr[c] = pairWrite;
        RemoteActionCompatParcelizer(_getIndexResolver.write(pairArr));
        int i5 = setSessionImpl;
        int i6 = i5 & 27;
        int i7 = ((i5 ^ 27) | i6) << 1;
        int i8 = -((i5 | 27) & (~i6));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        onSkipToNext = i9 % 128;
        if (i9 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static final void RemoteActionCompatParcelizer(LessonVideoActivity lessonVideoActivity, maybeSkipWhitespace maybeskipwhitespace, int i, int i2, maybeSkipComment maybeskipcomment) {
        int i3;
        int i4;
        int i5 = 2 % 2;
        int i6 = onSkipToNext;
        int i7 = (i6 ^ 22) + ((i6 & 22) << 1);
        int i8 = (i7 ^ (-1)) + (i7 << 1);
        setSessionImpl = i8 % 128;
        int i9 = i8 % 2;
        if (!lessonVideoActivity.isDestroyed()) {
            int i10 = setSessionImpl;
            int i11 = (i10 ^ 87) + ((i10 & 87) << 1);
            onSkipToNext = i11 % 128;
            int i12 = i11 % 2;
            if (!lessonVideoActivity.isFinishing()) {
                int i13 = onSkipToNext;
                int i14 = (i13 & (-72)) | ((~i13) & 71);
                int i15 = -(-((i13 & 71) << 1));
                int i16 = (i14 & i15) + (i15 | i14);
                setSessionImpl = i16 % 128;
                int i17 = i16 % 2;
                int iIconCompatParcelizer = maybeskipwhitespace.IconCompatParcelizer();
                int i18 = -i;
                int iAudioAttributesCompatParcelizer = OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
                int i19 = i18 * (-432);
                int i20 = iIconCompatParcelizer * 434;
                int i21 = i19 ^ i20;
                int i22 = (((i19 & i20) | i21) << 1) - i21;
                int i23 = onSkipToNext;
                int i24 = ((i23 & 88) + (i23 | 88)) - 1;
                setSessionImpl = i24 % 128;
                int i25 = i24 % 2;
                int i26 = ~i18;
                int i27 = ~iAudioAttributesCompatParcelizer;
                int i28 = ((~i27) & i26) | ((~i26) & i27);
                int i29 = i26 & i27;
                int i30 = (i28 & i29) | (i28 ^ i29);
                int i31 = ~iIconCompatParcelizer;
                int i32 = -(-((~((i30 & iIconCompatParcelizer) | (i30 & i31) | ((~i30) & iIconCompatParcelizer))) * 433));
                int i33 = i22 & i32;
                int i34 = ((i22 ^ i32) | i33) << 1;
                int i35 = -((i22 | i32) & (~i33));
                int i36 = (i34 ^ i35) + ((i35 & i34) << 1);
                int i37 = ((~i18) | i18) & i26;
                int i38 = (i31 | iIconCompatParcelizer) & (~iIconCompatParcelizer);
                int i39 = i23 & 1;
                int i40 = -(-(i23 | 1));
                int i41 = (i39 & i40) + (i40 | i39);
                setSessionImpl = i41 % 128;
                if (i41 % 2 == 0) {
                    int i42 = i38 & iAudioAttributesCompatParcelizer;
                    int i43 = (~i42) & (i38 | iAudioAttributesCompatParcelizer);
                    int i44 = ~((i42 & i43) | (i43 ^ i42));
                    int i45 = -((i37 & i44) | ((~i44) & i37) | ((~i37) & i44));
                    int i46 = i36 >> (((((~i45) & (-433)) | (i45 & 432)) - (~(-(-((i45 & (-433)) << 1))))) - 1);
                    int i47 = iAudioAttributesCompatParcelizer | i26;
                    int i48 = (i47 | (~i47)) & (~i47);
                    int i49 = i18 & iIconCompatParcelizer;
                    int i50 = (iIconCompatParcelizer | i18) & (~i49);
                    int i51 = (i50 & i49) | (i50 ^ i49);
                    int i52 = (i51 | (~i51)) & (~i51);
                    int i53 = -(-(433 << ((i52 & i48) | (((~i52) & i48) | ((~i48) & i52)))));
                    i3 = ((((i46 ^ i53) | (i46 & i53)) << 1) - (~(-((i53 & (~i46)) | ((~i53) & i46))))) - 1;
                } else {
                    int i54 = (i38 & i27) | ((~i38) & iAudioAttributesCompatParcelizer);
                    int i55 = i38 & iAudioAttributesCompatParcelizer;
                    int i56 = ~((i54 & i55) | (i54 ^ i55));
                    int i57 = i37 ^ i56;
                    int i58 = i37 & i56;
                    int i59 = -(~(-(-(((i58 & i57) | (i57 ^ i58)) * (-433)))));
                    int i60 = ((i36 ^ i59) + ((i59 & i36) << 1)) - 1;
                    int i61 = (i26 & i27) | ((~i26) & iAudioAttributesCompatParcelizer);
                    int i62 = iAudioAttributesCompatParcelizer & i26;
                    int i63 = ~((i62 & i61) | (i61 ^ i62));
                    int i64 = ~((iIconCompatParcelizer & i18) | (i18 ^ iIconCompatParcelizer));
                    int i65 = -(-(((i64 & i63) | ((~i64) & i63) | ((~i63) & i64)) * 433));
                    i3 = (i60 & i65) + (i65 | i60);
                }
                int i66 = (i3 - (~(-maybeskipwhitespace.write()))) - 1;
                int iAudioAttributesImplBaseParcelizer = maybeskipwhitespace.AudioAttributesImplBaseParcelizer();
                int iAudioAttributesCompatParcelizer2 = OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
                int i67 = iAudioAttributesImplBaseParcelizer * 302;
                int i68 = setSessionImpl;
                int i69 = (i68 ^ 126) + ((i68 & 126) << 1);
                int i70 = (i69 ^ (-1)) + (i69 << 1);
                int i71 = i70 % 128;
                onSkipToNext = i71;
                int i72 = i70 % 2;
                int i73 = -(-(i66 * 603));
                int i74 = (((i67 | i73) << 1) - (~(-(((~i67) & i73) | ((~i73) & i67))))) - 1;
                int i75 = ~iAudioAttributesImplBaseParcelizer;
                int i76 = ~iAudioAttributesImplBaseParcelizer;
                int i77 = ~iAudioAttributesCompatParcelizer2;
                int i78 = ~i77;
                int i79 = ~((i75 & (i76 | iAudioAttributesImplBaseParcelizer)) | i77);
                int i80 = (~i79) & i66;
                int i81 = ~i66;
                int i82 = -(-(((i79 & i66) | i80 | (i79 & i81)) * (-602)));
                int i83 = (i74 ^ i82) + ((i82 & i74) << 1);
                int i84 = ((i71 ^ 25) | (i71 & 25)) << 1;
                int i85 = -((i71 & (-26)) | ((~i71) & 25));
                int i86 = (i84 ^ i85) + ((i84 & i85) << 1);
                setSessionImpl = i86 % 128;
                int i87 = i86 % 2;
                int i88 = ~i66;
                if (i87 == 0) {
                    int i89 = i88 & (i81 | i66);
                    int i90 = i76 & i89;
                    int i91 = ~(((i89 | i76) & (~i90)) | i90);
                    int i92 = (i76 & i77) | ((~i76) & iAudioAttributesCompatParcelizer2);
                    int i93 = iAudioAttributesCompatParcelizer2 & i76;
                    int i94 = ~((i93 & i92) | (i92 ^ i93));
                    int i95 = ((~i94) & i91) | ((~i91) & i94);
                    int i96 = i94 & i91;
                    int i97 = (i96 & i95) | (i95 ^ i96);
                    int i98 = (iAudioAttributesImplBaseParcelizer & i77) | (i77 ^ iAudioAttributesImplBaseParcelizer);
                    int i99 = (i98 & i66) | (i98 ^ i66);
                    int i100 = (i99 | (~i99)) & (~i99);
                    int i101 = ((~i100) & i97) | ((~i97) & i100);
                    int i102 = i100 & i97;
                    i4 = (-301) << ((i102 & i101) | (i101 ^ i102));
                } else {
                    int i103 = i76 ^ iAudioAttributesCompatParcelizer2;
                    int i104 = iAudioAttributesCompatParcelizer2 & i76;
                    int i105 = (~((i104 & i103) | (i103 ^ i104))) | (~((i88 & (i81 | i66)) | i76));
                    int i106 = i77 ^ iAudioAttributesImplBaseParcelizer;
                    int i107 = iAudioAttributesImplBaseParcelizer & i77;
                    int i108 = (i107 & i106) | (i106 ^ i107);
                    int i109 = i108 & i66;
                    int i110 = ((i108 | i66) & (~i109)) | i109;
                    int i111 = (i110 | (~i110)) & (~i110);
                    int i112 = i105 & i111;
                    i4 = (((i111 | i105) & (~i112)) | i112) * (-301);
                }
                int i113 = -(-i4);
                int i114 = (i83 & i113) + (i113 | i83);
                int i115 = (i77 & i81) | (i66 & i78);
                int i116 = i66 & i77;
                int i117 = (~((i115 & i116) | (i115 ^ i116))) * 301;
                int i118 = i114 ^ i117;
                int i119 = -(-((i117 & i114) << 1));
                float f = ((i118 | i119) << 1) - (i119 ^ i118);
                int iAudioAttributesCompatParcelizer3 = maybeskipwhitespace.AudioAttributesCompatParcelizer() - (~(-maybeskipwhitespace.RemoteActionCompatParcelizer()));
                float f2 = (iAudioAttributesCompatParcelizer3 ^ (-1)) + (iAudioAttributesCompatParcelizer3 << 1);
                OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
                int i120 = -maybeskipwhitespace.RemoteActionCompatParcelizer();
                int i121 = i2 ^ i120;
                int i122 = ((i2 & i120) | i121) << 1;
                int i123 = -i121;
                float f3 = -((i122 ^ i123) + ((i122 & i123) << 1));
                int i124 = write.RemoteActionCompatParcelizer[maybeskipcomment.ordinal()];
                if (i124 != 1) {
                    int i125 = setSessionImpl;
                    int i126 = i125 & 87;
                    int i127 = -(-(i125 | 87));
                    int i128 = (i126 ^ i127) + ((i127 & i126) << 1);
                    int i129 = i128 % 128;
                    onSkipToNext = i129;
                    if (i128 % 2 == 0 ? i124 == 2 : i124 == 4) {
                        buildResolutionString.IconCompatParcelizer("VideoDocking", "Positioning for RIGHT dock");
                        lessonVideoActivity.handleOnBackStarted();
                        int i130 = onSkipToNext + 61;
                        setSessionImpl = i130 % 128;
                        if (i130 % 2 == 0) {
                            lessonVideoActivity.read(f3, f, true);
                        } else {
                            lessonVideoActivity.read(f3, f, false);
                        }
                        FrameLayout frameLayout = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver;
                        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
                        FrameLayout frameLayout2 = frameLayout;
                        int i131 = onSkipToNext;
                        int i132 = i131 & 73;
                        int i133 = (i131 ^ 73) | i132;
                        int i134 = (i132 ^ i133) + ((i133 & i132) << 1);
                        setSessionImpl = i134 % 128;
                        if (i134 % 2 == 0) {
                            frameLayout2.setVisibility(0);
                            throw null;
                        }
                        frameLayout2.setVisibility(0);
                        int i135 = onSkipToNext;
                        int i136 = (i135 | 105) << 1;
                        int i137 = -(((~i135) & 105) | (i135 & (-106)));
                        int i138 = (i136 ^ i137) + ((i137 & i136) << 1);
                        setSessionImpl = i138 % 128;
                        int i139 = i138 % 2;
                    } else {
                        int i140 = i129 + 49;
                        setSessionImpl = i140 % 128;
                        int i141 = i140 % 2;
                        if (i124 != 3) {
                            throw new RenewEligibleCreator();
                        }
                        int i142 = i129 + 107;
                        setSessionImpl = i142 % 128;
                        int i143 = i142 % 2;
                        buildResolutionString.IconCompatParcelizer("VideoDocking", "No docking state!");
                        int i144 = onSkipToNext;
                        int i145 = ((i144 & 31) - (~(-(-(i144 | 31))))) - 1;
                        setSessionImpl = i145 % 128;
                        int i146 = i145 % 2;
                    }
                } else {
                    buildResolutionString.IconCompatParcelizer("VideoDocking", "Positioning for LEFT dock");
                    write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1471186798, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1471186761);
                    int i147 = onSkipToNext;
                    int i148 = ((((i147 ^ 83) | (i147 & 83)) << 1) - (~(-(((~i147) & 83) | (i147 & (-84)))))) - 1;
                    setSessionImpl = i148 % 128;
                    if (i148 % 2 == 0) {
                        lessonVideoActivity.read(f2, f, true);
                    } else {
                        lessonVideoActivity.read(f2, f, false);
                    }
                    FrameLayout frameLayout3 = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver;
                    toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout3, "");
                    frameLayout3.setVisibility(0);
                    OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
                }
                lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver.requestLayout();
                int i149 = setSessionImpl;
                int i150 = (i149 | 27) << 1;
                int i151 = -(((~i149) & 27) | (i149 & (-28)));
                int i152 = (i150 ^ i151) + ((i151 & i150) << 1);
                onSkipToNext = i152 % 128;
                if (i152 % 2 != 0) {
                    int i153 = 5 / 2;
                }
            }
        }
        int i154 = onSkipToNext;
        int i155 = (i154 ^ 101) + ((i154 & 101) << 1);
        setSessionImpl = i155 % 128;
        int i156 = i155 % 2;
    }

    private static /* synthetic */ Object accessensureViewModelStore(Object[] objArr) {
        final LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        final maybeSkipWhitespace maybeskipwhitespace = (maybeSkipWhitespace) objArr[1];
        final int iIntValue = ((Number) objArr[2]).intValue();
        final int iIntValue2 = ((Number) objArr[3]).intValue();
        final maybeSkipComment maybeskipcomment = (maybeSkipComment) objArr[4];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 1;
        int i4 = (i2 | 1) & (~i3);
        int i5 = i3 << 1;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        setSessionImpl = i6 % 128;
        if (i6 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(maybeskipwhitespace, "");
            int i7 = 30 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(maybeskipwhitespace, "");
        }
        toMagicModuleMetaRepoModel.write(maybeskipcomment, "");
        Runnable runnable = lessonVideoActivity.MediaBrowserCompatSearchResultReceiver;
        Object obj = null;
        if (runnable != null) {
            int i8 = onSkipToNext;
            int i9 = ((i8 ^ 76) + ((i8 & 76) << 1)) - 1;
            setSessionImpl = i9 % 128;
            if (i9 % 2 == 0) {
                lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver.removeCallbacks(runnable);
                obj.hashCode();
                throw null;
            }
            lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver.removeCallbacks(runnable);
            int i10 = onSkipToNext;
            int i11 = i10 & 37;
            int i12 = (i10 ^ 37) | i11;
            int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
            int i14 = i13 % 128;
            setSessionImpl = i14;
            int i15 = i13 % 2;
            int i16 = (i14 & 85) + (i14 | 85);
            onSkipToNext = i16 % 128;
            int i17 = i16 % 2;
        }
        Runnable runnable2 = new Runnable() { // from class: o.HorizontalTextInVerticalContextSpan
            @Override // java.lang.Runnable
            public final void run() {
                LessonVideoActivity lessonVideoActivity2 = this.IconCompatParcelizer;
                maybeSkipWhitespace maybeskipwhitespace2 = maybeskipwhitespace;
                int i18 = iIntValue;
                int i19 = iIntValue2;
                LessonVideoActivity.write(new Object[]{lessonVideoActivity2, maybeskipwhitespace2, Integer.valueOf(i18), Integer.valueOf(i19), maybeskipcomment}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1396410177, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1396410279);
            }
        };
        int i18 = onSkipToNext;
        int i19 = ((((i18 ^ 5) | (i18 & 5)) << 1) - (~(-(((~i18) & 5) | (i18 & (-6)))))) - 1;
        setSessionImpl = i19 % 128;
        if (i19 % 2 == 0) {
            lessonVideoActivity.MediaBrowserCompatSearchResultReceiver = runnable2;
            FrameLayout frameLayout = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver;
            obj.hashCode();
            throw null;
        }
        lessonVideoActivity.MediaBrowserCompatSearchResultReceiver = runnable2;
        FrameLayout frameLayout2 = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver;
        int i20 = setSessionImpl;
        int i21 = i20 & 87;
        int i22 = ((((i20 ^ 87) | i21) << 1) - (~(-((i20 | 87) & (~i21))))) - 1;
        onSkipToNext = i22 % 128;
        int i23 = i22 % 2;
        frameLayout2.postDelayed(runnable2, 1000L);
        if (i23 != 0) {
            throw null;
        }
        int i24 = setSessionImpl;
        int i25 = i24 & 23;
        int i26 = (i24 | 23) & (~i25);
        int i27 = i25 << 1;
        int i28 = (i26 ^ i27) + ((i26 & i27) << 1);
        onSkipToNext = i28 % 128;
        if (i28 % 2 != 0) {
            int i29 = 17 / 0;
        }
        return null;
    }

    private final void Keep() {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = ((i2 ^ 66) + ((i2 & 66) << 1)) - 1;
        int i4 = i3 % 128;
        setSessionImpl = i4;
        int i5 = i3 % 2;
        Pair[] pairArr = new Pair[1];
        int i6 = i4 & 87;
        int i7 = i6 + ((i4 ^ 87) | i6);
        onSkipToNext = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            pairArr[0] = setAction.write("request_action", "prepare_dock");
            RemoteActionCompatParcelizer(_getIndexResolver.write(pairArr));
            throw null;
        }
        pairArr[0] = setAction.write("request_action", "prepare_dock");
        RemoteActionCompatParcelizer(_getIndexResolver.write(pairArr));
        int iIdentityHashCode = System.identityHashCode(this);
        int i8 = (-2060611914) | iIdentityHashCode;
        int i9 = (i8 | (~i8)) & (~i8);
        int i10 = -(-(((i9 & 8532225) | (8532225 ^ i9)) * 336));
        int i11 = (-588130180) ^ i10;
        int i12 = ((i10 & (-588130180)) | i11) << 1;
        int i13 = -i11;
        int i14 = (i12 ^ i13) + ((i12 & i13) << 1);
        int i15 = ~iIdentityHashCode;
        int i16 = (26097555 & i15) | (iIdentityHashCode & (-26097556));
        int i17 = iIdentityHashCode & 26097555;
        int i18 = (i17 & i16) | (i16 ^ i17);
        int i19 = (i18 | (~i18)) & (~i18);
        int i20 = i14 + (((i19 & (-2078177244)) | ((-2078177244) ^ i19)) * (-168));
        int i21 = ~((i15 & (-26097556)) | ((~i15) & 26097555) | (i15 & 26097555));
        int i22 = (-2060611914) & i21;
        int i23 = (i21 | (-2060611914)) & (~i22);
        int i24 = -(-(((i23 & i22) | (i23 ^ i22)) * 168));
        int i25 = i20 & i24;
        int i26 = (i25 - (~(-(-((i24 ^ i20) | i25))))) - 1;
        int iIdentityHashCode2 = System.identityHashCode(this);
        int i27 = ~((697249207 & iIdentityHashCode2) | (697249207 ^ iIdentityHashCode2));
        int i28 = 1378878016 & i27;
        int i29 = ((i27 | 1378878016) & (~i28)) | i28;
        int i30 = (~iIdentityHashCode2) & ((~iIdentityHashCode2) | iIdentityHashCode2);
        int i31 = (i30 & (-1538402296)) | ((~i30) & 1538402295);
        int i32 = i30 & 1538402295;
        int i33 = (i31 & i32) | (i31 ^ i32);
        int i34 = i33 & (-697249208);
        int i35 = ~(((i33 | (-697249208)) & (~i34)) | i34);
        int i36 = i29 & i35;
        int i37 = -(-((((i29 | i35) & (~i36)) | i36) * 886));
        int i38 = ((-1126705469) & i37) + (i37 | (-1126705469));
        int i39 = ~iIdentityHashCode2;
        int i40 = i39 ^ (-697249208);
        int i41 = i39 & (-697249208);
        int i42 = (i41 & i40) | (i40 ^ i41);
        int i43 = (i42 | (~i42)) & (~i42);
        int i44 = -(-(((i43 & 1538402295) | ((~i43) & 1538402295) | ((-1538402296) & i43)) * (-1772)));
        int i45 = ((i38 | i44) << 1) - (i44 ^ i38);
        int i46 = i30 ^ 1538402295;
        int i47 = -(-((~((i46 & i32) | (i46 ^ i32))) * 886));
        if (i26 > ((i45 | i47) << 1) - (i47 ^ i45)) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x0096 A[PHI: r1
      0x0096: PHI (r1v19 float) = (r1v18 float), (r1v41 float) binds: [B:8:0x0094, B:5:0x0065] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void IconCompatParcelizer(float r12, float r13) {
        /*
            Method dump skipped, instruction units count: 376
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.IconCompatParcelizer(float, float):void");
    }

    private static /* synthetic */ Object getActivityResultRegistry(Object[] objArr) {
        FrameLayout frameLayout;
        View view;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = ((i2 ^ 109) | (i2 & 109)) << 1;
        int i4 = -(((~i2) & 109) | (i2 & (-110)));
        int i5 = (i3 & i4) + (i4 | i3);
        onSkipToNext = i5 % 128;
        if (i5 % 2 != 0) {
            frameLayout = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
            int i6 = 46 / 0;
        } else {
            frameLayout = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        }
        int i7 = onSkipToNext;
        int i8 = i7 & 93;
        int i9 = (i7 | 93) & (~i8);
        int i10 = -(-(i8 << 1));
        int i11 = (i9 ^ i10) + ((i9 & i10) << 1);
        setSessionImpl = i11 % 128;
        Object obj = null;
        if (i11 % 2 == 0) {
            boolean z = frameLayout.getParent() instanceof View;
            obj.hashCode();
            throw null;
        }
        Object parent = frameLayout.getParent();
        if (!(parent instanceof View)) {
            int i12 = setSessionImpl;
            int i13 = ((i12 & 74) + (i12 | 74)) - 1;
            onSkipToNext = i13 % 128;
            int i14 = i13 % 2;
            view = null;
        } else {
            view = (View) parent;
            int i15 = onSkipToNext;
            int i16 = ((i15 ^ 79) | (i15 & 79)) << 1;
            int i17 = -(((~i15) & 79) | (i15 & (-80)));
            int i18 = (i16 & i17) + (i17 | i16);
            setSessionImpl = i18 % 128;
            if (i18 % 2 == 0) {
                int i19 = 5 % 3;
            }
        }
        if (view == null) {
            int i20 = onSkipToNext;
            int i21 = i20 & 3;
            int i22 = (i20 ^ 3) | i21;
            int i23 = ((i21 | i22) << 1) - (i22 ^ i21);
            setSessionImpl = i23 % 128;
            if (i23 % 2 != 0) {
                return null;
            }
            throw null;
        }
        int i24 = updateNavigation.read((Context) lessonVideoActivity, 100);
        float width = frameLayout.getWidth() + fFloatValue;
        int iAudioAttributesCompatParcelizer = OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        int i25 = (-983695632) & iAudioAttributesCompatParcelizer;
        int i26 = (~i25) & ((-983695632) | iAudioAttributesCompatParcelizer);
        int i27 = ~((i25 & i26) | (i26 ^ i25));
        int i28 = -(-(((i27 & 194638169) | (194638169 ^ i27)) * 672));
        int i29 = (-8252663) & i28;
        int i30 = (((((-8252663) ^ i28) | i29) << 1) - (~(-((~i29) & (i28 | (-8252663)))))) - 1;
        int i31 = ~iAudioAttributesCompatParcelizer;
        int i32 = ~(((-983695632) & i31) | ((~i31) & 983695631) | (983695631 & i31));
        int i33 = ~((iAudioAttributesCompatParcelizer & 194638169) | (194638169 ^ iAudioAttributesCompatParcelizer));
        int i34 = ((~i33) & i32) | ((~i32) & i33);
        int i35 = i33 & i32;
        int i36 = -(-(((i35 & i34) | (i34 ^ i35)) * (-672)));
        int i37 = i30 & i36;
        int i38 = ((i30 | i36) & (~i37)) + (i37 << 1);
        int i39 = ((~i31) & (-194638170)) | (194638169 & i31);
        int i40 = i31 & (-194638170);
        int i41 = ~((i40 & i39) | (i39 ^ i40));
        int i42 = i41 & 176161033;
        int i43 = -(-((((i41 | 176161033) & (~i42)) | i42) * 672));
        int i44 = (((i38 ^ i43) | (i38 & i43)) << 1) - ((i43 & (~i38)) | ((~i43) & i38));
        int iAudioAttributesCompatParcelizer2 = OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        int i45 = ~iAudioAttributesCompatParcelizer2;
        int i46 = (i45 & (-698281454)) | ((-698281454) ^ i45);
        int i47 = (i46 | (~i46)) & (~i46);
        int i48 = (-832897248) & iAudioAttributesCompatParcelizer2;
        int i49 = ~(((~i48) & ((-832897248) | iAudioAttributesCompatParcelizer2)) | i48);
        int i50 = ((i49 & i47) | ((~i47) & i49) | ((~i49) & i47)) * (-370);
        int i51 = (1131614628 ^ i50) + ((i50 & 1131614628) << 1);
        int i52 = ~iAudioAttributesCompatParcelizer2;
        int i53 = (-832897248) & i52;
        int i54 = (i52 | (-832897248)) & (~i53);
        int i55 = ~((i54 & i53) | (i54 ^ i53));
        int i56 = (-698281454) ^ iAudioAttributesCompatParcelizer2;
        int i57 = iAudioAttributesCompatParcelizer2 & (-698281454);
        int i58 = ~((i57 & i56) | (i56 ^ i57));
        int i59 = i55 ^ i58;
        int i60 = i55 & i58;
        int i61 = (i60 & i59) | (i59 ^ i60);
        int i62 = i61 & (-968879616);
        int i63 = (i61 | (-968879616)) & (~i62);
        int i64 = ((i63 & i62) | (i63 ^ i62)) * (-370);
        int i65 = ((i51 | i64) << 1) - (i64 ^ i51);
        if (i44 > (i65 & (-2003172352)) + ((-2003172352) | i65)) {
            Object obj2 = null;
            view.getWidth();
            frameLayout.getWidth();
            view.getWidth();
            obj2.hashCode();
            throw null;
        }
        float width2 = view.getWidth();
        int width3 = frameLayout.getWidth();
        int width4 = view.getWidth();
        float f = width2 - fFloatValue;
        StringBuilder sb = new StringBuilder("X: ");
        int i66 = onSkipToNext + 17;
        setSessionImpl = i66 % 128;
        if (i66 % 2 == 0) {
            sb.append(fFloatValue);
            sb.append(", ContainerW: ");
            sb.append(width3);
            sb.append(", Left: ");
            throw null;
        }
        sb.append(fFloatValue);
        sb.append(", ContainerW: ");
        sb.append(width3);
        sb.append(", Left: ");
        int i67 = onSkipToNext;
        int i68 = (i67 & (-4)) | ((~i67) & 3);
        int i69 = (i67 & 3) << 1;
        int i70 = (i68 & i69) + (i69 | i68);
        setSessionImpl = i70 % 128;
        if (i70 % 2 == 0) {
            sb.append(fFloatValue);
            sb.append(", Right: ");
            sb.append(width);
            sb.append(", ParentW: ");
            int i71 = 86 / 0;
        } else {
            sb.append(fFloatValue);
            sb.append(", Right: ");
            sb.append(width);
            sb.append(", ParentW: ");
        }
        sb.append(width4);
        sb.append(", Threshold: ");
        sb.append(i24);
        int i72 = onSkipToNext;
        int i73 = (i72 & (-46)) | ((~i72) & 45);
        int i74 = -(-((i72 & 45) << 1));
        int i75 = ((i73 | i74) << 1) - (i74 ^ i73);
        setSessionImpl = i75 % 128;
        int i76 = i75 % 2;
        sb.append(", DistFromLeft: ");
        sb.append(width);
        sb.append(", DistFromRight: ");
        sb.append(f);
        String string = sb.toString();
        int i77 = setSessionImpl;
        int i78 = ((i77 ^ 122) + ((i77 & 122) << 1)) - 1;
        onSkipToNext = i78 % 128;
        if (i78 % 2 != 0) {
            Object obj3 = null;
            buildResolutionString.IconCompatParcelizer("VideoPipTesting", string);
            obj3.hashCode();
            throw null;
        }
        buildResolutionString.IconCompatParcelizer("VideoPipTesting", string);
        float f2 = i24;
        if (width < f2) {
            buildResolutionString.IconCompatParcelizer("VideoPipTesting", "✓ NEAR LEFT EDGE");
            lessonVideoActivity.AlertControllerRecycleListView();
            int i79 = onSkipToNext;
            int i80 = (i79 ^ 115) + ((i79 & 115) << 1);
            setSessionImpl = i80 % 128;
            if (i80 % 2 != 0) {
                return null;
            }
            int i81 = 76 / 0;
            return null;
        }
        if (f >= f2) {
            buildResolutionString.IconCompatParcelizer("VideoPipTesting", "○ AWAY FROM EDGES");
            write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 158115100, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -158115093);
            int i82 = onSkipToNext;
            int i83 = ((i82 & 20) + (i82 | 20)) - 1;
            setSessionImpl = i83 % 128;
            int i84 = i83 % 2;
            return null;
        }
        int i85 = (-2) - ((setSessionImpl + 116) ^ (-1));
        onSkipToNext = i85 % 128;
        if (i85 % 2 != 0) {
            buildResolutionString.IconCompatParcelizer("VideoPipTesting", "✓ NEAR RIGHT EDGE");
            write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -2102528170, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 2102528211);
            int i86 = 30 / 0;
        } else {
            buildResolutionString.IconCompatParcelizer("VideoPipTesting", "✓ NEAR RIGHT EDGE");
            write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -2102528170, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 2102528211);
        }
        int i87 = setSessionImpl;
        int i88 = i87 & 113;
        int i89 = -(-(i87 | 113));
        int i90 = (i88 ^ i89) + ((i89 & i88) << 1);
        onSkipToNext = i90 % 128;
        int i91 = i90 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void AlertControllerRecycleListView() {
        int i = 2 % 2;
        int i2 = setSessionImpl + 39;
        onSkipToNext = i2 % 128;
        Object obj = null;
        if (i2 % 2 == 0) {
            handleOnBackStarted();
            fromStyleLine fromstyleline = (fromStyleLine) getMPresenter();
            maybeSkipComment maybeskipcomment = maybeSkipComment.AudioAttributesCompatParcelizer;
            int i3 = onSkipToNext;
            int i4 = ((i3 ^ 65) | (i3 & 65)) << 1;
            int i5 = -(((~i3) & 65) | (i3 & (-66)));
            int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
            setSessionImpl = i6 % 128;
            int i7 = i6 % 2;
            fromstyleline.RemoteActionCompatParcelizer(maybeskipcomment);
            if (i7 == 0) {
                throw null;
            }
            return;
        }
        handleOnBackStarted();
        maybeSkipComment maybeskipcomment2 = maybeSkipComment.AudioAttributesCompatParcelizer;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object onStop(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext + 7;
        setSessionImpl = i2 % 128;
        int i3 = i2 % 2;
        write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1471186798, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1471186761);
        fromStyleLine fromstyleline = (fromStyleLine) lessonVideoActivity.getMPresenter();
        maybeSkipComment maybeskipcomment = maybeSkipComment.RemoteActionCompatParcelizer;
        int i4 = setSessionImpl + 3;
        onSkipToNext = i4 % 128;
        int i5 = i4 % 2;
        fromstyleline.RemoteActionCompatParcelizer(maybeskipcomment);
        if (i5 == 0) {
            return null;
        }
        int i6 = 60 / 0;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object MediaBrowserCompatItemReceiver(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = ((i2 & 46) + (i2 | 46)) - 1;
        int i4 = i3 % 128;
        onSkipToNext = i4;
        int i5 = i3 % 2;
        Pair[] pairArr = new Pair[1];
        int i6 = i4 + 17;
        setSessionImpl = i6 % 128;
        if (i6 % 2 == 0) {
            pairArr[0] = setAction.write("request_action", "hide_dock_on_priority");
            lessonVideoActivity.RemoteActionCompatParcelizer(_getIndexResolver.write(pairArr));
            int i7 = 70 / 0;
        } else {
            pairArr[0] = setAction.write("request_action", "hide_dock_on_priority");
            lessonVideoActivity.RemoteActionCompatParcelizer(_getIndexResolver.write(pairArr));
        }
        ((fromStyleLine) lessonVideoActivity.getMPresenter())._init_lambda2();
        int i8 = setSessionImpl;
        int i9 = (i8 & (-118)) | ((~i8) & 117);
        int i10 = (i8 & 117) << 1;
        int i11 = (i9 & i10) + (i10 | i9);
        onSkipToNext = i11 % 128;
        int i12 = i11 % 2;
        return null;
    }

    private static /* synthetic */ Object accessonBackPresseds1027565324(Object[] objArr) {
        char c;
        Pair[] pairArr;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = onSkipToNext + 74;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        setSessionImpl = i3 % 128;
        if (i3 % 2 == 0) {
            pairArr = new Pair[3];
            c = 1;
        } else {
            c = 0;
            pairArr = new Pair[2];
        }
        pairArr[c] = setAction.write("request_action", "add_styling");
        Boolean boolValueOf = Boolean.valueOf(zBooleanValue);
        int i4 = setSessionImpl;
        int i5 = (i4 ^ 73) + ((i4 & 73) << 1);
        onSkipToNext = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            pairArr[1] = setAction.write("isInternalPip", boolValueOf);
            lessonVideoActivity.RemoteActionCompatParcelizer(_getIndexResolver.write(pairArr));
            int i6 = setSessionImpl + 95;
            onSkipToNext = i6 % 128;
            if (i6 % 2 == 0) {
                return null;
            }
            obj.hashCode();
            throw null;
        }
        pairArr[1] = setAction.write("isInternalPip", boolValueOf);
        lessonVideoActivity.RemoteActionCompatParcelizer(_getIndexResolver.write(pairArr));
        throw null;
    }

    private static /* synthetic */ Object onCommand(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        ReferenceTypeDeserializer referenceTypeDeserializer = new ReferenceTypeDeserializer();
        parseRangedUrl parserangedurlRemoveOnPictureInPictureModeChangedListener = lessonVideoActivity.removeOnPictureInPictureModeChangedListener();
        int i2 = onSkipToNext;
        int i3 = ((i2 & 26) + (i2 | 26)) - 1;
        setSessionImpl = i3 % 128;
        if (i3 % 2 == 0) {
            referenceTypeDeserializer.RemoteActionCompatParcelizer(parserangedurlRemoveOnPictureInPictureModeChangedListener.AudioAttributesCompatParcelizer);
            referenceTypeDeserializer.write(R.id.video_fragment_container);
            int i4 = 28 / 0;
        } else {
            referenceTypeDeserializer.RemoteActionCompatParcelizer(parserangedurlRemoveOnPictureInPictureModeChangedListener.AudioAttributesCompatParcelizer);
            referenceTypeDeserializer.write(R.id.video_fragment_container);
        }
        int i5 = onSkipToNext;
        int i6 = i5 & 97;
        int i7 = -(-((i5 ^ 97) | i6));
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        setSessionImpl = i8 % 128;
        if (i8 % 2 == 0) {
            reportWithProductId.RemoteActionCompatParcelizer(lessonVideoActivity.removeOnPictureInPictureModeChangedListener().AudioAttributesCompatParcelizer);
            int i9 = 76 / 0;
        } else {
            reportWithProductId.RemoteActionCompatParcelizer(lessonVideoActivity.removeOnPictureInPictureModeChangedListener().AudioAttributesCompatParcelizer);
        }
        referenceTypeDeserializer.write(lessonVideoActivity.removeOnPictureInPictureModeChangedListener().AudioAttributesCompatParcelizer);
        parseRangedUrl parserangedurlRemoveOnPictureInPictureModeChangedListener2 = lessonVideoActivity.removeOnPictureInPictureModeChangedListener();
        int i10 = setSessionImpl;
        int i11 = (i10 | 53) << 1;
        int i12 = -(((~i10) & 53) | (i10 & (-54)));
        int i13 = (i11 & i12) + (i12 | i11);
        onSkipToNext = i13 % 128;
        if (i13 % 2 == 0) {
            parserangedurlRemoveOnPictureInPictureModeChangedListener2.AudioAttributesCompatParcelizer.requestLayout();
            return null;
        }
        parserangedurlRemoveOnPictureInPictureModeChangedListener2.AudioAttributesCompatParcelizer.requestLayout();
        throw null;
    }

    private static /* synthetic */ Object addOnUserLeaveHintListener(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl + 3;
        onSkipToNext = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer();
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayoutWrite = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi21Parcelizer.IconCompatParcelizer();
        int i3 = onSkipToNext;
        int i4 = (i3 & 5) + (i3 | 5);
        setSessionImpl = i4 % 128;
        if (i4 % 2 == 0) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutWrite, "");
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutWrite, "");
        constraintLayoutWrite.setVisibility(8);
        int i5 = setSessionImpl;
        int i6 = ((i5 | 21) << 1) - (i5 ^ 21);
        onSkipToNext = i6 % 128;
        int i7 = i6 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x039d A[PHI: r0 r1
      0x039d: PHI (r0v34 float) = (r0v33 float), (r0v98 float) binds: [B:16:0x039b, B:13:0x0330] A[DONT_GENERATE, DONT_INLINE]
      0x039d: PHI (r1v14 float) = (r1v13 float), (r1v30 float) binds: [B:16:0x039b, B:13:0x0330] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // o.parseAlignment.write
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void IconCompatParcelizer(int r21, int r22, kotlin.maybeSkipComment r23) {
        /*
            Method dump skipped, instruction units count: 1386
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.IconCompatParcelizer(int, int, o.maybeSkipComment):void");
    }

    private final void read(final float p0, final float p1, final boolean p2) {
        int i = 2 % 2;
        FrameLayout frameLayout = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver;
        Runnable runnable = new Runnable() { // from class: o.RubySpan
            @Override // java.lang.Runnable
            public final void run() {
                LessonVideoActivity.IconCompatParcelizer(this.AudioAttributesCompatParcelizer, p2, p0, p1);
            }
        };
        int i2 = onSkipToNext;
        int i3 = i2 & 125;
        int i4 = (i2 ^ 125) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        frameLayout.post(runnable);
        int i7 = setSessionImpl;
        int i8 = i7 & 17;
        int i9 = i8 + ((i7 ^ 17) | i8);
        onSkipToNext = i9 % 128;
        int i10 = i9 % 2;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x005c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object onPlayFromUri(java.lang.Object[] r14) {
        /*
            Method dump skipped, instruction units count: 296
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.onPlayFromUri(java.lang.Object[]):java.lang.Object");
    }

    private static /* synthetic */ Object addOnConfigurationChangedListener(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        ReferenceTypeDeserializer referenceTypeDeserializer = new ReferenceTypeDeserializer();
        View viewFindViewById = lessonVideoActivity.findViewById(R.id.parent);
        int i2 = setSessionImpl;
        int i3 = i2 & 11;
        int i4 = -(-((i2 ^ 11) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        toMagicModuleMetaRepoModel.read(viewFindViewById, "");
        referenceTypeDeserializer.RemoteActionCompatParcelizer((ConstraintLayout) viewFindViewById);
        int i7 = setSessionImpl;
        int i8 = i7 & 103;
        int i9 = (i7 ^ 103) | i8;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        onSkipToNext = i10 % 128;
        int i11 = i10 % 2;
        referenceTypeDeserializer.write(R.id.gl_top, updateNavigation.read((Context) lessonVideoActivity, 106));
        int i12 = setSessionImpl;
        int i13 = (i12 ^ 66) + ((i12 & 66) << 1);
        int i14 = (i13 ^ (-1)) + (i13 << 1);
        onSkipToNext = i14 % 128;
        int i15 = i14 % 2;
        referenceTypeDeserializer.write((ConstraintLayout) lessonVideoActivity.findViewById(R.id.parent));
        if (i15 != 0) {
            throw null;
        }
        int i16 = onSkipToNext;
        int i17 = i16 & 85;
        int i18 = ((((i16 ^ 85) | i17) << 1) - (~(-((i16 | 85) & (~i17))))) - 1;
        setSessionImpl = i18 % 128;
        if (i18 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // o.parseAlignment.write
    public final void addObserverForBackInvokerlambda7() {
        int i = 2 % 2;
        ReferenceTypeDeserializer referenceTypeDeserializer = new ReferenceTypeDeserializer();
        View viewFindViewById = findViewById(R.id.parent);
        int i2 = onSkipToNext;
        int i3 = ((i2 | 119) << 1) - (((~i2) & 119) | (i2 & (-120)));
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        toMagicModuleMetaRepoModel.read(viewFindViewById, "");
        referenceTypeDeserializer.RemoteActionCompatParcelizer((ConstraintLayout) viewFindViewById);
        int i5 = onSkipToNext;
        int i6 = ((i5 ^ 38) + ((i5 & 38) << 1)) - 1;
        setSessionImpl = i6 % 128;
        if (i6 % 2 == 0) {
            referenceTypeDeserializer.write(R.id.gl_top, 1);
        } else {
            referenceTypeDeserializer.write(R.id.gl_top, 0);
        }
        referenceTypeDeserializer.write((ConstraintLayout) findViewById(R.id.parent));
        int i7 = onSkipToNext;
        int i8 = (i7 & 55) + (i7 | 55);
        setSessionImpl = i8 % 128;
        if (i8 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object onSkipToNext(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i = 2 % 2;
        int i2 = setSessionImpl + 93;
        onSkipToNext = i2 % 128;
        int i3 = i2 % 2;
        super.onWindowFocusChanged(zBooleanValue);
        Object[] objArr2 = {(fromStyleLine) lessonVideoActivity.getMPresenter(), Boolean.valueOf(zBooleanValue)};
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, 555181817, objArr2, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, -555181802);
        int i4 = setSessionImpl;
        int i5 = ((i4 & (-38)) | ((~i4) & 37)) + ((i4 & 37) << 1);
        onSkipToNext = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 26 / 0;
        }
        return null;
    }

    @Override // o.parseAlignment.write
    public final void AudioAttributesCompatParcelizer(int p0, String p1) {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = ((i2 ^ 119) - (~(-(-((i2 & 119) << 1))))) - 1;
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        toMagicModuleMetaRepoModel.write(p1, "");
        setItalicSpan.Companion iconCompatParcelizer = setItalicSpan.INSTANCE;
        int i5 = setSessionImpl;
        int i6 = i5 & 89;
        int i7 = (i5 ^ 89) | i6;
        int i8 = (i6 & i7) + (i7 | i6);
        onSkipToNext = i8 % 128;
        int i9 = i8 % 2;
        AudioAttributesCompatParcelizer(setItalicSpan.Companion.write(p0, p1));
        int i10 = onSkipToNext;
        int i11 = ((i10 ^ 27) | (i10 & 27)) << 1;
        int i12 = -(((~i10) & 27) | (i10 & (-28)));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        setSessionImpl = i13 % 128;
        int i14 = i13 % 2;
    }

    private static /* synthetic */ Object AudioAttributesImplApi26Parcelizer(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext + 65;
        setSessionImpl = i2 % 128;
        int i3 = i2 % 2;
        Object obj = null;
        HlsTrackMetadataEntry1 hlsTrackMetadataEntry1 = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver;
        if (i3 == 0) {
            TextView textView = hlsTrackMetadataEntry1.AudioAttributesImplApi26Parcelizer.read;
            obj.hashCode();
            throw null;
        }
        TextView textView2 = hlsTrackMetadataEntry1.AudioAttributesImplApi26Parcelizer.read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView2, "");
        int i4 = onSkipToNext;
        int i5 = ((i4 | 76) << 1) - (i4 ^ 76);
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        setSessionImpl = i6 % 128;
        int i7 = i6 % 2;
        PlayerControlViewExternalSyntheticLambda1.write((View) textView2);
        if (i7 == 0) {
            throw null;
        }
        int i8 = setSessionImpl;
        int i9 = (i8 | 59) << 1;
        int i10 = -(((~i8) & 59) | (i8 & (-60)));
        int i11 = (i9 & i10) + (i10 | i9);
        onSkipToNext = i11 % 128;
        if (i11 % 2 != 0) {
            int i12 = 55 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object onPrepareFromUri(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl + 53;
        onSkipToNext = i2 % 128;
        int i3 = i2 % 2;
        ConstraintLayout constraintLayoutAudioAttributesCompatParcelizer = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
        int i4 = setSessionImpl;
        int i5 = ((i4 & 70) + (i4 | 70)) - 1;
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutAudioAttributesCompatParcelizer, "");
        ConstraintLayout constraintLayout = constraintLayoutAudioAttributesCompatParcelizer;
        if (i6 != 0) {
            PlayerControlViewExternalSyntheticLambda1.write(constraintLayout);
            throw null;
        }
        PlayerControlViewExternalSyntheticLambda1.write(constraintLayout);
        int i7 = setSessionImpl;
        int i8 = i7 & 103;
        int i9 = -(-((i7 ^ 103) | i8));
        int i10 = (i8 & i9) + (i9 | i8);
        onSkipToNext = i10 % 128;
        int i11 = i10 % 2;
        return null;
    }

    private static /* synthetic */ Object getLifecycle(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = ((i2 ^ 121) | (i2 & 121)) << 1;
        int i4 = -(((~i2) & 121) | (i2 & (-122)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        ConstraintLayout constraintLayoutAudioAttributesCompatParcelizer = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplApi26Parcelizer.IconCompatParcelizer();
        int i7 = setSessionImpl;
        int i8 = ((i7 ^ 117) | (i7 & 117)) << 1;
        int i9 = -(((~i7) & 117) | (i7 & (-118)));
        int i10 = (i8 & i9) + (i9 | i8);
        onSkipToNext = i10 % 128;
        int i11 = i10 % 2;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayoutAudioAttributesCompatParcelizer, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(constraintLayoutAudioAttributesCompatParcelizer);
        int i12 = onSkipToNext;
        int i13 = ((i12 ^ 79) | (i12 & 79)) << 1;
        int i14 = -(((~i12) & 79) | (i12 & (-80)));
        int i15 = (i13 & i14) + (i14 | i13);
        setSessionImpl = i15 % 128;
        Object obj = null;
        if (i15 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onMediaButtonEvent(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity;
        LessonVideoActivity lessonVideoActivity2 = (LessonVideoActivity) objArr[0];
        String str = (String) objArr[1];
        String str2 = (String) objArr[2];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = 7;
        int i4 = ((i2 & (-8)) | ((~i2) & 7)) + ((i2 & 7) << 1);
        onSkipToNext = i4 % 128;
        if (i4 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            throw null;
        }
        toMagicModuleMetaRepoModel.write(str, "");
        toMagicModuleMetaRepoModel.write(str2, "");
        lessonVideoActivity2.MediaBrowserCompatCustomActionResultReceiver = true;
        setTokenBinding.Companion readVar = setTokenBinding.INSTANCE;
        int i5 = setSessionImpl;
        int i6 = i5 + 2;
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        onSkipToNext = i7 % 128;
        if (i7 % 2 != 0) {
            lessonVideoActivity = lessonVideoActivity2;
            i3 = 118;
        } else {
            lessonVideoActivity = lessonVideoActivity2;
        }
        int i8 = (i5 & 61) + (i5 | 61);
        onSkipToNext = i8 % 128;
        if (i8 % 2 != 0) {
            lessonVideoActivity2.startActivityForResult(setTokenBinding.Companion.IconCompatParcelizer(lessonVideoActivity, str, i3, CourseConfigKeyConstantsKt.KEY_RELATED_MODULE), lessonVideoActivity2.onPlay);
            throw null;
        }
        lessonVideoActivity2.startActivityForResult(setTokenBinding.Companion.IconCompatParcelizer(lessonVideoActivity, str, i3, CourseConfigKeyConstantsKt.KEY_RELATED_MODULE), lessonVideoActivity2.onPlay);
        int i9 = onSkipToNext;
        int i10 = i9 & 55;
        int i11 = i10 + ((i9 ^ 55) | i10);
        setSessionImpl = i11 % 128;
        if (i11 % 2 != 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object MediaMetadataCompat(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 41;
        int i4 = -(-(i2 | 41));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        super.onStart();
        lessonVideoActivity.MediaBrowserCompatCustomActionResultReceiver = false;
        int i7 = onSkipToNext;
        int i8 = ((i7 ^ 5) | (i7 & 5)) << 1;
        int i9 = -(((~i7) & 5) | (i7 & (-6)));
        int i10 = (i8 & i9) + (i9 | i8);
        setSessionImpl = i10 % 128;
        int i11 = i10 % 2;
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x04e0  */
    @Override // kotlin.parseIdentifierSection, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onResume() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 1610
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.onResume():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.marrow.ui.activities.base.BaseActivity
    public final void onSkipToPrevious() {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 67;
        int i4 = (((i2 ^ 67) | i3) << 1) - ((i2 | 67) & (~i3));
        onSkipToNext = i4 % 128;
        int i5 = i4 % 2;
        fromStyleLine fromstyleline = (fromStyleLine) getMPresenter();
        if (i5 != 0) {
            fromstyleline.onFastForward();
            throw null;
        }
        fromstyleline.onFastForward();
        int i6 = setSessionImpl;
        int i7 = i6 & 81;
        int i8 = ((((i6 ^ 81) | i7) << 1) - (~(-((i6 | 81) & (~i7))))) - 1;
        onSkipToNext = i8 % 128;
        int i9 = i8 % 2;
    }

    private static /* synthetic */ Object _init_lambda3(Object[] objArr) {
        String str;
        Locale locale;
        Object[] objArr2;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        float fFloatValue = ((Number) objArr[1]).floatValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 19;
        int i4 = (i2 ^ 19) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatSearchResultReceiver.setRating(fFloatValue);
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel = toMagicModuleStatusUcModel.INSTANCE;
        int i7 = onSkipToNext;
        int i8 = (i7 & 7) + (i7 | 7);
        setSessionImpl = i8 % 128;
        int i9 = i8 % 2;
        Object[] objArr3 = {dispatchTouchEvent.AudioAttributesCompatParcelizer(iIntValue)};
        int i10 = onSkipToNext;
        int i11 = i10 & 5;
        int i12 = ((i10 ^ 5) | i11) << 1;
        int i13 = -((i10 | 5) & (~i11));
        int i14 = ((i12 | i13) << 1) - (i13 ^ i12);
        setSessionImpl = i14 % 128;
        if (i14 % 2 == 0) {
            str = String.format("(%s)", Arrays.copyOf(objArr3, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        } else {
            str = String.format("(%s)", Arrays.copyOf(objArr3, 1));
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str, "");
        }
        toMagicModuleStatusUcModel tomagicmodulestatusucmodel2 = toMagicModuleStatusUcModel.INSTANCE;
        int i15 = setSessionImpl + 3;
        onSkipToNext = i15 % 128;
        if (i15 % 2 != 0) {
            locale = Locale.getDefault();
            objArr2 = new Object[0];
            objArr2[0] = Float.valueOf(fFloatValue);
        } else {
            locale = Locale.getDefault();
            objArr2 = new Object[]{Float.valueOf(fFloatValue)};
        }
        String str2 = String.format(locale, "%.1f", Arrays.copyOf(objArr2, 1));
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(str2, "");
        TextView textView = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.onCommand;
        StringBuilder sb = new StringBuilder();
        int i16 = setSessionImpl;
        int i17 = (i16 & 57) + (i16 | 57);
        onSkipToNext = i17 % 128;
        int i18 = i17 % 2;
        sb.append(str2);
        sb.append(" ");
        sb.append(str);
        String string = sb.toString();
        int i19 = onSkipToNext;
        int i20 = (i19 ^ 113) + ((i19 & 113) << 1);
        setSessionImpl = i20 % 128;
        if (i20 % 2 != 0) {
            textView.setText(string);
            return null;
        }
        textView.setText(string);
        throw null;
    }

    private static /* synthetic */ Object r8lambdaKUbBm7ckfqTc9QCgukC86fguu4(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 77;
        int i4 = i3 + ((i2 ^ 77) | i3);
        setSessionImpl = i4 % 128;
        if (i4 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            TextView textView = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat;
            throw null;
        }
        toMagicModuleMetaRepoModel.write(str, "");
        lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.MediaDescriptionCompat.setText(str);
        int i5 = setSessionImpl;
        int i6 = i5 & 13;
        int i7 = (i5 ^ 13) | i6;
        int i8 = ((i6 | i7) << 1) - (i7 ^ i6);
        onSkipToNext = i8 % 128;
        if (i8 % 2 != 0) {
            int i9 = 27 / 0;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x007a  */
    @Override // o.parseAlignment.write
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPlayFromSearch() {
        /*
            Method dump skipped, instruction units count: 286
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.onPlayFromSearch():void");
    }

    private static /* synthetic */ Object addObserverForBackInvokerlambda7(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        String str = (String) objArr[1];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (((i2 | 82) << 1) - (i2 ^ 82)) - 1;
        setSessionImpl = i3 % 128;
        if (i3 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(str, "");
            lessonVideoActivity.AudioAttributesCompatParcelizer(str);
            return null;
        }
        toMagicModuleMetaRepoModel.write(str, "");
        lessonVideoActivity.AudioAttributesCompatParcelizer(str);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0084  */
    @Override // o.parseAlignment.write
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPlay() {
        /*
            Method dump skipped, instruction units count: 306
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.onPlay():void");
    }

    private static /* synthetic */ Object onCreate(Object[] objArr) {
        TextView textView;
        int i;
        TextView textView2;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int iIntValue = ((Number) objArr[2]).intValue();
        int i2 = 2 % 2;
        int i3 = onSkipToNext + 77;
        setSessionImpl = i3 % 128;
        if (i3 % 2 == 0) {
            textView = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
            int i4 = 81 / 0;
        } else {
            textView = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(textView, "");
        TextView textView3 = textView;
        if (!zBooleanValue) {
            int i5 = setSessionImpl + 105;
            onSkipToNext = i5 % 128;
            int i6 = i5 % 2;
            i = 8;
        } else {
            int i7 = setSessionImpl;
            int i8 = ((i7 ^ 3) | (i7 & 3)) << 1;
            int i9 = -(((~i7) & 3) | (i7 & (-4)));
            int i10 = (i8 & i9) + (i9 | i8);
            int i11 = i10 % 128;
            onSkipToNext = i11;
            int i12 = i10 % 2;
            int i13 = i11 + 95;
            setSessionImpl = i13 % 128;
            if (i13 % 2 == 0) {
                int i14 = 5 / 4;
            }
            i = 0;
        }
        textView3.setVisibility(i);
        if (iIntValue > 0) {
            int i15 = setSessionImpl;
            int i16 = i15 ^ 73;
            int i17 = ((i15 & 73) | i16) << 1;
            int i18 = -i16;
            int i19 = (i17 & i18) + (i17 | i18);
            onSkipToNext = i19 % 128;
            if (i19 % 2 != 0) {
                textView2 = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
                int i20 = 13 / 0;
            } else {
                textView2 = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
            }
            Object[] objArr2 = {Integer.valueOf(iIntValue)};
            int i21 = onSkipToNext;
            int i22 = (((i21 & (-84)) | ((~i21) & 83)) - (~(-(-((i21 & 83) << 1))))) - 1;
            setSessionImpl = i22 % 128;
            if (i22 % 2 == 0) {
                lessonVideoActivity.getString(R.string.expand_timelines, objArr2);
                throw null;
            }
            String string = lessonVideoActivity.getString(R.string.expand_timelines, objArr2);
            int i23 = onSkipToNext;
            int i24 = (i23 & (-126)) | ((~i23) & 125);
            int i25 = -(-((i23 & 125) << 1));
            int i26 = (i24 & i25) + (i25 | i24);
            setSessionImpl = i26 % 128;
            if (i26 % 2 == 0) {
                textView2.setText(string);
                throw null;
            }
            textView2.setText(string);
        }
        int i27 = onSkipToNext;
        int i28 = (i27 ^ 5) + ((i27 & 5) << 1);
        setSessionImpl = i28 % 128;
        if (i28 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // o.parseAlignment.write
    public final void onMediaButtonEvent() {
        ImageView imageView;
        int i;
        int i2;
        ReferenceTypeDeserializer referenceTypeDeserializer;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        ReferenceTypeDeserializer referenceTypeDeserializer2;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        ReferenceTypeDeserializer referenceTypeDeserializer3;
        int i13;
        int i14;
        int i15;
        int i16 = 2 % 2;
        int i17 = onSkipToNext;
        int i18 = (i17 & 69) + (i17 | 69);
        setSessionImpl = i18 % 128;
        if (i18 % 2 == 0) {
            removeOnPictureInPictureModeChangedListener().MediaBrowserCompatItemReceiver.setImageResource(R.drawable.ic_notes_collapse);
            imageView = removeOnPictureInPictureModeChangedListener().AudioAttributesImplApi26Parcelizer;
            int i19 = 48 / 0;
        } else {
            removeOnPictureInPictureModeChangedListener().MediaBrowserCompatItemReceiver.setImageResource(R.drawable.ic_notes_collapse);
            imageView = removeOnPictureInPictureModeChangedListener().AudioAttributesImplApi26Parcelizer;
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        imageView.setVisibility(8);
        ReferenceTypeDeserializer referenceTypeDeserializer4 = new ReferenceTypeDeserializer();
        parseRangedUrl parserangedurlRemoveOnPictureInPictureModeChangedListener = removeOnPictureInPictureModeChangedListener();
        int i20 = setSessionImpl;
        int i21 = i20 & 5;
        int i22 = (i20 | 5) & (~i21);
        int i23 = -(-(i21 << 1));
        int i24 = (i22 ^ i23) + ((i22 & i23) << 1);
        onSkipToNext = i24 % 128;
        int i25 = i24 % 2;
        referenceTypeDeserializer4.RemoteActionCompatParcelizer(parserangedurlRemoveOnPictureInPictureModeChangedListener.AudioAttributesCompatParcelizer);
        referenceTypeDeserializer4.write(R.id.video_notes_container);
        referenceTypeDeserializer4.write(R.id.bottomVideoContainer);
        int i26 = setSessionImpl;
        int i27 = ((i26 ^ 85) - (~(-(-((i26 & 85) << 1))))) - 1;
        onSkipToNext = i27 % 128;
        if (i27 % 2 != 0) {
            i = R.id.constraint_parent;
            i2 = 0;
            referenceTypeDeserializer = referenceTypeDeserializer4;
            referenceTypeDeserializer.read(R.id.video_notes_container, 3, R.id.constraint_parent, 2, 0);
            i3 = R.id.video_notes_container;
            i4 = 0;
            i5 = 0;
        } else {
            i = R.id.constraint_parent;
            i2 = 0;
            referenceTypeDeserializer = referenceTypeDeserializer4;
            referenceTypeDeserializer.read(R.id.video_notes_container, 3, R.id.constraint_parent, 3, 0);
            i3 = R.id.video_notes_container;
            i4 = 1;
            i5 = 1;
        }
        referenceTypeDeserializer.read(i3, i4, i, i5, i2);
        int i28 = onSkipToNext;
        int i29 = i28 ^ 97;
        int i30 = -(-((i28 & 97) << 1));
        int i31 = (i29 ^ i30) + ((i30 & i29) << 1);
        setSessionImpl = i31 % 128;
        if (i31 % 2 == 0) {
            i6 = R.id.constraint_parent;
            referenceTypeDeserializer2 = referenceTypeDeserializer4;
            referenceTypeDeserializer2.read(R.id.video_notes_container, 4, R.id.constraint_parent, 5, 1);
            i8 = R.id.video_notes_container;
            i9 = 2;
            i10 = 4;
            i7 = 0;
        } else {
            i6 = R.id.constraint_parent;
            i7 = 0;
            referenceTypeDeserializer2 = referenceTypeDeserializer4;
            referenceTypeDeserializer2.read(R.id.video_notes_container, 2, R.id.constraint_parent, 2, 0);
            i8 = R.id.video_notes_container;
            i9 = 4;
            i10 = 4;
        }
        referenceTypeDeserializer2.read(i8, i9, i6, i10, i7);
        int i32 = setSessionImpl;
        int i33 = ((i32 | 57) << 1) - (i32 ^ 57);
        onSkipToNext = i33 % 128;
        if (i33 % 2 != 0) {
            i11 = R.id.constraint_parent;
            referenceTypeDeserializer3 = referenceTypeDeserializer4;
            referenceTypeDeserializer3.read(R.id.bottomVideoContainer, 3, R.id.constraint_parent, 4, 0);
            i13 = R.id.bottomVideoContainer;
            i14 = 0;
            i15 = 1;
            i12 = 1;
        } else {
            i11 = R.id.constraint_parent;
            i12 = 0;
            referenceTypeDeserializer3 = referenceTypeDeserializer4;
            referenceTypeDeserializer3.read(R.id.bottomVideoContainer, 3, R.id.constraint_parent, 3, 0);
            i13 = R.id.bottomVideoContainer;
            i14 = 1;
            i15 = 1;
        }
        referenceTypeDeserializer3.read(i13, i14, i11, i15, i12);
        int i34 = setSessionImpl + 44;
        int i35 = (i34 ^ (-1)) + (i34 << 1);
        onSkipToNext = i35 % 128;
        int i36 = i35 % 2;
        referenceTypeDeserializer4.read(R.id.bottomVideoContainer, 2, R.id.constraint_parent, 2, 0);
        referenceTypeDeserializer4.read(R.id.bottomVideoContainer, 4, R.id.constraint_parent, 4, 0);
        parseRangedUrl parserangedurlRemoveOnPictureInPictureModeChangedListener2 = removeOnPictureInPictureModeChangedListener();
        int i37 = setSessionImpl;
        int i38 = i37 ^ 55;
        int i39 = -(-((i37 & 55) << 1));
        int i40 = ((i38 | i39) << 1) - (i39 ^ i38);
        onSkipToNext = i40 % 128;
        int i41 = i40 % 2;
        referenceTypeDeserializer4.write(parserangedurlRemoveOnPictureInPictureModeChangedListener2.AudioAttributesCompatParcelizer);
        write(new Object[]{this, "FULL_SCREEN"}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1383148248, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1383148296);
        int i42 = setSessionImpl;
        int i43 = i42 & 41;
        int i44 = ((((i42 ^ 41) | i43) << 1) - (~(-((i42 | 41) & (~i43))))) - 1;
        onSkipToNext = i44 % 128;
        int i45 = i44 % 2;
    }

    private static /* synthetic */ Object getOnBackPressedDispatcherannotations(Object[] objArr) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i7 = 2 % 2;
        int i8 = setSessionImpl + 101;
        onSkipToNext = i8 % 128;
        int i9 = i8 % 2;
        lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatItemReceiver.setImageResource(R.drawable.ic_notes_expand);
        int i10 = onSkipToNext;
        int i11 = i10 & 7;
        int i12 = (i10 ^ 7) | i11;
        int i13 = (i11 & i12) + (i12 | i11);
        setSessionImpl = i13 % 128;
        Object obj = null;
        if (i13 % 2 == 0) {
            ImageView imageView = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().AudioAttributesImplApi26Parcelizer;
            obj.hashCode();
            throw null;
        }
        ImageView imageView2 = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().AudioAttributesImplApi26Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
        ImageView imageView3 = imageView2;
        if (!zBooleanValue) {
            int i14 = setSessionImpl;
            int i15 = (-2) - (((i14 ^ 66) + ((i14 & 66) << 1)) ^ (-1));
            onSkipToNext = i15 % 128;
            int i16 = i15 % 2;
            i = 0;
        } else {
            int i17 = setSessionImpl;
            int i18 = i17 & 103;
            int i19 = -(-((i17 ^ 103) | i18));
            int i20 = (i18 & i19) + (i19 | i18);
            onSkipToNext = i20 % 128;
            int i21 = i20 % 2;
            i = 8;
        }
        imageView3.setVisibility(i);
        ReferenceTypeDeserializer referenceTypeDeserializer = new ReferenceTypeDeserializer();
        int i22 = setSessionImpl;
        int i23 = i22 ^ 19;
        int i24 = ((i22 & 19) | i23) << 1;
        int i25 = -i23;
        int i26 = (i24 ^ i25) + ((i24 & i25) << 1);
        onSkipToNext = i26 % 128;
        int i27 = i26 % 2;
        referenceTypeDeserializer.RemoteActionCompatParcelizer(lessonVideoActivity.removeOnPictureInPictureModeChangedListener().AudioAttributesCompatParcelizer);
        int i28 = onSkipToNext;
        int i29 = (((i28 | 24) << 1) - (i28 ^ 24)) - 1;
        setSessionImpl = i29 % 128;
        if (i29 % 2 == 0) {
            referenceTypeDeserializer.write(R.id.video_notes_container);
            i2 = R.id.video_notes_container;
            i3 = 4;
            i4 = 1;
            i5 = 3;
            i6 = 1;
        } else {
            referenceTypeDeserializer.write(R.id.video_notes_container);
            i2 = R.id.video_notes_container;
            i3 = 3;
            i4 = 0;
            i5 = 3;
            i6 = 0;
        }
        referenceTypeDeserializer.read(i2, i3, i4, i5, i6);
        referenceTypeDeserializer.read(R.id.video_notes_container, 1, R.id.constraint_parent, 1, 0);
        int i30 = setSessionImpl + 100;
        int i31 = (i30 ^ (-1)) + (i30 << 1);
        onSkipToNext = i31 % 128;
        int i32 = i31 % 2;
        referenceTypeDeserializer.read(R.id.video_notes_container, 2, R.id.constraint_parent, 2, 0);
        int i33 = onSkipToNext;
        int i34 = ((i33 ^ 98) + ((i33 & 98) << 1)) - 1;
        setSessionImpl = i34 % 128;
        int i35 = i34 % 2;
        referenceTypeDeserializer.read(R.id.video_notes_container, 4, 0, 4, 0);
        int i36 = onSkipToNext;
        int i37 = i36 ^ 11;
        int i38 = (i36 & 11) << 1;
        int i39 = ((i37 | i38) << 1) - (i38 ^ i37);
        setSessionImpl = i39 % 128;
        int i40 = i39 % 2;
        referenceTypeDeserializer.write(lessonVideoActivity.removeOnPictureInPictureModeChangedListener().AudioAttributesCompatParcelizer);
        int i41 = onSkipToNext;
        int i42 = i41 | 31;
        int i43 = (i42 << 1) - ((~(i41 & 31)) & i42);
        setSessionImpl = i43 % 128;
        if (i43 % 2 == 0) {
            write(new Object[]{lessonVideoActivity, "NO_FULL_SCREEN"}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1383148248, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1383148296);
            int i44 = 13 / 0;
        } else {
            write(new Object[]{lessonVideoActivity, "NO_FULL_SCREEN"}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1383148248, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1383148296);
        }
        return null;
    }

    private static /* synthetic */ Object MediaBrowserCompatMediaItem(Object[] objArr) {
        boolean zRemoteActionCompatParcelizer;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (((i2 & (-12)) | ((~i2) & 11)) - (~((i2 & 11) << 1))) - 1;
        setSessionImpl = i3 % 128;
        if (i3 % 2 == 0) {
            zRemoteActionCompatParcelizer = requestPlayPauseAccessibilityFocus.INSTANCE.RemoteActionCompatParcelizer(lessonVideoActivity);
            int i4 = 27 / 0;
        } else {
            zRemoteActionCompatParcelizer = requestPlayPauseAccessibilityFocus.INSTANCE.RemoteActionCompatParcelizer(lessonVideoActivity);
        }
        return Boolean.valueOf(zRemoteActionCompatParcelizer);
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final void onSkipToNext() {
        int i = 2 % 2;
        getTrackGroup.AudioAttributesCompatParcelizer("video_usb", new Bundle());
        System.identityHashCode(this);
        OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        super.onSkipToNext();
        int i2 = setSessionImpl;
        int i3 = i2 & 125;
        int i4 = (i3 - (~(-(-((i2 ^ 125) | i3))))) - 1;
        onSkipToNext = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 85 / 0;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0054, code lost:
    
        if ((r5 % 2) != 0) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0056, code lost:
    
        r11.setData(android.net.Uri.parse(r2));
        r0.startActivity(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x0060, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0061, code lost:
    
        r11.setData(android.net.Uri.parse(r2));
        r0.startActivity(r11);
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x006b, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x006c, code lost:
    
        r11 = kotlin.ResolvableApiException.IconCompatParcelizer;
        r2 = java.lang.String.valueOf(r2);
        r5 = com.marrow.ui.activities.learn.video.LessonVideoActivity.onSkipToNext;
        r7 = r5 | 79;
        r8 = r7 << 1;
        r5 = -((~(r5 & 79)) & r7);
        r7 = (r8 & r5) + (r5 | r8);
        com.marrow.ui.activities.learn.video.LessonVideoActivity.setSessionImpl = r7 % 128;
        r7 = r7 % 2;
        r2 = "https://docs.google.com/viewer?embedded=true&url=".concat(r2);
        r5 = r0.getString(com.marrow.R.string.title_image_attribution_screen);
        kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r5, "");
        r7 = new kotlin.canceledPendingResult(r2, r5, kotlin.Response.AudioAttributesCompatParcelizer);
        r2 = com.marrow.ui.activities.learn.video.LessonVideoActivity.setSessionImpl;
        r4 = r2 & 43;
        r2 = (r2 ^ 43) | r4;
        r5 = (r4 ^ r2) + ((r2 & r4) << 1);
        com.marrow.ui.activities.learn.video.LessonVideoActivity.onSkipToNext = r5 % 128;
        r5 = r5 % 2;
        r0.startActivity(o.ResolvableApiException.IconCompatParcelizer.read(r0, r7));
        r11 = java.lang.System.identityHashCode(r0);
        r0 = ~r11;
        r3 = ~((((-625693907) & r0) | (r11 & 625693906)) | ((-625693907) & r11));
        r5 = ((~r3) & 67699922) | ((-67699923) & r3);
        r3 = r3 & 67699922;
        r3 = (r3 & r5) | (r5 ^ r3);
        r5 = ~r11;
        r8 = r5 & (-569563426);
        r8 = r8 | ((~r8) & (r5 | (-569563426)));
        r8 = (r8 & 625693906) | (r8 ^ 625693906);
        r8 = (r8 | (~r8)) & (~r8);
        r3 = -(-(((r3 & r8) | (r3 ^ r8)) * 886));
        r9 = (-206965364) ^ r3;
        r3 = ((r3 & (-206965364)) | r9) << 1;
        r8 = -r9;
        r9 = ((r3 | r8) << 1) - (r3 ^ r8);
        r2 = ((-625693907) & r5) | ((~r5) & 625693906);
        r3 = r5 & 625693906;
        r2 = (r2 & r3) | (r2 ^ r3);
        r2 = (r2 | (~r2)) & (~r2);
        r3 = (-569563426) & r2;
        r2 = (r2 | (-569563426)) & (~r3);
        r2 = -(-(((r2 & r3) | (r2 ^ r3)) * (-1772)));
        r3 = r9 & r2;
        r3 = (r3 - (~((r2 ^ r9) | r3))) - 1;
        r11 = (r11 | r0) & (~r11);
        r3 = (r3 - (~(-(-((~((r11 & (-569563426)) | (r11 ^ (-569563426)))) * 886))))) - 1;
        r11 = com.google.android.exoplayer2.drm.OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        r0 = (~r11) & ((~r11) | r11);
        r2 = ((~r0) & (-531013074)) | (r0 & 531013073);
        r0 = r0 & (-531013074);
        r0 = (r0 & r2) | (r2 ^ r0);
        r2 = ((-1394248020) & r0) | ((~r0) & 1394248019);
        r0 = r0 & 1394248019;
        r0 = (r0 & r2) | (r2 ^ r0);
        r0 = ((r0 | (~r0)) & (~r0)) * (-783);
        r7 = ((1096670322 | r0) << 1) - (r0 ^ 1096670322);
        r11 = ~r11;
        r0 = r11 ^ 1394248019;
        r11 = r11 & 1394248019;
        r11 = ~((r11 & r0) | (r0 ^ r11));
        r0 = ((~r11) & (-531013074)) | (r11 & 531013073);
        r11 = r11 & (-531013074);
        r11 = -(-(((r11 & r0) | (r0 ^ r11)) * 783));
        r0 = r7 ^ r11;
        r11 = (r11 & r7) << 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0189, code lost:
    
        if (r3 > ((r0 & r11) + (r11 | r0))) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x018b, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x018c, code lost:
    
        throw null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:5:0x0030, code lost:
    
        if (r11 != false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0038, code lost:
    
        if (r11 != true) goto L9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x003a, code lost:
    
        r11 = new android.content.Intent("android.intent.action.VIEW");
        r4 = com.marrow.ui.activities.learn.video.LessonVideoActivity.setSessionImpl;
        r5 = (((r4 & (-122)) | ((~r4) & 121)) - (~((r4 & 121) << 1))) - 1;
        com.marrow.ui.activities.learn.video.LessonVideoActivity.onSkipToNext = r5 % 128;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static /* synthetic */ java.lang.Object onPause(java.lang.Object[] r11) {
        /*
            Method dump skipped, instruction units count: 397
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.onPause(java.lang.Object[]):java.lang.Object");
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl + 103;
        onSkipToNext = i2 % 128;
        int i3 = i2 % 2;
        ((fromStyleLine) lessonVideoActivity.getMPresenter()).onSetRating();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i4 = setSessionImpl;
        int i5 = (i4 | 97) << 1;
        int i6 = -(i4 ^ 97);
        int i7 = (i5 & i6) + (i6 | i5);
        onSkipToNext = i7 % 128;
        if (i7 % 2 == 0) {
            return getshowpopup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onSetRating(Object[] objArr) {
        final LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        final int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (i2 ^ 25) + ((i2 & 25) << 1);
        setSessionImpl = i3 % 128;
        if (i3 % 2 == 0) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(lessonVideoActivity.removeOnPictureInPictureModeChangedListener().AudioAttributesImplApi21Parcelizer, "");
            throw null;
        }
        ConstraintLayout constraintLayout = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().AudioAttributesImplApi21Parcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        int i4 = onSkipToNext;
        int i5 = ((i4 ^ 109) | (i4 & 109)) << 1;
        int i6 = -(((~i4) & 109) | (i4 & (-110)));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        setSessionImpl = i7 % 128;
        if (i7 % 2 == 0) {
            PlayerControlViewExternalSyntheticLambda1.write(constraintLayout);
            ImageView imageView = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().AudioAttributesImplBaseParcelizer;
            throw null;
        }
        PlayerControlViewExternalSyntheticLambda1.write(constraintLayout);
        ImageView imageView2 = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
        ImageView imageView3 = imageView2;
        getCreatedOnDateMs getcreatedondatems = new getCreatedOnDateMs() { // from class: o.TextAnnotationPosition
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return LessonVideoActivity.RatingCompat(this.read);
            }
        };
        int i8 = onSkipToNext;
        int i9 = ((i8 & 101) - (~(-(-(i8 | 101))))) - 1;
        setSessionImpl = i9 % 128;
        if (i9 % 2 == 0) {
            RemoteActionCompatParcelizer(imageView3, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems);
            CustomButton customButton = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().read;
            throw null;
        }
        RemoteActionCompatParcelizer(imageView3, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems);
        CustomButton customButton2 = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().read;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(customButton2, "");
        CustomButton customButton3 = customButton2;
        getCreatedOnDateMs getcreatedondatems2 = new getCreatedOnDateMs() { // from class: o.SsaDecoder
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return LessonVideoActivity.RemoteActionCompatParcelizer(this.AudioAttributesCompatParcelizer, iIntValue);
            }
        };
        int i10 = setSessionImpl;
        int i11 = i10 ^ 35;
        int i12 = -(-((i10 & 35) << 1));
        int i13 = (i11 ^ i12) + ((i12 & i11) << 1);
        onSkipToNext = i13 % 128;
        if (i13 % 2 != 0) {
            RemoteActionCompatParcelizer(customButton3, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems2);
            int i14 = 68 / 0;
        } else {
            RemoteActionCompatParcelizer(customButton3, (getCreatedOnDateMs<getShowPopup>) getcreatedondatems2);
        }
        return null;
    }

    private static /* synthetic */ Object getDefaultViewModelProviderFactory(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (i2 & 7) + (i2 | 7);
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        setSmallestDisplacement.Companion readVar = setSmallestDisplacement.INSTANCE;
        Intent intentWrite = setSmallestDisplacement.Companion.write(lessonVideoActivity, iIntValue);
        int i5 = setSessionImpl;
        int i6 = i5 & 83;
        int i7 = (i6 - (~((i5 ^ 83) | i6))) - 1;
        onSkipToNext = i7 % 128;
        Object obj = null;
        if (i7 % 2 != 0) {
            lessonVideoActivity.handleMediaPlayPauseIfPendingOnHandler.read(intentWrite);
            getShowPopup getshowpopup = getShowPopup.INSTANCE;
            obj.hashCode();
            throw null;
        }
        lessonVideoActivity.handleMediaPlayPauseIfPendingOnHandler.read(intentWrite);
        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
        int i8 = onSkipToNext;
        int i9 = (i8 & 15) + (i8 | 15);
        setSessionImpl = i9 % 128;
        if (i9 % 2 != 0) {
            return getshowpopup2;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void setEnabledChangedCallbackactivity_release() {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 ^ 39;
        int i4 = ((i2 & 39) | i3) << 1;
        int i5 = -i3;
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        onSkipToNext = i6 % 128;
        int i7 = i6 % 2;
        this.onCustomAction = true;
        if (!(!((fromStyleLine) getMPresenter()).onCustomAction())) {
            int i8 = onSkipToNext;
            int i9 = i8 & 21;
            int i10 = (i9 - (~(-(-((i8 ^ 21) | i9))))) - 1;
            setSessionImpl = i10 % 128;
            int i11 = i10 % 2;
            ((parseAlignment.IconCompatParcelizer) getMPresenter()).AudioAttributesCompatParcelizer(false);
            int i12 = onSkipToNext;
            int i13 = i12 ^ 115;
            int i14 = ((((i12 & 115) | i13) << 1) - (~(-i13))) - 1;
            setSessionImpl = i14 % 128;
            int i15 = i14 % 2;
        }
        this.write = read.read;
        setRequestedOrientation(6);
        int i16 = setSessionImpl;
        int i17 = (i16 & (-14)) | ((~i16) & 13);
        int i18 = -(-((i16 & 13) << 1));
        int i19 = (i17 & i18) + (i18 | i17);
        onSkipToNext = i19 % 128;
        int i20 = i19 % 2;
        ActionBarLayoutParams();
        if (i20 != 0) {
            throw null;
        }
        int i21 = setSessionImpl;
        int i22 = (i21 ^ 97) + ((i21 & 97) << 1);
        onSkipToNext = i22 % 128;
        int i23 = i22 % 2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(Object[] objArr) throws NoSuchMethodException {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (((i2 ^ 69) | (i2 & 69)) << 1) - (((~i2) & 69) | (i2 & (-70)));
        setSessionImpl = i3 % 128;
        if (i3 % 2 == 0) {
            lessonVideoActivity.onCustomAction = true;
        } else {
            lessonVideoActivity.onCustomAction = true;
        }
        fromStyleLine fromstyleline = (fromStyleLine) lessonVideoActivity.getMPresenter();
        int i4 = onSkipToNext;
        int i5 = (((i4 | 2) << 1) - (i4 ^ 2)) - 1;
        setSessionImpl = i5 % 128;
        if (i5 % 2 == 0) {
            fromstyleline.read((fromStyleLine.IconCompatParcelizer) null);
            lessonVideoActivity.onSetCaptioningEnabled();
            throw null;
        }
        fromstyleline.read((fromStyleLine.IconCompatParcelizer) null);
        if (lessonVideoActivity.onSetCaptioningEnabled()) {
            write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1948436476, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1948436422);
            int i6 = onSkipToNext + 7;
            setSessionImpl = i6 % 128;
            int i7 = i6 % 2;
            return null;
        }
        write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1255269170 + (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)), 1675413353, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) + 1249765193, OnFailureListener.AudioAttributesCompatParcelizer(), -1675413243);
        int i8 = setSessionImpl;
        int i9 = i8 & 51;
        int i10 = (((i8 ^ 51) | i9) << 1) - ((i8 | 51) & (~i9));
        onSkipToNext = i10 % 128;
        if (i10 % 2 != 0) {
            int i11 = 25 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 103;
        int i4 = (i2 ^ 103) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        lessonVideoActivity.write = read.IconCompatParcelizer;
        lessonVideoActivity.setRequestedOrientation(-1);
        int iAudioAttributesCompatParcelizer = OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        int i7 = ~iAudioAttributesCompatParcelizer;
        int i8 = ~(((-580422785) & i7) | ((-580422785) ^ i7));
        int i9 = ((-1292059142) & i7) | (1292059141 & iAudioAttributesCompatParcelizer);
        int i10 = (-1292059142) & iAudioAttributesCompatParcelizer;
        int i11 = ~((i10 & i9) | (i9 ^ i10));
        int i12 = i8 ^ i11;
        int i13 = i8 & i11;
        int i14 = ((i13 & i12) | (i12 ^ i13)) * (-272);
        int i15 = ((~i14) & 1946802138) | ((-1946802139) & i14);
        int i16 = (i14 & 1946802138) << 1;
        int i17 = (i15 & i16) + (i16 | i15);
        int i18 = (-580697593) & iAudioAttributesCompatParcelizer;
        int i19 = (~i18) & ((-580697593) | iAudioAttributesCompatParcelizer);
        int i20 = (i18 & i19) | (i19 ^ i18);
        int i21 = (i20 | (~i20)) & (~i20);
        int i22 = 274808 ^ i21;
        int i23 = i21 & 274808;
        int i24 = -(-(((i23 & i22) | (i22 ^ i23)) * (-272)));
        int i25 = ((i17 & i24) - (~(i24 | i17))) - 1;
        int i26 = (i7 & 580697592) | ((-580697593) & iAudioAttributesCompatParcelizer);
        int i27 = iAudioAttributesCompatParcelizer & 580697592;
        int i28 = (i27 & i26) | (i26 ^ i27);
        int i29 = (i28 | (~i28)) & (~i28);
        int i30 = (-1292333950) ^ i29;
        int i31 = i29 & (-1292333950);
        int i32 = (i25 - (~(-(~(((i31 & i30) | (i30 ^ i31)) * 272))))) - 2;
        int iIdentityHashCode = System.identityHashCode(lessonVideoActivity);
        int i33 = ~iIdentityHashCode;
        int i34 = ~((i33 & (-229451)) | ((-229451) ^ i33));
        int i35 = (i34 & 1129841153) | ((-1129841154) & i34) | ((~i34) & 1129841153);
        int i36 = (-1601969062) | iIdentityHashCode;
        int i37 = (i36 | (~i36)) & (~i36);
        int i38 = ((~i37) & i35) | ((~i35) & i37);
        int i39 = i35 & i37;
        int i40 = -(-(((i39 & i38) | (i38 ^ i39)) * (-68)));
        int i41 = ((-1809335912) & i40) + (i40 | (-1809335912));
        int i42 = ~iIdentityHashCode;
        int i43 = ~iIdentityHashCode;
        int i44 = (iIdentityHashCode | i43) & i42;
        int i45 = (-472357359) & i44;
        int i46 = (i44 | (-472357359)) & (~i45);
        int i47 = (i46 & i45) | (i46 ^ i45);
        int i48 = i47 & (-1601969062);
        int i49 = -(-((~(((i47 | (-1601969062)) & (~i48)) | i48)) * (-68)));
        int i50 = ((((~i49) & i41) | ((~i41) & i49)) - (~(-(-((i49 & i41) << 1))))) - 1;
        int i51 = ((~i43) & 1601969061) | ((-1601969062) & i43);
        int i52 = 1601969061 & i43;
        int i53 = (i51 & i52) | (i51 ^ i52);
        int i54 = (i53 | (~i53)) & (~i53);
        int i55 = ((~i54) & (-472357359)) | (472357358 & i54);
        int i56 = i54 & (-472357359);
        int i57 = -(-(((i56 & i55) | (i55 ^ i56)) * 68));
        int i58 = i50 & i57;
        int i59 = i58 + ((i57 ^ i50) | i58);
        Object obj = null;
        lessonVideoActivity.ActionBarLayoutParams();
        if (i32 <= i59) {
            obj.hashCode();
            throw null;
        }
        int i60 = onSkipToNext;
        int i61 = i60 & 57;
        int i62 = -(-(i60 | 57));
        int i63 = (i61 & i62) + (i62 | i61);
        setSessionImpl = i63 % 128;
        if (i63 % 2 != 0) {
            return null;
        }
        throw null;
    }

    @Override // o.parseAlignment.write
    public final void onPlayFromMediaId() {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = ((i2 & (-34)) | ((~i2) & 33)) + ((i2 & 33) << 1);
        onSkipToNext = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            MediaDescriptionCompat();
            write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -2051632354, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 2051632355);
            int i4 = onSkipToNext;
            int i5 = ((i4 | 43) << 1) - (i4 ^ 43);
            setSessionImpl = i5 % 128;
            if (i5 % 2 != 0) {
                return;
            }
            obj.hashCode();
            throw null;
        }
        MediaDescriptionCompat();
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -2051632354, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 2051632355);
        throw null;
    }

    private static /* synthetic */ Object addOnContextAvailableListener(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (i2 ^ 79) + ((i2 & 79) << 1);
        onSkipToNext = i3 % 128;
        int i4 = i3 % 2;
        updateNavigation updatenavigation = updateNavigation.INSTANCE;
        boolean zRemoteActionCompatParcelizer = updateNavigation.RemoteActionCompatParcelizer(lessonVideoActivity);
        int i5 = onSkipToNext;
        int i6 = ((i5 ^ 64) + ((i5 & 64) << 1)) - 1;
        setSessionImpl = i6 % 128;
        int i7 = i6 % 2;
        return Boolean.valueOf(zRemoteActionCompatParcelizer);
    }

    private static /* synthetic */ Object onPlayFromSearch(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int iIdentityHashCode = System.identityHashCode(lessonVideoActivity);
        int i2 = ~iIdentityHashCode;
        int i3 = 1695093532 & i2;
        int i4 = ~(i3 | ((~i3) & (1695093532 | i2)));
        int i5 = (1223877222 ^ iIdentityHashCode) | (1223877222 & iIdentityHashCode);
        int i6 = (i5 | (~i5)) & (~i5);
        int i7 = (i4 & i6) | (i4 ^ i6);
        int i8 = i2 & (-1223877223);
        int i9 = (~i8) & (i2 | (-1223877223));
        int i10 = ~((i8 & i9) | (i9 ^ i8));
        int i11 = i7 & i10;
        int i12 = (i7 | i10) & (~i11);
        int i13 = -(-(((i12 & i11) | (i12 ^ i11)) * 959));
        int i14 = 350274552 & i13;
        int i15 = -(-(i13 | 350274552));
        int i16 = (i14 & i15) + (i15 | i14);
        int i17 = i16 & 1073246980;
        int i18 = ((1073246980 | i16) & (~i17)) + (i17 << 1);
        int i19 = (i2 & 1223877222) | (1223877222 ^ i2);
        int i20 = (i19 | (~i19)) & (~i19);
        int i21 = ~((1695093532 & iIdentityHashCode) | (1695093532 ^ iIdentityHashCode));
        int i22 = (i20 & i21) | ((~i21) & i20) | ((~i20) & i21);
        int i23 = (-1223877223) ^ iIdentityHashCode;
        int i24 = iIdentityHashCode & (-1223877223);
        int i25 = ~((i24 & i23) | (i23 ^ i24));
        int i26 = i22 & i25;
        int i27 = (i25 | i22) & (~i26);
        int i28 = -(~(-(-(((i27 & i26) | (i27 ^ i26)) * 959))));
        int i29 = (((i18 | i28) << 1) - (i28 ^ i18)) - 1;
        int iAudioAttributesCompatParcelizer = OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        int i30 = ~((468337087 & iAudioAttributesCompatParcelizer) | (468337087 ^ iAudioAttributesCompatParcelizer));
        int i31 = ((~i30) & 1430192761) | ((-1430192762) & i30);
        int i32 = i30 & 1430192761;
        int i33 = -(-(((i32 & i31) | (i31 ^ i32)) * (-948)));
        int i34 = (-592417650) & i33;
        int i35 = -(-(i33 | (-592417650)));
        int i36 = ((i34 | i35) << 1) - (i35 ^ i34);
        int i37 = ~iAudioAttributesCompatParcelizer;
        int i38 = ((~i37) & 1610564607) | ((-1610564608) & i37);
        int i39 = i37 & 1610564607;
        int i40 = (i36 - (~(-(-((~((i39 & i38) | (i38 ^ i39))) * (-948)))))) - 1;
        int i41 = (i40 ^ (-499931316)) + (((-499931316) & i40) << 1);
        Object obj = null;
        ConstraintLayout constraintLayout = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().AudioAttributesImplApi21Parcelizer;
        if (i29 <= i41) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout, "");
        int i42 = onSkipToNext;
        int i43 = i42 ^ 35;
        int i44 = -(-((i42 & 35) << 1));
        int i45 = ((i43 | i44) << 1) - (i44 ^ i43);
        setSessionImpl = i45 % 128;
        int i46 = i45 % 2;
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(constraintLayout);
        int i47 = onSkipToNext;
        int i48 = ((i47 ^ 90) + ((i47 & 90) << 1)) - 1;
        setSessionImpl = i48 % 128;
        if (i48 % 2 == 0) {
            int i49 = 64 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object _init_lambda4(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        String str = (String) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int i = 2 % 2;
        toMagicModuleMetaRepoModel.write(str, "");
        maybeUpdateIsInCaptionService.Companion writeVar = maybeUpdateIsInCaptionService.INSTANCE;
        Intent intentWrite = maybeUpdateIsInCaptionService.Companion.write(str, iIntValue);
        int i2 = setSessionImpl;
        int i3 = (-2) - (((i2 ^ 60) + ((i2 & 60) << 1)) ^ (-1));
        onSkipToNext = i3 % 128;
        int i4 = i3 % 2;
        lessonVideoActivity.AudioAttributesCompatParcelizer(intentWrite);
        if (i4 != 0) {
            throw null;
        }
        int i5 = setSessionImpl;
        int i6 = i5 & 25;
        int i7 = (i5 | 25) & (~i6);
        int i8 = -(-(i6 << 1));
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        onSkipToNext = i9 % 128;
        if (i9 % 2 != 0) {
            int i10 = 86 / 0;
        }
        return null;
    }

    @Override // o.parseAlignment.write
    public final void IconCompatParcelizer(int p0) {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (((i2 | 110) << 1) - (i2 ^ 110)) - 1;
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        HlsTrackMetadataEntry1 hlsTrackMetadataEntry1 = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver;
        if (i4 != 0) {
            hlsTrackMetadataEntry1.RemoteActionCompatParcelizer.setProgress(p0);
        } else {
            hlsTrackMetadataEntry1.RemoteActionCompatParcelizer.setProgress(p0);
            int i5 = 34 / 0;
        }
    }

    @Override // o.parseAlignment.write
    public final void addOnUserLeaveHintListener() {
        ProgressBar progressBar;
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (-2) - (((i2 & 4) + (i2 | 4)) ^ (-1));
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        ImageView imageView = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        int i5 = setSessionImpl;
        int i6 = i5 & 51;
        int i7 = i6 + ((i5 ^ 51) | i6);
        onSkipToNext = i7 % 128;
        if (i7 % 2 != 0) {
            PlayerControlViewExternalSyntheticLambda1.write(imageView);
            progressBar = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer;
            int i8 = 33 / 0;
        } else {
            PlayerControlViewExternalSyntheticLambda1.write(imageView);
            progressBar = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer;
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        PlayerControlViewExternalSyntheticLambda1.write(progressBar);
        int i9 = setSessionImpl + 37;
        onSkipToNext = i9 % 128;
        int i10 = i9 % 2;
    }

    @Override // o.parseAlignment.write
    public final void PlaybackStateCompat() {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 63;
        int i4 = (i2 | 63) & (~i3);
        int i5 = -(-(i3 << 1));
        int i6 = (i4 ^ i5) + ((i4 & i5) << 1);
        onSkipToNext = i6 % 128;
        Object obj = null;
        if (i6 % 2 != 0) {
            ImageView imageView = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.write;
            throw null;
        }
        ImageView imageView2 = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView2, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageView2);
        int i7 = onSkipToNext;
        int i8 = (i7 & (-86)) | ((~i7) & 85);
        int i9 = (i7 & 85) << 1;
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        setSessionImpl = i10 % 128;
        int i11 = i10 % 2;
        ProgressBar progressBar = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.RemoteActionCompatParcelizer;
        int i12 = onSkipToNext;
        int i13 = i12 & 91;
        int i14 = (i12 | 91) & (~i13);
        int i15 = i13 << 1;
        int i16 = (i14 & i15) + (i14 | i15);
        setSessionImpl = i16 % 128;
        if (i16 % 2 == 0) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
            PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(progressBar);
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(progressBar);
        int i17 = onSkipToNext;
        int i18 = i17 & 37;
        int i19 = -(-((i17 ^ 37) | i18));
        int i20 = ((i18 | i19) << 1) - (i19 ^ i18);
        setSessionImpl = i20 % 128;
        if (i20 % 2 == 0) {
            throw null;
        }
    }

    @Override // o.parseAlignment.write
    public final void getOnBackPressedDispatcherannotations() {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (i2 & 75) + (i2 | 75);
        onSkipToNext = i3 % 128;
        if (i3 % 2 == 0) {
            ImageButton imageButton = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
            int i4 = setSessionImpl;
            int i5 = (i4 & 7) + (i4 | 7);
            onSkipToNext = i5 % 128;
            int i6 = i5 % 2;
            imageButton.setImageResource(R.drawable.ic_video_download_start);
            ImageButton imageButton2 = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
            int i7 = onSkipToNext;
            int i8 = (((i7 & (-2)) | ((~i7) & 1)) - (~((i7 & 1) << 1))) - 1;
            setSessionImpl = i8 % 128;
            int i9 = i8 % 2;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageButton2, "");
            ImageButton imageButton3 = imageButton2;
            if (i9 == 0) {
                throw null;
            }
            PlayerControlViewExternalSyntheticLambda1.write(imageButton3);
            int i10 = setSessionImpl;
            int i11 = (((i10 & (-74)) | ((~i10) & 73)) - (~(-(-((i10 & 73) << 1))))) - 1;
            onSkipToNext = i11 % 128;
            if (i11 % 2 != 0) {
                int i12 = 72 / 0;
                return;
            }
            return;
        }
        ImageButton imageButton4 = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
        throw null;
    }

    @Override // o.parseAlignment.write
    public final void addOnContextAvailableListener() {
        ImageButton imageButton;
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 121;
        int i4 = -(-((i2 ^ 121) | i3));
        int i5 = (i3 & i4) + (i4 | i3);
        setSessionImpl = i5 % 128;
        if (i5 % 2 != 0) {
            removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer.setImageResource(R.drawable.ic_download_pending_large);
            ImageButton imageButton2 = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
            int i6 = setSessionImpl;
            int i7 = ((i6 | 43) << 1) - (i6 ^ 43);
            onSkipToNext = i7 % 128;
            if (i7 % 2 != 0) {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageButton2, "");
                imageButton = imageButton2;
                int i8 = 58 / 0;
            } else {
                toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageButton2, "");
                imageButton = imageButton2;
            }
            PlayerControlViewExternalSyntheticLambda1.write(imageButton);
            int i9 = onSkipToNext + 23;
            setSessionImpl = i9 % 128;
            int i10 = i9 % 2;
            return;
        }
        ImageButton imageButton3 = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.parseAlignment.write
    public final void menuHostHelperlambda0() {
        ImageButton imageButton;
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = ((i2 | 13) << 1) - (i2 ^ 13);
        onSkipToNext = i3 % 128;
        if (i3 % 2 != 0) {
            imageButton = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
            int i4 = 89 / 0;
        } else {
            imageButton = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
        }
        imageButton.setImageResource(R.drawable.ic_video_download_completed);
        ImageButton imageButton2 = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
        int i5 = setSessionImpl;
        int i6 = ((i5 ^ 83) | (i5 & 83)) << 1;
        int i7 = -(((~i5) & 83) | (i5 & (-84)));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        onSkipToNext = i8 % 128;
        int i9 = i8 % 2;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageButton2, "");
        PlayerControlViewExternalSyntheticLambda1.write(imageButton2);
        int i10 = onSkipToNext;
        int i11 = (i10 & 47) + (i10 | 47);
        setSessionImpl = i11 % 128;
        int i12 = i11 % 2;
    }

    private static /* synthetic */ Object onSetPlaybackSpeed(Object[] objArr) {
        ImageButton imageButton;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl + 101;
        onSkipToNext = i2 % 128;
        if (i2 % 2 != 0) {
            imageButton = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
            int i3 = 8 / 0;
        } else {
            imageButton = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer;
        }
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageButton, "");
        PlayerControlViewExternalSyntheticLambda1.AudioAttributesCompatParcelizer(imageButton);
        parseRangedUrl parserangedurlRemoveOnPictureInPictureModeChangedListener = lessonVideoActivity.removeOnPictureInPictureModeChangedListener();
        int i4 = onSkipToNext + 44;
        int i5 = (i4 ^ (-1)) + (i4 << 1);
        setSessionImpl = i5 % 128;
        Object obj = null;
        if (i5 % 2 == 0) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parserangedurlRemoveOnPictureInPictureModeChangedListener.MediaBrowserCompatCustomActionResultReceiver.write, "");
            throw null;
        }
        ImageView imageView = parserangedurlRemoveOnPictureInPictureModeChangedListener.MediaBrowserCompatCustomActionResultReceiver.write;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(imageView, "");
        int i6 = setSessionImpl;
        int i7 = ((i6 & 12) + (i6 | 12)) - 1;
        onSkipToNext = i7 % 128;
        int i8 = i7 % 2;
        PlayerControlViewExternalSyntheticLambda1.write(imageView);
        HlsTrackMetadataEntry1 hlsTrackMetadataEntry1 = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver;
        int i9 = setSessionImpl;
        int i10 = i9 & 59;
        int i11 = (i9 ^ 59) | i10;
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        onSkipToNext = i12 % 128;
        if (i12 % 2 != 0) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(hlsTrackMetadataEntry1.RemoteActionCompatParcelizer, "");
            throw null;
        }
        ProgressBar progressBar = hlsTrackMetadataEntry1.RemoteActionCompatParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(progressBar, "");
        PlayerControlViewExternalSyntheticLambda1.write(progressBar);
        int i13 = onSkipToNext;
        int i14 = i13 & 29;
        int i15 = ((i13 | 29) & (~i14)) + (i14 << 1);
        setSessionImpl = i15 % 128;
        if (i15 % 2 != 0) {
            return null;
        }
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object write(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        int i = 2 % 2;
        int i2 = setSessionImpl + 9;
        onSkipToNext = i2 % 128;
        int i3 = i2 % 2;
        fromStyleLine fromstyleline = (fromStyleLine) lessonVideoActivity.getMPresenter();
        if (i3 != 0) {
            fromstyleline.write(iIntValue, zBooleanValue);
            throw null;
        }
        fromstyleline.write(iIntValue, zBooleanValue);
        int i4 = setSessionImpl;
        int i5 = i4 & 63;
        int i6 = (((i4 | 63) & (~i5)) - (~(-(-(i5 << 1))))) - 1;
        onSkipToNext = i6 % 128;
        if (i6 % 2 == 0) {
            return null;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.marrow.ui.dialogs.LessonCompletedDialog.read
    public final void write(String p0, float p1) {
        fromStyleLine fromstyleline;
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (i2 ^ 17) + ((i2 & 17) << 1);
        setSessionImpl = i3 % 128;
        if (i3 % 2 == 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            fromstyleline = (fromStyleLine) getMPresenter();
            int i4 = 17 / 0;
        } else {
            toMagicModuleMetaRepoModel.write(p0, "");
            fromstyleline = (fromStyleLine) getMPresenter();
        }
        int i5 = onSkipToNext;
        int i6 = (i5 & 52) + (i5 | 52);
        int i7 = (i6 ^ (-1)) + (i6 << 1);
        setSessionImpl = i7 % 128;
        int i8 = i7 % 2;
        fromstyleline.RemoteActionCompatParcelizer(p0, p1);
        int i9 = setSessionImpl;
        int i10 = i9 ^ 11;
        int i11 = (i9 & 11) << 1;
        int i12 = ((i10 | i11) << 1) - (i11 ^ i10);
        onSkipToNext = i12 % 128;
        if (i12 % 2 != 0) {
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.marrow.ui.dialogs.LessonCompletedDialog.read
    public final void AudioAttributesCompatParcelizer(LessonTabItem<?> p0) {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (((i2 ^ 63) | (i2 & 63)) << 1) - (((~i2) & 63) | (i2 & (-64)));
        onSkipToNext = i3 % 128;
        if (i3 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(p0, "");
        Object[] objArr = {(fromStyleLine) getMPresenter(), p0};
        int iWrite = maybeInvalidateForRendererCapabilitiesChange.write();
        int iWrite2 = maybeInvalidateForRendererCapabilitiesChange.write();
        fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), iWrite, -904311476, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), iWrite2, 904311517);
        int i4 = setSessionImpl;
        int i5 = i4 & 45;
        int i6 = (i4 ^ 45) | i5;
        int i7 = (i5 & i6) + (i6 | i5);
        onSkipToNext = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 23 / 0;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object MediaBrowserCompatSearchResultReceiver(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 5;
        int i4 = (i2 ^ 5) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        isSeekPending isseekpendingIconCompatParcelizer = RtspHeadersBuilder.IconCompatParcelizer();
        getRetryPredicate getretrypredicate = getRetryPredicate.INSTANCE;
        Pair<String, Map<String, Object>> pair = getRetryPredicate.read();
        int i7 = setSessionImpl;
        int i8 = ((i7 ^ 115) | (i7 & 115)) << 1;
        int i9 = -(((~i7) & 115) | (i7 & (-116)));
        int i10 = (i8 & i9) + (i9 | i8);
        onSkipToNext = i10 % 128;
        int i11 = i10 % 2;
        isseekpendingIconCompatParcelizer.write(pair, IntermediateLoginResponseBody.RemoteActionCompatParcelizer(updateLoadingFinished.IconCompatParcelizer));
        int i12 = setSessionImpl;
        int i13 = i12 & 33;
        int i14 = -(-(i12 | 33));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        onSkipToNext = i15 % 128;
        int i16 = i15 % 2;
        fromStyleLine fromstyleline = (fromStyleLine) lessonVideoActivity.getMPresenter();
        if (i16 != 0) {
            fromstyleline.onPlayFromSearch();
            throw null;
        }
        fromstyleline.onPlayFromSearch();
        int i17 = onSkipToNext;
        int i18 = i17 & 9;
        int i19 = (((i17 | 9) & (~i18)) - (~(i18 << 1))) - 1;
        setSessionImpl = i19 % 128;
        int i20 = i19 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.marrow.ui.dialogs.LessonCompletedDialog.read
    public final void addObserverForBackInvoker() {
        int i = 2 % 2;
        int i2 = onSkipToNext + 101;
        setSessionImpl = i2 % 128;
        int i3 = i2 % 2;
        ((fromStyleLine) getMPresenter()).write("rating_dialog_dismiss");
        int i4 = onSkipToNext;
        int i5 = (-2) - ((((i4 | 94) << 1) - (i4 ^ 94)) ^ (-1));
        setSessionImpl = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int iIntValue = ((Number) objArr[1]).intValue();
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (i2 ^ 43) + ((i2 & 43) << 1);
        onSkipToNext = i3 % 128;
        int i4 = i3 % 2;
        lessonVideoActivity.getTimelineAdapter().IconCompatParcelizer(iIntValue);
        if (i4 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object getViewModelStore(Object[] objArr) {
        final LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        new setResultCallback();
        setResultCallback.AudioAttributesCompatParcelizer(lessonVideoActivity, new getCreatedOnDateMs() { // from class: o.createCue
            @Override // kotlin.getCreatedOnDateMs
            public final Object invoke() {
                return LessonVideoActivity.IconCompatParcelizer(this.write);
            }
        }, new getAnswerMap() { // from class: o.parseDialogueLine
            @Override // kotlin.getAnswerMap
            public final Object invoke(Object obj) {
                return LessonVideoActivity.read(this.read, (Exception) obj);
            }
        });
        int i2 = setSessionImpl;
        int i3 = (i2 & 115) + (i2 | 115);
        onSkipToNext = i3 % 128;
        int i4 = i3 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final getShowPopup onCustomAction(LessonVideoActivity lessonVideoActivity) {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 ^ 105;
        int i4 = ((((i2 & 105) | i3) << 1) - (~(-i3))) - 1;
        onSkipToNext = i4 % 128;
        int i5 = i4 % 2;
        ((fromStyleLine) lessonVideoActivity.getMPresenter()).onSetCaptioningEnabled();
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i6 = setSessionImpl;
        int i7 = i6 & 87;
        int i8 = i7 + ((i6 ^ 87) | i7);
        onSkipToNext = i8 % 128;
        if (i8 % 2 == 0) {
            return getshowpopup;
        }
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static final getShowPopup RemoteActionCompatParcelizer(LessonVideoActivity lessonVideoActivity, Exception exc) {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 | 33;
        int i4 = (i3 << 1) - ((~(i2 & 33)) & i3);
        setSessionImpl = i4 % 128;
        int i5 = i4 % 2;
        ((fromStyleLine) lessonVideoActivity.getMPresenter()).read(exc);
        getShowPopup getshowpopup = getShowPopup.INSTANCE;
        int i6 = onSkipToNext;
        int i7 = i6 & 25;
        int i8 = ((i6 | 25) & (~i7)) + (i7 << 1);
        setSessionImpl = i8 % 128;
        int i9 = i8 % 2;
        return getshowpopup;
    }

    @Override // o.parseAlignment.write
    public final void AudioAttributesCompatParcelizer(RevisionSubjectUIModel p0) {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = ((i2 ^ 1) | (i2 & 1)) << 1;
        int i4 = -(((~i2) & 1) | (i2 & (-2)));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        RemoteActionCompatParcelizer();
        getCause.Companion writeVar = getCause.INSTANCE;
        int i7 = setSessionImpl;
        int i8 = i7 & 95;
        int i9 = -(-((i7 ^ 95) | i8));
        int i10 = ((i8 | i9) << 1) - (i9 ^ i8);
        onSkipToNext = i10 % 128;
        int i11 = i10 % 2;
        getCause getcauseRemoteActionCompatParcelizer = getCause.Companion.RemoteActionCompatParcelizer(p0);
        getcauseRemoteActionCompatParcelizer.show(getSupportFragmentManager(), "revision_subject_video_completion_dialog");
        int i12 = onSkipToNext;
        int i13 = ((i12 & 4) + (i12 | 4)) - 1;
        setSessionImpl = i13 % 128;
        int i14 = i13 % 2;
        AudioAttributesCompatParcelizer(getcauseRemoteActionCompatParcelizer);
        if (i14 == 0) {
            int i15 = 96 / 0;
        }
    }

    @Override // o.parseAlignment.write
    public final void RemoteActionCompatParcelizer(String p0, int p1, int p2, int p3, int p4) {
        int i = 2 % 2;
        int i2 = setSessionImpl + 65;
        onSkipToNext = i2 % 128;
        int i3 = i2 % 2;
        toMagicModuleMetaRepoModel.write(p0, "");
        this.MediaBrowserCompatCustomActionResultReceiver = true;
        int i4 = setSessionImpl;
        int i5 = i4 & 39;
        int i6 = -(-((i4 ^ 39) | i5));
        int i7 = ((i5 | i6) << 1) - (i6 ^ i5);
        onSkipToNext = i7 % 128;
        int i8 = i7 % 2;
        getTokenExpiration.Companion readVar = getTokenExpiration.INSTANCE;
        r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk r8lambdabxxs3zoecdhhzumrqz2nwycntk = new r8lambdabxXs3ZOECDhhZumRQZ2nWYcNtk(null, r8lambdaeUjbdMLtxuENSTQFzrQsjYjNrI.IconCompatParcelizer, p0, p2, p1, p3, p4);
        int i9 = setSessionImpl;
        int i10 = (i9 ^ 123) + ((i9 & 123) << 1);
        onSkipToNext = i10 % 128;
        int i11 = i10 % 2;
        startActivity(getTokenExpiration.Companion.IconCompatParcelizer(this, r8lambdabxxs3zoecdhhzumrqz2nwycntk));
        int i12 = setSessionImpl;
        int i13 = ((i12 | 7) << 1) - (i12 ^ 7);
        onSkipToNext = i13 % 128;
        if (i13 % 2 == 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private static /* synthetic */ Object AudioAttributesImplBaseParcelizer(Object[] objArr) {
        int i;
        float f;
        Object objWrite;
        boolean z;
        String str;
        FrameLayout frameLayout;
        ViewGroup.LayoutParams layoutParams;
        int i2;
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        boolean zBooleanValue = ((Boolean) objArr[1]).booleanValue();
        int i3 = 2 % 2;
        int i4 = (-2) - ((setSessionImpl + 94) ^ (-1));
        onSkipToNext = i4 % 128;
        int i5 = i4 % 2;
        maybeSkipWhitespace maybeskipwhitespaceHandleOnBackCancelled = lessonVideoActivity.handleOnBackCancelled();
        int iIntValue = ((Integer) write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1074421852, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1074421757)).intValue();
        int iRemoteActionCompatParcelizer = maybeskipwhitespaceHandleOnBackCancelled.RemoteActionCompatParcelizer();
        int i6 = setSessionImpl;
        int i7 = (-2) - ((((i6 | 24) << 1) - (i6 ^ 24)) ^ (-1));
        onSkipToNext = i7 % 128;
        if (i7 % 2 != 0) {
            i = (((iRemoteActionCompatParcelizer << 1) - iRemoteActionCompatParcelizer) - (~(-iIntValue))) - 1;
            f = iIntValue;
            Object[] objArr2 = {(fromStyleLine) lessonVideoActivity.getMPresenter()};
            objWrite = fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -991587359, objArr2, maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 991587363);
        } else {
            int i8 = iRemoteActionCompatParcelizer << 1;
            int i9 = -(-iIntValue);
            i = ((((~i9) & i8) | ((~i8) & i9)) - (~((i8 & i9) << 1))) - 1;
            f = iIntValue;
            Object[] objArr3 = {(fromStyleLine) lessonVideoActivity.getMPresenter()};
            objWrite = fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -991587359, objArr3, maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 991587363);
        }
        int iFloatValue = (int) (f * ((Float) objWrite).floatValue());
        int i10 = -(-maybeskipwhitespaceHandleOnBackCancelled.AudioAttributesImplApi21Parcelizer());
        int i11 = ((((~i10) & iFloatValue) | ((~iFloatValue) & i10)) - (~((iFloatValue & i10) << 1))) - 1;
        int iIconCompatParcelizer = maybeskipwhitespaceHandleOnBackCancelled.IconCompatParcelizer();
        int i12 = setSessionImpl;
        int i13 = i12 & 103;
        int i14 = (i12 ^ 103) | i13;
        int i15 = ((i13 | i14) << 1) - (i14 ^ i13);
        onSkipToNext = i15 % 128;
        if (i15 % 2 != 0) {
            maybeskipwhitespaceHandleOnBackCancelled.write();
            maybeskipwhitespaceHandleOnBackCancelled.AudioAttributesImplBaseParcelizer();
            throw null;
        }
        int iWrite = maybeskipwhitespaceHandleOnBackCancelled.write();
        int iAudioAttributesImplBaseParcelizer = maybeskipwhitespaceHandleOnBackCancelled.AudioAttributesImplBaseParcelizer();
        int iAudioAttributesCompatParcelizer = maybeskipwhitespaceHandleOnBackCancelled.AudioAttributesCompatParcelizer();
        int i16 = maybeskipwhitespaceHandleOnBackCancelled.read();
        parseRangedUrl parserangedurlRemoveOnPictureInPictureModeChangedListener = lessonVideoActivity.removeOnPictureInPictureModeChangedListener();
        int i17 = (-2) - ((onSkipToNext + 60) ^ (-1));
        setSessionImpl = i17 % 128;
        if (i17 % 2 == 0) {
            Object obj = null;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parserangedurlRemoveOnPictureInPictureModeChangedListener.MediaBrowserCompatSearchResultReceiver, "");
            obj.hashCode();
            throw null;
        }
        FrameLayout frameLayout2 = parserangedurlRemoveOnPictureInPictureModeChangedListener.MediaBrowserCompatSearchResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout2, "");
        FrameLayout frameLayout3 = frameLayout2;
        int i18 = onSkipToNext;
        int i19 = (i18 & 11) + (i18 | 11);
        setSessionImpl = i19 % 128;
        if (i19 % 2 == 0) {
            frameLayout3.getVisibility();
            throw null;
        }
        if (frameLayout3.getVisibility() == 0) {
            int i20 = setSessionImpl;
            int i21 = i20 & 11;
            int i22 = ((((i20 ^ 11) | i21) << 1) - (~(-((i20 | 11) & (~i21))))) - 1;
            onSkipToNext = i22 % 128;
            int i23 = i22 % 2;
            z = true;
        } else {
            System.identityHashCode(lessonVideoActivity);
            OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
            z = false;
        }
        ReferenceTypeDeserializer referenceTypeDeserializer = new ReferenceTypeDeserializer();
        referenceTypeDeserializer.RemoteActionCompatParcelizer(lessonVideoActivity.removeOnPictureInPictureModeChangedListener().AudioAttributesCompatParcelizer);
        referenceTypeDeserializer.write(R.id.video_fragment_container);
        int i24 = i16 & i;
        int i25 = -(-((i16 ^ i) | i24));
        int i26 = -((i24 ^ i25) + ((i25 & i24) << 1));
        int iAudioAttributesCompatParcelizer2 = OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        System.identityHashCode(lessonVideoActivity);
        OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        int i27 = 217 * i26;
        int i28 = iAudioAttributesCompatParcelizer * (-215);
        int i29 = (i27 & i28) + (i27 | i28);
        boolean z2 = z;
        int i30 = -(-((~((i26 ^ iAudioAttributesCompatParcelizer2) | (i26 & iAudioAttributesCompatParcelizer2))) * 216));
        int i31 = ((i29 | i30) << 1) - (((~i30) & i29) | (i30 & (~i29)));
        int i32 = ~iAudioAttributesCompatParcelizer;
        int i33 = ((~i32) & i26) | ((~i26) & i32);
        int i34 = i32 & i26;
        int i35 = (i34 & i33) | (i33 ^ i34);
        int i36 = ~iAudioAttributesCompatParcelizer2;
        int i37 = i35 ^ i36;
        int i38 = i35 & i36;
        int i39 = -(-(((i38 & i37) | (i37 ^ i38)) * (-216)));
        int i40 = i31 ^ i39;
        int i41 = (i31 & i39) << 1;
        int i42 = ((i40 | i41) << 1) - (i41 ^ i40);
        int i43 = i36 & i26;
        int i44 = (i36 | i26) & (~i43);
        int i45 = (i43 & i44) | (i44 ^ i43);
        OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        int i46 = (i45 | (i45 ^ (-1))) & (~i45);
        int i47 = -(~(-(-(((i46 & iAudioAttributesCompatParcelizer) | (iAudioAttributesCompatParcelizer ^ i46)) * 216))));
        referenceTypeDeserializer.write(R.id.gl_left, (((i42 | i47) << 1) - (i42 ^ i47)) - 1);
        referenceTypeDeserializer.MediaBrowserCompatItemReceiver(maybeskipwhitespaceHandleOnBackCancelled.read());
        int i48 = -i11;
        int iAudioAttributesCompatParcelizer3 = OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        int i49 = i48 * 1773;
        int i50 = -(-(iIconCompatParcelizer * (-885)));
        int i51 = i49 & i50;
        int i52 = -(-((i49 ^ i50) | i51));
        int i53 = ((i51 | i52) << 1) - (i52 ^ i51);
        int i54 = setSessionImpl;
        int i55 = ((i54 ^ 72) + ((i54 & 72) << 1)) - 1;
        onSkipToNext = i55 % 128;
        int i56 = i55 % 2;
        int i57 = (~i48) & ((~i48) | i48);
        int i58 = ~iIconCompatParcelizer;
        int i59 = ~((i57 ^ i58) | (i57 & i58));
        int i60 = ~iIconCompatParcelizer;
        int i61 = ~((i60 ^ iAudioAttributesCompatParcelizer3) | (i60 & iAudioAttributesCompatParcelizer3));
        int i62 = i;
        int i63 = ((~i59) & i61) | ((~i61) & i59);
        int i64 = i61 & i59;
        int i65 = (i64 & i63) | (i63 ^ i64);
        int i66 = ~iAudioAttributesCompatParcelizer3;
        int i67 = i66 & i48;
        int i68 = (~i67) & (i66 | i48);
        int i69 = (i68 ^ i67) | (i67 & i68);
        int i70 = (i69 & iIconCompatParcelizer) | (i69 ^ iIconCompatParcelizer);
        int i71 = ((~i70) | i70) & (~i70);
        int i72 = ((i65 & i71) | (i65 ^ i71)) * 886;
        int i73 = (i53 ^ i72) + ((i72 & i53) << 1);
        int i74 = ~iAudioAttributesCompatParcelizer3;
        int i75 = (iAudioAttributesCompatParcelizer3 | i74) & i66;
        int i76 = ~((i75 & iIconCompatParcelizer) | (i75 & i58) | ((~i75) & iIconCompatParcelizer));
        int i77 = (i54 & 6) + (i54 | 6);
        int i78 = (i77 ^ (-1)) + (i77 << 1);
        onSkipToNext = i78 % 128;
        int i79 = i78 % 2;
        int i80 = -(-(((i76 & i48) | (i48 ^ i76)) * (-1772)));
        int i81 = (i73 ^ i80) + ((i80 & i73) << 1);
        int i82 = i74 & i48;
        int i83 = (i48 | i74) & (~i82);
        int i84 = -(-((~((i83 & i82) | (i83 ^ i82))) * 886));
        int i85 = i81 ^ i84;
        int i86 = -(-((i84 & i81) << 1));
        int i87 = (i85 ^ i86) + ((i86 & i85) << 1);
        int i88 = -iWrite;
        int iAudioAttributesCompatParcelizer4 = OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        int i89 = i88 * (-523);
        int i90 = i87 * TarConstants.VERSION_OFFSET;
        int i91 = (i89 & i90) + (i89 | i90);
        int i92 = ~i88;
        int i93 = ~i87;
        int i94 = ~((i92 & i87) | (i92 & i93) | ((~i92) & i87));
        int i95 = onSkipToNext;
        int i96 = i95 & 5;
        int i97 = (i95 ^ 5) | i96;
        int i98 = (i96 ^ i97) + ((i97 & i96) << 1);
        setSessionImpl = i98 % 128;
        int i99 = i98 % 2;
        int i100 = ~i87;
        int i101 = (i93 | i87) & i100;
        int i102 = i101 & i88;
        int i103 = (i101 ^ i88) | i102;
        int i104 = (i103 | (~i103)) & (~i103);
        int i105 = (i94 & i104) | (i94 ^ i104);
        int i106 = i101 ^ iAudioAttributesCompatParcelizer4;
        int i107 = i101 & iAudioAttributesCompatParcelizer4;
        int i108 = ~((i106 & i107) | (i106 ^ i107));
        int i109 = i105 & i108;
        int i110 = (i105 | i108) & (~i109);
        int i111 = ((i110 & i109) | (i110 ^ i109)) * 262;
        int i112 = i91 & i111;
        int i113 = ((i91 ^ i111) | i112) << 1;
        int i114 = -((i111 | i91) & (~i112));
        int i115 = (i113 & i114) + (i114 | i113);
        int i116 = (~i102) & (i101 | i88);
        int i117 = ~i88;
        int i118 = (i116 & i102) | (i116 ^ i102);
        int i119 = -(-(((i118 | (~i118)) & (~i118)) * (-786)));
        int i120 = (((i115 | i119) << 1) - (~(-((i119 & (~i115)) | ((~i119) & i115))))) - 1;
        int i121 = ~iAudioAttributesCompatParcelizer4;
        int i122 = i100 ^ i121;
        int i123 = i121 & i100;
        int i124 = ~((i123 & i122) | (i122 ^ i123));
        int i125 = ~((i117 ^ i87) | (i87 & i117));
        int i126 = ((~i125) & i124) | ((~i124) & i125);
        int i127 = i124 & i125;
        int i128 = (i127 & i126) | (i126 ^ i127);
        int i129 = (i88 & i100) | (i100 ^ i88);
        int i130 = (i129 | (~i129)) & (~i129);
        int i131 = i128 & i130;
        int i132 = (i130 | i128) & (~i131);
        int i133 = ((i132 & i131) | (i132 ^ i131)) * 262;
        int i134 = i120 & i133;
        int i135 = ((i133 | i120) & (~i134)) + (i134 << 1);
        int i136 = -(-iAudioAttributesImplBaseParcelizer);
        referenceTypeDeserializer.write(R.id.gl_top, (i135 ^ i136) + ((i135 & i136) << 1));
        write(new Object[]{referenceTypeDeserializer}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1262800418, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1262800508);
        ChangeBounds changeBounds = new ChangeBounds();
        changeBounds.write(new LinearInterpolator());
        int i137 = setSessionImpl + 41;
        onSkipToNext = i137 % 128;
        int i138 = i137 % 2;
        changeBounds.RemoteActionCompatParcelizer(200L);
        reportWithProductId.RemoteActionCompatParcelizer(lessonVideoActivity.removeOnPictureInPictureModeChangedListener().AudioAttributesCompatParcelizer, changeBounds);
        referenceTypeDeserializer.write(lessonVideoActivity.removeOnPictureInPictureModeChangedListener().AudioAttributesCompatParcelizer);
        lessonVideoActivity.Keep();
        if (zBooleanValue) {
            int i139 = onSkipToNext;
            int i140 = (i139 | 101) << 1;
            int i141 = -(((~i139) & 101) | (i139 & (-102)));
            int i142 = (i140 & i141) + (i141 | i140);
            setSessionImpl = i142 % 128;
            int i143 = i142 % 2;
            lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver.setVisibility(4);
            int i144 = setSessionImpl;
            int i145 = ((i144 | 19) << 1) - (i144 ^ 19);
            onSkipToNext = i145 % 128;
            int i146 = i145 % 2;
        }
        FrameLayout frameLayout4 = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver;
        int i147 = onSkipToNext;
        int i148 = (i147 ^ 113) + ((i147 & 113) << 1);
        setSessionImpl = i148 % 128;
        if (i148 % 2 == 0) {
            str = "";
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout4, str);
            frameLayout = frameLayout4;
            layoutParams = frameLayout.getLayoutParams();
            int i149 = 96 / 0;
        } else {
            str = "";
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout4, str);
            frameLayout = frameLayout4;
            layoutParams = frameLayout.getLayoutParams();
        }
        int i150 = setSessionImpl;
        int i151 = (i150 ^ 117) + ((i150 & 117) << 1);
        int i152 = i151 % 128;
        onSkipToNext = i152;
        int i153 = i151 % 2;
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i154 = i152 & 29;
        int i155 = i154 + ((i152 ^ 29) | i154);
        setSessionImpl = i155 % 128;
        int i156 = i155 % 2;
        layoutParams.width = i62;
        layoutParams.height = i11;
        int i157 = onSkipToNext;
        int i158 = i157 & 77;
        int i159 = (i157 | 77) & (~i158);
        int i160 = i158 << 1;
        int i161 = (i159 & i160) + (i159 | i160);
        setSessionImpl = i161 % 128;
        int i162 = i161 % 2;
        frameLayout.setLayoutParams(layoutParams);
        if (!zBooleanValue) {
            int i163 = setSessionImpl + 101;
            onSkipToNext = i163 % 128;
            int i164 = i163 % 2;
            FrameLayout frameLayout5 = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver;
            int i165 = onSkipToNext;
            int i166 = (((i165 & (-52)) | ((~i165) & 51)) - (~(-(-((i165 & 51) << 1))))) - 1;
            setSessionImpl = i166 % 128;
            int i167 = i166 % 2;
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout5, str);
            FrameLayout frameLayout6 = frameLayout5;
            if (!(!z2)) {
                int i168 = onSkipToNext;
                int i169 = i168 & 67;
                int i170 = (i168 | 67) & (~i169);
                int i171 = i169 << 1;
                int i172 = (i170 ^ i171) + ((i170 & i171) << 1);
                int i173 = i172 % 128;
                setSessionImpl = i173;
                int i174 = i172 % 2;
                int i175 = ((i173 & 54) + (i173 | 54)) - 1;
                onSkipToNext = i175 % 128;
                int i176 = i175 % 2;
                i2 = 0;
            } else {
                int i177 = onSkipToNext;
                int i178 = (((i177 ^ 19) | (i177 & 19)) << 1) - ((19 & (~i177)) | (i177 & (-20)));
                setSessionImpl = i178 % 128;
                int i179 = i178 % 2;
                i2 = 8;
            }
            frameLayout6.setVisibility(i2);
            int i180 = onSkipToNext;
            int i181 = ((i180 | 1) << 1) - (i180 ^ 1);
            setSessionImpl = i181 % 128;
            int i182 = i181 % 2;
        }
        lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver.requestLayout();
        CmcdHeadersFactory1 cmcdHeadersFactory1 = CmcdHeadersFactory1.INSTANCE;
        int i183 = onSkipToNext;
        int i184 = i183 & 65;
        int i185 = (i183 ^ 65) | i184;
        int i186 = (i184 & i185) + (i185 | i184);
        setSessionImpl = i186 % 128;
        int i187 = i186 % 2;
        if (!(!CmcdHeadersFactory1.AudioAttributesCompatParcelizer())) {
            int i188 = onSkipToNext + 93;
            setSessionImpl = i188 % 128;
            if (i188 % 2 == 0) {
                ((fromStyleLine) lessonVideoActivity.getMPresenter()).RemoteActionCompatParcelizer(maybeskipwhitespaceHandleOnBackCancelled, i11, i62);
                int i189 = 48 / 0;
            } else {
                ((fromStyleLine) lessonVideoActivity.getMPresenter()).RemoteActionCompatParcelizer(maybeskipwhitespaceHandleOnBackCancelled, i11, i62);
            }
        }
        int i190 = onSkipToNext + 85;
        setSessionImpl = i190 % 128;
        int i191 = i190 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    private final void read(float p0) {
        int i;
        int contentView;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        float f;
        int i7;
        int i8;
        int i9;
        int iWrite;
        float fFloatValue;
        int i10 = 2 % 2;
        int i11 = setSessionImpl;
        int i12 = i11 & 47;
        int i13 = ((i11 ^ 47) | i12) << 1;
        int i14 = -((i11 | 47) & (~i12));
        int i15 = (i13 ^ i14) + ((i14 & i13) << 1);
        onSkipToNext = i15 % 128;
        int i16 = i15 % 2;
        maybeSkipWhitespace maybeskipwhitespaceHandleOnBackCancelled = handleOnBackCancelled();
        int iRemoteActionCompatParcelizer = maybeskipwhitespaceHandleOnBackCancelled.RemoteActionCompatParcelizer() << 1;
        int width = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver.getWidth();
        LessonVideoActivity lessonVideoActivity = this;
        int i17 = onSkipToNext;
        int i18 = i17 & 3;
        int i19 = i18 + ((i17 ^ 3) | i18);
        setSessionImpl = i19 % 128;
        if (i19 % 2 == 0) {
            i = updateNavigation.read((Context) lessonVideoActivity, 170);
            contentView = setContentView();
            i2 = 125;
        } else {
            i = updateNavigation.read((Context) lessonVideoActivity, 170);
            contentView = setContentView();
            i2 = 20;
        }
        int i20 = updateNavigation.read((Context) lessonVideoActivity, i2);
        int i21 = -iRemoteActionCompatParcelizer;
        int iIdentityHashCode = System.identityHashCode(this);
        int i22 = onSkipToNext;
        int i23 = i22 & 117;
        int i24 = (~i23) & (i22 | 117);
        int i25 = i23 << 1;
        int i26 = (i24 ^ i25) + ((i25 & i24) << 1);
        setSessionImpl = i26 % 128;
        if (i26 % 2 == 0) {
            i3 = (i21 * 221) / (width * (-219));
            int i27 = ~i21;
            int i28 = ~width;
            i5 = ~((i27 & i28) | (i27 ^ i28));
            int i29 = ~iIdentityHashCode;
            int i30 = i29 ^ i21;
            int i31 = i29 & i21;
            i6 = (i31 & i30) | (i30 ^ i31);
            i4 = ~width;
        } else {
            i3 = (i21 * 221) + (width * (-219));
            int i32 = (~i21) & ((~i21) | i21);
            int i33 = ~width;
            i4 = ~width;
            int i34 = i33 & (i4 | width);
            int i35 = i32 & i34;
            int i36 = (i32 | i34) & (~i35);
            i5 = ~((i36 & i35) | (i36 ^ i35));
            int i37 = ~iIdentityHashCode;
            i6 = (i37 & i21) | (i37 ^ i21);
        }
        int i38 = (i4 & i6) | ((~i6) & width);
        int i39 = i6 & width;
        int i40 = (i39 & i38) | (i38 ^ i39);
        int i41 = ((i22 | 87) << 1) - (i22 ^ 87);
        setSessionImpl = i41 % 128;
        if (i41 % 2 == 0) {
            int i42 = (i40 | (~i40)) & (~i40);
            int i43 = ((~i42) & i5) | ((~i5) & i42);
            int i44 = i5 & i42;
            int i45 = i3 >>> (220 >> ((i44 & i43) | (i43 ^ i44)));
            int i46 = ~iIdentityHashCode;
            int i47 = i46 ^ width;
            int i48 = i46 & width;
            int i49 = ~((i48 & i47) | (i47 ^ i48));
            int i50 = i45 >> ((-440) << ((i49 & i21) | (i21 ^ i49)));
            int i51 = i21 & width;
            int i52 = ((width | i21) & (~i51)) | i51;
            int i53 = i52 & iIdentityHashCode;
            f = i50 / (220 >>> (((i52 | iIdentityHashCode) & (~i53)) | i53));
        } else {
            int i54 = ~i40;
            int i55 = i5 & i54;
            int i56 = (i5 | i54) & (~i55);
            int i57 = i3 + (((i56 & i55) | (i56 ^ i55)) * 220);
            int i58 = ~iIdentityHashCode;
            int i59 = ~((i58 & width) | (i58 ^ width));
            int i60 = i21 & i59;
            int i61 = (i59 | i21) & (~i60);
            int i62 = -(~(-(-(((i61 & i60) | (i61 ^ i60)) * (-440)))));
            int i63 = ((i57 & i62) + (i62 | i57)) - 1;
            int i64 = i21 ^ width;
            int i65 = width & i21;
            int i66 = (i65 & i64) | (i64 ^ i65);
            int i67 = -(-(((i66 & iIdentityHashCode) | (i66 ^ iIdentityHashCode)) * 220));
            f = (i63 & i67) + (i67 | i63);
        }
        int i68 = (int) (f * p0);
        int i69 = -(i20 << 1);
        int iAudioAttributesCompatParcelizer = OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        int i70 = i69 * (-419);
        int i71 = contentView * 421;
        int i72 = i70 & i71;
        int i73 = (i70 | i71) & (~i72);
        int i74 = -(-(i72 << 1));
        int i75 = (i73 & i74) + (i73 | i74);
        int i76 = setSessionImpl;
        int i77 = i76 & 69;
        int i78 = (i77 - (~(-(-((i76 ^ 69) | i77))))) - 1;
        int i79 = i78 % 128;
        onSkipToNext = i79;
        if (i78 % 2 != 0) {
            int i80 = contentView & iAudioAttributesCompatParcelizer;
            int i81 = (~i80) & (contentView | iAudioAttributesCompatParcelizer);
            i9 = ~iAudioAttributesCompatParcelizer;
            int i82 = i80 | i81;
            int i83 = -(-(UnixStat.DEFAULT_FILE_PERM << ((i82 | (~i82)) & (~i82))));
            int i84 = (i75 & i83) + (i83 | i75);
            int i85 = ~i69;
            int i86 = (~i69) | i69;
            int i87 = i85 & i86;
            int i88 = contentView ^ i87;
            int i89 = i87 & contentView;
            int i90 = -(-((i89 & i88) | (i88 ^ i89)));
            int i91 = i90 | (-420);
            i7 = i84 % ((i91 << 1) - ((~(i90 & (-420))) & i91));
            int i92 = (~i69) & i86;
            int i93 = (~contentView) & ((~contentView) | contentView);
            int i94 = ((~i93) & i92) | ((~i92) & i93);
            int i95 = i92 & i93;
            int i96 = (i95 & i94) | (i94 ^ i95);
            i8 = (i96 | (~i96)) & (~i96);
        } else {
            int i97 = contentView & iAudioAttributesCompatParcelizer;
            int i98 = (~i97) & (contentView | iAudioAttributesCompatParcelizer);
            int i99 = (~((i97 & i98) | (i98 ^ i97))) * UnixStat.DEFAULT_FILE_PERM;
            int i100 = ((i75 ^ i99) | (i75 & i99)) << 1;
            int i101 = -((i99 & (~i75)) | ((~i99) & i75));
            int i102 = ((i100 | i101) << 1) - (i101 ^ i100);
            int i103 = ~i69;
            int i104 = contentView & i103;
            i7 = (i102 - (~(-(-((i104 | ((~i104) & (contentView | i103))) * (-420)))))) - 1;
            int i105 = (i69 | (~i69)) & i103;
            int i106 = (~contentView) & ((~contentView) | contentView);
            i8 = ~((i105 & i106) | (i105 ^ i106));
            i9 = ~iAudioAttributesCompatParcelizer;
        }
        int i107 = (i79 | 69) << 1;
        int i108 = -(i79 ^ 69);
        int i109 = ((i107 | i108) << 1) - (i108 ^ i107);
        setSessionImpl = i109 % 128;
        if (i109 % 2 == 0) {
            int i110 = i9 & contentView;
            int i111 = (contentView | i9) & (~i110);
            int i112 = (i111 & i110) | (i111 ^ i110);
            int i113 = (i112 | (~i112)) & (~i112);
            int i114 = i8 & i113;
            int i115 = (i8 | i113) & (~i114);
            int i116 = 420 ^ ((i115 & i114) | (i115 ^ i114));
            iWrite = getQues.write(i68, i, i7 / (((((r4 & UnixStat.DEFAULT_FILE_PERM) | i116) << 1) - (~(-i116))) - 1));
            Object[] objArr = {(fromStyleLine) getMPresenter()};
            fFloatValue = iWrite - ((Float) fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -991587359, objArr, maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 991587363)).floatValue();
        } else {
            int i117 = i9 & contentView;
            int i118 = (contentView | i9) & (~i117);
            int i119 = ~((i118 & i117) | (i118 ^ i117));
            int i120 = ((~i119) & i8) | ((~i8) & i119);
            int i121 = i8 & i119;
            int i122 = -(-(UnixStat.DEFAULT_FILE_PERM * ((i121 & i120) | (i120 ^ i121))));
            iWrite = getQues.write(i68, i, (i7 ^ i122) + ((i122 & i7) << 1));
            Object[] objArr2 = {(fromStyleLine) getMPresenter()};
            fFloatValue = iWrite * ((Float) fromStyleLine.write(maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), -991587359, objArr2, maybeInvalidateForRendererCapabilitiesChange.write(), maybeInvalidateForRendererCapabilitiesChange.write(), 991587363)).floatValue();
        }
        int i123 = (int) fFloatValue;
        int iAudioAttributesImplApi21Parcelizer = maybeskipwhitespaceHandleOnBackCancelled.AudioAttributesImplApi21Parcelizer();
        FrameLayout frameLayout = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        FrameLayout frameLayout2 = frameLayout;
        ViewGroup.LayoutParams layoutParams = frameLayout2.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        int i124 = onSkipToNext;
        int i125 = i124 & 33;
        int i126 = (((i124 | 33) & (~i125)) - (~(-(-(i125 << 1))))) - 1;
        setSessionImpl = i126 % 128;
        int i127 = i126 % 2;
        layoutParams.width = iRemoteActionCompatParcelizer + iWrite;
        int i128 = onSkipToNext;
        int i129 = (i128 ^ 93) + ((i128 & 93) << 1);
        setSessionImpl = i129 % 128;
        if (i129 % 2 == 0) {
            layoutParams.height = i123 << iAudioAttributesImplApi21Parcelizer;
        } else {
            int i130 = -(~iAudioAttributesImplApi21Parcelizer);
            layoutParams.height = ((i123 & i130) + (i130 | i123)) - 1;
        }
        frameLayout2.setLayoutParams(layoutParams);
        removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver.requestLayout();
        int i131 = setSessionImpl;
        int i132 = i131 | 21;
        int i133 = i132 << 1;
        int i134 = -((~(i131 & 21)) & i132);
        int i135 = (i133 & i134) + (i134 | i133);
        onSkipToNext = i135 % 128;
        if (i135 % 2 != 0) {
            int i136 = 15 / 0;
        }
    }

    @Override // o.parseAlignment.write
    public final void setSessionImpl() {
        int i = 2 % 2;
        OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer();
        System.identityHashCode(this);
        onBackPressed();
        int i2 = setSessionImpl + 97;
        onSkipToNext = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 2 / 0;
        }
    }

    private static /* synthetic */ Object onPlay(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = ((i2 & 98) + (i2 | 98)) - 1;
        setSessionImpl = i3 % 128;
        Object obj = null;
        if (i3 % 2 == 0) {
            ConstraintLayout constraintLayout = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.RatingCompat;
            obj.hashCode();
            throw null;
        }
        ConstraintLayout constraintLayout2 = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.RatingCompat;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(constraintLayout2, "");
        constraintLayout2.setVisibility(0);
        parseRangedUrl parserangedurlRemoveOnPictureInPictureModeChangedListener = lessonVideoActivity.removeOnPictureInPictureModeChangedListener();
        int i4 = onSkipToNext;
        int i5 = (i4 & 1) + (i4 | 1);
        setSessionImpl = i5 % 128;
        if (i5 % 2 == 0) {
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(parserangedurlRemoveOnPictureInPictureModeChangedListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, "");
            throw null;
        }
        FrameLayout frameLayout = parserangedurlRemoveOnPictureInPictureModeChangedListener.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        FrameLayout frameLayout2 = frameLayout;
        int i6 = setSessionImpl;
        int i7 = i6 & 89;
        int i8 = -(-((i6 ^ 89) | i7));
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        onSkipToNext = i9 % 128;
        if (i9 % 2 != 0) {
            frameLayout2.getVisibility();
            throw null;
        }
        if (frameLayout2.getVisibility() == 0) {
            lessonVideoActivity.onPlayFromMediaId();
            int i10 = onSkipToNext + 31;
            setSessionImpl = i10 % 128;
            int i11 = i10 % 2;
        }
        int i12 = setSessionImpl;
        int i13 = i12 ^ 57;
        int i14 = (i12 & 57) << 1;
        int i15 = (i13 & i14) + (i14 | i13);
        onSkipToNext = i15 % 128;
        if (i15 % 2 != 0) {
            int i16 = 60 / 0;
        }
        return null;
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public final void onNewIntent(Intent p0) {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 ^ 25;
        int i4 = ((((i2 & 25) | i3) << 1) - (~(-i3))) - 1;
        onSkipToNext = i4 % 128;
        if (i4 % 2 != 0) {
            toMagicModuleMetaRepoModel.write(p0, "");
            super.onNewIntent(p0);
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        toMagicModuleMetaRepoModel.write(p0, "");
        super.onNewIntent(p0);
        int i5 = (-2) - ((onSkipToNext + 60) ^ (-1));
        setSessionImpl = i5 % 128;
        if (i5 % 2 != 0) {
            startActivity(p0);
            finish();
        } else {
            startActivity(p0);
            finish();
            int i6 = 57 / 0;
        }
    }

    @Override // o.parseAlignment.write
    public final void MediaBrowserCompatItemReceiver(boolean p0) {
        int i;
        int i2 = 2 % 2;
        int i3 = onSkipToNext;
        int i4 = (((i3 | 124) << 1) - (i3 ^ 124)) - 1;
        setSessionImpl = i4 % 128;
        Object obj = null;
        if (i4 % 2 == 0) {
            LinearLayout linearLayout = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer;
            obj.hashCode();
            throw null;
        }
        LinearLayout linearLayout2 = removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.AudioAttributesImplBaseParcelizer;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayout2, "");
        LinearLayout linearLayout3 = linearLayout2;
        if (p0) {
            int i5 = setSessionImpl;
            int i6 = i5 ^ 7;
            int i7 = (((i5 & 7) | i6) << 1) - i6;
            onSkipToNext = i7 % 128;
            int i8 = i7 % 2;
            int i9 = i5 & 57;
            int i10 = i9 + ((i5 ^ 57) | i9);
            onSkipToNext = i10 % 128;
            int i11 = i10 % 2;
            i = 0;
        } else {
            int i12 = onSkipToNext;
            int i13 = (((i12 | 86) << 1) - (i12 ^ 86)) - 1;
            setSessionImpl = i13 % 128;
            int i14 = i13 % 2;
            i = 8;
        }
        linearLayout3.setVisibility(i);
        int i15 = onSkipToNext;
        int i16 = i15 & 73;
        int i17 = ((i15 | 73) & (~i16)) + (i16 << 1);
        setSessionImpl = i17 % 128;
        if (i17 % 2 != 0) {
            return;
        }
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onSeekTo(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 43;
        int i4 = -(-((i2 ^ 43) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        onSkipToNext = i5 % 128;
        int i6 = i5 % 2;
        LinearLayout linearLayoutRemoteActionCompatParcelizer = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatCustomActionResultReceiver.IconCompatParcelizer();
        int i7 = setSessionImpl + 35;
        onSkipToNext = i7 % 128;
        int i8 = i7 % 2;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutRemoteActionCompatParcelizer, "");
        linearLayoutRemoteActionCompatParcelizer.setVisibility(0);
        int i9 = setSessionImpl;
        int i10 = (i9 ^ 37) + ((i9 & 37) << 1);
        onSkipToNext = i10 % 128;
        if (i10 % 2 != 0) {
            lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
            throw null;
        }
        LinearLayout linearLayoutIconCompatParcelizer = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatCustomActionResultReceiver.MediaBrowserCompatItemReceiver.IconCompatParcelizer();
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(linearLayoutIconCompatParcelizer, "");
        linearLayoutIconCompatParcelizer.setVisibility(8);
        int i11 = onSkipToNext;
        int i12 = ((i11 | 121) << 1) - (i11 ^ 121);
        setSessionImpl = i12 % 128;
        int i13 = i12 % 2;
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x004e  */
    @Override // o.parseAlignment.write
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean _init_lambda5() {
        /*
            r5 = this;
            r0 = 2
            int r1 = r0 % r0
            int r1 = com.marrow.ui.activities.learn.video.LessonVideoActivity.onSkipToNext
            r2 = r1 & 89
            r1 = r1 | 89
            int r2 = r2 + r1
            int r1 = r2 % 128
            com.marrow.ui.activities.learn.video.LessonVideoActivity.setSessionImpl = r1
            int r2 = r2 % r0
            o.parseRangedUrl r5 = r5.removeOnPictureInPictureModeChangedListener()
            androidx.constraintlayout.widget.ConstraintLayout r5 = r5.AudioAttributesImplApi21Parcelizer
            int r1 = com.marrow.ui.activities.learn.video.LessonVideoActivity.onSkipToNext
            r2 = r1 ^ 11
            r3 = r1 & 11
            r2 = r2 | r3
            r3 = 1
            int r2 = r2 << r3
            r4 = r1 & (-12)
            int r1 = ~r1
            r1 = r1 & 11
            r1 = r1 | r4
            int r1 = -r1
            r4 = r2 | r1
            int r4 = r4 << r3
            r1 = r1 ^ r2
            int r4 = r4 - r1
            int r1 = r4 % 128
            com.marrow.ui.activities.learn.video.LessonVideoActivity.setSessionImpl = r1
            int r4 = r4 % r0
            r1 = 0
            java.lang.String r2 = ""
            if (r4 != 0) goto L43
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r5, r2)
            android.view.View r5 = (android.view.View) r5
            int r5 = r5.getVisibility()
            r2 = 45
            int r2 = r2 / r1
            if (r5 != 0) goto L6b
            goto L4e
        L43:
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r5, r2)
            android.view.View r5 = (android.view.View) r5
            int r5 = r5.getVisibility()
            if (r5 != 0) goto L6b
        L4e:
            int r5 = com.marrow.ui.activities.learn.video.LessonVideoActivity.setSessionImpl
            r1 = r5 & 11
            r2 = r5 | 11
            r4 = r1 | r2
            int r4 = r4 << r3
            r1 = r1 ^ r2
            int r4 = r4 - r1
            int r1 = r4 % 128
            com.marrow.ui.activities.learn.video.LessonVideoActivity.onSkipToNext = r1
            int r4 = r4 % r0
            r1 = r5 & 25
            r5 = r5 ^ 25
            r5 = r5 | r1
            int r1 = r1 + r5
            int r5 = r1 % 128
            com.marrow.ui.activities.learn.video.LessonVideoActivity.onSkipToNext = r5
            int r1 = r1 % r0
            r1 = r3
            goto L77
        L6b:
            int r5 = com.marrow.ui.activities.learn.video.LessonVideoActivity.setSessionImpl
            r2 = r5 & 49
            r5 = r5 | 49
            int r2 = r2 + r5
            int r5 = r2 % 128
            com.marrow.ui.activities.learn.video.LessonVideoActivity.onSkipToNext = r5
            int r2 = r2 % r0
        L77:
            int r5 = ~r1
            r5 = r5 & r3
            int r1 = com.marrow.ui.activities.learn.video.LessonVideoActivity.setSessionImpl
            int r1 = r1 + 37
            int r2 = r1 % 128
            com.marrow.ui.activities.learn.video.LessonVideoActivity.onSkipToNext = r2
            int r1 = r1 % r0
            if (r1 != 0) goto L85
            return r5
        L85:
            r5 = 0
            r5.hashCode()
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity._init_lambda5():boolean");
    }

    private static /* synthetic */ Object onRemoveQueueItemAt(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 99;
        int i4 = -(-((i2 ^ 99) | i3));
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        FrameLayout frameLayout = lessonVideoActivity.removeOnPictureInPictureModeChangedListener().MediaBrowserCompatSearchResultReceiver;
        int i7 = setSessionImpl;
        int i8 = (i7 & 53) + (i7 | 53);
        onSkipToNext = i8 % 128;
        int i9 = i8 % 2;
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(frameLayout, "");
        if (frameLayout.getVisibility() != 0) {
            int i10 = onSkipToNext;
            int i11 = (i10 & 71) + (i10 | 71);
            setSessionImpl = i11 % 128;
            if (i11 % 2 != 0) {
                return false;
            }
            Object obj = null;
            obj.hashCode();
            throw null;
        }
        int i12 = onSkipToNext;
        int i13 = ((i12 | 45) << 1) - (i12 ^ 45);
        int i14 = i13 % 128;
        setSessionImpl = i14;
        int i15 = i13 % 2;
        int i16 = i14 & 115;
        int i17 = (i16 - (~((i14 ^ 115) | i16))) - 1;
        onSkipToNext = i17 % 128;
        int i18 = i17 % 2;
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x018c  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x018e  */
    @Override // kotlin.parseIdentifierSection, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void onPause() throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 649
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.onPause():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:121:0x0d45  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0d7c A[Catch: all -> 0x0e41, TryCatch #1 {all -> 0x0e41, blocks: (B:127:0x0d76, B:129:0x0d7c, B:130:0x0da9), top: B:258:0x0d76, outer: #14 }] */
    @Override // kotlin.parseIdentifierSection, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void attachBaseContext(android.content.Context r37) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 7204
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.marrow.ui.activities.learn.video.LessonVideoActivity.attachBaseContext(android.content.Context):void");
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer(LessonVideoActivity lessonVideoActivity) {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (i2 ^ 85) + ((i2 & 85) << 1);
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -2070487137, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 2070487217);
        int i5 = onSkipToNext;
        int i6 = i5 & 57;
        int i7 = ((((i5 ^ 57) | i6) << 1) - (~(-((i5 | 57) & (~i6))))) - 1;
        setSessionImpl = i7 % 128;
        int i8 = i7 % 2;
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(LessonVideoActivity lessonVideoActivity) {
        return (getShowPopup) write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1326966879, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1326966984);
    }

    public static /* synthetic */ WindowInsetsCompat IconCompatParcelizer(LessonVideoActivity lessonVideoActivity, View view, WindowInsetsCompat windowInsetsCompat) {
        return (WindowInsetsCompat) write(new Object[]{lessonVideoActivity, view, windowInsetsCompat}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1426881892, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1426881942);
    }

    public static /* synthetic */ getShowPopup read(LessonVideoActivity lessonVideoActivity) {
        return (getShowPopup) write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -2090775742, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 2090775802);
    }

    public static /* synthetic */ getShowPopup IconCompatParcelizer(LessonVideoActivity lessonVideoActivity) {
        int i = 2 % 2;
        int i2 = onSkipToNext + 70;
        int i3 = (i2 ^ (-1)) + (i2 << 1);
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        getShowPopup getshowpopupOnCustomAction = onCustomAction(lessonVideoActivity);
        int i5 = setSessionImpl;
        int i6 = i5 | 59;
        int i7 = ((i6 << 1) - (~(-((~(i5 & 59)) & i6)))) - 1;
        onSkipToNext = i7 % 128;
        if (i7 % 2 != 0) {
            int i8 = 65 / 0;
        }
        return getshowpopupOnCustomAction;
    }

    public static /* synthetic */ void MediaBrowserCompatCustomActionResultReceiver(LessonVideoActivity lessonVideoActivity) {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 49;
        int i4 = i3 + ((i2 ^ 49) | i3);
        setSessionImpl = i4 % 128;
        int i5 = i4 % 2;
        onMediaButtonEvent(lessonVideoActivity);
        int i6 = setSessionImpl + 57;
        onSkipToNext = i6 % 128;
        int i7 = i6 % 2;
    }

    public static /* synthetic */ getShowPopup MediaBrowserCompatItemReceiver(LessonVideoActivity lessonVideoActivity) {
        return (getShowPopup) write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1000094113, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1000094186);
    }

    public static /* synthetic */ getShowPopup AudioAttributesImplApi26Parcelizer(LessonVideoActivity lessonVideoActivity) {
        int i = 2 % 2;
        int i2 = onSkipToNext + 73;
        setSessionImpl = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupOnPrepare = onPrepare(lessonVideoActivity);
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
        return getshowpopupOnPrepare;
    }

    public static /* synthetic */ getShowPopup AudioAttributesImplBaseParcelizer(LessonVideoActivity lessonVideoActivity) {
        int i = 2 % 2;
        int i2 = setSessionImpl + 39;
        onSkipToNext = i2 % 128;
        int i3 = i2 % 2;
        getShowPopup getshowpopupOnPlayFromMediaId = onPlayFromMediaId(lessonVideoActivity);
        int i4 = onSkipToNext;
        int i5 = i4 ^ 23;
        int i6 = ((((i4 & 23) | i5) << 1) - (~(-i5))) - 1;
        setSessionImpl = i6 % 128;
        int i7 = i6 % 2;
        return getshowpopupOnPlayFromMediaId;
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer(LessonVideoActivity lessonVideoActivity, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = setSessionImpl + 95;
        onSkipToNext = i2 % 128;
        if (i2 % 2 != 0) {
            write(new Object[]{lessonVideoActivity, str, bundle}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1679177389, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1679177386);
            int i3 = 68 / 0;
        } else {
            write(new Object[]{lessonVideoActivity, str, bundle}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1679177389, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1679177386);
        }
        int i4 = onSkipToNext;
        int i5 = (i4 & (-68)) | ((~i4) & 67);
        int i6 = -(-((i4 & 67) << 1));
        int i7 = (i5 & i6) + (i6 | i5);
        setSessionImpl = i7 % 128;
        if (i7 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ getShowPopup RemoteActionCompatParcelizer(LessonVideoActivity lessonVideoActivity, int i) {
        int i2 = 2 % 2;
        int i3 = onSkipToNext + 101;
        setSessionImpl = i3 % 128;
        if (i3 % 2 != 0) {
            return (getShowPopup) write(new Object[]{lessonVideoActivity, Integer.valueOf(i)}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1587033828, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1587033912);
        }
        Object[] objArr = {lessonVideoActivity, Integer.valueOf(i)};
        int i4 = 69 / 0;
        return (getShowPopup) write(objArr, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1587033828, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1587033912);
    }

    public static /* synthetic */ void read(LessonVideoActivity lessonVideoActivity, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (i2 & 51) + (i2 | 51);
        onSkipToNext = i3 % 128;
        int i4 = i3 % 2;
        write(new Object[]{lessonVideoActivity, str, bundle}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1774344262, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1774344272);
        int i5 = setSessionImpl;
        int i6 = (((i5 & (-46)) | ((~i5) & 45)) - (~((i5 & 45) << 1))) - 1;
        onSkipToNext = i6 % 128;
        if (i6 % 2 != 0) {
            throw null;
        }
    }

    public static /* synthetic */ getShowPopup RatingCompat(LessonVideoActivity lessonVideoActivity) {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 89;
        int i4 = (i3 - (~(-(-((i2 ^ 89) | i3))))) - 1;
        onSkipToNext = i4 % 128;
        int i5 = i4 % 2;
        getShowPopup getshowpopup = (getShowPopup) write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1811318026, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1811317970);
        int i6 = onSkipToNext;
        int i7 = i6 & 121;
        int i8 = (i6 | 121) & (~i7);
        int i9 = i7 << 1;
        int i10 = (i8 ^ i9) + ((i8 & i9) << 1);
        setSessionImpl = i10 % 128;
        int i11 = i10 % 2;
        return getshowpopup;
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer(LessonVideoActivity lessonVideoActivity, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (((i2 ^ 81) | (i2 & 81)) << 1) - (((~i2) & 81) | (i2 & (-82)));
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        MediaBrowserCompatItemReceiver(lessonVideoActivity, str, bundle);
        int i5 = onSkipToNext + 9;
        setSessionImpl = i5 % 128;
        if (i5 % 2 == 0) {
            throw null;
        }
    }

    public static /* synthetic */ getShowPopup MediaDescriptionCompat(LessonVideoActivity lessonVideoActivity) {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 43;
        int i4 = (((i2 ^ 43) | i3) << 1) - ((i2 | 43) & (~i3));
        setSessionImpl = i4 % 128;
        if (i4 % 2 != 0) {
            return (getShowPopup) write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1242454057, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1242454069);
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void MediaBrowserCompatSearchResultReceiver(LessonVideoActivity lessonVideoActivity) {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (i2 & 43) + (i2 | 43);
        onSkipToNext = i3 % 128;
        int i4 = i3 % 2;
        write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 934470570, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -934470527);
        int i5 = onSkipToNext;
        int i6 = i5 | 33;
        int i7 = i6 << 1;
        int i8 = -((~(i5 & 33)) & i6);
        int i9 = ((i7 | i8) << 1) - (i8 ^ i7);
        setSessionImpl = i9 % 128;
        int i10 = i9 % 2;
    }

    public static /* synthetic */ void write(LessonVideoActivity lessonVideoActivity, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onSkipToNext + 53;
        setSessionImpl = i2 % 128;
        int i3 = i2 % 2;
        write(new Object[]{lessonVideoActivity, str, bundle}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1008574333, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1008574372);
        int i4 = onSkipToNext;
        int i5 = ((i4 | 71) << 1) - (i4 ^ 71);
        setSessionImpl = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ void MediaBrowserCompatCustomActionResultReceiver(LessonVideoActivity lessonVideoActivity, String str, Bundle bundle) {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (i2 & 15) + (i2 | 15);
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        AudioAttributesImplApi26Parcelizer(lessonVideoActivity, str, bundle);
        if (i4 == 0) {
            int i5 = 78 / 0;
        }
        int i6 = onSkipToNext;
        int i7 = ((((i6 ^ 73) | (i6 & 73)) << 1) - (~(-(((~i6) & 73) | (i6 & (-74)))))) - 1;
        setSessionImpl = i7 % 128;
        int i8 = i7 % 2;
    }

    public static /* synthetic */ void IconCompatParcelizer(LessonVideoActivity lessonVideoActivity, boolean z, float f, float f2) {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (((i2 ^ 83) | (i2 & 83)) << 1) - (((~i2) & 83) | (i2 & (-84)));
        onSkipToNext = i3 % 128;
        if (i3 % 2 == 0) {
            write(new Object[]{lessonVideoActivity, Boolean.valueOf(z), Float.valueOf(f), Float.valueOf(f2)}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1692933133, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1692933161);
            return;
        }
        write(new Object[]{lessonVideoActivity, Boolean.valueOf(z), Float.valueOf(f), Float.valueOf(f2)}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1692933133, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1692933161);
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    public static /* synthetic */ getShowPopup read(LessonVideoActivity lessonVideoActivity, Exception exc) {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 87;
        int i4 = (i2 ^ 87) | i3;
        int i5 = ((i3 | i4) << 1) - (i4 ^ i3);
        onSkipToNext = i5 % 128;
        if (i5 % 2 != 0) {
            RemoteActionCompatParcelizer(lessonVideoActivity, exc);
            throw null;
        }
        getShowPopup getshowpopupRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(lessonVideoActivity, exc);
        int i6 = onSkipToNext;
        int i7 = ((i6 ^ 45) | (i6 & 45)) << 1;
        int i8 = -(((~i6) & 45) | (i6 & (-46)));
        int i9 = (i7 ^ i8) + ((i8 & i7) << 1);
        setSessionImpl = i9 % 128;
        if (i9 % 2 == 0) {
            int i10 = 90 / 0;
        }
        return getshowpopupRemoteActionCompatParcelizer;
    }

    static {
        int[] iArr;
        onSkipToPrevious = 0;
        MediaSessionCompatResultReceiverWrapper = 1;
        removeOnUserLeaveHintListener();
        IconCompatParcelizer = new isResolutionNotSupported[]{toMagicModuleMetaDataUcModel.write(new downloadMagicModuleMetalambda0(LessonVideoActivity.class, "binding", "getBinding()Lcom/marrow/databinding/ActivityLessonVideoBinding;", 0))};
        Companion companion = new Companion(null);
        int i = MediaSessionCompatResultReceiverWrapper;
        int i2 = i ^ 107;
        int i3 = (i & 107) << 1;
        int i4 = (i2 & i3) + (i2 | i3);
        onSkipToPrevious = i4 % 128;
        int i5 = i4 % 2;
        INSTANCE = companion;
        int[] iArr2 = new int[2];
        if (i5 != 0) {
            iArr2[0] = R.id.toolbar_parent;
        } else {
            iArr2[0] = R.id.toolbar_parent;
        }
        int i6 = i & 101;
        int i7 = i6 + ((i ^ 101) | i6);
        int i8 = i7 % 128;
        onSkipToPrevious = i8;
        if (i7 % 2 != 0) {
            iArr2[0] = R.id.llMarkCompleteContainer;
            read = iArr2;
            iArr = new int[3];
        } else {
            iArr2[1] = R.id.llMarkCompleteContainer;
            read = iArr2;
            iArr = new int[2];
        }
        iArr[0] = R.id.toolbar_parent;
        iArr[1] = R.id.layout_video_bottom_content;
        int i9 = (-2) - ((i8 + 28) ^ (-1));
        int i10 = i9 % 128;
        MediaSessionCompatResultReceiverWrapper = i10;
        int i11 = i9 % 2;
        AudioAttributesCompatParcelizer = iArr;
        int i12 = ((i10 & (-70)) | ((~i10) & 69)) + ((i10 & 69) << 1);
        onSkipToPrevious = i12 % 128;
        if (i12 % 2 != 0) {
            int i13 = 42 / 0;
        }
    }

    public static final /* synthetic */ parseRangedUrl MediaMetadataCompat(LessonVideoActivity lessonVideoActivity) {
        return (parseRangedUrl) write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 2008546449, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -2008546361);
    }

    private final void AudioAttributesImplApi21Parcelizer(boolean p0) {
        write(new Object[]{this, Boolean.valueOf(p0)}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 591436899, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -591436835);
    }

    private final void write(float p0) {
        write(new Object[]{this, Float.valueOf(p0)}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -265131878, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 265131961);
    }

    private static void AudioAttributesCompatParcelizer(ReferenceTypeDeserializer referenceTypeDeserializer) {
        write(new Object[]{referenceTypeDeserializer}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1262800418, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1262800508);
    }

    private static final getShowPopup MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(LessonVideoActivity lessonVideoActivity) {
        return (getShowPopup) write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1195657873, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1195657888);
    }

    private final void removeOnNewIntentListener() {
        write(new Object[]{this}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(3) + 1055635978, (-1036636560) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), 2086741594, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -2086741548);
    }

    private final void removeOnTrimMemoryListener() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 1255269170, 1675413353, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) + 1249765193, OnFailureListener.AudioAttributesCompatParcelizer(), -1675413243);
    }

    private final float startIntentSenderForResult() {
        return ((Float) write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 104299600, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -104299575)).floatValue();
    }

    private final float startActivityForResult() {
        return ((Float) write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 2018635492, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -2018635418)).floatValue();
    }

    @getMagicModuleMeta
    public static final Intent IconCompatParcelizer(Context context, String str) {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 & 15;
        int i4 = -(-((i2 ^ 15) | i3));
        int i5 = (i3 ^ i4) + ((i4 & i3) << 1);
        setSessionImpl = i5 % 128;
        int i6 = i5 % 2;
        Intent intent = INSTANCE.read(context, str, 0);
        int i7 = onSkipToNext;
        int i8 = i7 | 105;
        int i9 = i8 << 1;
        int i10 = -((~(i7 & 105)) & i8);
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        setSessionImpl = i11 % 128;
        int i12 = i11 % 2;
        return intent;
    }

    @getMagicModuleMeta
    public static final Intent IconCompatParcelizer(Context context, String str, int i, boolean z, StandardIntegrityVerdictOptOut.read readVar) {
        int i2 = 2 % 2;
        int i3 = setSessionImpl;
        int i4 = i3 & 19;
        int i5 = (i3 ^ 19) | i4;
        int i6 = (i4 ^ i5) + ((i5 & i4) << 1);
        onSkipToNext = i6 % 128;
        int i7 = i6 % 2;
        Intent intentAudioAttributesCompatParcelizer = Companion.AudioAttributesCompatParcelizer(context, str, 0, false, readVar);
        int i8 = onSkipToNext;
        int i9 = (i8 & (-80)) | ((~i8) & 79);
        int i10 = -(-((i8 & 79) << 1));
        int i11 = (i9 & i10) + (i10 | i9);
        setSessionImpl = i11 % 128;
        if (i11 % 2 == 0) {
            int i12 = 64 / 0;
        }
        return intentAudioAttributesCompatParcelizer;
    }

    @getMagicModuleMeta
    public static final Intent RemoteActionCompatParcelizer(Context context, String str, boolean z, boolean z2, boolean z3) {
        return (Intent) write(new Object[]{context, str, Boolean.valueOf(z), Boolean.valueOf(z2), Boolean.valueOf(z3)}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1127638420, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1127638404);
    }

    private final int addCancellable() {
        return ((Integer) write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1074421852, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1074421757)).intValue();
    }

    private final int handleOnBackPressed() {
        return ((Integer) write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -375901777, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 375901821)).intValue();
    }

    private final void AudioAttributesImplApi26Parcelizer(boolean p0) {
        write(new Object[]{this, Boolean.valueOf(p0)}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 274814134, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -274814098);
    }

    private final void getEnabledChangedCallbackactivity_release() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1471186798, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1471186761);
    }

    private final void handleOnBackProgressed() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1158600333, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1158600240);
    }

    private static final void read(LessonVideoActivity lessonVideoActivity, ActivityResult activityResult) {
        write(new Object[]{lessonVideoActivity, activityResult}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1114677816, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1114677705);
    }

    private static final void write(LessonVideoActivity lessonVideoActivity, boolean z, float f, float f2) {
        write(new Object[]{lessonVideoActivity, Boolean.valueOf(z), Float.valueOf(f), Float.valueOf(f2)}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1692933133, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1692933161);
    }

    private final void setEnabled() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 158115100, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -158115093);
    }

    private static final getShowPopup onCommand(LessonVideoActivity lessonVideoActivity) {
        return (getShowPopup) write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1038952842, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1038952919);
    }

    private static final void AudioAttributesImplApi21Parcelizer(LessonVideoActivity lessonVideoActivity, String str, Bundle bundle) {
        write(new Object[]{lessonVideoActivity, str, bundle}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1008574333, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1008574372);
    }

    private static final void AudioAttributesImplBaseParcelizer(LessonVideoActivity lessonVideoActivity, String str, Bundle bundle) {
        write(new Object[]{lessonVideoActivity, str, bundle}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1679177389, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1679177386);
    }

    private static final void MediaMetadataCompat(LessonVideoActivity lessonVideoActivity, String str, Bundle bundle) {
        write(new Object[]{lessonVideoActivity, str, bundle}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1774344262, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1774344272);
    }

    private static final void onFastForward(LessonVideoActivity lessonVideoActivity) {
        write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -2070487137, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 2070487217);
    }

    private static final void onPause(LessonVideoActivity lessonVideoActivity) {
        write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -339929076, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 339929167);
    }

    private static final getShowPopup onPlay(LessonVideoActivity lessonVideoActivity) {
        return (getShowPopup) write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1242454057, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1242454069);
    }

    private static final getShowPopup onPrepareFromMediaId(LessonVideoActivity lessonVideoActivity) {
        return (getShowPopup) write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -682790792, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 682790867);
    }

    private static final void onPlayFromSearch(LessonVideoActivity lessonVideoActivity) {
        write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 934470570, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -934470527);
    }

    private final void removeCancellable() {
        write(new Object[]{this}, OnFailureListener.AudioAttributesCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 364838920, 1911335814, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().codePointAt(2) - 1715553490, (-1739477460) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion, -1911335762);
    }

    private final void isEnabled() {
        write(new Object[]{this}, OnFailureListener.AudioAttributesCompatParcelizer(), OnFailureListener.AudioAttributesCompatParcelizer(), 530230726, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -530230656);
    }

    private final void ActivityResult() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -2102528170, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 2102528211);
    }

    private final void IntentSenderRequest() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -357719963, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 357719987);
    }

    private final void getContext() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1735041539, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1735041525);
    }

    private final void MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(String p0) {
        write(new Object[]{this, p0}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1383148248, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1383148296);
    }

    private final void create() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1975421823, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1975421891);
    }

    private final void MediaBrowserCompatCustomActionResultReceiver(boolean p0) {
        write(new Object[]{this, Boolean.valueOf(p0)}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 934436490, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -934436387);
    }

    private static final getShowPopup onPrepareFromSearch(LessonVideoActivity lessonVideoActivity) {
        return (getShowPopup) write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1811318026, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1811317970);
    }

    private static final getShowPopup write(LessonVideoActivity lessonVideoActivity, int i) {
        return (getShowPopup) write(new Object[]{lessonVideoActivity, Integer.valueOf(i)}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1587033828, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1587033912);
    }

    @Override // o.parseAlignment.write
    public final void read(boolean p0) {
        write(new Object[]{this, Boolean.valueOf(p0)}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -736375410, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 736375482);
    }

    @Override // o.parseAlignment.RemoteActionCompatParcelizer
    public final void RemoteActionCompatParcelizer(String p0, VideoInfo p1) {
        write(new Object[]{this, p0, p1}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1030400825, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1030400923);
    }

    @Override // o.parseAlignment.write
    public final void onFastForward() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 2088149160, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OnFailureListener.AudioAttributesCompatParcelizer(), -2088149102);
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, android.app.Activity
    public final void finish() {
        write(new Object[]{this}, OnFailureListener.AudioAttributesCompatParcelizer(), OnFailureListener.AudioAttributesCompatParcelizer(), -920127492, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1361958131, OnFailureListener.AudioAttributesCompatParcelizer(), 920127522);
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final NavigationBarViewSavedState onAddQueueItem() {
        return (NavigationBarViewSavedState) write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 498562902 + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), -993452416, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OnFailureListener.AudioAttributesCompatParcelizer(), 993452520);
    }

    @Override // o.parseAlignment.write
    public final int onPrepare() {
        return ((Integer) write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -977122257, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 977122297)).intValue();
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final int handleMediaPlayPauseIfPendingOnHandler() {
        return ((Integer) write(new Object[]{this}, OnFailureListener.AudioAttributesCompatParcelizer(), OnFailureListener.AudioAttributesCompatParcelizer(), -1407515650, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() + 1987059102, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1407515677)).intValue();
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity
    public final handlePreambleAddressCode[] MediaBrowserCompatCustomActionResultReceiver() {
        return (handlePreambleAddressCode[]) write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -615098835, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OnFailureListener.AudioAttributesCompatParcelizer(), 615098901);
    }

    @Override // o.parseAlignment.write
    public final void write(maybeSkipWhitespace p0, int p1, int p2, maybeSkipComment p3) {
        write(new Object[]{this, p0, Integer.valueOf(p1), Integer.valueOf(p2), p3}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 320584186, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -320584127);
    }

    @Override // o.parseAlignment.write
    public final void MediaSessionCompatToken() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1614649127, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1614649209);
    }

    @Override // o.parseAlignment.write
    public final void MediaSessionCompatResultReceiverWrapper() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 824486514, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -824486488);
    }

    @Override // o.parseAlignment.write
    public final void MediaSessionCompatQueueItem() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 780915696, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -780915664);
    }

    private void setHasDecor() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -2051632354, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 2051632355);
    }

    @Override // o.parseAlignment.write
    public final void r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -2012251642, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 2012251749);
    }

    @Override // o.parseAlignment.write
    public final void PlaybackStateCompatCustomAction() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1310777385, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1310777298);
    }

    @Override // o.parseAlignment.write
    public final void IconCompatParcelizer(String p0, int p1, String p2, String p3) {
        write(new Object[]{this, p0, Integer.valueOf(p1), p2, p3}, OnFailureListener.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -31982752, OnFailureListener.AudioAttributesCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 727896308, 31982787);
    }

    @Override // o.parseAlignment.write
    public final boolean r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28() {
        return ((Boolean) write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OnFailureListener.AudioAttributesCompatParcelizer(), 1609717062, OnFailureListener.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1609717051)).booleanValue();
    }

    @Override // o.parseAlignment.write
    public final boolean _init_lambda2() {
        return ((Boolean) write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1059214298, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1059214229)).booleanValue();
    }

    @Override // o.parseAlignment.write
    public final boolean _init_lambda3() {
        return ((Boolean) write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1159545353, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1159545277)).booleanValue();
    }

    @Override // o.parseAlignment.RemoteActionCompatParcelizer
    public final boolean r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8() {
        return ((Boolean) write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1023724155, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1023724076)).booleanValue();
    }

    @Override // com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity
    public final boolean RatingCompat() {
        return ((Boolean) write(new Object[]{this}, OnFailureListener.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1725180292, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 1607877075, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1725180310)).booleanValue();
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final boolean onSetPlaybackSpeed() {
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = i2 + 123;
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 & 83;
        int i6 = ((((i2 ^ 83) | i5) << 1) - (~(-((i2 | 83) & (~i5))))) - 1;
        setSessionImpl = i6 % 128;
        if (i6 % 2 != 0) {
            return true;
        }
        throw null;
    }

    @Override // com.marrow.ui.activities.base.BaseActivity
    public final boolean onSetShuffleMode() {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (-2) - ((((i2 | 110) << 1) - (i2 ^ 110)) ^ (-1));
        int i4 = i3 % 128;
        onSkipToNext = i4;
        boolean z = i3 % 2 == 0;
        int i5 = i4 + 126;
        int i6 = (i5 ^ (-1)) + (i5 << 1);
        setSessionImpl = i6 % 128;
        if (i6 % 2 != 0) {
            return z;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    @Override // o.parseAlignment.write
    public final boolean _init_lambda4() {
        return ((Boolean) write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -2067810136, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 2067810167)).booleanValue();
    }

    @Override // o.parseAlignment.write
    public final void accessaddObserverForBackInvoker() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1808598157, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1808598065);
    }

    @Override // o.parseAlignment.write
    public final void write(String p0) {
        write(new Object[]{this, p0}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1770728148, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1770728199);
    }

    @Override // o.parseAlignment.write
    public final void write(boolean p0) {
        write(new Object[]{this, Boolean.valueOf(p0)}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1053448284, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1053448278);
    }

    @Override // o.parseAlignment.write
    public final void read(String p0, int p1) {
        write(new Object[]{this, p0, Integer.valueOf(p1)}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -956348218, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 956348281);
    }

    @Override // com.marrow.ui.dialogs.LessonCompletedDialog.read
    public final void accessonBackPresseds1027565324() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -630028909, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(0) - 324736489, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 630028922);
    }

    @Override // kotlin.addObserverForBackInvoker, kotlin.MediaBrowserCompatMediaItem, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration p0) {
        write(new Object[]{this, p0}, OnFailureListener.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1809214623, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OnFailureListener.AudioAttributesCompatParcelizer(), 1809214688);
    }

    @Override // kotlin.parseIdentifierSection, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, android.app.Activity
    public final void onDestroy() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -2104058074, OnFailureListener.AudioAttributesCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).codePointAt(2) - 800838138, 2104058159);
    }

    @Override // com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, android.app.Activity
    public final void onPostCreate(Bundle p0) {
        write(new Object[]{this, p0}, OnFailureListener.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1472596843, OnFailureListener.AudioAttributesCompatParcelizer(), OnFailureListener.AudioAttributesCompatParcelizer(), 1472596951);
    }

    @Override // kotlin.parseIdentifierSection, com.marrow.kt.base.BaseDaggerActivity, com.marrow.ui.activities.base.BaseActivity, kotlin.addObserverForBackInvoker, kotlin.maybeGetTypeVariable, kotlin.MediaBrowserCompatMediaItem, kotlin._checkFloatSpecialValue, android.app.Activity
    public final void onStart() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OnFailureListener.AudioAttributesCompatParcelizer(), 1868658852, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() - 1509051371, OnFailureListener.AudioAttributesCompatParcelizer(), -1868658843);
    }

    @Override // kotlin.MediaBrowserCompatMediaItem, android.app.Activity
    public final void onUserLeaveHint() {
        write(new Object[]{this}, OnFailureListener.AudioAttributesCompatParcelizer(), (-877871461) + (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)), 1016459634, OnFailureListener.AudioAttributesCompatParcelizer(), (-1616045414) + ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length(), -1016459615);
    }

    @Override // o.parseAlignment.write
    public final void createFullyDrawnExecutor() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -282716381, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 282716383);
    }

    @Override // com.marrow.ui.dialogs.LessonCompletedDialog.read
    public final void read(int p0, boolean p1) {
        write(new Object[]{this, Integer.valueOf(p0), Boolean.valueOf(p1)}, OnFailureListener.AudioAttributesCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).length() + 482574216, 797025420, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -797025420);
    }

    @Override // o.DefaultTrackSelectorExternalSyntheticLambda6.read
    public final void onPrepareFromSearch() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 768784976, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -768784914);
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onWindowFocusChanged(boolean p0) {
        write(new Object[]{this, Boolean.valueOf(p0)}, OnFailureListener.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1438335022, OnFailureListener.AudioAttributesCompatParcelizer(), OnFailureListener.AudioAttributesCompatParcelizer(), 1438335064);
    }

    @Override // o.parseAlignment.write
    public final void read(String str, String str2) {
        write(new Object[]{this, str, str2}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OnFailureListener.AudioAttributesCompatParcelizer(), -789443677, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OnFailureListener.AudioAttributesCompatParcelizer(), 789443698);
    }

    @Override // o.parseAlignment.write
    public final void ensureViewModelStore() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 865090729, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -865090620);
    }

    @Override // o.parseAlignment.write
    public final void read(ActiveRecallQbankLessonUiModel p0) {
        write(new Object[]{this, p0}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1077001125, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1077001133);
    }

    @Override // o.parseAlignment.write
    public final void AudioAttributesCompatParcelizer(int p0) {
        write(new Object[]{this, Integer.valueOf(p0)}, OnFailureListener.AudioAttributesCompatParcelizer(), OnFailureListener.AudioAttributesCompatParcelizer(), 1077928392, OnFailureListener.AudioAttributesCompatParcelizer(), OnFailureListener.AudioAttributesCompatParcelizer(), -1077928375);
    }

    @Override // o.parseAlignment.AudioAttributesCompatParcelizer
    public final void addMenuProvider() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -778614816, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 778614905);
    }

    @Override // o.parseAlignment.write
    public final void addOnMultiWindowModeChangedListener() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -701553653, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 701553691);
    }

    @Override // o.parseAlignment.write
    public final void AudioAttributesImplApi26Parcelizer(String p0) {
        write(new Object[]{this, p0}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1114911959, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1114912008);
    }

    @Override // o.parseAlignment.write
    public final void RemoteActionCompatParcelizer(float p0, int p1) {
        write(new Object[]{this, Float.valueOf(p0), Integer.valueOf(p1)}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1657366988, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1657366933);
    }

    @Override // o.parseAlignment.write
    public final void addOnConfigurationChangedListener() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1948436476, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1948436422);
    }

    @Override // o.parseAlignment.write
    public final void addOnNewIntentListener() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -838910690, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 838910768);
    }

    @Override // o.parseAlignment.write
    public final void MediaBrowserCompatItemReceiver(int p0) {
        write(new Object[]{this, Integer.valueOf(p0)}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1257723532, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1257723577);
    }

    @Override // o.parseAlignment.write
    public final void MediaBrowserCompatItemReceiver(String p0) {
        write(new Object[]{this, p0}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 334200927, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -334200870);
    }

    @Override // o.parseAlignment.write
    public final void IconCompatParcelizer(String p0, boolean p1, int p2, SubtitleDecoderFactory1 p3, List<? extends LessonTabItem<?>> p4, ActiveRecallQbankLessonUiModel p5) {
        write(new Object[]{this, p0, Boolean.valueOf(p1), Integer.valueOf(p2), p3, p4, p5}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1783904463, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1783904562);
    }

    @Override // o.parseAlignment.write
    public final void RemoteActionCompatParcelizer(String p0, boolean p1) {
        write(new Object[]{this, p0, Boolean.valueOf(p1)}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1011326420, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1011326440);
    }

    @Override // o.parseAlignment.write
    public final void AudioAttributesImplBaseParcelizer(int p0) {
        write(new Object[]{this, Integer.valueOf(p0)}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 509456410, OnFailureListener.AudioAttributesCompatParcelizer(), 2050278001, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OnFailureListener.AudioAttributesCompatParcelizer(), -2050277967);
    }

    @Override // o.parseAlignment.write
    public final void onMenuItemSelected() {
        write(new Object[]{this}, OnFailureListener.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1658644292, OnFailureListener.AudioAttributesCompatParcelizer(), OnFailureListener.AudioAttributesCompatParcelizer(), -1658644287);
    }

    @Override // o.parseAlignment.write
    public final void onConfigurationChanged() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1202535627, OnFailureListener.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1202535674);
    }

    @Override // o.parseAlignment.write
    public final void IconCompatParcelizer(MaxDownloadReachedArgs p0) {
        write(new Object[]{this, p0}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1151710955, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1151710869);
    }

    @Override // o.parseAlignment.write
    public final void MediaBrowserCompatMediaItem(String p0) {
        write(new Object[]{this, p0}, (((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getInteger(R.integer.m3c_window_layout_in_display_cutout_mode) & (-3)) + 1630976113, OnFailureListener.AudioAttributesCompatParcelizer(), -313573919, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion - 1647279587, 313573986);
    }

    @Override // o.parseAlignment.write
    public final void onNewIntent() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 19973707, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -19973684);
    }

    @Override // o.parseAlignment.write
    public final void onRequestPermissionsResult() {
        write(new Object[]{this}, OnFailureListener.AudioAttributesCompatParcelizer(), OnFailureListener.AudioAttributesCompatParcelizer(), -2146394596, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.mtrl_picker_date_header_selected).substring(0, 4).codePointAt(0) + 1489047626, 2146394697);
    }

    @Override // o.parseAlignment.write
    public final void onTrimMemory() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -155204804, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 155204837);
    }

    @Override // o.parseAlignment.write
    public final void removeOnConfigurationChangedListener() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 270062411, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -270062407);
    }

    @Override // o.parseAlignment.write
    public final void RatingCompat(String p0) {
        write(new Object[]{this, p0}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -281326529, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 281326610);
    }

    @Override // o.parseAlignment.write
    public final void removeOnContextAvailableListener() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 385860542, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -385860513);
    }

    @Override // o.parseAlignment.write
    public final void removeOnMultiWindowModeChangedListener() {
        write(new Object[]{this}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1152813589, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1152813495);
    }

    @Override // o.parseAlignment.RemoteActionCompatParcelizer
    public final void write(String p0, String p1) {
        write(new Object[]{this, p0, p1}, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 2031924945, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getResources().getString(R.string.exo_item_list).substring(0, 4).length() - 63844989, -2083354701, OnFailureListener.AudioAttributesCompatParcelizer(), ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getApplicationInfo().targetSdkVersion + 1789382153, 2083354807);
    }

    @Override // o.parseAlignment.write
    public final void AudioAttributesImplApi26Parcelizer(int p0) {
        write(new Object[]{this, Integer.valueOf(p0)}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1278118158, ((Context) Class.forName("android.app.ActivityThread").getMethod("currentApplication", new Class[0]).invoke(null, null)).getApplicationContext().getPackageName().length() - 1872430090, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1278118211);
    }

    @Override // o.parseAlignment.write
    public final void AudioAttributesCompatParcelizer(boolean p0, int p1) {
        write(new Object[]{this, Boolean.valueOf(p0), Integer.valueOf(p1)}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -976407613, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 976407709);
    }

    @Override // o.parseAlignment.write
    public final void write(String p0, int p1, String p2) {
        write(new Object[]{this, p0, Integer.valueOf(p1), p2}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -894037033, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 894037133);
    }

    static void removeOnUserLeaveHintListener() {
        onSetRepeatMode = 1606770035;
        onSetShuffleMode = -819363102;
        onSetPlaybackSpeed = 587376581;
        onSetRating = new byte[]{-65, 67, -76, -98, 97, -65, 70, -74, 77, -111, -110, 12, -77, -10, 125, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -70, 79, -77, 66, -65, -68, TarConstants.LF_GNUTYPE_LONGLINK, -92, 89, 72, 69, -76, -72, 66, -80, -76, TarConstants.LF_GNUTYPE_LONGLINK, 68, -67, -93, 108, -78, -68, 68, -70, 66, -90, -107, -92, 9, -73, -72, -124, 125, TarConstants.LF_GNUTYPE_LONGNAME, 77, 74, -71, 65, -70, 72, -79, 66, -92, 73, 77, 74, TarConstants.LF_GNUTYPE_LONGLINK, -73, -104, 122, -79, -66, 68, -73, 74, -91, 72, -102, -74, -76, TarConstants.LF_GNUTYPE_LONGLINK, -79, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -102, 98, 72, -74, 74, -104, -77, 122, -126, 73, -74, 73, 101, -102, 121, -103, 72, 100, -74, -123, -76, 122, 73, -126, TarConstants.LF_GNUTYPE_LONGNAME, 102, 73, -74, -101, -79, 74, -75, 101, -74, 74, -74, 74, -127, TarConstants.LF_GNUTYPE_LONGNAME, 101, -77, 121, -121, 101, 73, 72, -103, -76, -74, TarConstants.LF_GNUTYPE_LONGNAME, -65, -74, TarConstants.LF_GNUTYPE_LONGNAME, TarConstants.LF_GNUTYPE_LONGLINK, -66, 123, -124, 124, -75, -73, -75, -100, 72, -65, 74, -74, 123, -124, 102, -103, -77, -73, 73, TarConstants.LF_GNUTYPE_LONGNAME, 73, -66, 72, -73, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -98, -78, TarConstants.LF_GNUTYPE_LONGLINK, -75, 74, 111, TarConstants.LF_GNUTYPE_LONGLINK, -77, -100, 101, -124, -74, 121, 73, -102, -75, 72, 72, 97, -99, -80, 122, -73, -124, -77, 77, -76, -76, 66, -73, 98, -121, 124, -76, 73, -103, -78, 102, -99, 102, -114, 74, 73, TarConstants.LF_PAX_GLOBAL_EXTENDED_HEADER, -98, -69, 65, -76, 73, -75, -80, 112, -103, 101, -103, -68, TarConstants.LF_GNUTYPE_LONGLINK, -73, 72, TarConstants.LF_GNUTYPE_LONGLINK, 72, 98, -122, 72, -74, 66, -101, 108, 66, -91, -82, TarConstants.LF_PAX_EXTENDED_HEADER_LC, -78, -68, 66, -79, -66, -74, TarConstants.LF_GNUTYPE_LONGNAME, -73, -73, -73, -73, -73, -73, -73, -73, -73};
        onSkipToQueueItem = 1000326333;
    }

    private static /* synthetic */ Object onCustomAction(Object[] objArr) {
        Context context = (Context) objArr[0];
        String str = (String) objArr[1];
        boolean zBooleanValue = ((Boolean) objArr[2]).booleanValue();
        boolean zBooleanValue2 = ((Boolean) objArr[3]).booleanValue();
        boolean zBooleanValue3 = ((Boolean) objArr[4]).booleanValue();
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = (((i2 & (-34)) | ((~i2) & 33)) - (~(-(-((i2 & 33) << 1))))) - 1;
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        Intent intentAudioAttributesCompatParcelizer = Companion.AudioAttributesCompatParcelizer(context, str, zBooleanValue, zBooleanValue2, zBooleanValue3, true);
        int i5 = onSkipToNext;
        int i6 = i5 & 63;
        int i7 = i6 + ((i5 ^ 63) | i6);
        setSessionImpl = i7 % 128;
        int i8 = i7 % 2;
        return intentAudioAttributesCompatParcelizer;
    }

    private static /* synthetic */ Object handleMediaPlayPauseIfPendingOnHandler(Object[] objArr) {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = ((i2 | 125) << 1) - (i2 ^ 125);
        onSkipToNext = i3 % 128;
        return Boolean.valueOf(i3 % 2 == 0);
    }

    private static /* synthetic */ Object onFastForward(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        String str = (String) objArr[1];
        Bundle bundle = (Bundle) objArr[2];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 59;
        int i4 = (i3 - (~(-(-((i2 ^ 59) | i3))))) - 1;
        onSkipToNext = i4 % 128;
        int i5 = i4 % 2;
        MediaDescriptionCompat(lessonVideoActivity, str, bundle);
        if (i5 == 0) {
            return null;
        }
        int i6 = 89 / 0;
        return null;
    }

    private static /* synthetic */ Object onPrepare(Object[] objArr) {
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 & 57;
        int i4 = (i3 - (~((i2 ^ 57) | i3))) - 1;
        int i5 = i4 % 128;
        onSkipToNext = i5;
        if (i4 % 2 != 0) {
            int i6 = 48 / 0;
        }
        int i7 = i5 + 5;
        setSessionImpl = i7 % 128;
        int i8 = i7 % 2;
        return Integer.valueOf(R.layout.activity_lesson_video);
    }

    private static /* synthetic */ Object ResultReceiver(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        View view = (View) objArr[1];
        WindowInsetsCompat windowInsetsCompat = (WindowInsetsCompat) objArr[2];
        int i = 2 % 2;
        int i2 = setSessionImpl + 57;
        onSkipToNext = i2 % 128;
        int i3 = i2 % 2;
        WindowInsetsCompat windowInsetsCompatAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(lessonVideoActivity, view, windowInsetsCompat);
        int i4 = setSessionImpl;
        int i5 = i4 & 5;
        int i6 = ((i4 ^ 5) | i5) << 1;
        int i7 = -((i4 | 5) & (~i5));
        int i8 = (i6 ^ i7) + ((i7 & i6) << 1);
        onSkipToNext = i8 % 128;
        int i9 = i8 % 2;
        return windowInsetsCompatAudioAttributesCompatParcelizer;
    }

    private static /* synthetic */ Object _init_lambda5(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = ((i2 ^ 58) + ((i2 & 58) << 1)) - 1;
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        getShowPopup getshowpopup = (getShowPopup) write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1195657873, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1195657888);
        int i5 = setSessionImpl;
        int i6 = i5 ^ 37;
        int i7 = ((i5 & 37) | i6) << 1;
        int i8 = -i6;
        int i9 = (i7 ^ i8) + ((i7 & i8) << 1);
        onSkipToNext = i9 % 128;
        int i10 = i9 % 2;
        return getshowpopup;
    }

    private static /* synthetic */ Object accessaddObserverForBackInvoker(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = ((i2 | 53) << 1) - (i2 ^ 53);
        onSkipToNext = i3 % 128;
        int i4 = i3 % 2;
        handleMediaPlayPauseIfPendingOnHandler(lessonVideoActivity);
        int i5 = onSkipToNext + 19;
        setSessionImpl = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 97 / 0;
        }
        return null;
    }

    private static /* synthetic */ Object addMenuProvider(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        ActivityResult activityResult = (ActivityResult) objArr[1];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = (i2 & 11) + (i2 | 11);
        onSkipToNext = i3 % 128;
        if (i3 % 2 != 0) {
            write(new Object[]{lessonVideoActivity, activityResult}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1114677816, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1114677705);
            int i4 = 20 / 0;
            return null;
        }
        write(new Object[]{lessonVideoActivity, activityResult}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1114677816, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1114677705);
        return null;
    }

    private static /* synthetic */ Object addContentView(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = onSkipToNext;
        int i3 = ((i2 ^ 118) + ((i2 & 118) << 1)) - 1;
        setSessionImpl = i3 % 128;
        int i4 = i3 % 2;
        getShowPopup getshowpopup = (getShowPopup) write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -1038952842, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 1038952919);
        int i5 = onSkipToNext;
        int i6 = i5 & 57;
        int i7 = (i5 ^ 57) | i6;
        int i8 = (i6 & i7) + (i7 | i6);
        setSessionImpl = i8 % 128;
        if (i8 % 2 != 0) {
            return getshowpopup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }

    private static /* synthetic */ Object onMultiWindowModeChanged(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl + 1;
        onSkipToNext = i2 % 128;
        int i3 = i2 % 2;
        write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -339929076, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 339929167);
        int i4 = setSessionImpl;
        int i5 = i4 ^ 123;
        int i6 = -(-((i4 & 123) << 1));
        int i7 = (i5 & i6) + (i6 | i5);
        onSkipToNext = i7 % 128;
        int i8 = i7 % 2;
        return null;
    }

    private static /* synthetic */ Object onPreparePanel(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        maybeSkipWhitespace maybeskipwhitespace = (maybeSkipWhitespace) objArr[1];
        int iIntValue = ((Number) objArr[2]).intValue();
        int iIntValue2 = ((Number) objArr[3]).intValue();
        maybeSkipComment maybeskipcomment = (maybeSkipComment) objArr[4];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 | 121;
        int i4 = i3 << 1;
        int i5 = -((~(i2 & 121)) & i3);
        int i6 = ((i4 | i5) << 1) - (i5 ^ i4);
        onSkipToNext = i6 % 128;
        int i7 = i6 % 2;
        RemoteActionCompatParcelizer(lessonVideoActivity, maybeskipwhitespace, iIntValue, iIntValue2, maybeskipcomment);
        int i8 = setSessionImpl;
        int i9 = (i8 | 105) << 1;
        int i10 = -(((~i8) & 105) | (i8 & (-106)));
        int i11 = (i9 ^ i10) + ((i10 & i9) << 1);
        onSkipToNext = i11 % 128;
        if (i11 % 2 == 0) {
            return null;
        }
        throw null;
    }

    private static /* synthetic */ Object onPictureInPictureModeChanged(Object[] objArr) {
        LessonVideoActivity lessonVideoActivity = (LessonVideoActivity) objArr[0];
        int i = 2 % 2;
        int i2 = setSessionImpl;
        int i3 = i2 | 67;
        int i4 = (i3 << 1) - ((~(i2 & 67)) & i3);
        onSkipToNext = i4 % 128;
        int i5 = i4 % 2;
        getShowPopup getshowpopup = (getShowPopup) write(new Object[]{lessonVideoActivity}, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), -682790792, OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), OfflineLicenseHelper$$ExternalSyntheticLambda4.AudioAttributesCompatParcelizer(), 682790867);
        int i6 = onSkipToNext;
        int i7 = i6 & 35;
        int i8 = i7 + ((i6 ^ 35) | i7);
        setSessionImpl = i8 % 128;
        if (i8 % 2 != 0) {
            return getshowpopup;
        }
        Object obj = null;
        obj.hashCode();
        throw null;
    }
}
