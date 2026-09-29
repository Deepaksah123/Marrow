###### Class androidx.work.WorkerParameters (androidx.work.WorkerParameters)
.class public final Landroidx/work/WorkerParameters;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/work/WorkerParameters$RemoteActionCompatParcelizer;
    }
.end annotation


# instance fields
.field private AudioAttributesCompatParcelizer:Ljava/util/concurrent/Executor;

.field private AudioAttributesImplApi21Parcelizer:Lo/s;

.field private AudioAttributesImplApi26Parcelizer:Landroidx/work/WorkerParameters$RemoteActionCompatParcelizer;

.field private AudioAttributesImplBaseParcelizer:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private IconCompatParcelizer:Lo/e1;

.field private MediaBrowserCompatCustomActionResultReceiver:Lo/setEnableDecoderFallback;

.field private MediaBrowserCompatItemReceiver:I

.field private MediaBrowserCompatSearchResultReceiver:Lo/getNextWindowIndex;

.field private MediaMetadataCompat:Lo/CurrentQuery;

.field private RemoteActionCompatParcelizer:I

.field private read:Lo/onUpgrade;

.field private write:Ljava/util/UUID;


# direct methods
.method public constructor <init>(Ljava/util/UUID;Lo/e1;Ljava/util/Collection;Landroidx/work/WorkerParameters$RemoteActionCompatParcelizer;IILjava/util/concurrent/Executor;Lo/CurrentQuery;Lo/setEnableDecoderFallback;Lo/getNextWindowIndex;Lo/s;Lo/onUpgrade;)V
    .registers 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/UUID;",
            "Lo/e1;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Landroidx/work/WorkerParameters$RemoteActionCompatParcelizer;",
            "II",
            "Ljava/util/concurrent/Executor;",
            "Lo/CurrentQuery;",
            "Lo/setEnableDecoderFallback;",
            "Lo/getNextWindowIndex;",
            "Lo/s;",
            "Lo/onUpgrade;",
            ")V"
        }
    .end annotation

    .line 74
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 75
    iput-object p1, p0, Landroidx/work/WorkerParameters;->write:Ljava/util/UUID;

    .line 76
    iput-object p2, p0, Landroidx/work/WorkerParameters;->IconCompatParcelizer:Lo/e1;

    .line 77
    new-instance p1, Ljava/util/HashSet;

    invoke-direct {p1, p3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    iput-object p1, p0, Landroidx/work/WorkerParameters;->AudioAttributesImplBaseParcelizer:Ljava/util/Set;

    .line 78
    iput-object p4, p0, Landroidx/work/WorkerParameters;->AudioAttributesImplApi26Parcelizer:Landroidx/work/WorkerParameters$RemoteActionCompatParcelizer;

    .line 79
    iput p5, p0, Landroidx/work/WorkerParameters;->MediaBrowserCompatItemReceiver:I

    .line 80
    iput p6, p0, Landroidx/work/WorkerParameters;->RemoteActionCompatParcelizer:I

    .line 81
    iput-object p7, p0, Landroidx/work/WorkerParameters;->AudioAttributesCompatParcelizer:Ljava/util/concurrent/Executor;

    .line 82
    iput-object p8, p0, Landroidx/work/WorkerParameters;->MediaMetadataCompat:Lo/CurrentQuery;

    .line 83
    iput-object p9, p0, Landroidx/work/WorkerParameters;->MediaBrowserCompatCustomActionResultReceiver:Lo/setEnableDecoderFallback;

    .line 84
    iput-object p10, p0, Landroidx/work/WorkerParameters;->MediaBrowserCompatSearchResultReceiver:Lo/getNextWindowIndex;

    .line 85
    iput-object p11, p0, Landroidx/work/WorkerParameters;->AudioAttributesImplApi21Parcelizer:Lo/s;

    .line 86
    iput-object p12, p0, Landroidx/work/WorkerParameters;->read:Lo/onUpgrade;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Ljava/util/concurrent/Executor;
    .registers 1

    .line 187
    iget-object p0, p0, Landroidx/work/WorkerParameters;->AudioAttributesCompatParcelizer:Ljava/util/concurrent/Executor;

    return-object p0
.end method

.method public final IconCompatParcelizer()Lo/CurrentQuery;
    .registers 1

    .line 194
    iget-object p0, p0, Landroidx/work/WorkerParameters;->MediaMetadataCompat:Lo/CurrentQuery;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer()Lo/onUpgrade;
    .registers 1

    .line 222
    iget-object p0, p0, Landroidx/work/WorkerParameters;->read:Lo/onUpgrade;

    return-object p0
.end method

.method public final read()Ljava/util/UUID;
    .registers 1

    .line 95
    iget-object p0, p0, Landroidx/work/WorkerParameters;->write:Ljava/util/UUID;

    return-object p0
.end method

.method public final write()Lo/e1;
    .registers 1

    .line 106
    iget-object p0, p0, Landroidx/work/WorkerParameters;->IconCompatParcelizer:Lo/e1;

    return-object p0
.end method

###### Class androidx.work.WorkerParameters.RemoteActionCompatParcelizer (androidx.work.WorkerParameters$RemoteActionCompatParcelizer)
.class public final Landroidx/work/WorkerParameters$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/WorkerParameters;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "RemoteActionCompatParcelizer"
.end annotation


# instance fields
.field public AudioAttributesCompatParcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation
.end field

.field public RemoteActionCompatParcelizer:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field public write:Landroid/net/Network;


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 237
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 238
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/WorkerParameters$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:Ljava/util/List;

    .line 239
    invoke-static {}, Ljava/util/Collections;->emptyList()Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Landroidx/work/WorkerParameters$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:Ljava/util/List;

    return-void
.end method
