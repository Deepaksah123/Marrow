###### Class androidx.work.impl.WorkDatabase_Impl (androidx.work.impl.WorkDatabase_Impl)
.class public final Landroidx/work/impl/WorkDatabase_Impl;
.super Landroidx/work/impl/WorkDatabase;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0014\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0014\u00a2\u0006\u0004\u0008\u0008\u0010\tJ)\u0010\r\u001a\u001c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000b\u0012\u000e\u0012\u000c\u0012\u0008\u0012\u0006\u0012\u0002\u0008\u00030\u000b0\u000c0\nH\u0014\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u001d\u0010\u0011\u001a\u0010\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000b0\u000fH\u0016\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J1\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u000c2\u001a\u0010\u0013\u001a\u0016\u0012\u000c\u0012\n\u0012\u0006\u0008\u0001\u0012\u00020\u00100\u000b\u0012\u0004\u0012\u00020\u00100\nH\u0016\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\u000f\u0010\u0018\u001a\u00020\u0017H\u0016\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u000f\u0010\u001b\u001a\u00020\u001aH\u0016\u00a2\u0006\u0004\u0008\u001b\u0010\u001cJ\u000f\u0010\u001e\u001a\u00020\u001dH\u0016\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u000f\u0010!\u001a\u00020 H\u0016\u00a2\u0006\u0004\u0008!\u0010\"J\u000f\u0010$\u001a\u00020#H\u0016\u00a2\u0006\u0004\u0008$\u0010%J\u000f\u0010\'\u001a\u00020&H\u0016\u00a2\u0006\u0004\u0008\'\u0010(J\u000f\u0010*\u001a\u00020)H\u0016\u00a2\u0006\u0004\u0008*\u0010+R\u001a\u0010/\u001a\u0008\u0012\u0004\u0012\u00020\u00170,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008-\u0010.R\u001a\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u001a0,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008/\u0010.R\u001a\u00101\u001a\u0008\u0012\u0004\u0012\u00020\u001d0,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00080\u0010.R\u001a\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020 0,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00082\u0010.R\u001a\u00104\u001a\u0008\u0012\u0004\u0012\u00020#0,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00083\u0010.R\u001a\u00100\u001a\u0008\u0012\u0004\u0012\u00020&0,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00085\u0010.R\u001a\u0010-\u001a\u0008\u0012\u0004\u0012\u00020)0,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010.R\u001a\u00103\u001a\u0008\u0012\u0004\u0012\u0002060,8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u00081\u0010."
    }
    d2 = {
        "Landroidx/work/impl/WorkDatabase_Impl;",
        "Landroidx/work/impl/WorkDatabase;",
        "<init>",
        "()V",
        "Lo/ValueClassUnboxSerializer;",
        "onPrepareFromSearch",
        "()Lo/ValueClassUnboxSerializer;",
        "Lo/deserializeKeyQDdqvc;",
        "AudioAttributesCompatParcelizer",
        "()Lo/deserializeKeyQDdqvc;",
        "",
        "Lo/isHdPlaybackError;",
        "",
        "MediaMetadataCompat",
        "()Ljava/util/Map;",
        "",
        "Lo/setVisibleXRangeMaximum;",
        "RatingCompat",
        "()Ljava/util/Set;",
        "p0",
        "Lo/setVisibleYRange;",
        "write",
        "(Ljava/util/Map;)Ljava/util/List;",
        "Lo/CVolumeFlags;",
        "onMediaButtonEvent",
        "()Lo/CVolumeFlags;",
        "Lo/fromBundle;",
        "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver",
        "()Lo/fromBundle;",
        "Lo/shouldStartPlayback;",
        "onPrepareFromMediaId",
        "()Lo/shouldStartPlayback;",
        "Lo/CColorRange;",
        "onPause",
        "()Lo/CColorRange;",
        "Lo/CRoleFlags;",
        "onFastForward",
        "()Lo/CRoleFlags;",
        "Lo/CStreamType;",
        "onPlayFromMediaId",
        "()Lo/CStreamType;",
        "Lo/CAudioFlags;",
        "onPlay",
        "()Lo/CAudioFlags;",
        "Lo/RenewEligible;",
        "MediaBrowserCompatCustomActionResultReceiver",
        "Lo/RenewEligible;",
        "IconCompatParcelizer",
        "AudioAttributesImplBaseParcelizer",
        "read",
        "MediaBrowserCompatItemReceiver",
        "AudioAttributesImplApi21Parcelizer",
        "RemoteActionCompatParcelizer",
        "AudioAttributesImplApi26Parcelizer",
        "Lo/CColorTransfer;"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final AudioAttributesImplApi21Parcelizer:Lo/RenewEligible;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/RenewEligible<",
            "Lo/CRoleFlags;",
            ">;"
        }
    .end annotation
.end field

.field private final AudioAttributesImplApi26Parcelizer:Lo/RenewEligible;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/RenewEligible<",
            "Lo/CStreamType;",
            ">;"
        }
    .end annotation
.end field

.field private final AudioAttributesImplBaseParcelizer:Lo/RenewEligible;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/RenewEligible<",
            "Lo/shouldStartPlayback;",
            ">;"
        }
    .end annotation
.end field

.field private final IconCompatParcelizer:Lo/RenewEligible;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/RenewEligible<",
            "Lo/fromBundle;",
            ">;"
        }
    .end annotation
.end field

.field private final MediaBrowserCompatCustomActionResultReceiver:Lo/RenewEligible;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/RenewEligible<",
            "Lo/CVolumeFlags;",
            ">;"
        }
    .end annotation
.end field

.field private final MediaBrowserCompatItemReceiver:Lo/RenewEligible;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/RenewEligible<",
            "Lo/CColorRange;",
            ">;"
        }
    .end annotation
.end field

.field private final read:Lo/RenewEligible;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/RenewEligible<",
            "Lo/CColorTransfer;",
            ">;"
        }
    .end annotation
.end field

.field private final write:Lo/RenewEligible;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lo/RenewEligible<",
            "Lo/CAudioFlags;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 43
    invoke-direct {p0}, Landroidx/work/impl/WorkDatabase;-><init>()V

    .line 44
    new-instance v0, Lo/getCurrentLiveOffset;

    invoke-direct {v0, p0}, Lo/getCurrentLiveOffset;-><init>(Landroidx/work/impl/WorkDatabase_Impl;)V

    invoke-static {v0}, Lo/getRenewExpiresOn;->RemoteActionCompatParcelizer(Lo/getCreatedOnDateMs;)Lo/RenewEligible;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->MediaBrowserCompatCustomActionResultReceiver:Lo/RenewEligible;

    .line 48
    new-instance v0, Lo/clearMediaItems;

    invoke-direct {v0, p0}, Lo/clearMediaItems;-><init>(Landroidx/work/impl/WorkDatabase_Impl;)V

    invoke-static {v0}, Lo/getRenewExpiresOn;->RemoteActionCompatParcelizer(Lo/getCreatedOnDateMs;)Lo/RenewEligible;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->IconCompatParcelizer:Lo/RenewEligible;

    .line 52
    new-instance v0, Lo/getCurrentManifest;

    invoke-direct {v0, p0}, Lo/getCurrentManifest;-><init>(Landroidx/work/impl/WorkDatabase_Impl;)V

    invoke-static {v0}, Lo/getRenewExpiresOn;->RemoteActionCompatParcelizer(Lo/getCreatedOnDateMs;)Lo/RenewEligible;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->AudioAttributesImplBaseParcelizer:Lo/RenewEligible;

    .line 56
    new-instance v0, Lo/getBufferedPercentage;

    invoke-direct {v0, p0}, Lo/getBufferedPercentage;-><init>(Landroidx/work/impl/WorkDatabase_Impl;)V

    invoke-static {v0}, Lo/getRenewExpiresOn;->RemoteActionCompatParcelizer(Lo/getCreatedOnDateMs;)Lo/RenewEligible;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->MediaBrowserCompatItemReceiver:Lo/RenewEligible;

    .line 60
    new-instance v0, Lo/getMediaItemAt;

    invoke-direct {v0, p0}, Lo/getMediaItemAt;-><init>(Landroidx/work/impl/WorkDatabase_Impl;)V

    invoke-static {v0}, Lo/getRenewExpiresOn;->RemoteActionCompatParcelizer(Lo/getCreatedOnDateMs;)Lo/RenewEligible;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->AudioAttributesImplApi21Parcelizer:Lo/RenewEligible;

    .line 64
    new-instance v0, Lo/getCurrentMediaItem;

    invoke-direct {v0, p0}, Lo/getCurrentMediaItem;-><init>(Landroidx/work/impl/WorkDatabase_Impl;)V

    invoke-static {v0}, Lo/getRenewExpiresOn;->RemoteActionCompatParcelizer(Lo/getCreatedOnDateMs;)Lo/RenewEligible;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->AudioAttributesImplApi26Parcelizer:Lo/RenewEligible;

    .line 68
    new-instance v0, Lo/getMediaItemCount;

    invoke-direct {v0, p0}, Lo/getMediaItemCount;-><init>(Landroidx/work/impl/WorkDatabase_Impl;)V

    invoke-static {v0}, Lo/getRenewExpiresOn;->RemoteActionCompatParcelizer(Lo/getCreatedOnDateMs;)Lo/RenewEligible;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->write:Lo/RenewEligible;

    .line 72
    new-instance v0, Lo/getNextMediaItemIndex;

    invoke-direct {v0, p0}, Lo/getNextMediaItemIndex;-><init>(Landroidx/work/impl/WorkDatabase_Impl;)V

    invoke-static {v0}, Lo/getRenewExpiresOn;->RemoteActionCompatParcelizer(Lo/getCreatedOnDateMs;)Lo/RenewEligible;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/impl/WorkDatabase_Impl;->read:Lo/RenewEligible;

    return-void
.end method

.method public static synthetic AudioAttributesCompatParcelizer(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CWakeMode;
    .registers 1

    .line 421
    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->MediaBrowserCompatSearchResultReceiver(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CWakeMode;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic AudioAttributesCompatParcelizer(Landroidx/work/impl/WorkDatabase_Impl;Lo/setDrawHoleEnabled;)V
    .registers 2

    .line 42
    invoke-virtual {p0, p1}, Lo/ValueClassSerializerStaticJsonValue;->RemoteActionCompatParcelizer(Lo/setDrawHoleEnabled;)V

    return-void
.end method

.method private static final AudioAttributesImplApi21Parcelizer(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CAudioAllowedCapturePolicy;
    .registers 2

    .line 69
    new-instance v0, Lo/CAudioAllowedCapturePolicy;

    check-cast p0, Lo/ValueClassSerializerStaticJsonValue;

    invoke-direct {v0, p0}, Lo/CAudioAllowedCapturePolicy;-><init>(Lo/ValueClassSerializerStaticJsonValue;)V

    return-object v0
.end method

.method private static final AudioAttributesImplApi26Parcelizer(Landroidx/work/impl/WorkDatabase_Impl;)Lo/C;
    .registers 2

    .line 49
    new-instance v0, Lo/C;

    check-cast p0, Lo/ValueClassSerializerStaticJsonValue;

    invoke-direct {v0, p0}, Lo/C;-><init>(Lo/ValueClassSerializerStaticJsonValue;)V

    return-object v0
.end method

.method public static synthetic AudioAttributesImplBaseParcelizer(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CCryptoMode;
    .registers 1

    .line 424
    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->MediaBrowserCompatMediaItem(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CCryptoMode;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic IconCompatParcelizer(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CFormatSupport;
    .registers 1

    .line 420
    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->MediaMetadataCompat(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CFormatSupport;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic MediaBrowserCompatCustomActionResultReceiver(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CSelectionReason;
    .registers 1

    .line 425
    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->MediaDescriptionCompat(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CSelectionReason;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic MediaBrowserCompatItemReceiver(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CColorSpace;
    .registers 1

    .line 426
    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->RatingCompat(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CColorSpace;

    move-result-object p0

    return-object p0
.end method

.method private static final MediaBrowserCompatMediaItem(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CCryptoMode;
    .registers 2

    .line 57
    new-instance v0, Lo/CCryptoMode;

    check-cast p0, Lo/ValueClassSerializerStaticJsonValue;

    invoke-direct {v0, p0}, Lo/CCryptoMode;-><init>(Lo/ValueClassSerializerStaticJsonValue;)V

    return-object v0
.end method

.method private static final MediaBrowserCompatSearchResultReceiver(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CWakeMode;
    .registers 2

    .line 45
    new-instance v0, Lo/CWakeMode;

    check-cast p0, Lo/ValueClassSerializerStaticJsonValue;

    invoke-direct {v0, p0}, Lo/CWakeMode;-><init>(Lo/ValueClassSerializerStaticJsonValue;)V

    return-object v0
.end method

.method private static final MediaDescriptionCompat(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CSelectionReason;
    .registers 2

    .line 65
    new-instance v0, Lo/CSelectionReason;

    check-cast p0, Lo/ValueClassSerializerStaticJsonValue;

    invoke-direct {v0, p0}, Lo/CSelectionReason;-><init>(Lo/ValueClassSerializerStaticJsonValue;)V

    return-object v0
.end method

.method private static final MediaMetadataCompat(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CFormatSupport;
    .registers 2

    .line 61
    new-instance v0, Lo/CFormatSupport;

    check-cast p0, Lo/ValueClassSerializerStaticJsonValue;

    invoke-direct {v0, p0}, Lo/CFormatSupport;-><init>(Lo/ValueClassSerializerStaticJsonValue;)V

    return-object v0
.end method

.method private static final RatingCompat(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CColorSpace;
    .registers 2

    .line 73
    new-instance v0, Lo/CColorSpace;

    check-cast p0, Lo/ValueClassSerializerStaticJsonValue;

    invoke-direct {v0, p0}, Lo/CColorSpace;-><init>(Lo/ValueClassSerializerStaticJsonValue;)V

    return-object v0
.end method

.method public static synthetic RemoteActionCompatParcelizer(Landroidx/work/impl/WorkDatabase_Impl;)Lo/C;
    .registers 1

    .line 423
    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->AudioAttributesImplApi26Parcelizer(Landroidx/work/impl/WorkDatabase_Impl;)Lo/C;

    move-result-object p0

    return-object p0
.end method

.method private static final onAddQueueItem(Landroidx/work/impl/WorkDatabase_Impl;)Lo/setBufferDurationsMs;
    .registers 2

    .line 53
    new-instance v0, Lo/setBufferDurationsMs;

    check-cast p0, Lo/ValueClassSerializerStaticJsonValue;

    invoke-direct {v0, p0}, Lo/setBufferDurationsMs;-><init>(Lo/ValueClassSerializerStaticJsonValue;)V

    return-object v0
.end method

.method private onPrepareFromSearch()Lo/ValueClassUnboxSerializer;
    .registers 2

    .line 77
    new-instance v0, Landroidx/work/impl/WorkDatabase_Impl$write;

    invoke-direct {v0, p0}, Landroidx/work/impl/WorkDatabase_Impl$write;-><init>(Landroidx/work/impl/WorkDatabase_Impl;)V

    check-cast v0, Lo/ValueClassUnboxSerializer;

    return-object v0
.end method

.method public static synthetic read(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CAudioAllowedCapturePolicy;
    .registers 1

    .line 422
    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->AudioAttributesImplApi21Parcelizer(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CAudioAllowedCapturePolicy;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic write(Landroidx/work/impl/WorkDatabase_Impl;)Lo/setBufferDurationsMs;
    .registers 1

    .line 419
    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->onAddQueueItem(Landroidx/work/impl/WorkDatabase_Impl;)Lo/setBufferDurationsMs;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Lo/deserializeKeyQDdqvc;
    .registers 10

    .line 361
    new-instance v0, Ljava/util/LinkedHashMap;

    invoke-direct {v0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v0, Ljava/util/Map;

    .line 362
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v1, Ljava/util/Map;

    .line 363
    check-cast p0, Lo/ValueClassSerializerStaticJsonValue;

    const-string v2, "Dependency"

    const-string v3, "WorkSpec"

    .line 364
    const-string v4, "WorkTag"

    const-string v5, "SystemIdInfo"

    const-string v6, "WorkName"

    const-string v7, "WorkProgress"

    const-string v8, "Preference"

    filled-new-array/range {v2 .. v8}, [Ljava/lang/String;

    move-result-object v2

    .line 363
    new-instance v3, Lo/deserializeKeyQDdqvc;

    invoke-direct {v3, p0, v0, v1, v2}, Lo/deserializeKeyQDdqvc;-><init>(Lo/ValueClassSerializerStaticJsonValue;Ljava/util/Map;Ljava/util/Map;[Ljava/lang/String;)V

    return-object v3
.end method

.method public final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Lo/fromBundle;
    .registers 1

    .line 408
    iget-object p0, p0, Landroidx/work/impl/WorkDatabase_Impl;->IconCompatParcelizer:Lo/RenewEligible;

    invoke-interface {p0}, Lo/RenewEligible;->RemoteActionCompatParcelizer()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/fromBundle;

    return-object p0
.end method

.method public final MediaMetadataCompat()Ljava/util/Map;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Map<",
            "Lo/isHdPlaybackError<",
            "*>;",
            "Ljava/util/List<",
            "Lo/isHdPlaybackError<",
            "*>;>;>;"
        }
    .end annotation

    .line 373
    new-instance p0, Ljava/util/LinkedHashMap;

    invoke-direct {p0}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast p0, Ljava/util/Map;

    .line 374
    const-class v0, Lo/CVolumeFlags;

    invoke-static {v0}, Lo/toMagicModuleMetaDataUcModel;->write(Ljava/lang/Class;)Lo/isHdPlaybackError;

    move-result-object v0

    sget-object v1, Lo/CWakeMode;->read:Lo/CWakeMode$read;

    invoke-static {}, Lo/CWakeMode$read;->RemoteActionCompatParcelizer()Ljava/util/List;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 375
    const-class v0, Lo/fromBundle;

    invoke-static {v0}, Lo/toMagicModuleMetaDataUcModel;->write(Ljava/lang/Class;)Lo/isHdPlaybackError;

    move-result-object v0

    sget-object v1, Lo/C;->AudioAttributesCompatParcelizer:Lo/C$AudioAttributesCompatParcelizer;

    invoke-static {}, Lo/C$AudioAttributesCompatParcelizer;->write()Ljava/util/List;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 376
    const-class v0, Lo/shouldStartPlayback;

    invoke-static {v0}, Lo/toMagicModuleMetaDataUcModel;->write(Ljava/lang/Class;)Lo/isHdPlaybackError;

    move-result-object v0

    sget-object v1, Lo/setBufferDurationsMs;->read:Lo/setBufferDurationsMs$read;

    invoke-static {}, Lo/setBufferDurationsMs$read;->AudioAttributesCompatParcelizer()Ljava/util/List;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 377
    const-class v0, Lo/CColorRange;

    invoke-static {v0}, Lo/toMagicModuleMetaDataUcModel;->write(Ljava/lang/Class;)Lo/isHdPlaybackError;

    move-result-object v0

    sget-object v1, Lo/CCryptoMode;->IconCompatParcelizer:Lo/CCryptoMode$IconCompatParcelizer;

    invoke-static {}, Lo/CCryptoMode$IconCompatParcelizer;->read()Ljava/util/List;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 378
    const-class v0, Lo/CRoleFlags;

    invoke-static {v0}, Lo/toMagicModuleMetaDataUcModel;->write(Ljava/lang/Class;)Lo/isHdPlaybackError;

    move-result-object v0

    sget-object v1, Lo/CFormatSupport;->AudioAttributesCompatParcelizer:Lo/CFormatSupport$AudioAttributesCompatParcelizer;

    invoke-static {}, Lo/CFormatSupport$AudioAttributesCompatParcelizer;->IconCompatParcelizer()Ljava/util/List;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 379
    const-class v0, Lo/CStreamType;

    invoke-static {v0}, Lo/toMagicModuleMetaDataUcModel;->write(Ljava/lang/Class;)Lo/isHdPlaybackError;

    move-result-object v0

    sget-object v1, Lo/CSelectionReason;->write:Lo/CSelectionReason$write;

    invoke-static {}, Lo/CSelectionReason$write;->IconCompatParcelizer()Ljava/util/List;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 380
    const-class v0, Lo/CAudioFlags;

    invoke-static {v0}, Lo/toMagicModuleMetaDataUcModel;->write(Ljava/lang/Class;)Lo/isHdPlaybackError;

    move-result-object v0

    sget-object v1, Lo/CAudioAllowedCapturePolicy;->AudioAttributesCompatParcelizer:Lo/CAudioAllowedCapturePolicy$AudioAttributesCompatParcelizer;

    invoke-static {}, Lo/CAudioAllowedCapturePolicy$AudioAttributesCompatParcelizer;->IconCompatParcelizer()Ljava/util/List;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 381
    const-class v0, Lo/CColorTransfer;

    invoke-static {v0}, Lo/toMagicModuleMetaDataUcModel;->write(Ljava/lang/Class;)Lo/isHdPlaybackError;

    move-result-object v0

    sget-object v1, Lo/CColorSpace;->AudioAttributesCompatParcelizer:Lo/CColorSpace$AudioAttributesCompatParcelizer;

    invoke-static {}, Lo/CColorSpace$AudioAttributesCompatParcelizer;->RemoteActionCompatParcelizer()Ljava/util/List;

    move-result-object v1

    invoke-interface {p0, v0, v1}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object p0
.end method

.method public final RatingCompat()Ljava/util/Set;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Lo/isHdPlaybackError<",
            "+",
            "Lo/setVisibleXRangeMaximum;",
            ">;>;"
        }
    .end annotation

    .line 386
    new-instance p0, Ljava/util/LinkedHashSet;

    invoke-direct {p0}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast p0, Ljava/util/Set;

    return-object p0
.end method

.method public final onFastForward()Lo/CRoleFlags;
    .registers 1

    .line 414
    iget-object p0, p0, Landroidx/work/impl/WorkDatabase_Impl;->AudioAttributesImplApi21Parcelizer:Lo/RenewEligible;

    invoke-interface {p0}, Lo/RenewEligible;->RemoteActionCompatParcelizer()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/CRoleFlags;

    return-object p0
.end method

.method public final onMediaButtonEvent()Lo/CVolumeFlags;
    .registers 1

    .line 406
    iget-object p0, p0, Landroidx/work/impl/WorkDatabase_Impl;->MediaBrowserCompatCustomActionResultReceiver:Lo/RenewEligible;

    invoke-interface {p0}, Lo/RenewEligible;->RemoteActionCompatParcelizer()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/CVolumeFlags;

    return-object p0
.end method

.method public final onPause()Lo/CColorRange;
    .registers 1

    .line 412
    iget-object p0, p0, Landroidx/work/impl/WorkDatabase_Impl;->MediaBrowserCompatItemReceiver:Lo/RenewEligible;

    invoke-interface {p0}, Lo/RenewEligible;->RemoteActionCompatParcelizer()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/CColorRange;

    return-object p0
.end method

.method public final onPlay()Lo/CAudioFlags;
    .registers 1

    .line 418
    iget-object p0, p0, Landroidx/work/impl/WorkDatabase_Impl;->write:Lo/RenewEligible;

    invoke-interface {p0}, Lo/RenewEligible;->RemoteActionCompatParcelizer()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/CAudioFlags;

    return-object p0
.end method

.method public final onPlayFromMediaId()Lo/CStreamType;
    .registers 1

    .line 416
    iget-object p0, p0, Landroidx/work/impl/WorkDatabase_Impl;->AudioAttributesImplApi26Parcelizer:Lo/RenewEligible;

    invoke-interface {p0}, Lo/RenewEligible;->RemoteActionCompatParcelizer()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/CStreamType;

    return-object p0
.end method

.method public final onPrepareFromMediaId()Lo/shouldStartPlayback;
    .registers 1

    .line 410
    iget-object p0, p0, Landroidx/work/impl/WorkDatabase_Impl;->AudioAttributesImplBaseParcelizer:Lo/RenewEligible;

    invoke-interface {p0}, Lo/RenewEligible;->RemoteActionCompatParcelizer()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/shouldStartPlayback;

    return-object p0
.end method

.method public final write(Ljava/util/Map;)Ljava/util/List;
    .registers 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Lo/isHdPlaybackError<",
            "+",
            "Lo/setVisibleXRangeMaximum;",
            ">;+",
            "Lo/setVisibleXRangeMaximum;",
            ">;)",
            "Ljava/util/List<",
            "Lo/setVisibleYRange;",
            ">;"
        }
    .end annotation

    const-string p0, ""

    invoke-static {p1, p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 393
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    check-cast p0, Ljava/util/List;

    .line 394
    new-instance p1, Lo/repeatCurrentMediaItem;

    invoke-direct {p1}, Lo/repeatCurrentMediaItem;-><init>()V

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 395
    new-instance p1, Lo/getRepeatModeForNavigation;

    invoke-direct {p1}, Lo/getRepeatModeForNavigation;-><init>()V

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 396
    new-instance p1, Lo/seekToCurrentItem;

    invoke-direct {p1}, Lo/seekToCurrentItem;-><init>()V

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 397
    new-instance p1, Lo/addMediaItems;

    invoke-direct {p1}, Lo/addMediaItems;-><init>()V

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 398
    new-instance p1, Lo/seekToPreviousMediaItemInternal;

    invoke-direct {p1}, Lo/seekToPreviousMediaItemInternal;-><init>()V

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 399
    new-instance p1, Lo/canAdvertiseSession;

    invoke-direct {p1}, Lo/canAdvertiseSession;-><init>()V

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 400
    new-instance p1, Lo/seekToOffset;

    invoke-direct {p1}, Lo/seekToOffset;-><init>()V

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 401
    new-instance p1, Lo/addMediaItem;

    invoke-direct {p1}, Lo/addMediaItem;-><init>()V

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    .line 402
    new-instance p1, Lo/getContentDuration;

    invoke-direct {p1}, Lo/getContentDuration;-><init>()V

    invoke-interface {p0, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    return-object p0
.end method

.method public final synthetic write()Lo/checkAccessibility;
    .registers 1

    .line 42
    invoke-direct {p0}, Landroidx/work/impl/WorkDatabase_Impl;->onPrepareFromSearch()Lo/ValueClassUnboxSerializer;

    move-result-object p0

    check-cast p0, Lo/checkAccessibility;

    return-object p0
.end method

###### Class androidx.work.impl.WorkDatabase_Impl.write (androidx.work.impl.WorkDatabase_Impl$write)
.class public final Landroidx/work/impl/WorkDatabase_Impl$write;
.super Lo/ValueClassUnboxSerializer;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Landroidx/work/impl/WorkDatabase_Impl;->onPrepareFromSearch()Lo/ValueClassUnboxSerializer;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field final synthetic write:Landroidx/work/impl/WorkDatabase_Impl;


# direct methods
.method constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;)V
    .registers 4

    iput-object p1, p0, Landroidx/work/impl/WorkDatabase_Impl$write;->write:Landroidx/work/impl/WorkDatabase_Impl;

    .line 77
    const-string p1, "08b926448d86528e697981ddd30459f7"

    const-string v0, "149fd8ad55885d3fe3549a37a0163243"

    const/16 v1, 0x18

    invoke-direct {p0, v1, p1, v0}, Lo/ValueClassUnboxSerializer;-><init>(ILjava/lang/String;Ljava/lang/String;)V

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Lo/setDrawHoleEnabled;)V
    .registers 2

    .line 356
    const-string p0, ""

    invoke-static {p1, p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final AudioAttributesImplApi21Parcelizer(Lo/setDrawHoleEnabled;)Lo/ValueClassUnboxSerializer$IconCompatParcelizer;
    .registers 29

    move-object/from16 v0, p1

    const-string v1, ""

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 124
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v1, Ljava/util/Map;

    .line 125
    new-instance v9, Lo/setNoDataTextTypeface$write;

    const-string v3, "work_spec_id"

    const-string v4, "TEXT"

    const/4 v5, 0x1

    const/4 v6, 0x1

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object v2, v9

    invoke-direct/range {v2 .. v8}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v2, "work_spec_id"

    invoke-interface {v1, v2, v9}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 127
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v11, "prerequisite_id"

    const-string v12, "TEXT"

    const/4 v13, 0x1

    const/4 v14, 0x2

    const/4 v15, 0x0

    const/16 v16, 0x1

    move-object v10, v3

    invoke-direct/range {v10 .. v16}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "prerequisite_id"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 129
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v3, Ljava/util/Set;

    .line 131
    invoke-static {v2}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    const-string v11, "id"

    invoke-static {v11}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    .line 130
    new-instance v12, Lo/setNoDataTextTypeface$AudioAttributesCompatParcelizer;

    const-string v6, "WorkSpec"

    const-string v7, "CASCADE"

    const-string v8, "CASCADE"

    move-object v5, v12

    invoke-direct/range {v5 .. v10}, Lo/setNoDataTextTypeface$AudioAttributesCompatParcelizer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    invoke-interface {v3, v12}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 133
    invoke-static {v4}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    invoke-static {v11}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    .line 132
    new-instance v5, Lo/setNoDataTextTypeface$AudioAttributesCompatParcelizer;

    const-string v14, "WorkSpec"

    const-string v15, "CASCADE"

    const-string v16, "CASCADE"

    move-object v13, v5

    invoke-direct/range {v13 .. v18}, Lo/setNoDataTextTypeface$AudioAttributesCompatParcelizer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    invoke-interface {v3, v5}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 134
    new-instance v5, Ljava/util/LinkedHashSet;

    invoke-direct {v5}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v5, Ljava/util/Set;

    .line 136
    invoke-static {v2}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    const-string v7, "ASC"

    invoke-static {v7}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    .line 135
    new-instance v9, Lo/setNoDataTextTypeface$IconCompatParcelizer;

    const-string v10, "index_Dependency_work_spec_id"

    const/4 v12, 0x0

    invoke-direct {v9, v10, v12, v6, v8}, Lo/setNoDataTextTypeface$IconCompatParcelizer;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-interface {v5, v9}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 138
    invoke-static {v4}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v7}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    .line 137
    new-instance v8, Lo/setNoDataTextTypeface$IconCompatParcelizer;

    const-string v9, "index_Dependency_prerequisite_id"

    invoke-direct {v8, v9, v12, v4, v6}, Lo/setNoDataTextTypeface$IconCompatParcelizer;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-interface {v5, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 139
    new-instance v4, Lo/setNoDataTextTypeface;

    const-string v6, "Dependency"

    invoke-direct {v4, v6, v1, v3, v5}, Lo/setNoDataTextTypeface;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 141
    sget-object v1, Lo/setNoDataTextTypeface;->read:Lo/setNoDataTextTypeface$read;

    invoke-static {v0, v6}, Lo/setNoDataTextTypeface$read;->write(Lo/setDrawHoleEnabled;Ljava/lang/String;)Lo/setNoDataTextTypeface;

    move-result-object v1

    .line 142
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    const-string v5, "\n Found:\n"

    if-nez v3, :cond_c9

    .line 143
    new-instance v0, Lo/ValueClassUnboxSerializer$IconCompatParcelizer;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Dependency(androidx.work.impl.model.Dependency).\n Expected:\n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v12, v1}, Lo/ValueClassUnboxSerializer$IconCompatParcelizer;-><init>(ZLjava/lang/String;)V

    return-object v0

    .line 151
    :cond_c9
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v1, Ljava/util/Map;

    .line 152
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "id"

    const-string v15, "TEXT"

    const/16 v16, 0x1

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x1

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-interface {v1, v11, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 154
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v21, "state"

    const-string v22, "INTEGER"

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x1

    move-object/from16 v20, v3

    invoke-direct/range {v20 .. v26}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "state"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 156
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "worker_class_name"

    const-string v15, "TEXT"

    const/16 v17, 0x0

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "worker_class_name"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 158
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "input_merger_class_name"

    const-string v15, "TEXT"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "input_merger_class_name"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 160
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "input"

    const-string v15, "BLOB"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "input"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 162
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "output"

    const-string v15, "BLOB"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "output"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 164
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "initial_delay"

    const-string v15, "INTEGER"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "initial_delay"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 166
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "interval_duration"

    const-string v15, "INTEGER"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "interval_duration"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 168
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "flex_duration"

    const-string v15, "INTEGER"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "flex_duration"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 170
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "run_attempt_count"

    const-string v15, "INTEGER"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "run_attempt_count"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 172
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "backoff_policy"

    const-string v15, "INTEGER"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "backoff_policy"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 174
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "backoff_delay_duration"

    const-string v15, "INTEGER"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "backoff_delay_duration"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 176
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "last_enqueue_time"

    const-string v15, "INTEGER"

    const-string v18, "-1"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "last_enqueue_time"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 179
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "minimum_retention_duration"

    const-string v15, "INTEGER"

    const/16 v18, 0x0

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 178
    const-string v6, "minimum_retention_duration"

    invoke-interface {v1, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 181
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "schedule_requested_at"

    const-string v15, "INTEGER"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v6, "schedule_requested_at"

    invoke-interface {v1, v6, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 183
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "run_in_foreground"

    const-string v15, "INTEGER"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v8, "run_in_foreground"

    invoke-interface {v1, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 185
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "out_of_quota_policy"

    const-string v15, "INTEGER"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v8, "out_of_quota_policy"

    invoke-interface {v1, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 187
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "period_count"

    const-string v15, "INTEGER"

    const-string v18, "0"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v8, "period_count"

    invoke-interface {v1, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 189
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "generation"

    const-string v15, "INTEGER"

    const-string v18, "0"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v8, "generation"

    invoke-interface {v1, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 192
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "next_schedule_time_override"

    const-string v15, "INTEGER"

    const-string v18, "9223372036854775807"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 191
    const-string v9, "next_schedule_time_override"

    invoke-interface {v1, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 195
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "next_schedule_time_override_generation"

    const-string v15, "INTEGER"

    const-string v18, "0"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 194
    const-string v9, "next_schedule_time_override_generation"

    invoke-interface {v1, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 197
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "stop_reason"

    const-string v15, "INTEGER"

    const-string v18, "-256"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v9, "stop_reason"

    invoke-interface {v1, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 199
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "trace_tag"

    const-string v15, "TEXT"

    const/16 v16, 0x0

    const/16 v18, 0x0

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v9, "trace_tag"

    invoke-interface {v1, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 202
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "backoff_on_system_interruptions"

    const-string v15, "INTEGER"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 201
    const-string v9, "backoff_on_system_interruptions"

    invoke-interface {v1, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 204
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "required_network_type"

    const-string v15, "INTEGER"

    const/16 v16, 0x1

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v9, "required_network_type"

    invoke-interface {v1, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 207
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "required_network_request"

    const-string v15, "BLOB"

    const-string v18, "x\'\'"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 206
    const-string v9, "required_network_request"

    invoke-interface {v1, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 209
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "requires_charging"

    const-string v15, "INTEGER"

    const/16 v18, 0x0

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v9, "requires_charging"

    invoke-interface {v1, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 211
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "requires_device_idle"

    const-string v15, "INTEGER"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v9, "requires_device_idle"

    invoke-interface {v1, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 214
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "requires_battery_not_low"

    const-string v15, "INTEGER"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 213
    const-string v9, "requires_battery_not_low"

    invoke-interface {v1, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 217
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "requires_storage_not_low"

    const-string v15, "INTEGER"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 216
    const-string v9, "requires_storage_not_low"

    invoke-interface {v1, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 220
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "trigger_content_update_delay"

    const-string v15, "INTEGER"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 219
    const-string v9, "trigger_content_update_delay"

    invoke-interface {v1, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 223
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "trigger_max_content_delay"

    const-string v15, "INTEGER"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    .line 222
    const-string v9, "trigger_max_content_delay"

    invoke-interface {v1, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 225
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "content_uri_triggers"

    const-string v15, "BLOB"

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v9, "content_uri_triggers"

    invoke-interface {v1, v9, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 227
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v3, Ljava/util/Set;

    .line 228
    new-instance v9, Ljava/util/LinkedHashSet;

    invoke-direct {v9}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v9, Ljava/util/Set;

    .line 230
    invoke-static {v6}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-static {v7}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v10

    .line 229
    new-instance v13, Lo/setNoDataTextTypeface$IconCompatParcelizer;

    const-string v14, "index_WorkSpec_schedule_requested_at"

    invoke-direct {v13, v14, v12, v6, v10}, Lo/setNoDataTextTypeface$IconCompatParcelizer;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-interface {v9, v13}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 232
    invoke-static {v4}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v4

    invoke-static {v7}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    .line 231
    new-instance v10, Lo/setNoDataTextTypeface$IconCompatParcelizer;

    const-string v13, "index_WorkSpec_last_enqueue_time"

    invoke-direct {v10, v13, v12, v4, v6}, Lo/setNoDataTextTypeface$IconCompatParcelizer;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-interface {v9, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 233
    new-instance v4, Lo/setNoDataTextTypeface;

    const-string v6, "WorkSpec"

    invoke-direct {v4, v6, v1, v3, v9}, Lo/setNoDataTextTypeface;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 235
    sget-object v1, Lo/setNoDataTextTypeface;->read:Lo/setNoDataTextTypeface$read;

    invoke-static {v0, v6}, Lo/setNoDataTextTypeface$read;->write(Lo/setDrawHoleEnabled;Ljava/lang/String;)Lo/setNoDataTextTypeface;

    move-result-object v1

    .line 236
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_347

    .line 237
    new-instance v0, Lo/ValueClassUnboxSerializer$IconCompatParcelizer;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "WorkSpec(androidx.work.impl.model.WorkSpec).\n Expected:\n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v12, v1}, Lo/ValueClassUnboxSerializer$IconCompatParcelizer;-><init>(ZLjava/lang/String;)V

    return-object v0

    .line 245
    :cond_347
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v1, Ljava/util/Map;

    .line 246
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "tag"

    const-string v15, "TEXT"

    const/16 v16, 0x1

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x1

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "tag"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 248
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "work_spec_id"

    const-string v15, "TEXT"

    const/16 v17, 0x2

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 250
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v3, Ljava/util/Set;

    .line 252
    invoke-static {v2}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    invoke-static {v11}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    .line 251
    new-instance v4, Lo/setNoDataTextTypeface$AudioAttributesCompatParcelizer;

    const-string v14, "WorkSpec"

    const-string v15, "CASCADE"

    const-string v16, "CASCADE"

    move-object v13, v4

    invoke-direct/range {v13 .. v18}, Lo/setNoDataTextTypeface$AudioAttributesCompatParcelizer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 253
    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v4, Ljava/util/Set;

    .line 255
    invoke-static {v2}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-static {v7}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v9

    .line 254
    new-instance v10, Lo/setNoDataTextTypeface$IconCompatParcelizer;

    const-string v13, "index_WorkTag_work_spec_id"

    invoke-direct {v10, v13, v12, v6, v9}, Lo/setNoDataTextTypeface$IconCompatParcelizer;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-interface {v4, v10}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 256
    new-instance v6, Lo/setNoDataTextTypeface;

    const-string v9, "WorkTag"

    invoke-direct {v6, v9, v1, v3, v4}, Lo/setNoDataTextTypeface;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 258
    sget-object v1, Lo/setNoDataTextTypeface;->read:Lo/setNoDataTextTypeface$read;

    invoke-static {v0, v9}, Lo/setNoDataTextTypeface$read;->write(Lo/setDrawHoleEnabled;Ljava/lang/String;)Lo/setNoDataTextTypeface;

    move-result-object v1

    .line 259
    invoke-virtual {v6, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3d8

    .line 260
    new-instance v0, Lo/ValueClassUnboxSerializer$IconCompatParcelizer;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "WorkTag(androidx.work.impl.model.WorkTag).\n Expected:\n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v12, v1}, Lo/ValueClassUnboxSerializer$IconCompatParcelizer;-><init>(ZLjava/lang/String;)V

    return-object v0

    .line 268
    :cond_3d8
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v1, Ljava/util/Map;

    .line 269
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "work_spec_id"

    const-string v15, "TEXT"

    const/16 v16, 0x1

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x1

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 271
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v21, "generation"

    const-string v22, "INTEGER"

    const/16 v23, 0x1

    const/16 v24, 0x2

    const-string v25, "0"

    const/16 v26, 0x1

    move-object/from16 v20, v3

    invoke-direct/range {v20 .. v26}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-interface {v1, v8, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 273
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "system_id"

    const-string v15, "INTEGER"

    const/16 v17, 0x0

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "system_id"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 275
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v3, Ljava/util/Set;

    .line 277
    invoke-static {v2}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    invoke-static {v11}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    .line 276
    new-instance v4, Lo/setNoDataTextTypeface$AudioAttributesCompatParcelizer;

    const-string v14, "WorkSpec"

    const-string v15, "CASCADE"

    const-string v16, "CASCADE"

    move-object v13, v4

    invoke-direct/range {v13 .. v18}, Lo/setNoDataTextTypeface$AudioAttributesCompatParcelizer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 278
    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v4, Ljava/util/Set;

    .line 279
    new-instance v6, Lo/setNoDataTextTypeface;

    const-string v8, "SystemIdInfo"

    invoke-direct {v6, v8, v1, v3, v4}, Lo/setNoDataTextTypeface;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 281
    sget-object v1, Lo/setNoDataTextTypeface;->read:Lo/setNoDataTextTypeface$read;

    invoke-static {v0, v8}, Lo/setNoDataTextTypeface$read;->write(Lo/setDrawHoleEnabled;Ljava/lang/String;)Lo/setNoDataTextTypeface;

    move-result-object v1

    .line 282
    invoke-virtual {v6, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_46d

    .line 283
    new-instance v0, Lo/ValueClassUnboxSerializer$IconCompatParcelizer;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "SystemIdInfo(androidx.work.impl.model.SystemIdInfo).\n Expected:\n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v12, v1}, Lo/ValueClassUnboxSerializer$IconCompatParcelizer;-><init>(ZLjava/lang/String;)V

    return-object v0

    .line 291
    :cond_46d
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v1, Ljava/util/Map;

    .line 292
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "name"

    const-string v15, "TEXT"

    const/16 v16, 0x1

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x1

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "name"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 294
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "work_spec_id"

    const-string v15, "TEXT"

    const/16 v17, 0x2

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 296
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v3, Ljava/util/Set;

    .line 298
    invoke-static {v2}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    invoke-static {v11}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    .line 297
    new-instance v4, Lo/setNoDataTextTypeface$AudioAttributesCompatParcelizer;

    const-string v14, "WorkSpec"

    const-string v15, "CASCADE"

    const-string v16, "CASCADE"

    move-object v13, v4

    invoke-direct/range {v13 .. v18}, Lo/setNoDataTextTypeface$AudioAttributesCompatParcelizer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    invoke-interface {v3, v4}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 299
    new-instance v4, Ljava/util/LinkedHashSet;

    invoke-direct {v4}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v4, Ljava/util/Set;

    .line 301
    invoke-static {v2}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v6

    invoke-static {v7}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v7

    .line 300
    new-instance v8, Lo/setNoDataTextTypeface$IconCompatParcelizer;

    const-string v9, "index_WorkName_work_spec_id"

    invoke-direct {v8, v9, v12, v6, v7}, Lo/setNoDataTextTypeface$IconCompatParcelizer;-><init>(Ljava/lang/String;ZLjava/util/List;Ljava/util/List;)V

    invoke-interface {v4, v8}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 302
    new-instance v6, Lo/setNoDataTextTypeface;

    const-string v7, "WorkName"

    invoke-direct {v6, v7, v1, v3, v4}, Lo/setNoDataTextTypeface;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 304
    sget-object v1, Lo/setNoDataTextTypeface;->read:Lo/setNoDataTextTypeface$read;

    invoke-static {v0, v7}, Lo/setNoDataTextTypeface$read;->write(Lo/setDrawHoleEnabled;Ljava/lang/String;)Lo/setNoDataTextTypeface;

    move-result-object v1

    .line 305
    invoke-virtual {v6, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_4fe

    .line 306
    new-instance v0, Lo/ValueClassUnboxSerializer$IconCompatParcelizer;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "WorkName(androidx.work.impl.model.WorkName).\n Expected:\n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v12, v1}, Lo/ValueClassUnboxSerializer$IconCompatParcelizer;-><init>(ZLjava/lang/String;)V

    return-object v0

    .line 314
    :cond_4fe
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v1, Ljava/util/Map;

    .line 315
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v14, "work_spec_id"

    const-string v15, "TEXT"

    const/16 v16, 0x1

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x1

    move-object v13, v3

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    invoke-interface {v1, v2, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 317
    new-instance v3, Lo/setNoDataTextTypeface$write;

    const-string v21, "progress"

    const-string v22, "BLOB"

    const/16 v23, 0x1

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x1

    move-object/from16 v20, v3

    invoke-direct/range {v20 .. v26}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v4, "progress"

    invoke-interface {v1, v4, v3}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 319
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v3, Ljava/util/Set;

    .line 321
    invoke-static {v2}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v17

    invoke-static {v11}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v18

    .line 320
    new-instance v2, Lo/setNoDataTextTypeface$AudioAttributesCompatParcelizer;

    const-string v14, "WorkSpec"

    const-string v15, "CASCADE"

    const-string v16, "CASCADE"

    move-object v13, v2

    invoke-direct/range {v13 .. v18}, Lo/setNoDataTextTypeface$AudioAttributesCompatParcelizer;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;)V

    invoke-interface {v3, v2}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    .line 322
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v2, Ljava/util/Set;

    .line 323
    new-instance v4, Lo/setNoDataTextTypeface;

    const-string v6, "WorkProgress"

    invoke-direct {v4, v6, v1, v3, v2}, Lo/setNoDataTextTypeface;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 325
    sget-object v1, Lo/setNoDataTextTypeface;->read:Lo/setNoDataTextTypeface$read;

    invoke-static {v0, v6}, Lo/setNoDataTextTypeface$read;->write(Lo/setDrawHoleEnabled;Ljava/lang/String;)Lo/setNoDataTextTypeface;

    move-result-object v1

    .line 326
    invoke-virtual {v4, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_584

    .line 327
    new-instance v0, Lo/ValueClassUnboxSerializer$IconCompatParcelizer;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "WorkProgress(androidx.work.impl.model.WorkProgress).\n Expected:\n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v0, v12, v1}, Lo/ValueClassUnboxSerializer$IconCompatParcelizer;-><init>(ZLjava/lang/String;)V

    return-object v0

    .line 335
    :cond_584
    new-instance v1, Ljava/util/LinkedHashMap;

    invoke-direct {v1}, Ljava/util/LinkedHashMap;-><init>()V

    check-cast v1, Ljava/util/Map;

    .line 336
    new-instance v2, Lo/setNoDataTextTypeface$write;

    const-string v14, "key"

    const-string v15, "TEXT"

    const/16 v16, 0x1

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/16 v19, 0x1

    move-object v13, v2

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "key"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 338
    new-instance v2, Lo/setNoDataTextTypeface$write;

    const-string v14, "long_value"

    const-string v15, "INTEGER"

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v13, v2

    invoke-direct/range {v13 .. v19}, Lo/setNoDataTextTypeface$write;-><init>(Ljava/lang/String;Ljava/lang/String;ZILjava/lang/String;I)V

    const-string v3, "long_value"

    invoke-interface {v1, v3, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    .line 340
    new-instance v2, Ljava/util/LinkedHashSet;

    invoke-direct {v2}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v2, Ljava/util/Set;

    .line 341
    new-instance v3, Ljava/util/LinkedHashSet;

    invoke-direct {v3}, Ljava/util/LinkedHashSet;-><init>()V

    check-cast v3, Ljava/util/Set;

    .line 342
    new-instance v4, Lo/setNoDataTextTypeface;

    const-string v6, "Preference"

    invoke-direct {v4, v6, v1, v2, v3}, Lo/setNoDataTextTypeface;-><init>(Ljava/lang/String;Ljava/util/Map;Ljava/util/Set;Ljava/util/Set;)V

    .line 344
    sget-object v1, Lo/setNoDataTextTypeface;->read:Lo/setNoDataTextTypeface$read;

    invoke-static {v0, v6}, Lo/setNoDataTextTypeface$read;->write(Lo/setDrawHoleEnabled;Ljava/lang/String;)Lo/setNoDataTextTypeface;

    move-result-object v0

    .line 345
    invoke-virtual {v4, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5f0

    .line 346
    new-instance v1, Lo/ValueClassUnboxSerializer$IconCompatParcelizer;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "Preference(androidx.work.impl.model.Preference).\n Expected:\n"

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {v1, v12, v0}, Lo/ValueClassUnboxSerializer$IconCompatParcelizer;-><init>(ZLjava/lang/String;)V

    return-object v1

    .line 354
    :cond_5f0
    new-instance v0, Lo/ValueClassUnboxSerializer$IconCompatParcelizer;

    const/4 v1, 0x1

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lo/ValueClassUnboxSerializer$IconCompatParcelizer;-><init>(ZLjava/lang/String;)V

    return-object v0
.end method

.method public final AudioAttributesImplApi26Parcelizer(Lo/setDrawHoleEnabled;)V
    .registers 2

    const-string p0, ""

    invoke-static {p1, p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 116
    invoke-static {p1}, Lo/setExtraBottomOffset;->write(Lo/setDrawHoleEnabled;)V

    return-void
.end method

.method public final IconCompatParcelizer(Lo/setDrawHoleEnabled;)V
    .registers 2

    .line 355
    const-string p0, ""

    invoke-static {p1, p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    return-void
.end method

.method public final RemoteActionCompatParcelizer(Lo/setDrawHoleEnabled;)V
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 111
    const-string v0, "PRAGMA foreign_keys = ON"

    invoke-static {p1, v0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 112
    iget-object p0, p0, Landroidx/work/impl/WorkDatabase_Impl$write;->write:Landroidx/work/impl/WorkDatabase_Impl;

    invoke-static {p0, p1}, Landroidx/work/impl/WorkDatabase_Impl;->AudioAttributesCompatParcelizer(Landroidx/work/impl/WorkDatabase_Impl;Lo/setDrawHoleEnabled;)V

    return-void
.end method

.method public final read(Lo/setDrawHoleEnabled;)V
    .registers 2

    const-string p0, ""

    invoke-static {p1, p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 98
    const-string p0, "DROP TABLE IF EXISTS `Dependency`"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 99
    const-string p0, "DROP TABLE IF EXISTS `WorkSpec`"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 100
    const-string p0, "DROP TABLE IF EXISTS `WorkTag`"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 101
    const-string p0, "DROP TABLE IF EXISTS `SystemIdInfo`"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 102
    const-string p0, "DROP TABLE IF EXISTS `WorkName`"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 103
    const-string p0, "DROP TABLE IF EXISTS `WorkProgress`"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 104
    const-string p0, "DROP TABLE IF EXISTS `Preference`"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    return-void
.end method

.method public final write(Lo/setDrawHoleEnabled;)V
    .registers 2

    const-string p0, ""

    invoke-static {p1, p0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 80
    const-string p0, "CREATE TABLE IF NOT EXISTS `Dependency` (`work_spec_id` TEXT NOT NULL, `prerequisite_id` TEXT NOT NULL, PRIMARY KEY(`work_spec_id`, `prerequisite_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE , FOREIGN KEY(`prerequisite_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 81
    const-string p0, "CREATE INDEX IF NOT EXISTS `index_Dependency_work_spec_id` ON `Dependency` (`work_spec_id`)"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 82
    const-string p0, "CREATE INDEX IF NOT EXISTS `index_Dependency_prerequisite_id` ON `Dependency` (`prerequisite_id`)"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 83
    const-string p0, "CREATE TABLE IF NOT EXISTS `WorkSpec` (`id` TEXT NOT NULL, `state` INTEGER NOT NULL, `worker_class_name` TEXT NOT NULL, `input_merger_class_name` TEXT NOT NULL, `input` BLOB NOT NULL, `output` BLOB NOT NULL, `initial_delay` INTEGER NOT NULL, `interval_duration` INTEGER NOT NULL, `flex_duration` INTEGER NOT NULL, `run_attempt_count` INTEGER NOT NULL, `backoff_policy` INTEGER NOT NULL, `backoff_delay_duration` INTEGER NOT NULL, `last_enqueue_time` INTEGER NOT NULL DEFAULT -1, `minimum_retention_duration` INTEGER NOT NULL, `schedule_requested_at` INTEGER NOT NULL, `run_in_foreground` INTEGER NOT NULL, `out_of_quota_policy` INTEGER NOT NULL, `period_count` INTEGER NOT NULL DEFAULT 0, `generation` INTEGER NOT NULL DEFAULT 0, `next_schedule_time_override` INTEGER NOT NULL DEFAULT 9223372036854775807, `next_schedule_time_override_generation` INTEGER NOT NULL DEFAULT 0, `stop_reason` INTEGER NOT NULL DEFAULT -256, `trace_tag` TEXT, `backoff_on_system_interruptions` INTEGER, `required_network_type` INTEGER NOT NULL, `required_network_request` BLOB NOT NULL DEFAULT x\'\', `requires_charging` INTEGER NOT NULL, `requires_device_idle` INTEGER NOT NULL, `requires_battery_not_low` INTEGER NOT NULL, `requires_storage_not_low` INTEGER NOT NULL, `trigger_content_update_delay` INTEGER NOT NULL, `trigger_max_content_delay` INTEGER NOT NULL, `content_uri_triggers` BLOB NOT NULL, PRIMARY KEY(`id`))"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 84
    const-string p0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_schedule_requested_at` ON `WorkSpec` (`schedule_requested_at`)"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 85
    const-string p0, "CREATE INDEX IF NOT EXISTS `index_WorkSpec_last_enqueue_time` ON `WorkSpec` (`last_enqueue_time`)"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 86
    const-string p0, "CREATE TABLE IF NOT EXISTS `WorkTag` (`tag` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`tag`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 87
    const-string p0, "CREATE INDEX IF NOT EXISTS `index_WorkTag_work_spec_id` ON `WorkTag` (`work_spec_id`)"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 88
    const-string p0, "CREATE TABLE IF NOT EXISTS `SystemIdInfo` (`work_spec_id` TEXT NOT NULL, `generation` INTEGER NOT NULL DEFAULT 0, `system_id` INTEGER NOT NULL, PRIMARY KEY(`work_spec_id`, `generation`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 89
    const-string p0, "CREATE TABLE IF NOT EXISTS `WorkName` (`name` TEXT NOT NULL, `work_spec_id` TEXT NOT NULL, PRIMARY KEY(`name`, `work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 90
    const-string p0, "CREATE INDEX IF NOT EXISTS `index_WorkName_work_spec_id` ON `WorkName` (`work_spec_id`)"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 91
    const-string p0, "CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 92
    const-string p0, "CREATE TABLE IF NOT EXISTS `Preference` (`key` TEXT NOT NULL, `long_value` INTEGER, PRIMARY KEY(`key`))"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 93
    const-string p0, "CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    .line 94
    const-string p0, "INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, \'08b926448d86528e697981ddd30459f7\')"

    invoke-static {p1, p0}, Lo/setDrawCenterText;->read(Lo/setDrawHoleEnabled;Ljava/lang/String;)V

    return-void
.end method

###### Class kotlin.clearMediaItems (o.clearMediaItems)
.class public final synthetic Lo/clearMediaItems;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# instance fields
.field public final synthetic RemoteActionCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/clearMediaItems;->RemoteActionCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    .line 0
    iget-object p0, p0, Lo/clearMediaItems;->RemoteActionCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;

    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->RemoteActionCompatParcelizer(Landroidx/work/impl/WorkDatabase_Impl;)Lo/C;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.getBufferedPercentage (o.getBufferedPercentage)
.class public final synthetic Lo/getBufferedPercentage;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# instance fields
.field public final synthetic read:Landroidx/work/impl/WorkDatabase_Impl;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/getBufferedPercentage;->read:Landroidx/work/impl/WorkDatabase_Impl;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    .line 0
    iget-object p0, p0, Lo/getBufferedPercentage;->read:Landroidx/work/impl/WorkDatabase_Impl;

    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->AudioAttributesImplBaseParcelizer(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CCryptoMode;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.getCurrentLiveOffset (o.getCurrentLiveOffset)
.class public final synthetic Lo/getCurrentLiveOffset;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# instance fields
.field public final synthetic IconCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/getCurrentLiveOffset;->IconCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    .line 0
    iget-object p0, p0, Lo/getCurrentLiveOffset;->IconCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;

    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->AudioAttributesCompatParcelizer(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CWakeMode;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.getCurrentManifest (o.getCurrentManifest)
.class public final synthetic Lo/getCurrentManifest;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# instance fields
.field public final synthetic RemoteActionCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/getCurrentManifest;->RemoteActionCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    .line 0
    iget-object p0, p0, Lo/getCurrentManifest;->RemoteActionCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;

    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->write(Landroidx/work/impl/WorkDatabase_Impl;)Lo/setBufferDurationsMs;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.getCurrentMediaItem (o.getCurrentMediaItem)
.class public final synthetic Lo/getCurrentMediaItem;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# instance fields
.field public final synthetic IconCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/getCurrentMediaItem;->IconCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    .line 0
    iget-object p0, p0, Lo/getCurrentMediaItem;->IconCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;

    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->MediaBrowserCompatCustomActionResultReceiver(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CSelectionReason;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.getMediaItemAt (o.getMediaItemAt)
.class public final synthetic Lo/getMediaItemAt;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# instance fields
.field public final synthetic IconCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/getMediaItemAt;->IconCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    .line 0
    iget-object p0, p0, Lo/getMediaItemAt;->IconCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;

    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->IconCompatParcelizer(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CFormatSupport;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.getMediaItemCount (o.getMediaItemCount)
.class public final synthetic Lo/getMediaItemCount;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# instance fields
.field public final synthetic AudioAttributesCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/getMediaItemCount;->AudioAttributesCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    .line 0
    iget-object p0, p0, Lo/getMediaItemCount;->AudioAttributesCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;

    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->read(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CAudioAllowedCapturePolicy;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.getNextMediaItemIndex (o.getNextMediaItemIndex)
.class public final synthetic Lo/getNextMediaItemIndex;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getCreatedOnDateMs;


# instance fields
.field public final synthetic IconCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;


# direct methods
.method public synthetic constructor <init>(Landroidx/work/impl/WorkDatabase_Impl;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/getNextMediaItemIndex;->IconCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;

    return-void
.end method


# virtual methods
.method public final invoke()Ljava/lang/Object;
    .registers 1

    .line 0
    iget-object p0, p0, Lo/getNextMediaItemIndex;->IconCompatParcelizer:Landroidx/work/impl/WorkDatabase_Impl;

    invoke-static {p0}, Landroidx/work/impl/WorkDatabase_Impl;->MediaBrowserCompatItemReceiver(Landroidx/work/impl/WorkDatabase_Impl;)Lo/CColorSpace;

    move-result-object p0

    return-object p0
.end method
