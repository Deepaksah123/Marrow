package kotlin;

import java.util.List;
import kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u0011\u0010\u0005\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0005\u0010\u0003\u001a\u0011\u0010\u0006\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0006\u0010\u0003\u001a\u0019\u0010\u0002\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0002\u0010\t\u001a%\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f0\n¢\u0006\u0004\b\u0006\u0010\r\u001a\u0011\u0010\u000e\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u000e\u0010\u0003\u001a9\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u001a\u0010\u0012\u001a\u0016\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n¢\u0006\u0004\b\u0004\u0010\u0013\u001a-\u0010\u0015\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014¢\u0006\u0004\b\u0015\u0010\u0016\u001a-\u0010\u0017\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014¢\u0006\u0004\b\u0017\u0010\u0016\u001a9\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0018¢\u0006\u0004\b\u0004\u0010\u001a\u001a5\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\"\u0010\b\u001a\u001e\b\u0001\u0012\u0004\u0012\u00020\u001b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001c\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\u0018¢\u0006\u0004\b\u000e\u0010\u001d\u001a1\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0012\u0010\u0012\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u00110\n¢\u0006\u0004\b\u0006\u0010\u0013\u001a3\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u001e\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u0013\u001a3\u0010\u0002\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n¢\u0006\u0004\b\u0002\u0010\u0013\u001a3\u0010 \u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n¢\u0006\u0004\b \u0010\u0013\u001a3\u0010!\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n¢\u0006\u0004\b!\u0010\u0013\u001a-\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014¢\u0006\u0004\b\u0005\u0010\u0016\u001a3\u0010\u0005\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\u0011\u0018\u00010\n¢\u0006\u0004\b\u0005\u0010\u0013\u001a5\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\u0006\u0010\b\u001a\u00020\"2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u000e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014¢\u0006\u0004\b\u0006\u0010$\u001a?\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072 \u0010\u0012\u001a\u001c\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0011\u0018\u00010%¢\u0006\u0004\b\u0004\u0010&\u001a-\u0010\u0004\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014¢\u0006\u0004\b\u0004\u0010\u0016\u001a-\u0010\u0002\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014¢\u0006\u0004\b\u0002\u0010\u0016\u001a-\u0010'\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014¢\u0006\u0004\b'\u0010\u0016\u001a-\u0010(\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014¢\u0006\u0004\b(\u0010\u0016\u001a-\u0010\u000e\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014¢\u0006\u0004\b\u000e\u0010\u0016\u001a-\u0010\u0006\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014¢\u0006\u0004\b\u0006\u0010\u0016\u001a-\u0010)\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014¢\u0006\u0004\b)\u0010\u0016\u001a-\u0010*\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014¢\u0006\u0004\b*\u0010\u0016\u001a-\u0010!\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014¢\u0006\u0004\b!\u0010\u0016\u001a-\u0010+\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014¢\u0006\u0004\b+\u0010\u0016\u001a-\u0010,\u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014¢\u0006\u0004\b,\u0010\u0016\u001a-\u0010 \u001a\u00020\u0001*\u00020\u00002\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u0014¢\u0006\u0004\b \u0010\u0016\"\"\u0010\u000e\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00078F@GX\u0086\u000e¢\u0006\u0006\"\u0004\b\u000e\u0010\t\"#\u0010\u0004\u001a\u00020-*\u00020\u00002\u0006\u0010\b\u001a\u00020-8F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u0006\u0010.\"#\u0010\u0002\u001a\u00020\u0007*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00078F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u0005\u0010\t\"#\u0010\u0005\u001a\u00020/*\u00020\u00002\u0006\u0010\b\u001a\u00020/8F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u000e\u00100\"#\u0010\u0006\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00118F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u0002\u00101\"#\u0010\u0015\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00118F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u0004\u00101\"#\u0010(\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00118F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b \u00101\"#\u0010!\u001a\u000202*\u00020\u00002\u0006\u0010\b\u001a\u0002028F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u0002\u00103\"#\u0010 \u001a\u000204*\u00020\u00002\u0006\u0010\b\u001a\u0002048F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u0002\u00105\"#\u0010\u0017\u001a\u00020\u001e*\u00020\u00002\u0006\u0010\b\u001a\u00020\u001e8F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u0002\u00106\"#\u0010'\u001a\u000207*\u00020\u00002\u0006\u0010\b\u001a\u0002078F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u0004\u00108\"#\u0010+\u001a\u000207*\u00020\u00002\u0006\u0010\b\u001a\u0002078F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u0002\u00108\"#\u0010)\u001a\u000209*\u00020\u00002\u0006\u0010\b\u001a\u0002098F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u0002\u00100\"\"\u0010*\u001a\u00020\u001f*\u00020\u00002\u0006\u0010\b\u001a\u00020\u001f8F@GX\u0086\u000e¢\u0006\u0006\"\u0004\b\u000e\u0010:\"#\u0010,\u001a\u00020\u001f*\u00020\u00002\u0006\u0010\b\u001a\u00020\u001f8F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u0005\u0010:\"#\u0010;\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00118F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u000e\u00101\"#\u0010<\u001a\u00020\u001f*\u00020\u00002\u0006\u0010\b\u001a\u00020\u001f8F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u0004\u0010:\"#\u0010=\u001a\u00020\u001f*\u00020\u00002\u0006\u0010\b\u001a\u00020\u001f8F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u0006\u0010:\"#\u0010@\u001a\u00020>*\u00020\u00002\u0006\u0010\b\u001a\u00020>8F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u0004\u0010?\"#\u0010A\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00118F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u0006\u00101\"#\u0010D\u001a\u00020B*\u00020\u00002\u0006\u0010\b\u001a\u00020B8F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u0002\u0010C\"#\u0010G\u001a\u00020E*\u00020\u00002\u0006\u0010\b\u001a\u00020E8F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u0002\u0010F\"#\u0010H\u001a\u00020\u0011*\u00020\u00002\u0006\u0010\b\u001a\u00020\u00118F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u0005\u00101\"#\u0010K\u001a\u00020I*\u00020\u00002\u0006\u0010\b\u001a\u00020I8F@GX\u0086\u008e\u0002¢\u0006\u0006\"\u0004\b\u0005\u0010J"}, d2 = {"Lo/getConfigOverride;", "", "write", "(Lo/getConfigOverride;)V", "RemoteActionCompatParcelizer", "IconCompatParcelizer", "read", "", "p0", "(Lo/getConfigOverride;Ljava/lang/String;)V", "Lkotlin/Function1;", "", "", "(Lo/getConfigOverride;Lo/getAnswerMap;)V", "AudioAttributesCompatParcelizer", "", "Lo/deserializeFromNumber;", "", "p1", "(Lo/getConfigOverride;Ljava/lang/String;Lo/getAnswerMap;)V", "Lkotlin/Function0;", "MediaBrowserCompatItemReceiver", "(Lo/getConfigOverride;Ljava/lang/String;Lo/getCreatedOnDateMs;)V", "AudioAttributesImplApi21Parcelizer", "Lkotlin/Function2;", "", "(Lo/getConfigOverride;Ljava/lang/String;Lo/MagicModuleSubmissionRequestBody;)V", "Lo/getReferencedType;", "Lo/SampleVideos;", "(Lo/getConfigOverride;Lo/MagicModuleSubmissionRequestBody;)V", "Lo/_writeStringSegment;", "Lo/AbstractDeserializer;", "AudioAttributesImplBaseParcelizer", "MediaBrowserCompatCustomActionResultReceiver", "Lo/ResolvableDeserializer;", "p2", "(Lo/getConfigOverride;ILjava/lang/String;Lo/getCreatedOnDateMs;)V", "Lkotlin/Function3;", "(Lo/getConfigOverride;Ljava/lang/String;Lo/getModuleData;)V", "MediaMetadataCompat", "AudioAttributesImplApi26Parcelizer", "RatingCompat", "MediaDescriptionCompat", "MediaBrowserCompatSearchResultReceiver", "MediaBrowserCompatMediaItem", "Lo/hasValueInstantiators;", "(Lo/getConfigOverride;Lo/hasValueInstantiators;)V", "Lo/hasAbstractTypeResolvers;", "(Lo/getConfigOverride;I)V", "(Lo/getConfigOverride;Z)V", "Lo/_writeQuotedInt;", "(Lo/getConfigOverride;Lo/_writeQuotedInt;)V", "Lo/_writeQuotedRaw;", "(Lo/getConfigOverride;Lo/_writeQuotedRaw;)V", "(Lo/getConfigOverride;Lo/_writeStringSegment;)V", "Lo/withAdditionalKeyDeserializers;", "(Lo/getConfigOverride;Lo/withAdditionalKeyDeserializers;)V", "Lo/keyDeserializers;", "(Lo/getConfigOverride;Lo/AbstractDeserializer;)V", "onCustomAction", "handleMediaPlayPauseIfPendingOnHandler", "onAddQueueItem", "Lo/findProperty;", "(Lo/getConfigOverride;J)V", "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver", "onCommand", "Lo/deserializerModifiers;", "(Lo/getConfigOverride;Lo/deserializerModifiers;)V", "onPlayFromMediaId", "Lo/MutableCoercionConfig;", "(Lo/getConfigOverride;Lo/MutableCoercionConfig;)V", "onPause", "onPlay", "Lo/findAndAddVirtualProperties;", "(Lo/getConfigOverride;Lo/findAndAddVirtualProperties;)V", "onMediaButtonEvent"}, k = 2, mv = {2, 0, 0}, xi = 48)
public final class MapperBuilder {
    static final /* synthetic */ isResolutionNotSupported<Object>[] write = {toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "stateDescription", "getStateDescription(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "progressBarRangeInfo", "getProgressBarRangeInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ProgressBarRangeInfo;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "paneTitle", "getPaneTitle(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "liveRegion", "getLiveRegion(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "focused", "getFocused(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "isContainer", "isContainer(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "isTraversalGroup", "isTraversalGroup(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "isSensitiveData", "isSensitiveData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "contentType", "getContentType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentType;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "contentDataType", "getContentDataType(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/ContentDataType;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "fillableData", "getFillableData(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/autofill/FillableData;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "traversalIndex", "getTraversalIndex(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)F")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "horizontalScrollAxisRange", "getHorizontalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "verticalScrollAxisRange", "getVerticalScrollAxisRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/ScrollAxisRange;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "role", "getRole(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "testTag", "getTestTag(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/lang/String;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "textSubstitution", "getTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "isShowingTextSubstitution", "isShowingTextSubstitution(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "inputText", "getInputText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "editableText", "getEditableText(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/text/AnnotatedString;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "textSelectionRange", "getTextSelectionRange(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)J")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "imeAction", "getImeAction(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "selected", "getSelected(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "collectionInfo", "getCollectionInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionInfo;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "collectionItemInfo", "getCollectionItemInfo(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/semantics/CollectionItemInfo;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "toggleableState", "getToggleableState(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/state/ToggleableState;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "isEditable", "isEditable(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Z")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "maxTextLength", "getMaxTextLength(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)I")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "shape", "getShape(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Landroidx/compose/ui/graphics/Shape;")), toMagicModuleMetaDataUcModel.IconCompatParcelizer(new isMagicModuleIntroAlreadyShown(MapperBuilder.class, "customActions", "getCustomActions(Landroidx/compose/ui/semantics/SemanticsPropertyReceiver;)Ljava/util/List;"))};

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* JADX INFO: renamed from: o.MapperBuilder$1, reason: from Kotlin metadata */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0003\"\u000e\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u00020\u00010\u00002\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u00032\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Function;", "", "T", "Lo/defaultFeatures;", "p0", "p1", "read", "(Lo/defaultFeatures;Lo/defaultFeatures;)Lo/defaultFeatures;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class Function<T> extends MagicModuleUseCase implements MagicModuleSubmissionRequestBody<defaultFeatures<T>, defaultFeatures<T>, defaultFeatures<T>> {
        public static final Function AudioAttributesCompatParcelizer = new Function();

        @Override // kotlin.MagicModuleSubmissionRequestBody
        /* JADX INFO: renamed from: read, reason: merged with bridge method [inline-methods] */
        public final defaultFeatures<T> invoke(defaultFeatures<T> defaultfeatures, defaultFeatures<T> defaultfeatures2) {
            String remoteActionCompatParcelizer;
            setRenewGrpId setrenewgrpidRemoteActionCompatParcelizer;
            if (defaultfeatures == null || (remoteActionCompatParcelizer = defaultfeatures.getRemoteActionCompatParcelizer()) == null) {
                remoteActionCompatParcelizer = defaultfeatures2.getRemoteActionCompatParcelizer();
            }
            if (defaultfeatures == null || (setrenewgrpidRemoteActionCompatParcelizer = defaultfeatures.RemoteActionCompatParcelizer()) == null) {
                setrenewgrpidRemoteActionCompatParcelizer = defaultfeatures2.RemoteActionCompatParcelizer();
            }
            return new defaultFeatures<>(remoteActionCompatParcelizer, setrenewgrpidRemoteActionCompatParcelizer);
        }

        public Function() {
            super(2);
        }
    }

    public static final void AudioAttributesCompatParcelizer(getConfigOverride getconfigoverride, String str) {
        getconfigoverride.write(_this.INSTANCE.IconCompatParcelizer(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(str));
    }

    public static final void read(getConfigOverride getconfigoverride, hasValueInstantiators hasvalueinstantiators) {
        _this.INSTANCE.onPlayFromUri().read(getconfigoverride, write[1], hasvalueinstantiators);
    }

    public static final void IconCompatParcelizer(getConfigOverride getconfigoverride, String str) {
        _this.INSTANCE.onPrepare().read(getconfigoverride, write[2], str);
    }

    public static final void write(getConfigOverride getconfigoverride) {
        getconfigoverride.write(_this.INSTANCE.MediaBrowserCompatItemReceiver(), getShowPopup.INSTANCE);
    }

    public static final void AudioAttributesCompatParcelizer(getConfigOverride getconfigoverride, int i) {
        _this.INSTANCE.onPrepareFromSearch().read(getconfigoverride, write[3], hasAbstractTypeResolvers.RemoteActionCompatParcelizer(i));
    }

    public static final void write(getConfigOverride getconfigoverride, boolean z) {
        _this.INSTANCE.AudioAttributesImplBaseParcelizer().read(getconfigoverride, write[4], Boolean.valueOf(z));
    }

    public static final void RemoteActionCompatParcelizer(getConfigOverride getconfigoverride, boolean z) {
        _this.INSTANCE.onCommand().read(getconfigoverride, write[5], Boolean.valueOf(z));
    }

    public static final void AudioAttributesImplBaseParcelizer(getConfigOverride getconfigoverride, boolean z) {
        _this.INSTANCE.onPause().read(getconfigoverride, write[6], Boolean.valueOf(z));
    }

    public static final void write(getConfigOverride getconfigoverride, _writeQuotedInt _writequotedint) {
        _this.INSTANCE.RemoteActionCompatParcelizer().read(getconfigoverride, write[8], _writequotedint);
    }

    public static final void write(getConfigOverride getconfigoverride, _writeQuotedRaw _writequotedraw) {
        _this.INSTANCE.write().read(getconfigoverride, write[9], _writequotedraw);
    }

    public static final void write(getConfigOverride getconfigoverride, _writeStringSegment _writestringsegment) {
        _this.INSTANCE.AudioAttributesImplApi21Parcelizer().read(getconfigoverride, write[10], _writestringsegment);
    }

    public static final void RemoteActionCompatParcelizer(getConfigOverride getconfigoverride, withAdditionalKeyDeserializers withadditionalkeydeserializers) {
        _this.INSTANCE.RatingCompat().read(getconfigoverride, write[12], withadditionalkeydeserializers);
    }

    public static final void write(getConfigOverride getconfigoverride, withAdditionalKeyDeserializers withadditionalkeydeserializers) {
        _this.INSTANCE.onSkipToPrevious().read(getconfigoverride, write[13], withadditionalkeydeserializers);
    }

    public static final void RemoteActionCompatParcelizer(getConfigOverride getconfigoverride) {
        getconfigoverride.write(_this.INSTANCE.onPlay(), getShowPopup.INSTANCE);
    }

    public static final void IconCompatParcelizer(getConfigOverride getconfigoverride) {
        getconfigoverride.write(_this.INSTANCE.onCustomAction(), getShowPopup.INSTANCE);
    }

    public static final void write(getConfigOverride getconfigoverride, int i) {
        _this.INSTANCE.onRemoveQueueItem().read(getconfigoverride, write[14], C0184keyDeserializers.write(i));
    }

    public static final void AudioAttributesCompatParcelizer(getConfigOverride getconfigoverride, AbstractDeserializer abstractDeserializer) {
        getconfigoverride.write(_this.INSTANCE.onSetRating(), IntermediateLoginResponseBody.RemoteActionCompatParcelizer(abstractDeserializer));
    }

    public static final void IconCompatParcelizer(getConfigOverride getconfigoverride, AbstractDeserializer abstractDeserializer) {
        _this.INSTANCE.onSetShuffleMode().read(getconfigoverride, write[16], abstractDeserializer);
    }

    public static final void AudioAttributesCompatParcelizer(getConfigOverride getconfigoverride, boolean z) {
        _this.INSTANCE.onMediaButtonEvent().read(getconfigoverride, write[17], Boolean.valueOf(z));
    }

    public static final void RemoteActionCompatParcelizer(getConfigOverride getconfigoverride, AbstractDeserializer abstractDeserializer) {
        _this.INSTANCE.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver().read(getconfigoverride, write[18], abstractDeserializer);
    }

    public static final void read(getConfigOverride getconfigoverride, AbstractDeserializer abstractDeserializer) {
        _this.INSTANCE.AudioAttributesImplApi26Parcelizer().read(getconfigoverride, write[19], abstractDeserializer);
    }

    public static final void RemoteActionCompatParcelizer(getConfigOverride getconfigoverride, long j) {
        _this.INSTANCE.onSetCaptioningEnabled().read(getconfigoverride, write[20], findProperty.AudioAttributesCompatParcelizer(j));
    }

    public static final void read(getConfigOverride getconfigoverride, boolean z) {
        _this.INSTANCE.onPrepareFromUri().read(getconfigoverride, write[22], Boolean.valueOf(z));
    }

    public static final void write(getConfigOverride getconfigoverride, deserializerModifiers deserializermodifiers) {
        _this.INSTANCE.AudioAttributesCompatParcelizer().read(getconfigoverride, write[23], deserializermodifiers);
    }

    public static final void write(getConfigOverride getconfigoverride, MutableCoercionConfig mutableCoercionConfig) {
        _this.INSTANCE.onSetRepeatMode().read(getconfigoverride, write[25], mutableCoercionConfig);
    }

    public static final void IconCompatParcelizer(getConfigOverride getconfigoverride, boolean z) {
        _this.INSTANCE.handleMediaPlayPauseIfPendingOnHandler().read(getconfigoverride, write[26], Boolean.valueOf(z));
    }

    public static final void read(getConfigOverride getconfigoverride) {
        getconfigoverride.write(_this.INSTANCE.onPrepareFromMediaId(), getShowPopup.INSTANCE);
    }

    public static final void write(getConfigOverride getconfigoverride, String str) {
        getconfigoverride.write(_this.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), str);
    }

    public static final void read(getConfigOverride getconfigoverride, getAnswerMap<Object, Integer> getanswermap) {
        getconfigoverride.write(_this.INSTANCE.MediaBrowserCompatMediaItem(), getanswermap);
    }

    public static final void IconCompatParcelizer(getConfigOverride getconfigoverride, findAndAddVirtualProperties findandaddvirtualproperties) {
        _this.INSTANCE.onRewind().read(getconfigoverride, write[28], findandaddvirtualproperties);
    }

    public static final void AudioAttributesCompatParcelizer(getConfigOverride getconfigoverride) {
        getconfigoverride.write(_this.INSTANCE.onSeekTo(), getShowPopup.INSTANCE);
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer$default(getConfigOverride getconfigoverride, String str, getAnswerMap getanswermap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        RemoteActionCompatParcelizer(getconfigoverride, str, (getAnswerMap<? super List<deserializeFromNumber>, Boolean>) getanswermap);
    }

    public static final void RemoteActionCompatParcelizer(getConfigOverride getconfigoverride, String str, getAnswerMap<? super List<deserializeFromNumber>, Boolean> getanswermap) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.MediaBrowserCompatCustomActionResultReceiver(), new defaultFeatures(str, getanswermap));
    }

    public static /* synthetic */ void MediaBrowserCompatItemReceiver$default(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs getcreatedondatems, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        MediaBrowserCompatItemReceiver(getconfigoverride, str, getcreatedondatems);
    }

    public static final void MediaBrowserCompatItemReceiver(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.MediaBrowserCompatSearchResultReceiver(), new defaultFeatures(str, getcreatedondatems));
    }

    public static /* synthetic */ void AudioAttributesImplApi21Parcelizer$default(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs getcreatedondatems, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        AudioAttributesImplApi21Parcelizer(getconfigoverride, str, getcreatedondatems);
    }

    public static final void AudioAttributesImplApi21Parcelizer(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.MediaMetadataCompat(), new defaultFeatures(str, getcreatedondatems));
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer$default(getConfigOverride getconfigoverride, String str, MagicModuleSubmissionRequestBody magicModuleSubmissionRequestBody, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        RemoteActionCompatParcelizer(getconfigoverride, str, (MagicModuleSubmissionRequestBody<? super Float, ? super Float, Boolean>) magicModuleSubmissionRequestBody);
    }

    public static final void RemoteActionCompatParcelizer(getConfigOverride getconfigoverride, String str, MagicModuleSubmissionRequestBody<? super Float, ? super Float, Boolean> magicModuleSubmissionRequestBody) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.onFastForward(), new defaultFeatures(str, magicModuleSubmissionRequestBody));
    }

    public static final void AudioAttributesCompatParcelizer(getConfigOverride getconfigoverride, MagicModuleSubmissionRequestBody<? super getReferencedType, ? super SampleVideos<? super getReferencedType>, ? extends Object> magicModuleSubmissionRequestBody) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.onPlay(), magicModuleSubmissionRequestBody);
    }

    public static /* synthetic */ void read$default(getConfigOverride getconfigoverride, String str, getAnswerMap getanswermap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        read(getconfigoverride, str, (getAnswerMap<? super Integer, Boolean>) getanswermap);
    }

    public static final void read(getConfigOverride getconfigoverride, String str, getAnswerMap<? super Integer, Boolean> getanswermap) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.onPause(), new defaultFeatures(str, getanswermap));
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer$default(getConfigOverride getconfigoverride, String str, getAnswerMap getanswermap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        AudioAttributesCompatParcelizer(getconfigoverride, str, (getAnswerMap<? super _writeStringSegment, Boolean>) getanswermap);
    }

    public static final void AudioAttributesCompatParcelizer(getConfigOverride getconfigoverride, String str, getAnswerMap<? super _writeStringSegment, Boolean> getanswermap) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.MediaDescriptionCompat(), new defaultFeatures(str, getanswermap));
    }

    public static /* synthetic */ void write$default(getConfigOverride getconfigoverride, String str, getAnswerMap getanswermap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        write(getconfigoverride, str, (getAnswerMap<? super AbstractDeserializer, Boolean>) getanswermap);
    }

    public static final void write(getConfigOverride getconfigoverride, String str, getAnswerMap<? super AbstractDeserializer, Boolean> getanswermap) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.onPrepareFromMediaId(), new defaultFeatures(str, getanswermap));
    }

    public static /* synthetic */ void AudioAttributesImplBaseParcelizer$default(getConfigOverride getconfigoverride, String str, getAnswerMap getanswermap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        AudioAttributesImplBaseParcelizer(getconfigoverride, str, (getAnswerMap<? super AbstractDeserializer, Boolean>) getanswermap);
    }

    public static final void AudioAttributesImplBaseParcelizer(getConfigOverride getconfigoverride, String str, getAnswerMap<? super AbstractDeserializer, Boolean> getanswermap) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.onPlayFromSearch(), new defaultFeatures(str, getanswermap));
    }

    public static /* synthetic */ void MediaBrowserCompatCustomActionResultReceiver$default(getConfigOverride getconfigoverride, String str, getAnswerMap getanswermap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        MediaBrowserCompatCustomActionResultReceiver(getconfigoverride, str, (getAnswerMap<? super Boolean, Boolean>) getanswermap);
    }

    public static final void MediaBrowserCompatCustomActionResultReceiver(getConfigOverride getconfigoverride, String str, getAnswerMap<? super Boolean, Boolean> getanswermap) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.onPrepareFromSearch(), new defaultFeatures(str, getanswermap));
    }

    public static /* synthetic */ void IconCompatParcelizer$default(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs getcreatedondatems, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        IconCompatParcelizer(getconfigoverride, str, (getCreatedOnDateMs<Boolean>) getcreatedondatems);
    }

    public static final void IconCompatParcelizer(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.write(), new defaultFeatures(str, getcreatedondatems));
    }

    public static /* synthetic */ void IconCompatParcelizer$default(getConfigOverride getconfigoverride, String str, getAnswerMap getanswermap, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        IconCompatParcelizer(getconfigoverride, str, (getAnswerMap<? super AbstractDeserializer, Boolean>) getanswermap);
    }

    public static final void IconCompatParcelizer(getConfigOverride getconfigoverride, String str, getAnswerMap<? super AbstractDeserializer, Boolean> getanswermap) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.MediaBrowserCompatItemReceiver(), new defaultFeatures(str, getanswermap));
    }

    public static /* synthetic */ void read$default(getConfigOverride getconfigoverride, int i, String str, getCreatedOnDateMs getcreatedondatems, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            str = null;
        }
        read(getconfigoverride, i, str, getcreatedondatems);
    }

    public static final void read(getConfigOverride getconfigoverride, int i, String str, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        getconfigoverride.write(_this.INSTANCE.MediaDescriptionCompat(), ResolvableDeserializer.read(i));
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.MediaBrowserCompatMediaItem(), new defaultFeatures(str, getcreatedondatems));
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer$default(getConfigOverride getconfigoverride, String str, getModuleData getmoduledata, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        RemoteActionCompatParcelizer(getconfigoverride, str, (getModuleData<? super Integer, ? super Integer, ? super Boolean, Boolean>) getmoduledata);
    }

    public static final void RemoteActionCompatParcelizer(getConfigOverride getconfigoverride, String str, getModuleData<? super Integer, ? super Integer, ? super Boolean, Boolean> getmoduledata) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.onPlayFromUri(), new defaultFeatures(str, getmoduledata));
    }

    public static /* synthetic */ void RemoteActionCompatParcelizer$default(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs getcreatedondatems, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        RemoteActionCompatParcelizer(getconfigoverride, str, (getCreatedOnDateMs<Boolean>) getcreatedondatems);
    }

    public static final void RemoteActionCompatParcelizer(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.RemoteActionCompatParcelizer(), new defaultFeatures(str, getcreatedondatems));
    }

    public static /* synthetic */ void write$default(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs getcreatedondatems, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        write(getconfigoverride, str, (getCreatedOnDateMs<Boolean>) getcreatedondatems);
    }

    public static final void write(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.IconCompatParcelizer(), new defaultFeatures(str, getcreatedondatems));
    }

    public static /* synthetic */ void MediaMetadataCompat$default(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs getcreatedondatems, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        MediaMetadataCompat(getconfigoverride, str, getcreatedondatems);
    }

    public static final void MediaMetadataCompat(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.onCommand(), new defaultFeatures(str, getcreatedondatems));
    }

    public static /* synthetic */ void AudioAttributesImplApi26Parcelizer$default(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs getcreatedondatems, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        AudioAttributesImplApi26Parcelizer(getconfigoverride, str, getcreatedondatems);
    }

    public static final void AudioAttributesImplApi26Parcelizer(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.AudioAttributesImplApi21Parcelizer(), new defaultFeatures(str, getcreatedondatems));
    }

    public static /* synthetic */ void AudioAttributesCompatParcelizer$default(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs getcreatedondatems, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        AudioAttributesCompatParcelizer(getconfigoverride, str, (getCreatedOnDateMs<Boolean>) getcreatedondatems);
    }

    public static final void AudioAttributesCompatParcelizer(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.AudioAttributesCompatParcelizer(), new defaultFeatures(str, getcreatedondatems));
    }

    public static /* synthetic */ void read$default(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs getcreatedondatems, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        read(getconfigoverride, str, (getCreatedOnDateMs<Boolean>) getcreatedondatems);
    }

    public static final void read(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.AudioAttributesImplApi26Parcelizer(), new defaultFeatures(str, getcreatedondatems));
    }

    public static /* synthetic */ void RatingCompat$default(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs getcreatedondatems, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        RatingCompat(getconfigoverride, str, getcreatedondatems);
    }

    public static final void RatingCompat(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.onPlayFromMediaId(), new defaultFeatures(str, getcreatedondatems));
    }

    public static /* synthetic */ void MediaDescriptionCompat$default(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs getcreatedondatems, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        MediaDescriptionCompat(getconfigoverride, str, getcreatedondatems);
    }

    public static final void MediaDescriptionCompat(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.onCustomAction(), new defaultFeatures(str, getcreatedondatems));
    }

    public static /* synthetic */ void MediaBrowserCompatCustomActionResultReceiver$default(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs getcreatedondatems, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        MediaBrowserCompatCustomActionResultReceiver(getconfigoverride, str, (getCreatedOnDateMs<Boolean>) getcreatedondatems);
    }

    public static final void MediaBrowserCompatCustomActionResultReceiver(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.handleMediaPlayPauseIfPendingOnHandler(), new defaultFeatures(str, getcreatedondatems));
    }

    public static /* synthetic */ void MediaBrowserCompatSearchResultReceiver$default(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs getcreatedondatems, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        MediaBrowserCompatSearchResultReceiver(getconfigoverride, str, getcreatedondatems);
    }

    public static final void MediaBrowserCompatSearchResultReceiver(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver(), new defaultFeatures(str, getcreatedondatems));
    }

    public static /* synthetic */ void MediaBrowserCompatMediaItem$default(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs getcreatedondatems, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        MediaBrowserCompatMediaItem(getconfigoverride, str, getcreatedondatems);
    }

    public static final void MediaBrowserCompatMediaItem(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs<Boolean> getcreatedondatems) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.onAddQueueItem(), new defaultFeatures(str, getcreatedondatems));
    }

    public static /* synthetic */ void AudioAttributesImplBaseParcelizer$default(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs getcreatedondatems, int i, Object obj) {
        if ((i & 1) != 0) {
            str = null;
        }
        AudioAttributesImplBaseParcelizer(getconfigoverride, str, (getCreatedOnDateMs<Float>) getcreatedondatems);
    }

    public static final void AudioAttributesImplBaseParcelizer(getConfigOverride getconfigoverride, String str, getCreatedOnDateMs<Float> getcreatedondatems) {
        getconfigoverride.write(withAbstractTypeResolver.INSTANCE.AudioAttributesImplBaseParcelizer(), new defaultFeatures(str, new AnonymousClass3(getcreatedondatems)));
    }

    /* JADX INFO: renamed from: o.MapperBuilder$3, reason: invalid class name */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "p0", "", "AudioAttributesCompatParcelizer", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    static final class AnonymousClass3 extends MagicModuleUseCase implements getAnswerMap<List<Float>, Boolean> {
        final /* synthetic */ getCreatedOnDateMs<Float> $write;

        @Override // kotlin.getAnswerMap
        /* JADX INFO: renamed from: AudioAttributesCompatParcelizer, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(List<Float> list) {
            boolean z;
            Float fInvoke = this.$write.invoke();
            if (fInvoke == null) {
                z = false;
            } else {
                list.add(fInvoke);
                z = true;
            }
            return Boolean.valueOf(z);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass3(getCreatedOnDateMs<Float> getcreatedondatems) {
            super(1);
            this.$write = getcreatedondatems;
        }
    }

    static {
        _this.INSTANCE.onRemoveQueueItemAt();
        _this.INSTANCE.onPlayFromUri();
        _this.INSTANCE.onPrepare();
        _this.INSTANCE.onPrepareFromSearch();
        _this.INSTANCE.AudioAttributesImplBaseParcelizer();
        _this.INSTANCE.onCommand();
        _this.INSTANCE.onPause();
        _this.INSTANCE.onPlayFromMediaId();
        _this.INSTANCE.RemoteActionCompatParcelizer();
        _this.INSTANCE.write();
        _this.INSTANCE.AudioAttributesImplApi21Parcelizer();
        _this.INSTANCE.setSessionImpl();
        _this.INSTANCE.RatingCompat();
        _this.INSTANCE.onSkipToPrevious();
        _this.INSTANCE.onRemoveQueueItem();
        _this.INSTANCE.onSetPlaybackSpeed();
        _this.INSTANCE.onSetShuffleMode();
        _this.INSTANCE.onMediaButtonEvent();
        _this.INSTANCE.MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver();
        _this.INSTANCE.AudioAttributesImplApi26Parcelizer();
        _this.INSTANCE.onSetCaptioningEnabled();
        _this.INSTANCE.MediaDescriptionCompat();
        _this.INSTANCE.onPrepareFromUri();
        _this.INSTANCE.AudioAttributesCompatParcelizer();
        _this.INSTANCE.read();
        _this.INSTANCE.onSetRepeatMode();
        _this.INSTANCE.handleMediaPlayPauseIfPendingOnHandler();
        _this.INSTANCE.onPlayFromSearch();
        _this.INSTANCE.onRewind();
        withAbstractTypeResolver.INSTANCE.read();
    }
}
