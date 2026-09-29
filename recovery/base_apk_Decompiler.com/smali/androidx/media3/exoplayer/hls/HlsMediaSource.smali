###### Class androidx.media3.exoplayer.hls.HlsMediaSource (androidx.media3.exoplayer.hls.HlsMediaSource)
.class public final Landroidx/media3/exoplayer/hls/HlsMediaSource;
.super Lo/NumberSerializers1;
.source "SourceFile"

# interfaces
.implements Lo/_serializeAsIndex$write;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
    }
.end annotation


# static fields
.field public static final METADATA_TYPE_EMSG:I = 0x3

.field public static final METADATA_TYPE_ID3:I = 0x1


# instance fields
.field private final allowChunklessPreparation:Z

.field private final cmcdConfiguration:Lo/_fromClass;

.field private final compositeSequenceableLoaderFactory:Lo/_useStatic;

.field private final dataSourceFactory:Lo/_getReferenced;

.field private final drmSessionManager:Lo/matchesUntyped;

.field private final elapsedRealTimeOffsetMs:J

.field private final extractorFactory:Lo/_getReferencedIfPresent;

.field private liveConfiguration:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

.field private final loadErrorHandlingPolicy:Lo/_resolveSuperClass;

.field private mediaItem:Lo/JsonSerializableSchema;

.field private mediaTransferListener:Lo/TypeNameIdResolver;

.field private final metadataType:I

.field private final playlistTracker:Lo/_serializeAsIndex;

.field private final timestampAdjusterInitializationTimeoutMs:J

.field private final useSessionKeys:Z


# direct methods
.method static constructor <clinit>()V
    .registers 1

    .line 75
    const-string v0, "media3.exoplayer.hls"

    invoke-static {v0}, Lo/isSafeSubType;->AudioAttributesCompatParcelizer(Ljava/lang/String;)V

    return-void
.end method

.method private constructor <init>(Lo/JsonSerializableSchema;Lo/_getReferenced;Lo/_getReferencedIfPresent;Lo/_useStatic;Lo/_fromClass;Lo/matchesUntyped;Lo/_resolveSuperClass;Lo/_serializeAsIndex;JZIZJ)V
    .registers 16

    .line 454
    invoke-direct {p0}, Lo/NumberSerializers1;-><init>()V

    .line 455
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->mediaItem:Lo/JsonSerializableSchema;

    .line 456
    iget-object p1, p1, Lo/JsonSerializableSchema;->RemoteActionCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->liveConfiguration:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    .line 457
    iput-object p2, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->dataSourceFactory:Lo/_getReferenced;

    .line 458
    iput-object p3, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->extractorFactory:Lo/_getReferencedIfPresent;

    .line 459
    iput-object p4, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->compositeSequenceableLoaderFactory:Lo/_useStatic;

    .line 460
    iput-object p5, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->cmcdConfiguration:Lo/_fromClass;

    .line 461
    iput-object p6, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->drmSessionManager:Lo/matchesUntyped;

    .line 462
    iput-object p7, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->loadErrorHandlingPolicy:Lo/_resolveSuperClass;

    .line 463
    iput-object p8, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->playlistTracker:Lo/_serializeAsIndex;

    .line 464
    iput-wide p9, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->elapsedRealTimeOffsetMs:J

    .line 465
    iput-boolean p11, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->allowChunklessPreparation:Z

    .line 466
    iput p12, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->metadataType:I

    .line 467
    iput-boolean p13, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->useSessionKeys:Z

    .line 468
    iput-wide p14, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->timestampAdjusterInitializationTimeoutMs:J

    return-void
.end method

.method synthetic constructor <init>(Lo/JsonSerializableSchema;Lo/_getReferenced;Lo/_getReferencedIfPresent;Lo/_useStatic;Lo/_fromClass;Lo/matchesUntyped;Lo/_resolveSuperClass;Lo/_serializeAsIndex;JZIZJLandroidx/media3/exoplayer/hls/HlsMediaSource$3;)V
    .registers 17

    .line 71
    invoke-direct/range {p0 .. p15}, Landroidx/media3/exoplayer/hls/HlsMediaSource;-><init>(Lo/JsonSerializableSchema;Lo/_getReferenced;Lo/_getReferencedIfPresent;Lo/_useStatic;Lo/_fromClass;Lo/matchesUntyped;Lo/_resolveSuperClass;Lo/_serializeAsIndex;JZIZJ)V

    return-void
.end method

.method private createTimelineForLive(Lo/_acceptJsonFormatVisitor;JJLo/BeanSerializerBase;)Lo/TokenBufferSerializer;
    .registers 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    .line 575
    iget-wide v2, v1, Lo/_acceptJsonFormatVisitor;->onCommand:J

    iget-object v4, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->playlistTracker:Lo/_serializeAsIndex;

    .line 576
    invoke-interface {v4}, Lo/_serializeAsIndex;->write()J

    move-result-wide v4

    sub-long v15, v2, v4

    .line 578
    iget-boolean v2, v1, Lo/_acceptJsonFormatVisitor;->RemoteActionCompatParcelizer:Z

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v2, :cond_1c

    iget-wide v5, v1, Lo/_acceptJsonFormatVisitor;->AudioAttributesCompatParcelizer:J

    add-long/2addr v5, v15

    move-wide v11, v5

    goto :goto_1d

    :cond_1c
    move-wide v11, v3

    .line 579
    :goto_1d
    invoke-direct/range {p0 .. p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->getLiveEdgeOffsetUs(Lo/_acceptJsonFormatVisitor;)J

    move-result-wide v13

    .line 581
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->liveConfiguration:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    iget-wide v5, v2, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;->AudioAttributesCompatParcelizer:J

    cmp-long v2, v5, v3

    if-eqz v2, :cond_32

    .line 583
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->liveConfiguration:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    iget-wide v2, v2, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;->AudioAttributesCompatParcelizer:J

    invoke-static {v2, v3}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(J)J

    move-result-wide v2

    goto :goto_36

    .line 586
    :cond_32
    invoke-static {v1, v13, v14}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->getTargetLiveOffsetUs(Lo/_acceptJsonFormatVisitor;J)J

    move-result-wide v2

    :goto_36
    move-wide v5, v2

    .line 589
    iget-wide v2, v1, Lo/_acceptJsonFormatVisitor;->AudioAttributesCompatParcelizer:J

    add-long v9, v2, v13

    move-wide v7, v13

    .line 590
    invoke-static/range {v5 .. v10}, Lo/LaissezFaireSubTypeValidator;->read(JJJ)J

    move-result-wide v2

    .line 592
    invoke-direct {v0, v1, v2, v3}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->updateLiveConfiguration(Lo/_acceptJsonFormatVisitor;J)V

    .line 594
    invoke-direct {v0, v1, v13, v14}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->getLiveWindowDefaultStartPositionUs(Lo/_acceptJsonFormatVisitor;J)J

    move-result-wide v17

    .line 595
    iget v2, v1, Lo/_acceptJsonFormatVisitor;->MediaBrowserCompatItemReceiver:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-ne v2, v3, :cond_54

    iget-boolean v2, v1, Lo/_acceptJsonFormatVisitor;->read:Z

    if-eqz v2, :cond_54

    move/from16 v21, v4

    goto :goto_57

    :cond_54
    const/4 v2, 0x0

    move/from16 v21, v2

    .line 598
    :goto_57
    iget-wide v13, v1, Lo/_acceptJsonFormatVisitor;->AudioAttributesCompatParcelizer:J

    iget-boolean v1, v1, Lo/_acceptJsonFormatVisitor;->RemoteActionCompatParcelizer:Z

    .line 610
    new-instance v2, Lo/TokenBufferSerializer;

    move-object v6, v2

    const/16 v19, 0x1

    xor-int/lit8 v20, v1, 0x1

    invoke-virtual/range {p0 .. p0}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->getMediaItem()Lo/JsonSerializableSchema;

    move-result-object v23

    iget-object v0, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->liveConfiguration:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    move-object/from16 v24, v0

    move-wide/from16 v7, p2

    move-wide/from16 v9, p4

    move-object/from16 v22, p6

    invoke-direct/range {v6 .. v24}, Lo/TokenBufferSerializer;-><init>(JJJJJJZZZLjava/lang/Object;Lo/JsonSerializableSchema;Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;)V

    return-object v2
.end method

.method private createTimelineForOnDemand(Lo/_acceptJsonFormatVisitor;JJLo/BeanSerializerBase;)Lo/TokenBufferSerializer;
    .registers 29

    move-object/from16 v0, p1

    .line 620
    iget-wide v1, v0, Lo/_acceptJsonFormatVisitor;->MediaMetadataCompat:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    if-eqz v1, :cond_2f

    iget-object v1, v0, Lo/_acceptJsonFormatVisitor;->MediaDescriptionCompat:Ljava/util/List;

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_2f

    .line 623
    iget-boolean v1, v0, Lo/_acceptJsonFormatVisitor;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-nez v1, :cond_2c

    iget-wide v1, v0, Lo/_acceptJsonFormatVisitor;->MediaMetadataCompat:J

    iget-wide v3, v0, Lo/_acceptJsonFormatVisitor;->AudioAttributesCompatParcelizer:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_2c

    .line 626
    iget-object v1, v0, Lo/_acceptJsonFormatVisitor;->MediaDescriptionCompat:Ljava/util/List;

    iget-wide v2, v0, Lo/_acceptJsonFormatVisitor;->MediaMetadataCompat:J

    .line 627
    invoke-static {v1, v2, v3}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->findClosestPrecedingSegment(Ljava/util/List;J)Lo/_acceptJsonFormatVisitor$write;

    move-result-object v1

    iget-wide v1, v1, Lo/_acceptJsonFormatVisitor$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:J

    goto :goto_31

    .line 624
    :cond_2c
    iget-wide v1, v0, Lo/_acceptJsonFormatVisitor;->MediaMetadataCompat:J

    goto :goto_31

    :cond_2f
    const-wide/16 v1, 0x0

    :goto_31
    move-wide v14, v1

    .line 631
    iget-wide v8, v0, Lo/_acceptJsonFormatVisitor;->AudioAttributesCompatParcelizer:J

    iget-wide v10, v0, Lo/_acceptJsonFormatVisitor;->AudioAttributesCompatParcelizer:J

    .line 643
    new-instance v0, Lo/TokenBufferSerializer;

    move-object v3, v0

    const-wide/16 v12, 0x0

    const/16 v16, 0x1

    const/16 v17, 0x0

    const/16 v18, 0x1

    invoke-virtual/range {p0 .. p0}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->getMediaItem()Lo/JsonSerializableSchema;

    move-result-object v20

    const/16 v21, 0x0

    move-wide/from16 v4, p2

    move-wide/from16 v6, p4

    move-object/from16 v19, p6

    invoke-direct/range {v3 .. v21}, Lo/TokenBufferSerializer;-><init>(JJJJJJZZZLjava/lang/Object;Lo/JsonSerializableSchema;Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;)V

    return-object v0
.end method

.method private static findClosestPrecedingIndependentPart(Ljava/util/List;J)Lo/_acceptJsonFormatVisitor$read;
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lo/_acceptJsonFormatVisitor$read;",
            ">;J)",
            "Lo/_acceptJsonFormatVisitor$read;"
        }
    .end annotation

    const/4 v0, 0x0

    const/4 v1, 0x0

    .line 735
    :goto_2
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_23

    .line 736
    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lo/_acceptJsonFormatVisitor$read;

    .line 737
    iget-wide v3, v2, Lo/_acceptJsonFormatVisitor$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:J

    cmp-long v3, v3, p1

    if-gtz v3, :cond_1a

    iget-boolean v3, v2, Lo/_acceptJsonFormatVisitor$read;->RemoteActionCompatParcelizer:Z

    if-eqz v3, :cond_1a

    move-object v0, v2

    goto :goto_20

    .line 739
    :cond_1a
    iget-wide v2, v2, Lo/_acceptJsonFormatVisitor$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:J

    cmp-long v2, v2, p1

    if-gtz v2, :cond_23

    :goto_20
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_23
    return-object v0
.end method

.method private static findClosestPrecedingSegment(Ljava/util/List;J)Lo/_acceptJsonFormatVisitor$write;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lo/_acceptJsonFormatVisitor$write;",
            ">;J)",
            "Lo/_acceptJsonFormatVisitor$write;"
        }
    .end annotation

    .line 753
    invoke-static {p1, p2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p0, p1, p2}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer(Ljava/util/List;Ljava/lang/Comparable;Z)I

    move-result p1

    .line 755
    invoke-interface {p0, p1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/_acceptJsonFormatVisitor$write;

    return-object p0
.end method

.method private getLiveEdgeOffsetUs(Lo/_acceptJsonFormatVisitor;)J
    .registers 4

    .line 648
    iget-boolean v0, p1, Lo/_acceptJsonFormatVisitor;->AudioAttributesImplApi26Parcelizer:Z

    if-eqz v0, :cond_14

    .line 649
    iget-wide v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->elapsedRealTimeOffsetMs:J

    invoke-static {v0, v1}, Lo/LaissezFaireSubTypeValidator;->RemoteActionCompatParcelizer(J)J

    move-result-wide v0

    invoke-static {v0, v1}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(J)J

    move-result-wide v0

    invoke-virtual {p1}, Lo/_acceptJsonFormatVisitor;->IconCompatParcelizer()J

    move-result-wide p0

    sub-long/2addr v0, p0

    return-wide v0

    :cond_14
    const-wide/16 p0, 0x0

    return-wide p0
.end method

.method private getLiveWindowDefaultStartPositionUs(Lo/_acceptJsonFormatVisitor;J)J
    .registers 8

    .line 656
    iget-wide v0, p1, Lo/_acceptJsonFormatVisitor;->MediaMetadataCompat:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-eqz v0, :cond_e

    .line 657
    iget-wide p2, p1, Lo/_acceptJsonFormatVisitor;->MediaMetadataCompat:J

    goto :goto_1b

    .line 660
    :cond_e
    iget-wide v0, p1, Lo/_acceptJsonFormatVisitor;->AudioAttributesCompatParcelizer:J

    add-long/2addr v0, p2

    iget-object p0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->liveConfiguration:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    iget-wide p2, p0, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;->AudioAttributesCompatParcelizer:J

    invoke-static {p2, p3}, Lo/LaissezFaireSubTypeValidator;->IconCompatParcelizer(J)J

    move-result-wide p2

    sub-long p2, v0, p2

    .line 661
    :goto_1b
    iget-boolean p0, p1, Lo/_acceptJsonFormatVisitor;->MediaBrowserCompatCustomActionResultReceiver:Z

    if-eqz p0, :cond_20

    return-wide p2

    .line 665
    :cond_20
    iget-object p0, p1, Lo/_acceptJsonFormatVisitor;->onAddQueueItem:Ljava/util/List;

    .line 666
    invoke-static {p0, p2, p3}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->findClosestPrecedingIndependentPart(Ljava/util/List;J)Lo/_acceptJsonFormatVisitor$read;

    move-result-object p0

    if-eqz p0, :cond_2b

    .line 668
    iget-wide p0, p0, Lo/_acceptJsonFormatVisitor$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:J

    return-wide p0

    .line 670
    :cond_2b
    iget-object p0, p1, Lo/_acceptJsonFormatVisitor;->MediaDescriptionCompat:Ljava/util/List;

    invoke-interface {p0}, Ljava/util/List;->isEmpty()Z

    move-result p0

    if-eqz p0, :cond_36

    const-wide/16 p0, 0x0

    return-wide p0

    .line 673
    :cond_36
    iget-object p0, p1, Lo/_acceptJsonFormatVisitor;->MediaDescriptionCompat:Ljava/util/List;

    .line 674
    invoke-static {p0, p2, p3}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->findClosestPrecedingSegment(Ljava/util/List;J)Lo/_acceptJsonFormatVisitor$write;

    move-result-object p0

    .line 675
    iget-object p1, p0, Lo/_acceptJsonFormatVisitor$write;->RemoteActionCompatParcelizer:Ljava/util/List;

    invoke-static {p1, p2, p3}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->findClosestPrecedingIndependentPart(Ljava/util/List;J)Lo/_acceptJsonFormatVisitor$read;

    move-result-object p1

    if-eqz p1, :cond_47

    .line 677
    iget-wide p0, p1, Lo/_acceptJsonFormatVisitor$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:J

    return-wide p0

    .line 679
    :cond_47
    iget-wide p0, p0, Lo/_acceptJsonFormatVisitor$RemoteActionCompatParcelizer;->MediaBrowserCompatMediaItem:J

    return-wide p0
.end method

.method private static getTargetLiveOffsetUs(Lo/_acceptJsonFormatVisitor;J)J
    .registers 8

    .line 714
    iget-object v0, p0, Lo/_acceptJsonFormatVisitor;->RatingCompat:Lo/_acceptJsonFormatVisitor$AudioAttributesCompatParcelizer;

    .line 716
    iget-wide v1, p0, Lo/_acceptJsonFormatVisitor;->MediaMetadataCompat:J

    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v1, v1, v3

    if-eqz v1, :cond_13

    .line 717
    iget-wide v0, p0, Lo/_acceptJsonFormatVisitor;->AudioAttributesCompatParcelizer:J

    iget-wide v2, p0, Lo/_acceptJsonFormatVisitor;->MediaMetadataCompat:J

    sub-long/2addr v0, v2

    goto :goto_30

    .line 718
    :cond_13
    iget-wide v1, v0, Lo/_acceptJsonFormatVisitor$AudioAttributesCompatParcelizer;->read:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_22

    iget-wide v1, p0, Lo/_acceptJsonFormatVisitor;->AudioAttributesImplApi21Parcelizer:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_22

    .line 721
    iget-wide v0, v0, Lo/_acceptJsonFormatVisitor$AudioAttributesCompatParcelizer;->read:J

    goto :goto_30

    .line 722
    :cond_22
    iget-wide v1, v0, Lo/_acceptJsonFormatVisitor$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:J

    cmp-long v1, v1, v3

    if-eqz v1, :cond_2b

    .line 723
    iget-wide v0, v0, Lo/_acceptJsonFormatVisitor$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:J

    goto :goto_30

    :cond_2b
    const-wide/16 v0, 0x3

    .line 726
    iget-wide v2, p0, Lo/_acceptJsonFormatVisitor;->onCustomAction:J

    mul-long/2addr v0, v2

    :goto_30
    add-long/2addr v0, p1

    return-wide v0
.end method

.method private updateLiveConfiguration(Lo/_acceptJsonFormatVisitor;J)V
    .registers 8

    .line 683
    invoke-virtual {p0}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->getMediaItem()Lo/JsonSerializableSchema;

    move-result-object v0

    iget-object v0, v0, Lo/JsonSerializableSchema;->RemoteActionCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    .line 684
    iget v1, v0, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;->write:F

    const v2, -0x800001

    cmpl-float v1, v1, v2

    if-nez v1, :cond_2c

    iget v0, v0, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer:F

    cmpl-float v0, v0, v2

    if-nez v0, :cond_2c

    iget-object v0, p1, Lo/_acceptJsonFormatVisitor;->RatingCompat:Lo/_acceptJsonFormatVisitor$AudioAttributesCompatParcelizer;

    iget-wide v0, v0, Lo/_acceptJsonFormatVisitor$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer:J

    const-wide v2, -0x7fffffffffffffffL    # -4.9E-324

    cmp-long v0, v0, v2

    if-nez v0, :cond_2c

    iget-object p1, p1, Lo/_acceptJsonFormatVisitor;->RatingCompat:Lo/_acceptJsonFormatVisitor$AudioAttributesCompatParcelizer;

    iget-wide v0, p1, Lo/_acceptJsonFormatVisitor$AudioAttributesCompatParcelizer;->read:J

    cmp-long p1, v0, v2

    if-nez p1, :cond_2c

    const/4 p1, 0x1

    goto :goto_2d

    :cond_2c
    const/4 p1, 0x0

    .line 689
    :goto_2d
    new-instance v0, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;

    invoke-direct {v0}, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;-><init>()V

    .line 691
    invoke-static {p2, p3}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer(J)J

    move-result-wide p2

    invoke-virtual {v0, p2, p3}, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;->RemoteActionCompatParcelizer(J)Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;

    move-result-object p2

    const/high16 p3, 0x3f800000    # 1.0f

    if-eqz p1, :cond_40

    move v0, p3

    goto :goto_44

    .line 692
    :cond_40
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->liveConfiguration:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    iget v0, v0, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;->write:F

    :goto_44
    invoke-virtual {p2, v0}, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;->RemoteActionCompatParcelizer(F)Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;

    move-result-object p2

    if-eqz p1, :cond_4b

    goto :goto_4f

    .line 693
    :cond_4b
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->liveConfiguration:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    iget p3, p1, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;->RemoteActionCompatParcelizer:F

    :goto_4f
    invoke-virtual {p2, p3}, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;->AudioAttributesCompatParcelizer(F)Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;

    move-result-object p1

    .line 694
    invoke-virtual {p1}, Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer$read;->write()Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    move-result-object p1

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->liveConfiguration:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    return-void
.end method


# virtual methods
.method public final canUpdateMediaItem(Lo/JsonSerializableSchema;)Z
    .registers 6

    .line 478
    invoke-virtual {p0}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->getMediaItem()Lo/JsonSerializableSchema;

    move-result-object p0

    .line 479
    iget-object v0, p0, Lo/JsonSerializableSchema;->AudioAttributesCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;

    .line 480
    invoke-static {v0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;

    .line 481
    iget-object v1, p1, Lo/JsonSerializableSchema;->AudioAttributesCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;

    if-eqz v1, :cond_3a

    .line 482
    iget-object v2, v1, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;->MediaBrowserCompatItemReceiver:Landroid/net/Uri;

    iget-object v3, v0, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;->MediaBrowserCompatItemReceiver:Landroid/net/Uri;

    .line 483
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3a

    iget-object v2, v1, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;->AudioAttributesImplApi21Parcelizer:Ljava/util/List;

    iget-object v3, v0, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;->AudioAttributesImplApi21Parcelizer:Ljava/util/List;

    .line 484
    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3a

    iget-object v1, v1, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;->read:Lo/JsonSerializableSchema$write;

    iget-object v0, v0, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;->read:Lo/JsonSerializableSchema$write;

    .line 485
    invoke-static {v1, v0}, Lo/LaissezFaireSubTypeValidator;->read(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_3a

    iget-object p0, p0, Lo/JsonSerializableSchema;->RemoteActionCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    iget-object p1, p1, Lo/JsonSerializableSchema;->RemoteActionCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi26Parcelizer;

    .line 486
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

    move-object/from16 v11, p2

    .line 515
    invoke-virtual/range {p0 .. p1}, Lo/NumberSerializers1;->createEventDispatcher(Lo/StdKeySerializers$write;)Lo/StdKeySerializer$read;

    move-result-object v10

    .line 516
    invoke-virtual/range {p0 .. p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->createDrmEventDispatcher(Lo/StdKeySerializers$write;)Lo/PropertySerializerMapEmpty$read;

    move-result-object v8

    .line 517
    iget-object v2, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->extractorFactory:Lo/_getReferencedIfPresent;

    iget-object v3, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->playlistTracker:Lo/_serializeAsIndex;

    iget-object v4, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->dataSourceFactory:Lo/_getReferenced;

    iget-object v5, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->mediaTransferListener:Lo/TypeNameIdResolver;

    iget-object v6, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->cmcdConfiguration:Lo/_fromClass;

    iget-object v7, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->drmSessionManager:Lo/matchesUntyped;

    iget-object v9, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->loadErrorHandlingPolicy:Lo/_resolveSuperClass;

    iget-object v12, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->compositeSequenceableLoaderFactory:Lo/_useStatic;

    iget-boolean v13, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->allowChunklessPreparation:Z

    iget v14, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->metadataType:I

    iget-boolean v15, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->useSessionKeys:Z

    .line 532
    new-instance v19, Lo/_serializeWithObjectId;

    move-object/from16 v1, v19

    invoke-virtual/range {p0 .. p0}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->getPlayerId()Lo/modifyArraySerializer;

    move-result-object v16

    move-object/from16 p1, v1

    iget-wide v0, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->timestampAdjusterInitializationTimeoutMs:J

    move-wide/from16 v17, v0

    move-object/from16 v1, p1

    invoke-direct/range {v1 .. v18}, Lo/_serializeWithObjectId;-><init>(Lo/_getReferencedIfPresent;Lo/_serializeAsIndex;Lo/_getReferenced;Lo/TypeNameIdResolver;Lo/_fromClass;Lo/matchesUntyped;Lo/PropertySerializerMapEmpty$read;Lo/_resolveSuperClass;Lo/StdKeySerializer$read;Lo/_findWellKnownSimple;Lo/_useStatic;ZIZLo/modifyArraySerializer;J)V

    return-object v19
.end method

.method public final getMediaItem()Lo/JsonSerializableSchema;
    .registers 2

    monitor-enter p0

    .line 473
    :try_start_1
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->mediaItem:Lo/JsonSerializableSchema;
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

    .line 510
    iget-object p0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->playlistTracker:Lo/_serializeAsIndex;

    invoke-interface {p0}, Lo/_serializeAsIndex;->read()V

    return-void
.end method

.method public final onPrimaryPlaylistRefreshed(Lo/_acceptJsonFormatVisitor;)V
    .registers 14

    .line 550
    iget-boolean v0, p1, Lo/_acceptJsonFormatVisitor;->AudioAttributesImplApi26Parcelizer:Z

    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    if-eqz v0, :cond_11

    iget-wide v3, p1, Lo/_acceptJsonFormatVisitor;->onCommand:J

    invoke-static {v3, v4}, Lo/LaissezFaireSubTypeValidator;->AudioAttributesCompatParcelizer(J)J

    move-result-wide v3

    move-wide v9, v3

    goto :goto_12

    :cond_11
    move-wide v9, v1

    .line 555
    :goto_12
    iget v0, p1, Lo/_acceptJsonFormatVisitor;->MediaBrowserCompatItemReceiver:I

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1e

    iget v0, p1, Lo/_acceptJsonFormatVisitor;->MediaBrowserCompatItemReceiver:I

    const/4 v3, 0x1

    if-eq v0, v3, :cond_1e

    move-wide v7, v1

    goto :goto_1f

    :cond_1e
    move-wide v7, v9

    .line 559
    :goto_1f
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->playlistTracker:Lo/_serializeAsIndex;

    .line 560
    new-instance v11, Lo/BeanSerializerBase;

    invoke-interface {v0}, Lo/_serializeAsIndex;->AudioAttributesCompatParcelizer()Lo/EnumSerializer;

    move-result-object v0

    invoke-static {v0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lo/EnumSerializer;

    invoke-direct {v11, v0, p1}, Lo/BeanSerializerBase;-><init>(Lo/EnumSerializer;Lo/_acceptJsonFormatVisitor;)V

    .line 562
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->playlistTracker:Lo/_serializeAsIndex;

    invoke-interface {v0}, Lo/_serializeAsIndex;->IconCompatParcelizer()Z

    move-result v0

    if-eqz v0, :cond_3f

    move-object v5, p0

    move-object v6, p1

    .line 563
    invoke-direct/range {v5 .. v11}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->createTimelineForLive(Lo/_acceptJsonFormatVisitor;JJLo/BeanSerializerBase;)Lo/TokenBufferSerializer;

    move-result-object p1

    goto :goto_45

    :cond_3f
    move-object v5, p0

    move-object v6, p1

    .line 565
    invoke-direct/range {v5 .. v11}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->createTimelineForOnDemand(Lo/_acceptJsonFormatVisitor;JJLo/BeanSerializerBase;)Lo/TokenBufferSerializer;

    move-result-object p1

    .line 567
    :goto_45
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->refreshSourceInfo(Lo/PolymorphicTypeValidator;)V

    return-void
.end method

.method public final prepareSourceInternal(Lo/TypeNameIdResolver;)V
    .registers 4

    .line 496
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->mediaTransferListener:Lo/TypeNameIdResolver;

    .line 497
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->drmSessionManager:Lo/matchesUntyped;

    .line 498
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    move-result-object v0

    invoke-static {v0}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/os/Looper;

    invoke-virtual {p0}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->getPlayerId()Lo/modifyArraySerializer;

    move-result-object v1

    .line 497
    invoke-interface {p1, v0, v1}, Lo/matchesUntyped;->write(Landroid/os/Looper;Lo/modifyArraySerializer;)V

    .line 499
    iget-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->drmSessionManager:Lo/matchesUntyped;

    invoke-interface {p1}, Lo/matchesUntyped;->IconCompatParcelizer()V

    const/4 p1, 0x0

    .line 501
    invoke-virtual {p0, p1}, Lo/NumberSerializers1;->createEventDispatcher(Lo/StdKeySerializers$write;)Lo/StdKeySerializer$read;

    move-result-object p1

    .line 502
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->playlistTracker:Lo/_serializeAsIndex;

    .line 503
    invoke-virtual {p0}, Landroidx/media3/exoplayer/hls/HlsMediaSource;->getMediaItem()Lo/JsonSerializableSchema;

    move-result-object v1

    iget-object v1, v1, Lo/JsonSerializableSchema;->AudioAttributesCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;

    invoke-static {v1}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;

    iget-object v1, v1, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;->MediaBrowserCompatItemReceiver:Landroid/net/Uri;

    .line 502
    invoke-interface {v0, v1, p1, p0}, Lo/_serializeAsIndex;->read(Landroid/net/Uri;Lo/StdKeySerializer$read;Lo/_serializeAsIndex$write;)V

    return-void
.end method

.method public final releasePeriod(Lo/StdJdkSerializersAtomicIntegerSerializer;)V
    .registers 2

    .line 538
    check-cast p1, Lo/_serializeWithObjectId;

    invoke-virtual {p1}, Lo/_serializeWithObjectId;->MediaBrowserCompatCustomActionResultReceiver()V

    return-void
.end method

.method public final releaseSourceInternal()V
    .registers 2

    .line 543
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->playlistTracker:Lo/_serializeAsIndex;

    invoke-interface {v0}, Lo/_serializeAsIndex;->RemoteActionCompatParcelizer()V

    .line 544
    iget-object p0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->drmSessionManager:Lo/matchesUntyped;

    invoke-interface {p0}, Lo/matchesUntyped;->write()V

    return-void
.end method

.method public final updateMediaItem(Lo/JsonSerializableSchema;)V
    .registers 2

    monitor-enter p0

    .line 491
    :try_start_1
    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource;->mediaItem:Lo/JsonSerializableSchema;
    :try_end_3
    .catchall {:try_start_1 .. :try_end_3} :catchall_5

    .line 492
    monitor-exit p0

    return-void

    :catchall_5
    move-exception p1

    monitor-exit p0

    throw p1
.end method

###### Class androidx.media3.exoplayer.hls.HlsMediaSource.AnonymousClass3 (androidx.media3.exoplayer.hls.HlsMediaSource$3)
.class synthetic Landroidx/media3/exoplayer/hls/HlsMediaSource$3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/hls/HlsMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1008
    name = null
.end annotation

###### Class androidx.media3.exoplayer.hls.HlsMediaSource.Factory (androidx.media3.exoplayer.hls.HlsMediaSource$Factory)
.class public final Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/StdKeySerializersDefault;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/media3/exoplayer/hls/HlsMediaSource;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Factory"
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Z

.field private AudioAttributesImplApi21Parcelizer:Lo/_resolveSuperClass;

.field private AudioAttributesImplApi26Parcelizer:I

.field private AudioAttributesImplBaseParcelizer:J

.field private IconCompatParcelizer:Lo/_fromClass$IconCompatParcelizer;

.field private final MediaBrowserCompatCustomActionResultReceiver:Lo/_getReferenced;

.field private MediaBrowserCompatItemReceiver:Lo/_getReferencedIfPresent;

.field private MediaBrowserCompatMediaItem:Lo/_isShapeWrittenUsingIndex;

.field private MediaBrowserCompatSearchResultReceiver:Z

.field private MediaDescriptionCompat:J

.field private MediaMetadataCompat:Lo/_serializeAsIndex$AudioAttributesCompatParcelizer;

.field private RemoteActionCompatParcelizer:Lo/SimpleBeanPropertyFilter;

.field private read:Lo/_useStatic;


# direct methods
.method private constructor <init>(Lo/_getReferenced;)V
    .registers 4

    .line 161
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 162
    invoke-static {p1}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/_getReferenced;

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->MediaBrowserCompatCustomActionResultReceiver:Lo/_getReferenced;

    .line 163
    new-instance p1, Lo/PropertySerializerMapMulti;

    invoke-direct {p1}, Lo/PropertySerializerMapMulti;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->RemoteActionCompatParcelizer:Lo/SimpleBeanPropertyFilter;

    .line 164
    new-instance p1, Lo/DateSerializer;

    invoke-direct {p1}, Lo/DateSerializer;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->MediaBrowserCompatMediaItem:Lo/_isShapeWrittenUsingIndex;

    .line 165
    sget-object p1, Lo/DateTimeSerializerBase;->AudioAttributesCompatParcelizer:Lo/_serializeAsIndex$AudioAttributesCompatParcelizer;

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->MediaMetadataCompat:Lo/_serializeAsIndex$AudioAttributesCompatParcelizer;

    .line 166
    sget-object p1, Lo/_getReferencedIfPresent;->write:Lo/_getReferencedIfPresent;

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->MediaBrowserCompatItemReceiver:Lo/_getReferencedIfPresent;

    .line 167
    new-instance p1, Lo/_unknownType;

    invoke-direct {p1}, Lo/_unknownType;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->AudioAttributesImplApi21Parcelizer:Lo/_resolveSuperClass;

    .line 168
    new-instance p1, Lo/SerializableSerializer;

    invoke-direct {p1}, Lo/SerializableSerializer;-><init>()V

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->read:Lo/_useStatic;

    const/4 p1, 0x1

    .line 169
    iput p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->AudioAttributesImplApi26Parcelizer:I

    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 170
    iput-wide v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->AudioAttributesImplBaseParcelizer:J

    .line 171
    iput-boolean p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->AudioAttributesCompatParcelizer:Z

    .line 172
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->IconCompatParcelizer(Z)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

    return-void
.end method

.method public constructor <init>(Lo/_hasTypeResolver$write;)V
    .registers 3

    .line 141
    new-instance v0, Lo/AtomicReferenceSerializer;

    invoke-direct {v0, p1}, Lo/AtomicReferenceSerializer;-><init>(Lo/_hasTypeResolver$write;)V

    invoke-direct {p0, v0}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;-><init>(Lo/_getReferenced;)V

    return-void
.end method

.method private IconCompatParcelizer(Lo/_fromClass$IconCompatParcelizer;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
    .registers 2

    .line 330
    invoke-static {p1}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/_fromClass$IconCompatParcelizer;

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->IconCompatParcelizer:Lo/_fromClass$IconCompatParcelizer;

    return-object p0
.end method

.method private IconCompatParcelizer(Lo/_resolveSuperClass;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
    .registers 3

    .line 194
    const-string v0, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior."

    invoke-static {p1, v0}, Lo/buildTypeSerializer;->write(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/_resolveSuperClass;

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->AudioAttributesImplApi21Parcelizer:Lo/_resolveSuperClass;

    return-object p0
.end method

.method private IconCompatParcelizer(Z)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
    .registers 3
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 214
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->MediaBrowserCompatItemReceiver:Lo/_getReferencedIfPresent;

    invoke-interface {v0, p1}, Lo/_getReferencedIfPresent;->write(Z)Lo/_getReferencedIfPresent;

    return-object p0
.end method

.method private RemoteActionCompatParcelizer(Lo/SimpleBeanPropertyFilter;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
    .registers 3

    .line 339
    const-string v0, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior."

    invoke-static {p1, v0}, Lo/buildTypeSerializer;->write(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/SimpleBeanPropertyFilter;

    iput-object p1, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->RemoteActionCompatParcelizer:Lo/SimpleBeanPropertyFilter;

    return-object p0
.end method

.method private RemoteActionCompatParcelizer(Lo/withTimeZone$IconCompatParcelizer;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;
    .registers 3

    .line 205
    iget-object v0, p0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->MediaBrowserCompatItemReceiver:Lo/_getReferencedIfPresent;

    invoke-static {p1}, Lo/buildTypeSerializer;->IconCompatParcelizer(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lo/withTimeZone$IconCompatParcelizer;

    invoke-interface {v0, p1}, Lo/_getReferencedIfPresent;->IconCompatParcelizer(Lo/withTimeZone$IconCompatParcelizer;)Lo/_getReferencedIfPresent;

    return-object p0
.end method


# virtual methods
.method public final synthetic IconCompatParcelizer(Lo/withTimeZone$IconCompatParcelizer;)Lo/StdKeySerializers$AudioAttributesCompatParcelizer;
    .registers 2

    .line 103
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->RemoteActionCompatParcelizer(Lo/withTimeZone$IconCompatParcelizer;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

    move-result-object p0

    return-object p0
.end method

.method public final read(Lo/JsonSerializableSchema;)Landroidx/media3/exoplayer/hls/HlsMediaSource;
    .registers 23

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    .line 386
    iget-object v1, v2, Lo/JsonSerializableSchema;->AudioAttributesCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;

    .line 387
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->MediaBrowserCompatMediaItem:Lo/_isShapeWrittenUsingIndex;

    .line 388
    iget-object v3, v2, Lo/JsonSerializableSchema;->AudioAttributesCompatParcelizer:Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;

    iget-object v3, v3, Lo/JsonSerializableSchema$AudioAttributesImplApi21Parcelizer;->AudioAttributesImplApi21Parcelizer:Ljava/util/List;

    .line 389
    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v4

    if-nez v4, :cond_19

    .line 390
    new-instance v4, Lo/ClassSerializer;

    invoke-direct {v4, v1, v3}, Lo/ClassSerializer;-><init>(Lo/_isShapeWrittenUsingIndex;Ljava/util/List;)V

    move-object v6, v4

    goto :goto_1a

    :cond_19
    move-object v6, v1

    .line 395
    :goto_1a
    iget-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->IconCompatParcelizer:Lo/_fromClass$IconCompatParcelizer;

    if-nez v1, :cond_20

    const/4 v1, 0x0

    goto :goto_24

    .line 397
    :cond_20
    invoke-interface {v1, v2}, Lo/_fromClass$IconCompatParcelizer;->write(Lo/JsonSerializableSchema;)Lo/_fromClass;

    move-result-object v1

    :goto_24
    move-object/from16 v18, v1

    .line 399
    iget-object v3, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->MediaBrowserCompatCustomActionResultReceiver:Lo/_getReferenced;

    iget-object v4, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->MediaBrowserCompatItemReceiver:Lo/_getReferencedIfPresent;

    iget-object v5, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->read:Lo/_useStatic;

    iget-object v1, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->RemoteActionCompatParcelizer:Lo/SimpleBeanPropertyFilter;

    .line 405
    invoke-interface {v1, v2}, Lo/SimpleBeanPropertyFilter;->read(Lo/JsonSerializableSchema;)Lo/matchesUntyped;

    move-result-object v7

    iget-object v9, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->AudioAttributesImplApi21Parcelizer:Lo/_resolveSuperClass;

    move-object v8, v9

    iget-object v10, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->MediaMetadataCompat:Lo/_serializeAsIndex$AudioAttributesCompatParcelizer;

    iget-object v11, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->MediaBrowserCompatCustomActionResultReceiver:Lo/_getReferenced;

    .line 407
    new-instance v19, Landroidx/media3/exoplayer/hls/HlsMediaSource;

    move-object/from16 v1, v19

    invoke-interface {v10, v11, v9, v6}, Lo/_serializeAsIndex$AudioAttributesCompatParcelizer;->read(Lo/_getReferenced;Lo/_resolveSuperClass;Lo/_isShapeWrittenUsingIndex;)Lo/_serializeAsIndex;

    move-result-object v9

    iget-wide v10, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->AudioAttributesImplBaseParcelizer:J

    iget-boolean v12, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->AudioAttributesCompatParcelizer:Z

    iget v13, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->AudioAttributesImplApi26Parcelizer:I

    iget-boolean v14, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->MediaBrowserCompatSearchResultReceiver:Z

    move-object/from16 v20, v1

    iget-wide v0, v0, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->MediaDescriptionCompat:J

    move-wide v15, v0

    const/16 v17, 0x0

    move-object/from16 v2, p1

    move-object/from16 v6, v18

    move-object/from16 v1, v20

    invoke-direct/range {v1 .. v17}, Landroidx/media3/exoplayer/hls/HlsMediaSource;-><init>(Lo/JsonSerializableSchema;Lo/_getReferenced;Lo/_getReferencedIfPresent;Lo/_useStatic;Lo/_fromClass;Lo/matchesUntyped;Lo/_resolveSuperClass;Lo/_serializeAsIndex;JZIZJLandroidx/media3/exoplayer/hls/HlsMediaSource$3;)V

    return-object v19
.end method

.method public final synthetic read(Lo/_fromClass$IconCompatParcelizer;)Lo/StdKeySerializers$AudioAttributesCompatParcelizer;
    .registers 2

    .line 103
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->IconCompatParcelizer(Lo/_fromClass$IconCompatParcelizer;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic read(Lo/_resolveSuperClass;)Lo/StdKeySerializers$AudioAttributesCompatParcelizer;
    .registers 2

    .line 103
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->IconCompatParcelizer(Lo/_resolveSuperClass;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic write(Lo/SimpleBeanPropertyFilter;)Lo/StdKeySerializers$AudioAttributesCompatParcelizer;
    .registers 2

    .line 103
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->RemoteActionCompatParcelizer(Lo/SimpleBeanPropertyFilter;)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic write(Z)Lo/StdKeySerializers$AudioAttributesCompatParcelizer;
    .registers 2
    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    .line 103
    invoke-direct {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->IconCompatParcelizer(Z)Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic write(Lo/JsonSerializableSchema;)Lo/StdKeySerializers;
    .registers 2

    .line 103
    invoke-virtual {p0, p1}, Landroidx/media3/exoplayer/hls/HlsMediaSource$Factory;->read(Lo/JsonSerializableSchema;)Landroidx/media3/exoplayer/hls/HlsMediaSource;

    move-result-object p0

    return-object p0
.end method
