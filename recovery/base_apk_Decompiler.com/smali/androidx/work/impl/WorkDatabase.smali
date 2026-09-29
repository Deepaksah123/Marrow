###### Class androidx.work.impl.WorkDatabase (androidx.work.impl.WorkDatabase)
.class public abstract Landroidx/work/impl/WorkDatabase;
.super Lo/ValueClassSerializerStaticJsonValue;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Landroidx/work/impl/WorkDatabase$RemoteActionCompatParcelizer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u0008&\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H&\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H&\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH&\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u000f\u0010\u000e\u001a\u00020\rH&\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H&\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H&\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H&\u00a2\u0006\u0004\u0008\u0017\u0010\u0018"
    }
    d2 = {
        "Landroidx/work/impl/WorkDatabase;",
        "Lo/ValueClassSerializerStaticJsonValue;",
        "<init>",
        "()V",
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
        "RemoteActionCompatParcelizer"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final RemoteActionCompatParcelizer:Landroidx/work/impl/WorkDatabase$RemoteActionCompatParcelizer;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    .line 87
    new-instance v0, Landroidx/work/impl/WorkDatabase$RemoteActionCompatParcelizer;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Landroidx/work/impl/WorkDatabase$RemoteActionCompatParcelizer;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Landroidx/work/impl/WorkDatabase;->RemoteActionCompatParcelizer:Landroidx/work/impl/WorkDatabase$RemoteActionCompatParcelizer;

    return-void
.end method

.method public constructor <init>()V
    .registers 1

    .line 86
    invoke-direct {p0}, Lo/ValueClassSerializerStaticJsonValue;-><init>()V

    return-void
.end method


# virtual methods
.method public abstract MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Lo/fromBundle;
.end method

.method public abstract onFastForward()Lo/CRoleFlags;
.end method

.method public abstract onMediaButtonEvent()Lo/CVolumeFlags;
.end method

.method public abstract onPause()Lo/CColorRange;
.end method

.method public abstract onPlay()Lo/CAudioFlags;
.end method

.method public abstract onPlayFromMediaId()Lo/CStreamType;
.end method

.method public abstract onPrepareFromMediaId()Lo/shouldStartPlayback;
.end method

###### Class androidx.work.impl.WorkDatabase.Companion (androidx.work.impl.WorkDatabase$RemoteActionCompatParcelizer)
.class public final Landroidx/work/impl/WorkDatabase$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/work/impl/WorkDatabase;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RemoteActionCompatParcelizer"
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J/\u0010\r\u001a\u00020\u000c2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e"
    }
    d2 = {
        "Landroidx/work/impl/WorkDatabase$RemoteActionCompatParcelizer;",
        "",
        "<init>",
        "()V",
        "Landroid/content/Context;",
        "p0",
        "Ljava/util/concurrent/Executor;",
        "p1",
        "Lo/setInstallerPackageName;",
        "p2",
        "",
        "p3",
        "Landroidx/work/impl/WorkDatabase;",
        "IconCompatParcelizer",
        "(Landroid/content/Context;Ljava/util/concurrent/Executor;Lo/setInstallerPackageName;Z)Landroidx/work/impl/WorkDatabase;"
    }
    k = 0x1
    mv = {
        0x2,
        0x1,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 111
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 167
    invoke-direct {p0}, Landroidx/work/impl/WorkDatabase$RemoteActionCompatParcelizer;-><init>()V

    return-void
.end method

.method public static synthetic AudioAttributesCompatParcelizer(Landroid/content/Context;Lo/setEntryLabelTextSize$write;)Lo/setEntryLabelTextSize;
    .registers 2

    .line 166
    invoke-static {p0, p1}, Landroidx/work/impl/WorkDatabase$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/content/Context;Lo/setEntryLabelTextSize$write;)Lo/setEntryLabelTextSize;

    move-result-object p0

    return-object p0
.end method

.method public static IconCompatParcelizer(Landroid/content/Context;Ljava/util/concurrent/Executor;Lo/setInstallerPackageName;Z)Landroidx/work/impl/WorkDatabase;
    .registers 8
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p3, :cond_18

    .line 131
    const-class p3, Landroidx/work/impl/WorkDatabase;

    invoke-static {p0, p3}, Lo/ValueClassSerializerCompanion;->RemoteActionCompatParcelizer(Landroid/content/Context;Ljava/lang/Class;)Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p3

    .line 132
    invoke-virtual {p3}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->read()Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p3

    goto :goto_29

    .line 134
    :cond_18
    const-class p3, Landroidx/work/impl/WorkDatabase;

    const-string v0, "androidx.work.workdb"

    invoke-static {p0, p3, v0}, Lo/ValueClassSerializerCompanion;->write(Landroid/content/Context;Ljava/lang/Class;Ljava/lang/String;)Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p3

    .line 135
    new-instance v0, Lo/AudioFocusManagerAudioFocusListenerExternalSyntheticLambda0;

    invoke-direct {v0, p0}, Lo/AudioFocusManagerAudioFocusListenerExternalSyntheticLambda0;-><init>(Landroid/content/Context;)V

    invoke-virtual {p3, v0}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->read(Lo/setEntryLabelTextSize$AudioAttributesCompatParcelizer;)Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p3

    .line 147
    :goto_29
    invoke-virtual {p3, p1}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Ljava/util/concurrent/Executor;)Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p1

    .line 148
    new-instance p3, Lo/getTimelineByChildIndex;

    invoke-direct {p3, p2}, Lo/getTimelineByChildIndex;-><init>(Lo/setInstallerPackageName;)V

    check-cast p3, Lo/ValueClassSerializerStaticJsonValue$read;

    invoke-virtual {p1, p3}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Lo/ValueClassSerializerStaticJsonValue$read;)Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p1

    const/4 p2, 0x1

    .line 149
    new-array p3, p2, [Lo/setVisibleYRange;

    sget-object v0, Lo/abandonAudioFocusIfHeld;->INSTANCE:Lo/abandonAudioFocusIfHeld;

    const/4 v1, 0x0

    aput-object v0, p3, v1

    invoke-virtual {p1, p3}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->read([Lo/setVisibleYRange;)Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p1

    .line 150
    new-array p3, p2, [Lo/setVisibleYRange;

    new-instance v0, Lo/getVolumeMultiplier;

    const/4 v2, 0x2

    const/4 v3, 0x3

    invoke-direct {v0, p0, v2, v3}, Lo/getVolumeMultiplier;-><init>(Landroid/content/Context;II)V

    aput-object v0, p3, v1

    invoke-virtual {p1, p3}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->read([Lo/setVisibleYRange;)Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p1

    .line 151
    new-array p3, p2, [Lo/setVisibleYRange;

    sget-object v0, Lo/convertAudioAttributesToFocusGain;->INSTANCE:Lo/convertAudioAttributesToFocusGain;

    aput-object v0, p3, v1

    invoke-virtual {p1, p3}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->read([Lo/setVisibleYRange;)Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p1

    .line 152
    new-array p3, p2, [Lo/setVisibleYRange;

    sget-object v0, Lo/abandonAudioFocusV26;->INSTANCE:Lo/abandonAudioFocusV26;

    aput-object v0, p3, v1

    invoke-virtual {p1, p3}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->read([Lo/setVisibleYRange;)Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p1

    .line 153
    new-array p3, p2, [Lo/setVisibleYRange;

    new-instance v0, Lo/getVolumeMultiplier;

    const/4 v2, 0x5

    const/4 v3, 0x6

    invoke-direct {v0, p0, v2, v3}, Lo/getVolumeMultiplier;-><init>(Landroid/content/Context;II)V

    aput-object v0, p3, v1

    invoke-virtual {p1, p3}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->read([Lo/setVisibleYRange;)Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p1

    .line 154
    new-array p3, p2, [Lo/setVisibleYRange;

    sget-object v0, Lo/abandonAudioFocusDefault;->INSTANCE:Lo/abandonAudioFocusDefault;

    aput-object v0, p3, v1

    invoke-virtual {p1, p3}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->read([Lo/setVisibleYRange;)Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p1

    .line 155
    new-array p3, p2, [Lo/setVisibleYRange;

    sget-object v0, Lo/AudioFocusManager;->INSTANCE:Lo/AudioFocusManager;

    aput-object v0, p3, v1

    invoke-virtual {p1, p3}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->read([Lo/setVisibleYRange;)Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p1

    .line 156
    new-array p3, p2, [Lo/setVisibleYRange;

    sget-object v0, Lo/requestAudioFocusV26;->INSTANCE:Lo/requestAudioFocusV26;

    aput-object v0, p3, v1

    invoke-virtual {p1, p3}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->read([Lo/setVisibleYRange;)Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p1

    .line 157
    new-array p3, p2, [Lo/setVisibleYRange;

    new-instance v0, Lo/isCommandAvailable;

    invoke-direct {v0, p0}, Lo/isCommandAvailable;-><init>(Landroid/content/Context;)V

    aput-object v0, p3, v1

    invoke-virtual {p1, p3}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->read([Lo/setVisibleYRange;)Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p1

    .line 158
    new-array p3, p2, [Lo/setVisibleYRange;

    new-instance v0, Lo/getVolumeMultiplier;

    const/16 v2, 0xa

    const/16 v3, 0xb

    invoke-direct {v0, p0, v2, v3}, Lo/getVolumeMultiplier;-><init>(Landroid/content/Context;II)V

    aput-object v0, p3, v1

    invoke-virtual {p1, p3}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->read([Lo/setVisibleYRange;)Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p1

    .line 159
    new-array p3, p2, [Lo/setVisibleYRange;

    sget-object v0, Lo/AudioBecomingNoisyManager;->INSTANCE:Lo/AudioBecomingNoisyManager;

    aput-object v0, p3, v1

    invoke-virtual {p1, p3}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->read([Lo/setVisibleYRange;)Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p1

    .line 160
    new-array p3, p2, [Lo/setVisibleYRange;

    sget-object v0, Lo/AudioBecomingNoisyManagerEventListener;->INSTANCE:Lo/AudioBecomingNoisyManagerEventListener;

    aput-object v0, p3, v1

    invoke-virtual {p1, p3}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->read([Lo/setVisibleYRange;)Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p1

    .line 161
    new-array p3, p2, [Lo/setVisibleYRange;

    sget-object v0, Lo/onAudioBecomingNoisy;->INSTANCE:Lo/onAudioBecomingNoisy;

    aput-object v0, p3, v1

    invoke-virtual {p1, p3}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->read([Lo/setVisibleYRange;)Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p1

    .line 162
    new-array p3, p2, [Lo/setVisibleYRange;

    sget-object v0, Lo/getWindow;->INSTANCE:Lo/getWindow;

    aput-object v0, p3, v1

    invoke-virtual {p1, p3}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->read([Lo/setVisibleYRange;)Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p1

    .line 163
    new-array p2, p2, [Lo/setVisibleYRange;

    new-instance p3, Lo/getVolumeMultiplier;

    const/16 v0, 0x15

    const/16 v2, 0x16

    invoke-direct {p3, p0, v0, v2}, Lo/getVolumeMultiplier;-><init>(Landroid/content/Context;II)V

    aput-object p3, p2, v1

    invoke-virtual {p1, p2}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->read([Lo/setVisibleYRange;)Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p0

    .line 164
    invoke-virtual {p0}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer()Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;

    move-result-object p0

    .line 165
    invoke-virtual {p0}, Lo/ValueClassSerializerStaticJsonValue$RemoteActionCompatParcelizer;->write()Lo/ValueClassSerializerStaticJsonValue;

    move-result-object p0

    check-cast p0, Landroidx/work/impl/WorkDatabase;

    return-object p0
.end method

.method private static final RemoteActionCompatParcelizer(Landroid/content/Context;Lo/setEntryLabelTextSize$write;)Lo/setEntryLabelTextSize;
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 137
    sget-object v0, Lo/setEntryLabelTextSize$write;->RemoteActionCompatParcelizer:Lo/setEntryLabelTextSize$write$RemoteActionCompatParcelizer;

    invoke-static {p0}, Lo/setEntryLabelTextSize$write$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/content/Context;)Lo/setEntryLabelTextSize$write$IconCompatParcelizer;

    move-result-object p0

    .line 139
    iget-object v0, p1, Lo/setEntryLabelTextSize$write;->write:Ljava/lang/String;

    invoke-virtual {p0, v0}, Lo/setEntryLabelTextSize$write$IconCompatParcelizer;->write(Ljava/lang/String;)Lo/setEntryLabelTextSize$write$IconCompatParcelizer;

    move-result-object v0

    .line 140
    iget-object p1, p1, Lo/setEntryLabelTextSize$write;->AudioAttributesCompatParcelizer:Lo/setEntryLabelTextSize$RemoteActionCompatParcelizer;

    invoke-virtual {v0, p1}, Lo/setEntryLabelTextSize$write$IconCompatParcelizer;->RemoteActionCompatParcelizer(Lo/setEntryLabelTextSize$RemoteActionCompatParcelizer;)Lo/setEntryLabelTextSize$write$IconCompatParcelizer;

    move-result-object p1

    .line 141
    invoke-virtual {p1}, Lo/setEntryLabelTextSize$write$IconCompatParcelizer;->AudioAttributesCompatParcelizer()Lo/setEntryLabelTextSize$write$IconCompatParcelizer;

    move-result-object p1

    .line 142
    invoke-virtual {p1}, Lo/setEntryLabelTextSize$write$IconCompatParcelizer;->read()Lo/setEntryLabelTextSize$write$IconCompatParcelizer;

    .line 143
    new-instance p1, Lo/setRotationAngle;

    invoke-direct {p1}, Lo/setRotationAngle;-><init>()V

    invoke-virtual {p0}, Lo/setEntryLabelTextSize$write$IconCompatParcelizer;->IconCompatParcelizer()Lo/setEntryLabelTextSize$write;

    move-result-object p0

    invoke-virtual {p1, p0}, Lo/setRotationAngle;->AudioAttributesCompatParcelizer(Lo/setEntryLabelTextSize$write;)Lo/setEntryLabelTextSize;

    move-result-object p0

    return-object p0
.end method

###### Class kotlin.AudioFocusManagerAudioFocusListenerExternalSyntheticLambda0 (o.AudioFocusManagerAudioFocusListenerExternalSyntheticLambda0)
.class public final synthetic Lo/AudioFocusManagerAudioFocusListenerExternalSyntheticLambda0;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/setEntryLabelTextSize$AudioAttributesCompatParcelizer;


# instance fields
.field public final synthetic write:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;)V
    .registers 2

    .line 0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lo/AudioFocusManagerAudioFocusListenerExternalSyntheticLambda0;->write:Landroid/content/Context;

    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Lo/setEntryLabelTextSize$write;)Lo/setEntryLabelTextSize;
    .registers 2

    .line 0
    iget-object p0, p0, Lo/AudioFocusManagerAudioFocusListenerExternalSyntheticLambda0;->write:Landroid/content/Context;

    invoke-static {p0, p1}, Landroidx/work/impl/WorkDatabase$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/content/Context;Lo/setEntryLabelTextSize$write;)Lo/setEntryLabelTextSize;

    move-result-object p0

    return-object p0
.end method
