package kotlin;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import com.clevertap.android.sdk.CleverTapInstanceConfig;
import com.clevertap.android.sdk.pushnotification.CTNotificationIntentService;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import kotlin.MediaSourceListForwardingEventListenerExternalSyntheticLambda1;
import kotlin.MediaSourceListForwardingEventListenerExternalSyntheticLambda2;
import kotlin.Metadata;
import kotlin._coercedTypeDesc;
import kotlin.copyWithTimeline;
import kotlin.onUpstreamDiscarded;
import org.apache.commons.compress.archivers.tar.TarConstants;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0096\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010%\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 \u001f2\u00020\u00012\u00020\u0002:\u0002\u0014\u001fB\u0019\b\u0010\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\f\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\f\u0010\rJ9\u0010\u0014\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\n\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\n\u0010\u0017J\u0011\u0010\u0018\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J1\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u001f\u0010\u0014\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00122\u0006\u0010\u0006\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0014\u0010\u001cJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u001dJ\u0019\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\u001f\u0010 J/\u0010\f\u001a\u00020\u000e2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0016¢\u0006\u0004\b\f\u0010!J)\u0010\u0014\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0014\u0010\bJ\u0017\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u0004\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001a\u0010\"J=\u0010\u001f\u001a\u00020\u000e2\b\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u000e2\b\u0010\u0013\u001a\u0004\u0018\u00010#H\u0016¢\u0006\u0004\b\u001f\u0010$J7\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020&0%2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010#H\u0000¢\u0006\u0004\b\u001f\u0010'J1\u0010\f\u001a\u0004\u0018\u00010)2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020(2\u0006\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u0011\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\f\u0010*R\u0018\u0010\n\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b+\u0010,R\u0018\u0010\u0014\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b.\u0010/R$\u0010\u001a\u001a\u0004\u0018\u00010\t8\u0001@\u0001X\u0080\u000e¢\u0006\u0012\n\u0004\b0\u0010,\u001a\u0004\b1\u0010\u001d\"\u0004\b\u001a\u00102R\u001e\u0010\f\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b3\u0010,\u001a\u0004\b+\u0010\u001dR\u001e\u0010\u001f\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b4\u0010,\u001a\u0004\b5\u0010\u001dR\u001e\u00108\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b6\u0010,\u001a\u0004\b7\u0010\u001dR\u001e\u0010;\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b9\u0010,\u001a\u0004\b:\u0010\u001dR\u001c\u0010>\u001a\u00020\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b<\u0010,\u001a\u0004\b=\u0010\u001dR\u001e\u0010A\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b?\u0010,\u001a\u0004\b@\u0010\u001dR\u001e\u0010D\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bB\u0010,\u001a\u0004\bC\u0010\u001dR\u001e\u0010G\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bE\u0010,\u001a\u0004\bF\u0010\u001dR$\u0010:\u001a\n\u0012\u0004\u0012\u00020I\u0018\u00010H8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b;\u0010J\u001a\u0004\b>\u0010KR$\u00109\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010H8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b8\u0010J\u001a\u0004\b;\u0010KR$\u0010L\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010H8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b>\u0010J\u001a\u0004\bA\u0010KR$\u0010=\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010H8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bM\u0010J\u001a\u0004\bN\u0010KR$\u0010O\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010H8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b=\u0010J\u001a\u0004\bL\u0010KR\u001e\u0010<\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bP\u0010,\u001a\u0004\b6\u0010\u001dR\u001e\u0010S\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bQ\u0010,\u001a\u0004\bR\u0010\u001dR\u001e\u0010T\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bG\u0010,\u001a\u0004\bG\u0010\u001dR\u001e\u0010F\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b@\u0010,\u001a\u0004\bB\u0010\u001dR\u001e\u0010E\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bU\u0010,\u001a\u0004\bQ\u0010\u001dR\u001c\u0010Z\u001a\u00020\u00128\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bV\u0010W\u001a\u0004\bX\u0010YR\"\u0010[\u001a\u00020\u00128\u0001@\u0001X\u0081\u000e¢\u0006\u0012\n\u0004\b[\u0010W\u001a\u0004\bS\u0010Y\"\u0004\b\f\u0010\\R\u0016\u0010_\u001a\u00020]8\u0000@\u0000X\u0081\f¢\u0006\u0006\n\u0004\b\n\u0010^R\u001c\u00107\u001a\u00020\u00128\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b`\u0010W\u001a\u0004\b4\u0010YR\u001e\u00106\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bC\u0010,\u001a\u0004\b_\u0010\u001dR\u001e\u0010C\u001a\u0004\u0018\u00010\t8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b5\u0010,\u001a\u0004\b[\u0010\u001dR\u001e\u00105\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bR\u0010,\u001a\u0004\bT\u0010\u001dR\u001e\u0010+\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b_\u0010,\u001a\u0004\b<\u0010\u001dR\u001c\u0010R\u001a\u00020\u00128\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\ba\u0010W\u001a\u0004\bb\u0010YR\u0018\u0010d\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bc\u0010,R\u0018\u00103\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\be\u0010,R\u0018\u0010g\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bf\u0010,R\u0018\u0010e\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bT\u0010,R\u0018\u0010B\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bO\u0010,R\u001e\u0010f\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bX\u0010,\u001a\u0004\b3\u0010\u001dR\u001e\u0010P\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bd\u0010,\u001a\u0004\bZ\u0010\u001dR\u001e\u00104\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bb\u0010,\u001a\u0004\be\u0010\u001dR\u001e\u0010Q\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b1\u0010,\u001a\u0004\bf\u0010\u001dR\u001e\u0010b\u001a\u0004\u0018\u00010h8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bN\u0010i\u001a\u0004\bg\u0010jR\u0018\u0010\u0018\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bS\u0010,R\u001e\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010H8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bF\u0010JR\u001e\u0010@\u001a\u0004\u0018\u00010#8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\bA\u0010k\u001a\u0004\bD\u0010lR\"\u0010N\u001a\b\u0012\u0004\u0012\u00020&0%8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\f\u0010m\u001a\u0004\b\u001f\u0010nR(\u00101\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020)0o8\u0007@\u0006X\u0087\f¢\u0006\f\n\u0004\b\u0014\u0010p\u001a\u0004\b\u0014\u0010qR\u001e\u00100\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\br\u0010,\u001a\u0004\bP\u0010\u001dR\u0018\u0010U\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bL\u0010,R\u001c\u0010`\u001a\u00020\u00128\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b7\u0010W\u001a\u0004\bO\u0010YR\u0018\u0010r\u001a\u0004\u0018\u00010\u001e8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bZ\u0010sR\u001e\u0010a\u001a\u0004\u0018\u00010\t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bg\u0010,\u001a\u0004\bE\u0010\u001dR\u001c\u0010M\u001a\u00020t8\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b\u0018\u0010u\u001a\u0004\bd\u0010vR\u001e\u0010.\u001a\u0004\u0018\u00010\u00108\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\bD\u0010w\u001a\u0004\b8\u0010xR\u001c\u0010c\u001a\u00020\u00128\u0001@\u0000X\u0081\f¢\u0006\f\n\u0004\b:\u0010W\u001a\u0004\b9\u0010Y"}, d2 = {"Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda4;", "Lo/getAdCountInAdGroup;", "Lo/setAvailableCommands;", "Landroid/content/Context;", "p0", "Landroid/os/Bundle;", "p1", "<init>", "(Landroid/content/Context;Landroid/os/Bundle;)V", "", "AudioAttributesCompatParcelizer", "(Landroid/os/Bundle;)Ljava/lang/String;", "RemoteActionCompatParcelizer", "(Landroid/os/Bundle;Landroid/content/Context;)Ljava/lang/String;", "Lo/_coercedTypeDesc$AudioAttributesImplBaseParcelizer;", "p2", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "p3", "", "p4", "write", "(Landroid/os/Bundle;Landroid/content/Context;Lo/_coercedTypeDesc$AudioAttributesImplBaseParcelizer;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;I)Lo/_coercedTypeDesc$AudioAttributesImplBaseParcelizer;", "", "(Landroid/content/Context;)V", "onStop", "()Ljava/lang/Integer;", "IconCompatParcelizer", "(Landroid/content/Context;Landroid/os/Bundle;ILjava/lang/Integer;)V", "(ILandroid/content/Context;)V", "()Ljava/lang/String;", "", "read", "(Landroid/os/Bundle;)Ljava/lang/Object;", "(Landroid/content/Context;Landroid/os/Bundle;Lo/_coercedTypeDesc$AudioAttributesImplBaseParcelizer;Lcom/clevertap/android/sdk/CleverTapInstanceConfig;)Lo/_coercedTypeDesc$AudioAttributesImplBaseParcelizer;", "(Landroid/os/Bundle;)V", "Lorg/json/JSONArray;", "(Landroid/content/Context;Landroid/os/Bundle;ILo/_coercedTypeDesc$AudioAttributesImplBaseParcelizer;Lorg/json/JSONArray;)Lo/_coercedTypeDesc$AudioAttributesImplBaseParcelizer;", "", "Lo/onDrmSessionReleased;", "(Landroid/content/Context;Landroid/os/Bundle;ILorg/json/JSONArray;)Ljava/util/List;", "Lorg/json/JSONObject;", "Landroid/app/PendingIntent;", "(Landroid/content/Context;Lorg/json/JSONObject;Landroid/os/Bundle;I)Landroid/app/PendingIntent;", "onPrepareFromMediaId", "Ljava/lang/String;", "Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda2;", "r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM", "Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda2;", "PlaybackStateCompat", "onSkipToQueueItem", "(Ljava/lang/String;)V", "onRemoveQueueItemAt", "onSetShuffleMode", "onPrepareFromSearch", "onPlayFromSearch", "onFastForward", "AudioAttributesImplApi26Parcelizer", "MediaMetadataCompat", "RatingCompat", "MediaBrowserCompatItemReceiver", "handleMediaPlayPauseIfPendingOnHandler", "MediaBrowserCompatSearchResultReceiver", "AudioAttributesImplApi21Parcelizer", "r8lambdaKUbBm7ckfqTc9QCgukC86fguu4", "onSkipToPrevious", "AudioAttributesImplBaseParcelizer", "onRemoveQueueItem", "onPrepare", "MediaBrowserCompatCustomActionResultReceiver", "onPlayFromMediaId", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "MediaDescriptionCompat", "Ljava/util/ArrayList;", "Lo/onDrmSessionManagerError;", "Ljava/util/ArrayList;", "()Ljava/util/ArrayList;", "MediaBrowserCompatMediaItem", "r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw", "onSkipToNext", "onCommand", "onSetRating", "onSetCaptioningEnabled", "onPlayFromUri", "onAddQueueItem", "onCustomAction", "MediaSessionCompatResultReceiverWrapper", "ResultReceiver", "I", "setSessionImpl", "()I", "onPause", "onPlay", "(I)V", "", "Z", "onMediaButtonEvent", "MediaSessionCompatQueueItem", "ParcelableVolumeInfo", "onSetPlaybackSpeed", "PlaybackStateCompatCustomAction", "onSeekTo", "onRewind", "onSetRepeatMode", "onPrepareFromUri", "Landroid/graphics/Bitmap;", "Landroid/graphics/Bitmap;", "()Landroid/graphics/Bitmap;", "Lorg/json/JSONArray;", "()Lorg/json/JSONArray;", "Ljava/util/List;", "()Ljava/util/List;", "", "Ljava/util/Map;", "()Ljava/util/Map;", "MediaSessionCompatToken", "Ljava/lang/Object;", "Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda1;", "Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda1;", "()Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda1;", "Lcom/clevertap/android/sdk/CleverTapInstanceConfig;", "()Lcom/clevertap/android/sdk/CleverTapInstanceConfig;"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class MediaSourceListForwardingEventListenerExternalSyntheticLambda4 implements getAdCountInAdGroup, setAvailableCommands {

    /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: from kotlin metadata */
    public boolean onMediaButtonEvent;

    /* JADX INFO: renamed from: AudioAttributesImplApi21Parcelizer, reason: from kotlin metadata */
    private ArrayList<String> MediaBrowserCompatMediaItem;

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from kotlin metadata */
    private ArrayList<String> MediaMetadataCompat;

    /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
    private JSONArray onSkipToPrevious;

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from kotlin metadata */
    private CleverTapInstanceConfig r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;

    /* JADX INFO: renamed from: MediaBrowserCompatItemReceiver, reason: from kotlin metadata */
    private ArrayList<onDrmSessionManagerError> RatingCompat;

    /* JADX INFO: renamed from: MediaBrowserCompatMediaItem, reason: from kotlin metadata */
    private String MediaSessionCompatResultReceiverWrapper;

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from kotlin metadata */
    private ArrayList<String> onCommand;

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from kotlin metadata */
    private ArrayList<Integer> setSessionImpl;

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from kotlin metadata */
    private String onCustomAction;

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from kotlin metadata */
    private String MediaBrowserCompatItemReceiver;

    /* JADX INFO: renamed from: MediaSessionCompatQueueItem, reason: from kotlin metadata */
    private int onFastForward;

    /* JADX INFO: renamed from: MediaSessionCompatResultReceiverWrapper, reason: from kotlin metadata */
    private String onPlayFromMediaId;

    /* JADX INFO: renamed from: MediaSessionCompatToken, reason: from kotlin metadata */
    private String PlaybackStateCompat;

    /* JADX INFO: renamed from: ParcelableVolumeInfo, reason: from kotlin metadata */
    private int onPlayFromUri;

    /* JADX INFO: renamed from: PlaybackStateCompat, reason: from kotlin metadata */
    private String IconCompatParcelizer;

    /* JADX INFO: renamed from: PlaybackStateCompatCustomAction, reason: from kotlin metadata */
    private String onSeekTo;

    /* JADX INFO: renamed from: RatingCompat, reason: from kotlin metadata */
    private int PlaybackStateCompatCustomAction;

    /* JADX INFO: renamed from: RemoteActionCompatParcelizer, reason: from kotlin metadata */
    private List<onDrmSessionReleased> onSkipToNext;

    /* JADX INFO: renamed from: ResultReceiver, reason: from kotlin metadata */
    private int onPause;

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from kotlin metadata */
    private String AudioAttributesImplApi21Parcelizer;

    /* JADX INFO: renamed from: onAddQueueItem, reason: from kotlin metadata */
    private String onStop;

    /* JADX INFO: renamed from: onCommand, reason: from kotlin metadata */
    private String onRemoveQueueItem;

    /* JADX INFO: renamed from: onCustomAction, reason: from kotlin metadata */
    private String onRewind;

    /* JADX INFO: renamed from: onFastForward, reason: from kotlin metadata */
    private int MediaSessionCompatQueueItem;

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from kotlin metadata */
    private String onPrepareFromMediaId;

    /* JADX INFO: renamed from: onPause, reason: from kotlin metadata */
    private Object MediaSessionCompatToken;
    private int onPlay;

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from kotlin metadata */
    private String MediaDescriptionCompat;

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from kotlin metadata */
    private String AudioAttributesImplApi26Parcelizer;

    /* JADX INFO: renamed from: onPlayFromUri, reason: from kotlin metadata */
    private String onPrepareFromSearch;

    /* JADX INFO: renamed from: onPrepare, reason: from kotlin metadata */
    private String onPlayFromSearch;

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from kotlin metadata */
    private String AudioAttributesCompatParcelizer;

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from kotlin metadata */
    private String onPrepare;

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from kotlin metadata */
    private String ParcelableVolumeInfo;

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from kotlin metadata */
    private String MediaBrowserCompatCustomActionResultReceiver;

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from kotlin metadata */
    private String RemoteActionCompatParcelizer;

    /* JADX INFO: renamed from: onRewind, reason: from kotlin metadata */
    private String onRemoveQueueItemAt;

    /* JADX INFO: renamed from: onSeekTo, reason: from kotlin metadata */
    private String onSetRating;

    /* JADX INFO: renamed from: onSetCaptioningEnabled, reason: from kotlin metadata */
    private String onAddQueueItem;

    /* JADX INFO: renamed from: onSetPlaybackSpeed, reason: from kotlin metadata */
    private String onSetShuffleMode;

    /* JADX INFO: renamed from: onSetRating, reason: from kotlin metadata */
    private String handleMediaPlayPauseIfPendingOnHandler;

    /* JADX INFO: renamed from: onSetRepeatMode, reason: from kotlin metadata */
    private String onPrepareFromUri;

    /* JADX INFO: renamed from: onSetShuffleMode, reason: from kotlin metadata */
    private String read;

    /* JADX INFO: renamed from: onSkipToNext, reason: from kotlin metadata */
    private Bitmap onSetPlaybackSpeed;

    /* JADX INFO: renamed from: onSkipToPrevious, reason: from kotlin metadata */
    private String MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;

    /* JADX INFO: renamed from: onSkipToQueueItem, reason: from kotlin metadata */
    private String onSetCaptioningEnabled;

    /* JADX INFO: renamed from: onStop, reason: from kotlin metadata */
    private MediaSourceListForwardingEventListenerExternalSyntheticLambda1 r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;

    /* JADX INFO: renamed from: r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw, reason: from kotlin metadata */
    private ArrayList<String> MediaBrowserCompatSearchResultReceiver;

    /* JADX INFO: renamed from: r8lambdaKUbBm7ckfqTc9QCgukC86fguu4, reason: from kotlin metadata */
    private String AudioAttributesImplBaseParcelizer;

    /* JADX INFO: renamed from: r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM, reason: from kotlin metadata */
    private MediaSourceListForwardingEventListenerExternalSyntheticLambda2 write;

    /* JADX INFO: renamed from: setSessionImpl, reason: from kotlin metadata */
    private String onSetRepeatMode;

    /* JADX INFO: renamed from: write, reason: from kotlin metadata */
    private Map<String, PendingIntent> onSkipToQueueItem;
    private static final byte[] $$a = {112, 17, 101, TarConstants.LF_CONTIG, 11, -3, -64, TarConstants.LF_BLK, 8, -8, 16, -18, 12, 1, -20, 14, -67, TarConstants.LF_SYMLINK, 12, -11, 13, -4, -7, -6, -55, 68, -16, 6, -62, 65, 4, -3, -12, 5, 0, 4, -12, -4, 2, -7, -3, 18, -12, 5, -2, -65, 20, 16, -7, 32, 4, -12, -4, 2, -7, -3, 18, -12, 5, -2, -38, 36, 5, -16, 8, 5, -34, 17, 12, 3, -14, -7, 1};
    private static final int $$b = 9;

    /* JADX INFO: renamed from: read, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static int IconCompatParcelizer = write.IconCompatParcelizer.getWrite();

    /* JADX INFO: loaded from: classes2.dex */
    public final /* synthetic */ class AudioAttributesCompatParcelizer {
        public static final /* synthetic */ int[] IconCompatParcelizer;

        static {
            int[] iArr = new int[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.values().length];
            try {
                iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.write.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.IconCompatParcelizer.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.MediaBrowserCompatItemReceiver.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.AudioAttributesImplApi21Parcelizer.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.AudioAttributesCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.AudioAttributesImplApi26Parcelizer.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.MediaBrowserCompatMediaItem.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.AudioAttributesImplBaseParcelizer.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[MediaSourceListForwardingEventListenerExternalSyntheticLambda2.RemoteActionCompatParcelizer.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            IconCompatParcelizer = iArr;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0027  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x001f  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0027 -> B:11:0x002b). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static void a(int r5, int r6, int r7, java.lang.Object[] r8) {
        /*
            byte[] r0 = kotlin.MediaSourceListForwardingEventListenerExternalSyntheticLambda4.$$a
            int r7 = r7 * 3
            int r7 = r7 + 4
            int r6 = r6 * 2
            int r6 = 99 - r6
            int r5 = r5 * 3
            int r1 = r5 + 70
            byte[] r1 = new byte[r1]
            int r5 = r5 + 69
            r2 = 0
            if (r0 != 0) goto L19
            r4 = r6
            r3 = r2
            r6 = r5
            goto L2b
        L19:
            r3 = r2
        L1a:
            byte r4 = (byte) r6
            r1[r3] = r4
            if (r3 != r5) goto L27
            java.lang.String r5 = new java.lang.String
            r5.<init>(r1, r2)
            r8[r2] = r5
            return
        L27:
            int r3 = r3 + 1
            r4 = r0[r7]
        L2b:
            int r6 = r6 + r4
            int r6 = r6 + 1
            int r7 = r7 + 1
            goto L1a
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MediaSourceListForwardingEventListenerExternalSyntheticLambda4.a(int, int, int, java.lang.Object[]):void");
    }

    public final void IconCompatParcelizer(String str) {
        this.IconCompatParcelizer = str;
    }

    /* JADX INFO: renamed from: onSkipToQueueItem, reason: from getter */
    public final String getIconCompatParcelizer() {
        return this.IconCompatParcelizer;
    }

    /* JADX INFO: renamed from: onPrepareFromMediaId, reason: from getter */
    public final String getRemoteActionCompatParcelizer() {
        return this.RemoteActionCompatParcelizer;
    }

    /* JADX INFO: renamed from: onPrepareFromSearch, reason: from getter */
    public final String getRead() {
        return this.read;
    }

    /* JADX INFO: renamed from: onFastForward, reason: from getter */
    public final String getAudioAttributesImplApi26Parcelizer() {
        return this.AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: renamed from: RatingCompat, reason: from getter */
    public final String getMediaBrowserCompatItemReceiver() {
        return this.MediaBrowserCompatItemReceiver;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatSearchResultReceiver, reason: from getter */
    public final String getAudioAttributesImplApi21Parcelizer() {
        return this.AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: renamed from: onSkipToPrevious, reason: from getter */
    public final String getAudioAttributesImplBaseParcelizer() {
        return this.AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: renamed from: onPrepare, reason: from getter */
    public final String getMediaBrowserCompatCustomActionResultReceiver() {
        return this.MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: renamed from: MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver, reason: from getter */
    public final String getMediaDescriptionCompat() {
        return this.MediaDescriptionCompat;
    }

    public final ArrayList<onDrmSessionManagerError> AudioAttributesImplApi21Parcelizer() {
        return this.RatingCompat;
    }

    public final ArrayList<String> MediaBrowserCompatItemReceiver() {
        return this.MediaMetadataCompat;
    }

    public final ArrayList<String> AudioAttributesImplBaseParcelizer() {
        return this.MediaBrowserCompatMediaItem;
    }

    public final ArrayList<String> onSkipToNext() {
        return this.MediaBrowserCompatSearchResultReceiver;
    }

    public final ArrayList<String> MediaBrowserCompatMediaItem() {
        return this.onCommand;
    }

    /* JADX INFO: renamed from: onPlayFromSearch, reason: from getter */
    public final String getHandleMediaPlayPauseIfPendingOnHandler() {
        return this.handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: renamed from: onPlayFromUri, reason: from getter */
    public final String getOnAddQueueItem() {
        return this.onAddQueueItem;
    }

    /* JADX INFO: renamed from: MediaDescriptionCompat, reason: from getter */
    public final String getOnCustomAction() {
        return this.onCustomAction;
    }

    /* JADX INFO: renamed from: onRemoveQueueItem, reason: from getter */
    public final String getMediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver() {
        return this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    /* JADX INFO: renamed from: onSetCaptioningEnabled, reason: from getter */
    public final String getOnPlayFromMediaId() {
        return this.onPlayFromMediaId;
    }

    /* JADX INFO: renamed from: setSessionImpl, reason: from getter */
    public final int getOnPause() {
        return this.onPause;
    }

    public final void RemoteActionCompatParcelizer(int i) {
        this.onPlay = i;
    }

    /* JADX INFO: renamed from: onAddQueueItem, reason: from getter */
    public final int getOnPlay() {
        return this.onPlay;
    }

    /* JADX INFO: renamed from: onSetShuffleMode, reason: from getter */
    public final int getOnFastForward() {
        return this.onFastForward;
    }

    /* JADX INFO: renamed from: onMediaButtonEvent, reason: from getter */
    public final String getOnPlayFromSearch() {
        return this.onPlayFromSearch;
    }

    /* JADX INFO: renamed from: onPlay, reason: from getter */
    public final String getOnPrepare() {
        return this.onPrepare;
    }

    /* JADX INFO: renamed from: onCustomAction, reason: from getter */
    public final String getOnPrepareFromSearch() {
        return this.onPrepareFromSearch;
    }

    /* JADX INFO: renamed from: handleMediaPlayPauseIfPendingOnHandler, reason: from getter */
    public final String getOnPrepareFromMediaId() {
        return this.onPrepareFromMediaId;
    }

    /* JADX INFO: renamed from: onSetPlaybackSpeed, reason: from getter */
    public final int getOnPlayFromUri() {
        return this.onPlayFromUri;
    }

    /* JADX INFO: renamed from: onRemoveQueueItemAt, reason: from getter */
    public final String getOnSetRepeatMode() {
        return this.onSetRepeatMode;
    }

    /* JADX INFO: renamed from: onPause, reason: from getter */
    public final String getOnSetRating() {
        return this.onSetRating;
    }

    /* JADX INFO: renamed from: onRewind, reason: from getter */
    public final String getOnSetShuffleMode() {
        return this.onSetShuffleMode;
    }

    /* JADX INFO: renamed from: onSetRepeatMode, reason: from getter */
    public final String getOnSetCaptioningEnabled() {
        return this.onSetCaptioningEnabled;
    }

    /* JADX INFO: renamed from: onPrepareFromUri, reason: from getter */
    public final Bitmap getOnSetPlaybackSpeed() {
        return this.onSetPlaybackSpeed;
    }

    /* JADX INFO: renamed from: MediaBrowserCompatCustomActionResultReceiver, reason: from getter */
    public final JSONArray getOnSkipToPrevious() {
        return this.onSkipToPrevious;
    }

    public final List<onDrmSessionReleased> read() {
        return this.onSkipToNext;
    }

    public final Map<String, PendingIntent> write() {
        return this.onSkipToQueueItem;
    }

    /* JADX INFO: renamed from: onSetRating, reason: from getter */
    public final String getPlaybackStateCompat() {
        return this.PlaybackStateCompat;
    }

    /* JADX INFO: renamed from: onCommand, reason: from getter */
    public final int getMediaSessionCompatQueueItem() {
        return this.MediaSessionCompatQueueItem;
    }

    /* JADX INFO: renamed from: onPlayFromMediaId, reason: from getter */
    public final String getParcelableVolumeInfo() {
        return this.ParcelableVolumeInfo;
    }

    /* JADX INFO: renamed from: onSeekTo, reason: from getter */
    public final MediaSourceListForwardingEventListenerExternalSyntheticLambda1 getR8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw() {
        return this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw;
    }

    /* JADX INFO: renamed from: AudioAttributesImplApi26Parcelizer, reason: from getter */
    public final CleverTapInstanceConfig getR8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM() {
        return this.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM;
    }

    /* JADX INFO: renamed from: MediaMetadataCompat, reason: from getter */
    public final int getPlaybackStateCompatCustomAction() {
        return this.PlaybackStateCompatCustomAction;
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\b\n\u0002\b\n\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\n\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tj\u0002\b\u0006j\u0002\b\u000bj\u0002\b\fj\u0002\b\n"}, d2 = {"Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda4$write;", "", "", "p0", "<init>", "(Ljava/lang/String;II)V", "read", "()I", "AudioAttributesImplBaseParcelizer", "I", "write", "IconCompatParcelizer", "RemoteActionCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class write {
        private static final /* synthetic */ write[] AudioAttributesCompatParcelizer;

        /* JADX INFO: renamed from: AudioAttributesImplBaseParcelizer, reason: from kotlin metadata */
        private final int write;
        private static write read = new write("OFF", 0, -1);
        public static final write IconCompatParcelizer = new write("INFO", 1, 0);
        public static final write RemoteActionCompatParcelizer = new write("DEBUG", 2, 2);
        public static final write write = new write("VERBOSE", 3, 3);

        private write(String str, int i, int i2) {
            this.write = i2;
        }

        static {
            write[] writeVarArrWrite = write();
            AudioAttributesCompatParcelizer = writeVarArrWrite;
            getMagicModuleTimeline.IconCompatParcelizer(writeVarArrWrite);
        }

        /* JADX INFO: renamed from: read, reason: from getter */
        public final int getWrite() {
            return this.write;
        }

        public static write valueOf(String str) {
            return (write) Enum.valueOf(write.class, str);
        }

        public static write[] values() {
            return (write[]) AudioAttributesCompatParcelizer.clone();
        }

        private static final /* synthetic */ write[] write() {
            return new write[]{read, IconCompatParcelizer, RemoteActionCompatParcelizer, write};
        }
    }

    public MediaSourceListForwardingEventListenerExternalSyntheticLambda4(Context context, Bundle bundle) {
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        this.AudioAttributesImplApi21Parcelizer = "";
        this.onMediaButtonEvent = true;
        this.onSkipToNext = IntermediateLoginResponseBody.RemoteActionCompatParcelizer();
        this.onSkipToQueueItem = new LinkedHashMap();
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = MediaSourceListForwardingEventListenerExternalSyntheticLambda1.write;
        this.PlaybackStateCompatCustomAction = -1;
        write(context, bundle);
    }

    @Override // kotlin.getAdCountInAdGroup
    public final String AudioAttributesCompatParcelizer(Bundle p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.RemoteActionCompatParcelizer;
    }

    @Override // kotlin.getAdCountInAdGroup
    public final String RemoteActionCompatParcelizer(Bundle p0, Context p1) {
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        return this.IconCompatParcelizer;
    }

    @Override // kotlin.getAdCountInAdGroup
    public final _coercedTypeDesc.AudioAttributesImplBaseParcelizer write(Bundle p0, Context p1, _coercedTypeDesc.AudioAttributesImplBaseParcelizer p2, CleverTapInstanceConfig p3, int p4) {
        Integer numOnStop;
        toMagicModuleMetaRepoModel.write(p0, "");
        toMagicModuleMetaRepoModel.write(p1, "");
        toMagicModuleMetaRepoModel.write(p2, "");
        toMagicModuleMetaRepoModel.write(p3, "");
        if (this.AudioAttributesCompatParcelizer == null) {
            onDrmSessionAcquired.IconCompatParcelizer();
            return null;
        }
        this.PlaybackStateCompatCustomAction = p4;
        this.onSkipToNext = read(p1, p0, p4, this.onSkipToPrevious);
        MediaSourceListForwardingEventListenerExternalSyntheticLambda2 mediaSourceListForwardingEventListenerExternalSyntheticLambda2 = this.write;
        switch (mediaSourceListForwardingEventListenerExternalSyntheticLambda2 == null ? -1 : AudioAttributesCompatParcelizer.IconCompatParcelizer[mediaSourceListForwardingEventListenerExternalSyntheticLambda2.ordinal()]) {
            case 1:
                copyWithTimeline.Companion readVar = copyWithTimeline.INSTANCE;
                copyWithNewPosition copywithnewpositionWrite = copyWithTimeline.Companion.write(MediaSourceListForwardingEventListenerExternalSyntheticLambda2.write, this);
                if (copywithnewpositionWrite != null && copywithnewpositionWrite.read()) {
                    return new PercentageRatingExternalSyntheticLambda0(this).AudioAttributesCompatParcelizer(p1, p0, p4, p2);
                }
                return null;
            case 2:
                copyWithTimeline.Companion readVar2 = copyWithTimeline.INSTANCE;
                copyWithNewPosition copywithnewpositionWrite2 = copyWithTimeline.Companion.write(MediaSourceListForwardingEventListenerExternalSyntheticLambda2.IconCompatParcelizer, this);
                if (copywithnewpositionWrite2 != null && copywithnewpositionWrite2.read()) {
                    return new PercentageRating(this).AudioAttributesCompatParcelizer(p1, p0, p4, p2);
                }
                return null;
            case 3:
                copyWithTimeline.Companion readVar3 = copyWithTimeline.INSTANCE;
                copyWithNewPosition copywithnewpositionWrite3 = copyWithTimeline.Companion.write(MediaSourceListForwardingEventListenerExternalSyntheticLambda2.MediaBrowserCompatItemReceiver, this);
                if (copywithnewpositionWrite3 != null && copywithnewpositionWrite3.read()) {
                    return new createThrowable(this, p0).AudioAttributesCompatParcelizer(p1, p0, p4, p2);
                }
                return null;
            case 4:
                copyWithTimeline.Companion readVar4 = copyWithTimeline.INSTANCE;
                copyWithNewPosition copywithnewpositionWrite4 = copyWithTimeline.Companion.write(MediaSourceListForwardingEventListenerExternalSyntheticLambda2.AudioAttributesImplApi21Parcelizer, this);
                if (copywithnewpositionWrite4 != null && copywithnewpositionWrite4.read()) {
                    return new getErrorCodeName(this, p0).AudioAttributesCompatParcelizer(p1, p0, p4, p2);
                }
                return null;
            case 5:
                copyWithTimeline.Companion readVar5 = copyWithTimeline.INSTANCE;
                copyWithNewPosition copywithnewpositionWrite5 = copyWithTimeline.Companion.write(MediaSourceListForwardingEventListenerExternalSyntheticLambda2.AudioAttributesCompatParcelizer, this);
                if (copywithnewpositionWrite5 != null && copywithnewpositionWrite5.read()) {
                    getPercent getpercent = new getPercent(this, p0);
                    _coercedTypeDesc.AudioAttributesImplBaseParcelizer audioAttributesImplBaseParcelizerAudioAttributesCompatParcelizer = getpercent.AudioAttributesCompatParcelizer(p1, p0, p4, p2);
                    MediaSourceListMediaSourceAndListener mediaSourceListMediaSourceAndListenerRemoteActionCompatParcelizer = getpercent.RemoteActionCompatParcelizer();
                    toMagicModuleMetaRepoModel.read(mediaSourceListMediaSourceAndListenerRemoteActionCompatParcelizer, "");
                    if (((MetadataRetrieverMetadataRetrieverInternalMediaSourceHandlerCallbackMediaSourceCaller) mediaSourceListMediaSourceAndListenerRemoteActionCompatParcelizer).AudioAttributesImplBaseParcelizer() <= 2) {
                        MediaSourceListMediaSourceAndListener mediaSourceListMediaSourceAndListenerAudioAttributesCompatParcelizer = getpercent.AudioAttributesCompatParcelizer();
                        toMagicModuleMetaRepoModel.read(mediaSourceListMediaSourceAndListenerAudioAttributesCompatParcelizer, "");
                        if (((MetadataRetrieverMetadataRetrieverInternalMediaSourceHandlerCallbackMediaSourceCallerMediaPeriodCallback) mediaSourceListMediaSourceAndListenerAudioAttributesCompatParcelizer).MediaBrowserCompatCustomActionResultReceiver() <= 2) {
                            return audioAttributesImplBaseParcelizerAudioAttributesCompatParcelizer;
                        }
                    }
                    return null;
                }
                return null;
            case 6:
                copyWithTimeline.Companion readVar6 = copyWithTimeline.INSTANCE;
                copyWithNewPosition copywithnewpositionWrite6 = copyWithTimeline.Companion.write(MediaSourceListForwardingEventListenerExternalSyntheticLambda2.AudioAttributesImplApi26Parcelizer, this);
                if (copywithnewpositionWrite6 != null && copywithnewpositionWrite6.read()) {
                    return new createRemoteException(this, p0).AudioAttributesCompatParcelizer(p1, p0, p4, p2);
                }
                return null;
            case 7:
                copyWithTimeline.Companion readVar7 = copyWithTimeline.INSTANCE;
                copyWithNewPosition copywithnewpositionWrite7 = copyWithTimeline.Companion.write(MediaSourceListForwardingEventListenerExternalSyntheticLambda2.MediaBrowserCompatMediaItem, this);
                if (copywithnewpositionWrite7 != null && copywithnewpositionWrite7.read()) {
                    return new copyWithEstimatedPosition(this).AudioAttributesCompatParcelizer(p1, p0, p4, p2);
                }
                return null;
            case 8:
                copyWithTimeline.Companion readVar8 = copyWithTimeline.INSTANCE;
                copyWithNewPosition copywithnewpositionWrite8 = copyWithTimeline.Companion.write(MediaSourceListForwardingEventListenerExternalSyntheticLambda2.AudioAttributesImplBaseParcelizer, this);
                if (copywithnewpositionWrite8 != null) {
                    if (!copywithnewpositionWrite8.read()) {
                        copywithnewpositionWrite8 = null;
                    }
                    if (copywithnewpositionWrite8 != null && (numOnStop = onStop()) != null) {
                        int iIntValue = numOnStop.intValue();
                        if (this.onMediaButtonEvent) {
                            IconCompatParcelizer(p1, p0, p4, Integer.valueOf(iIntValue));
                        }
                        return new getCauseFromBundle(this, p0).AudioAttributesCompatParcelizer(p1, p0, p4, p2).IconCompatParcelizer(iIntValue);
                    }
                }
                return null;
            case 9:
                copyWithTimeline.Companion readVar9 = copyWithTimeline.INSTANCE;
                copyWithNewPosition copywithnewpositionWrite9 = copyWithTimeline.Companion.write(MediaSourceListForwardingEventListenerExternalSyntheticLambda2.MediaBrowserCompatCustomActionResultReceiver, this);
                if (copywithnewpositionWrite9 != null && copywithnewpositionWrite9.read()) {
                    return new createForUnsupportedContainerFeature(this).AudioAttributesCompatParcelizer(p1, p0, p4, p2);
                }
                return null;
            case 10:
                AudioAttributesCompatParcelizer(p1);
                return null;
            default:
                onDrmSessionAcquired.IconCompatParcelizer();
                return null;
        }
    }

    private final void AudioAttributesCompatParcelizer(Context p0) {
        Object systemService = p0.getSystemService("notification");
        toMagicModuleMetaRepoModel.read(systemService, "");
        NotificationManager notificationManager = (NotificationManager) systemService;
        String str = this.onStop;
        if (str != null) {
            toMagicModuleMetaRepoModel.write((Object) str);
            if (str.length() > 0) {
                String str2 = this.onStop;
                toMagicModuleMetaRepoModel.write((Object) str2);
                notificationManager.cancel(Integer.parseInt(str2));
                return;
            }
        }
        ArrayList<Integer> arrayList = this.setSessionImpl;
        toMagicModuleMetaRepoModel.write(arrayList);
        if (arrayList.size() <= 0) {
            return;
        }
        ArrayList<Integer> arrayList2 = this.setSessionImpl;
        toMagicModuleMetaRepoModel.write(arrayList2);
        int size = arrayList2.size();
        if (size < 0) {
            return;
        }
        int i = 0;
        while (true) {
            ArrayList<Integer> arrayList3 = this.setSessionImpl;
            toMagicModuleMetaRepoModel.write(arrayList3);
            Integer num = arrayList3.get(i);
            toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(num, "");
            notificationManager.cancel(num.intValue());
            if (i == size) {
                return;
            } else {
                i++;
            }
        }
    }

    private final Integer onStop() {
        int i = this.onFastForward;
        if (i != -1 && i >= 10) {
            return Integer.valueOf((i * 1000) + 1000);
        }
        int i2 = this.onPlayFromUri;
        if (i2 >= 10) {
            return Integer.valueOf((i2 * 1000) + 1000);
        }
        onDrmSessionAcquired.RemoteActionCompatParcelizer();
        return null;
    }

    private final void IconCompatParcelizer(final Context p0, final Bundle p1, final int p2, Integer p3) {
        Handler handler = new Handler(Looper.getMainLooper());
        if (p3 != null) {
            handler.postDelayed(new Runnable() { // from class: o.MediaSourceListForwardingEventListenerExternalSyntheticLambda3
                @Override // java.lang.Runnable
                public final void run() {
                    MediaSourceListForwardingEventListenerExternalSyntheticLambda4.IconCompatParcelizer(p0, p2, this, p1);
                }
            }, p3.intValue() - 100);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void IconCompatParcelizer(Context context, int i, MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda4, Bundle bundle) {
        JSONObject jSONObject;
        toMagicModuleMetaRepoModel.write(context, "");
        toMagicModuleMetaRepoModel.write(mediaSourceListForwardingEventListenerExternalSyntheticLambda4, "");
        toMagicModuleMetaRepoModel.write(bundle, "");
        if (MediaSourceListForwardingEventListenerExternalSyntheticLambda10.AudioAttributesCompatParcelizer(context, i)) {
            copyWithTimeline.Companion readVar = copyWithTimeline.INSTANCE;
            copyWithNewPosition copywithnewpositionWrite = copyWithTimeline.Companion.write(MediaSourceListForwardingEventListenerExternalSyntheticLambda2.write, mediaSourceListForwardingEventListenerExternalSyntheticLambda4);
            if (copywithnewpositionWrite == null || !copywithnewpositionWrite.read()) {
                return;
            }
            Context applicationContext = context.getApplicationContext();
            Object objClone = bundle.clone();
            toMagicModuleMetaRepoModel.read(objClone, "");
            Bundle bundle2 = (Bundle) objClone;
            bundle2.remove("wzrk_rnv");
            bundle2.putString("wzrk_pid", null);
            bundle2.putString("pt_id", "pt_basic");
            String string = bundle2.getString("pt_json");
            if (string != null) {
                try {
                    jSONObject = new JSONObject(string);
                } catch (Exception unused) {
                    RendererWakeupListener.MediaMetadataCompat();
                    jSONObject = null;
                }
            } else {
                jSONObject = null;
            }
            String str = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.onSeekTo;
            if (str != null) {
                toMagicModuleMetaRepoModel.write((Object) str);
                if (str.length() > 0 && (jSONObject == null || jSONObject.put("pt_title", mediaSourceListForwardingEventListenerExternalSyntheticLambda4.onSeekTo) == null)) {
                    bundle2.putString("pt_title", mediaSourceListForwardingEventListenerExternalSyntheticLambda4.onSeekTo);
                    getShowPopup getshowpopup = getShowPopup.INSTANCE;
                }
            }
            String str2 = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.onRewind;
            if (str2 != null) {
                toMagicModuleMetaRepoModel.write((Object) str2);
                if (str2.length() > 0) {
                    if (jSONObject == null || jSONObject.put("pt_big_img", mediaSourceListForwardingEventListenerExternalSyntheticLambda4.onRewind) == null) {
                        bundle2.putString("pt_big_img", mediaSourceListForwardingEventListenerExternalSyntheticLambda4.onRewind);
                        getShowPopup getshowpopup2 = getShowPopup.INSTANCE;
                    }
                    if (jSONObject == null || jSONObject.put("pt_big_img_alt_text", mediaSourceListForwardingEventListenerExternalSyntheticLambda4.onRemoveQueueItem) == null) {
                        bundle2.putString("pt_big_img_alt_text", mediaSourceListForwardingEventListenerExternalSyntheticLambda4.onRemoveQueueItem);
                        getShowPopup getshowpopup3 = getShowPopup.INSTANCE;
                    }
                }
            }
            String str3 = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.onRemoveQueueItemAt;
            if (str3 != null) {
                toMagicModuleMetaRepoModel.write((Object) str3);
                if (str3.length() > 0 && (jSONObject == null || jSONObject.put("pt_msg", mediaSourceListForwardingEventListenerExternalSyntheticLambda4.onRemoveQueueItemAt) == null)) {
                    bundle2.putString("pt_msg", mediaSourceListForwardingEventListenerExternalSyntheticLambda4.onRemoveQueueItemAt);
                    getShowPopup getshowpopup4 = getShowPopup.INSTANCE;
                }
            }
            String str4 = mediaSourceListForwardingEventListenerExternalSyntheticLambda4.onPrepareFromUri;
            if (str4 != null) {
                toMagicModuleMetaRepoModel.write((Object) str4);
                if (str4.length() > 0 && (jSONObject == null || jSONObject.put("pt_msg_summary", mediaSourceListForwardingEventListenerExternalSyntheticLambda4.onPrepareFromUri) == null)) {
                    bundle2.putString("pt_msg_summary", mediaSourceListForwardingEventListenerExternalSyntheticLambda4.onPrepareFromUri);
                    getShowPopup getshowpopup5 = getShowPopup.INSTANCE;
                }
            }
            if (jSONObject != null) {
                bundle2.putString("pt_json", jSONObject.toString());
            }
            bundle2.putString("pt_ck", null);
            bundle2.putString("wzrk_ck", null);
            bundle2.remove("notificationId");
            toMagicModuleMetaRepoModel.write(applicationContext);
            MediaSourceListForwardingEventListenerExternalSyntheticLambda4 mediaSourceListForwardingEventListenerExternalSyntheticLambda42 = new MediaSourceListForwardingEventListenerExternalSyntheticLambda4(applicationContext, bundle2);
            PlayerTimelineChangeReason playerTimelineChangeReasonWrite = PlayerTimelineChangeReason.write(applicationContext, getAdState.RemoteActionCompatParcelizer(bundle2));
            if (playerTimelineChangeReasonWrite != null) {
                playerTimelineChangeReasonWrite.RemoteActionCompatParcelizer(mediaSourceListForwardingEventListenerExternalSyntheticLambda42, applicationContext, bundle2);
            }
        }
    }

    @Override // kotlin.getAdCountInAdGroup
    public final void write(int p0, Context p1) {
        toMagicModuleMetaRepoModel.write(p1, "");
        this.onPause = p0;
        try {
            this.onSetPlaybackSpeed = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.write(p1, p0, this.onSetCaptioningEnabled, "#A6A6A6");
        } catch (NullPointerException unused) {
            onDrmSessionAcquired.RemoteActionCompatParcelizer();
        }
    }

    @Override // kotlin.getAdCountInAdGroup
    public final String AudioAttributesCompatParcelizer() {
        return "pt_ico";
    }

    @Override // kotlin.getAdCountInAdGroup
    public final Object read(Bundle p0) {
        toMagicModuleMetaRepoModel.write(p0, "");
        return this.MediaSessionCompatToken;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x00a3  */
    @Override // kotlin.setAvailableCommands
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final o._coercedTypeDesc.AudioAttributesImplBaseParcelizer RemoteActionCompatParcelizer(android.content.Context r3, android.os.Bundle r4, o._coercedTypeDesc.AudioAttributesImplBaseParcelizer r5, com.clevertap.android.sdk.CleverTapInstanceConfig r6) {
        /*
            r2 = this;
            java.lang.String r2 = "wzrk_sound"
            java.lang.String r0 = ""
            kotlin.toMagicModuleMetaRepoModel.write(r3, r0)
            kotlin.toMagicModuleMetaRepoModel.write(r4, r0)
            kotlin.toMagicModuleMetaRepoModel.write(r5, r0)
            kotlin.toMagicModuleMetaRepoModel.write(r6, r0)
            boolean r1 = r4.containsKey(r2)     // Catch: java.lang.Throwable -> Laa
            if (r1 == 0) goto La9
            java.lang.Object r2 = r4.get(r2)     // Catch: java.lang.Throwable -> Laa
            boolean r4 = r2 instanceof java.lang.Boolean     // Catch: java.lang.Throwable -> Laa
            r1 = 2
            if (r4 == 0) goto L2e
            r4 = r2
            java.lang.Boolean r4 = (java.lang.Boolean) r4     // Catch: java.lang.Throwable -> Laa
            boolean r4 = r4.booleanValue()     // Catch: java.lang.Throwable -> Laa
            if (r4 == 0) goto L2e
            android.net.Uri r2 = android.media.RingtoneManager.getDefaultUri(r1)     // Catch: java.lang.Throwable -> Laa
            goto La4
        L2e:
            boolean r4 = r2 instanceof java.lang.String
            if (r4 == 0) goto La3
            java.lang.String r4 = "true"
            boolean r4 = kotlin.toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(r2, r4)     // Catch: java.lang.Throwable -> Laa
            if (r4 == 0) goto L3f
            android.net.Uri r2 = android.media.RingtoneManager.getDefaultUri(r1)     // Catch: java.lang.Throwable -> Laa
            goto La4
        L3f:
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Throwable -> Laa
            int r4 = r4.length()     // Catch: java.lang.Throwable -> Laa
            if (r4 <= 0) goto La3
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Throwable -> Laa
            java.lang.String r1 = ".mp3"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: java.lang.Throwable -> Laa
            boolean r4 = kotlin.TestGroupLSModel.RemoteActionCompatParcelizer(r4, r1)     // Catch: java.lang.Throwable -> Laa
            if (r4 != 0) goto L6f
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Throwable -> Laa
            java.lang.String r1 = ".ogg"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: java.lang.Throwable -> Laa
            boolean r4 = kotlin.TestGroupLSModel.RemoteActionCompatParcelizer(r4, r1)     // Catch: java.lang.Throwable -> Laa
            if (r4 != 0) goto L6f
            r4 = r2
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4     // Catch: java.lang.Throwable -> Laa
            java.lang.String r1 = ".wav"
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1     // Catch: java.lang.Throwable -> Laa
            boolean r4 = kotlin.TestGroupLSModel.RemoteActionCompatParcelizer(r4, r1)     // Catch: java.lang.Throwable -> Laa
            if (r4 == 0) goto L82
        L6f:
            r4 = r2
            java.lang.String r4 = (java.lang.String) r4     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Laa
            int r2 = r2.length()     // Catch: java.lang.Throwable -> Laa
            int r2 = r2 + (-4)
            r1 = 0
            java.lang.String r2 = r4.substring(r1, r2)     // Catch: java.lang.Throwable -> Laa
            kotlin.toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(r2, r0)     // Catch: java.lang.Throwable -> Laa
        L82:
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laa
            java.lang.String r0 = "android.resource://"
            r4.<init>(r0)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r3 = r3.getPackageName()     // Catch: java.lang.Throwable -> Laa
            r4.append(r3)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r3 = "/raw/"
            r4.append(r3)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = (java.lang.String) r2     // Catch: java.lang.Throwable -> Laa
            r4.append(r2)     // Catch: java.lang.Throwable -> Laa
            java.lang.String r2 = r4.toString()     // Catch: java.lang.Throwable -> Laa
            android.net.Uri r2 = android.net.Uri.parse(r2)     // Catch: java.lang.Throwable -> Laa
            goto La4
        La3:
            r2 = 0
        La4:
            if (r2 == 0) goto La9
            r5.AudioAttributesCompatParcelizer(r2)     // Catch: java.lang.Throwable -> Laa
        La9:
            return r5
        Laa:
            o.RendererWakeupListener r2 = r6.MediaBrowserCompatItemReceiver()
            r6.write()
            r2.write()
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MediaSourceListForwardingEventListenerExternalSyntheticLambda4.RemoteActionCompatParcelizer(android.content.Context, android.os.Bundle, o._coercedTypeDesc$AudioAttributesImplBaseParcelizer, com.clevertap.android.sdk.CleverTapInstanceConfig):o._coercedTypeDesc$AudioAttributesImplBaseParcelizer");
    }

    private final void write(Context context, Bundle bundle) {
        boolean z = (context.getResources().getConfiguration().uiMode & 48) == 32;
        this.AudioAttributesCompatParcelizer = bundle.getString("pt_id");
        String string = bundle.getString("pt_json");
        if (this.AudioAttributesCompatParcelizer != null) {
            MediaSourceListForwardingEventListenerExternalSyntheticLambda2.Companion readVar = MediaSourceListForwardingEventListenerExternalSyntheticLambda2.INSTANCE;
            this.write = MediaSourceListForwardingEventListenerExternalSyntheticLambda2.Companion.write(this.AudioAttributesCompatParcelizer);
            try {
            } catch (JSONException e) {
                e.printStackTrace();
            }
            Bundle bundleRemoteActionCompatParcelizer = onLoadStarted.read(string) ? MediaSourceListForwardingEventListenerExternalSyntheticLambda10.RemoteActionCompatParcelizer(new JSONObject(string)) : null;
            if (bundleRemoteActionCompatParcelizer != null) {
                bundle.putAll(bundleRemoteActionCompatParcelizer);
            }
        }
        Map<String, String> mapAudioAttributesCompatParcelizer = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.AudioAttributesCompatParcelizer(bundle, z);
        String string2 = context.getString(onUpstreamDiscarded.IconCompatParcelizer.pt_big_image_alt);
        toMagicModuleMetaRepoModel.AudioAttributesCompatParcelizer(string2, "");
        this.RemoteActionCompatParcelizer = bundle.getString("pt_msg");
        this.read = bundle.getString("pt_msg_summary");
        this.MediaBrowserCompatCustomActionResultReceiver = mapAudioAttributesCompatParcelizer.get("pt_msg_clr");
        this.IconCompatParcelizer = bundle.getString("pt_title");
        this.AudioAttributesImplBaseParcelizer = mapAudioAttributesCompatParcelizer.get("pt_title_clr");
        this.onSetRating = mapAudioAttributesCompatParcelizer.get("pt_meta_clr");
        this.onCustomAction = mapAudioAttributesCompatParcelizer.get("pt_bg");
        this.MediaBrowserCompatItemReceiver = bundle.getString("pt_big_img");
        this.AudioAttributesImplApi21Parcelizer = bundle.getString("pt_big_img_alt_text", string2);
        this.AudioAttributesImplApi26Parcelizer = bundle.getString("pt_ico");
        this.onPlayFromMediaId = bundle.getString("pt_small_view");
        this.RatingCompat = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.RemoteActionCompatParcelizer(bundle, string2);
        this.MediaMetadataCompat = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.read(bundle);
        this.MediaBrowserCompatMediaItem = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.AudioAttributesCompatParcelizer(bundle);
        this.MediaBrowserCompatSearchResultReceiver = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.AudioAttributesImplApi26Parcelizer(bundle);
        this.onCommand = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.AudioAttributesImplBaseParcelizer(bundle);
        this.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = bundle.getString("pt_default_dl");
        this.onFastForward = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.MediaBrowserCompatCustomActionResultReceiver(bundle);
        String string3 = bundle.getString("pt_render_terminal");
        this.onMediaButtonEvent = string3 != null ? TestGroupLSModel.read(string3, "true", true) : true;
        this.onPlayFromSearch = bundle.getString("pt_input_label");
        this.onPrepare = bundle.getString("pt_input_feedback");
        this.onPrepareFromSearch = bundle.getString("pt_input_auto_open");
        this.onPrepareFromMediaId = bundle.getString("pt_dismiss_on_click");
        this.MediaDescriptionCompat = mapAudioAttributesCompatParcelizer.get("pt_chrono_title_clr");
        this.handleMediaPlayPauseIfPendingOnHandler = bundle.getString("pt_product_display_action");
        this.onAddQueueItem = mapAudioAttributesCompatParcelizer.get("pt_product_display_action_clr");
        this.onPlayFromUri = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.write(bundle, System.currentTimeMillis());
        this.onRewind = bundle.getString("pt_big_img_alt");
        this.onRemoveQueueItem = bundle.getString("pt_big_img_alt_alt_text", string2);
        this.onRemoveQueueItemAt = bundle.getString("pt_msg_alt");
        this.onPrepareFromUri = bundle.getString("pt_msg_summary_alt");
        this.onSeekTo = bundle.getString("pt_title_alt");
        this.onSetRepeatMode = bundle.getString("pt_product_display_linear");
        this.onSetShuffleMode = mapAudioAttributesCompatParcelizer.get("pt_product_display_action_text_clr");
        this.onSetCaptioningEnabled = mapAudioAttributesCompatParcelizer.get("pt_small_icon_clr");
        this.onStop = bundle.getString("pt_cancel_notif_id");
        this.setSessionImpl = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.IconCompatParcelizer(context);
        this.onSkipToPrevious = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.IconCompatParcelizer(bundle);
        this.PlaybackStateCompat = bundle.getString("pt_subtitle");
        this.MediaSessionCompatToken = bundle.get("pt_ck");
        this.MediaSessionCompatQueueItem = MediaSourceListForwardingEventListenerExternalSyntheticLambda10.RemoteActionCompatParcelizer(bundle);
        MediaSourceListForwardingEventListenerExternalSyntheticLambda1.Companion audioAttributesCompatParcelizer = MediaSourceListForwardingEventListenerExternalSyntheticLambda1.INSTANCE;
        this.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw = MediaSourceListForwardingEventListenerExternalSyntheticLambda1.Companion.IconCompatParcelizer(bundle.getString("pt_scale_type"));
        this.MediaSessionCompatResultReceiverWrapper = bundle.getString("wzrk_pid");
        this.ParcelableVolumeInfo = bundle.getString("pt_manual_carousel_type");
        IconCompatParcelizer(bundle);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ae  */
    /* JADX WARN: Removed duplicated region for block: B:6:0x000f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void IconCompatParcelizer(android.os.Bundle r3) {
        /*
            r2 = this;
            java.lang.String r0 = r2.IconCompatParcelizer
            if (r0 == 0) goto Lf
            kotlin.toMagicModuleMetaRepoModel.write(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L17
        Lf:
            java.lang.String r0 = "nt"
            java.lang.String r0 = r3.getString(r0)
            r2.IconCompatParcelizer = r0
        L17:
            java.lang.String r0 = r2.RemoteActionCompatParcelizer
            if (r0 == 0) goto L26
            kotlin.toMagicModuleMetaRepoModel.write(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L2e
        L26:
            java.lang.String r0 = "nm"
            java.lang.String r0 = r3.getString(r0)
            r2.RemoteActionCompatParcelizer = r0
        L2e:
            java.lang.String r0 = r2.read
            if (r0 == 0) goto L3d
            kotlin.toMagicModuleMetaRepoModel.write(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L45
        L3d:
            java.lang.String r0 = "wzrk_nms"
            java.lang.String r0 = r3.getString(r0)
            r2.read = r0
        L45:
            java.lang.String r0 = r2.MediaBrowserCompatItemReceiver
            if (r0 == 0) goto L54
            kotlin.toMagicModuleMetaRepoModel.write(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L5c
        L54:
            java.lang.String r0 = "wzrk_bp"
            java.lang.String r0 = r3.getString(r0)
            r2.MediaBrowserCompatItemReceiver = r0
        L5c:
            java.lang.String r0 = r2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver
            if (r0 == 0) goto L6b
            kotlin.toMagicModuleMetaRepoModel.write(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L73
        L6b:
            java.lang.String r0 = "wzrk_dl"
            java.lang.String r0 = r3.getString(r0)
            r2.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = r0
        L73:
            java.lang.String r0 = r2.onSetRating
            java.lang.String r1 = "wzrk_clr"
            if (r0 == 0) goto L84
            kotlin.toMagicModuleMetaRepoModel.write(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L8a
        L84:
            java.lang.String r0 = r3.getString(r1)
            r2.onSetRating = r0
        L8a:
            java.lang.String r0 = r2.onSetCaptioningEnabled
            if (r0 == 0) goto L99
            kotlin.toMagicModuleMetaRepoModel.write(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto L9f
        L99:
            java.lang.String r0 = r3.getString(r1)
            r2.onSetCaptioningEnabled = r0
        L9f:
            java.lang.String r0 = r2.PlaybackStateCompat
            if (r0 == 0) goto Lae
            kotlin.toMagicModuleMetaRepoModel.write(r0)
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 != 0) goto Lb6
        Lae:
            java.lang.String r0 = "wzrk_st"
            java.lang.String r0 = r3.getString(r0)
            r2.PlaybackStateCompat = r0
        Lb6:
            java.lang.Object r0 = r2.MediaSessionCompatToken
            if (r0 != 0) goto Lc2
            java.lang.String r0 = "wzrk_ck"
            java.lang.Object r3 = r3.get(r0)
            r2.MediaSessionCompatToken = r3
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MediaSourceListForwardingEventListenerExternalSyntheticLambda4.IconCompatParcelizer(android.os.Bundle):void");
    }

    @Override // kotlin.getAdCountInAdGroup
    public final _coercedTypeDesc.AudioAttributesImplBaseParcelizer read(Context p0, Bundle p1, int p2, _coercedTypeDesc.AudioAttributesImplBaseParcelizer p3, JSONArray p4) {
        toMagicModuleMetaRepoModel.write(p3, "");
        for (onDrmSessionReleased ondrmsessionreleased : this.onSkipToNext) {
            PendingIntent pendingIntent = this.onSkipToQueueItem.get(ondrmsessionreleased.write());
            if (pendingIntent != null) {
                p3.AudioAttributesCompatParcelizer(ondrmsessionreleased.IconCompatParcelizer(), ondrmsessionreleased.RemoteActionCompatParcelizer(), pendingIntent);
            }
        }
        return p3;
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0088 A[Catch: all -> 0x008e, TRY_LEAVE, TryCatch #0 {all -> 0x008e, blocks: (B:8:0x001f, B:13:0x0050, B:11:0x0044, B:14:0x0054, B:21:0x0077, B:23:0x0088, B:19:0x0070, B:16:0x0060), top: B:29:0x001f, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0095 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private java.util.List<kotlin.onDrmSessionReleased> read(android.content.Context r12, android.os.Bundle r13, int r14, org.json.JSONArray r15) {
        /*
            r11 = this;
            java.lang.String r0 = ""
            kotlin.toMagicModuleMetaRepoModel.write(r12, r0)
            kotlin.toMagicModuleMetaRepoModel.write(r13, r0)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.List r0 = (java.util.List) r0
            if (r15 == 0) goto L98
            int r1 = r15.length()
            if (r1 <= 0) goto L98
            int r1 = r15.length()
            r2 = 0
            r3 = r2
        L1d:
            if (r3 >= r1) goto L98
            org.json.JSONObject r4 = r15.getJSONObject(r3)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r5 = "l"
            java.lang.String r5 = r4.optString(r5)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = r11.AudioAttributesCompatParcelizer()     // Catch: java.lang.Throwable -> L8e
            java.lang.String r6 = r4.optString(r6)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r7 = "id"
            java.lang.String r7 = r4.optString(r7)     // Catch: java.lang.Throwable -> L8e
            kotlin.toMagicModuleMetaRepoModel.write(r5)     // Catch: java.lang.Throwable -> L8e
            r8 = r5
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch: java.lang.Throwable -> L8e
            int r8 = r8.length()     // Catch: java.lang.Throwable -> L8e
            if (r8 != 0) goto L44
            goto L50
        L44:
            kotlin.toMagicModuleMetaRepoModel.write(r7)     // Catch: java.lang.Throwable -> L8e
            r8 = r7
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch: java.lang.Throwable -> L8e
            int r8 = r8.length()     // Catch: java.lang.Throwable -> L8e
            if (r8 != 0) goto L54
        L50:
            kotlin.RendererWakeupListener.MediaBrowserCompatItemReceiver()     // Catch: java.lang.Throwable -> L8e
            goto L95
        L54:
            kotlin.toMagicModuleMetaRepoModel.write(r6)     // Catch: java.lang.Throwable -> L8e
            r8 = r6
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8     // Catch: java.lang.Throwable -> L8e
            int r8 = r8.length()     // Catch: java.lang.Throwable -> L8e
            if (r8 <= 0) goto L76
            android.content.res.Resources r8 = r12.getResources()     // Catch: java.lang.Throwable -> L6f
            java.lang.String r9 = "drawable"
            java.lang.String r10 = r12.getPackageName()     // Catch: java.lang.Throwable -> L6f
            int r6 = r8.getIdentifier(r6, r9, r10)     // Catch: java.lang.Throwable -> L6f
            goto L77
        L6f:
            r6 = move-exception
            r6.getLocalizedMessage()     // Catch: java.lang.Throwable -> L8e
            kotlin.RendererWakeupListener.MediaBrowserCompatItemReceiver()     // Catch: java.lang.Throwable -> L8e
        L76:
            r6 = r2
        L77:
            o.onDrmSessionReleased r8 = new o.onDrmSessionReleased     // Catch: java.lang.Throwable -> L8e
            r8.<init>(r7, r5, r6)     // Catch: java.lang.Throwable -> L8e
            r0.add(r8)     // Catch: java.lang.Throwable -> L8e
            kotlin.toMagicModuleMetaRepoModel.write(r4)     // Catch: java.lang.Throwable -> L8e
            android.app.PendingIntent r4 = RemoteActionCompatParcelizer(r12, r4, r13, r14)     // Catch: java.lang.Throwable -> L8e
            if (r4 == 0) goto L95
            java.util.Map<java.lang.String, android.app.PendingIntent> r5 = r11.onSkipToQueueItem     // Catch: java.lang.Throwable -> L8e
            r5.put(r7, r4)     // Catch: java.lang.Throwable -> L8e
            goto L95
        L8e:
            r4 = move-exception
            r4.getLocalizedMessage()
            kotlin.RendererWakeupListener.MediaBrowserCompatItemReceiver()
        L95:
            int r3 = r3 + 1
            goto L1d
        L98:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: kotlin.MediaSourceListForwardingEventListenerExternalSyntheticLambda4.read(android.content.Context, android.os.Bundle, int, org.json.JSONArray):java.util.List");
    }

    private static PendingIntent RemoteActionCompatParcelizer(Context p0, JSONObject p1, Bundle p2, int p3) {
        Class<?> cls;
        Intent launchIntentForPackage;
        try {
            String strOptString = p1.optString("dl");
            String strOptString2 = p1.optString("id");
            boolean z = true;
            boolean zOptBoolean = p1.optBoolean("ac", true);
            String strMediaDescriptionCompat = RendererState.IconCompatParcelizer(p0).MediaDescriptionCompat();
            boolean z2 = false;
            if (strMediaDescriptionCompat != null) {
                try {
                    try {
                        cls = Class.forName(strMediaDescriptionCompat);
                    } catch (ClassNotFoundException unused) {
                        byte b = $$a[34];
                        byte b2 = b;
                        Object[] objArr = new Object[1];
                        a(b, b2, b2, objArr);
                        cls = Class.forName((String) objArr[0]);
                    }
                } catch (ClassNotFoundException unused2) {
                    RendererWakeupListener.MediaBrowserCompatItemReceiver();
                    cls = null;
                }
            } else {
                try {
                    byte b3 = $$a[34];
                    byte b4 = b3;
                    Object[] objArr2 = new Object[1];
                    a(b3, b4, b4, objArr2);
                    cls = Class.forName((String) objArr2[0]);
                } catch (ClassNotFoundException unused3) {
                    RendererWakeupListener.MediaBrowserCompatItemReceiver();
                    cls = null;
                }
            }
            boolean zIconCompatParcelizer = RendererCapabilitiesListener.IconCompatParcelizer(p0, cls);
            if (Build.VERSION.SDK_INT < 31 && zOptBoolean && zIconCompatParcelizer) {
                z2 = true;
            }
            String string = p2.getString("pt_dismiss_on_click");
            if (!z2 && getAdGroupCount.IconCompatParcelizer(p2)) {
                toMagicModuleMetaRepoModel.write((Object) strOptString2);
                if (TestGroupLSModel.write((CharSequence) strOptString2, (CharSequence) "remind", false) && string != null && TestGroupLSModel.read(string, "true", true) && zOptBoolean && zIconCompatParcelizer) {
                    z2 = true;
                }
            }
            if (z2 || !getAdGroupCount.IconCompatParcelizer(p2) || string == null || !TestGroupLSModel.read(string, "true", true) || !zOptBoolean || !zIconCompatParcelizer) {
                z = z2;
            }
            if (z) {
                launchIntentForPackage = new Intent(CTNotificationIntentService.MAIN_ACTION);
                launchIntentForPackage.setPackage(p0.getPackageName());
                launchIntentForPackage.putExtra("ct_type", CTNotificationIntentService.TYPE_BUTTON_CLICK);
                toMagicModuleMetaRepoModel.write((Object) strOptString);
                if (strOptString.length() > 0) {
                    launchIntentForPackage.putExtra("dl", strOptString);
                }
            } else {
                toMagicModuleMetaRepoModel.write((Object) strOptString);
                if (strOptString.length() > 0) {
                    launchIntentForPackage = new Intent("android.intent.action.VIEW", Uri.parse(strOptString));
                    MediaSourceListForwardingEventListenerExternalSyntheticLambda10.write(p0, launchIntentForPackage);
                } else {
                    launchIntentForPackage = p0.getPackageManager().getLaunchIntentForPackage(p0.getPackageName());
                }
            }
            if (launchIntentForPackage == null) {
                return null;
            }
            launchIntentForPackage.putExtras(p2);
            launchIntentForPackage.removeExtra("wzrk_acts");
            launchIntentForPackage.putExtra("actionId", strOptString2);
            launchIntentForPackage.putExtra("autoCancel", zOptBoolean);
            launchIntentForPackage.putExtra("wzrk_c2a", strOptString2);
            launchIntentForPackage.putExtra("notificationId", p3);
            launchIntentForPackage.setFlags(603979776);
            int iNextInt = new Random().nextInt();
            if (z) {
                return PendingIntent.getService(p0, iNextInt, launchIntentForPackage, 201326592);
            }
            return PendingIntent.getActivity(p0, iNextInt, launchIntentForPackage, 201326592, null);
        } catch (Throwable th) {
            th.getLocalizedMessage();
            RendererWakeupListener.MediaBrowserCompatItemReceiver();
            return null;
        }
    }

    /* JADX INFO: renamed from: o.MediaSourceListForwardingEventListenerExternalSyntheticLambda4$read, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes2.dex */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001c\u0010\t\u001a\u00020\u00048\u0007@\u0006X\u0086\f¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b"}, d2 = {"Lo/MediaSourceListForwardingEventListenerExternalSyntheticLambda4$read;", "", "<init>", "()V", "", "IconCompatParcelizer", "I", "read", "()I", "AudioAttributesCompatParcelizer"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        private Companion() {
        }

        public static int read() {
            return MediaSourceListForwardingEventListenerExternalSyntheticLambda4.IconCompatParcelizer;
        }

        public /* synthetic */ Companion(MagicModuleRepositoryImplExternalSyntheticLambda0 magicModuleRepositoryImplExternalSyntheticLambda0) {
            this();
        }
    }

    public static final int RemoteActionCompatParcelizer() {
        return Companion.read();
    }
}
