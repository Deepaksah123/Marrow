###### Class androidx.media3.exoplayer.dash.DashMediaSource (androidx.media3.exoplayer.dash.DashMediaSource)
.class public final Landroidx/media3/exoplayer/dash/DashMediaSource;
.super Lo/NumberSerializers1;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;,
        Landroidx/media3/exoplayer/dash/DashMediaSource$write;,
        Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;,
        Landroidx/media3/exoplayer/dash/DashMediaSource$read;,
        Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesCompatParcelizer;,
        Landroidx/media3/exoplayer/dash/DashMediaSource$RemoteActionCompatParcelizer;,
        Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesImplApi21Parcelizer;,
        Landroidx/media3/exoplayer/dash/DashMediaSource$MediaBrowserCompatCustomActionResultReceiver;
    }
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Lo/_hasTypeResolver;

.field private final AudioAttributesImplApi21Parcelizer:Lo/matchesUntyped;

.field private AudioAttributesImplApi26Parcelizer:J

.field private final AudioAttributesImplBaseParcelizer:J

.field private final IconCompatParcelizer:Lo/_fromClass;

.field private MediaBrowserCompatCustomActionResultReceiver:J

.field private MediaBrowserCompatItemReceiver:I

.field private MediaBrowserCompatMediaItem:Landroid/net/Uri;

.field private MediaBrowserCompatSearchResultReceiver:Lo/constructCollectionType;

.field private MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/io/IOException;

.field private MediaDescriptionCompat:Landroid/os/Handler;

.field private MediaMetadataCompat:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

.field private final RatingCompat:Lo/_resolveSuperClass;

.field private final RemoteActionCompatParcelizer:Lo/addTypedSerializer$write;

.field private handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

.field private final onAddQueueItem:Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesCompatParcelizer;

.field private final onCommand:Lo/StdKeySerializer$read;

.field private final onCustomAction:Lo/_hasTypeResolver$write;

.field private onFastForward:J

.field private onMediaButtonEvent:Z

.field private final onPause:Lo/classForName;

.field private onPlay:J

.field private final onPlayFromMediaId:Lo/constructGeneralizedType$IconCompatParcelizer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/constructGeneralizedType$IconCompatParcelizer<",
            "+",
            "Lo/FilteredBeanPropertyWriterMultiView;",
            ">;"
        }
    .end annotation
.end field

.field private final onPlayFromSearch:J

.field private onPlayFromUri:Lo/TypeNameIdResolver;

.field private onPrepare:Landroid/net/Uri;

.field private final onPrepareFromMediaId:Ljava/lang/Object;

.field private onPrepareFromSearch:Lo/JsonSerializableSchema;

.field private final onPrepareFromUri:Lo/AttributePropertyWriter$IconCompatParcelizer;

.field private final onRemoveQueueItem:Ljava/lang/Runnable;

.field private final onRemoveQueueItemAt:Z

.field private final onRewind:Ljava/lang/Runnable;

.field private final onSeekTo:Landroid/util/SparseArray;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/util/SparseArray<",
            "Lo/_suppressableValue;",
            ">;"
        }
    .end annotation
.end field

.field private onSetRating:I

.field private final read:Lo/_useStatic;

.field private final write:Lo/typedValueSerializer;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 102
    const-string v0, "media3.exoplayer.dash"

    invoke-static {v0}, Lo/isSafeSubType;->AudioAttributesCompatParcelizer(Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Lo/JsonSerializableSchema;Lo/FilteredBeanPropertyWriterMultiView;Lo/_hasTypeResolver$write;Lo/constructGeneralizedType$IconCompatParcelizer;Lo/addTypedSerializer$write;Lo/_useStatic;Lo/_fromClass;Lo/matchesUntyped;Lo/_resolveSuperClass;JJ)V
    .registers 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/JsonSerializableSchema;",
            "Lo/FilteredBeanPropertyWriterMultiView;",
            "Lo/_hasTypeResolver$write;",
            "Lo/constructGeneralizedType$IconCompatParcelizer<",
            "+",
            "Lo/FilteredBeanPropertyWriterMultiView;",
            ">;",
            "Lo/addTypedSerializer$write;",
            "Lo/_useStatic;",
            "Lo/_fromClass;",
            "Lo/matchesUntyped;",
            "Lo/_resolveSuperClass;",
            "JJ)V"
        }
    .end annotation

    .line 463
    invoke-direct {p0}, Lo/NumberSerializers1;-><init>()V

    .line 464
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPrepareFromSearch:Lo/JsonSerializableSchema;

    .line 465
    iget-object p2, p1, Lo/JsonSerializableSchema;->RemoteActionCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    iput-object p2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaMetadataCompat:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    .line 466
    iget-object p2, p1, Lo/JsonSerializableSchema;->AudioAttributesCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;

    invoke-static {p2}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;

    iget-object p2, p2, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;->MediaBrowserCompatItemReceiver:Landroid/net/Uri;

    iput-object p2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPrepare:Landroid/net/Uri;

    .line 467
    iget-object p1, p1, Lo/JsonSerializableSchema;->AudioAttributesCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;

    iget-object p1, p1, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;->MediaBrowserCompatItemReceiver:Landroid/net/Uri;

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatMediaItem:Landroid/net/Uri;

    const/4 p1, 0x0

    .line 468
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    .line 469
    iput-object p3, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onCustomAction:Lo/_hasTypeResolver$write;

    .line 470
    iput-object p4, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPlayFromMediaId:Lo/constructGeneralizedType$IconCompatParcelizer;

    .line 471
    iput-object p5, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->RemoteActionCompatParcelizer:Lo/addTypedSerializer$write;

    .line 472
    iput-object p7, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->IconCompatParcelizer:Lo/_fromClass;

    .line 473
    iput-object p8, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesImplApi21Parcelizer:Lo/matchesUntyped;

    .line 474
    iput-object p9, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->RatingCompat:Lo/_resolveSuperClass;

    .line 475
    iput-wide p10, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesImplBaseParcelizer:J

    .line 476
    iput-wide p12, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPlayFromSearch:J

    .line 477
    iput-object p6, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->read:Lo/_useStatic;

    .line 478
    new-instance p2, Lo/typedValueSerializer;

    invoke-direct {p2}, Lo/typedValueSerializer;-><init>()V

    iput-object p2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->write:Lo/typedValueSerializer;

    const/4 p2, 0x0

    .line 479
    iput-boolean p2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onRemoveQueueItemAt:Z

    .line 480
    invoke-virtual {p0, p1}, Lo/NumberSerializers1;->createEventDispatcher(Lo/StdKeySerializers$write;)Lo/StdKeySerializer$read;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onCommand:Lo/StdKeySerializer$read;

    .line 481
    new-instance p1, Ljava/lang/Object;

    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPrepareFromMediaId:Ljava/lang/Object;

    .line 482
    new-instance p1, Landroid/util/SparseArray;

    invoke-direct {p1}, Landroid/util/SparseArray;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onSeekTo:Landroid/util/SparseArray;

    .line 483
    new-instance p1, Landroidx/media3/exoplayer/dash/DashMediaSource$write;

    invoke-direct {p1, p0, p2}, Landroidx/media3/exoplayer/dash/DashMediaSource$write;-><init>(Landroidx/media3/exoplayer/dash/DashMediaSource;B)V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPrepareFromUri:Lo/AttributePropertyWriter$IconCompatParcelizer;

    const-wide p3, -0x7fffffffffffffffL    # -4.9E-324

    .line 484
    iput-wide p3, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesImplApi26Parcelizer:J

    .line 485
    iput-wide p3, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatCustomActionResultReceiver:J

    .line 493
    new-instance p1, Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesCompatParcelizer;

    invoke-direct {p1, p0, p2}, Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesCompatParcelizer;-><init>(Landroidx/media3/exoplayer/dash/DashMediaSource;B)V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onAddQueueItem:Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesCompatParcelizer;

    .line 494
    new-instance p1, Landroidx/media3/exoplayer/dash/DashMediaSource$RemoteActionCompatParcelizer;

    invoke-direct {p1, p0}, Landroidx/media3/exoplayer/dash/DashMediaSource$RemoteActionCompatParcelizer;-><init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPause:Lo/classForName;

    .line 495
    new-instance p1, Lo/_suppressNulls;

    invoke-direct {p1, p0}, Lo/_suppressNulls;-><init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onRewind:Ljava/lang/Runnable;

    .line 496
    new-instance p1, Lo/SerializersBase;

    invoke-direct {p1, p0}, Lo/SerializersBase;-><init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onRemoveQueueItem:Ljava/lang/Runnable;

    return-void
.end method

.method synthetic constructor <init>(Lo/JsonSerializableSchema;Lo/_hasTypeResolver$write;Lo/constructGeneralizedType$IconCompatParcelizer;Lo/addTypedSerializer$write;Lo/_useStatic;Lo/_fromClass;Lo/matchesUntyped;Lo/_resolveSuperClass;JJ)V
    .registers 27

    const/4 v2, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-wide/from16 v10, p9

    move-wide/from16 v12, p11

    .line 99
    invoke-direct/range {v0 .. v13}, Landroidx/media3/exoplayer/dash/DashMediaSource;-><init>(Lo/JsonSerializableSchema;Lo/FilteredBeanPropertyWriterMultiView;Lo/_hasTypeResolver$write;Lo/constructGeneralizedType$IconCompatParcelizer;Lo/addTypedSerializer$write;Lo/_useStatic;Lo/_fromClass;Lo/matchesUntyped;Lo/_resolveSuperClass;JJ)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer()J
    .registers 3

    .line 1090
    iget p0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onSetRating:I

    add-int/lit8 p0, p0, -0x1

    mul-int/lit16 p0, p0, 0x3e8

    const/16 v0, 0x1388

    invoke-static {p0, v0}, Ljava/lang/Math;->min(II)I

    move-result p0

    int-to-long v0, p0

    return-wide v0
.end method

.method private static AudioAttributesCompatParcelizer(Lo/FilteredBeanPropertyWriterMultiView;J)J
    .registers 23

    move-object/from16 v0, p0

    .line 1105
    invoke-virtual/range {p0 .. p0}, Lo/FilteredBeanPropertyWriterMultiView;->read()I

    move-result v1

    add-int/lit8 v1, v1, -0x1

    .line 1106
    invoke-virtual {v0, v1}, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesCompatParcelizer(I)Lo/serializeContents;

    move-result-object v2

    .line 1107
    iget-wide v3, v2, Lo/serializeContents;->IconCompatParcelizer:J

    invoke-static {v3, v4}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(J)J

    move-result-wide v3

    .line 1108
    invoke-virtual {v0, v1}, Lo/FilteredBeanPropertyWriterMultiView;->read(I)J

    move-result-wide v5

    .line 1109
    invoke-static/range {p1 .. p2}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(J)J

    move-result-wide v7

    .line 1110
    iget-wide v0, v0, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesCompatParcelizer:J

    invoke-static {v0, v1}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(J)J

    move-result-wide v0

    const-wide/16 v9, 0x1388

    .line 1111
    invoke-static {v9, v10}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(J)J

    move-result-wide v9

    const/4 v11, 0x0

    move v12, v11

    .line 1112
    :goto_28
    iget-object v13, v2, Lo/serializeContents;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v13

    if-ge v12, v13, :cond_6d

    .line 1113
    iget-object v13, v2, Lo/serializeContents;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-interface {v13, v12}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lo/FilteredBeanPropertyWriterSingleView;

    iget-object v13, v13, Lo/FilteredBeanPropertyWriterSingleView;->IconCompatParcelizer:Ljava/util/List;

    .line 1114
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v14

    if-eqz v14, :cond_41

    goto :goto_6a

    .line 1117
    :cond_41
    invoke-interface {v13, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lo/IndexedStringListSerializer;

    invoke-virtual {v13}, Lo/IndexedStringListSerializer;->RemoteActionCompatParcelizer()Lo/Serializers;

    move-result-object v13

    if-eqz v13, :cond_6a

    add-long v14, v0, v3

    .line 1122
    invoke-interface {v13, v5, v6, v7, v8}, Lo/Serializers;->AudioAttributesCompatParcelizer(JJ)J

    move-result-wide v16

    add-long v14, v14, v16

    sub-long/2addr v14, v7

    const-wide/32 v16, 0x186a0

    sub-long v18, v9, v16

    cmp-long v13, v14, v18

    if-ltz v13, :cond_69

    cmp-long v13, v14, v9

    if-lez v13, :cond_6a

    add-long v16, v9, v16

    cmp-long v13, v14, v16

    if-gez v13, :cond_6a

    :cond_69
    move-wide v9, v14

    :cond_6a
    :goto_6a
    add-int/lit8 v12, v12, 0x1

    goto :goto_28

    :cond_6d
    const-wide/16 v0, 0x3e8

    .line 1132
    sget-object v2, Ljava/math/RoundingMode;->CEILING:Ljava/math/RoundingMode;

    invoke-static {v9, v10, v0, v1, v2}, Lo/parseIlstElement;->RemoteActionCompatParcelizer(JJLjava/math/RoundingMode;)J

    move-result-wide v0

    return-wide v0
.end method

.method static synthetic AudioAttributesCompatParcelizer(Landroidx/media3/exoplayer/dash/DashMediaSource;)Ljava/io/IOException;
    .registers 1

    .line 99
    iget-object p0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/io/IOException;

    return-object p0
.end method

.method private AudioAttributesCompatParcelizer(J)V
    .registers 3

    .line 863
    iput-wide p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatCustomActionResultReceiver:J

    const/4 p1, 0x1

    .line 864
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->read(Z)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(JJ)V
    .registers 23

    move-object/from16 v0, p0

    .line 971
    invoke-virtual/range {p0 .. p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->getMediaItem()Lo/JsonSerializableSchema;

    move-result-object v1

    iget-object v1, v1, Lo/JsonSerializableSchema;->RemoteActionCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    .line 973
    invoke-static/range {p1 .. p2}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v6

    .line 976
    iget-wide v2, v1, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;->read:J

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v2, v8

    if-eqz v2, :cond_1e

    .line 977
    iget-wide v2, v1, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;->read:J

    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    goto :goto_38

    .line 978
    :cond_1e
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-object v2, v2, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesImplApi26Parcelizer:Lo/IteratorSerializer;

    if-eqz v2, :cond_3a

    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-object v2, v2, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesImplApi26Parcelizer:Lo/IteratorSerializer;

    iget-wide v2, v2, Lo/IteratorSerializer;->AudioAttributesCompatParcelizer:J

    cmp-long v2, v2, v8

    if-eqz v2, :cond_3a

    .line 980
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-object v2, v2, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesImplApi26Parcelizer:Lo/IteratorSerializer;

    iget-wide v2, v2, Lo/IteratorSerializer;->AudioAttributesCompatParcelizer:J

    invoke-static {v6, v7, v2, v3}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    :goto_38
    move-wide v10, v2

    goto :goto_3b

    :cond_3a
    move-wide v10, v6

    :goto_3b
    sub-long v2, p1, p3

    .line 983
    invoke-static {v2, v3}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v2

    const-wide/16 v4, 0x0

    cmp-long v12, v2, v4

    if-gez v12, :cond_4c

    cmp-long v12, v10, v4

    if-lez v12, :cond_4c

    move-wide v2, v4

    .line 989
    :cond_4c
    iget-object v4, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-wide v4, v4, Lo/FilteredBeanPropertyWriterMultiView;->read:J

    cmp-long v4, v4, v8

    if-eqz v4, :cond_5d

    .line 991
    iget-object v4, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-wide v4, v4, Lo/FilteredBeanPropertyWriterMultiView;->read:J

    add-long/2addr v2, v4

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    :cond_5d
    move-wide v4, v2

    .line 995
    iget-wide v2, v1, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;->IconCompatParcelizer:J

    cmp-long v2, v2, v8

    if-eqz v2, :cond_6b

    .line 996
    iget-wide v2, v1, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;->IconCompatParcelizer:J

    .line 997
    invoke-static/range {v2 .. v7}, Lo/LaissezFaireSubTypeValidator;->read(JJJ)J

    move-result-wide v4

    goto :goto_85

    .line 999
    :cond_6b
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-object v2, v2, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesImplApi26Parcelizer:Lo/IteratorSerializer;

    if-eqz v2, :cond_85

    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-object v2, v2, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesImplApi26Parcelizer:Lo/IteratorSerializer;

    iget-wide v2, v2, Lo/IteratorSerializer;->IconCompatParcelizer:J

    cmp-long v2, v2, v8

    if-eqz v2, :cond_85

    .line 1001
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-object v2, v2, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesImplApi26Parcelizer:Lo/IteratorSerializer;

    iget-wide v2, v2, Lo/IteratorSerializer;->IconCompatParcelizer:J

    .line 1002
    invoke-static/range {v2 .. v7}, Lo/LaissezFaireSubTypeValidator;->read(JJJ)J

    move-result-wide v4

    :cond_85
    :goto_85
    cmp-long v2, v4, v10

    if-lez v2, :cond_8a

    move-wide v10, v4

    .line 1011
    :cond_8a
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaMetadataCompat:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    iget-wide v2, v2, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;->AudioAttributesCompatParcelizer:J

    cmp-long v2, v2, v8

    if-eqz v2, :cond_97

    .line 1013
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaMetadataCompat:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    iget-wide v2, v2, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;->AudioAttributesCompatParcelizer:J

    goto :goto_bd

    .line 1014
    :cond_97
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-object v2, v2, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesImplApi26Parcelizer:Lo/IteratorSerializer;

    if-eqz v2, :cond_ae

    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-object v2, v2, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesImplApi26Parcelizer:Lo/IteratorSerializer;

    iget-wide v2, v2, Lo/IteratorSerializer;->RemoteActionCompatParcelizer:J

    cmp-long v2, v2, v8

    if-eqz v2, :cond_ae

    .line 1016
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-object v2, v2, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesImplApi26Parcelizer:Lo/IteratorSerializer;

    iget-wide v2, v2, Lo/IteratorSerializer;->RemoteActionCompatParcelizer:J

    goto :goto_bd

    .line 1017
    :cond_ae
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-wide v2, v2, Lo/FilteredBeanPropertyWriterMultiView;->MediaBrowserCompatCustomActionResultReceiver:J

    cmp-long v2, v2, v8

    if-eqz v2, :cond_bb

    .line 1018
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-wide v2, v2, Lo/FilteredBeanPropertyWriterMultiView;->MediaBrowserCompatCustomActionResultReceiver:J

    goto :goto_bd

    .line 1020
    :cond_bb
    iget-wide v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesImplBaseParcelizer:J

    :goto_bd
    cmp-long v6, v2, v4

    if-gez v6, :cond_c2

    move-wide v2, v4

    :cond_c2
    cmp-long v6, v2, v10

    if-lez v6, :cond_dd

    .line 1026
    iget-wide v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPlayFromSearch:J

    const-wide/16 v6, 0x2

    div-long v6, p3, v6

    invoke-static {v2, v3, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v2

    sub-long v2, p1, v2

    .line 1028
    invoke-static {v2, v3}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v12

    move-wide v14, v4

    move-wide/from16 v16, v10

    .line 1030
    invoke-static/range {v12 .. v17}, Lo/LaissezFaireSubTypeValidator;->read(JJJ)J

    move-result-wide v2

    .line 1034
    :cond_dd
    iget v6, v1, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;->write:F

    const v7, -0x800001

    cmpl-float v6, v6, v7

    if-eqz v6, :cond_e9

    .line 1035
    iget v6, v1, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;->write:F

    goto :goto_f7

    .line 1036
    :cond_e9
    iget-object v6, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-object v6, v6, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesImplApi26Parcelizer:Lo/IteratorSerializer;

    if-eqz v6, :cond_f6

    .line 1037
    iget-object v6, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-object v6, v6, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesImplApi26Parcelizer:Lo/IteratorSerializer;

    iget v6, v6, Lo/IteratorSerializer;->write:F

    goto :goto_f7

    :cond_f6
    move v6, v7

    .line 1040
    :goto_f7
    iget v12, v1, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer:F

    cmpl-float v12, v12, v7

    if-eqz v12, :cond_100

    .line 1041
    iget v1, v1, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer:F

    goto :goto_10e

    .line 1042
    :cond_100
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-object v1, v1, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesImplApi26Parcelizer:Lo/IteratorSerializer;

    if-eqz v1, :cond_10d

    .line 1043
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-object v1, v1, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesImplApi26Parcelizer:Lo/IteratorSerializer;

    iget v1, v1, Lo/IteratorSerializer;->read:F

    goto :goto_10e

    :cond_10d
    move v1, v7

    :goto_10e
    cmpl-float v12, v6, v7

    if-nez v12, :cond_129

    cmpl-float v7, v1, v7

    if-nez v7, :cond_129

    .line 1045
    iget-object v7, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-object v7, v7, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesImplApi26Parcelizer:Lo/IteratorSerializer;

    if-eqz v7, :cond_126

    iget-object v7, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-object v7, v7, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesImplApi26Parcelizer:Lo/IteratorSerializer;

    iget-wide v12, v7, Lo/IteratorSerializer;->RemoteActionCompatParcelizer:J

    cmp-long v7, v12, v8

    if-nez v7, :cond_129

    :cond_126
    const/high16 v6, 0x3f800000    # 1.0f

    move v1, v6

    .line 1055
    :cond_129
    new-instance v7, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;

    invoke-direct {v7}, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;-><init>()V

    .line 1057
    invoke-virtual {v7, v2, v3}, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;->RemoteActionCompatParcelizer(J)Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;

    move-result-object v2

    .line 1058
    invoke-virtual {v2, v4, v5}, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;->read(J)Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;

    move-result-object v2

    .line 1059
    invoke-virtual {v2, v10, v11}, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;->IconCompatParcelizer(J)Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;

    move-result-object v2

    .line 1060
    invoke-virtual {v2, v6}, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;->RemoteActionCompatParcelizer(F)Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;

    move-result-object v2

    .line 1061
    invoke-virtual {v2, v1}, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;->AudioAttributesCompatParcelizer(F)Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;

    move-result-object v1

    .line 1062
    invoke-virtual {v1}, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;->write()Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    move-result-object v1

    iput-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaMetadataCompat:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    return-void
.end method

.method static synthetic AudioAttributesCompatParcelizer(Landroidx/media3/exoplayer/dash/DashMediaSource;J)V
    .registers 3

    .line 99
    invoke-direct {p0, p1, p2}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer(J)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Lo/MapEntrySerializer;Lo/constructGeneralizedType$IconCompatParcelizer;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/MapEntrySerializer;",
            "Lo/constructGeneralizedType$IconCompatParcelizer<",
            "Ljava/lang/Long;",
            ">;)V"
        }
    .end annotation

    .line 839
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer:Lo/_hasTypeResolver;

    iget-object p1, p1, Lo/MapEntrySerializer;->RemoteActionCompatParcelizer:Ljava/lang/String;

    .line 841
    new-instance v1, Lo/constructGeneralizedType;

    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    const/4 v2, 0x5

    invoke-direct {v1, v0, p1, v2, p2}, Lo/constructGeneralizedType;-><init>(Lo/_hasTypeResolver;Landroid/net/Uri;ILo/constructGeneralizedType$IconCompatParcelizer;)V

    new-instance p1, Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesImplApi21Parcelizer;

    const/4 p2, 0x0

    invoke-direct {p1, p0, p2}, Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesImplApi21Parcelizer;-><init>(Landroidx/media3/exoplayer/dash/DashMediaSource;B)V

    const/4 p2, 0x1

    .line 839
    invoke-direct {p0, v1, p1, p2}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer(Lo/constructGeneralizedType;Lo/constructCollectionType$RemoteActionCompatParcelizer;I)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Lo/constructGeneralizedType;Lo/constructCollectionType$RemoteActionCompatParcelizer;I)V
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lo/constructGeneralizedType<",
            "TT;>;",
            "Lo/constructCollectionType$RemoteActionCompatParcelizer<",
            "Lo/constructGeneralizedType<",
            "TT;>;>;I)V"
        }
    .end annotation

    .line 1097
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatSearchResultReceiver:Lo/constructCollectionType;

    invoke-virtual {v0, p1, p2, p3}, Lo/constructCollectionType;->read(Lo/constructCollectionType$AudioAttributesCompatParcelizer;Lo/constructCollectionType$RemoteActionCompatParcelizer;I)J

    move-result-wide v5

    .line 1098
    iget-object p0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onCommand:Lo/StdKeySerializer$read;

    new-instance p2, Lo/StdDelegatingSerializer;

    iget-wide v2, p1, Lo/constructGeneralizedType;->RemoteActionCompatParcelizer:J

    iget-object v4, p1, Lo/constructGeneralizedType;->write:Lo/SubTypeValidator;

    move-object v1, p2

    invoke-direct/range {v1 .. v6}, Lo/StdDelegatingSerializer;-><init>(JLo/SubTypeValidator;J)V

    iget p1, p1, Lo/constructGeneralizedType;->read:I

    invoke-virtual {p0, p2, p1}, Lo/StdKeySerializer$read;->AudioAttributesCompatParcelizer(Lo/StdDelegatingSerializer;I)V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Lo/serializeContents;)Z
    .registers 6

    const/4 v0, 0x0

    move v1, v0

    .line 1218
    :goto_2
    iget-object v2, p0, Lo/serializeContents;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1e

    .line 1219
    iget-object v2, p0, Lo/serializeContents;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/FilteredBeanPropertyWriterSingleView;

    iget v2, v2, Lo/FilteredBeanPropertyWriterSingleView;->AudioAttributesImplApi21Parcelizer:I

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1d

    const/4 v4, 0x2

    if-eq v2, v4, :cond_1d

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_1d
    return v3

    :cond_1e
    return v0
.end method

.method private AudioAttributesImplApi21Parcelizer()V
    .registers 6

    .line 1070
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaDescriptionCompat:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onRewind:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 1071
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatSearchResultReceiver:Lo/constructCollectionType;

    invoke-virtual {v0}, Lo/constructCollectionType;->IconCompatParcelizer()Z

    move-result v0

    if-eqz v0, :cond_10

    return-void

    .line 1074
    :cond_10
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatSearchResultReceiver:Lo/constructCollectionType;

    invoke-virtual {v0}, Lo/constructCollectionType;->RemoteActionCompatParcelizer()Z

    move-result v0

    if-eqz v0, :cond_1c

    const/4 v0, 0x1

    .line 1075
    iput-boolean v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onMediaButtonEvent:Z

    return-void

    .line 1079
    :cond_1c
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPrepareFromMediaId:Ljava/lang/Object;

    monitor-enter v0

    .line 1080
    :try_start_1f
    iget-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPrepare:Landroid/net/Uri;
    :try_end_21
    .catchall {:try_start_1f .. :try_end_21} :catchall_3b

    .line 1081
    monitor-exit v0

    const/4 v0, 0x0

    .line 1082
    iput-boolean v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onMediaButtonEvent:Z

    .line 1083
    new-instance v0, Lo/constructGeneralizedType;

    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer:Lo/_hasTypeResolver;

    iget-object v3, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPlayFromMediaId:Lo/constructGeneralizedType$IconCompatParcelizer;

    const/4 v4, 0x4

    invoke-direct {v0, v2, v1, v4, v3}, Lo/constructGeneralizedType;-><init>(Lo/_hasTypeResolver;Landroid/net/Uri;ILo/constructGeneralizedType$IconCompatParcelizer;)V

    iget-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onAddQueueItem:Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesCompatParcelizer;

    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->RatingCompat:Lo/_resolveSuperClass;

    .line 1086
    invoke-interface {v2, v4}, Lo/_resolveSuperClass;->write(I)I

    move-result v2

    .line 1083
    invoke-direct {p0, v0, v1, v2}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer(Lo/constructGeneralizedType;Lo/constructCollectionType$RemoteActionCompatParcelizer;I)V

    return-void

    :catchall_3b
    move-exception p0

    .line 1081
    monitor-exit v0

    throw p0
.end method

.method private static IconCompatParcelizer(Lo/serializeContents;JJ)J
    .registers 22

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    .line 1137
    iget-wide v5, v0, Lo/serializeContents;->IconCompatParcelizer:J

    invoke-static {v5, v6}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(J)J

    move-result-wide v5

    .line 1139
    invoke-static/range {p0 .. p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer(Lo/serializeContents;)Z

    move-result v7

    const/4 v8, 0x0

    move-wide v10, v5

    move v9, v8

    .line 1140
    :goto_13
    iget-object v12, v0, Lo/serializeContents;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    if-ge v9, v12, :cond_63

    .line 1141
    iget-object v12, v0, Lo/serializeContents;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-interface {v12, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lo/FilteredBeanPropertyWriterSingleView;

    .line 1142
    iget-object v13, v12, Lo/FilteredBeanPropertyWriterSingleView;->IconCompatParcelizer:Ljava/util/List;

    .line 1145
    iget v14, v12, Lo/FilteredBeanPropertyWriterSingleView;->AudioAttributesImplApi21Parcelizer:I

    const/4 v15, 0x1

    if-eq v14, v15, :cond_2f

    iget v12, v12, Lo/FilteredBeanPropertyWriterSingleView;->AudioAttributesImplApi21Parcelizer:I

    const/4 v14, 0x2

    if-ne v12, v14, :cond_30

    :cond_2f
    move v15, v8

    :cond_30
    if-eqz v7, :cond_34

    if-nez v15, :cond_5f

    .line 1148
    :cond_34
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_3b

    goto :goto_5f

    .line 1151
    :cond_3b
    invoke-interface {v13, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lo/IndexedStringListSerializer;

    invoke-virtual {v12}, Lo/IndexedStringListSerializer;->RemoteActionCompatParcelizer()Lo/Serializers;

    move-result-object v12

    if-eqz v12, :cond_62

    .line 1155
    invoke-interface {v12, v1, v2, v3, v4}, Lo/Serializers;->write(JJ)J

    move-result-wide v13

    const-wide/16 v15, 0x0

    cmp-long v13, v13, v15

    if-nez v13, :cond_52

    goto :goto_62

    .line 1160
    :cond_52
    invoke-interface {v12, v1, v2, v3, v4}, Lo/Serializers;->read(JJ)J

    move-result-wide v13

    .line 1162
    invoke-interface {v12, v13, v14}, Lo/Serializers;->write(J)J

    move-result-wide v12

    add-long/2addr v12, v5

    .line 1164
    invoke-static {v10, v11, v12, v13}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    :cond_5f
    :goto_5f
    add-int/lit8 v9, v9, 0x1

    goto :goto_13

    :cond_62
    :goto_62
    return-wide v5

    :cond_63
    return-wide v10
.end method

.method static synthetic IconCompatParcelizer(Landroidx/media3/exoplayer/dash/DashMediaSource;)Lo/constructCollectionType;
    .registers 1

    .line 99
    iget-object p0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatSearchResultReceiver:Lo/constructCollectionType;

    return-object p0
.end method

.method private IconCompatParcelizer(Ljava/io/IOException;)V
    .registers 6

    .line 868
    const-string v0, "DashMediaSource"

    const-string v1, "Failed to resolve time offset."

    invoke-static {v0, v1, p1}, Lo/prune;->read(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 870
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v0

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v2

    sub-long/2addr v0, v2

    iput-wide v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatCustomActionResultReceiver:J

    const/4 p1, 0x1

    .line 871
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->read(Z)V

    return-void
.end method

.method private MediaBrowserCompatItemReceiver()V
    .registers 3

    .line 847
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatSearchResultReceiver:Lo/constructCollectionType;

    new-instance v1, Landroidx/media3/exoplayer/dash/DashMediaSource$3;

    invoke-direct {v1, p0}, Landroidx/media3/exoplayer/dash/DashMediaSource$3;-><init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V

    invoke-static {v0, v1}, Lo/resolveMemberType;->read(Lo/constructCollectionType;Lo/resolveMemberType$RemoteActionCompatParcelizer;)V

    return-void
.end method

.method private RemoteActionCompatParcelizer(Lo/MapEntrySerializer;)V
    .registers 6

    .line 830
    :try_start_0
    iget-object p1, p1, Lo/MapEntrySerializer;->RemoteActionCompatParcelizer:Ljava/lang/String;

    invoke-static {p1}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesImplApi26Parcelizer(Ljava/lang/String;)J

    move-result-wide v0

    .line 831
    iget-wide v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPlay:J

    sub-long/2addr v0, v2

    invoke-direct {p0, v0, v1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer(J)V
    :try_end_c
    .catch Lo/SchemaAware; {:try_start_0 .. :try_end_c} :catch_d

    return-void

    :catch_d
    move-exception p1

    .line 833
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->IconCompatParcelizer(Ljava/io/IOException;)V

    return-void
.end method

.method private read(J)V
    .registers 4

    .line 1066
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaDescriptionCompat:Landroid/os/Handler;

    iget-object p0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onRewind:Ljava/lang/Runnable;

    invoke-virtual {v0, p0, p1, p2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    return-void
.end method

.method static synthetic read(Landroidx/media3/exoplayer/dash/DashMediaSource;Ljava/io/IOException;)V
    .registers 2

    .line 99
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->IconCompatParcelizer(Ljava/io/IOException;)V

    return-void
.end method

.method private read(Z)V
    .registers 33

    move-object/from16 v0, p0

    const/4 v1, 0x0

    move v2, v1

    .line 876
    :goto_4
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onSeekTo:Landroid/util/SparseArray;

    invoke-virtual {v3}, Landroid/util/SparseArray;->size()I

    move-result v3

    if-ge v2, v3, :cond_29

    .line 877
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onSeekTo:Landroid/util/SparseArray;

    invoke-virtual {v3, v2}, Landroid/util/SparseArray;->keyAt(I)I

    move-result v3

    .line 878
    iget v4, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatItemReceiver:I

    if-lt v3, v4, :cond_26

    .line 879
    iget-object v4, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onSeekTo:Landroid/util/SparseArray;

    invoke-virtual {v4, v2}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lo/_suppressableValue;

    iget-object v5, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget v6, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatItemReceiver:I

    sub-int/2addr v3, v6

    invoke-virtual {v4, v5, v3}, Lo/_suppressableValue;->read(Lo/FilteredBeanPropertyWriterMultiView;I)V

    :cond_26
    add-int/lit8 v2, v2, 0x1

    goto :goto_4

    .line 885
    :cond_29
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    invoke-virtual {v2, v1}, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesCompatParcelizer(I)Lo/serializeContents;

    move-result-object v2

    .line 886
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    invoke-virtual {v3}, Lo/FilteredBeanPropertyWriterMultiView;->read()I

    move-result v3

    const/4 v4, 0x1

    sub-int/2addr v3, v4

    .line 887
    iget-object v5, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    invoke-virtual {v5, v3}, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesCompatParcelizer(I)Lo/serializeContents;

    move-result-object v5

    .line 888
    iget-object v6, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    invoke-virtual {v6, v3}, Lo/FilteredBeanPropertyWriterMultiView;->read(I)J

    move-result-wide v6

    .line 889
    iget-wide v8, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatCustomActionResultReceiver:J

    invoke-static {v8, v9}, Lo/LaissezFaireSubTypeValidator;->RemoteActionCompatParcelizer(J)J

    move-result-wide v8

    invoke-static {v8, v9}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(J)J

    move-result-wide v8

    .line 890
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    .line 892
    invoke-virtual {v3, v1}, Lo/FilteredBeanPropertyWriterMultiView;->read(I)J

    move-result-wide v10

    .line 891
    invoke-static {v2, v10, v11, v8, v9}, Landroidx/media3/exoplayer/dash/DashMediaSource;->IconCompatParcelizer(Lo/serializeContents;JJ)J

    move-result-wide v10

    .line 894
    invoke-static {v5, v6, v7, v8, v9}, Landroidx/media3/exoplayer/dash/DashMediaSource;->write(Lo/serializeContents;JJ)J

    move-result-wide v6

    .line 895
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-boolean v3, v3, Lo/FilteredBeanPropertyWriterMultiView;->RemoteActionCompatParcelizer:Z

    if-eqz v3, :cond_69

    invoke-static {v5}, Landroidx/media3/exoplayer/dash/DashMediaSource;->read(Lo/serializeContents;)Z

    move-result v3

    if-nez v3, :cond_69

    move v3, v4

    goto :goto_6a

    :cond_69
    move v3, v1

    :goto_6a
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v3, :cond_87

    .line 896
    iget-object v5, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-wide v14, v5, Lo/FilteredBeanPropertyWriterMultiView;->MediaBrowserCompatMediaItem:J

    cmp-long v5, v14, v12

    if-eqz v5, :cond_87

    .line 898
    iget-object v5, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-wide v14, v5, Lo/FilteredBeanPropertyWriterMultiView;->MediaBrowserCompatMediaItem:J

    .line 899
    invoke-static {v14, v15}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(J)J

    move-result-wide v14

    sub-long v14, v6, v14

    .line 901
    invoke-static {v10, v11, v14, v15}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    :cond_87
    sub-long v5, v6, v10

    .line 906
    iget-object v7, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-boolean v7, v7, Lo/FilteredBeanPropertyWriterMultiView;->RemoteActionCompatParcelizer:Z

    if-eqz v7, :cond_d1

    .line 907
    iget-object v7, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-wide v14, v7, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesCompatParcelizer:J

    cmp-long v7, v14, v12

    if-eqz v7, :cond_98

    move v1, v4

    :cond_98
    invoke-static {v1}, Lo/buildTypeSerializer;->write(Z)V

    .line 908
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-wide v14, v1, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesCompatParcelizer:J

    .line 910
    invoke-static {v14, v15}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(J)J

    move-result-wide v14

    sub-long/2addr v8, v14

    sub-long/2addr v8, v10

    .line 912
    invoke-direct {v0, v8, v9, v5, v6}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer(JJ)V

    .line 913
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-wide v14, v1, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesCompatParcelizer:J

    .line 914
    invoke-static {v10, v11}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v18

    add-long v14, v14, v18

    .line 915
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaMetadataCompat:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    iget-wide v12, v1, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;->AudioAttributesCompatParcelizer:J

    invoke-static {v12, v13}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(J)J

    move-result-wide v12

    sub-long/2addr v8, v12

    .line 916
    iget-wide v12, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPlayFromSearch:J

    const-wide/16 v18, 0x2

    move-wide/from16 v20, v14

    div-long v14, v5, v18

    invoke-static {v12, v13, v14, v15}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v12

    cmp-long v1, v8, v12

    if-gez v1, :cond_ce

    move-wide/from16 v26, v12

    goto :goto_d8

    :cond_ce
    move-wide/from16 v26, v8

    goto :goto_d8

    :cond_d1
    const-wide v20, -0x7fffffffffffffffL    # -4.9E-324

    const-wide/16 v26, 0x0

    .line 924
    :goto_d8
    iget-wide v1, v2, Lo/serializeContents;->IconCompatParcelizer:J

    invoke-static {v1, v2}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(J)J

    move-result-wide v1

    .line 925
    iget-object v4, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-wide v7, v4, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesCompatParcelizer:J

    iget-wide v12, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatCustomActionResultReceiver:J

    iget v4, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatItemReceiver:I

    iget-object v9, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    .line 935
    invoke-virtual/range {p0 .. p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->getMediaItem()Lo/JsonSerializableSchema;

    move-result-object v29

    .line 936
    iget-object v14, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-boolean v14, v14, Lo/FilteredBeanPropertyWriterMultiView;->RemoteActionCompatParcelizer:Z

    if-eqz v14, :cond_f5

    iget-object v14, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaMetadataCompat:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    goto :goto_f6

    :cond_f5
    const/4 v14, 0x0

    :goto_f6
    move-object/from16 v30, v14

    new-instance v15, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;

    move-object v14, v15

    sub-long v22, v10, v1

    move-object v1, v15

    move-wide v15, v7

    move-wide/from16 v17, v20

    move-wide/from16 v19, v12

    move/from16 v21, v4

    move-wide/from16 v24, v5

    move-object/from16 v28, v9

    invoke-direct/range {v14 .. v30}, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;-><init>(JJJIJJJLo/FilteredBeanPropertyWriterMultiView;Lo/JsonSerializableSchema;Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;)V

    .line 937
    invoke-virtual {v0, v1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->refreshSourceInfo(Lo/PolymorphicTypeValidator;)V

    .line 939
    iget-boolean v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onRemoveQueueItemAt:Z

    if-nez v1, :cond_167

    .line 941
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaDescriptionCompat:Landroid/os/Handler;

    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onRemoveQueueItem:Ljava/lang/Runnable;

    invoke-virtual {v1, v2}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    if-eqz v3, :cond_12f

    .line 944
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaDescriptionCompat:Landroid/os/Handler;

    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onRemoveQueueItem:Ljava/lang/Runnable;

    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-wide v4, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatCustomActionResultReceiver:J

    .line 947
    invoke-static {v4, v5}, Lo/LaissezFaireSubTypeValidator;->RemoteActionCompatParcelizer(J)J

    move-result-wide v4

    .line 946
    invoke-static {v3, v4, v5}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer(Lo/FilteredBeanPropertyWriterMultiView;J)J

    move-result-wide v3

    .line 944
    invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 949
    :cond_12f
    iget-boolean v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onMediaButtonEvent:Z

    if-eqz v1, :cond_137

    .line 950
    invoke-direct/range {p0 .. p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesImplApi21Parcelizer()V

    return-void

    :cond_137
    if-eqz p1, :cond_167

    .line 951
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-boolean v1, v1, Lo/FilteredBeanPropertyWriterMultiView;->RemoteActionCompatParcelizer:Z

    if-eqz v1, :cond_167

    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-wide v1, v1, Lo/FilteredBeanPropertyWriterMultiView;->MediaBrowserCompatItemReceiver:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    if-eqz v1, :cond_167

    .line 955
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-wide v1, v1, Lo/FilteredBeanPropertyWriterMultiView;->MediaBrowserCompatItemReceiver:J

    const-wide/16 v3, 0x0

    cmp-long v5, v1, v3

    if-nez v5, :cond_158

    const-wide/16 v1, 0x1388

    .line 963
    :cond_158
    iget-wide v5, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onFastForward:J

    add-long/2addr v5, v1

    .line 964
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    move-result-wide v1

    sub-long/2addr v5, v1

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v1

    .line 965
    invoke-direct {v0, v1, v2}, Landroidx/media3/exoplayer/dash/DashMediaSource;->read(J)V

    :cond_167
    return-void
.end method

.method private static read(Lo/serializeContents;)Z
    .registers 4

    const/4 v0, 0x0

    move v1, v0

    .line 1207
    :goto_2
    iget-object v2, p0, Lo/serializeContents;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_2b

    .line 1209
    iget-object v2, p0, Lo/serializeContents;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/FilteredBeanPropertyWriterSingleView;

    iget-object v2, v2, Lo/FilteredBeanPropertyWriterSingleView;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {v2, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/IndexedStringListSerializer;

    invoke-virtual {v2}, Lo/IndexedStringListSerializer;->RemoteActionCompatParcelizer()Lo/Serializers;

    move-result-object v2

    if-eqz v2, :cond_29

    .line 1210
    invoke-interface {v2}, Lo/Serializers;->IconCompatParcelizer()Z

    move-result v2

    if-nez v2, :cond_29

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_29
    const/4 p0, 0x1

    return p0

    :cond_2b
    return v0
.end method

.method private static write(Lo/serializeContents;JJ)J
    .registers 22

    move-object/from16 v0, p0

    move-wide/from16 v1, p1

    move-wide/from16 v3, p3

    .line 1171
    iget-wide v5, v0, Lo/serializeContents;->IconCompatParcelizer:J

    invoke-static {v5, v6}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(J)J

    move-result-wide v5

    .line 1173
    invoke-static/range {p0 .. p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer(Lo/serializeContents;)Z

    move-result v7

    const-wide v8, 0x7fffffffffffffffL

    const/4 v10, 0x0

    move v11, v10

    .line 1174
    :goto_17
    iget-object v12, v0, Lo/serializeContents;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-interface {v12}, Ljava/util/List;->size()I

    move-result v12

    if-ge v11, v12, :cond_72

    .line 1175
    iget-object v12, v0, Lo/serializeContents;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-interface {v12, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lo/FilteredBeanPropertyWriterSingleView;

    .line 1176
    iget-object v13, v12, Lo/FilteredBeanPropertyWriterSingleView;->IconCompatParcelizer:Ljava/util/List;

    .line 1179
    iget v14, v12, Lo/FilteredBeanPropertyWriterSingleView;->AudioAttributesImplApi21Parcelizer:I

    const/4 v15, 0x1

    if-eq v14, v15, :cond_33

    iget v12, v12, Lo/FilteredBeanPropertyWriterSingleView;->AudioAttributesImplApi21Parcelizer:I

    const/4 v14, 0x2

    if-ne v12, v14, :cond_34

    :cond_33
    move v15, v10

    :cond_34
    if-eqz v7, :cond_38

    if-nez v15, :cond_6f

    .line 1182
    :cond_38
    invoke-interface {v13}, Ljava/util/List;->isEmpty()Z

    move-result v12

    if-eqz v12, :cond_3f

    goto :goto_6f

    .line 1185
    :cond_3f
    invoke-interface {v13, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lo/IndexedStringListSerializer;

    invoke-virtual {v12}, Lo/IndexedStringListSerializer;->RemoteActionCompatParcelizer()Lo/Serializers;

    move-result-object v12

    if-nez v12, :cond_4d

    add-long/2addr v5, v1

    return-wide v5

    .line 1189
    :cond_4d
    invoke-interface {v12, v1, v2, v3, v4}, Lo/Serializers;->write(JJ)J

    move-result-wide v13

    const-wide/16 v15, 0x0

    cmp-long v15, v13, v15

    if-nez v15, :cond_58

    return-wide v5

    .line 1194
    :cond_58
    invoke-interface {v12, v1, v2, v3, v4}, Lo/Serializers;->read(JJ)J

    move-result-wide v15

    add-long/2addr v15, v13

    const-wide/16 v13, 0x1

    sub-long v13, v15, v13

    .line 1198
    invoke-interface {v12, v13, v14}, Lo/Serializers;->write(J)J

    move-result-wide v15

    .line 1199
    invoke-interface {v12, v13, v14, v1, v2}, Lo/Serializers;->IconCompatParcelizer(JJ)J

    move-result-wide v12

    add-long/2addr v15, v5

    add-long/2addr v12, v15

    .line 1201
    invoke-static {v8, v9, v12, v13}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v8

    :cond_6f
    :goto_6f
    add-int/lit8 v11, v11, 0x1

    goto :goto_17

    :cond_72
    return-wide v8
.end method

.method public static synthetic write(Landroidx/media3/exoplayer/dash/DashMediaSource;)V
    .registers 1

    .line 1220
    invoke-direct {p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesImplApi21Parcelizer()V

    return-void
.end method

.method private write(Lo/MapEntrySerializer;)V
    .registers 4

    .line 809
    iget-object v0, p1, Lo/MapEntrySerializer;->write:Ljava/lang/String;

    .line 810
    const-string v1, "urn:mpeg:dash:utc:direct:2014"

    invoke-static {v0, v1}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_64

    .line 811
    const-string v1, "urn:mpeg:dash:utc:direct:2012"

    invoke-static {v0, v1}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_64

    .line 813
    const-string v1, "urn:mpeg:dash:utc:http-iso:2014"

    invoke-static {v0, v1}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5b

    .line 814
    const-string v1, "urn:mpeg:dash:utc:http-iso:2012"

    invoke-static {v0, v1}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5b

    .line 816
    const-string v1, "urn:mpeg:dash:utc:http-xsdate:2014"

    invoke-static {v0, v1}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_51

    .line 817
    const-string v1, "urn:mpeg:dash:utc:http-xsdate:2012"

    invoke-static {v0, v1}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_51

    .line 819
    const-string p1, "urn:mpeg:dash:utc:ntp:2014"

    invoke-static {v0, p1}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4d

    .line 820
    const-string p1, "urn:mpeg:dash:utc:ntp:2012"

    invoke-static {v0, p1}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_4d

    .line 824
    new-instance p1, Ljava/io/IOException;

    const-string v0, "Unsupported UTC timing scheme"

    invoke-direct {p1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->IconCompatParcelizer(Ljava/io/IOException;)V

    return-void

    .line 821
    :cond_4d
    invoke-direct {p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatItemReceiver()V

    return-void

    .line 818
    :cond_51
    new-instance v0, Landroidx/media3/exoplayer/dash/DashMediaSource$MediaBrowserCompatCustomActionResultReceiver;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/dash/DashMediaSource$MediaBrowserCompatCustomActionResultReceiver;-><init>(B)V

    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer(Lo/MapEntrySerializer;Lo/constructGeneralizedType$IconCompatParcelizer;)V

    return-void

    .line 815
    :cond_5b
    new-instance v0, Landroidx/media3/exoplayer/dash/DashMediaSource$read;

    invoke-direct {v0}, Landroidx/media3/exoplayer/dash/DashMediaSource$read;-><init>()V

    invoke-direct {p0, p1, v0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer(Lo/MapEntrySerializer;Lo/constructGeneralizedType$IconCompatParcelizer;)V

    return-void

    .line 812
    :cond_64
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->RemoteActionCompatParcelizer(Lo/MapEntrySerializer;)V

    return-void
.end method


# virtual methods
.method final AudioAttributesCompatParcelizer(Lo/constructGeneralizedType;JJLjava/io/IOException;)Lo/constructCollectionType$write;
    .registers 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/constructGeneralizedType<",
            "Ljava/lang/Long;",
            ">;JJ",
            "Ljava/io/IOException;",
            ")",
            "Lo/constructCollectionType$write;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p6

    .line 774
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onCommand:Lo/StdKeySerializer$read;

    iget-wide v5, v1, Lo/constructGeneralizedType;->RemoteActionCompatParcelizer:J

    iget-object v7, v1, Lo/constructGeneralizedType;->write:Lo/SubTypeValidator;

    .line 778
    invoke-virtual/range {p1 .. p1}, Lo/constructGeneralizedType;->MediaBrowserCompatCustomActionResultReceiver()Landroid/net/Uri;

    move-result-object v8

    .line 779
    invoke-virtual/range {p1 .. p1}, Lo/constructGeneralizedType;->read()Ljava/util/Map;

    move-result-object v9

    .line 782
    new-instance v14, Lo/StdDelegatingSerializer;

    invoke-virtual/range {p1 .. p1}, Lo/constructGeneralizedType;->write()J

    move-result-wide v15

    move-object v4, v14

    move-wide/from16 v10, p2

    move-wide/from16 v12, p4

    move-object v0, v14

    move-wide v14, v15

    invoke-direct/range {v4 .. v15}, Lo/StdDelegatingSerializer;-><init>(JLo/SubTypeValidator;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    iget v4, v1, Lo/constructGeneralizedType;->read:I

    const/4 v5, 0x1

    .line 774
    invoke-virtual {v3, v0, v4, v2, v5}, Lo/StdKeySerializer$read;->read(Lo/StdDelegatingSerializer;ILjava/io/IOException;Z)V

    .line 786
    iget-wide v0, v1, Lo/constructGeneralizedType;->RemoteActionCompatParcelizer:J

    move-object/from16 v0, p0

    .line 787
    invoke-direct {v0, v2}, Landroidx/media3/exoplayer/dash/DashMediaSource;->IconCompatParcelizer(Ljava/io/IOException;)V

    .line 788
    sget-object v0, Lo/constructCollectionType;->RemoteActionCompatParcelizer:Lo/constructCollectionType$write;

    return-object v0
.end method

.method final AudioAttributesCompatParcelizer(Lo/constructGeneralizedType;JJ)V
    .registers 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/constructGeneralizedType<",
            "*>;JJ)V"
        }
    .end annotation

    move-object v0, p1

    .line 793
    iget-wide v2, v0, Lo/constructGeneralizedType;->RemoteActionCompatParcelizer:J

    iget-object v4, v0, Lo/constructGeneralizedType;->write:Lo/SubTypeValidator;

    .line 797
    invoke-virtual {p1}, Lo/constructGeneralizedType;->MediaBrowserCompatCustomActionResultReceiver()Landroid/net/Uri;

    move-result-object v5

    .line 798
    invoke-virtual {p1}, Lo/constructGeneralizedType;->read()Ljava/util/Map;

    move-result-object v6

    .line 801
    new-instance v13, Lo/StdDelegatingSerializer;

    invoke-virtual {p1}, Lo/constructGeneralizedType;->write()J

    move-result-wide v11

    move-object v1, v13

    move-wide/from16 v7, p2

    move-wide/from16 v9, p4

    invoke-direct/range {v1 .. v12}, Lo/StdDelegatingSerializer;-><init>(JLo/SubTypeValidator;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 802
    iget-wide v1, v0, Lo/constructGeneralizedType;->RemoteActionCompatParcelizer:J

    move-object v1, p0

    .line 803
    iget-object v1, v1, Landroidx/media3/exoplayer/dash/DashMediaSource;->onCommand:Lo/StdKeySerializer$read;

    iget v0, v0, Lo/constructGeneralizedType;->read:I

    invoke-virtual {v1, v13, v0}, Lo/StdKeySerializer$read;->IconCompatParcelizer(Lo/StdDelegatingSerializer;I)V

    return-void
.end method

.method public final synthetic IconCompatParcelizer()V
    .registers 2

    const/4 v0, 0x0

    .line 496
    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->read(Z)V

    return-void
.end method

.method public final canUpdateMediaItem(Lo/JsonSerializableSchema;)Z
    .registers 6

    .line 521
    invoke-virtual {p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->getMediaItem()Lo/JsonSerializableSchema;

    move-result-object p0

    .line 522
    iget-object v0, p0, Lo/JsonSerializableSchema;->AudioAttributesCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;

    .line 523
    invoke-static {v0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;

    .line 524
    iget-object v1, p1, Lo/JsonSerializableSchema;->AudioAttributesCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;

    if-eqz v1, :cond_3a

    .line 525
    iget-object v2, v1, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;->MediaBrowserCompatItemReceiver:Landroid/net/Uri;

    iget-object v3, v0, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;->MediaBrowserCompatItemReceiver:Landroid/net/Uri;

    .line 526
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3a

    iget-object v2, v1, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;->AudioAttributesImplApi21Parcelizer:Ljava/util/List;

    iget-object v3, v0, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;->AudioAttributesImplApi21Parcelizer:Ljava/util/List;

    .line 527
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3a

    iget-object v1, v1, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;->read:Lo/JsonSerializableSchema$write;

    iget-object v0, v0, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;->read:Lo/JsonSerializableSchema$write;

    .line 528
    invoke-static {v1, v0}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3a

    iget-object p0, p0, Lo/JsonSerializableSchema;->RemoteActionCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    iget-object p1, p1, Lo/JsonSerializableSchema;->RemoteActionCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    .line 529
    invoke-virtual {p0, p1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_3a

    const/4 p0, 0x1

    return p0

    :cond_3a
    const/4 p0, 0x0

    return p0
.end method

.method public final createPeriod(Lo/StdKeySerializers$write;Lo/_findWellKnownSimple;J)Lo/StdJdkSerializersAtomicIntegerSerializer;
    .registers 25

    move-object/from16 v0, p0

    move-object/from16 v16, p2

    move-object/from16 v1, p1

    .line 559
    iget-object v2, v1, Lo/StdKeySerializers$write;->AudioAttributesCompatParcelizer:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Integer;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    iget v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatItemReceiver:I

    sub-int/2addr v2, v3

    move v5, v2

    .line 560
    invoke-virtual/range {p0 .. p1}, Lo/NumberSerializers1;->createEventDispatcher(Lo/StdKeySerializers$write;)Lo/StdKeySerializer$read;

    move-result-object v12

    .line 561
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->createDrmEventDispatcher(Lo/StdKeySerializers$write;)Lo/PropertySerializerMapEmpty$read;

    move-result-object v10

    .line 562
    iget v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatItemReceiver:I

    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-object v4, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->write:Lo/typedValueSerializer;

    iget-object v6, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->RemoteActionCompatParcelizer:Lo/addTypedSerializer$write;

    iget-object v7, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPlayFromUri:Lo/TypeNameIdResolver;

    iget-object v8, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->IconCompatParcelizer:Lo/_fromClass;

    iget-object v9, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesImplApi21Parcelizer:Lo/matchesUntyped;

    iget-object v11, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->RatingCompat:Lo/_resolveSuperClass;

    iget-wide v13, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatCustomActionResultReceiver:J

    iget-object v15, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPause:Lo/classForName;

    move/from16 v19, v1

    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->read:Lo/_useStatic;

    move-object/from16 v17, v1

    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPrepareFromUri:Lo/AttributePropertyWriter$IconCompatParcelizer;

    move-object/from16 v18, v1

    .line 580
    new-instance v1, Lo/_suppressableValue;

    move-object/from16 p1, v1

    add-int v2, v19, v2

    invoke-virtual/range {p0 .. p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->getPlayerId()Lo/modifyArraySerializer;

    move-result-object v19

    invoke-direct/range {v1 .. v19}, Lo/_suppressableValue;-><init>(ILo/FilteredBeanPropertyWriterMultiView;Lo/typedValueSerializer;ILo/addTypedSerializer$write;Lo/TypeNameIdResolver;Lo/_fromClass;Lo/matchesUntyped;Lo/PropertySerializerMapEmpty$read;Lo/_resolveSuperClass;Lo/StdKeySerializer$read;JLo/classForName;Lo/_findWellKnownSimple;Lo/_useStatic;Lo/AttributePropertyWriter$IconCompatParcelizer;Lo/modifyArraySerializer;)V

    .line 581
    iget-object v0, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onSeekTo:Landroid/util/SparseArray;

    iget v2, v1, Lo/_suppressableValue;->RemoteActionCompatParcelizer:I

    invoke-virtual {v0, v2, v1}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V

    return-object v1
.end method

.method public final getMediaItem()Lo/JsonSerializableSchema;
    .registers 2

    monitor-enter p0

    .line 516
    :try_start_1
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPrepareFromSearch:Lo/JsonSerializableSchema;
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_5

    monitor-exit p0

    return-object v0

    :catchall_5
    move-exception v0

    monitor-exit p0

    throw v0
.end method

.method public final maybeThrowSourceInfoRefreshError()V
    .registers 1
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 554
    iget-object p0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPause:Lo/classForName;

    invoke-interface {p0}, Lo/classForName;->read()V

    return-void
.end method

.method public final prepareSourceInternal(Lo/TypeNameIdResolver;)V
    .registers 4

    .line 539
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPlayFromUri:Lo/TypeNameIdResolver;

    .line 540
    iget-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesImplApi21Parcelizer:Lo/matchesUntyped;

    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-virtual {p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->getPlayerId()Lo/modifyArraySerializer;

    move-result-object v1

    invoke-interface {p1, v0, v1}, Lo/matchesUntyped;->write(Landroid/os/Looper;Lo/modifyArraySerializer;)V

    .line 541
    iget-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesImplApi21Parcelizer:Lo/matchesUntyped;

    invoke-interface {p1}, Lo/matchesUntyped;->IconCompatParcelizer()V

    .line 542
    iget-boolean p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onRemoveQueueItemAt:Z

    if-eqz p1, :cond_1d

    const/4 p1, 0x0

    .line 543
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->read(Z)V

    return-void

    .line 545
    :cond_1d
    iget-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onCustomAction:Lo/_hasTypeResolver$write;

    invoke-interface {p1}, Lo/_hasTypeResolver$write;->write()Lo/_hasTypeResolver;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer:Lo/_hasTypeResolver;

    .line 546
    new-instance p1, Lo/constructCollectionType;

    const-string v0, "DashMediaSource"

    invoke-direct {p1, v0}, Lo/constructCollectionType;-><init>(Ljava/lang/String;)V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatSearchResultReceiver:Lo/constructCollectionType;

    .line 547
    invoke-static {}, Lo/LaissezFaireSubTypeValidator;->RemoteActionCompatParcelizer()Landroid/os/Handler;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaDescriptionCompat:Landroid/os/Handler;

    .line 548
    invoke-direct {p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesImplApi21Parcelizer()V

    return-void
.end method

.method final read(Lo/constructGeneralizedType;JJ)V
    .registers 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/constructGeneralizedType<",
            "Lo/FilteredBeanPropertyWriterMultiView;",
            ">;JJ)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-wide/from16 v14, p2

    .line 634
    iget-wide v3, v1, Lo/constructGeneralizedType;->RemoteActionCompatParcelizer:J

    iget-object v5, v1, Lo/constructGeneralizedType;->write:Lo/SubTypeValidator;

    .line 638
    invoke-virtual/range {p1 .. p1}, Lo/constructGeneralizedType;->MediaBrowserCompatCustomActionResultReceiver()Landroid/net/Uri;

    move-result-object v6

    .line 639
    invoke-virtual/range {p1 .. p1}, Lo/constructGeneralizedType;->read()Ljava/util/Map;

    move-result-object v7

    .line 642
    new-instance v12, Lo/StdDelegatingSerializer;

    invoke-virtual/range {p1 .. p1}, Lo/constructGeneralizedType;->write()J

    move-result-wide v16

    move-object v2, v12

    move-wide/from16 v8, p2

    move-wide/from16 v10, p4

    move-object v14, v12

    move-wide/from16 v12, v16

    invoke-direct/range {v2 .. v13}, Lo/StdDelegatingSerializer;-><init>(JLo/SubTypeValidator;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 643
    iget-wide v2, v1, Lo/constructGeneralizedType;->RemoteActionCompatParcelizer:J

    .line 644
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onCommand:Lo/StdKeySerializer$read;

    iget v3, v1, Lo/constructGeneralizedType;->read:I

    invoke-virtual {v2, v14, v3}, Lo/StdKeySerializer$read;->read(Lo/StdDelegatingSerializer;I)V

    .line 645
    invoke-virtual/range {p1 .. p1}, Lo/constructGeneralizedType;->RemoteActionCompatParcelizer()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/FilteredBeanPropertyWriterMultiView;

    .line 647
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    const/4 v4, 0x0

    if-nez v3, :cond_39

    move v3, v4

    goto :goto_3d

    :cond_39
    invoke-virtual {v3}, Lo/FilteredBeanPropertyWriterMultiView;->read()I

    move-result v3

    .line 649
    :goto_3d
    invoke-virtual {v2, v4}, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesCompatParcelizer(I)Lo/serializeContents;

    move-result-object v5

    iget-wide v5, v5, Lo/serializeContents;->IconCompatParcelizer:J

    move v7, v4

    :goto_44
    if-ge v7, v3, :cond_55

    .line 650
    iget-object v8, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    .line 651
    invoke-virtual {v8, v7}, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesCompatParcelizer(I)Lo/serializeContents;

    move-result-object v8

    iget-wide v8, v8, Lo/serializeContents;->IconCompatParcelizer:J

    cmp-long v8, v8, v5

    if-gez v8, :cond_55

    add-int/lit8 v7, v7, 0x1

    goto :goto_44

    .line 655
    :cond_55
    iget-boolean v5, v2, Lo/FilteredBeanPropertyWriterMultiView;->RemoteActionCompatParcelizer:Z

    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v5, :cond_bf

    sub-int/2addr v3, v7

    .line 657
    invoke-virtual {v2}, Lo/FilteredBeanPropertyWriterMultiView;->read()I

    move-result v5

    if-le v3, v5, :cond_6d

    .line 662
    const-string v2, "DashMediaSource"

    const-string v3, "Loaded out of sync manifest"

    invoke-static {v2, v3}, Lo/prune;->RemoteActionCompatParcelizer(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_9d

    .line 664
    :cond_6d
    iget-wide v5, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesImplApi26Parcelizer:J

    cmp-long v3, v5, v8

    if-eqz v3, :cond_bd

    iget-wide v5, v2, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesImplBaseParcelizer:J

    const-wide/16 v10, 0x3e8

    mul-long/2addr v5, v10

    iget-wide v10, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesImplApi26Parcelizer:J

    cmp-long v3, v5, v10

    if-gtz v3, :cond_bd

    .line 669
    const-string v3, "DashMediaSource"

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "Loaded stale dynamic manifest: "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v5, v2, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesImplBaseParcelizer:J

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", "

    invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v5, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesImplApi26Parcelizer:J

    invoke-virtual {v4, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lo/prune;->RemoteActionCompatParcelizer(Ljava/lang/String;Ljava/lang/String;)V

    .line 679
    :goto_9d
    iget v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onSetRating:I

    add-int/lit8 v3, v2, 0x1

    iput v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onSetRating:I

    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->RatingCompat:Lo/_resolveSuperClass;

    iget v1, v1, Lo/constructGeneralizedType;->read:I

    .line 680
    invoke-interface {v3, v1}, Lo/_resolveSuperClass;->write(I)I

    move-result v1

    if-ge v2, v1, :cond_b5

    .line 681
    invoke-direct/range {p0 .. p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Landroidx/media3/exoplayer/dash/DashMediaSource;->read(J)V

    return-void

    .line 683
    :cond_b5
    new-instance v1, Lo/SerializerFactory;

    invoke-direct {v1}, Lo/SerializerFactory;-><init>()V

    iput-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/io/IOException;

    return-void

    .line 687
    :cond_bd
    iput v4, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onSetRating:I

    .line 690
    :cond_bf
    iput-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    .line 691
    iget-boolean v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onMediaButtonEvent:Z

    iget-boolean v2, v2, Lo/FilteredBeanPropertyWriterMultiView;->RemoteActionCompatParcelizer:Z

    and-int/2addr v2, v3

    iput-boolean v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onMediaButtonEvent:Z

    move-wide/from16 v2, p2

    sub-long v4, v2, p4

    .line 692
    iput-wide v4, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onFastForward:J

    .line 693
    iput-wide v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPlay:J

    .line 694
    iget v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatItemReceiver:I

    add-int/2addr v2, v7

    iput v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatItemReceiver:I

    .line 696
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPrepareFromMediaId:Ljava/lang/Object;

    monitor-enter v2

    .line 701
    :try_start_d8
    iget-object v3, v1, Lo/constructGeneralizedType;->write:Lo/SubTypeValidator;

    iget-object v3, v3, Lo/SubTypeValidator;->AudioAttributesImplBaseParcelizer:Landroid/net/Uri;

    iget-object v4, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPrepare:Landroid/net/Uri;

    if-ne v3, v4, :cond_f1

    .line 706
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-object v3, v3, Lo/FilteredBeanPropertyWriterMultiView;->IconCompatParcelizer:Landroid/net/Uri;

    if-eqz v3, :cond_eb

    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-object v1, v1, Lo/FilteredBeanPropertyWriterMultiView;->IconCompatParcelizer:Landroid/net/Uri;

    goto :goto_ef

    :cond_eb
    invoke-virtual/range {p1 .. p1}, Lo/constructGeneralizedType;->MediaBrowserCompatCustomActionResultReceiver()Landroid/net/Uri;

    move-result-object v1

    :goto_ef
    iput-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPrepare:Landroid/net/Uri;
    :try_end_f1
    .catchall {:try_start_d8 .. :try_end_f1} :catchall_115

    .line 708
    :cond_f1
    monitor-exit v2

    .line 710
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-boolean v1, v1, Lo/FilteredBeanPropertyWriterMultiView;->RemoteActionCompatParcelizer:Z

    if-eqz v1, :cond_110

    iget-wide v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatCustomActionResultReceiver:J

    cmp-long v1, v1, v8

    if-nez v1, :cond_110

    .line 712
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-object v1, v1, Lo/FilteredBeanPropertyWriterMultiView;->MediaMetadataCompat:Lo/MapEntrySerializer;

    if-eqz v1, :cond_10c

    .line 713
    iget-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->handleMediaPlayPauseIfPendingOnHandler:Lo/FilteredBeanPropertyWriterMultiView;

    iget-object v1, v1, Lo/FilteredBeanPropertyWriterMultiView;->MediaMetadataCompat:Lo/MapEntrySerializer;

    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->write(Lo/MapEntrySerializer;)V

    return-void

    .line 715
    :cond_10c
    invoke-direct/range {p0 .. p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatItemReceiver()V

    return-void

    :cond_110
    const/4 v1, 0x1

    .line 718
    invoke-direct {v0, v1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->read(Z)V

    return-void

    :catchall_115
    move-exception v0

    .line 708
    monitor-exit v2

    throw v0
.end method

.method public final releasePeriod(Lo/StdJdkSerializersAtomicIntegerSerializer;)V
    .registers 2

    .line 587
    check-cast p1, Lo/_suppressableValue;

    .line 588
    invoke-virtual {p1}, Lo/_suppressableValue;->MediaBrowserCompatCustomActionResultReceiver()V

    .line 589
    iget-object p0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onSeekTo:Landroid/util/SparseArray;

    iget p1, p1, Lo/_suppressableValue;->RemoteActionCompatParcelizer:I

    invoke-virtual {p0, p1}, Landroid/util/SparseArray;->remove(I)V

    return-void
.end method

.method public final releaseSourceInternal()V
    .registers 5

    const/4 v0, 0x0

    .line 594
    iput-boolean v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onMediaButtonEvent:Z

    const/4 v1, 0x0

    .line 595
    iput-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer:Lo/_hasTypeResolver;

    .line 596
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatSearchResultReceiver:Lo/constructCollectionType;

    if-eqz v2, :cond_f

    .line 597
    invoke-virtual {v2}, Lo/constructCollectionType;->AudioAttributesImplBaseParcelizer()V

    .line 598
    iput-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatSearchResultReceiver:Lo/constructCollectionType;

    :cond_f
    const-wide/16 v2, 0x0

    .line 600
    iput-wide v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onFastForward:J

    .line 601
    iput-wide v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPlay:J

    .line 602
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatMediaItem:Landroid/net/Uri;

    iput-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPrepare:Landroid/net/Uri;

    .line 603
    iput-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver:Ljava/io/IOException;

    .line 604
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaDescriptionCompat:Landroid/os/Handler;

    if-eqz v2, :cond_24

    .line 605
    invoke-virtual {v2, v1}, Landroid/os/Handler;->removeCallbacksAndMessages(Ljava/lang/Object;)V

    .line 606
    iput-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaDescriptionCompat:Landroid/os/Handler;

    :cond_24
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 608
    iput-wide v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatCustomActionResultReceiver:J

    .line 609
    iput v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onSetRating:I

    .line 610
    iput-wide v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesImplApi26Parcelizer:J

    .line 611
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onSeekTo:Landroid/util/SparseArray;

    invoke-virtual {v0}, Landroid/util/SparseArray;->clear()V

    .line 612
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->write:Lo/typedValueSerializer;

    invoke-virtual {v0}, Lo/typedValueSerializer;->AudioAttributesCompatParcelizer()V

    .line 613
    iget-object p0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesImplApi21Parcelizer:Lo/matchesUntyped;

    invoke-interface {p0}, Lo/matchesUntyped;->write()V

    return-void
.end method

.method public final updateMediaItem(Lo/JsonSerializableSchema;)V
    .registers 2

    monitor-enter p0

    .line 534
    :try_start_1
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onPrepareFromSearch:Lo/JsonSerializableSchema;
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_5

    .line 535
    monitor-exit p0

    return-void

    :catchall_5
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method final write(Lo/constructGeneralizedType;JJLjava/io/IOException;I)Lo/constructCollectionType$write;
    .registers 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/constructGeneralizedType<",
            "Lo/FilteredBeanPropertyWriterMultiView;",
            ">;JJ",
            "Ljava/io/IOException;",
            "I)",
            "Lo/constructCollectionType$write;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p6

    .line 728
    iget-wide v4, v1, Lo/constructGeneralizedType;->RemoteActionCompatParcelizer:J

    iget-object v6, v1, Lo/constructGeneralizedType;->write:Lo/SubTypeValidator;

    .line 732
    invoke-virtual/range {p1 .. p1}, Lo/constructGeneralizedType;->MediaBrowserCompatCustomActionResultReceiver()Landroid/net/Uri;

    move-result-object v7

    .line 733
    invoke-virtual/range {p1 .. p1}, Lo/constructGeneralizedType;->read()Ljava/util/Map;

    move-result-object v8

    .line 736
    new-instance v15, Lo/StdDelegatingSerializer;

    invoke-virtual/range {p1 .. p1}, Lo/constructGeneralizedType;->write()J

    move-result-wide v13

    move-object v3, v15

    move-wide/from16 v9, p2

    move-wide/from16 v11, p4

    invoke-direct/range {v3 .. v14}, Lo/StdDelegatingSerializer;-><init>(JLo/SubTypeValidator;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 737
    new-instance v3, Lo/StdArraySerializersShortArraySerializer;

    iget v4, v1, Lo/constructGeneralizedType;->read:I

    invoke-direct {v3, v4}, Lo/StdArraySerializersShortArraySerializer;-><init>(I)V

    .line 738
    new-instance v4, Lo/_resolveSuperClass$AudioAttributesCompatParcelizer;

    move/from16 v5, p7

    invoke-direct {v4, v15, v3, v2, v5}, Lo/_resolveSuperClass$AudioAttributesCompatParcelizer;-><init>(Lo/StdDelegatingSerializer;Lo/StdArraySerializersShortArraySerializer;Ljava/io/IOException;I)V

    .line 740
    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->RatingCompat:Lo/_resolveSuperClass;

    invoke-interface {v3, v4}, Lo/_resolveSuperClass;->write(Lo/_resolveSuperClass$AudioAttributesCompatParcelizer;)J

    move-result-wide v3

    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v5, v3, v5

    if-nez v5, :cond_40

    .line 743
    sget-object v3, Lo/constructCollectionType;->IconCompatParcelizer:Lo/constructCollectionType$write;

    goto :goto_45

    :cond_40
    const/4 v5, 0x0

    .line 744
    invoke-static {v5, v3, v4}, Lo/constructCollectionType;->RemoteActionCompatParcelizer(ZJ)Lo/constructCollectionType$write;

    move-result-object v3

    .line 745
    :goto_45
    invoke-virtual {v3}, Lo/constructCollectionType$write;->read()Z

    move-result v4

    .line 746
    iget-object v0, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onCommand:Lo/StdKeySerializer$read;

    iget v5, v1, Lo/constructGeneralizedType;->read:I

    xor-int/lit8 v6, v4, 0x1

    invoke-virtual {v0, v15, v5, v2, v6}, Lo/StdKeySerializer$read;->read(Lo/StdDelegatingSerializer;ILjava/io/IOException;Z)V

    if-nez v4, :cond_56

    .line 748
    iget-wide v0, v1, Lo/constructGeneralizedType;->RemoteActionCompatParcelizer:J

    :cond_56
    return-object v3
.end method

.method final write()V
    .registers 3

    .line 619
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaDescriptionCompat:Landroid/os/Handler;

    iget-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onRemoveQueueItem:Ljava/lang/Runnable;

    invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V

    .line 620
    invoke-direct {p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesImplApi21Parcelizer()V

    return-void
.end method

.method final write(J)V
    .registers 7

    .line 624
    iget-wide v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesImplApi26Parcelizer:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v2, v0, v2

    if-eqz v2, :cond_10

    cmp-long v0, v0, p1

    if-ltz v0, :cond_10

    return-void

    .line 626
    :cond_10
    iput-wide p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesImplApi26Parcelizer:J

    return-void
.end method

.method final write(Lo/constructGeneralizedType;JJ)V
    .registers 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/constructGeneralizedType<",
            "Ljava/lang/Long;",
            ">;JJ)V"
        }
    .end annotation

    move-object v0, p0

    move-object/from16 v1, p1

    .line 755
    iget-wide v3, v1, Lo/constructGeneralizedType;->RemoteActionCompatParcelizer:J

    iget-object v5, v1, Lo/constructGeneralizedType;->write:Lo/SubTypeValidator;

    .line 759
    invoke-virtual/range {p1 .. p1}, Lo/constructGeneralizedType;->MediaBrowserCompatCustomActionResultReceiver()Landroid/net/Uri;

    move-result-object v6

    .line 760
    invoke-virtual/range {p1 .. p1}, Lo/constructGeneralizedType;->read()Ljava/util/Map;

    move-result-object v7

    .line 763
    new-instance v14, Lo/StdDelegatingSerializer;

    invoke-virtual/range {p1 .. p1}, Lo/constructGeneralizedType;->write()J

    move-result-wide v12

    move-object v2, v14

    move-wide/from16 v8, p2

    move-wide/from16 v10, p4

    invoke-direct/range {v2 .. v13}, Lo/StdDelegatingSerializer;-><init>(JLo/SubTypeValidator;Landroid/net/Uri;Ljava/util/Map;JJJ)V

    .line 764
    iget-wide v2, v1, Lo/constructGeneralizedType;->RemoteActionCompatParcelizer:J

    .line 765
    iget-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource;->onCommand:Lo/StdKeySerializer$read;

    iget v3, v1, Lo/constructGeneralizedType;->read:I

    invoke-virtual {v2, v14, v3}, Lo/StdKeySerializer$read;->read(Lo/StdDelegatingSerializer;I)V

    .line 766
    invoke-virtual/range {p1 .. p1}, Lo/constructGeneralizedType;->RemoteActionCompatParcelizer()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v1

    sub-long v1, v1, p2

    invoke-direct {p0, v1, v2}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer(J)V

    return-void
.end method

###### Class androidx.media3.exoplayer.dash.DashMediaSource.AnonymousClass3 (androidx.media3.exoplayer.dash.DashMediaSource$3)
.class final Landroidx/media3/exoplayer/dash/DashMediaSource$3;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/resolveMemberType$RemoteActionCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/media3/exoplayer/dash/DashMediaSource;->MediaBrowserCompatItemReceiver()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic IconCompatParcelizer:Landroidx/media3/exoplayer/dash/DashMediaSource;


# direct methods
.method constructor <init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V
    .registers 2

    .line 849
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$3;->IconCompatParcelizer:Landroidx/media3/exoplayer/dash/DashMediaSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()V
    .registers 3

    .line 852
    iget-object p0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$3;->IconCompatParcelizer:Landroidx/media3/exoplayer/dash/DashMediaSource;

    invoke-static {}, Lo/resolveMemberType;->AudioAttributesImplApi26Parcelizer()J

    move-result-wide v0

    invoke-static {p0, v0, v1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer(Landroidx/media3/exoplayer/dash/DashMediaSource;J)V

    return-void
.end method

.method public final read(Ljava/io/IOException;)V
    .registers 2

    .line 857
    iget-object p0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$3;->IconCompatParcelizer:Landroidx/media3/exoplayer/dash/DashMediaSource;

    invoke-static {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource;->read(Landroidx/media3/exoplayer/dash/DashMediaSource;Ljava/io/IOException;)V

    return-void
.end method

###### Class androidx.media3.exoplayer.dash.DashMediaSource.AudioAttributesCompatParcelizer (androidx.media3.exoplayer.dash.DashMediaSource$AudioAttributesCompatParcelizer)
.class final Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/constructCollectionType$RemoteActionCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/dash/DashMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "AudioAttributesCompatParcelizer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/constructCollectionType$RemoteActionCompatParcelizer<",
        "Lo/constructGeneralizedType<",
        "Lo/FilteredBeanPropertyWriterMultiView;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic RemoteActionCompatParcelizer:Landroidx/media3/exoplayer/dash/DashMediaSource;


# direct methods
.method private constructor <init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V
    .registers 2

    .line 1390
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/media3/exoplayer/dash/DashMediaSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroidx/media3/exoplayer/dash/DashMediaSource;B)V
    .registers 3

    .line 1390
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesCompatParcelizer;-><init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Lo/constructGeneralizedType;JJ)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/constructGeneralizedType<",
            "Lo/FilteredBeanPropertyWriterMultiView;",
            ">;JJ)V"
        }
    .end annotation

    .line 1395
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/media3/exoplayer/dash/DashMediaSource;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Landroidx/media3/exoplayer/dash/DashMediaSource;->read(Lo/constructGeneralizedType;JJ)V

    return-void
.end method

.method private RemoteActionCompatParcelizer(Lo/constructGeneralizedType;JJ)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/constructGeneralizedType<",
            "Lo/FilteredBeanPropertyWriterMultiView;",
            ">;JJ)V"
        }
    .end annotation

    .line 1404
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/media3/exoplayer/dash/DashMediaSource;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer(Lo/constructGeneralizedType;JJ)V

    return-void
.end method

.method private read(Lo/constructGeneralizedType;JJLjava/io/IOException;I)Lo/constructCollectionType$write;
    .registers 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/constructGeneralizedType<",
            "Lo/FilteredBeanPropertyWriterMultiView;",
            ">;JJ",
            "Ljava/io/IOException;",
            "I)",
            "Lo/constructCollectionType$write;"
        }
    .end annotation

    .line 1414
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer:Landroidx/media3/exoplayer/dash/DashMediaSource;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    move v7, p7

    invoke-virtual/range {v0 .. v7}, Landroidx/media3/exoplayer/dash/DashMediaSource;->write(Lo/constructGeneralizedType;JJLjava/io/IOException;I)Lo/constructCollectionType$write;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final synthetic AudioAttributesCompatParcelizer(Lo/constructCollectionType$AudioAttributesCompatParcelizer;JJLjava/io/IOException;I)Lo/constructCollectionType$write;
    .registers 16

    .line 1390
    move-object v1, p1

    check-cast v1, Lo/constructGeneralizedType;

    move-object v0, p0

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    move v7, p7

    invoke-direct/range {v0 .. v7}, Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesCompatParcelizer;->read(Lo/constructGeneralizedType;JJLjava/io/IOException;I)Lo/constructCollectionType$write;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic RemoteActionCompatParcelizer(Lo/constructCollectionType$AudioAttributesCompatParcelizer;JJ)V
    .registers 12

    .line 1390
    move-object v1, p1

    check-cast v1, Lo/constructGeneralizedType;

    move-object v0, p0

    move-wide v2, p2

    move-wide v4, p4

    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(Lo/constructGeneralizedType;JJ)V

    return-void
.end method

.method public final synthetic read(Lo/constructCollectionType$AudioAttributesCompatParcelizer;JJZ)V
    .registers 13

    .line 1390
    move-object v1, p1

    check-cast v1, Lo/constructGeneralizedType;

    move-object v0, p0

    move-wide v2, p2

    move-wide v4, p4

    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer(Lo/constructGeneralizedType;JJ)V

    return-void
.end method

###### Class androidx.media3.exoplayer.dash.DashMediaSource.AudioAttributesImplApi21Parcelizer (androidx.media3.exoplayer.dash.DashMediaSource$AudioAttributesImplApi21Parcelizer)
.class final Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesImplApi21Parcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/constructCollectionType$RemoteActionCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/dash/DashMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "AudioAttributesImplApi21Parcelizer"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/constructCollectionType$RemoteActionCompatParcelizer<",
        "Lo/constructGeneralizedType<",
        "Ljava/lang/Long;",
        ">;>;"
    }
.end annotation


# instance fields
.field final synthetic write:Landroidx/media3/exoplayer/dash/DashMediaSource;


# direct methods
.method private constructor <init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V
    .registers 2

    .line 1418
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesImplApi21Parcelizer;->write:Landroidx/media3/exoplayer/dash/DashMediaSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroidx/media3/exoplayer/dash/DashMediaSource;B)V
    .registers 3

    .line 1418
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesImplApi21Parcelizer;-><init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Lo/constructGeneralizedType;JJLjava/io/IOException;)Lo/constructCollectionType$write;
    .registers 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/constructGeneralizedType<",
            "Ljava/lang/Long;",
            ">;JJ",
            "Ljava/io/IOException;",
            ")",
            "Lo/constructCollectionType$write;"
        }
    .end annotation

    .line 1442
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesImplApi21Parcelizer;->write:Landroidx/media3/exoplayer/dash/DashMediaSource;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-object v6, p6

    invoke-virtual/range {v0 .. v6}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer(Lo/constructGeneralizedType;JJLjava/io/IOException;)Lo/constructCollectionType$write;

    move-result-object p0

    return-object p0
.end method

.method private AudioAttributesCompatParcelizer(Lo/constructGeneralizedType;JJ)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/constructGeneralizedType<",
            "Ljava/lang/Long;",
            ">;JJ)V"
        }
    .end annotation

    .line 1423
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesImplApi21Parcelizer;->write:Landroidx/media3/exoplayer/dash/DashMediaSource;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Landroidx/media3/exoplayer/dash/DashMediaSource;->write(Lo/constructGeneralizedType;JJ)V

    return-void
.end method

.method private read(Lo/constructGeneralizedType;JJ)V
    .registers 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/constructGeneralizedType<",
            "Ljava/lang/Long;",
            ">;JJ)V"
        }
    .end annotation

    .line 1432
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesImplApi21Parcelizer;->write:Landroidx/media3/exoplayer/dash/DashMediaSource;

    move-object v1, p1

    move-wide v2, p2

    move-wide v4, p4

    invoke-virtual/range {v0 .. v5}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer(Lo/constructGeneralizedType;JJ)V

    return-void
.end method


# virtual methods
.method public final bridge synthetic AudioAttributesCompatParcelizer(Lo/constructCollectionType$AudioAttributesCompatParcelizer;JJLjava/io/IOException;I)Lo/constructCollectionType$write;
    .registers 8

    .line 1418
    check-cast p1, Lo/constructGeneralizedType;

    invoke-direct/range {p0 .. p6}, Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesImplApi21Parcelizer;->AudioAttributesCompatParcelizer(Lo/constructGeneralizedType;JJLjava/io/IOException;)Lo/constructCollectionType$write;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic RemoteActionCompatParcelizer(Lo/constructCollectionType$AudioAttributesCompatParcelizer;JJ)V
    .registers 12

    .line 1418
    move-object v1, p1

    check-cast v1, Lo/constructGeneralizedType;

    move-object v0, p0

    move-wide v2, p2

    move-wide v4, p4

    invoke-direct/range {v0 .. v5}, Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesImplApi21Parcelizer;->AudioAttributesCompatParcelizer(Lo/constructGeneralizedType;JJ)V

    return-void
.end method

.method public final bridge synthetic read(Lo/constructCollectionType$AudioAttributesCompatParcelizer;JJZ)V
    .registers 7

    .line 1418
    check-cast p1, Lo/constructGeneralizedType;

    invoke-direct/range {p0 .. p5}, Landroidx/media3/exoplayer/dash/DashMediaSource$AudioAttributesImplApi21Parcelizer;->read(Lo/constructGeneralizedType;JJ)V

    return-void
.end method

###### Class androidx.media3.exoplayer.dash.DashMediaSource.Factory (androidx.media3.exoplayer.dash.DashMediaSource$Factory)
.class public final Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/StdKeySerializersDefault;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/dash/DashMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Lo/addTypedSerializer$write;

.field private AudioAttributesImplApi21Parcelizer:J

.field private final AudioAttributesImplApi26Parcelizer:Lo/_hasTypeResolver$write;

.field private AudioAttributesImplBaseParcelizer:J

.field private IconCompatParcelizer:Lo/SimpleBeanPropertyFilter;

.field private MediaBrowserCompatCustomActionResultReceiver:Lo/constructGeneralizedType$IconCompatParcelizer;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/constructGeneralizedType$IconCompatParcelizer<",
            "+",
            "Lo/FilteredBeanPropertyWriterMultiView;",
            ">;"
        }
    .end annotation
.end field

.field private MediaBrowserCompatItemReceiver:Lo/_resolveSuperClass;

.field private RemoteActionCompatParcelizer:Lo/_useStatic;

.field private read:Lo/_fromClass$IconCompatParcelizer;


# direct methods
.method public constructor <init>(Lo/_hasTypeResolver$write;)V
    .registers 3

    .line 136
    new-instance v0, Lo/FilteredBeanPropertyWriter$read;

    invoke-direct {v0, p1}, Lo/FilteredBeanPropertyWriter$read;-><init>(Lo/_hasTypeResolver$write;)V

    invoke-direct {p0, v0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;-><init>(Lo/addTypedSerializer$write;Lo/_hasTypeResolver$write;)V

    return-void
.end method

.method private constructor <init>(Lo/addTypedSerializer$write;Lo/_hasTypeResolver$write;)V
    .registers 3

    .line 158
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 159
    invoke-static {p1}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/addTypedSerializer$write;

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->AudioAttributesCompatParcelizer:Lo/addTypedSerializer$write;

    .line 160
    iput-object p2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->AudioAttributesImplApi26Parcelizer:Lo/_hasTypeResolver$write;

    .line 161
    new-instance p1, Lo/PropertySerializerMapMulti;

    invoke-direct {p1}, Lo/PropertySerializerMapMulti;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->IconCompatParcelizer:Lo/SimpleBeanPropertyFilter;

    .line 162
    new-instance p1, Lo/_unknownType;

    invoke-direct {p1}, Lo/_unknownType;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->MediaBrowserCompatItemReceiver:Lo/_resolveSuperClass;

    const-wide/16 p1, 0x7530

    .line 163
    iput-wide p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->AudioAttributesImplApi21Parcelizer:J

    const-wide/32 p1, 0x4c4b40

    .line 164
    iput-wide p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->AudioAttributesImplBaseParcelizer:J

    .line 165
    new-instance p1, Lo/SerializableSerializer;

    invoke-direct {p1}, Lo/SerializableSerializer;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->RemoteActionCompatParcelizer:Lo/_useStatic;

    const/4 p1, 0x1

    .line 166
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->read(Z)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Lo/_fromClass$IconCompatParcelizer;)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;
    .registers 2

    .line 172
    invoke-static {p1}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/_fromClass$IconCompatParcelizer;

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->read:Lo/_fromClass$IconCompatParcelizer;

    return-object p0
.end method

.method private IconCompatParcelizer(Lo/SimpleBeanPropertyFilter;)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;
    .registers 3

    .line 181
    const-string v0, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."

    invoke-static {p1, v0}, Lo/buildTypeSerializer;->write(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/SimpleBeanPropertyFilter;

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->IconCompatParcelizer:Lo/SimpleBeanPropertyFilter;

    return-object p0
.end method

.method private IconCompatParcelizer(Lo/_resolveSuperClass;)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;
    .registers 3

    .line 193
    const-string v0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."

    invoke-static {p1, v0}, Lo/buildTypeSerializer;->write(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/_resolveSuperClass;

    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->MediaBrowserCompatItemReceiver:Lo/_resolveSuperClass;

    return-object p0
.end method

.method private read(Lo/withTimeZone$IconCompatParcelizer;)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;
    .registers 3

    .line 204
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->AudioAttributesCompatParcelizer:Lo/addTypedSerializer$write;

    invoke-static {p1}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/withTimeZone$IconCompatParcelizer;

    invoke-interface {v0, p1}, Lo/addTypedSerializer$write;->IconCompatParcelizer(Lo/withTimeZone$IconCompatParcelizer;)Lo/addTypedSerializer$write;

    return-object p0
.end method

.method private read(Z)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 213
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->AudioAttributesCompatParcelizer:Lo/addTypedSerializer$write;

    invoke-interface {v0, p1}, Lo/addTypedSerializer$write;->IconCompatParcelizer(Z)Lo/addTypedSerializer$write;

    return-object p0
.end method

.method private read(Lo/JsonSerializableSchema;)Landroidx/media3/exoplayer/dash/DashMediaSource;
    .registers 16

    .line 349
    iget-object v2, p1, Lo/JsonSerializableSchema;->AudioAttributesCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;

    .line 352
    new-instance v2, Lo/_inView;

    invoke-direct {v2}, Lo/_inView;-><init>()V

    .line 354
    iget-object v3, p1, Lo/JsonSerializableSchema;->AudioAttributesCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;

    iget-object v3, v3, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;->AudioAttributesImplApi21Parcelizer:Ljava/util/List;

    .line 355
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_18

    .line 356
    new-instance v4, Lo/NumberSerializersDoubleSerializer;

    invoke-direct {v4, v2, v3}, Lo/NumberSerializersDoubleSerializer;-><init>(Lo/constructGeneralizedType$IconCompatParcelizer;Ljava/util/List;)V

    move-object v3, v4

    goto :goto_19

    :cond_18
    move-object v3, v2

    .line 360
    :goto_19
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->read:Lo/_fromClass$IconCompatParcelizer;

    if-nez v2, :cond_1f

    const/4 v2, 0x0

    goto :goto_23

    .line 362
    :cond_1f
    invoke-interface {v2, p1}, Lo/_fromClass$IconCompatParcelizer;->write(Lo/JsonSerializableSchema;)Lo/_fromClass;

    move-result-object v2

    :goto_23
    move-object v6, v2

    .line 364
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->AudioAttributesImplApi26Parcelizer:Lo/_hasTypeResolver$write;

    iget-object v4, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->AudioAttributesCompatParcelizer:Lo/addTypedSerializer$write;

    iget-object v5, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->RemoteActionCompatParcelizer:Lo/_useStatic;

    iget-object v7, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->IconCompatParcelizer:Lo/SimpleBeanPropertyFilter;

    .line 372
    new-instance v13, Landroidx/media3/exoplayer/dash/DashMediaSource;

    invoke-interface {v7, p1}, Lo/SimpleBeanPropertyFilter;->read(Lo/JsonSerializableSchema;)Lo/matchesUntyped;

    move-result-object v7

    iget-object v8, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->MediaBrowserCompatItemReceiver:Lo/_resolveSuperClass;

    iget-wide v9, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->AudioAttributesImplApi21Parcelizer:J

    iget-wide v11, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->AudioAttributesImplBaseParcelizer:J

    move-object v0, v13

    move-object v1, p1

    invoke-direct/range {v0 .. v12}, Landroidx/media3/exoplayer/dash/DashMediaSource;-><init>(Lo/JsonSerializableSchema;Lo/_hasTypeResolver$write;Lo/constructGeneralizedType$IconCompatParcelizer;Lo/addTypedSerializer$write;Lo/_useStatic;Lo/_fromClass;Lo/matchesUntyped;Lo/_resolveSuperClass;JJ)V

    return-object v13
.end method


# virtual methods
.method public final synthetic IconCompatParcelizer(Lo/withTimeZone$IconCompatParcelizer;)Lo/StdKeySerializers$AudioAttributesCompatParcelizer;
    .registers 2

    .line 106
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->read(Lo/withTimeZone$IconCompatParcelizer;)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic read(Lo/_fromClass$IconCompatParcelizer;)Lo/StdKeySerializers$AudioAttributesCompatParcelizer;
    .registers 2

    .line 106
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->AudioAttributesCompatParcelizer(Lo/_fromClass$IconCompatParcelizer;)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic read(Lo/_resolveSuperClass;)Lo/StdKeySerializers$AudioAttributesCompatParcelizer;
    .registers 2

    .line 106
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->IconCompatParcelizer(Lo/_resolveSuperClass;)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic write(Lo/SimpleBeanPropertyFilter;)Lo/StdKeySerializers$AudioAttributesCompatParcelizer;
    .registers 2

    .line 106
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->IconCompatParcelizer(Lo/SimpleBeanPropertyFilter;)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic write(Z)Lo/StdKeySerializers$AudioAttributesCompatParcelizer;
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 106
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->read(Z)Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic write(Lo/JsonSerializableSchema;)Lo/StdKeySerializers;
    .registers 2

    .line 106
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$Factory;->read(Lo/JsonSerializableSchema;)Landroidx/media3/exoplayer/dash/DashMediaSource;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.media3.exoplayer.dash.DashMediaSource.IconCompatParcelizer (androidx.media3.exoplayer.dash.DashMediaSource$IconCompatParcelizer)
.class final Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;
.super Lo/PolymorphicTypeValidator;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/dash/DashMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "IconCompatParcelizer"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

.field private final AudioAttributesImplApi21Parcelizer:J

.field private final AudioAttributesImplApi26Parcelizer:J

.field private final AudioAttributesImplBaseParcelizer:Lo/JsonSerializableSchema;

.field private final IconCompatParcelizer:Lo/FilteredBeanPropertyWriterMultiView;

.field private final MediaBrowserCompatCustomActionResultReceiver:J

.field private final MediaBrowserCompatItemReceiver:J

.field private final MediaBrowserCompatSearchResultReceiver:J

.field private final read:J

.field private final write:I


# direct methods
.method public constructor <init>(JJJIJJJLo/FilteredBeanPropertyWriterMultiView;Lo/JsonSerializableSchema;Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;)V
    .registers 24

    move-object v0, p0

    move-object/from16 v1, p14

    move-object/from16 v2, p16

    .line 1251
    invoke-direct {p0}, Lo/PolymorphicTypeValidator;-><init>()V

    .line 1252
    iget-boolean v3, v1, Lo/FilteredBeanPropertyWriterMultiView;->RemoteActionCompatParcelizer:Z

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eqz v2, :cond_10

    move v6, v4

    goto :goto_11

    :cond_10
    move v6, v5

    :goto_11
    if-ne v3, v6, :cond_14

    goto :goto_15

    :cond_14
    move v4, v5

    :goto_15
    invoke-static {v4}, Lo/buildTypeSerializer;->write(Z)V

    move-wide v3, p1

    .line 1253
    iput-wide v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:J

    move-wide v3, p3

    .line 1254
    iput-wide v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:J

    move-wide v3, p5

    .line 1255
    iput-wide v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->read:J

    move v3, p7

    .line 1256
    iput v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->write:I

    move-wide v3, p8

    .line 1257
    iput-wide v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:J

    move-wide/from16 v3, p10

    .line 1258
    iput-wide v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->MediaBrowserCompatItemReceiver:J

    move-wide/from16 v3, p12

    .line 1259
    iput-wide v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->AudioAttributesImplApi21Parcelizer:J

    .line 1260
    iput-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->IconCompatParcelizer:Lo/FilteredBeanPropertyWriterMultiView;

    move-object/from16 v1, p15

    .line 1261
    iput-object v1, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer:Lo/JsonSerializableSchema;

    .line 1262
    iput-object v2, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    return-void
.end method

.method private read(J)J
    .registers 12

    .line 1322
    iget-wide v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->AudioAttributesImplApi21Parcelizer:J

    .line 1323
    iget-object v2, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->IconCompatParcelizer:Lo/FilteredBeanPropertyWriterMultiView;

    invoke-static {v2}, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->read(Lo/FilteredBeanPropertyWriterMultiView;)Z

    move-result v2

    if-nez v2, :cond_b

    return-wide v0

    :cond_b
    const-wide/16 v2, 0x0

    cmp-long v4, p1, v2

    if-lez v4, :cond_1e

    add-long/2addr v0, p1

    .line 1328
    iget-wide p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->MediaBrowserCompatItemReceiver:J

    cmp-long p1, v0, p1

    if-lez p1, :cond_1e

    const-wide p0, -0x7fffffffffffffffL    # -4.9E-324

    return-wide p0

    .line 1335
    :cond_1e
    iget-wide p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:J

    add-long/2addr p1, v0

    .line 1336
    iget-object v4, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->IconCompatParcelizer:Lo/FilteredBeanPropertyWriterMultiView;

    const/4 v5, 0x0

    invoke-virtual {v4, v5}, Lo/FilteredBeanPropertyWriterMultiView;->read(I)J

    move-result-wide v6

    move v4, v5

    .line 1337
    :goto_29
    iget-object v8, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->IconCompatParcelizer:Lo/FilteredBeanPropertyWriterMultiView;

    invoke-virtual {v8}, Lo/FilteredBeanPropertyWriterMultiView;->read()I

    move-result v8

    add-int/lit8 v8, v8, -0x1

    if-ge v4, v8, :cond_41

    cmp-long v8, p1, v6

    if-ltz v8, :cond_41

    sub-long/2addr p1, v6

    add-int/lit8 v4, v4, 0x1

    .line 1341
    iget-object v6, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->IconCompatParcelizer:Lo/FilteredBeanPropertyWriterMultiView;

    invoke-virtual {v6, v4}, Lo/FilteredBeanPropertyWriterMultiView;->read(I)J

    move-result-wide v6

    goto :goto_29

    .line 1343
    :cond_41
    iget-object p0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->IconCompatParcelizer:Lo/FilteredBeanPropertyWriterMultiView;

    invoke-virtual {p0, v4}, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesCompatParcelizer(I)Lo/serializeContents;

    move-result-object p0

    .line 1344
    invoke-virtual {p0}, Lo/serializeContents;->read()I

    move-result v4

    const/4 v8, -0x1

    if-ne v4, v8, :cond_4f

    goto :goto_78

    .line 1352
    :cond_4f
    iget-object p0, p0, Lo/serializeContents;->RemoteActionCompatParcelizer:Ljava/util/List;

    .line 1353
    invoke-interface {p0, v4}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/FilteredBeanPropertyWriterSingleView;

    iget-object p0, p0, Lo/FilteredBeanPropertyWriterSingleView;->IconCompatParcelizer:Ljava/util/List;

    invoke-interface {p0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/IndexedStringListSerializer;

    invoke-virtual {p0}, Lo/IndexedStringListSerializer;->RemoteActionCompatParcelizer()Lo/Serializers;

    move-result-object p0

    if-eqz p0, :cond_78

    .line 1354
    invoke-interface {p0, v6, v7}, Lo/Serializers;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v4

    cmp-long v2, v4, v2

    if-nez v2, :cond_6e

    goto :goto_78

    .line 1358
    :cond_6e
    invoke-interface {p0, p1, p2, v6, v7}, Lo/Serializers;->RemoteActionCompatParcelizer(JJ)J

    move-result-wide v2

    .line 1360
    invoke-interface {p0, v2, v3}, Lo/Serializers;->write(J)J

    move-result-wide v2

    add-long/2addr v0, v2

    sub-long/2addr v0, p1

    :cond_78
    :goto_78
    return-wide v0
.end method

.method private static read(Lo/FilteredBeanPropertyWriterMultiView;)Z
    .registers 5

    .line 1371
    iget-boolean v0, p0, Lo/FilteredBeanPropertyWriterMultiView;->RemoteActionCompatParcelizer:Z

    if-eqz v0, :cond_17

    iget-wide v0, p0, Lo/FilteredBeanPropertyWriterMultiView;->MediaBrowserCompatItemReceiver:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_17

    iget-wide v0, p0, Lo/FilteredBeanPropertyWriterMultiView;->write:J

    cmp-long p0, v0, v2

    if-nez p0, :cond_17

    const/4 p0, 0x1

    return p0

    :cond_17
    const/4 p0, 0x0

    return p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()I
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public final IconCompatParcelizer()I
    .registers 1

    .line 1267
    iget-object p0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->IconCompatParcelizer:Lo/FilteredBeanPropertyWriterMultiView;

    invoke-virtual {p0}, Lo/FilteredBeanPropertyWriterMultiView;->read()I

    move-result p0

    return p0
.end method

.method public final RemoteActionCompatParcelizer(ILo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;Z)Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;
    .registers 13

    .line 1272
    invoke-virtual {p0}, Lo/PolymorphicTypeValidator;->IconCompatParcelizer()I

    move-result v0

    invoke-static {p1, v0}, Lo/buildTypeSerializer;->RemoteActionCompatParcelizer(II)I

    const/4 v0, 0x0

    if-eqz p3, :cond_14

    .line 1273
    iget-object v1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->IconCompatParcelizer:Lo/FilteredBeanPropertyWriterMultiView;

    invoke-virtual {v1, p1}, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesCompatParcelizer(I)Lo/serializeContents;

    move-result-object v1

    iget-object v1, v1, Lo/serializeContents;->read:Ljava/lang/String;

    move-object v3, v1

    goto :goto_15

    :cond_14
    move-object v3, v0

    :goto_15
    if-eqz p3, :cond_1e

    .line 1274
    iget p3, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->write:I

    add-int/2addr p3, p1

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    :cond_1e
    move-object v4, v0

    .line 1275
    iget-object p3, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->IconCompatParcelizer:Lo/FilteredBeanPropertyWriterMultiView;

    .line 1279
    invoke-virtual {p3, p1}, Lo/FilteredBeanPropertyWriterMultiView;->read(I)J

    move-result-wide v5

    iget-object p3, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->IconCompatParcelizer:Lo/FilteredBeanPropertyWriterMultiView;

    .line 1280
    invoke-virtual {p3, p1}, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesCompatParcelizer(I)Lo/serializeContents;

    move-result-object p1

    iget-wide v0, p1, Lo/serializeContents;->IconCompatParcelizer:J

    iget-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->IconCompatParcelizer:Lo/FilteredBeanPropertyWriterMultiView;

    const/4 p3, 0x0

    invoke-virtual {p1, p3}, Lo/FilteredBeanPropertyWriterMultiView;->AudioAttributesCompatParcelizer(I)Lo/serializeContents;

    move-result-object p1

    iget-wide v7, p1, Lo/serializeContents;->IconCompatParcelizer:J

    sub-long/2addr v0, v7

    invoke-static {v0, v1}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(J)J

    move-result-wide v0

    iget-wide p0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:J

    sub-long v7, v0, p0

    move-object v2, p2

    .line 1275
    invoke-virtual/range {v2 .. v8}, Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;->read(Ljava/lang/Object;Ljava/lang/Object;JJ)Lo/PolymorphicTypeValidator$AudioAttributesCompatParcelizer;

    move-result-object p0

    return-object p0
.end method

.method public final read(Ljava/lang/Object;)I
    .registers 4

    .line 1313
    instance-of v0, p1, Ljava/lang/Integer;

    const/4 v1, -0x1

    if-nez v0, :cond_6

    return v1

    .line 1316
    :cond_6
    check-cast p1, Ljava/lang/Integer;

    invoke-virtual {p1}, Ljava/lang/Number;->intValue()I

    move-result p1

    .line 1317
    iget v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->write:I

    sub-int/2addr p1, v0

    if-ltz p1, :cond_18

    .line 1318
    invoke-virtual {p0}, Lo/PolymorphicTypeValidator;->IconCompatParcelizer()I

    move-result p0

    if-ge p1, p0, :cond_18

    return p1

    :cond_18
    return v1
.end method

.method public final write(I)Ljava/lang/Object;
    .registers 3

    .line 1366
    invoke-virtual {p0}, Lo/PolymorphicTypeValidator;->IconCompatParcelizer()I

    move-result v0

    invoke-static {p1, v0}, Lo/buildTypeSerializer;->RemoteActionCompatParcelizer(II)I

    .line 1367
    iget p0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->write:I

    add-int/2addr p0, p1

    invoke-static {p0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p0

    return-object p0
.end method

.method public final write(ILo/PolymorphicTypeValidator$IconCompatParcelizer;J)Lo/PolymorphicTypeValidator$IconCompatParcelizer;
    .registers 27

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const/4 v11, 0x1

    move/from16 v2, p1

    .line 1291
    invoke-static {v2, v11}, Lo/buildTypeSerializer;->RemoteActionCompatParcelizer(II)I

    move-wide/from16 v2, p3

    .line 1293
    invoke-direct {v0, v2, v3}, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->read(J)J

    move-result-wide v14

    .line 1294
    sget-object v2, Lo/PolymorphicTypeValidator$IconCompatParcelizer;->read:Ljava/lang/Object;

    iget-object v3, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer:Lo/JsonSerializableSchema;

    iget-object v12, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->IconCompatParcelizer:Lo/FilteredBeanPropertyWriterMultiView;

    move-object v4, v12

    iget-wide v5, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->MediaBrowserCompatCustomActionResultReceiver:J

    iget-wide v7, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->MediaBrowserCompatSearchResultReceiver:J

    iget-wide v9, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->read:J

    .line 1302
    invoke-static {v12}, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->read(Lo/FilteredBeanPropertyWriterMultiView;)Z

    move-result v12

    iget-object v13, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->AudioAttributesCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    move/from16 p1, v12

    iget-wide v11, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->MediaBrowserCompatItemReceiver:J

    move-wide/from16 v16, v11

    .line 1307
    invoke-virtual/range {p0 .. p0}, Lo/PolymorphicTypeValidator;->IconCompatParcelizer()I

    move-result v12

    move-object/from16 v21, v1

    iget-wide v0, v0, Landroidx/media3/exoplayer/dash/DashMediaSource$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer:J

    move-wide/from16 v19, v0

    const/4 v11, 0x1

    const/4 v0, 0x1

    add-int/lit8 v18, v12, -0x1

    move/from16 v12, p1

    move-object/from16 v1, v21

    .line 1294
    invoke-virtual/range {v1 .. v20}, Lo/PolymorphicTypeValidator$IconCompatParcelizer;->write(Ljava/lang/Object;Lo/JsonSerializableSchema;Ljava/lang/Object;JJJZZLo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;JJIJ)Lo/PolymorphicTypeValidator$IconCompatParcelizer;

    move-result-object v0

    return-object v0
.end method

###### Class androidx.media3.exoplayer.dash.DashMediaSource.MediaBrowserCompatCustomActionResultReceiver (androidx.media3.exoplayer.dash.DashMediaSource$MediaBrowserCompatCustomActionResultReceiver)
.class final Landroidx/media3/exoplayer/dash/DashMediaSource$MediaBrowserCompatCustomActionResultReceiver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/constructGeneralizedType$IconCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/dash/DashMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "MediaBrowserCompatCustomActionResultReceiver"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/constructGeneralizedType$IconCompatParcelizer<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 1446
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(B)V
    .registers 2

    .line 1446
    invoke-direct {p0}, Landroidx/media3/exoplayer/dash/DashMediaSource$MediaBrowserCompatCustomActionResultReceiver;-><init>()V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(Ljava/io/InputStream;)Ljava/lang/Long;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1450
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    invoke-direct {v1, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p0

    .line 1451
    invoke-static {p0}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesImplApi26Parcelizer(Ljava/lang/String;)J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final bridge synthetic RemoteActionCompatParcelizer(Landroid/net/Uri;Ljava/io/InputStream;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1446
    invoke-static {p2}, Landroidx/media3/exoplayer/dash/DashMediaSource$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer(Ljava/io/InputStream;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.media3.exoplayer.dash.DashMediaSource.RemoteActionCompatParcelizer (androidx.media3.exoplayer.dash.DashMediaSource$RemoteActionCompatParcelizer)
.class final Landroidx/media3/exoplayer/dash/DashMediaSource$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/classForName;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/dash/DashMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "RemoteActionCompatParcelizer"
.end annotation


# instance fields
.field final synthetic read:Landroidx/media3/exoplayer/dash/DashMediaSource;


# direct methods
.method constructor <init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V
    .registers 2

    .line 1498
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$RemoteActionCompatParcelizer;->read:Landroidx/media3/exoplayer/dash/DashMediaSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private IconCompatParcelizer()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1513
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$RemoteActionCompatParcelizer;->read:Landroidx/media3/exoplayer/dash/DashMediaSource;

    invoke-static {v0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer(Landroidx/media3/exoplayer/dash/DashMediaSource;)Ljava/io/IOException;

    move-result-object v0

    if-nez v0, :cond_9

    return-void

    .line 1514
    :cond_9
    iget-object p0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$RemoteActionCompatParcelizer;->read:Landroidx/media3/exoplayer/dash/DashMediaSource;

    invoke-static {p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->AudioAttributesCompatParcelizer(Landroidx/media3/exoplayer/dash/DashMediaSource;)Ljava/io/IOException;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public final read()V
    .registers 2
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1502
    iget-object v0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$RemoteActionCompatParcelizer;->read:Landroidx/media3/exoplayer/dash/DashMediaSource;

    invoke-static {v0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->IconCompatParcelizer(Landroidx/media3/exoplayer/dash/DashMediaSource;)Lo/constructCollectionType;

    move-result-object v0

    invoke-virtual {v0}, Lo/constructCollectionType;->read()V

    .line 1503
    invoke-direct {p0}, Landroidx/media3/exoplayer/dash/DashMediaSource$RemoteActionCompatParcelizer;->IconCompatParcelizer()V

    return-void
.end method

###### Class androidx.media3.exoplayer.dash.DashMediaSource.read (androidx.media3.exoplayer.dash.DashMediaSource$read)
.class final Landroidx/media3/exoplayer/dash/DashMediaSource$read;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/constructGeneralizedType$IconCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/dash/DashMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "read"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lo/constructGeneralizedType$IconCompatParcelizer<",
        "Ljava/lang/Long;",
        ">;"
    }
.end annotation


# static fields
.field private static final AudioAttributesCompatParcelizer:Ljava/util/regex/Pattern;


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 1458
    const-string v0, "(.+?)(Z|((\\+|-|\u2212)(\\d\\d)(:?(\\d\\d))?))"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Landroidx/media3/exoplayer/dash/DashMediaSource$read;->AudioAttributesCompatParcelizer:Ljava/util/regex/Pattern;

    return-void
.end method

.method constructor <init>()V
    .registers 1

    .line 1455
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Ljava/io/InputStream;)Ljava/lang/Long;
    .registers 13
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1462
    new-instance v0, Ljava/io/BufferedReader;

    new-instance v1, Ljava/io/InputStreamReader;

    sget-object v2, Lo/parseMdtaFromMeta;->AudioAttributesImplApi26Parcelizer:Ljava/nio/charset/Charset;

    invoke-direct {v1, p0, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/nio/charset/Charset;)V

    invoke-direct {v0, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V

    .line 1463
    invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;

    move-result-object p0

    const/4 v0, 0x0

    .line 1465
    :try_start_11
    sget-object v1, Landroidx/media3/exoplayer/dash/DashMediaSource$read;->AudioAttributesCompatParcelizer:Ljava/util/regex/Pattern;

    invoke-virtual {v1, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v1

    .line 1466
    invoke-virtual {v1}, Ljava/util/regex/Matcher;->matches()Z

    move-result v2

    if-eqz v2, :cond_86

    const/4 p0, 0x1

    .line 1471
    invoke-virtual {v1, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    .line 1472
    new-instance v2, Ljava/text/SimpleDateFormat;

    const-string v3, "yyyy-MM-dd\'T\'HH:mm:ss"

    sget-object v4, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v2, v3, v4}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 1473
    const-string v3, "UTC"

    invoke-static {v3}, Ljava/util/TimeZone;->getTimeZone(Ljava/lang/String;)Ljava/util/TimeZone;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/text/DateFormat;->setTimeZone(Ljava/util/TimeZone;)V

    .line 1474
    invoke-virtual {v2, p0}, Ljava/text/DateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;

    move-result-object p0

    invoke-virtual {p0}, Ljava/util/Date;->getTime()J

    move-result-wide v2

    const/4 p0, 0x2

    .line 1476
    invoke-virtual {v1, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    .line 1477
    const-string v4, "Z"

    invoke-virtual {v4, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_4a

    goto :goto_81

    .line 1480
    :cond_4a
    const-string p0, "+"

    const/4 v4, 0x4

    invoke-virtual {v1, v4}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {p0, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_5a

    const-wide/16 v4, 0x1

    goto :goto_5c

    :cond_5a
    const-wide/16 v4, -0x1

    :goto_5c
    const/4 p0, 0x5

    .line 1481
    invoke-virtual {v1, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v6

    const/4 p0, 0x7

    .line 1482
    invoke-virtual {v1, p0}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    .line 1483
    invoke-static {p0}, Landroid/text/TextUtils;->isEmpty(Ljava/lang/CharSequence;)Z

    move-result v1

    if-eqz v1, :cond_73

    const-wide/16 v8, 0x0

    goto :goto_77

    :cond_73
    invoke-static {p0}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J

    move-result-wide v8

    :goto_77
    const-wide/16 v10, 0x3c

    mul-long/2addr v6, v10

    add-long/2addr v6, v8

    const-wide/32 v8, 0xea60

    mul-long/2addr v6, v8

    mul-long/2addr v4, v6

    sub-long/2addr v2, v4

    .line 1487
    :goto_81
    invoke-static {v2, v3}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    return-object p0

    .line 1467
    :cond_86
    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Couldn\'t parse timestamp: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, Lo/SchemaAware;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/lang/Throwable;)Lo/SchemaAware;

    move-result-object p0

    throw p0
    :try_end_99
    .catch Ljava/text/ParseException; {:try_start_11 .. :try_end_99} :catch_99

    :catch_99
    move-exception p0

    .line 1489
    invoke-static {v0, p0}, Lo/SchemaAware;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/lang/Throwable;)Lo/SchemaAware;

    move-result-object p0

    throw p0
.end method


# virtual methods
.method public final synthetic RemoteActionCompatParcelizer(Landroid/net/Uri;Ljava/io/InputStream;)Ljava/lang/Object;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1455
    invoke-static {p2}, Landroidx/media3/exoplayer/dash/DashMediaSource$read;->AudioAttributesCompatParcelizer(Ljava/io/InputStream;)Ljava/lang/Long;

    move-result-object p0

    return-object p0
.end method

###### Class androidx.media3.exoplayer.dash.DashMediaSource.write (androidx.media3.exoplayer.dash.DashMediaSource$write)
.class final Landroidx/media3/exoplayer/dash/DashMediaSource$write;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/AttributePropertyWriter$IconCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/dash/DashMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x10
    name = "write"
.end annotation


# instance fields
.field final synthetic write:Landroidx/media3/exoplayer/dash/DashMediaSource;


# direct methods
.method private constructor <init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V
    .registers 2

    .line 1377
    iput-object p1, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$write;->write:Landroidx/media3/exoplayer/dash/DashMediaSource;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Landroidx/media3/exoplayer/dash/DashMediaSource;B)V
    .registers 3

    .line 1377
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/dash/DashMediaSource$write;-><init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V

    return-void
.end method


# virtual methods
.method public final write()V
    .registers 1

    .line 1381
    iget-object p0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$write;->write:Landroidx/media3/exoplayer/dash/DashMediaSource;

    invoke-virtual {p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->write()V

    return-void
.end method

.method public final write(J)V
    .registers 3

    .line 1386
    iget-object p0, p0, Landroidx/media3/exoplayer/dash/DashMediaSource$write;->write:Landroidx/media3/exoplayer/dash/DashMediaSource;

    invoke-virtual {p0, p1, p2}, Landroidx/media3/exoplayer/dash/DashMediaSource;->write(J)V

    return-void
.end method

###### Class kotlin.SerializersBase (o.SerializersBase)
.class public final synthetic Lo/SerializersBase;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic read:Landroidx/media3/exoplayer/dash/DashMediaSource;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/SerializersBase;->read:Landroidx/media3/exoplayer/dash/DashMediaSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 0
    iget-object p0, p0, Lo/SerializersBase;->read:Landroidx/media3/exoplayer/dash/DashMediaSource;

    invoke-virtual {p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->IconCompatParcelizer()V

    return-void
.end method

###### Class kotlin._suppressNulls (o._suppressNulls)
.class public final synthetic Lo/_suppressNulls;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic read:Landroidx/media3/exoplayer/dash/DashMediaSource;


# direct methods
.method public synthetic constructor <init>(Landroidx/media3/exoplayer/dash/DashMediaSource;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/_suppressNulls;->read:Landroidx/media3/exoplayer/dash/DashMediaSource;

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 1

    .line 0
    iget-object p0, p0, Lo/_suppressNulls;->read:Landroidx/media3/exoplayer/dash/DashMediaSource;

    invoke-static {p0}, Landroidx/media3/exoplayer/dash/DashMediaSource;->write(Landroidx/media3/exoplayer/dash/DashMediaSource;)V

    return-void
.end method
