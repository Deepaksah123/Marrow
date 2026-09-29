###### Class com.clevertap.android.sdk.pushnotification.work.CTFlushPushImpressionsWork (com.clevertap.android.sdk.pushnotification.work.CTFlushPushImpressionsWork)
.class public final Lcom/clevertap/android/sdk/pushnotification/work/CTFlushPushImpressionsWork;
.super Landroidx/work/Worker;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\u0008H\u0016\u00a2\u0006\u0004\u0008\t\u0010\nJ\u000f\u0010\u000c\u001a\u00020\u000bH\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0014\u0010\t\u001a\u00020\u000e8\u0006X\u0086D\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u000f"
    }
    d2 = {
        "Lcom/clevertap/android/sdk/pushnotification/work/CTFlushPushImpressionsWork;",
        "Landroidx/work/Worker;",
        "Landroid/content/Context;",
        "p0",
        "Landroidx/work/WorkerParameters;",
        "p1",
        "<init>",
        "(Landroid/content/Context;Landroidx/work/WorkerParameters;)V",
        "Lo/j$RemoteActionCompatParcelizer;",
        "write",
        "()Lo/j$RemoteActionCompatParcelizer;",
        "",
        "AudioAttributesCompatParcelizer",
        "()Z",
        "",
        "Ljava/lang/String;"
    }
    k = 0x1
    mv = {
        0x2,
        0x0,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final write:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .registers 4

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 16
    invoke-direct {p0, p1, p2}, Landroidx/work/Worker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    .line 18
    const-string p1, "CTFlushPushImpressionsWork"

    iput-object p1, p0, Lcom/clevertap/android/sdk/pushnotification/work/CTFlushPushImpressionsWork;->write:Ljava/lang/String;

    return-void
.end method

.method private final AudioAttributesCompatParcelizer()Z
    .registers 2

    .line 49
    invoke-virtual {p0}, Lo/j;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result v0

    if-eqz v0, :cond_9

    .line 50
    invoke-static {}, Lo/RendererWakeupListener;->AudioAttributesImplApi21Parcelizer()V

    .line 52
    :cond_9
    invoke-virtual {p0}, Lo/j;->MediaBrowserCompatCustomActionResultReceiver()Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final write()Lo/j$RemoteActionCompatParcelizer;
    .registers 7

    .line 22
    invoke-static {}, Lo/RendererWakeupListener;->AudioAttributesImplApi21Parcelizer()V

    .line 26
    invoke-static {}, Lo/RendererWakeupListener;->AudioAttributesImplApi21Parcelizer()V

    .line 28
    invoke-virtual {p0}, Lo/j;->IconCompatParcelizer()Landroid/content/Context;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 29
    invoke-static {v0}, Lo/PlayerTimelineChangeReason;->RemoteActionCompatParcelizer(Landroid/content/Context;)Ljava/util/ArrayList;

    move-result-object v2

    invoke-static {v2, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v2, Ljava/lang/Iterable;

    .line 30
    invoke-static {v2}, Lo/IntermediateLoginResponseBody;->AudioAttributesImplApi26Parcelizer(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    .line 56
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    check-cast v3, Ljava/util/Collection;

    .line 57
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_29
    :goto_29
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_48

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lo/PlayerTimelineChangeReason;

    .line 32
    invoke-virtual {v5}, Lo/PlayerTimelineChangeReason;->MediaBrowserCompatCustomActionResultReceiver()Lo/PlaylistTimeline;

    move-result-object v5

    invoke-virtual {v5}, Lo/PlaylistTimeline;->AudioAttributesImplApi26Parcelizer()Lcom/clevertap/android/sdk/CleverTapInstanceConfig;

    move-result-object v5

    invoke-virtual {v5}, Lcom/clevertap/android/sdk/CleverTapInstanceConfig;->MediaMetadataCompat()Z

    move-result v5

    if-nez v5, :cond_29

    .line 57
    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_29

    .line 58
    :cond_48
    check-cast v3, Ljava/util/List;

    .line 56
    check-cast v3, Ljava/lang/Iterable;

    .line 59
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_50
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_78

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lo/PlayerTimelineChangeReason;

    .line 35
    invoke-direct {p0}, Lcom/clevertap/android/sdk/pushnotification/work/CTFlushPushImpressionsWork;->AudioAttributesCompatParcelizer()Z

    move-result v4

    if-eqz v4, :cond_6a

    .line 36
    invoke-static {}, Lo/j$RemoteActionCompatParcelizer;->read()Lo/j$RemoteActionCompatParcelizer;

    move-result-object p0

    invoke-static {p0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    .line 39
    :cond_6a
    invoke-virtual {v3}, Lo/PlayerTimelineChangeReason;->AudioAttributesImplApi26Parcelizer()Ljava/lang/String;

    invoke-static {}, Lo/RendererWakeupListener;->AudioAttributesImplApi21Parcelizer()V

    .line 40
    iget-object v4, p0, Lcom/clevertap/android/sdk/pushnotification/work/CTFlushPushImpressionsWork;->write:Ljava/lang/String;

    const-string v5, "PI_WM"

    invoke-static {v3, v4, v5, v0}, Lo/PlayerPlaybackSuppressionReason;->write(Lo/PlayerTimelineChangeReason;Ljava/lang/String;Ljava/lang/String;Landroid/content/Context;)V

    goto :goto_50

    .line 44
    :cond_78
    invoke-static {}, Lo/RendererWakeupListener;->AudioAttributesImplApi21Parcelizer()V

    .line 45
    invoke-static {}, Lo/j$RemoteActionCompatParcelizer;->read()Lo/j$RemoteActionCompatParcelizer;

    move-result-object p0

    invoke-static {p0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method
