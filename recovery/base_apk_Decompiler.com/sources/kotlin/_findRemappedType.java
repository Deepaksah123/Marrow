package kotlin;

import java.util.ArrayList;
import java.util.List;
import kotlin.AbstractDeserializer;
import kotlin.CreatorCandidate;
import kotlin.Metadata;
import kotlin.ReadableObjectIdReferring;
import kotlin._deserializeFromObjectId;
import kotlin._find2ViaAlias;
import kotlin._findFormat;
import kotlin._findWithAlias;
import kotlin.assignIndexes;
import kotlin.canCreateFromBoolean;
import kotlin.canCreateFromInt;
import kotlin.find;
import kotlin.findProperty;
import kotlin.getDataStream;
import kotlin.getReferencedType;
import kotlin.nopInstance;
import kotlin.processUnwrapped;
import kotlin.renameAll;
import kotlin.switchToNext;
import kotlin.withCaseInsensitivity;
import kotlin.withProperty;
import kotlin.withValueDeserializer;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000ò\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001aK\u0010\t\u001a\u00020\b\"\u0014\b\u0000\u0010\u0001*\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00020\u0000\"\u0004\b\u0001\u0010\u0002\"\u0004\b\u0002\u0010\u00032\b\u0010\u0004\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0005\u001a\u00028\u00002\u0006\u0010\u0007\u001a\u00020\u0006H\u0000¢\u0006\u0004\b\t\u0010\n\u001a]\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\r\"\u0004\b\u0000\u0010\u0002\"\b\b\u0001\u0010\u0003*\u00020\b2\u001a\u0010\u0004\u001a\u0016\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00028\u0000\u0012\u0006\u0012\u0004\u0018\u00018\u00010\u000b2\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00028\u0001\u0012\u0006\u0012\u0004\u0018\u00018\u00000\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000f\u001a!\u0010\u0010\u001a\u0004\u0018\u00018\u0000\"\u0004\b\u0000\u0010\u00012\b\u0010\u0004\u001a\u0004\u0018\u00018\u0000H\u0000¢\u0006\u0004\b\u0010\u0010\u0011\"&\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\b0\u00008\u0001X\u0080\u0004¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u000e\u0010\u0015\".\u0010\u0018\u001a\u001c\u0012\u0012\u0012\u0010\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u00170\u0016\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0014\"(\u0010\u0019\u001a\u0016\u0012\f\u0012\n\u0012\u0006\b\u0001\u0012\u00020\b0\u0017\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\u0014\" \u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u001a\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0014\" \u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0014\" \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0014\" \u0010\"\u001a\u000e\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0014\" \u0010%\u001a\u000e\u0012\u0004\u0012\u00020#\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0014\" \u0010(\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0014\" \u0010+\u001a\u000e\u0012\u0004\u0012\u00020)\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b*\u0010\u0014\"$\u0010/\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\u0000*\u00020,8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010.\" \u00101\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b0\u0010\u0014\"$\u00105\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\b0\u0000*\u0002028AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u00104\" \u00107\u001a\u000e\u0012\u0004\u0012\u000203\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u0010\u0014\"$\u0010\u001f\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\b0\u0000*\u0002088AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010:\" \u0010<\u001a\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b;\u0010\u0014\"$\u0010@\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\u0000*\u00020=8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010?\" \u0010A\u001a\u000e\u0012\u0004\u0012\u00020>\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b \u0010\u0014\"$\u0010$\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\b0\u0000*\u00020B8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010D\" \u0010E\u001a\u000e\u0012\u0004\u0012\u00020C\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u0014\"$\u0010'\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u0000*\u00020F8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010H\" \u0010J\u001a\u000e\u0012\u0004\u0012\u00020G\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bI\u0010\u0014\"$\u0010N\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\b0\u0000*\u00020K8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010M\" \u00106\u001a\u000e\u0012\u0004\u0012\u00020L\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b<\u0010\u0014\"$\u00100\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\b0\u0000*\u00020O8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010Q\" \u0010;\u001a\u000e\u0012\u0004\u0012\u00020P\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\"\u0010R\"$\u0010V\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\b0\u0000*\u00020S8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010U\" \u0010W\u001a\u000e\u0012\u0004\u0012\u00020T\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bJ\u0010R\"$\u0010*\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\b0\u0000*\u00020X8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0018\u0010Z\" \u0010I\u001a\u000e\u0012\u0004\u0012\u00020Y\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bN\u0010R\"$\u0010\u001d\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\b0\u0000*\u00020[8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010]\" \u0010^\u001a\u000e\u0012\u0004\u0012\u00020\\\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b+\u0010R\"$\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\b0\u0000*\u00020_8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010a\" \u0010b\u001a\u000e\u0012\u0004\u0012\u00020`\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b(\u0010\u0014\"$\u0010\u001b\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\b0\u0000*\u00020c8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010e\" \u0010f\u001a\u000e\u0012\u0004\u0012\u00020d\u0012\u0004\u0012\u00020\b0\u00008\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0014\"$\u0010j\u001a\u000e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020\b0\u0000*\u00020g8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010i\" \u0010k\u001a\u000e\u0012\u0004\u0012\u00020h\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bV\u0010R\"$\u0010o\u001a\u000e\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020\b0\u0000*\u00020l8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010n\" \u0010p\u001a\u000e\u0012\u0004\u0012\u00020m\u0012\u0004\u0012\u00020\b0\r8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\bW\u0010R\"$\u0010t\u001a\u000e\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020\b0\u0000*\u00020q8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010s\" \u0010u\u001a\u000e\u0012\u0004\u0012\u00020r\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bA\u0010R\"$\u0010y\u001a\u000e\u0012\u0004\u0012\u00020w\u0012\u0004\u0012\u00020\b0\u0000*\u00020v8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010x\" \u0010z\u001a\u000e\u0012\u0004\u0012\u00020w\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bE\u0010\u0014\"$\u0010~\u001a\u000e\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020\b0\u0000*\u00020{8AX\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000e\u0010}\" \u0010\u007f\u001a\u000e\u0012\u0004\u0012\u00020|\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b@\u0010\u0014\"(\u0010\u0083\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0081\u0001\u0012\u0004\u0012\u00020\b0\u0000*\u00030\u0080\u00018AX\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0013\u0010\u0082\u0001\"\"\u0010\u0084\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0081\u0001\u0012\u0004\u0012\u00020\b0\u00008\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b1\u0010\u0014\"(\u0010\u0088\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0086\u0001\u0012\u0004\u0012\u00020\b0\u0000*\u00030\u0085\u00018CX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u000e\u0010\u0087\u0001\"\"\u0010\u0089\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0086\u0001\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b7\u0010R\"(\u0010\u008d\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u008b\u0001\u0012\u0004\u0012\u00020\b0\u0000*\u00030\u008a\u00018CX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0013\u0010\u008c\u0001\"\"\u0010\u008e\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u008b\u0001\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b/\u0010R\"(\u0010\u0092\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0090\u0001\u0012\u0004\u0012\u00020\b0\u0000*\u00030\u008f\u00018CX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0019\u0010\u0091\u0001\"\"\u0010\u0093\u0001\u001a\u000f\u0012\u0005\u0012\u00030\u0090\u0001\u0012\u0004\u0012\u00020\b0\r8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b5\u0010R"}, d2 = {"Lo/parseManyDecDigits;", "T", "Original", "Saveable", "p0", "p1", "Lo/JavaDoubleBitsFromCharSequence;", "p2", "", "write", "(Ljava/lang/Object;Lo/parseManyDecDigits;Lo/JavaDoubleBitsFromCharSequence;)Ljava/lang/Object;", "Lkotlin/Function2;", "Lkotlin/Function1;", "Lo/_addImplicitFactoryCreators;", "read", "(Lo/MagicModuleSubmissionRequestBody;Lo/getAnswerMap;)Lo/_addImplicitFactoryCreators;", "onRemoveQueueItemAt", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lo/AbstractDeserializer;", "RemoteActionCompatParcelizer", "Lo/parseManyDecDigits;", "()Lo/parseManyDecDigits;", "", "Lo/AbstractDeserializer$AudioAttributesCompatParcelizer;", "AudioAttributesCompatParcelizer", "IconCompatParcelizer", "Lo/handleUnknownProperties;", "onRemoveQueueItem", "Lo/handleUnknownVanilla;", "onPrepareFromUri", "Lo/_deserializeFromObjectId$IconCompatParcelizer;", "MediaDescriptionCompat", "MediaBrowserCompatCustomActionResultReceiver", "Lo/_deserializeFromObjectId$read;", "MediaBrowserCompatItemReceiver", "Lo/_findCustomCollectionLikeDeserializer;", "onCommand", "AudioAttributesImplApi26Parcelizer", "Lo/_findPropertyUnwrapper;", "onFastForward", "AudioAttributesImplBaseParcelizer", "Lo/deserializeFromEmbedded;", "onPlayFromSearch", "AudioAttributesImplApi21Parcelizer", "Lo/renameAll$AudioAttributesCompatParcelizer;", "Lo/renameAll;", "(Lo/renameAll$AudioAttributesCompatParcelizer;)Lo/parseManyDecDigits;", "MediaBrowserCompatSearchResultReceiver", "onMediaButtonEvent", "MediaBrowserCompatMediaItem", "Lo/CreatorCandidate$RemoteActionCompatParcelizer;", "Lo/CreatorCandidate;", "(Lo/CreatorCandidate$RemoteActionCompatParcelizer;)Lo/parseManyDecDigits;", "RatingCompat", "onPlayFromMediaId", "MediaMetadataCompat", "Lo/withProperty$IconCompatParcelizer;", "Lo/withProperty;", "(Lo/withProperty$IconCompatParcelizer;)Lo/parseManyDecDigits;", "onPlayFromUri", "onCustomAction", "Lo/getDataStream$RemoteActionCompatParcelizer;", "Lo/getDataStream;", "(Lo/getDataStream$RemoteActionCompatParcelizer;)Lo/parseManyDecDigits;", "handleMediaPlayPauseIfPendingOnHandler", "onAddQueueItem", "Lo/_find2ViaAlias$AudioAttributesCompatParcelizer;", "Lo/_find2ViaAlias;", "(Lo/_find2ViaAlias$AudioAttributesCompatParcelizer;)Lo/parseManyDecDigits;", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "Lo/findProperty$write;", "Lo/findProperty;", "(Lo/findProperty$write;)Lo/parseManyDecDigits;", "onPrepareFromMediaId", "onPause", "Lo/nopInstance$AudioAttributesCompatParcelizer;", "Lo/nopInstance;", "(Lo/nopInstance$AudioAttributesCompatParcelizer;)Lo/parseManyDecDigits;", "onPlay", "Lo/switchToNext$AudioAttributesCompatParcelizer;", "Lo/switchToNext;", "(Lo/switchToNext$AudioAttributesCompatParcelizer;)Lo/parseManyDecDigits;", "Lo/_addImplicitFactoryCreators;", "Lo/assignIndexes$IconCompatParcelizer;", "Lo/assignIndexes;", "(Lo/assignIndexes$IconCompatParcelizer;)Lo/parseManyDecDigits;", "onPrepare", "onPrepareFromSearch", "Lo/withCaseInsensitivity$read;", "Lo/withCaseInsensitivity;", "(Lo/withCaseInsensitivity$read;)Lo/parseManyDecDigits;", "Lo/_findWithAlias$IconCompatParcelizer;", "Lo/_findWithAlias;", "(Lo/_findWithAlias$IconCompatParcelizer;)Lo/parseManyDecDigits;", "onRewind", "Lo/withValueDeserializer$IconCompatParcelizer;", "Lo/withValueDeserializer;", "(Lo/withValueDeserializer$IconCompatParcelizer;)Lo/parseManyDecDigits;", "onSeekTo", "Lo/_findFormat$AudioAttributesCompatParcelizer;", "Lo/_findFormat;", "(Lo/_findFormat$AudioAttributesCompatParcelizer;)Lo/parseManyDecDigits;", "onSetCaptioningEnabled", "Lo/ReadableObjectIdReferring$AudioAttributesCompatParcelizer;", "Lo/ReadableObjectIdReferring;", "(Lo/ReadableObjectIdReferring$AudioAttributesCompatParcelizer;)Lo/parseManyDecDigits;", "onSetRepeatMode", "onSetRating", "Lo/processUnwrapped$read;", "Lo/processUnwrapped;", "(Lo/processUnwrapped$read;)Lo/parseManyDecDigits;", "onSetPlaybackSpeed", "onSetShuffleMode", "Lo/getReferencedType$RemoteActionCompatParcelizer;", "Lo/getReferencedType;", "(Lo/getReferencedType$RemoteActionCompatParcelizer;)Lo/parseManyDecDigits;", "onSkipToQueueItem", "onStop", "Lo/canCreateFromBoolean$read;", "Lo/canCreateFromBoolean;", "(Lo/canCreateFromBoolean$read;)Lo/parseManyDecDigits;", "onSkipToNext", "setSessionImpl", "Lo/canCreateFromInt$write;", "Lo/canCreateFromInt;", "(Lo/canCreateFromInt$write;)Lo/parseManyDecDigits;", "onSkipToPrevious", "PlaybackStateCompat", "Lo/find$AudioAttributesCompatParcelizer;", "Lo/find;", "(Lo/find$AudioAttributesCompatParcelizer;)Lo/parseManyDecDigits;", "ParcelableVolumeInfo", "MediaSessionCompatToken", "Lo/find$IconCompatParcelizer$RemoteActionCompatParcelizer;", "Lo/find$IconCompatParcelizer;", "(Lo/find$IconCompatParcelizer$RemoteActionCompatParcelizer;)Lo/parseManyDecDigits;", "MediaSessionCompatQueueItem", "MediaSessionCompatResultReceiverWrapper", "Lo/find$write$write;", "Lo/find$write;", "(Lo/find$write$write;)Lo/parseManyDecDigits;", "r8lambdaKUbBm7ckfqTc9QCgukC86fguu4", "r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM", "Lo/find$read$IconCompatParcelizer;", "Lo/find$read;", "(Lo/find$read$IconCompatParcelizer;)Lo/parseManyDecDigits;", "PlaybackStateCompatCustomAction", "ResultReceiver"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class _findRemappedType {
    private static final parseManyDecDigits<AbstractDeserializer, Object> RemoteActionCompatParcelizer = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o._hasCreatorAnnotation
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.IconCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (AbstractDeserializer) obj2);
        }
    }, new getAnswerMap() { // from class: o.createEnumDeserializer
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.onRemoveQueueItem(obj);
        }
    });
    private static final parseManyDecDigits<List<AbstractDeserializer.AudioAttributesCompatParcelizer<? extends Object>>, Object> write = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.constructEnumNamingStrategyResolver
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.AudioAttributesCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (List) obj2);
        }
    }, new getAnswerMap() { // from class: o.findContentDeserializerFromAnnotation
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.onSeekTo(obj);
        }
    });
    private static final parseManyDecDigits<AbstractDeserializer.AudioAttributesCompatParcelizer<? extends Object>, Object> read = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.addImplicitFactoryCandidate
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.IconCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (AbstractDeserializer.AudioAttributesCompatParcelizer) obj2);
        }
    }, new getAnswerMap() { // from class: o._creatorReturnedNullException
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.onPrepareFromUri(obj);
        }
    });
    private static final parseManyDecDigits<handleUnknownProperties, Object> onRemoveQueueItem = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.vanillaDeserialize
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.IconCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (handleUnknownProperties) obj2);
        }
    }, new getAnswerMap() { // from class: o._deserializeWithExternalTypeId
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.accessaddObserverForBackInvoker(obj);
        }
    });
    private static final parseManyDecDigits<handleUnknownVanilla, Object> onPrepareFromUri = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o._deserializeWithErrorWrapping
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.write((JavaDoubleBitsFromCharSequence) obj, (handleUnknownVanilla) obj2);
        }
    }, new getAnswerMap() { // from class: o.asArrayDeserializer
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.accessgetReportFullyDrawnExecutorp(obj);
        }
    });
    private static final parseManyDecDigits<_deserializeFromObjectId.IconCompatParcelizer, Object> MediaDescriptionCompat = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o._validateNamedPropertyParameter
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.write((JavaDoubleBitsFromCharSequence) obj, (_deserializeFromObjectId.IconCompatParcelizer) obj2);
        }
    }, new getAnswerMap() { // from class: o.findDefaultDeserializer
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.MediaSessionCompatToken(obj);
        }
    });
    private static final parseManyDecDigits<_deserializeFromObjectId.read, Object> AudioAttributesCompatParcelizer = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.withConfig
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.AudioAttributesCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (_deserializeFromObjectId.read) obj2);
        }
    }, new getAnswerMap() { // from class: o.hasExplicitFactories
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.onSetRating(obj);
        }
    });
    private static final parseManyDecDigits<_findCustomCollectionLikeDeserializer, Object> onCommand = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o._deserializeUsingPropertyBased
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.RemoteActionCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (_findCustomCollectionLikeDeserializer) obj2);
        }
    }, new getAnswerMap() { // from class: o.deserializeFromNull
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.ParcelableVolumeInfo(obj);
        }
    });
    private static final parseManyDecDigits<_findPropertyUnwrapper, Object> onFastForward = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.deserializeFromObject
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.read((JavaDoubleBitsFromCharSequence) obj, (_findPropertyUnwrapper) obj2);
        }
    }, new getAnswerMap() { // from class: o.deserializeUsingPropertyBasedWithExternalTypeId
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.ResultReceiver(obj);
        }
    });
    private static final parseManyDecDigits<deserializeFromEmbedded, Object> onPlayFromSearch = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.deserializeUsingPropertyBasedWithUnwrapped
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.read((JavaDoubleBitsFromCharSequence) obj, (deserializeFromEmbedded) obj2);
        }
    }, new getAnswerMap() { // from class: o._mapAbstractMapType
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType._init_lambda2(obj);
        }
    });
    private static final parseManyDecDigits<renameAll, Object> onMediaButtonEvent = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.findOptionalStdDeserializer
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.AudioAttributesCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (renameAll) obj2);
        }
    }, new getAnswerMap() { // from class: o.findCollectionFallback
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw(obj);
        }
    });
    private static final parseManyDecDigits<CreatorCandidate, Object> onPlayFromMediaId = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o._deserializeOther
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.AudioAttributesCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (CreatorCandidate) obj2);
        }
    }, new getAnswerMap() { // from class: o.deserializeWithExternalTypeId
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(obj);
        }
    });
    private static final parseManyDecDigits<withProperty, Object> onPlayFromUri = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.deserializeWithUnwrapped
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.RemoteActionCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (withProperty) obj2);
        }
    }, new getAnswerMap() { // from class: o.withBeanProperties
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28(obj);
        }
    });
    private static final parseManyDecDigits<getDataStream, Object> MediaBrowserCompatCustomActionResultReceiver = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.withObjectIdReader
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.IconCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (getDataStream) obj2);
        }
    }, new getAnswerMap() { // from class: o._mapAbstractCollectionType
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.onSetPlaybackSpeed(obj);
        }
    });
    private static final parseManyDecDigits<_find2ViaAlias, Object> IconCompatParcelizer = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o._reportUnwrappedCreatorProperty
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.AudioAttributesCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (_find2ViaAlias) obj2);
        }
    }, new getAnswerMap() { // from class: o.createArrayDeserializer
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.onSetRepeatMode(obj);
        }
    });
    private static final parseManyDecDigits<findProperty, Object> onPrepareFromMediaId = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o._valueInstantiatorInstance
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.read((JavaDoubleBitsFromCharSequence) obj, (findProperty) obj2);
        }
    }, new getAnswerMap() { // from class: o.constructCreatorProperty
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType._init_lambda3(obj);
        }
    });
    private static final parseManyDecDigits<nopInstance, Object> onCustomAction = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.constructEnumResolver
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.AudioAttributesCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (nopInstance) obj2);
        }
    }, new getAnswerMap() { // from class: o.createCollectionLikeDeserializer
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.PlaybackStateCompatCustomAction(obj);
        }
    });
    private static final _addImplicitFactoryCreators<switchToNext, Object> MediaBrowserCompatItemReceiver = read(write.IconCompatParcelizer, read.AudioAttributesCompatParcelizer);
    private static final _addImplicitFactoryCreators<assignIndexes, Object> onPause = read(new MagicModuleSubmissionRequestBody() { // from class: o.createKeyDeserializer
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.AudioAttributesCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (assignIndexes) obj2);
        }
    }, new getAnswerMap() { // from class: o.createMapDeserializer
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.r8lambdaKUbBm7ckfqTc9QCgukC86fguu4(obj);
        }
    });
    private static final _addImplicitFactoryCreators<withCaseInsensitivity, Object> onPlay = read(new MagicModuleSubmissionRequestBody() { // from class: o.createCollectionDeserializer
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.read((JavaDoubleBitsFromCharSequence) obj, (withCaseInsensitivity) obj2);
        }
    }, new getAnswerMap() { // from class: o.createTreeDeserializer
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(obj);
        }
    });
    private static final _addImplicitFactoryCreators<_findWithAlias, Object> AudioAttributesImplApi21Parcelizer = read(new MagicModuleSubmissionRequestBody() { // from class: o.createReferenceDeserializer
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.read((JavaDoubleBitsFromCharSequence) obj, (_findWithAlias) obj2);
        }
    }, new getAnswerMap() { // from class: o.createMapLikeDeserializer
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.onSkipToPrevious(obj);
        }
    });
    private static final parseManyDecDigits<withValueDeserializer, Object> AudioAttributesImplBaseParcelizer = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.findPropertyTypeDeserializer
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.AudioAttributesCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (withValueDeserializer) obj2);
        }
    }, new getAnswerMap() { // from class: o.findDeserializerFromAnnotation
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.onSetCaptioningEnabled(obj);
        }
    });
    private static final parseManyDecDigits<_findFormat, Object> AudioAttributesImplApi26Parcelizer = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.findPropertyContentTypeDeserializer
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.write((JavaDoubleBitsFromCharSequence) obj, (_findFormat) obj2);
        }
    }, new getAnswerMap() { // from class: o.findKeyDeserializerFromAnnotation
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.onSetShuffleMode(obj);
        }
    });
    private static final _addImplicitFactoryCreators<ReadableObjectIdReferring, Object> onPrepare = read(new MagicModuleSubmissionRequestBody() { // from class: o.BasicDeserializerFactoryContainerDefaultMappings
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.RemoteActionCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (ReadableObjectIdReferring) obj2);
        }
    }, new getAnswerMap() { // from class: o.BasicDeserializerFactory1
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0(obj);
        }
    });
    private static final _addImplicitFactoryCreators<processUnwrapped, Object> onPrepareFromSearch = read(new MagicModuleSubmissionRequestBody() { // from class: o.resolveMemberAndTypeAnnotations
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.AudioAttributesCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (processUnwrapped) obj2);
        }
    }, new getAnswerMap() { // from class: o.mapAbstractType
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.accessensureViewModelStore(obj);
        }
    });
    private static final _addImplicitFactoryCreators<getReferencedType, Object> onAddQueueItem = read(new MagicModuleSubmissionRequestBody() { // from class: o.addImplicitConstructorCandidate
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.RemoteActionCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (getReferencedType) obj2);
        }
    }, new getAnswerMap() { // from class: o.BasicDeserializerFactoryCreatorCollectionState
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.PlaybackStateCompat(obj);
        }
    });
    private static final parseManyDecDigits<canCreateFromBoolean, Object> MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.findMapFallback
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.RemoteActionCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (canCreateFromBoolean) obj2);
        }
    }, new getAnswerMap() { // from class: o.hasImplicitConstructorCandidates
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.MediaSessionCompatResultReceiverWrapper(obj);
        }
    });
    private static final parseManyDecDigits<canCreateFromInt, Object> handleMediaPlayPauseIfPendingOnHandler = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.hasImplicitFactoryCandidates
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.RemoteActionCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (canCreateFromInt) obj2);
        }
    }, new getAnswerMap() { // from class: o.annotationIntrospector
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.MediaSessionCompatQueueItem(obj);
        }
    });
    private static final parseManyDecDigits<find, Object> MediaBrowserCompatMediaItem = JavaDoubleBitsFromByteArray.RemoteActionCompatParcelizer(new MagicModuleSubmissionRequestBody() { // from class: o.hasExplicitConstructors
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.write((JavaDoubleBitsFromCharSequence) obj, (find) obj2);
        }
    }, new getAnswerMap() { // from class: o.increaseExplicitConstructorCount
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.setSessionImpl(obj);
        }
    });
    private static final _addImplicitFactoryCreators<find.IconCompatParcelizer, Object> MediaMetadataCompat = read(new MagicModuleSubmissionRequestBody() { // from class: o.BeanDeserializer
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.IconCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (find.IconCompatParcelizer) obj2);
        }
    }, new getAnswerMap() { // from class: o.increaseExplicitFactoryCount
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.onSkipToNext(obj);
        }
    });
    private static final _addImplicitFactoryCreators<find.write, Object> MediaBrowserCompatSearchResultReceiver = read(new MagicModuleSubmissionRequestBody() { // from class: o.implicitFactoryCandidates
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.AudioAttributesCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (find.write) obj2);
        }
    }, new getAnswerMap() { // from class: o.implicitConstructorCandidates
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.onSkipToQueueItem(obj);
        }
    });
    private static final _addImplicitFactoryCreators<find.read, Object> RatingCompat = read(new MagicModuleSubmissionRequestBody() { // from class: o._deserializeFromArray
        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final Object invoke(Object obj, Object obj2) {
            return _findRemappedType.IconCompatParcelizer((JavaDoubleBitsFromCharSequence) obj, (find.read) obj2);
        }
    }, new getAnswerMap() { // from class: o.handleUnresolvedReference
        @Override // kotlin.getAnswerMap
        public final Object invoke(Object obj) {
            return _findRemappedType.onStop(obj);
        }
    });

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] write;

        static {
            int[] iArr = new int[withSerializerModifier.values().length];
            try {
                iArr[withSerializerModifier.AudioAttributesCompatParcelizer.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[withSerializerModifier.write.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[withSerializerModifier.AudioAttributesImplApi21Parcelizer.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[withSerializerModifier.MediaBrowserCompatCustomActionResultReceiver.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[withSerializerModifier.RemoteActionCompatParcelizer.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[withSerializerModifier.read.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[withSerializerModifier.IconCompatParcelizer.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            write = iArr;
        }
    }

    public static final <T> T onRemoveQueueItemAt(T t) {
        return t;
    }

    public static final <T extends parseManyDecDigits<Original, Saveable>, Original, Saveable> Object write(Original original, T t, JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence) {
        Object objAudioAttributesCompatParcelizer;
        return (original == null || (objAudioAttributesCompatParcelizer = t.AudioAttributesCompatParcelizer(javaDoubleBitsFromCharSequence, original)) == null) ? Boolean.FALSE : objAudioAttributesCompatParcelizer;
    }

    /* JADX INFO: Add missing generic type declarations: [Saveable, Original] */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u001d\u0010\u0004\u001a\u0004\u0018\u00018\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u0016¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\u0006\u001a\u0004\u0018\u00018\u00002\u0006\u0010\u0003\u001a\u00028\u0001H\u0016¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lo/_findRemappedType$RemoteActionCompatParcelizer;", "Lo/_addImplicitFactoryCreators;", "Lo/JavaDoubleBitsFromCharSequence;", "p0", "AudioAttributesCompatParcelizer", "(Lo/JavaDoubleBitsFromCharSequence;Ljava/lang/Object;)Ljava/lang/Object;", "IconCompatParcelizer", "(Ljava/lang/Object;)Ljava/lang/Object;"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RemoteActionCompatParcelizer<Original, Saveable> implements _addImplicitFactoryCreators<Original, Saveable> {
        final /* synthetic */ MagicModuleSubmissionRequestBody<JavaDoubleBitsFromCharSequence, Original, Saveable> read;
        final /* synthetic */ getAnswerMap<Saveable, Original> write;

        /* JADX WARN: Multi-variable type inference failed */
        RemoteActionCompatParcelizer(MagicModuleSubmissionRequestBody<? super JavaDoubleBitsFromCharSequence, ? super Original, ? extends Saveable> magicModuleSubmissionRequestBody, getAnswerMap<? super Saveable, ? extends Original> getanswermap) {
            this.read = magicModuleSubmissionRequestBody;
            this.write = getanswermap;
        }

        @Override // kotlin.parseManyDecDigits
        public final Saveable AudioAttributesCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, Original original) {
            return this.read.invoke(javaDoubleBitsFromCharSequence, original);
        }

        @Override // kotlin.parseManyDecDigits
        public final Original IconCompatParcelizer(Saveable p0) {
            return this.write.invoke(p0);
        }
    }

    private static final <Original, Saveable> _addImplicitFactoryCreators<Original, Saveable> read(MagicModuleSubmissionRequestBody<? super JavaDoubleBitsFromCharSequence, ? super Original, ? extends Saveable> magicModuleSubmissionRequestBody, getAnswerMap<? super Saveable, ? extends Original> getanswermap) {
        return new RemoteActionCompatParcelizer(magicModuleSubmissionRequestBody, getanswermap);
    }

    public static final parseManyDecDigits<AbstractDeserializer, Object> read() {
        return RemoteActionCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IconCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, AbstractDeserializer abstractDeserializer) {
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(onRemoveQueueItemAt(abstractDeserializer.getIconCompatParcelizer()), write(abstractDeserializer.write(), write, javaDoubleBitsFromCharSequence));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractDeserializer onRemoveQueueItem(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        List list = (List) obj;
        Object obj2 = list.get(1);
        parseManyDecDigits<List<AbstractDeserializer.AudioAttributesCompatParcelizer<? extends Object>>, Object> parsemanydecdigits = write;
        List<AbstractDeserializer.AudioAttributesCompatParcelizer<? extends Object>> listIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj2, Boolean.FALSE) || (parsemanydecdigits instanceof _addImplicitFactoryCreators)) && obj2 != null) ? parsemanydecdigits.IconCompatParcelizer(obj2) : null;
        Object obj3 = list.get(0);
        String str = obj3 != null ? (String) obj3 : null;
        toMagicModuleMetaRepoModel.write((Object) str);
        return new AbstractDeserializer(listIconCompatParcelizer, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List onSeekTo(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            ArrayList arrayList2 = arrayList;
            parseManyDecDigits<AbstractDeserializer.AudioAttributesCompatParcelizer<? extends Object>, Object> parsemanydecdigits = read;
            AbstractDeserializer.AudioAttributesCompatParcelizer<? extends Object> audioAttributesCompatParcelizerIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj2, Boolean.FALSE) || (parsemanydecdigits instanceof _addImplicitFactoryCreators)) && obj2 != null) ? parsemanydecdigits.IconCompatParcelizer(obj2) : null;
            toMagicModuleMetaRepoModel.write(audioAttributesCompatParcelizerIconCompatParcelizer);
            arrayList2.add(audioAttributesCompatParcelizerIconCompatParcelizer);
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IconCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, AbstractDeserializer.AudioAttributesCompatParcelizer audioAttributesCompatParcelizer) {
        withSerializerModifier withserializermodifier;
        Object objWrite;
        Object objIconCompatParcelizer = audioAttributesCompatParcelizer.IconCompatParcelizer();
        if (objIconCompatParcelizer instanceof _findCustomCollectionLikeDeserializer) {
            withserializermodifier = withSerializerModifier.AudioAttributesCompatParcelizer;
        } else if (objIconCompatParcelizer instanceof _findPropertyUnwrapper) {
            withserializermodifier = withSerializerModifier.write;
        } else if (objIconCompatParcelizer instanceof handleUnknownProperties) {
            withserializermodifier = withSerializerModifier.AudioAttributesImplApi21Parcelizer;
        } else if (objIconCompatParcelizer instanceof handleUnknownVanilla) {
            withserializermodifier = withSerializerModifier.MediaBrowserCompatCustomActionResultReceiver;
        } else if (objIconCompatParcelizer instanceof _deserializeFromObjectId.IconCompatParcelizer) {
            withserializermodifier = withSerializerModifier.RemoteActionCompatParcelizer;
        } else if (objIconCompatParcelizer instanceof _deserializeFromObjectId.read) {
            withserializermodifier = withSerializerModifier.read;
        } else {
            if (!(objIconCompatParcelizer instanceof _handleByNameInclusion)) {
                throw new UnsupportedOperationException();
            }
            withserializermodifier = withSerializerModifier.IconCompatParcelizer;
        }
        switch (WhenMappings.write[withserializermodifier.ordinal()]) {
            case 1:
                Object objIconCompatParcelizer2 = audioAttributesCompatParcelizer.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.read(objIconCompatParcelizer2, "");
                objWrite = write((_findCustomCollectionLikeDeserializer) objIconCompatParcelizer2, onCommand, javaDoubleBitsFromCharSequence);
                break;
            case 2:
                Object objIconCompatParcelizer3 = audioAttributesCompatParcelizer.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.read(objIconCompatParcelizer3, "");
                objWrite = write((_findPropertyUnwrapper) objIconCompatParcelizer3, onFastForward, javaDoubleBitsFromCharSequence);
                break;
            case 3:
                Object objIconCompatParcelizer4 = audioAttributesCompatParcelizer.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.read(objIconCompatParcelizer4, "");
                objWrite = write((handleUnknownProperties) objIconCompatParcelizer4, onRemoveQueueItem, javaDoubleBitsFromCharSequence);
                break;
            case 4:
                Object objIconCompatParcelizer5 = audioAttributesCompatParcelizer.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.read(objIconCompatParcelizer5, "");
                objWrite = write((handleUnknownVanilla) objIconCompatParcelizer5, onPrepareFromUri, javaDoubleBitsFromCharSequence);
                break;
            case 5:
                Object objIconCompatParcelizer6 = audioAttributesCompatParcelizer.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.read(objIconCompatParcelizer6, "");
                objWrite = write((_deserializeFromObjectId.IconCompatParcelizer) objIconCompatParcelizer6, MediaDescriptionCompat, javaDoubleBitsFromCharSequence);
                break;
            case 6:
                Object objIconCompatParcelizer7 = audioAttributesCompatParcelizer.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.read(objIconCompatParcelizer7, "");
                objWrite = write((_deserializeFromObjectId.read) objIconCompatParcelizer7, AudioAttributesCompatParcelizer, javaDoubleBitsFromCharSequence);
                break;
            case 7:
                Object objIconCompatParcelizer8 = audioAttributesCompatParcelizer.IconCompatParcelizer();
                toMagicModuleMetaRepoModel.read(objIconCompatParcelizer8, "");
                objWrite = onRemoveQueueItemAt(((_handleByNameInclusion) objIconCompatParcelizer8).getRemoteActionCompatParcelizer());
                break;
            default:
                throw new RenewEligibleCreator();
        }
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(onRemoveQueueItemAt(withserializermodifier), objWrite, onRemoveQueueItemAt(Integer.valueOf(audioAttributesCompatParcelizer.AudioAttributesImplBaseParcelizer())), onRemoveQueueItemAt(Integer.valueOf(audioAttributesCompatParcelizer.getAudioAttributesCompatParcelizer())), onRemoveQueueItemAt(audioAttributesCompatParcelizer.getRemoteActionCompatParcelizer()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final AbstractDeserializer.AudioAttributesCompatParcelizer onPrepareFromUri(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        List list = (List) obj;
        Boolean bool = Boolean.FALSE;
        Object obj2 = list.get(0);
        _findCustomCollectionLikeDeserializer _findcustomcollectionlikedeserializerIconCompatParcelizer = null;
        readVarIconCompatParcelizer = null;
        _deserializeFromObjectId.read readVarIconCompatParcelizer = null;
        IconCompatParcelizer = null;
        _deserializeFromObjectId.IconCompatParcelizer IconCompatParcelizer2 = null;
        handleunknownvanillaIconCompatParcelizer = null;
        handleUnknownVanilla handleunknownvanillaIconCompatParcelizer = null;
        handleunknownpropertiesIconCompatParcelizer = null;
        handleUnknownProperties handleunknownpropertiesIconCompatParcelizer = null;
        _findpropertyunwrapperIconCompatParcelizer = null;
        _findPropertyUnwrapper _findpropertyunwrapperIconCompatParcelizer = null;
        _findcustomcollectionlikedeserializerIconCompatParcelizer = null;
        withSerializerModifier withserializermodifier = obj2 != null ? (withSerializerModifier) obj2 : null;
        toMagicModuleMetaRepoModel.write(withserializermodifier);
        Object obj3 = list.get(2);
        Integer num = obj3 != null ? (Integer) obj3 : null;
        toMagicModuleMetaRepoModel.write(num);
        int iIntValue = num.intValue();
        Object obj4 = list.get(3);
        Integer num2 = obj4 != null ? (Integer) obj4 : null;
        toMagicModuleMetaRepoModel.write(num2);
        int iIntValue2 = num2.intValue();
        Object obj5 = list.get(4);
        String str = obj5 != null ? (String) obj5 : null;
        toMagicModuleMetaRepoModel.write((Object) str);
        switch (WhenMappings.write[withserializermodifier.ordinal()]) {
            case 1:
                Object obj6 = list.get(1);
                parseManyDecDigits<_findCustomCollectionLikeDeserializer, Object> parsemanydecdigits = onCommand;
                if ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj6, bool) || (parsemanydecdigits instanceof _addImplicitFactoryCreators)) && obj6 != null) {
                    _findcustomcollectionlikedeserializerIconCompatParcelizer = parsemanydecdigits.IconCompatParcelizer(obj6);
                }
                toMagicModuleMetaRepoModel.write(_findcustomcollectionlikedeserializerIconCompatParcelizer);
                return new AbstractDeserializer.AudioAttributesCompatParcelizer(_findcustomcollectionlikedeserializerIconCompatParcelizer, iIntValue, iIntValue2, str);
            case 2:
                Object obj7 = list.get(1);
                parseManyDecDigits<_findPropertyUnwrapper, Object> parsemanydecdigits2 = onFastForward;
                if ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj7, bool) || (parsemanydecdigits2 instanceof _addImplicitFactoryCreators)) && obj7 != null) {
                    _findpropertyunwrapperIconCompatParcelizer = parsemanydecdigits2.IconCompatParcelizer(obj7);
                }
                toMagicModuleMetaRepoModel.write(_findpropertyunwrapperIconCompatParcelizer);
                return new AbstractDeserializer.AudioAttributesCompatParcelizer(_findpropertyunwrapperIconCompatParcelizer, iIntValue, iIntValue2, str);
            case 3:
                Object obj8 = list.get(1);
                parseManyDecDigits<handleUnknownProperties, Object> parsemanydecdigits3 = onRemoveQueueItem;
                if ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj8, bool) || (parsemanydecdigits3 instanceof _addImplicitFactoryCreators)) && obj8 != null) {
                    handleunknownpropertiesIconCompatParcelizer = parsemanydecdigits3.IconCompatParcelizer(obj8);
                }
                toMagicModuleMetaRepoModel.write(handleunknownpropertiesIconCompatParcelizer);
                return new AbstractDeserializer.AudioAttributesCompatParcelizer(handleunknownpropertiesIconCompatParcelizer, iIntValue, iIntValue2, str);
            case 4:
                Object obj9 = list.get(1);
                parseManyDecDigits<handleUnknownVanilla, Object> parsemanydecdigits4 = onPrepareFromUri;
                if ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj9, bool) || (parsemanydecdigits4 instanceof _addImplicitFactoryCreators)) && obj9 != null) {
                    handleunknownvanillaIconCompatParcelizer = parsemanydecdigits4.IconCompatParcelizer(obj9);
                }
                toMagicModuleMetaRepoModel.write(handleunknownvanillaIconCompatParcelizer);
                return new AbstractDeserializer.AudioAttributesCompatParcelizer(handleunknownvanillaIconCompatParcelizer, iIntValue, iIntValue2, str);
            case 5:
                Object obj10 = list.get(1);
                parseManyDecDigits<_deserializeFromObjectId.IconCompatParcelizer, Object> parsemanydecdigits5 = MediaDescriptionCompat;
                if ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj10, bool) || (parsemanydecdigits5 instanceof _addImplicitFactoryCreators)) && obj10 != null) {
                    IconCompatParcelizer2 = parsemanydecdigits5.IconCompatParcelizer(obj10);
                }
                toMagicModuleMetaRepoModel.write(IconCompatParcelizer2);
                return new AbstractDeserializer.AudioAttributesCompatParcelizer(IconCompatParcelizer2, iIntValue, iIntValue2, str);
            case 6:
                Object obj11 = list.get(1);
                parseManyDecDigits<_deserializeFromObjectId.read, Object> parsemanydecdigits6 = AudioAttributesCompatParcelizer;
                if ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj11, bool) || (parsemanydecdigits6 instanceof _addImplicitFactoryCreators)) && obj11 != null) {
                    readVarIconCompatParcelizer = parsemanydecdigits6.IconCompatParcelizer(obj11);
                }
                toMagicModuleMetaRepoModel.write(readVarIconCompatParcelizer);
                return new AbstractDeserializer.AudioAttributesCompatParcelizer(readVarIconCompatParcelizer, iIntValue, iIntValue2, str);
            case 7:
                Object obj12 = list.get(1);
                String str2 = obj12 != null ? (String) obj12 : null;
                toMagicModuleMetaRepoModel.write((Object) str2);
                return new AbstractDeserializer.AudioAttributesCompatParcelizer(_handleByNameInclusion.read(_handleByNameInclusion.RemoteActionCompatParcelizer(str2)), iIntValue, iIntValue2, str);
            default:
                throw new RenewEligibleCreator();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IconCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, handleUnknownProperties handleunknownproperties) {
        return onRemoveQueueItemAt(handleunknownproperties.getRead());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object write(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, handleUnknownVanilla handleunknownvanilla) {
        return onRemoveQueueItemAt(handleunknownvanilla.getRead());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object write(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, _deserializeFromObjectId.IconCompatParcelizer iconCompatParcelizer) {
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(onRemoveQueueItemAt(iconCompatParcelizer.getRemoteActionCompatParcelizer()), write(iconCompatParcelizer.getRead(), onPlayFromSearch, javaDoubleBitsFromCharSequence));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _deserializeFromObjectId.IconCompatParcelizer MediaSessionCompatToken(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        List list = (List) obj;
        Object obj2 = list.get(0);
        deserializeFromEmbedded deserializefromembeddedIconCompatParcelizer = null;
        String str = obj2 != null ? (String) obj2 : null;
        toMagicModuleMetaRepoModel.write((Object) str);
        Object obj3 = list.get(1);
        parseManyDecDigits<deserializeFromEmbedded, Object> parsemanydecdigits = onPlayFromSearch;
        if ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj3, Boolean.FALSE) || (parsemanydecdigits instanceof _addImplicitFactoryCreators)) && obj3 != null) {
            deserializefromembeddedIconCompatParcelizer = parsemanydecdigits.IconCompatParcelizer(obj3);
        }
        return new _deserializeFromObjectId.IconCompatParcelizer(str, deserializefromembeddedIconCompatParcelizer, null, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AudioAttributesCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, _deserializeFromObjectId.read readVar) {
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(onRemoveQueueItemAt(readVar.getIconCompatParcelizer()), write(readVar.getRead(), onPlayFromSearch, javaDoubleBitsFromCharSequence));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _deserializeFromObjectId.read onSetRating(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        List list = (List) obj;
        Object obj2 = list.get(0);
        String str = obj2 != null ? (String) obj2 : null;
        toMagicModuleMetaRepoModel.write((Object) str);
        Object obj3 = list.get(1);
        parseManyDecDigits<deserializeFromEmbedded, Object> parsemanydecdigits = onPlayFromSearch;
        return new _deserializeFromObjectId.read(str, ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj3, Boolean.FALSE) || (parsemanydecdigits instanceof _addImplicitFactoryCreators)) && obj3 != null) ? parsemanydecdigits.IconCompatParcelizer(obj3) : null, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object RemoteActionCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, _findCustomCollectionLikeDeserializer _findcustomcollectionlikedeserializer) {
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(write(assignIndexes.write(_findcustomcollectionlikedeserializer.getWrite()), RemoteActionCompatParcelizer(assignIndexes.INSTANCE), javaDoubleBitsFromCharSequence), write(withCaseInsensitivity.read(_findcustomcollectionlikedeserializer.getIconCompatParcelizer()), AudioAttributesCompatParcelizer(withCaseInsensitivity.INSTANCE), javaDoubleBitsFromCharSequence), write(ReadableObjectIdReferring.read(_findcustomcollectionlikedeserializer.getRead()), RemoteActionCompatParcelizer(ReadableObjectIdReferring.INSTANCE), javaDoubleBitsFromCharSequence), write(_findcustomcollectionlikedeserializer.getAudioAttributesCompatParcelizer(), IconCompatParcelizer(withProperty.INSTANCE), javaDoubleBitsFromCharSequence), write(_findcustomcollectionlikedeserializer.getRemoteActionCompatParcelizer(), withByNameInclusion.RemoteActionCompatParcelizer(_findCustomTreeNodeDeserializer.INSTANCE), javaDoubleBitsFromCharSequence), write(_findcustomcollectionlikedeserializer.getAudioAttributesImplApi21Parcelizer(), RemoteActionCompatParcelizer(find.INSTANCE), javaDoubleBitsFromCharSequence), write(findSize.RemoteActionCompatParcelizer(_findcustomcollectionlikedeserializer.getAudioAttributesImplApi26Parcelizer()), withByNameInclusion.AudioAttributesCompatParcelizer(findSize.INSTANCE), javaDoubleBitsFromCharSequence), write(_findWithAlias.AudioAttributesCompatParcelizer(_findcustomcollectionlikedeserializer.getMediaBrowserCompatCustomActionResultReceiver()), IconCompatParcelizer(_findWithAlias.INSTANCE), javaDoubleBitsFromCharSequence), write(_findcustomcollectionlikedeserializer.getAudioAttributesImplBaseParcelizer(), withByNameInclusion.IconCompatParcelizer(findOnlyParamWithoutInjection.INSTANCE), javaDoubleBitsFromCharSequence));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _findCustomCollectionLikeDeserializer ParcelableVolumeInfo(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        List list = (List) obj;
        Boolean bool = Boolean.FALSE;
        Object obj2 = list.get(0);
        parseManyDecDigits<assignIndexes, Object> parsemanydecdigitsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(assignIndexes.INSTANCE);
        findOnlyParamWithoutInjection findonlyparamwithoutinjectionIconCompatParcelizer = null;
        assignIndexes assignindexesIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj2, bool) || (parsemanydecdigitsRemoteActionCompatParcelizer instanceof _addImplicitFactoryCreators)) && obj2 != null) ? parsemanydecdigitsRemoteActionCompatParcelizer.IconCompatParcelizer(obj2) : null;
        toMagicModuleMetaRepoModel.write(assignindexesIconCompatParcelizer);
        int remoteActionCompatParcelizer = assignindexesIconCompatParcelizer.getRemoteActionCompatParcelizer();
        Object obj3 = list.get(1);
        parseManyDecDigits<withCaseInsensitivity, Object> parsemanydecdigitsAudioAttributesCompatParcelizer = AudioAttributesCompatParcelizer(withCaseInsensitivity.INSTANCE);
        withCaseInsensitivity withcaseinsensitivityIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj3, bool) || (parsemanydecdigitsAudioAttributesCompatParcelizer instanceof _addImplicitFactoryCreators)) && obj3 != null) ? parsemanydecdigitsAudioAttributesCompatParcelizer.IconCompatParcelizer(obj3) : null;
        toMagicModuleMetaRepoModel.write(withcaseinsensitivityIconCompatParcelizer);
        int audioAttributesCompatParcelizer = withcaseinsensitivityIconCompatParcelizer.getAudioAttributesCompatParcelizer();
        Object obj4 = list.get(2);
        parseManyDecDigits<ReadableObjectIdReferring, Object> parsemanydecdigitsRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(ReadableObjectIdReferring.INSTANCE);
        ReadableObjectIdReferring readableObjectIdReferringIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj4, bool) || (parsemanydecdigitsRemoteActionCompatParcelizer2 instanceof _addImplicitFactoryCreators)) && obj4 != null) ? parsemanydecdigitsRemoteActionCompatParcelizer2.IconCompatParcelizer(obj4) : null;
        toMagicModuleMetaRepoModel.write(readableObjectIdReferringIconCompatParcelizer);
        long iconCompatParcelizer = readableObjectIdReferringIconCompatParcelizer.getIconCompatParcelizer();
        Object obj5 = list.get(3);
        parseManyDecDigits<withProperty, Object> parsemanydecdigitsIconCompatParcelizer = IconCompatParcelizer(withProperty.INSTANCE);
        withProperty withpropertyIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj5, bool) || (parsemanydecdigitsIconCompatParcelizer instanceof _addImplicitFactoryCreators)) && obj5 != null) ? parsemanydecdigitsIconCompatParcelizer.IconCompatParcelizer(obj5) : null;
        Object obj6 = list.get(4);
        parseManyDecDigits<_findCustomTreeNodeDeserializer, Object> parsemanydecdigitsRemoteActionCompatParcelizer3 = withByNameInclusion.RemoteActionCompatParcelizer(_findCustomTreeNodeDeserializer.INSTANCE);
        _findCustomTreeNodeDeserializer _findcustomtreenodedeserializerIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj6, bool) || (parsemanydecdigitsRemoteActionCompatParcelizer3 instanceof _addImplicitFactoryCreators)) && obj6 != null) ? parsemanydecdigitsRemoteActionCompatParcelizer3.IconCompatParcelizer(obj6) : null;
        Object obj7 = list.get(5);
        parseManyDecDigits<find, Object> parsemanydecdigitsRemoteActionCompatParcelizer4 = RemoteActionCompatParcelizer(find.INSTANCE);
        find findVarIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj7, bool) || (parsemanydecdigitsRemoteActionCompatParcelizer4 instanceof _addImplicitFactoryCreators)) && obj7 != null) ? parsemanydecdigitsRemoteActionCompatParcelizer4.IconCompatParcelizer(obj7) : null;
        Object obj8 = list.get(6);
        parseManyDecDigits<findSize, Object> parsemanydecdigitsAudioAttributesCompatParcelizer2 = withByNameInclusion.AudioAttributesCompatParcelizer(findSize.INSTANCE);
        findSize findsizeIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj8, bool) || (parsemanydecdigitsAudioAttributesCompatParcelizer2 instanceof _addImplicitFactoryCreators)) && obj8 != null) ? parsemanydecdigitsAudioAttributesCompatParcelizer2.IconCompatParcelizer(obj8) : null;
        toMagicModuleMetaRepoModel.write(findsizeIconCompatParcelizer);
        int write2 = findsizeIconCompatParcelizer.getWrite();
        Object obj9 = list.get(7);
        parseManyDecDigits<_findWithAlias, Object> parsemanydecdigitsIconCompatParcelizer2 = IconCompatParcelizer(_findWithAlias.INSTANCE);
        _findWithAlias _findwithaliasIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj9, bool) || (parsemanydecdigitsIconCompatParcelizer2 instanceof _addImplicitFactoryCreators)) && obj9 != null) ? parsemanydecdigitsIconCompatParcelizer2.IconCompatParcelizer(obj9) : null;
        toMagicModuleMetaRepoModel.write(_findwithaliasIconCompatParcelizer);
        int audioAttributesCompatParcelizer2 = _findwithaliasIconCompatParcelizer.getAudioAttributesCompatParcelizer();
        Object obj10 = list.get(8);
        parseManyDecDigits<findOnlyParamWithoutInjection, Object> parsemanydecdigitsIconCompatParcelizer3 = withByNameInclusion.IconCompatParcelizer(findOnlyParamWithoutInjection.INSTANCE);
        if ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj10, bool) || (parsemanydecdigitsIconCompatParcelizer3 instanceof _addImplicitFactoryCreators)) && obj10 != null) {
            findonlyparamwithoutinjectionIconCompatParcelizer = parsemanydecdigitsIconCompatParcelizer3.IconCompatParcelizer(obj10);
        }
        return new _findCustomCollectionLikeDeserializer(remoteActionCompatParcelizer, audioAttributesCompatParcelizer, iconCompatParcelizer, withpropertyIconCompatParcelizer, _findcustomtreenodedeserializerIconCompatParcelizer, findVarIconCompatParcelizer, write2, audioAttributesCompatParcelizer2, findonlyparamwithoutinjectionIconCompatParcelizer, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object read(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, _findPropertyUnwrapper _findpropertyunwrapper) {
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(write(switchToNext.write(_findpropertyunwrapper.read()), IconCompatParcelizer(switchToNext.INSTANCE), javaDoubleBitsFromCharSequence), write(ReadableObjectIdReferring.read(_findpropertyunwrapper.getAudioAttributesCompatParcelizer()), RemoteActionCompatParcelizer(ReadableObjectIdReferring.INSTANCE), javaDoubleBitsFromCharSequence), write(_findpropertyunwrapper.getRemoteActionCompatParcelizer(), IconCompatParcelizer(getDataStream.INSTANCE), javaDoubleBitsFromCharSequence), write(_findpropertyunwrapper.getWrite(), read(withValueDeserializer.INSTANCE), javaDoubleBitsFromCharSequence), write(_findpropertyunwrapper.getRead(), IconCompatParcelizer(_findFormat.INSTANCE), javaDoubleBitsFromCharSequence), onRemoveQueueItemAt(-1), onRemoveQueueItemAt(_findpropertyunwrapper.getMediaBrowserCompatCustomActionResultReceiver()), write(ReadableObjectIdReferring.read(_findpropertyunwrapper.getMediaBrowserCompatItemReceiver()), RemoteActionCompatParcelizer(ReadableObjectIdReferring.INSTANCE), javaDoubleBitsFromCharSequence), write(_findpropertyunwrapper.getAudioAttributesImplApi21Parcelizer(), write(_find2ViaAlias.INSTANCE), javaDoubleBitsFromCharSequence), write(_findpropertyunwrapper.getAudioAttributesImplApi26Parcelizer(), IconCompatParcelizer(CreatorCandidate.INSTANCE), javaDoubleBitsFromCharSequence), write(_findpropertyunwrapper.getMediaBrowserCompatMediaItem(), write(canCreateFromBoolean.INSTANCE), javaDoubleBitsFromCharSequence), write(switchToNext.write(_findpropertyunwrapper.getMediaDescriptionCompat()), IconCompatParcelizer(switchToNext.INSTANCE), javaDoubleBitsFromCharSequence), write(_findpropertyunwrapper.getMediaMetadataCompat(), write(renameAll.INSTANCE), javaDoubleBitsFromCharSequence), write(_findpropertyunwrapper.getMediaBrowserCompatSearchResultReceiver(), IconCompatParcelizer(nopInstance.INSTANCE), javaDoubleBitsFromCharSequence));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _findPropertyUnwrapper ResultReceiver(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        List list = (List) obj;
        Boolean bool = Boolean.FALSE;
        Object obj2 = list.get(0);
        parseManyDecDigits<switchToNext, Object> parsemanydecdigitsIconCompatParcelizer = IconCompatParcelizer(switchToNext.INSTANCE);
        nopInstance nopinstanceIconCompatParcelizer = null;
        switchToNext switchtonextIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj2, bool) || (parsemanydecdigitsIconCompatParcelizer instanceof _addImplicitFactoryCreators)) && obj2 != null) ? parsemanydecdigitsIconCompatParcelizer.IconCompatParcelizer(obj2) : null;
        toMagicModuleMetaRepoModel.write(switchtonextIconCompatParcelizer);
        long iconCompatParcelizer = switchtonextIconCompatParcelizer.getIconCompatParcelizer();
        Object obj3 = list.get(1);
        parseManyDecDigits<ReadableObjectIdReferring, Object> parsemanydecdigitsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(ReadableObjectIdReferring.INSTANCE);
        ReadableObjectIdReferring readableObjectIdReferringIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj3, bool) || (parsemanydecdigitsRemoteActionCompatParcelizer instanceof _addImplicitFactoryCreators)) && obj3 != null) ? parsemanydecdigitsRemoteActionCompatParcelizer.IconCompatParcelizer(obj3) : null;
        toMagicModuleMetaRepoModel.write(readableObjectIdReferringIconCompatParcelizer);
        long iconCompatParcelizer2 = readableObjectIdReferringIconCompatParcelizer.getIconCompatParcelizer();
        Object obj4 = list.get(2);
        parseManyDecDigits<getDataStream, Object> parsemanydecdigitsIconCompatParcelizer2 = IconCompatParcelizer(getDataStream.INSTANCE);
        getDataStream getdatastreamIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj4, bool) || (parsemanydecdigitsIconCompatParcelizer2 instanceof _addImplicitFactoryCreators)) && obj4 != null) ? parsemanydecdigitsIconCompatParcelizer2.IconCompatParcelizer(obj4) : null;
        Object obj5 = list.get(3);
        parseManyDecDigits<withValueDeserializer, Object> parsemanydecdigits = read(withValueDeserializer.INSTANCE);
        withValueDeserializer withvaluedeserializerIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj5, bool) || (parsemanydecdigits instanceof _addImplicitFactoryCreators)) && obj5 != null) ? parsemanydecdigits.IconCompatParcelizer(obj5) : null;
        Object obj6 = list.get(4);
        parseManyDecDigits<_findFormat, Object> parsemanydecdigitsIconCompatParcelizer3 = IconCompatParcelizer(_findFormat.INSTANCE);
        _findFormat _findformatIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj6, bool) || (parsemanydecdigitsIconCompatParcelizer3 instanceof _addImplicitFactoryCreators)) && obj6 != null) ? parsemanydecdigitsIconCompatParcelizer3.IconCompatParcelizer(obj6) : null;
        Object obj7 = list.get(6);
        String str = obj7 != null ? (String) obj7 : null;
        Object obj8 = list.get(7);
        parseManyDecDigits<ReadableObjectIdReferring, Object> parsemanydecdigitsRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(ReadableObjectIdReferring.INSTANCE);
        ReadableObjectIdReferring readableObjectIdReferringIconCompatParcelizer2 = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj8, bool) || (parsemanydecdigitsRemoteActionCompatParcelizer2 instanceof _addImplicitFactoryCreators)) && obj8 != null) ? parsemanydecdigitsRemoteActionCompatParcelizer2.IconCompatParcelizer(obj8) : null;
        toMagicModuleMetaRepoModel.write(readableObjectIdReferringIconCompatParcelizer2);
        long iconCompatParcelizer3 = readableObjectIdReferringIconCompatParcelizer2.getIconCompatParcelizer();
        Object obj9 = list.get(8);
        parseManyDecDigits<_find2ViaAlias, Object> parsemanydecdigitsWrite = write(_find2ViaAlias.INSTANCE);
        _find2ViaAlias _find2viaaliasIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj9, bool) || (parsemanydecdigitsWrite instanceof _addImplicitFactoryCreators)) && obj9 != null) ? parsemanydecdigitsWrite.IconCompatParcelizer(obj9) : null;
        Object obj10 = list.get(9);
        parseManyDecDigits<CreatorCandidate, Object> parsemanydecdigitsIconCompatParcelizer4 = IconCompatParcelizer(CreatorCandidate.INSTANCE);
        CreatorCandidate creatorCandidateIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj10, bool) || (parsemanydecdigitsIconCompatParcelizer4 instanceof _addImplicitFactoryCreators)) && obj10 != null) ? parsemanydecdigitsIconCompatParcelizer4.IconCompatParcelizer(obj10) : null;
        Object obj11 = list.get(10);
        parseManyDecDigits<canCreateFromBoolean, Object> parsemanydecdigitsWrite2 = write(canCreateFromBoolean.INSTANCE);
        canCreateFromBoolean cancreatefrombooleanIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj11, bool) || (parsemanydecdigitsWrite2 instanceof _addImplicitFactoryCreators)) && obj11 != null) ? parsemanydecdigitsWrite2.IconCompatParcelizer(obj11) : null;
        Object obj12 = list.get(11);
        parseManyDecDigits<switchToNext, Object> parsemanydecdigitsIconCompatParcelizer5 = IconCompatParcelizer(switchToNext.INSTANCE);
        switchToNext switchtonextIconCompatParcelizer2 = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj12, bool) || (parsemanydecdigitsIconCompatParcelizer5 instanceof _addImplicitFactoryCreators)) && obj12 != null) ? parsemanydecdigitsIconCompatParcelizer5.IconCompatParcelizer(obj12) : null;
        toMagicModuleMetaRepoModel.write(switchtonextIconCompatParcelizer2);
        long iconCompatParcelizer4 = switchtonextIconCompatParcelizer2.getIconCompatParcelizer();
        Object obj13 = list.get(12);
        parseManyDecDigits<renameAll, Object> parsemanydecdigitsWrite3 = write(renameAll.INSTANCE);
        renameAll renameallIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj13, bool) || (parsemanydecdigitsWrite3 instanceof _addImplicitFactoryCreators)) && obj13 != null) ? parsemanydecdigitsWrite3.IconCompatParcelizer(obj13) : null;
        Object obj14 = list.get(13);
        parseManyDecDigits<nopInstance, Object> parsemanydecdigitsIconCompatParcelizer6 = IconCompatParcelizer(nopInstance.INSTANCE);
        if ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj14, bool) || (parsemanydecdigitsIconCompatParcelizer6 instanceof _addImplicitFactoryCreators)) && obj14 != null) {
            nopinstanceIconCompatParcelizer = parsemanydecdigitsIconCompatParcelizer6.IconCompatParcelizer(obj14);
        }
        return new _findPropertyUnwrapper(iconCompatParcelizer, iconCompatParcelizer2, getdatastreamIconCompatParcelizer, withvaluedeserializerIconCompatParcelizer, _findformatIconCompatParcelizer, null, str, iconCompatParcelizer3, _find2viaaliasIconCompatParcelizer, creatorCandidateIconCompatParcelizer, cancreatefrombooleanIconCompatParcelizer, iconCompatParcelizer4, renameallIconCompatParcelizer, nopinstanceIconCompatParcelizer, null, null, 49184, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object read(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, deserializeFromEmbedded deserializefromembedded) {
        _findPropertyUnwrapper iconCompatParcelizer = deserializefromembedded.getIconCompatParcelizer();
        parseManyDecDigits<_findPropertyUnwrapper, Object> parsemanydecdigits = onFastForward;
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(write(iconCompatParcelizer, parsemanydecdigits, javaDoubleBitsFromCharSequence), write(deserializefromembedded.getAudioAttributesCompatParcelizer(), parsemanydecdigits, javaDoubleBitsFromCharSequence), write(deserializefromembedded.getRead(), parsemanydecdigits, javaDoubleBitsFromCharSequence), write(deserializefromembedded.getWrite(), parsemanydecdigits, javaDoubleBitsFromCharSequence));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final deserializeFromEmbedded _init_lambda2(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        List list = (List) obj;
        Boolean bool = Boolean.FALSE;
        Object obj2 = list.get(0);
        parseManyDecDigits<_findPropertyUnwrapper, Object> parsemanydecdigits = onFastForward;
        _findPropertyUnwrapper _findpropertyunwrapperIconCompatParcelizer = null;
        _findPropertyUnwrapper _findpropertyunwrapperIconCompatParcelizer2 = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj2, bool) || (parsemanydecdigits instanceof _addImplicitFactoryCreators)) && obj2 != null) ? parsemanydecdigits.IconCompatParcelizer(obj2) : null;
        Object obj3 = list.get(1);
        _findPropertyUnwrapper _findpropertyunwrapperIconCompatParcelizer3 = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj3, bool) || (parsemanydecdigits instanceof _addImplicitFactoryCreators)) && obj3 != null) ? parsemanydecdigits.IconCompatParcelizer(obj3) : null;
        Object obj4 = list.get(2);
        _findPropertyUnwrapper _findpropertyunwrapperIconCompatParcelizer4 = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj4, bool) || (parsemanydecdigits instanceof _addImplicitFactoryCreators)) && obj4 != null) ? parsemanydecdigits.IconCompatParcelizer(obj4) : null;
        Object obj5 = list.get(3);
        if ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj5, bool) || (parsemanydecdigits instanceof _addImplicitFactoryCreators)) && obj5 != null) {
            _findpropertyunwrapperIconCompatParcelizer = parsemanydecdigits.IconCompatParcelizer(obj5);
        }
        return new deserializeFromEmbedded(_findpropertyunwrapperIconCompatParcelizer2, _findpropertyunwrapperIconCompatParcelizer3, _findpropertyunwrapperIconCompatParcelizer4, _findpropertyunwrapperIconCompatParcelizer);
    }

    public static final parseManyDecDigits<renameAll, Object> write(renameAll.Companion companion) {
        return onMediaButtonEvent;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AudioAttributesCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, renameAll renameall) {
        return Integer.valueOf(renameall.write());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final renameAll r8lambda4IRRzyoWeWaykEOcgWGjbNoGAkw(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        return new renameAll(((Integer) obj).intValue());
    }

    public static final parseManyDecDigits<CreatorCandidate, Object> IconCompatParcelizer(CreatorCandidate.Companion companion) {
        return onPlayFromMediaId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AudioAttributesCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, CreatorCandidate creatorCandidate) {
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Object[]) new Float[]{Float.valueOf(creatorCandidate.getRemoteActionCompatParcelizer()), Float.valueOf(creatorCandidate.getRead())});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CreatorCandidate r8lambdaibk6u1HK7J3AWKL_Wn934v2UVI8(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        List list = (List) obj;
        return new CreatorCandidate(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue());
    }

    public static final parseManyDecDigits<withProperty, Object> IconCompatParcelizer(withProperty.Companion companion) {
        return onPlayFromUri;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object RemoteActionCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, withProperty withproperty) {
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(write(ReadableObjectIdReferring.read(withproperty.getIconCompatParcelizer()), RemoteActionCompatParcelizer(ReadableObjectIdReferring.INSTANCE), javaDoubleBitsFromCharSequence), write(ReadableObjectIdReferring.read(withproperty.getRead()), RemoteActionCompatParcelizer(ReadableObjectIdReferring.INSTANCE), javaDoubleBitsFromCharSequence));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final withProperty r8lambdah6vvr6zUWA2U1fE0KsKpOgpr28(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        List list = (List) obj;
        Boolean bool = Boolean.FALSE;
        Object obj2 = list.get(0);
        parseManyDecDigits<ReadableObjectIdReferring, Object> parsemanydecdigitsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(ReadableObjectIdReferring.INSTANCE);
        ReadableObjectIdReferring readableObjectIdReferringIconCompatParcelizer = null;
        ReadableObjectIdReferring readableObjectIdReferringIconCompatParcelizer2 = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj2, bool) || (parsemanydecdigitsRemoteActionCompatParcelizer instanceof _addImplicitFactoryCreators)) && obj2 != null) ? parsemanydecdigitsRemoteActionCompatParcelizer.IconCompatParcelizer(obj2) : null;
        toMagicModuleMetaRepoModel.write(readableObjectIdReferringIconCompatParcelizer2);
        long iconCompatParcelizer = readableObjectIdReferringIconCompatParcelizer2.getIconCompatParcelizer();
        Object obj3 = list.get(1);
        parseManyDecDigits<ReadableObjectIdReferring, Object> parsemanydecdigitsRemoteActionCompatParcelizer2 = RemoteActionCompatParcelizer(ReadableObjectIdReferring.INSTANCE);
        if ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj3, bool) || (parsemanydecdigitsRemoteActionCompatParcelizer2 instanceof _addImplicitFactoryCreators)) && obj3 != null) {
            readableObjectIdReferringIconCompatParcelizer = parsemanydecdigitsRemoteActionCompatParcelizer2.IconCompatParcelizer(obj3);
        }
        toMagicModuleMetaRepoModel.write(readableObjectIdReferringIconCompatParcelizer);
        return new withProperty(iconCompatParcelizer, readableObjectIdReferringIconCompatParcelizer.getIconCompatParcelizer(), null);
    }

    public static final parseManyDecDigits<getDataStream, Object> IconCompatParcelizer(getDataStream.Companion companion) {
        return MediaBrowserCompatCustomActionResultReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IconCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, getDataStream getdatastream) {
        return Integer.valueOf(getdatastream.getAudioAttributesCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getDataStream onSetPlaybackSpeed(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        return new getDataStream(((Integer) obj).intValue());
    }

    public static final parseManyDecDigits<_find2ViaAlias, Object> write(_find2ViaAlias.Companion companion) {
        return IconCompatParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AudioAttributesCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, _find2ViaAlias _find2viaalias) {
        return Float.valueOf(_find2viaalias.getAudioAttributesCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _find2ViaAlias onSetRepeatMode(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        return _find2ViaAlias.read(_find2ViaAlias.RemoteActionCompatParcelizer(((Float) obj).floatValue()));
    }

    public static final parseManyDecDigits<findProperty, Object> write(findProperty.Companion companion) {
        return onPrepareFromMediaId;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object read(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, findProperty findproperty) {
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Object[]) new Integer[]{onRemoveQueueItemAt(Integer.valueOf(findProperty.AudioAttributesImplBaseParcelizer(findproperty.getIconCompatParcelizer()))), onRemoveQueueItemAt(Integer.valueOf(findProperty.read(findproperty.getIconCompatParcelizer())))});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final findProperty _init_lambda3(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Integer num = obj2 != null ? (Integer) obj2 : null;
        toMagicModuleMetaRepoModel.write(num);
        int iIntValue = num.intValue();
        Object obj3 = list.get(1);
        Integer num2 = obj3 != null ? (Integer) obj3 : null;
        toMagicModuleMetaRepoModel.write(num2);
        return findProperty.AudioAttributesCompatParcelizer(getValueInstantiator.write(iIntValue, num2.intValue()));
    }

    public static final parseManyDecDigits<nopInstance, Object> IconCompatParcelizer(nopInstance.Companion companion) {
        return onCustomAction;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AudioAttributesCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, nopInstance nopinstance) {
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(write(switchToNext.write(nopinstance.getIconCompatParcelizer()), IconCompatParcelizer(switchToNext.INSTANCE), javaDoubleBitsFromCharSequence), write(getReferencedType.read(nopinstance.getWrite()), write(getReferencedType.INSTANCE), javaDoubleBitsFromCharSequence), onRemoveQueueItemAt(Float.valueOf(nopinstance.getAudioAttributesCompatParcelizer())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final nopInstance PlaybackStateCompatCustomAction(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        List list = (List) obj;
        Boolean bool = Boolean.FALSE;
        Object obj2 = list.get(0);
        parseManyDecDigits<switchToNext, Object> parsemanydecdigitsIconCompatParcelizer = IconCompatParcelizer(switchToNext.INSTANCE);
        switchToNext switchtonextIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj2, bool) || (parsemanydecdigitsIconCompatParcelizer instanceof _addImplicitFactoryCreators)) && obj2 != null) ? parsemanydecdigitsIconCompatParcelizer.IconCompatParcelizer(obj2) : null;
        toMagicModuleMetaRepoModel.write(switchtonextIconCompatParcelizer);
        long iconCompatParcelizer = switchtonextIconCompatParcelizer.getIconCompatParcelizer();
        Object obj3 = list.get(1);
        parseManyDecDigits<getReferencedType, Object> parsemanydecdigitsWrite = write(getReferencedType.INSTANCE);
        getReferencedType getreferencedtypeIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj3, bool) || (parsemanydecdigitsWrite instanceof _addImplicitFactoryCreators)) && obj3 != null) ? parsemanydecdigitsWrite.IconCompatParcelizer(obj3) : null;
        toMagicModuleMetaRepoModel.write(getreferencedtypeIconCompatParcelizer);
        long write2 = getreferencedtypeIconCompatParcelizer.getWrite();
        Object obj4 = list.get(2);
        Float f = obj4 != null ? (Float) obj4 : null;
        toMagicModuleMetaRepoModel.write(f);
        return new nopInstance(iconCompatParcelizer, write2, f.floatValue(), null);
    }

    public static final parseManyDecDigits<switchToNext, Object> IconCompatParcelizer(switchToNext.Companion companion) {
        return MediaBrowserCompatItemReceiver;
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class write implements MagicModuleSubmissionRequestBody<JavaDoubleBitsFromCharSequence, switchToNext, Object> {
        public static final write IconCompatParcelizer = new write();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        public final /* synthetic */ Object invoke(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, switchToNext switchtonext) {
            return write(javaDoubleBitsFromCharSequence, switchtonext.getIconCompatParcelizer());
        }

        public final Object write(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, long j) {
            if (j == 16) {
                return Boolean.FALSE;
            }
            return Integer.valueOf(RequestPayload.IconCompatParcelizer(j));
        }

        write() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    static final class read implements getAnswerMap<Object, switchToNext> {
        public static final read AudioAttributesCompatParcelizer = new read();

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: IconCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final switchToNext invoke(Object obj) {
            if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, Boolean.FALSE)) {
                return switchToNext.write(switchToNext.INSTANCE.AudioAttributesImplApi21Parcelizer());
            }
            toMagicModuleMetaRepoModel.read(obj, "");
            return switchToNext.write(RequestPayload.AudioAttributesCompatParcelizer(((Integer) obj).intValue()));
        }

        read() {
        }
    }

    public static final parseManyDecDigits<assignIndexes, Object> RemoteActionCompatParcelizer(assignIndexes.Companion companion) {
        return onPause;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AudioAttributesCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, assignIndexes assignindexes) {
        return Integer.valueOf(assignindexes.getRemoteActionCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final assignIndexes r8lambdaKUbBm7ckfqTc9QCgukC86fguu4(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        return assignIndexes.write(assignIndexes.IconCompatParcelizer(((Integer) obj).intValue()));
    }

    public static final parseManyDecDigits<withCaseInsensitivity, Object> AudioAttributesCompatParcelizer(withCaseInsensitivity.Companion companion) {
        return onPlay;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object read(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, withCaseInsensitivity withcaseinsensitivity) {
        return Integer.valueOf(withcaseinsensitivity.getAudioAttributesCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final withCaseInsensitivity r8lambdacI7dwLT0wnPzJ9a3oRpjgUF1USM(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        return withCaseInsensitivity.read(withCaseInsensitivity.AudioAttributesCompatParcelizer(((Integer) obj).intValue()));
    }

    public static final parseManyDecDigits<_findWithAlias, Object> IconCompatParcelizer(_findWithAlias.Companion companion) {
        return AudioAttributesImplApi21Parcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _findWithAlias onSkipToPrevious(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        return _findWithAlias.AudioAttributesCompatParcelizer(_findWithAlias.write(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object read(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, _findWithAlias _findwithalias) {
        return Integer.valueOf(_findwithalias.getAudioAttributesCompatParcelizer());
    }

    public static final parseManyDecDigits<withValueDeserializer, Object> read(withValueDeserializer.Companion companion) {
        return AudioAttributesImplBaseParcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AudioAttributesCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, withValueDeserializer withvaluedeserializer) {
        return onRemoveQueueItemAt(Integer.valueOf(withvaluedeserializer.getIconCompatParcelizer()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final withValueDeserializer onSetCaptioningEnabled(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        return withValueDeserializer.IconCompatParcelizer(withValueDeserializer.write(((Integer) obj).intValue()));
    }

    public static final parseManyDecDigits<_findFormat, Object> IconCompatParcelizer(_findFormat.Companion companion) {
        return AudioAttributesImplApi26Parcelizer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final _findFormat onSetShuffleMode(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        return _findFormat.write(_findFormat.IconCompatParcelizer(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object write(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, _findFormat _findformat) {
        return Integer.valueOf(_findformat.getRead());
    }

    public static final parseManyDecDigits<ReadableObjectIdReferring, Object> RemoteActionCompatParcelizer(ReadableObjectIdReferring.Companion companion) {
        return onPrepare;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object RemoteActionCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, ReadableObjectIdReferring readableObjectIdReferring) {
        long jIconCompatParcelizer = ReadableObjectIdReferring.INSTANCE.IconCompatParcelizer();
        if (readableObjectIdReferring != null && ReadableObjectIdReferring.AudioAttributesCompatParcelizer(readableObjectIdReferring.getIconCompatParcelizer(), jIconCompatParcelizer)) {
            return Boolean.FALSE;
        }
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(onRemoveQueueItemAt(Float.valueOf(ReadableObjectIdReferring.AudioAttributesCompatParcelizer(readableObjectIdReferring.getIconCompatParcelizer()))), write(processUnwrapped.write(ReadableObjectIdReferring.write(readableObjectIdReferring.getIconCompatParcelizer())), IconCompatParcelizer(processUnwrapped.INSTANCE), javaDoubleBitsFromCharSequence));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ReadableObjectIdReferring r8lambdaxTL2e_8xZHyLBqzsfEVlyFwLP0(Object obj) {
        Boolean bool = Boolean.FALSE;
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, bool)) {
            return ReadableObjectIdReferring.read(ReadableObjectIdReferring.INSTANCE.IconCompatParcelizer());
        }
        toMagicModuleMetaRepoModel.read(obj, "");
        List list = (List) obj;
        Object obj2 = list.get(0);
        processUnwrapped processunwrappedIconCompatParcelizer = null;
        Float f = obj2 != null ? (Float) obj2 : null;
        toMagicModuleMetaRepoModel.write(f);
        float fFloatValue = f.floatValue();
        Object obj3 = list.get(1);
        parseManyDecDigits<processUnwrapped, Object> parsemanydecdigitsIconCompatParcelizer = IconCompatParcelizer(processUnwrapped.INSTANCE);
        if ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj3, bool) || (parsemanydecdigitsIconCompatParcelizer instanceof _addImplicitFactoryCreators)) && obj3 != null) {
            processunwrappedIconCompatParcelizer = parsemanydecdigitsIconCompatParcelizer.IconCompatParcelizer(obj3);
        }
        toMagicModuleMetaRepoModel.write(processunwrappedIconCompatParcelizer);
        return ReadableObjectIdReferring.read(setResolver.IconCompatParcelizer(fFloatValue, processunwrappedIconCompatParcelizer.getRemoteActionCompatParcelizer()));
    }

    public static final parseManyDecDigits<processUnwrapped, Object> IconCompatParcelizer(processUnwrapped.Companion companion) {
        return onPrepareFromSearch;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AudioAttributesCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, processUnwrapped processunwrapped) {
        long remoteActionCompatParcelizer = processunwrapped.getRemoteActionCompatParcelizer();
        if (processUnwrapped.read(remoteActionCompatParcelizer, processUnwrapped.INSTANCE.AudioAttributesCompatParcelizer())) {
            return 0;
        }
        if (processUnwrapped.read(remoteActionCompatParcelizer, processUnwrapped.INSTANCE.read())) {
            return 1;
        }
        return Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final processUnwrapped accessensureViewModelStore(Object obj) {
        return toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, (Object) 0) ? processUnwrapped.write(processUnwrapped.INSTANCE.AudioAttributesCompatParcelizer()) : toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, (Object) 1) ? processUnwrapped.write(processUnwrapped.INSTANCE.read()) : processUnwrapped.write(processUnwrapped.INSTANCE.IconCompatParcelizer());
    }

    public static final parseManyDecDigits<getReferencedType, Object> write(getReferencedType.Companion companion) {
        return onAddQueueItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object RemoteActionCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, getReferencedType getreferencedtype) {
        return (getreferencedtype != null && getReferencedType.IconCompatParcelizer(getreferencedtype.getWrite(), getReferencedType.INSTANCE.read())) ? Boolean.FALSE : IntermediateLoginResponseBody.AudioAttributesCompatParcelizer((Object[]) new Float[]{onRemoveQueueItemAt(Float.valueOf(Float.intBitsToFloat((int) (getreferencedtype.getWrite() >> 32)))), onRemoveQueueItemAt(Float.valueOf(Float.intBitsToFloat((int) getreferencedtype.getWrite())))});
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final getReferencedType PlaybackStateCompat(Object obj) {
        if (toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj, Boolean.FALSE)) {
            return getReferencedType.read(getReferencedType.INSTANCE.read());
        }
        toMagicModuleMetaRepoModel.read(obj, "");
        List list = (List) obj;
        Object obj2 = list.get(0);
        Float f = obj2 != null ? (Float) obj2 : null;
        toMagicModuleMetaRepoModel.write(f);
        float fFloatValue = f.floatValue();
        Object obj3 = list.get(1);
        Float f2 = obj3 != null ? (Float) obj3 : null;
        toMagicModuleMetaRepoModel.write(f2);
        long j = -1;
        return getReferencedType.read(getReferencedType.AudioAttributesCompatParcelizer((((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(f2.floatValue())) & ((((long) 0) << 32) | (j - ((j >> 63) << 32))))));
    }

    public static final parseManyDecDigits<canCreateFromBoolean, Object> write(canCreateFromBoolean.Companion companion) {
        return MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object RemoteActionCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, canCreateFromBoolean cancreatefromboolean) {
        List<canCreateFromInt> listWrite = cancreatefromboolean.write();
        ArrayList arrayList = new ArrayList(listWrite.size());
        int size = listWrite.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(write(listWrite.get(i), read(canCreateFromInt.INSTANCE), javaDoubleBitsFromCharSequence));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final canCreateFromBoolean MediaSessionCompatResultReceiverWrapper(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        List list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            Object obj2 = list.get(i);
            ArrayList arrayList2 = arrayList;
            parseManyDecDigits<canCreateFromInt, Object> parsemanydecdigits = read(canCreateFromInt.INSTANCE);
            canCreateFromInt cancreatefromintIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj2, Boolean.FALSE) || (parsemanydecdigits instanceof _addImplicitFactoryCreators)) && obj2 != null) ? parsemanydecdigits.IconCompatParcelizer(obj2) : null;
            toMagicModuleMetaRepoModel.write(cancreatefromintIconCompatParcelizer);
            arrayList2.add(cancreatefromintIconCompatParcelizer);
        }
        return new canCreateFromBoolean(arrayList);
    }

    public static final parseManyDecDigits<canCreateFromInt, Object> read(canCreateFromInt.Companion companion) {
        return handleMediaPlayPauseIfPendingOnHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object RemoteActionCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, canCreateFromInt cancreatefromint) {
        return cancreatefromint.RemoteActionCompatParcelizer();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final canCreateFromInt MediaSessionCompatQueueItem(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        return new canCreateFromInt((String) obj);
    }

    public static final parseManyDecDigits<find, Object> RemoteActionCompatParcelizer(find.Companion companion) {
        return MediaBrowserCompatMediaItem;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object write(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, find findVar) {
        return IntermediateLoginResponseBody.AudioAttributesCompatParcelizer(write(find.IconCompatParcelizer.write(findVar.getRead()), read(find.IconCompatParcelizer.INSTANCE), javaDoubleBitsFromCharSequence), write(find.write.IconCompatParcelizer(findVar.getRemoteActionCompatParcelizer()), RemoteActionCompatParcelizer(find.write.INSTANCE), javaDoubleBitsFromCharSequence), write(find.read.AudioAttributesCompatParcelizer(findVar.getWrite()), IconCompatParcelizer(find.read.INSTANCE), javaDoubleBitsFromCharSequence));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final find setSessionImpl(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        List list = (List) obj;
        Boolean bool = Boolean.FALSE;
        Object obj2 = list.get(0);
        parseManyDecDigits<find.IconCompatParcelizer, Object> parsemanydecdigits = read(find.IconCompatParcelizer.INSTANCE);
        find.IconCompatParcelizer IconCompatParcelizer2 = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj2, bool) || (parsemanydecdigits instanceof _addImplicitFactoryCreators)) && obj2 != null) ? parsemanydecdigits.IconCompatParcelizer(obj2) : null;
        toMagicModuleMetaRepoModel.write(IconCompatParcelizer2);
        float read2 = IconCompatParcelizer2.getRead();
        Object obj3 = list.get(1);
        parseManyDecDigits<find.write, Object> parsemanydecdigitsRemoteActionCompatParcelizer = RemoteActionCompatParcelizer(find.write.INSTANCE);
        find.write writeVarIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj3, bool) || (parsemanydecdigitsRemoteActionCompatParcelizer instanceof _addImplicitFactoryCreators)) && obj3 != null) ? parsemanydecdigitsRemoteActionCompatParcelizer.IconCompatParcelizer(obj3) : null;
        toMagicModuleMetaRepoModel.write(writeVarIconCompatParcelizer);
        int write2 = writeVarIconCompatParcelizer.getWrite();
        Object obj4 = list.get(2);
        parseManyDecDigits<find.read, Object> parsemanydecdigitsIconCompatParcelizer = IconCompatParcelizer(find.read.INSTANCE);
        find.read readVarIconCompatParcelizer = ((!toMagicModuleMetaRepoModel.RemoteActionCompatParcelizer(obj4, bool) || (parsemanydecdigitsIconCompatParcelizer instanceof _addImplicitFactoryCreators)) && obj4 != null) ? parsemanydecdigitsIconCompatParcelizer.IconCompatParcelizer(obj4) : null;
        toMagicModuleMetaRepoModel.write(readVarIconCompatParcelizer);
        return new find(read2, write2, readVarIconCompatParcelizer.getAudioAttributesCompatParcelizer(), null);
    }

    private static final parseManyDecDigits<find.IconCompatParcelizer, Object> read(find.IconCompatParcelizer.Companion companion) {
        return MediaMetadataCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IconCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, find.IconCompatParcelizer iconCompatParcelizer) {
        return Float.valueOf(iconCompatParcelizer.getRead());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final find.IconCompatParcelizer onSkipToNext(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        return find.IconCompatParcelizer.write(find.IconCompatParcelizer.read(((Float) obj).floatValue()));
    }

    private static final parseManyDecDigits<find.write, Object> RemoteActionCompatParcelizer(find.write.Companion companion) {
        return MediaBrowserCompatSearchResultReceiver;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AudioAttributesCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, find.write writeVar) {
        return Integer.valueOf(writeVar.getWrite());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final find.write onSkipToQueueItem(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        return find.write.IconCompatParcelizer(find.write.write(((Integer) obj).intValue()));
    }

    private static final parseManyDecDigits<find.read, Object> IconCompatParcelizer(find.read.Companion companion) {
        return RatingCompat;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object IconCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, find.read readVar) {
        return Integer.valueOf(readVar.getAudioAttributesCompatParcelizer());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final find.read onStop(Object obj) {
        toMagicModuleMetaRepoModel.read(obj, "");
        return find.read.AudioAttributesCompatParcelizer(find.read.write(((Integer) obj).intValue()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object AudioAttributesCompatParcelizer(JavaDoubleBitsFromCharSequence javaDoubleBitsFromCharSequence, List list) {
        ArrayList arrayList = new ArrayList(list.size());
        int size = list.size();
        for (int i = 0; i < size; i++) {
            arrayList.add(write((AbstractDeserializer.AudioAttributesCompatParcelizer) list.get(i), read, javaDoubleBitsFromCharSequence));
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final handleUnknownProperties accessaddObserverForBackInvoker(Object obj) {
        String str = obj != null ? (String) obj : null;
        toMagicModuleMetaRepoModel.write((Object) str);
        return new handleUnknownProperties(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final handleUnknownVanilla accessgetReportFullyDrawnExecutorp(Object obj) {
        String str = obj != null ? (String) obj : null;
        toMagicModuleMetaRepoModel.write((Object) str);
        return new handleUnknownVanilla(str);
    }
}
