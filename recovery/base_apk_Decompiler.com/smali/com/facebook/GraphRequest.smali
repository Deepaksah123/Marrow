###### Class com.facebook.GraphRequest (com.facebook.GraphRequest)
.class public final Lcom/facebook/GraphRequest;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;,
        Lcom/facebook/GraphRequest$write;,
        Lcom/facebook/GraphRequest$IconCompatParcelizer;,
        Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;,
        Lcom/facebook/GraphRequest$read;,
        Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;,
        Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\u0008\u0012\n\u0002\u0018\u0002\n\u0002\u0008\u0015\u0018\u0000 \u00132\u00020\u0001:\u0007(*\u0013)&E\u0016BQ\u0008\u0016\u0012\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u0008\u0012\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J\u001f\u0010\u0013\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0012H\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\r\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\r\u0010\u0019\u001a\u00020\u0018\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ+\u0010\u0013\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u001b2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u001d0\u001cH\u0002\u00a2\u0006\u0004\u0008\u0013\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000f2\u0006\u0010\u0003\u001a\u00020\u0012H\u0007\u00a2\u0006\u0004\u0008\u001f\u0010\u0011J\u000f\u0010 \u001a\u00020\u0004H\u0016\u00a2\u0006\u0004\u0008 \u0010!R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0007@\u0006X\u0086\u000c\u00a2\u0006\u000c\n\u0004\u0008\"\u0010#\u001a\u0004\u0008$\u0010%R\u0018\u0010(\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000c\u00a2\u0006\u0006\n\u0004\u0008&\u0010\'R\u0018\u0010*\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0087\u000c\u00a2\u0006\u0006\n\u0004\u0008)\u0010\'R\u0016\u0010&\u001a\u00020\u00128\u0006@\u0006X\u0087\u000c\u00a2\u0006\u0006\n\u0004\u0008(\u0010+R.\u0010)\u001a\u0004\u0018\u00010\n2\u0008\u0010\u0003\u001a\u0004\u0018\u00010\n8\u0007@GX\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008\u0019\u0010,\u001a\u0004\u0008-\u0010.\"\u0004\u0008(\u0010/R$\u0010\u0016\u001a\u0004\u0018\u0001008\u0007@\u0007X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u00081\u00102\u001a\u0004\u0008\"\u00103\"\u0004\u0008&\u00104R\u001e\u0010$\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\u000c\u00a2\u0006\u000c\n\u0004\u00085\u0010\'\u001a\u0004\u00085\u0010!R\u0016\u0010\"\u001a\u0004\u0018\u00010\u00048CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u00086\u0010!R.\u0010\u0019\u001a\u0004\u0018\u00010\u00082\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00088\u0007@GX\u0087\u000e\u00a2\u0006\u0012\n\u0004\u00087\u00108\u001a\u0004\u00089\u0010:\"\u0004\u0008)\u0010;R\u0018\u0010-\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008<\u0010\'R\"\u00101\u001a\u00020\u00068\u0007@\u0007X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u00089\u0010=\u001a\u0004\u0008<\u0010>\"\u0004\u0008&\u0010?R\u0011\u0010<\u001a\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\u0008@\u0010!R\u0016\u00107\u001a\u00020\u00128\u0002@\u0002X\u0083\u000e\u00a2\u0006\u0006\n\u0004\u0008A\u0010+R$\u00109\u001a\u0004\u0018\u00010\u00018\u0007@\u0007X\u0087\u000e\u00a2\u0006\u0012\n\u0004\u0008@\u0010B\u001a\u0004\u00087\u0010C\"\u0004\u0008\u0013\u0010DR\u0011\u00105\u001a\u00020\u00048G\u00a2\u0006\u0006\u001a\u0004\u00081\u0010!R\u001e\u0010\u001f\u001a\u0004\u0018\u00010\u00048\u0007@\u0006X\u0087\u000c\u00a2\u0006\u000c\n\u0004\u00086\u0010\'\u001a\u0004\u0008A\u0010!"
    }
    d2 = {
        "Lcom/facebook/GraphRequest;",
        "",
        "Lcom/facebook/AccessToken;",
        "p0",
        "",
        "p1",
        "Landroid/os/Bundle;",
        "p2",
        "Lo/lambdaonPlayWhenReadyChanged36;",
        "p3",
        "Lcom/facebook/GraphRequest$write;",
        "p4",
        "p5",
        "<init>",
        "(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lo/lambdaonPlayWhenReadyChanged36;Lcom/facebook/GraphRequest$write;Ljava/lang/String;)V",
        "",
        "MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver",
        "()V",
        "",
        "IconCompatParcelizer",
        "(Ljava/lang/String;Z)Ljava/lang/String;",
        "Lo/lambdaonPlayerError41;",
        "MediaBrowserCompatCustomActionResultReceiver",
        "()Lo/lambdaonPlayerError41;",
        "Lo/lambdaonPlaybackStateChanged35;",
        "AudioAttributesImplApi26Parcelizer",
        "()Lo/lambdaonPlaybackStateChanged35;",
        "Lorg/json/JSONArray;",
        "",
        "Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;",
        "(Lorg/json/JSONArray;Ljava/util/Map;)V",
        "onAddQueueItem",
        "toString",
        "()Ljava/lang/String;",
        "AudioAttributesImplApi21Parcelizer",
        "Lcom/facebook/AccessToken;",
        "AudioAttributesImplBaseParcelizer",
        "()Lcom/facebook/AccessToken;",
        "read",
        "Ljava/lang/String;",
        "RemoteActionCompatParcelizer",
        "AudioAttributesCompatParcelizer",
        "write",
        "Z",
        "Lcom/facebook/GraphRequest$write;",
        "MediaBrowserCompatItemReceiver",
        "()Lcom/facebook/GraphRequest$write;",
        "(Lcom/facebook/GraphRequest$write;)V",
        "Lorg/json/JSONObject;",
        "MediaBrowserCompatMediaItem",
        "Lorg/json/JSONObject;",
        "()Lorg/json/JSONObject;",
        "(Lorg/json/JSONObject;)V",
        "MediaBrowserCompatSearchResultReceiver",
        "onCustomAction",
        "MediaMetadataCompat",
        "Lo/lambdaonPlayWhenReadyChanged36;",
        "MediaDescriptionCompat",
        "()Lo/lambdaonPlayWhenReadyChanged36;",
        "(Lo/lambdaonPlayWhenReadyChanged36;)V",
        "RatingCompat",
        "Landroid/os/Bundle;",
        "()Landroid/os/Bundle;",
        "(Landroid/os/Bundle;)V",
        "handleMediaPlayPauseIfPendingOnHandler",
        "onCommand",
        "Ljava/lang/Object;",
        "()Ljava/lang/Object;",
        "(Ljava/lang/Object;)V",
        "ParcelableResourceWithMimeType"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field private static volatile AudioAttributesImplBaseParcelizer:Ljava/lang/String;

.field public static final IconCompatParcelizer:Lcom/facebook/GraphRequest$IconCompatParcelizer;

.field private static final MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

.field private static final MediaBrowserCompatItemReceiver:Ljava/util/regex/Pattern;

.field private static final write:Ljava/lang/String;


# instance fields
.field public AudioAttributesCompatParcelizer:Ljava/lang/String;

.field private AudioAttributesImplApi21Parcelizer:Lcom/facebook/AccessToken;

.field private AudioAttributesImplApi26Parcelizer:Lcom/facebook/GraphRequest$write;

.field private MediaBrowserCompatMediaItem:Lorg/json/JSONObject;

.field private MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

.field private MediaDescriptionCompat:Landroid/os/Bundle;

.field private MediaMetadataCompat:Lo/lambdaonPlayWhenReadyChanged36;

.field private RatingCompat:Ljava/lang/String;

.field public RemoteActionCompatParcelizer:Z

.field private handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/Object;

.field private onCommand:Z

.field private onCustomAction:Ljava/lang/String;

.field public read:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 7

    new-instance v0, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/GraphRequest$IconCompatParcelizer;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Lcom/facebook/GraphRequest;->IconCompatParcelizer:Lcom/facebook/GraphRequest$IconCompatParcelizer;

    .line 210
    const-string v0, "GraphRequest"

    const-string v1, ""

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/GraphRequest;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    .line 255
    const-string v0, "-_1234567890abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ"

    invoke-virtual {v0}, Ljava/lang/String;->toCharArray()[C

    move-result-object v0

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 256
    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V

    .line 257
    new-instance v3, Ljava/security/SecureRandom;

    invoke-direct {v3}, Ljava/security/SecureRandom;-><init>()V

    const/16 v4, 0xb

    .line 258
    invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I

    move-result v4

    const/4 v5, 0x0

    :goto_2b
    add-int/lit8 v6, v4, 0x1e

    if-ge v5, v6, :cond_3c

    .line 260
    array-length v6, v0

    invoke-virtual {v3, v6}, Ljava/util/Random;->nextInt(I)I

    move-result v6

    aget-char v6, v0, v6

    invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    add-int/lit8 v5, v5, 0x1

    goto :goto_2b

    .line 262
    :cond_3c
    invoke-virtual {v2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/facebook/GraphRequest;->write:Ljava/lang/String;

    .line 289
    const-string v0, "^/?v\\d+\\.\\d+/(.*)"

    invoke-static {v0}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v0

    sput-object v0, Lcom/facebook/GraphRequest;->MediaBrowserCompatItemReceiver:Ljava/util/regex/Pattern;

    return-void
.end method

.method public constructor <init>()V
    .registers 10

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x3f

    const/4 v8, 0x0

    move-object v0, p0

    .line 1662
    invoke-direct/range {v0 .. v8}, Lcom/facebook/GraphRequest;-><init>(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lo/lambdaonPlayWhenReadyChanged36;Lcom/facebook/GraphRequest$write;Ljava/lang/String;ILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-void
.end method

.method private constructor <init>(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lo/lambdaonPlayWhenReadyChanged36;Lcom/facebook/GraphRequest$write;Ljava/lang/String;)V
    .registers 14

    .line 1422
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x1

    .line 139
    iput-boolean v0, p0, Lcom/facebook/GraphRequest;->RemoteActionCompatParcelizer:Z

    .line 1422
    iput-object p1, p0, Lcom/facebook/GraphRequest;->AudioAttributesImplApi21Parcelizer:Lcom/facebook/AccessToken;

    .line 1423
    iput-object p2, p0, Lcom/facebook/GraphRequest;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    .line 1424
    iput-object p6, p0, Lcom/facebook/GraphRequest;->onCustomAction:Ljava/lang/String;

    .line 1425
    invoke-virtual {p0, p5}, Lcom/facebook/GraphRequest;->RemoteActionCompatParcelizer(Lcom/facebook/GraphRequest$write;)V

    .line 1426
    invoke-direct {p0, p4}, Lcom/facebook/GraphRequest;->AudioAttributesCompatParcelizer(Lo/lambdaonPlayWhenReadyChanged36;)V

    if-eqz p3, :cond_1c

    .line 1428
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1, p3}, Landroid/os/Bundle;-><init>(Landroid/os/Bundle;)V

    iput-object p1, p0, Lcom/facebook/GraphRequest;->MediaDescriptionCompat:Landroid/os/Bundle;

    goto :goto_23

    .line 1430
    :cond_1c
    new-instance p1, Landroid/os/Bundle;

    invoke-direct {p1}, Landroid/os/Bundle;-><init>()V

    iput-object p1, p0, Lcom/facebook/GraphRequest;->MediaDescriptionCompat:Landroid/os/Bundle;

    .line 1432
    :goto_23
    iget-object p1, p0, Lcom/facebook/GraphRequest;->onCustomAction:Ljava/lang/String;

    if-nez p1, :cond_48

    const/4 p1, 0x0

    .line 1433
    new-array v4, p1, [Ljava/lang/Object;

    invoke-static {}, Lo/lambdaonAudioUnderrun7;->AudioAttributesCompatParcelizer()I

    move-result v1

    invoke-static {}, Lo/lambdaonAudioUnderrun7;->AudioAttributesCompatParcelizer()I

    move-result v3

    invoke-static {}, Lo/lambdaonAudioUnderrun7;->AudioAttributesCompatParcelizer()I

    move-result v0

    invoke-static {}, Lo/lambdaonAudioUnderrun7;->AudioAttributesCompatParcelizer()I

    move-result v5

    const v2, -0x79ba8e92

    const v6, 0x79ba8e93

    invoke-static/range {v0 .. v6}, Lo/lambdaonMediaMetadataChanged48;->AudioAttributesCompatParcelizer(IIII[Ljava/lang/Object;II)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/String;

    iput-object p1, p0, Lcom/facebook/GraphRequest;->onCustomAction:Ljava/lang/String;

    :cond_48
    return-void
.end method

.method public synthetic constructor <init>(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lo/lambdaonPlayWhenReadyChanged36;Lcom/facebook/GraphRequest$write;Ljava/lang/String;ILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 10

    and-int/lit8 p8, p7, 0x1

    const/4 v0, 0x0

    if-eqz p8, :cond_6

    move-object p1, v0

    :cond_6
    and-int/lit8 p8, p7, 0x2

    if-eqz p8, :cond_b

    move-object p2, v0

    :cond_b
    and-int/lit8 p8, p7, 0x4

    if-eqz p8, :cond_10

    move-object p3, v0

    :cond_10
    and-int/lit8 p8, p7, 0x8

    if-eqz p8, :cond_15

    move-object p4, v0

    :cond_15
    and-int/lit8 p8, p7, 0x10

    if-eqz p8, :cond_1a

    move-object p5, v0

    :cond_1a
    and-int/lit8 p7, p7, 0x20

    if-eqz p7, :cond_1f

    move-object p6, v0

    .line 1420
    :cond_1f
    invoke-direct/range {p0 .. p6}, Lcom/facebook/GraphRequest;-><init>(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lo/lambdaonPlayWhenReadyChanged36;Lcom/facebook/GraphRequest$write;Ljava/lang/String;)V

    return-void
.end method

.method public static final AudioAttributesCompatParcelizer(Ljava/lang/String;)Lcom/facebook/GraphRequest;
    .registers 2
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const/4 v0, 0x0

    .line 1663
    invoke-static {v0, p0, v0}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->IconCompatParcelizer(Lcom/facebook/AccessToken;Ljava/lang/String;Lcom/facebook/GraphRequest$write;)Lcom/facebook/GraphRequest;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic AudioAttributesCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 101
    sget-object v0, Lcom/facebook/GraphRequest;->write:Ljava/lang/String;

    return-object v0
.end method

.method private AudioAttributesCompatParcelizer(Lo/lambdaonPlayWhenReadyChanged36;)V
    .registers 2

    if-nez p1, :cond_4

    .line 198
    sget-object p1, Lo/lambdaonPlayWhenReadyChanged36;->AudioAttributesCompatParcelizer:Lo/lambdaonPlayWhenReadyChanged36;

    :cond_4
    iput-object p1, p0, Lcom/facebook/GraphRequest;->MediaMetadataCompat:Lo/lambdaonPlayWhenReadyChanged36;

    return-void
.end method

.method public static final IconCompatParcelizer(Lcom/facebook/AccessToken;Ljava/lang/String;Lorg/json/JSONObject;Lcom/facebook/GraphRequest$write;)Lcom/facebook/GraphRequest;
    .registers 4
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const/4 p3, 0x0

    .line 1664
    invoke-static {p0, p1, p2, p3}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Lcom/facebook/AccessToken;Ljava/lang/String;Lorg/json/JSONObject;Lcom/facebook/GraphRequest$write;)Lcom/facebook/GraphRequest;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic IconCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 101
    sget-object v0, Lcom/facebook/GraphRequest;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    return-object v0
.end method

.method private final IconCompatParcelizer(Ljava/lang/String;Z)Ljava/lang/String;
    .registers 7

    if-nez p2, :cond_9

    .line 1540
    iget-object p2, p0, Lcom/facebook/GraphRequest;->MediaMetadataCompat:Lo/lambdaonPlayWhenReadyChanged36;

    sget-object v0, Lo/lambdaonPlayWhenReadyChanged36;->IconCompatParcelizer:Lo/lambdaonPlayWhenReadyChanged36;

    if-ne p2, v0, :cond_9

    return-object p1

    .line 1543
    :cond_9
    invoke-static {p1}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p1

    invoke-virtual {p1}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    move-result-object p1

    .line 1544
    iget-object p2, p0, Lcom/facebook/GraphRequest;->MediaDescriptionCompat:Landroid/os/Bundle;

    invoke-virtual {p2}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object p2

    .line 1545
    invoke-interface {p2}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :goto_1b
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    const-string v1, ""

    if-eqz v0, :cond_71

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    .line 1546
    iget-object v2, p0, Lcom/facebook/GraphRequest;->MediaDescriptionCompat:Landroid/os/Bundle;

    invoke-virtual {v2, v0}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    if-nez v2, :cond_32

    move-object v2, v1

    .line 1551
    :cond_32
    invoke-static {v2}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_44

    .line 1552
    invoke-static {v2}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->read(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    .line 1563
    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {p1, v0, v1}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    goto :goto_1b

    .line 1554
    :cond_44
    iget-object v0, p0, Lcom/facebook/GraphRequest;->MediaMetadataCompat:Lo/lambdaonPlayWhenReadyChanged36;

    sget-object v3, Lo/lambdaonPlayWhenReadyChanged36;->AudioAttributesCompatParcelizer:Lo/lambdaonPlayWhenReadyChanged36;

    if-ne v0, v3, :cond_4b

    goto :goto_1b

    .line 1556
    :cond_4b
    sget-object p0, Lo/toMagicModuleStatusUcModel;->INSTANCE:Lo/toMagicModuleStatusUcModel;

    .line 1557
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    .line 1559
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;

    move-result-object p1

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x1

    .line 1556
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "Unsupported parameter type for GET request: %s"

    invoke-static {p0, p2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1555
    new-instance p1, Ljava/lang/IllegalArgumentException;

    invoke-direct {p1, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    .line 1565
    :cond_71
    invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final synthetic IconCompatParcelizer(Ljava/lang/String;)V
    .registers 1

    .line 101
    sput-object p0, Lcom/facebook/GraphRequest;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    return-void
.end method

.method private final IconCompatParcelizer(Lorg/json/JSONArray;Ljava/util/Map;)V
    .registers 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/json/JSONArray;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;",
            ">;)V"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;,
            Ljava/io/IOException;
        }
    .end annotation

    .line 1611
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 1619
    invoke-direct {p0}, Lcom/facebook/GraphRequest;->handleMediaPlayPauseIfPendingOnHandler()Ljava/lang/String;

    move-result-object v1

    .line 1620
    const-string v2, "relative_url"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1621
    const-string v2, "method"

    iget-object v3, p0, Lcom/facebook/GraphRequest;->MediaMetadataCompat:Lo/lambdaonPlayWhenReadyChanged36;

    invoke-virtual {v0, v2, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1622
    iget-object v2, p0, Lcom/facebook/GraphRequest;->AudioAttributesImplApi21Parcelizer:Lcom/facebook/AccessToken;

    if-eqz v2, :cond_22

    .line 1624
    invoke-virtual {v2}, Lcom/facebook/AccessToken;->MediaBrowserCompatMediaItem()Ljava/lang/String;

    move-result-object v2

    .line 1625
    sget-object v3, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->read:Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68$read;

    invoke-virtual {v3, v2}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68$read;->IconCompatParcelizer(Ljava/lang/String;)V

    .line 1629
    :cond_22
    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    .line 1630
    iget-object v3, p0, Lcom/facebook/GraphRequest;->MediaDescriptionCompat:Landroid/os/Bundle;

    invoke-virtual {v3}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v3

    .line 1631
    invoke-interface {v3}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_31
    :goto_31
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_77

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    .line 1632
    iget-object v5, p0, Lcom/facebook/GraphRequest;->MediaDescriptionCompat:Landroid/os/Bundle;

    invoke-virtual {v5, v4}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    .line 1633
    invoke-static {v4}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->write(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_31

    .line 1635
    sget-object v5, Lo/toMagicModuleStatusUcModel;->INSTANCE:Lo/toMagicModuleStatusUcModel;

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-interface {p2}, Ljava/util/Map;->size()I

    move-result v6

    const-string v7, "file"

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    filled-new-array {v7, v6}, [Ljava/lang/Object;

    move-result-object v6

    const/4 v7, 0x2

    invoke-static {v6, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v6

    const-string v7, "%s%d"

    invoke-static {v5, v7, v6}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v5

    const-string v6, ""

    invoke-static {v5, v6}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1636
    invoke-virtual {v2, v5}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    .line 1637
    new-instance v6, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;

    invoke-direct {v6, p0, v4}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;-><init>(Lcom/facebook/GraphRequest;Ljava/lang/Object;)V

    invoke-interface {p2, v5, v6}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_31

    .line 1640
    :cond_77
    invoke-virtual {v2}, Ljava/util/AbstractCollection;->isEmpty()Z

    move-result p2

    if-nez p2, :cond_8c

    .line 1641
    const-string p2, ","

    check-cast p2, Ljava/lang/CharSequence;

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {p2, v2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p2

    .line 1642
    const-string v2, "attached_files"

    invoke-virtual {v0, v2, p2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1644
    :cond_8c
    iget-object p0, p0, Lcom/facebook/GraphRequest;->MediaBrowserCompatMediaItem:Lorg/json/JSONObject;

    if-eqz p0, :cond_b0

    .line 1647
    new-instance p2, Ljava/util/ArrayList;

    invoke-direct {p2}, Ljava/util/ArrayList;-><init>()V

    .line 1648
    sget-object v2, Lcom/facebook/GraphRequest;->IconCompatParcelizer:Lcom/facebook/GraphRequest$IconCompatParcelizer;

    .line 1651
    new-instance v3, Lcom/facebook/GraphRequest$AudioAttributesImplBaseParcelizer;

    invoke-direct {v3, p2}, Lcom/facebook/GraphRequest$AudioAttributesImplBaseParcelizer;-><init>(Ljava/util/ArrayList;)V

    check-cast v3, Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;

    .line 1648
    invoke-static {v2, p0, v1, v3}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->write(Lcom/facebook/GraphRequest$IconCompatParcelizer;Lorg/json/JSONObject;Ljava/lang/String;Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;)V

    .line 1658
    const-string p0, "&"

    check-cast p0, Ljava/lang/CharSequence;

    check-cast p2, Ljava/lang/Iterable;

    invoke-static {p0, p2}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p0

    .line 1659
    const-string p2, "body"

    invoke-virtual {v0, p2, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 1661
    :cond_b0
    invoke-virtual {p1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;

    return-void
.end method

.method private final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V
    .registers 5

    .line 1503
    iget-object v0, p0, Lcom/facebook/GraphRequest;->AudioAttributesImplApi21Parcelizer:Lcom/facebook/AccessToken;

    .line 1504
    iget-object v1, p0, Lcom/facebook/GraphRequest;->MediaDescriptionCompat:Landroid/os/Bundle;

    .line 1505
    const-string v2, "access_token"

    if-eqz v0, :cond_1b

    .line 1506
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_54

    .line 1507
    invoke-virtual {v0}, Lcom/facebook/AccessToken;->MediaBrowserCompatMediaItem()Ljava/lang/String;

    move-result-object p0

    .line 1508
    sget-object v0, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->read:Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68$read;

    invoke-virtual {v0, p0}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68$read;->IconCompatParcelizer(Ljava/lang/String;)V

    .line 1509
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_54

    .line 1511
    :cond_1b
    iget-boolean p0, p0, Lcom/facebook/GraphRequest;->onCommand:Z

    if-nez p0, :cond_54

    invoke-virtual {v1, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_54

    .line 1512
    invoke-static {}, Lo/lambdaonMediaMetadataChanged48;->write()Ljava/lang/String;

    move-result-object p0

    .line 1513
    invoke-static {}, Lo/lambdaonMediaMetadataChanged48;->AudioAttributesImplApi21Parcelizer()Ljava/lang/String;

    move-result-object v0

    .line 1514
    invoke-static {p0}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->IconCompatParcelizer(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_51

    invoke-static {v0}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->IconCompatParcelizer(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_51

    .line 1515
    new-instance v3, Ljava/lang/StringBuilder;

    invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const/16 p0, 0x7c

    invoke-virtual {v3, p0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    .line 1516
    invoke-virtual {v1, v2, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    goto :goto_54

    .line 1518
    :cond_51
    invoke-static {}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->AudioAttributesImplApi26Parcelizer()V

    .line 1524
    :cond_54
    :goto_54
    invoke-virtual {v1, v2}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_61

    .line 1525
    invoke-static {}, Lo/lambdaonMediaMetadataChanged48;->AudioAttributesImplApi21Parcelizer()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->IconCompatParcelizer(Ljava/lang/String;)Z

    .line 1530
    :cond_61
    const-string p0, "sdk"

    const-string v0, "android"

    invoke-virtual {v1, p0, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1531
    const-string p0, "format"

    const-string v0, "json"

    invoke-virtual {v1, p0, v0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 1532
    sget-object p0, Lo/lambdaonPositionDiscontinuity43;->write:Lo/lambdaonPositionDiscontinuity43;

    invoke-static {p0}, Lo/lambdaonMediaMetadataChanged48;->write(Lo/lambdaonPositionDiscontinuity43;)Z

    move-result p0

    const-string v0, "debug"

    if-eqz p0, :cond_7f

    .line 1533
    const-string p0, "info"

    invoke-virtual {v1, v0, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 1534
    :cond_7f
    sget-object p0, Lo/lambdaonPositionDiscontinuity43;->AudioAttributesCompatParcelizer:Lo/lambdaonPositionDiscontinuity43;

    invoke-static {p0}, Lo/lambdaonMediaMetadataChanged48;->write(Lo/lambdaonPositionDiscontinuity43;)Z

    move-result p0

    if-eqz p0, :cond_8c

    .line 1535
    const-string p0, "warning"

    invoke-virtual {v1, v0, p0}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    :cond_8c
    return-void
.end method

.method public static final synthetic RemoteActionCompatParcelizer()Ljava/lang/String;
    .registers 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public static final synthetic RemoteActionCompatParcelizer(Lcom/facebook/GraphRequest;Lorg/json/JSONArray;Ljava/util/Map;)V
    .registers 3

    .line 101
    invoke-direct {p0, p1, p2}, Lcom/facebook/GraphRequest;->IconCompatParcelizer(Lorg/json/JSONArray;Ljava/util/Map;)V

    return-void
.end method

.method private handleMediaPlayPauseIfPendingOnHandler()Ljava/lang/String;
    .registers 5

    .line 1573
    sget-object v0, Lo/toMagicModuleStatusUcModel;->INSTANCE:Lo/toMagicModuleStatusUcModel;

    invoke-static {}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda7;->read()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0}, Lcom/facebook/GraphRequest;->onCustomAction()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v2, "%s/%s"

    invoke-static {v2, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v2, ""

    invoke-static {v0, v2}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1574
    invoke-direct {p0}, Lcom/facebook/GraphRequest;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V

    const/4 v3, 0x1

    .line 1575
    invoke-direct {p0, v0, v3}, Lcom/facebook/GraphRequest;->IconCompatParcelizer(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    .line 1576
    invoke-static {p0}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri;

    move-result-object p0

    .line 1577
    sget-object v0, Lo/toMagicModuleStatusUcModel;->INSTANCE:Lo/toMagicModuleStatusUcModel;

    invoke-static {p0, v2}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Landroid/net/Uri;->getPath()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/net/Uri;->getQuery()Ljava/lang/String;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    const-string v0, "%s?%s"

    invoke-static {p0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v2}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final onCustomAction()Ljava/lang/String;
    .registers 3

    .line 1601
    sget-object v0, Lcom/facebook/GraphRequest;->MediaBrowserCompatItemReceiver:Ljava/util/regex/Pattern;

    iget-object v1, p0, Lcom/facebook/GraphRequest;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 1602
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v0

    if-eqz v0, :cond_13

    .line 1603
    iget-object p0, p0, Lcom/facebook/GraphRequest;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    return-object p0

    .line 1604
    :cond_13
    sget-object v0, Lo/toMagicModuleStatusUcModel;->INSTANCE:Lo/toMagicModuleStatusUcModel;

    iget-object v0, p0, Lcom/facebook/GraphRequest;->onCustomAction:Ljava/lang/String;

    iget-object p0, p0, Lcom/facebook/GraphRequest;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    filled-new-array {v0, p0}, [Ljava/lang/Object;

    move-result-object p0

    const/4 v0, 0x2

    invoke-static {p0, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p0

    const-string v0, "%s/%s"

    invoke-static {v0, p0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static final synthetic read()Ljava/lang/String;
    .registers 1

    .line 101
    sget-object v0, Lcom/facebook/GraphRequest;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    return-object v0
.end method

.method public static final synthetic write()Ljava/util/regex/Pattern;
    .registers 1

    .line 101
    sget-object v0, Lcom/facebook/GraphRequest;->MediaBrowserCompatItemReceiver:Ljava/util/regex/Pattern;

    return-object v0
.end method


# virtual methods
.method public final AudioAttributesImplApi21Parcelizer()Lorg/json/JSONObject;
    .registers 1

    .line 111
    iget-object p0, p0, Lcom/facebook/GraphRequest;->MediaBrowserCompatMediaItem:Lorg/json/JSONObject;

    return-object p0
.end method

.method public final AudioAttributesImplApi26Parcelizer()Lo/lambdaonPlaybackStateChanged35;
    .registers 3

    .line 1477
    sget-object v0, Lcom/facebook/GraphRequest;->IconCompatParcelizer:Lcom/facebook/GraphRequest$IconCompatParcelizer;

    move-object v1, p0

    check-cast v1, Lcom/facebook/GraphRequest;

    filled-new-array {p0}, [Lcom/facebook/GraphRequest;

    move-result-object p0

    invoke-virtual {v0, p0}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->RemoteActionCompatParcelizer([Lcom/facebook/GraphRequest;)Lo/lambdaonPlaybackStateChanged35;

    move-result-object p0

    return-object p0
.end method

.method public final AudioAttributesImplBaseParcelizer()Lcom/facebook/AccessToken;
    .registers 1

    .line 103
    iget-object p0, p0, Lcom/facebook/GraphRequest;->AudioAttributesImplApi21Parcelizer:Lcom/facebook/AccessToken;

    return-object p0
.end method

.method public final IconCompatParcelizer(Ljava/lang/Object;)V
    .registers 2

    .line 148
    iput-object p1, p0, Lcom/facebook/GraphRequest;->handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/Object;

    return-void
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()Lo/lambdaonPlayerError41;
    .registers 2

    .line 1462
    sget-object v0, Lcom/facebook/GraphRequest;->IconCompatParcelizer:Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-virtual {v0, p0}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->read(Lcom/facebook/GraphRequest;)Lo/lambdaonPlayerError41;

    move-result-object p0

    return-object p0
.end method

.method public final MediaBrowserCompatItemReceiver()Lcom/facebook/GraphRequest$write;
    .registers 1

    .line 157
    iget-object p0, p0, Lcom/facebook/GraphRequest;->AudioAttributesImplApi26Parcelizer:Lcom/facebook/GraphRequest$write;

    return-object p0
.end method

.method public final MediaBrowserCompatMediaItem()Ljava/lang/String;
    .registers 4

    .line 1585
    iget-object v0, p0, Lcom/facebook/GraphRequest;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    .line 1589
    iget-object v1, p0, Lcom/facebook/GraphRequest;->MediaMetadataCompat:Lo/lambdaonPlayWhenReadyChanged36;

    sget-object v2, Lo/lambdaonPlayWhenReadyChanged36;->IconCompatParcelizer:Lo/lambdaonPlayWhenReadyChanged36;

    if-ne v1, v2, :cond_17

    if-eqz v0, :cond_17

    const-string v1, "/videos"

    invoke-static {v0, v1}, Lo/TestGroupLSModel;->AudioAttributesImplApi21Parcelizer(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_17

    .line 1590
    invoke-static {}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda7;->IconCompatParcelizer()Ljava/lang/String;

    move-result-object v0

    goto :goto_1b

    .line 1592
    :cond_17
    invoke-static {}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda7;->read()Ljava/lang/String;

    move-result-object v0

    .line 1594
    :goto_1b
    sget-object v1, Lo/toMagicModuleStatusUcModel;->INSTANCE:Lo/toMagicModuleStatusUcModel;

    invoke-direct {p0}, Lcom/facebook/GraphRequest;->onCustomAction()Ljava/lang/String;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x2

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s/%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1595
    invoke-direct {p0}, Lcom/facebook/GraphRequest;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()V

    const/4 v1, 0x0

    .line 1596
    invoke-direct {p0, v0, v1}, Lcom/facebook/GraphRequest;->IconCompatParcelizer(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public final MediaBrowserCompatSearchResultReceiver()Ljava/lang/String;
    .registers 1

    .line 106
    iget-object p0, p0, Lcom/facebook/GraphRequest;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    return-object p0
.end method

.method public final MediaDescriptionCompat()Lo/lambdaonPlayWhenReadyChanged36;
    .registers 1

    .line 193
    iget-object p0, p0, Lcom/facebook/GraphRequest;->MediaMetadataCompat:Lo/lambdaonPlayWhenReadyChanged36;

    return-object p0
.end method

.method public final MediaMetadataCompat()Ljava/lang/Object;
    .registers 1

    .line 148
    iget-object p0, p0, Lcom/facebook/GraphRequest;->handleMediaPlayPauseIfPendingOnHandler:Ljava/lang/Object;

    return-object p0
.end method

.method public final RatingCompat()Landroid/os/Bundle;
    .registers 1

    .line 142
    iget-object p0, p0, Lcom/facebook/GraphRequest;->MediaDescriptionCompat:Landroid/os/Bundle;

    return-object p0
.end method

.method public final RemoteActionCompatParcelizer(Lcom/facebook/GraphRequest$write;)V
    .registers 3

    .line 160
    sget-object v0, Lo/lambdaonPositionDiscontinuity43;->write:Lo/lambdaonPositionDiscontinuity43;

    invoke-static {v0}, Lo/lambdaonMediaMetadataChanged48;->write(Lo/lambdaonPositionDiscontinuity43;)Z

    move-result v0

    if-nez v0, :cond_13

    .line 161
    sget-object v0, Lo/lambdaonPositionDiscontinuity43;->AudioAttributesCompatParcelizer:Lo/lambdaonPositionDiscontinuity43;

    invoke-static {v0}, Lo/lambdaonMediaMetadataChanged48;->write(Lo/lambdaonPositionDiscontinuity43;)Z

    move-result v0

    if-nez v0, :cond_13

    .line 188
    iput-object p1, p0, Lcom/facebook/GraphRequest;->AudioAttributesImplApi26Parcelizer:Lcom/facebook/GraphRequest$write;

    return-void

    .line 162
    :cond_13
    new-instance v0, Lcom/facebook/GraphRequest$2;

    invoke-direct {v0, p1}, Lcom/facebook/GraphRequest$2;-><init>(Lcom/facebook/GraphRequest$write;)V

    check-cast v0, Lcom/facebook/GraphRequest$write;

    .line 186
    iput-object v0, p0, Lcom/facebook/GraphRequest;->AudioAttributesImplApi26Parcelizer:Lcom/facebook/GraphRequest$write;

    return-void
.end method

.method public final onAddQueueItem()V
    .registers 2
    .annotation runtime Lo/getRenewGrpId;
    .end annotation

    const/4 v0, 0x1

    .line 1448
    iput-boolean v0, p0, Lcom/facebook/GraphRequest;->onCommand:Z

    return-void
.end method

.method public final onCommand()Ljava/lang/String;
    .registers 1

    .line 154
    iget-object p0, p0, Lcom/facebook/GraphRequest;->onCustomAction:Ljava/lang/String;

    return-object p0
.end method

.method public final read(Landroid/os/Bundle;)V
    .registers 3

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 142
    iput-object p1, p0, Lcom/facebook/GraphRequest;->MediaDescriptionCompat:Landroid/os/Bundle;

    return-void
.end method

.method public final read(Lorg/json/JSONObject;)V
    .registers 2

    .line 111
    iput-object p1, p0, Lcom/facebook/GraphRequest;->MediaBrowserCompatMediaItem:Lorg/json/JSONObject;

    return-void
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 1486
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{Request:  accessToken: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 1489
    iget-object v1, p0, Lcom/facebook/GraphRequest;->AudioAttributesImplApi21Parcelizer:Lcom/facebook/AccessToken;

    if-nez v1, :cond_d

    const-string v1, "null"

    :cond_d
    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1490
    const-string v1, ", graphPath: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1491
    iget-object v1, p0, Lcom/facebook/GraphRequest;->MediaBrowserCompatSearchResultReceiver:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1492
    const-string v1, ", graphObject: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1493
    iget-object v1, p0, Lcom/facebook/GraphRequest;->MediaBrowserCompatMediaItem:Lorg/json/JSONObject;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1494
    const-string v1, ", httpMethod: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1495
    iget-object v1, p0, Lcom/facebook/GraphRequest;->MediaMetadataCompat:Lo/lambdaonPlayWhenReadyChanged36;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1496
    const-string v1, ", parameters: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1497
    iget-object p0, p0, Lcom/facebook/GraphRequest;->MediaDescriptionCompat:Landroid/os/Bundle;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 1498
    const-string p0, "}"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 1499
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

###### Class com.facebook.GraphRequest.AnonymousClass2 (com.facebook.GraphRequest$2)
.class final Lcom/facebook/GraphRequest$2;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/GraphRequest$write;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/GraphRequest;->RemoteActionCompatParcelizer(Lcom/facebook/GraphRequest$write;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0003\u0010\u0004"
    }
    d2 = {
        "Lo/lambdaonPlayerError41;",
        "p0",
        "",
        "IconCompatParcelizer",
        "(Lo/lambdaonPlayerError41;)V"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field private synthetic $RemoteActionCompatParcelizer:Lcom/facebook/GraphRequest$write;


# direct methods
.method constructor <init>(Lcom/facebook/GraphRequest$write;)V
    .registers 2

    .line 185
    iput-object p1, p0, Lcom/facebook/GraphRequest$2;->$RemoteActionCompatParcelizer:Lcom/facebook/GraphRequest$write;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Lo/lambdaonPlayerError41;)V
    .registers 11

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 163
    invoke-virtual {p1}, Lo/lambdaonPlayerError41;->AudioAttributesCompatParcelizer()Lorg/json/JSONObject;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_13

    .line 164
    const-string v2, "__debug__"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v0

    goto :goto_14

    :cond_13
    move-object v0, v1

    :goto_14
    if-eqz v0, :cond_1d

    .line 165
    const-string v2, "messages"

    invoke-virtual {v0, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v0

    goto :goto_1e

    :cond_1d
    move-object v0, v1

    :goto_1e
    if-eqz v0, :cond_81

    .line 167
    invoke-virtual {v0}, Lorg/json/JSONArray;->length()I

    move-result v2

    const/4 v3, 0x0

    :goto_25
    if-ge v3, v2, :cond_81

    .line 168
    invoke-virtual {v0, v3}, Lorg/json/JSONArray;->optJSONObject(I)Lorg/json/JSONObject;

    move-result-object v4

    if-eqz v4, :cond_34

    .line 169
    const-string v5, "message"

    invoke-virtual {v4, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    goto :goto_35

    :cond_34
    move-object v5, v1

    :goto_35
    if-eqz v4, :cond_3e

    .line 170
    const-string v6, "type"

    invoke-virtual {v4, v6}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    goto :goto_3f

    :cond_3e
    move-object v6, v1

    :goto_3f
    if-eqz v4, :cond_48

    .line 171
    const-string v7, "link"

    invoke-virtual {v4, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_49

    :cond_48
    move-object v4, v1

    :goto_49
    if-eqz v5, :cond_7e

    if-eqz v6, :cond_7e

    .line 173
    sget-object v7, Lo/lambdaonPositionDiscontinuity43;->write:Lo/lambdaonPositionDiscontinuity43;

    .line 174
    const-string v8, "warning"

    invoke-static {v6, v8}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_59

    .line 175
    sget-object v7, Lo/lambdaonPositionDiscontinuity43;->AudioAttributesCompatParcelizer:Lo/lambdaonPositionDiscontinuity43;

    .line 177
    :cond_59
    invoke-static {v4}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->IconCompatParcelizer(Ljava/lang/String;)Z

    move-result v6

    if-nez v6, :cond_73

    .line 178
    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v5, " Link: "

    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v5

    .line 180
    :cond_73
    sget-object v4, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->read:Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68$read;

    sget-object v6, Lcom/facebook/GraphRequest;->IconCompatParcelizer:Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-static {}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->read()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4, v7, v6, v5}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68$read;->IconCompatParcelizer(Lo/lambdaonPositionDiscontinuity43;Ljava/lang/String;Ljava/lang/String;)V

    :cond_7e
    add-int/lit8 v3, v3, 0x1

    goto :goto_25

    .line 184
    :cond_81
    iget-object p0, p0, Lcom/facebook/GraphRequest$2;->$RemoteActionCompatParcelizer:Lcom/facebook/GraphRequest$write;

    if-eqz p0, :cond_88

    invoke-interface {p0, p1}, Lcom/facebook/GraphRequest$write;->IconCompatParcelizer(Lo/lambdaonPlayerError41;)V

    :cond_88
    return-void
.end method

###### Class com.facebook.GraphRequest.AudioAttributesCompatParcelizer (com.facebook.GraphRequest$AudioAttributesCompatParcelizer)
.class interface abstract Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/GraphRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x608
    name = "AudioAttributesCompatParcelizer"
.end annotation


# virtual methods
.method public abstract read(Ljava/lang/String;Ljava/lang/String;)V
.end method

###### Class com.facebook.GraphRequest.AudioAttributesImplBaseParcelizer (com.facebook.GraphRequest$AudioAttributesImplBaseParcelizer)
.class public final Lcom/facebook/GraphRequest$AudioAttributesImplBaseParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/GraphRequest;->IconCompatParcelizer(Lorg/json/JSONArray;Ljava/util/Map;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation


# instance fields
.field private synthetic RemoteActionCompatParcelizer:Ljava/util/ArrayList;


# direct methods
.method constructor <init>(Ljava/util/ArrayList;)V
    .registers 2

    .line 1651
    iput-object p1, p0, Lcom/facebook/GraphRequest$AudioAttributesImplBaseParcelizer;->RemoteActionCompatParcelizer:Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final read(Ljava/lang/String;Ljava/lang/String;)V
    .registers 6
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1654
    iget-object p0, p0, Lcom/facebook/GraphRequest$AudioAttributesImplBaseParcelizer;->RemoteActionCompatParcelizer:Ljava/util/ArrayList;

    .line 1655
    sget-object v1, Lo/toMagicModuleStatusUcModel;->INSTANCE:Lo/toMagicModuleStatusUcModel;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    const-string v2, "UTF-8"

    invoke-static {p2, v2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    filled-new-array {p1, p2}, [Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x2

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "%s=%s"

    invoke-static {v1, p2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1654
    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    return-void
.end method

###### Class com.facebook.GraphRequest.Companion (com.facebook.GraphRequest$IconCompatParcelizer)
.class public final Lcom/facebook/GraphRequest$IconCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/GraphRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "IconCompatParcelizer"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u00aa\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u0011\n\u0002\u0008\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0008\n\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\u0008J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001d\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0005\u001a\u00020\rH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J)\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000e2\u0012\u0010\u0005\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\t0\u0011\"\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J#\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000e2\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0014H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0015J\u0017\u0010\u0007\u001a\u00020\u00162\u0006\u0010\u0005\u001a\u00020\rH\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0017J#\u0010\u0018\u001a\u00020\u00162\u0012\u0010\u0005\u001a\n\u0012\u0006\u0008\u0001\u0012\u00020\t0\u0011\"\u00020\tH\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\u001d\u0010\u0018\u001a\u00020\u00162\u000c\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0014H\u0007\u00a2\u0006\u0004\u0008\u0018\u0010\u001aJ%\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000e2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\rH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u001cJ\u0017\u0010\u000b\u001a\u00020\u001d2\u0006\u0010\u0005\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u001eJ\u0017\u0010\u0018\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0018\u0010 J\u0017\u0010\u0012\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010 J\u0017\u0010\u000b\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\u001dH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010!J\u0019\u0010\u0012\u001a\u00020\u001f2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0004\u0008\u0012\u0010\"J\u0019\u0010\u0007\u001a\u00020\u001f2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010\"J-\u0010\u0012\u001a\u00020\t2\u0008\u0010\u0005\u001a\u0004\u0018\u00010#2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001d2\u0008\u0010%\u001a\u0004\u0018\u00010$H\u0007\u00a2\u0006\u0004\u0008\u0012\u0010&J7\u0010\u0007\u001a\u00020\t2\u0008\u0010\u0005\u001a\u0004\u0018\u00010#2\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001d2\u0008\u0010%\u001a\u0004\u0018\u00010\'2\u0008\u0010(\u001a\u0004\u0018\u00010$H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010)J\u0019\u0010*\u001a\u00020\u001d2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0001H\u0002\u00a2\u0006\u0004\u0008*\u0010+J\'\u0010\u0007\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\'2\u0006\u0010\u001b\u001a\u00020\u001d2\u0006\u0010%\u001a\u00020,H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010.J/\u0010\u000b\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u00012\u0006\u0010%\u001a\u00020,2\u0006\u0010(\u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010/JA\u0010\u0018\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\r2\u0008\u0010\u001b\u001a\u0004\u0018\u0001002\u0006\u0010%\u001a\u0002012\u0006\u0010(\u001a\u00020\u00042\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008\u0018\u00105J%\u0010\u0012\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\r2\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\n0\u000eH\u0001\u00a2\u0006\u0004\u0008\u0012\u00106J+\u0010\u000b\u001a\u00020-2\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u000208072\u0006\u0010\u001b\u001a\u000209H\u0002\u00a2\u0006\u0004\u0008\u000b\u0010:J\'\u0010\u0007\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020;2\u0006\u0010\u001b\u001a\u0002092\u0006\u0010%\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u0007\u0010<J9\u0010\u0007\u001a\u00020-2\u0006\u0010\u0005\u001a\u0002092\u000c\u0010\u001b\u001a\u0008\u0012\u0004\u0012\u00020\t0\u00142\u0012\u0010%\u001a\u000e\u0012\u0004\u0012\u00020\u001d\u0012\u0004\u0012\u0002080=H\u0002\u00a2\u0006\u0004\u0008\u0007\u0010>J\u001f\u0010\u000f\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\r2\u0006\u0010\u001b\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\u000f\u0010?J\u001f\u0010\u0012\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u001b\u001a\u00020\u001fH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010@J\u0017\u0010\u0007\u001a\u00020\u001f2\u0006\u0010\u0005\u001a\u00020\tH\u0001\u00a2\u0006\u0004\u0008\u0007\u0010AJ\u0017\u0010B\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\rH\u0007\u00a2\u0006\u0004\u0008B\u0010CJ\u0017\u0010*\u001a\u00020-2\u0006\u0010\u0005\u001a\u00020\rH\u0001\u00a2\u0006\u0004\u0008*\u0010DR\u0014\u0010\u0018\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000f\u0010ER\u0017\u0010\u0012\u001a\u00020\u001d8\u0007\u00a2\u0006\u000c\n\u0004\u0008F\u0010E\u001a\u0004\u0008\u000b\u0010GR\u0014\u0010\u000b\u001a\u00020\u001d8CX\u0082\u0004\u00a2\u0006\u0006\u001a\u0004\u0008\u000f\u0010GR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u001d8C@\u0002X\u0083\u000c\u00a2\u0006\u000c\n\u0004\u0008B\u0010E\u001a\u0004\u0008\u0012\u0010GR\u0018\u0010\u0007\u001a\u0006*\u00020H0H8\u0002X\u0083\u0004\u00a2\u0006\u0006\n\u0004\u0008I\u0010J"
    }
    d2 = {
        "Lcom/facebook/GraphRequest$IconCompatParcelizer;",
        "",
        "<init>",
        "()V",
        "Ljava/net/URL;",
        "p0",
        "Ljava/net/HttpURLConnection;",
        "AudioAttributesCompatParcelizer",
        "(Ljava/net/URL;)Ljava/net/HttpURLConnection;",
        "Lcom/facebook/GraphRequest;",
        "Lo/lambdaonPlayerError41;",
        "read",
        "(Lcom/facebook/GraphRequest;)Lo/lambdaonPlayerError41;",
        "Lo/lambdaonPlaybackSuppressionReasonChanged37;",
        "",
        "write",
        "(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Ljava/util/List;",
        "",
        "IconCompatParcelizer",
        "([Lcom/facebook/GraphRequest;)Ljava/util/List;",
        "",
        "(Ljava/util/Collection;)Ljava/util/List;",
        "Lo/lambdaonPlaybackStateChanged35;",
        "(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Lo/lambdaonPlaybackStateChanged35;",
        "RemoteActionCompatParcelizer",
        "([Lcom/facebook/GraphRequest;)Lo/lambdaonPlaybackStateChanged35;",
        "(Ljava/util/Collection;)Lo/lambdaonPlaybackStateChanged35;",
        "p1",
        "(Ljava/net/HttpURLConnection;Lo/lambdaonPlaybackSuppressionReasonChanged37;)Ljava/util/List;",
        "",
        "(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Ljava/lang/String;",
        "",
        "(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Z",
        "(Ljava/lang/String;)Z",
        "(Ljava/lang/Object;)Z",
        "Lcom/facebook/AccessToken;",
        "Lcom/facebook/GraphRequest$write;",
        "p2",
        "(Lcom/facebook/AccessToken;Ljava/lang/String;Lcom/facebook/GraphRequest$write;)Lcom/facebook/GraphRequest;",
        "Lorg/json/JSONObject;",
        "p3",
        "(Lcom/facebook/AccessToken;Ljava/lang/String;Lorg/json/JSONObject;Lcom/facebook/GraphRequest$write;)Lcom/facebook/GraphRequest;",
        "AudioAttributesImplApi26Parcelizer",
        "(Ljava/lang/Object;)Ljava/lang/String;",
        "Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;",
        "",
        "(Lorg/json/JSONObject;Ljava/lang/String;Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;)V",
        "(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;Z)V",
        "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;",
        "",
        "Ljava/io/OutputStream;",
        "p4",
        "p5",
        "(Lo/lambdaonPlaybackSuppressionReasonChanged37;Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;ILjava/net/URL;Ljava/io/OutputStream;Z)V",
        "(Lo/lambdaonPlaybackSuppressionReasonChanged37;Ljava/util/List;)V",
        "",
        "Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;",
        "Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;",
        "(Ljava/util/Map;Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;)V",
        "Landroid/os/Bundle;",
        "(Landroid/os/Bundle;Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;Lcom/facebook/GraphRequest;)V",
        "",
        "(Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;Ljava/util/Collection;Ljava/util/Map;)V",
        "(Lo/lambdaonPlaybackSuppressionReasonChanged37;Ljava/net/HttpURLConnection;)V",
        "(Ljava/net/HttpURLConnection;Z)V",
        "(Lcom/facebook/GraphRequest;)Z",
        "AudioAttributesImplBaseParcelizer",
        "(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Ljava/net/HttpURLConnection;",
        "(Lo/lambdaonPlaybackSuppressionReasonChanged37;)V",
        "Ljava/lang/String;",
        "MediaBrowserCompatCustomActionResultReceiver",
        "()Ljava/lang/String;",
        "Ljava/util/regex/Pattern;",
        "MediaBrowserCompatItemReceiver",
        "Ljava/util/regex/Pattern;"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 204
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 204
    invoke-direct {p0}, Lcom/facebook/GraphRequest$IconCompatParcelizer;-><init>()V

    return-void
.end method

.method public static AudioAttributesCompatParcelizer(Lcom/facebook/AccessToken;Ljava/lang/String;Lorg/json/JSONObject;Lcom/facebook/GraphRequest$write;)Lcom/facebook/GraphRequest;
    .registers 14
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    .line 343
    new-instance v9, Lcom/facebook/GraphRequest;

    const/4 v3, 0x0

    sget-object v4, Lo/lambdaonPlayWhenReadyChanged36;->IconCompatParcelizer:Lo/lambdaonPlayWhenReadyChanged36;

    const/4 v6, 0x0

    const/16 v7, 0x20

    const/4 v8, 0x0

    move-object v0, v9

    move-object v1, p0

    move-object v2, p1

    move-object v5, p3

    invoke-direct/range {v0 .. v8}, Lcom/facebook/GraphRequest;-><init>(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lo/lambdaonPlayWhenReadyChanged36;Lcom/facebook/GraphRequest$write;Ljava/lang/String;ILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    .line 344
    invoke-virtual {v9, p2}, Lcom/facebook/GraphRequest;->read(Lorg/json/JSONObject;)V

    return-object v9
.end method

.method private final AudioAttributesCompatParcelizer(Ljava/net/URL;)Ljava/net/HttpURLConnection;
    .registers 3
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;
        }
    .end annotation

    .line 1043
    invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;

    move-result-object p1

    invoke-static {p1}, Lo/getAvcProfileAndLevel;->read(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/net/URLConnection;

    if-eqz p1, :cond_2b

    check-cast p1, Ljava/net/HttpURLConnection;

    .line 1044
    check-cast p0, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    const-string p0, "User-Agent"

    invoke-static {}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->IconCompatParcelizer()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, p0, v0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1045
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, "Accept-Language"

    invoke-virtual {p1, v0, p0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    const/4 p0, 0x0

    .line 1046
    invoke-virtual {p1, p0}, Ljava/net/HttpURLConnection;->setChunkedStreamingMode(I)V

    return-object p1

    .line 1043
    :cond_2b
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type java.net.HttpURLConnection"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private AudioAttributesCompatParcelizer(Ljava/util/Collection;)Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/facebook/GraphRequest;",
            ">;)",
            "Ljava/util/List<",
            "Lo/lambdaonPlayerError41;",
            ">;"
        }
    .end annotation

    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 800
    move-object v0, p0

    check-cast v0, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    new-instance v0, Lo/lambdaonPlaybackSuppressionReasonChanged37;

    invoke-direct {v0, p1}, Lo/lambdaonPlaybackSuppressionReasonChanged37;-><init>(Ljava/util/Collection;)V

    invoke-virtual {p0, v0}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->write(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static AudioAttributesCompatParcelizer(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Lo/lambdaonPlaybackStateChanged35;
    .registers 3
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 893
    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    const-string v1, "requests"

    invoke-static {v0, v1}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda8;->AudioAttributesCompatParcelizer(Ljava/util/Collection;Ljava/lang/String;)V

    .line 894
    new-instance v0, Lo/lambdaonPlaybackStateChanged35;

    invoke-direct {v0, p0}, Lo/lambdaonPlaybackStateChanged35;-><init>(Lo/lambdaonPlaybackSuppressionReasonChanged37;)V

    .line 895
    invoke-static {}, Lo/lambdaonMediaMetadataChanged48;->MediaBrowserCompatCustomActionResultReceiver()Ljava/util/concurrent/Executor;

    move-result-object p0

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Void;

    invoke-virtual {v0, p0, v1}, Lo/lambdaonPlaybackStateChanged35;->executeOnExecutor(Ljava/util/concurrent/Executor;[Ljava/lang/Object;)Landroid/os/AsyncTask;

    return-object v0
.end method

.method private final AudioAttributesCompatParcelizer(Landroid/os/Bundle;Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;Lcom/facebook/GraphRequest;)V
    .registers 8

    .line 1306
    invoke-virtual {p1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v0

    .line 1307
    invoke-interface {v0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    :goto_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1308
    invoke-virtual {p1, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 1309
    move-object v3, p0

    check-cast v3, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-static {v2}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    .line 1310
    const-string v3, ""

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, v1, v2, p3}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/GraphRequest;)V

    goto :goto_8

    :cond_2a
    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;Ljava/util/Collection;Ljava/util/Map;)V
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;",
            "Ljava/util/Collection<",
            "Lcom/facebook/GraphRequest;",
            ">;",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;",
            ">;)V"
        }
    .end annotation

    .line 1328
    new-instance v0, Lorg/json/JSONArray;

    invoke-direct {v0}, Lorg/json/JSONArray;-><init>()V

    .line 1329
    invoke-interface {p1}, Ljava/util/Collection;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_9
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_19

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/GraphRequest;

    .line 1330
    invoke-static {v2, v0, p2}, Lcom/facebook/GraphRequest;->RemoteActionCompatParcelizer(Lcom/facebook/GraphRequest;Lorg/json/JSONArray;Ljava/util/Map;)V

    goto :goto_9

    .line 1332
    :cond_19
    const-string p2, "batch"

    invoke-virtual {p0, p2, v0, p1}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(Ljava/lang/String;Lorg/json/JSONArray;Ljava/util/Collection;)V

    return-void
.end method

.method private final AudioAttributesCompatParcelizer(Lorg/json/JSONObject;Ljava/lang/String;Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;)V
    .registers 11

    .line 1236
    move-object v0, p0

    check-cast v0, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-static {p2}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->read(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x1

    const/4 v2, 0x0

    if-eqz v0, :cond_24

    .line 1237
    check-cast p2, Ljava/lang/CharSequence;

    const-string v0, ":"

    const/4 v3, 0x6

    invoke-static {p2, v0, v2, v2, v3}, Lo/TestGroupLSModel;->read(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result v0

    .line 1238
    const-string v4, "?"

    invoke-static {p2, v4, v2, v2, v3}, Lo/TestGroupLSModel;->read(Ljava/lang/CharSequence;Ljava/lang/String;IZI)I

    move-result p2

    const/4 v3, 0x3

    if-le v0, v3, :cond_24

    const/4 v3, -0x1

    if-eq p2, v3, :cond_22

    if-ge v0, p2, :cond_24

    :cond_22
    move p2, v1

    goto :goto_25

    :cond_24
    move p2, v2

    .line 1243
    :goto_25
    invoke-virtual {p1}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    .line 1244
    :goto_29
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_52

    .line 1245
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    .line 1246
    invoke-virtual {p1, v3}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v4

    if-eqz p2, :cond_45

    .line 1247
    const-string v5, "image"

    invoke-static {v3, v5, v1}, Lo/TestGroupLSModel;->read(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result v5

    if-eqz v5, :cond_45

    move v5, v1

    goto :goto_46

    :cond_45
    move v5, v2

    .line 1248
    :goto_46
    const-string v6, ""

    invoke-static {v3, v6}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v4, v6}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v3, v4, p3, v5}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->read(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;Z)V

    goto :goto_29

    :cond_52
    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Lcom/facebook/GraphRequest;)Z
    .registers 5
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1088
    invoke-virtual {p0}, Lcom/facebook/GraphRequest;->onCommand()Ljava/lang/String;

    move-result-object p0

    const/4 v1, 0x1

    if-eqz p0, :cond_71

    .line 1089
    move-object v2, p0

    check-cast v2, Ljava/lang/CharSequence;

    invoke-interface {v2}, Ljava/lang/CharSequence;->length()I

    move-result v2

    if-nez v2, :cond_16

    return v1

    .line 1092
    :cond_16
    const-string v2, "v"

    invoke-static {p0, v2}, Lo/TestGroupLSModel;->MediaBrowserCompatCustomActionResultReceiver(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_30

    if-eqz p0, :cond_28

    .line 1093
    invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    goto :goto_30

    :cond_28
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1095
    :cond_30
    :goto_30
    check-cast p0, Ljava/lang/CharSequence;

    new-instance v0, Lo/newYearNameItem;

    const-string v2, "\\."

    invoke-direct {v0, v2}, Lo/newYearNameItem;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p0}, Lo/newYearNameItem;->read(Ljava/lang/CharSequence;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    const/4 v0, 0x0

    .line 1942
    new-array v2, v0, [Ljava/lang/String;

    invoke-interface {p0, v2}, Ljava/util/Collection;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object p0

    if-eqz p0, :cond_69

    .line 1095
    check-cast p0, [Ljava/lang/String;

    .line 1098
    array-length v2, p0

    const/4 v3, 0x2

    if-lt v2, v3, :cond_56

    .line 1097
    aget-object v2, p0, v0

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-gt v2, v3, :cond_67

    .line 1098
    :cond_56
    aget-object v2, p0, v0

    invoke-static {v2}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result v2

    if-lt v2, v3, :cond_68

    aget-object p0, p0, v1

    invoke-static {p0}, Ljava/lang/Integer;->parseInt(Ljava/lang/String;)I

    move-result p0

    const/4 v2, 0x4

    if-lt p0, v2, :cond_68

    :cond_67
    return v1

    :cond_68
    return v0

    .line 1942
    :cond_69
    new-instance p0, Ljava/lang/NullPointerException;

    const-string v0, "null cannot be cast to non-null type kotlin.Array<T>"

    invoke-direct {p0, v0}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_71
    return v1
.end method

.method private static AudioAttributesCompatParcelizer(Ljava/lang/Object;)Z
    .registers 2

    .line 1380
    instance-of v0, p0, Ljava/lang/String;

    if-nez v0, :cond_12

    instance-of v0, p0, Ljava/lang/Boolean;

    if-nez v0, :cond_12

    instance-of v0, p0, Ljava/lang/Number;

    if-nez v0, :cond_12

    instance-of p0, p0, Ljava/util/Date;

    if-nez p0, :cond_12

    const/4 p0, 0x0

    return p0

    :cond_12
    const/4 p0, 0x1

    return p0
.end method

.method private static AudioAttributesImplApi26Parcelizer(Ljava/lang/Object;)Ljava/lang/String;
    .registers 4

    .line 1384
    instance-of v0, p0, Ljava/lang/String;

    if-eqz v0, :cond_7

    .line 1385
    check-cast p0, Ljava/lang/String;

    return-object p0

    .line 1386
    :cond_7
    instance-of v0, p0, Ljava/lang/Boolean;

    if-nez v0, :cond_32

    instance-of v0, p0, Ljava/lang/Number;

    if-nez v0, :cond_32

    .line 1388
    instance-of v0, p0, Ljava/util/Date;

    if-eqz v0, :cond_28

    .line 1389
    new-instance v0, Ljava/text/SimpleDateFormat;

    const-string v1, "yyyy-MM-dd\'T\'HH:mm:ssZ"

    sget-object v2, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 1390
    check-cast p0, Ljava/util/Date;

    invoke-virtual {v0, p0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    .line 1392
    :cond_28
    new-instance p0, Ljava/lang/IllegalArgumentException;

    const-string v0, "Unsupported parameter type."

    invoke-direct {p0, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    throw p0

    .line 1387
    :cond_32
    invoke-virtual {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private AudioAttributesImplApi26Parcelizer(Lo/lambdaonPlaybackSuppressionReasonChanged37;)V
    .registers 8
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1104
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_9
    :goto_9
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5a

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/facebook/GraphRequest;

    .line 1105
    sget-object v2, Lo/lambdaonPlayWhenReadyChanged36;->AudioAttributesCompatParcelizer:Lo/lambdaonPlayWhenReadyChanged36;

    invoke-virtual {v1}, Lcom/facebook/GraphRequest;->MediaDescriptionCompat()Lo/lambdaonPlayWhenReadyChanged36;

    move-result-object v3

    if-ne v2, v3, :cond_9

    move-object v2, p0

    check-cast v2, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-static {v1, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Lcom/facebook/GraphRequest;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 1106
    invoke-virtual {v1}, Lcom/facebook/GraphRequest;->RatingCompat()Landroid/os/Bundle;

    move-result-object v2

    const-string v3, "fields"

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_43

    .line 1107
    invoke-virtual {v1}, Lcom/facebook/GraphRequest;->RatingCompat()Landroid/os/Bundle;

    move-result-object v2

    invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->IconCompatParcelizer(Ljava/lang/String;)Z

    move-result v2

    if-eqz v2, :cond_9

    .line 1108
    :cond_43
    sget-object v2, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->read:Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68$read;

    .line 1109
    sget-object v3, Lo/lambdaonPositionDiscontinuity43;->IconCompatParcelizer:Lo/lambdaonPositionDiscontinuity43;

    .line 1114
    invoke-virtual {v1}, Lcom/facebook/GraphRequest;->MediaBrowserCompatSearchResultReceiver()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_4e

    move-object v1, v0

    :cond_4e
    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v1

    .line 1108
    const-string v4, "Request"

    const-string v5, "starting with Graph API v2.4, GET requests for /%s should contain an explicit \"fields\" parameter."

    invoke-virtual {v2, v3, v4, v5, v1}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68$read;->IconCompatParcelizer(Lo/lambdaonPositionDiscontinuity43;Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_9

    :cond_5a
    return-void
.end method

.method private AudioAttributesImplBaseParcelizer(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Ljava/net/HttpURLConnection;
    .registers 6
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const-string v0, "could not construct request body"

    const-string v1, ""

    invoke-static {p1, v1}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 717
    move-object v1, p0

    check-cast v1, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-direct {p0, p1}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer(Lo/lambdaonPlaybackSuppressionReasonChanged37;)V

    .line 721
    :try_start_d
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->size()I

    move-result v1

    const/4 v2, 0x1

    if-ne v1, v2, :cond_23

    const/4 v1, 0x0

    .line 723
    invoke-virtual {p1, v1}, Lo/lambdaonPlaybackSuppressionReasonChanged37;->IconCompatParcelizer(I)Lcom/facebook/GraphRequest;

    move-result-object v1

    .line 726
    new-instance v2, Ljava/net/URL;

    invoke-virtual {v1}, Lcom/facebook/GraphRequest;->MediaBrowserCompatMediaItem()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V

    goto :goto_2c

    .line 730
    :cond_23
    new-instance v2, Ljava/net/URL;

    invoke-static {}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda7;->read()Ljava/lang/String;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V
    :try_end_2c
    .catch Ljava/net/MalformedURLException; {:try_start_d .. :try_end_2c} :catch_5b

    :goto_2c
    const/4 v1, 0x0

    .line 737
    :try_start_2d
    move-object v3, p0

    check-cast v3, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-direct {p0, v2}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Ljava/net/URL;)Ljava/net/HttpURLConnection;

    move-result-object v1

    .line 738
    move-object v2, p0

    check-cast v2, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-direct {p0, p1, v1}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->write(Lo/lambdaonPlaybackSuppressionReasonChanged37;Ljava/net/HttpURLConnection;)V
    :try_end_3a
    .catch Ljava/io/IOException; {:try_start_2d .. :try_end_3a} :catch_4b
    .catch Lorg/json/JSONException; {:try_start_2d .. :try_end_3a} :catch_3b

    return-object v1

    :catch_3b
    move-exception p0

    .line 743
    check-cast v1, Ljava/net/URLConnection;

    invoke-static {v1}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->write(Ljava/net/URLConnection;)V

    .line 744
    new-instance p1, Lo/lambdaonMetadata50;

    check-cast p0, Ljava/lang/Throwable;

    invoke-direct {p1, v0, p0}, Lo/lambdaonMetadata50;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :catch_4b
    move-exception p0

    .line 740
    check-cast v1, Ljava/net/URLConnection;

    invoke-static {v1}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->write(Ljava/net/URLConnection;)V

    .line 741
    new-instance p1, Lo/lambdaonMetadata50;

    check-cast p0, Ljava/lang/Throwable;

    invoke-direct {p1, v0, p0}, Lo/lambdaonMetadata50;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1

    :catch_5b
    move-exception p0

    .line 733
    new-instance p1, Lo/lambdaonMetadata50;

    const-string v0, "could not construct URL for request"

    check-cast p0, Ljava/lang/Throwable;

    invoke-direct {p1, v0, p0}, Lo/lambdaonMetadata50;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public static IconCompatParcelizer(Lcom/facebook/AccessToken;Ljava/lang/String;Lcom/facebook/GraphRequest$write;)Lcom/facebook/GraphRequest;
    .registers 12
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    .line 389
    new-instance p0, Lcom/facebook/GraphRequest;

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/16 v7, 0x20

    const/4 v8, 0x0

    move-object v0, p0

    move-object v2, p1

    invoke-direct/range {v0 .. v8}, Lcom/facebook/GraphRequest;-><init>(Lcom/facebook/AccessToken;Ljava/lang/String;Landroid/os/Bundle;Lo/lambdaonPlayWhenReadyChanged36;Lcom/facebook/GraphRequest$write;Ljava/lang/String;ILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-object p0
.end method

.method private static IconCompatParcelizer()Ljava/lang/String;
    .registers 5

    .line 1342
    invoke-static {}, Lcom/facebook/GraphRequest;->read()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_49

    .line 1343
    sget-object v0, Lo/toMagicModuleStatusUcModel;->INSTANCE:Lo/toMagicModuleStatusUcModel;

    const-string v0, "FBAndroidSDK"

    const-string v1, "11.1.0"

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s.%s"

    const/4 v2, 0x2

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/facebook/GraphRequest;->IconCompatParcelizer(Ljava/lang/String;)V

    .line 1346
    invoke-static {}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda66;->write()Ljava/lang/String;

    move-result-object v0

    .line 1347
    invoke-static {v0}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->IconCompatParcelizer(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_49

    .line 1348
    sget-object v3, Lo/toMagicModuleStatusUcModel;->INSTANCE:Lo/toMagicModuleStatusUcModel;

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {}, Lcom/facebook/GraphRequest;->read()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4, v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v4, "%s/%s"

    invoke-static {v0, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3, v4, v0}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lcom/facebook/GraphRequest;->IconCompatParcelizer(Ljava/lang/String;)V

    .line 1351
    :cond_49
    invoke-static {}, Lcom/facebook/GraphRequest;->read()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method private varargs IconCompatParcelizer([Lcom/facebook/GraphRequest;)Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "([",
            "Lcom/facebook/GraphRequest;",
            ")",
            "Ljava/util/List<",
            "Lo/lambdaonPlayerError41;",
            ">;"
        }
    .end annotation

    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 783
    move-object v0, p0

    check-cast v0, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-static {p1}, Lo/getOrderDetails;->onCommand([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-direct {p0, p1}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Ljava/util/Collection;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private final IconCompatParcelizer(Ljava/net/HttpURLConnection;Z)V
    .registers 4

    .line 1065
    const-string v0, "Content-Type"

    if-eqz p2, :cond_11

    .line 1066
    const-string p0, "application/x-www-form-urlencoded"

    invoke-virtual {p1, v0, p0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    .line 1067
    const-string p0, "Content-Encoding"

    const-string p2, "gzip"

    invoke-virtual {p1, p0, p2}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 1069
    :cond_11
    check-cast p0, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-static {}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->write()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, v0, p0}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static IconCompatParcelizer(Lo/lambdaonPlaybackSuppressionReasonChanged37;Ljava/util/List;)V
    .registers 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/lambdaonPlaybackSuppressionReasonChanged37;",
            "Ljava/util/List<",
            "Lo/lambdaonPlayerError41;",
            ">;)V"
        }
    .end annotation

    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1009
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->size()I

    move-result v0

    .line 1013
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    const/4 v2, 0x0

    :goto_12
    if-ge v2, v0, :cond_31

    .line 1015
    invoke-virtual {p0, v2}, Lo/lambdaonPlaybackSuppressionReasonChanged37;->IconCompatParcelizer(I)Lcom/facebook/GraphRequest;

    move-result-object v3

    .line 1016
    invoke-virtual {v3}, Lcom/facebook/GraphRequest;->MediaBrowserCompatItemReceiver()Lcom/facebook/GraphRequest$write;

    move-result-object v4

    if-eqz v4, :cond_2e

    .line 1017
    new-instance v4, Landroid/util/Pair;

    invoke-virtual {v3}, Lcom/facebook/GraphRequest;->MediaBrowserCompatItemReceiver()Lcom/facebook/GraphRequest$write;

    move-result-object v3

    invoke-interface {p1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    invoke-direct {v4, v3, v5}, Landroid/util/Pair;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v1, v4}, Ljava/util/AbstractCollection;->add(Ljava/lang/Object;)Z

    :cond_2e
    add-int/lit8 v2, v2, 0x1

    goto :goto_12

    .line 1020
    :cond_31
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    if-lez p1, :cond_4b

    .line 1021
    new-instance p1, Lcom/facebook/GraphRequest$IconCompatParcelizer$1;

    invoke-direct {p1, v1, p0}, Lcom/facebook/GraphRequest$IconCompatParcelizer$1;-><init>(Ljava/util/ArrayList;Lo/lambdaonPlaybackSuppressionReasonChanged37;)V

    check-cast p1, Ljava/lang/Runnable;

    .line 1030
    invoke-virtual {p0}, Lo/lambdaonPlaybackSuppressionReasonChanged37;->write()Landroid/os/Handler;

    move-result-object p0

    if-eqz p0, :cond_48

    .line 1032
    invoke-virtual {p0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z

    return-void

    .line 1033
    :cond_48
    invoke-interface {p1}, Ljava/lang/Runnable;->run()V

    :cond_4b
    return-void
.end method

.method private static IconCompatParcelizer(Ljava/lang/Object;)Z
    .registers 2

    .line 1372
    instance-of v0, p0, Landroid/graphics/Bitmap;

    if-nez v0, :cond_16

    .line 1373
    instance-of v0, p0, [B

    if-nez v0, :cond_16

    .line 1374
    instance-of v0, p0, Landroid/net/Uri;

    if-nez v0, :cond_16

    .line 1375
    instance-of v0, p0, Landroid/os/ParcelFileDescriptor;

    if-nez v0, :cond_16

    .line 1376
    instance-of p0, p0, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;

    if-nez p0, :cond_16

    const/4 p0, 0x0

    return p0

    :cond_16
    const/4 p0, 0x1

    return p0
.end method

.method private final IconCompatParcelizer(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Z
    .registers 6

    .line 1074
    invoke-virtual {p1}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_4
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3b

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/GraphRequest;

    .line 1075
    invoke-virtual {v0}, Lcom/facebook/GraphRequest;->RatingCompat()Landroid/os/Bundle;

    move-result-object v1

    invoke-virtual {v1}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/String;

    .line 1076
    invoke-virtual {v0}, Lcom/facebook/GraphRequest;->RatingCompat()Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v3, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v2

    .line 1077
    move-object v3, p0

    check-cast v3, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-static {v2}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->IconCompatParcelizer(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1c

    const/4 p0, 0x0

    return p0

    :cond_3b
    const/4 p0, 0x1

    return p0
.end method

.method private RemoteActionCompatParcelizer(Ljava/util/Collection;)Lo/lambdaonPlaybackStateChanged35;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Collection<",
            "Lcom/facebook/GraphRequest;",
            ">;)",
            "Lo/lambdaonPlaybackStateChanged35;"
        }
    .end annotation

    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 875
    check-cast p0, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    new-instance p0, Lo/lambdaonPlaybackSuppressionReasonChanged37;

    invoke-direct {p0, p1}, Lo/lambdaonPlaybackSuppressionReasonChanged37;-><init>(Ljava/util/Collection;)V

    invoke-static {p0}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Lo/lambdaonPlaybackStateChanged35;

    move-result-object p0

    return-object p0
.end method

.method private final RemoteActionCompatParcelizer(Lo/lambdaonPlaybackSuppressionReasonChanged37;Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;ILjava/net/URL;Ljava/io/OutputStream;Z)V
    .registers 12

    .line 1180
    new-instance v0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;

    invoke-direct {v0, p5, p2, p6}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;-><init>(Ljava/io/OutputStream;Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;Z)V

    const/4 p5, 0x1

    .line 1181
    const-string p6, "  Attachments:\n"

    if-ne p3, p5, :cond_79

    const/4 p3, 0x0

    .line 1182
    invoke-virtual {p1, p3}, Lo/lambdaonPlaybackSuppressionReasonChanged37;->IconCompatParcelizer(I)Lcom/facebook/GraphRequest;

    move-result-object p1

    .line 1183
    new-instance p3, Ljava/util/HashMap;

    invoke-direct {p3}, Ljava/util/HashMap;-><init>()V

    check-cast p3, Ljava/util/Map;

    .line 1184
    invoke-virtual {p1}, Lcom/facebook/GraphRequest;->RatingCompat()Landroid/os/Bundle;

    move-result-object p5

    invoke-virtual {p5}, Landroid/os/Bundle;->keySet()Ljava/util/Set;

    move-result-object p5

    invoke-interface {p5}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p5

    :cond_22
    :goto_22
    invoke-interface {p5}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const-string v2, ""

    if-eqz v1, :cond_4d

    invoke-interface {p5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1185
    invoke-virtual {p1}, Lcom/facebook/GraphRequest;->RatingCompat()Landroid/os/Bundle;

    move-result-object v3

    invoke-virtual {v3, v1}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v3

    .line 1186
    move-object v4, p0

    check-cast v4, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-static {v3}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->IconCompatParcelizer(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_22

    .line 1187
    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;

    invoke-direct {v2, p1, v3}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;-><init>(Lcom/facebook/GraphRequest;Ljava/lang/Object;)V

    invoke-interface {p3, v1, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_22

    :cond_4d
    if-eqz p2, :cond_54

    .line 1190
    const-string p5, "  Parameters:\n"

    invoke-virtual {p2, p5}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->AudioAttributesCompatParcelizer(Ljava/lang/String;)V

    .line 1191
    :cond_54
    move-object p5, p0

    check-cast p5, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-virtual {p1}, Lcom/facebook/GraphRequest;->RatingCompat()Landroid/os/Bundle;

    move-result-object p5

    invoke-direct {p0, p5, v0, p1}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/os/Bundle;Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;Lcom/facebook/GraphRequest;)V

    if-eqz p2, :cond_63

    .line 1192
    invoke-virtual {p2, p6}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->AudioAttributesCompatParcelizer(Ljava/lang/String;)V

    .line 1193
    :cond_63
    invoke-static {p3, v0}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->read(Ljava/util/Map;Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;)V

    .line 1194
    invoke-virtual {p1}, Lcom/facebook/GraphRequest;->AudioAttributesImplApi21Parcelizer()Lorg/json/JSONObject;

    move-result-object p1

    if-eqz p1, :cond_78

    .line 1196
    invoke-virtual {p4}, Ljava/net/URL;->getPath()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v2}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Lorg/json/JSONObject;Ljava/lang/String;Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;)V

    :cond_78
    return-void

    .line 1199
    :cond_79
    check-cast p0, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-static {p1}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->read(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Ljava/lang/String;

    move-result-object p0

    .line 1200
    move-object p3, p0

    check-cast p3, Ljava/lang/CharSequence;

    invoke-interface {p3}, Ljava/lang/CharSequence;->length()I

    move-result p3

    if-eqz p3, :cond_a2

    .line 1203
    const-string p3, "batch_app_id"

    invoke-virtual {v0, p3, p0}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->read(Ljava/lang/String;Ljava/lang/String;)V

    .line 1207
    new-instance p0, Ljava/util/HashMap;

    invoke-direct {p0}, Ljava/util/HashMap;-><init>()V

    check-cast p0, Ljava/util/Map;

    .line 1208
    check-cast p1, Ljava/util/Collection;

    invoke-static {v0, p1, p0}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;Ljava/util/Collection;Ljava/util/Map;)V

    if-eqz p2, :cond_9e

    .line 1209
    invoke-virtual {p2, p6}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->AudioAttributesCompatParcelizer(Ljava/lang/String;)V

    .line 1210
    :cond_9e
    invoke-static {p0, v0}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->read(Ljava/util/Map;Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;)V

    return-void

    .line 1201
    :cond_a2
    new-instance p0, Lo/lambdaonMetadata50;

    const-string p1, "App ID was not specified at the request or Settings."

    invoke-direct {p0, p1}, Lo/lambdaonMetadata50;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    throw p0
.end method

.method public static final synthetic RemoteActionCompatParcelizer(Ljava/lang/Object;)Z
    .registers 1

    .line 204
    invoke-static {p0}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method

.method private static RemoteActionCompatParcelizer(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Z
    .registers 4

    .line 1051
    invoke-virtual {p0}, Lo/lambdaonPlaybackSuppressionReasonChanged37;->RemoteActionCompatParcelizer()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_8
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1a

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/lambdaonPlaybackSuppressionReasonChanged37$IconCompatParcelizer;

    .line 1052
    instance-of v1, v1, Lo/lambdaonPlaybackSuppressionReasonChanged37$read;

    if-eqz v1, :cond_8

    return v2

    .line 1056
    :cond_1a
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_1e
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_33

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/GraphRequest;

    .line 1057
    invoke-virtual {v0}, Lcom/facebook/GraphRequest;->MediaBrowserCompatItemReceiver()Lcom/facebook/GraphRequest$write;

    move-result-object v0

    instance-of v0, v0, Lcom/facebook/GraphRequest$read;

    if-eqz v0, :cond_1e

    return v2

    :cond_33
    const/4 p0, 0x0

    return p0
.end method

.method public static read()Ljava/lang/String;
    .registers 1

    .line 210
    invoke-static {}, Lcom/facebook/GraphRequest;->IconCompatParcelizer()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic read(Ljava/lang/Object;)Ljava/lang/String;
    .registers 1

    .line 204
    invoke-static {p0}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->AudioAttributesImplApi26Parcelizer(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static read(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Ljava/lang/String;
    .registers 3

    .line 1355
    invoke-virtual {p0}, Lo/lambdaonPlaybackSuppressionReasonChanged37;->AudioAttributesCompatParcelizer()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_10

    .line 1356
    move-object v1, p0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_10

    return-object v0

    .line 1359
    :cond_10
    invoke-virtual {p0}, Ljava/util/AbstractCollection;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_14
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_2b

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/GraphRequest;

    .line 1360
    invoke-virtual {v0}, Lcom/facebook/GraphRequest;->AudioAttributesImplBaseParcelizer()Lcom/facebook/AccessToken;

    move-result-object v0

    if-eqz v0, :cond_14

    .line 1362
    invoke-virtual {v0}, Lcom/facebook/AccessToken;->IconCompatParcelizer()Ljava/lang/String;

    move-result-object p0

    return-object p0

    .line 1365
    :cond_2b
    invoke-static {}, Lcom/facebook/GraphRequest;->RemoteActionCompatParcelizer()Ljava/lang/String;

    .line 1368
    invoke-static {}, Lo/lambdaonMediaMetadataChanged48;->write()Ljava/lang/String;

    move-result-object p0

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method private final read(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;Z)V
    .registers 12

    .line 1258
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-result-object v0

    .line 1259
    const-class v1, Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    const/4 v2, 0x2

    const-string v3, ""

    if-eqz v1, :cond_90

    if-eqz p2, :cond_88

    .line 1260
    check-cast p2, Lorg/json/JSONObject;

    if-eqz p4, :cond_46

    .line 1263
    invoke-virtual {p2}, Lorg/json/JSONObject;->keys()Ljava/util/Iterator;

    move-result-object v0

    .line 1264
    :goto_19
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_114

    .line 1265
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    .line 1266
    sget-object v4, Lo/toMagicModuleStatusUcModel;->INSTANCE:Lo/toMagicModuleStatusUcModel;

    filled-new-array {p1, v1}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "%s[%s]"

    invoke-static {v4, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5, v4}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1267
    move-object v5, p0

    check-cast v5, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    .line 1268
    invoke-virtual {p2, v1}, Lorg/json/JSONObject;->opt(Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1267
    invoke-direct {p0, v4, v1, p3, p4}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->read(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;Z)V

    goto :goto_19

    .line 1273
    :cond_46
    const-string v0, "id"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_5c

    .line 1274
    move-object v1, p0

    check-cast v1, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v3}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->read(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;Z)V

    return-void

    .line 1275
    :cond_5c
    const-string v0, "url"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_72

    .line 1276
    move-object v1, p0

    check-cast v1, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v3}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->read(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;Z)V

    return-void

    .line 1277
    :cond_72
    const-string v0, "fbsdk:create_object"

    invoke-virtual {p2, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_114

    .line 1278
    move-object v0, p0

    check-cast v0, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v3}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->read(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;Z)V

    return-void

    .line 1260
    :cond_88
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type org.json.JSONObject"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1281
    :cond_90
    const-class v1, Lorg/json/JSONArray;

    invoke-virtual {v1, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result v1

    if-eqz v1, :cond_d4

    if-eqz p2, :cond_cc

    .line 1282
    check-cast p2, Lorg/json/JSONArray;

    .line 1283
    invoke-virtual {p2}, Lorg/json/JSONArray;->length()I

    move-result v0

    const/4 v1, 0x0

    :goto_a1
    if-ge v1, v0, :cond_114

    .line 1285
    sget-object v4, Lo/toMagicModuleStatusUcModel;->INSTANCE:Lo/toMagicModuleStatusUcModel;

    sget-object v4, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    filled-new-array {p1, v5}, [Ljava/lang/Object;

    move-result-object v5

    const-string v6, "%s[%d]"

    invoke-static {v5, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4, v6, v5}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v3}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1286
    move-object v5, p0

    check-cast v5, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-virtual {p2, v1}, Lorg/json/JSONArray;->opt(I)Ljava/lang/Object;

    move-result-object v5

    invoke-static {v5, v3}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, v4, v5, p3, p4}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->read(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_a1

    .line 1282
    :cond_cc
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type org.json.JSONArray"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1288
    :cond_d4
    const-class p0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-nez p0, :cond_115

    .line 1289
    const-class p0, Ljava/lang/Number;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-nez p0, :cond_115

    .line 1290
    sget-object p0, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-nez p0, :cond_115

    .line 1292
    const-class p0, Ljava/util/Date;

    invoke-virtual {p0, v0}, Ljava/lang/Class;->isAssignableFrom(Ljava/lang/Class;)Z

    move-result p0

    if-eqz p0, :cond_114

    if-eqz p2, :cond_10c

    .line 1293
    check-cast p2, Ljava/util/Date;

    .line 1300
    new-instance p0, Ljava/text/SimpleDateFormat;

    const-string p4, "yyyy-MM-dd\'T\'HH:mm:ssZ"

    sget-object v0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-direct {p0, p4, v0}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V

    .line 1301
    invoke-virtual {p0, p2}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v3}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p3, p1, p0}, Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;->read(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 1293
    :cond_10c
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type java.util.Date"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_114
    return-void

    .line 1291
    :cond_115
    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-interface {p3, p1, p0}, Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;->read(Ljava/lang/String;Ljava/lang/String;)V

    return-void
.end method

.method private static read(Ljava/util/Map;Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;)V
    .registers 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/Map<",
            "Ljava/lang/String;",
            "Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;",
            ">;",
            "Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;",
            ")V"
        }
    .end annotation

    .line 1943
    invoke-interface {p0}, Ljava/util/Map;->entrySet()Ljava/util/Set;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Set;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :cond_8
    :goto_8
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_3e

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/Map$Entry;

    .line 1317
    sget-object v1, Lcom/facebook/GraphRequest;->IconCompatParcelizer:Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v1}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->IconCompatParcelizer(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_8

    .line 1318
    invoke-interface {v0}, Ljava/util/Map$Entry;->getKey()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;

    invoke-virtual {v2}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->write()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v0}, Ljava/util/Map$Entry;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;

    invoke-virtual {v0}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer()Lcom/facebook/GraphRequest;

    move-result-object v0

    invoke-virtual {p1, v1, v2, v0}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/GraphRequest;)V

    goto :goto_8

    :cond_3e
    return-void
.end method

.method private static read(Ljava/lang/String;)Z
    .registers 4

    .line 1216
    invoke-static {}, Lcom/facebook/GraphRequest;->write()Ljava/util/regex/Pattern;

    move-result-object v0

    move-object v1, p0

    check-cast v1, Ljava/lang/CharSequence;

    invoke-virtual {v0, v1}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v0

    .line 1217
    invoke-virtual {v0}, Ljava/util/regex/Matcher;->matches()Z

    move-result v1

    const/4 v2, 0x1

    if-eqz v1, :cond_1b

    .line 1219
    invoke-virtual {v0, v2}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;

    move-result-object p0

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1221
    :cond_1b
    const-string v0, "me/"

    invoke-static {p0, v0}, Lo/TestGroupLSModel;->MediaBrowserCompatCustomActionResultReceiver(Ljava/lang/String;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_2d

    const-string v0, "/me/"

    invoke-static {p0, v0}, Lo/TestGroupLSModel;->MediaBrowserCompatCustomActionResultReceiver(Ljava/lang/String;Ljava/lang/String;)Z

    move-result p0

    if-nez p0, :cond_2d

    const/4 p0, 0x0

    return p0

    :cond_2d
    return v2
.end method

.method private static write()Ljava/lang/String;
    .registers 2

    .line 1336
    sget-object v0, Lo/toMagicModuleStatusUcModel;->INSTANCE:Lo/toMagicModuleStatusUcModel;

    invoke-static {}, Lcom/facebook/GraphRequest;->AudioAttributesCompatParcelizer()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const/4 v1, 0x1

    invoke-static {v0, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v0

    const-string v1, "multipart/form-data; boundary=%s"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public static final synthetic write(Lcom/facebook/GraphRequest$IconCompatParcelizer;Lorg/json/JSONObject;Ljava/lang/String;Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;)V
    .registers 4

    .line 204
    invoke-direct {p0, p1, p2, p3}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->AudioAttributesCompatParcelizer(Lorg/json/JSONObject;Ljava/lang/String;Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;)V

    return-void
.end method

.method private write(Lo/lambdaonPlaybackSuppressionReasonChanged37;Ljava/net/HttpURLConnection;)V
    .registers 18
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/io/IOException;,
            Lorg/json/JSONException;
        }
    .end annotation

    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    move-object v0, p0

    move-object/from16 v8, p1

    move-object/from16 v1, p2

    const-string v2, ""

    invoke-static {v8, v2}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1, v2}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1126
    new-instance v9, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;

    sget-object v3, Lo/lambdaonPositionDiscontinuity43;->AudioAttributesImplBaseParcelizer:Lo/lambdaonPositionDiscontinuity43;

    const-string v4, "Request"

    invoke-direct {v9, v3, v4}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;-><init>(Lo/lambdaonPositionDiscontinuity43;Ljava/lang/String;)V

    .line 1127
    invoke-virtual/range {p1 .. p1}, Ljava/util/AbstractCollection;->size()I

    move-result v10

    .line 1128
    move-object v3, v0

    check-cast v3, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-direct/range {p0 .. p1}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->IconCompatParcelizer(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Z

    move-result v11

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v10, v4, :cond_2f

    const/4 v5, 0x0

    .line 1130
    invoke-virtual {v8, v5}, Lo/lambdaonPlaybackSuppressionReasonChanged37;->IconCompatParcelizer(I)Lcom/facebook/GraphRequest;

    move-result-object v5

    invoke-virtual {v5}, Lcom/facebook/GraphRequest;->MediaDescriptionCompat()Lo/lambdaonPlayWhenReadyChanged36;

    move-result-object v5

    goto :goto_30

    :cond_2f
    move-object v5, v3

    :goto_30
    if-nez v5, :cond_34

    sget-object v5, Lo/lambdaonPlayWhenReadyChanged36;->IconCompatParcelizer:Lo/lambdaonPlayWhenReadyChanged36;

    .line 1131
    :cond_34
    invoke-virtual {v5}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v6}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V

    .line 1132
    invoke-direct {p0, v1, v11}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->IconCompatParcelizer(Ljava/net/HttpURLConnection;Z)V

    .line 1133
    invoke-virtual/range {p2 .. p2}, Ljava/net/URLConnection;->getURL()Ljava/net/URL;

    move-result-object v12

    .line 1134
    const-string v6, "Request:\n"

    invoke-virtual {v9, v6}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->AudioAttributesCompatParcelizer(Ljava/lang/String;)V

    .line 1135
    const-string v6, "Id"

    invoke-virtual/range {p1 .. p1}, Lo/lambdaonPlaybackSuppressionReasonChanged37;->MediaBrowserCompatCustomActionResultReceiver()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v9, v6, v7}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->write(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1136
    invoke-static {v12, v2}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v6, "URL"

    invoke-virtual {v9, v6, v12}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->write(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1137
    invoke-virtual/range {p2 .. p2}, Ljava/net/HttpURLConnection;->getRequestMethod()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v2}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v7, "Method"

    invoke-virtual {v9, v7, v6}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->write(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1138
    const-string v6, "User-Agent"

    invoke-virtual {v1, v6}, Ljava/net/URLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v2}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v6, v7}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->write(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1139
    const-string v6, "Content-Type"

    invoke-virtual {v1, v6}, Ljava/net/URLConnection;->getRequestProperty(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v7, v2}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v9, v6, v7}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->write(Ljava/lang/String;Ljava/lang/Object;)V

    .line 1140
    invoke-virtual/range {p1 .. p1}, Lo/lambdaonPlaybackSuppressionReasonChanged37;->AudioAttributesImplApi26Parcelizer()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setConnectTimeout(I)V

    .line 1141
    invoke-virtual/range {p1 .. p1}, Lo/lambdaonPlaybackSuppressionReasonChanged37;->AudioAttributesImplApi26Parcelizer()I

    move-result v2

    invoke-virtual {v1, v2}, Ljava/net/URLConnection;->setReadTimeout(I)V

    .line 1145
    sget-object v2, Lo/lambdaonPlayWhenReadyChanged36;->IconCompatParcelizer:Lo/lambdaonPlayWhenReadyChanged36;

    if-ne v5, v2, :cond_103

    .line 1150
    invoke-virtual {v1, v4}, Ljava/net/URLConnection;->setDoOutput(Z)V

    .line 1153
    :try_start_91
    new-instance v2, Ljava/io/BufferedOutputStream;

    invoke-virtual/range {p2 .. p2}, Ljava/net/URLConnection;->getOutputStream()Ljava/io/OutputStream;

    move-result-object v1

    invoke-direct {v2, v1}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V

    check-cast v2, Ljava/io/OutputStream;
    :try_end_9c
    .catchall {:try_start_91 .. :try_end_9c} :catchall_fc

    if-eqz v11, :cond_aa

    .line 1155
    :try_start_9e
    new-instance v1, Ljava/util/zip/GZIPOutputStream;

    invoke-direct {v1, v2}, Ljava/util/zip/GZIPOutputStream;-><init>(Ljava/io/OutputStream;)V

    check-cast v1, Ljava/io/OutputStream;
    :try_end_a5
    .catchall {:try_start_9e .. :try_end_a5} :catchall_a7

    move-object v13, v1

    goto :goto_ab

    :catchall_a7
    move-exception v0

    move-object v3, v2

    goto :goto_fd

    :cond_aa
    move-object v13, v2

    .line 1157
    :goto_ab
    :try_start_ab
    move-object v1, v0

    check-cast v1, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-static/range {p1 .. p1}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->RemoteActionCompatParcelizer(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Z

    move-result v1

    if-eqz v1, :cond_e5

    .line 1159
    new-instance v14, Lo/lambdaonRenderedFirstFrame19;

    invoke-virtual/range {p1 .. p1}, Lo/lambdaonPlaybackSuppressionReasonChanged37;->write()Landroid/os/Handler;

    move-result-object v1

    invoke-direct {v14, v1}, Lo/lambdaonRenderedFirstFrame19;-><init>(Landroid/os/Handler;)V

    .line 1160
    move-object v1, v0

    check-cast v1, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    const/4 v3, 0x0

    move-object v6, v14

    check-cast v6, Ljava/io/OutputStream;

    move-object v1, p0

    move-object/from16 v2, p1

    move v4, v10

    move-object v5, v12

    move v7, v11

    invoke-direct/range {v1 .. v7}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->RemoteActionCompatParcelizer(Lo/lambdaonPlaybackSuppressionReasonChanged37;Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;ILjava/net/URL;Ljava/io/OutputStream;Z)V

    .line 1161
    invoke-virtual {v14}, Lo/lambdaonRenderedFirstFrame19;->write()I

    move-result v1

    .line 1162
    invoke-virtual {v14}, Lo/lambdaonRenderedFirstFrame19;->read()Ljava/util/Map;

    move-result-object v4

    .line 1163
    new-instance v7, Lo/lambdaonPlaylistMetadataChanged49;

    int-to-long v5, v1

    move-object v1, v7

    move-object v2, v13

    move-object/from16 v3, p1

    invoke-direct/range {v1 .. v6}, Lo/lambdaonPlaylistMetadataChanged49;-><init>(Ljava/io/OutputStream;Lo/lambdaonPlaybackSuppressionReasonChanged37;Ljava/util/Map;J)V

    check-cast v7, Ljava/io/OutputStream;

    move-object v13, v7

    goto :goto_e5

    :catchall_e3
    move-exception v0

    goto :goto_fa

    .line 1165
    :cond_e5
    :goto_e5
    move-object v1, v0

    check-cast v1, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    move-object v1, p0

    move-object/from16 v2, p1

    move-object v3, v9

    move v4, v10

    move-object v5, v12

    move-object v6, v13

    move v7, v11

    invoke-direct/range {v1 .. v7}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->RemoteActionCompatParcelizer(Lo/lambdaonPlaybackSuppressionReasonChanged37;Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;ILjava/net/URL;Ljava/io/OutputStream;Z)V
    :try_end_f3
    .catchall {:try_start_ab .. :try_end_f3} :catchall_e3

    .line 1167
    invoke-virtual {v13}, Ljava/io/OutputStream;->close()V

    .line 1169
    invoke-virtual {v9}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->IconCompatParcelizer()V

    return-void

    :goto_fa
    move-object v3, v13

    goto :goto_fd

    :catchall_fc
    move-exception v0

    :goto_fd
    if-eqz v3, :cond_102

    .line 1167
    invoke-virtual {v3}, Ljava/io/OutputStream;->close()V

    :cond_102
    throw v0

    .line 1147
    :cond_103
    invoke-virtual {v9}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->IconCompatParcelizer()V

    return-void
.end method

.method public static final synthetic write(Ljava/lang/Object;)Z
    .registers 1

    .line 204
    invoke-static {p0}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->IconCompatParcelizer(Ljava/lang/Object;)Z

    move-result p0

    return p0
.end method


# virtual methods
.method public final varargs RemoteActionCompatParcelizer([Lcom/facebook/GraphRequest;)Lo/lambdaonPlaybackStateChanged35;
    .registers 3
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 857
    move-object v0, p0

    check-cast v0, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-static {p1}, Lo/getOrderDetails;->onCommand([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/Collection;

    invoke-direct {p0, p1}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->RemoteActionCompatParcelizer(Ljava/util/Collection;)Lo/lambdaonPlaybackStateChanged35;

    move-result-object p0

    return-object p0
.end method

.method public final read(Lcom/facebook/GraphRequest;)Lo/lambdaonPlayerError41;
    .registers 5
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 761
    move-object v0, p0

    check-cast v0, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    const/4 v0, 0x1

    new-array v1, v0, [Lcom/facebook/GraphRequest;

    const/4 v2, 0x0

    aput-object p1, v1, v2

    invoke-direct {p0, v1}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->IconCompatParcelizer([Lcom/facebook/GraphRequest;)Ljava/util/List;

    move-result-object p0

    .line 762
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result p1

    if-ne p1, v0, :cond_1f

    .line 765
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lo/lambdaonPlayerError41;

    return-object p0

    .line 763
    :cond_1f
    new-instance p0, Lo/lambdaonMetadata50;

    const-string p1, "invalid state: expected a single response"

    invoke-direct {p0, p1}, Lo/lambdaonMetadata50;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    throw p0
.end method

.method public final write(Ljava/net/HttpURLConnection;Lo/lambdaonPlaybackSuppressionReasonChanged37;)Ljava/util/List;
    .registers 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/net/HttpURLConnection;",
            "Lo/lambdaonPlaybackSuppressionReasonChanged37;",
            ")",
            "Ljava/util/List<",
            "Lo/lambdaonPlayerError41;",
            ">;"
        }
    .end annotation

    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 940
    sget-object v1, Lo/lambdaonPlayerError41;->AudioAttributesCompatParcelizer:Lo/lambdaonPlayerError41$AudioAttributesCompatParcelizer;

    invoke-virtual {v1, p1, p2}, Lo/lambdaonPlayerError41$AudioAttributesCompatParcelizer;->write(Ljava/net/HttpURLConnection;Lo/lambdaonPlaybackSuppressionReasonChanged37;)Ljava/util/List;

    move-result-object v1

    .line 941
    check-cast p1, Ljava/net/URLConnection;

    invoke-static {p1}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->write(Ljava/net/URLConnection;)V

    .line 942
    invoke-virtual {p2}, Ljava/util/AbstractCollection;->size()I

    move-result p1

    .line 943
    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result v2

    if-ne p1, v2, :cond_2c

    .line 948
    check-cast p0, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-static {p2, v1}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->IconCompatParcelizer(Lo/lambdaonPlaybackSuppressionReasonChanged37;Ljava/util/List;)V

    .line 951
    sget-object p0, Lo/lambdaonLoadError26;->read:Lo/lambdaonLoadError26$read;

    invoke-virtual {p0}, Lo/lambdaonLoadError26$read;->read()Lo/lambdaonLoadError26;

    move-result-object p0

    invoke-virtual {p0}, Lo/lambdaonLoadError26;->AudioAttributesCompatParcelizer()V

    return-object v1

    .line 945
    :cond_2c
    sget-object p0, Lo/toMagicModuleStatusUcModel;->INSTANCE:Lo/toMagicModuleStatusUcModel;

    .line 946
    sget-object p0, Ljava/util/Locale;->US:Ljava/util/Locale;

    invoke-interface {v1}, Ljava/util/List;->size()I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    filled-new-array {p2, p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x2

    .line 945
    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "Received %d responses while expecting %d"

    invoke-static {p0, p2, p1}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 944
    new-instance p1, Lo/lambdaonMetadata50;

    invoke-direct {p1, p0}, Lo/lambdaonMetadata50;-><init>(Ljava/lang/String;)V

    check-cast p1, Ljava/lang/Throwable;

    throw p1
.end method

.method public final write(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Ljava/util/List;
    .registers 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo/lambdaonPlaybackSuppressionReasonChanged37;",
            ")",
            "Ljava/util/List<",
            "Lo/lambdaonPlayerError41;",
            ">;"
        }
    .end annotation

    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 819
    move-object v0, p1

    check-cast v0, Ljava/util/Collection;

    const-string v1, "requests"

    invoke-static {v0, v1}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda8;->AudioAttributesCompatParcelizer(Ljava/util/Collection;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 825
    :try_start_e
    move-object v1, p0

    check-cast v1, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-direct {p0, p1}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->AudioAttributesImplBaseParcelizer(Lo/lambdaonPlaybackSuppressionReasonChanged37;)Ljava/net/HttpURLConnection;

    move-result-object v1
    :try_end_15
    .catch Ljava/lang/Exception; {:try_start_e .. :try_end_15} :catch_19
    .catchall {:try_start_e .. :try_end_15} :catchall_17

    move-object v2, v0

    goto :goto_1c

    :catchall_17
    move-exception p0

    goto :goto_45

    :catch_19
    move-exception v1

    move-object v2, v1

    move-object v1, v0

    :goto_1c
    if-eqz v1, :cond_26

    .line 831
    :try_start_1e
    move-object v0, p0

    check-cast v0, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-virtual {p0, v1, p1}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->write(Ljava/net/HttpURLConnection;Lo/lambdaonPlaybackSuppressionReasonChanged37;)Ljava/util/List;

    move-result-object p0

    goto :goto_3d

    .line 834
    :cond_26
    sget-object v3, Lo/lambdaonPlayerError41;->AudioAttributesCompatParcelizer:Lo/lambdaonPlayerError41$AudioAttributesCompatParcelizer;

    invoke-virtual {p1}, Lo/lambdaonPlaybackSuppressionReasonChanged37;->AudioAttributesImplApi21Parcelizer()Ljava/util/List;

    move-result-object v3

    new-instance v4, Lo/lambdaonMetadata50;

    check-cast v2, Ljava/lang/Throwable;

    invoke-direct {v4, v2}, Lo/lambdaonMetadata50;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v3, v0, v4}, Lo/lambdaonPlayerError41$AudioAttributesCompatParcelizer;->write(Ljava/util/List;Ljava/net/HttpURLConnection;Lo/lambdaonMetadata50;)Ljava/util/List;

    move-result-object v0

    .line 835
    check-cast p0, Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-static {p1, v0}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->IconCompatParcelizer(Lo/lambdaonPlaybackSuppressionReasonChanged37;Ljava/util/List;)V
    :try_end_3c
    .catchall {:try_start_1e .. :try_end_3c} :catchall_43

    move-object p0, v0

    .line 839
    :goto_3d
    check-cast v1, Ljava/net/URLConnection;

    invoke-static {v1}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->write(Ljava/net/URLConnection;)V

    return-object p0

    :catchall_43
    move-exception p0

    move-object v0, v1

    :goto_45
    check-cast v0, Ljava/net/URLConnection;

    invoke-static {v0}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->write(Ljava/net/URLConnection;)V

    throw p0
.end method

###### Class com.facebook.GraphRequest.Companion.AnonymousClass1 (com.facebook.GraphRequest$IconCompatParcelizer$1)
.class final Lcom/facebook/GraphRequest$IconCompatParcelizer$1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/facebook/GraphRequest$IconCompatParcelizer;->IconCompatParcelizer(Lo/lambdaonPlaybackSuppressionReasonChanged37;Ljava/util/List;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = null
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0008\n\u0002\u0010\u0002\n\u0002\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\n\u00a2\u0006\u0004\u0008\u0001\u0010\u0002"
    }
    d2 = {
        "",
        "run",
        "()V"
    }
    k = 0x3
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# instance fields
.field private synthetic $AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

.field private synthetic $RemoteActionCompatParcelizer:Lo/lambdaonPlaybackSuppressionReasonChanged37;


# direct methods
.method constructor <init>(Ljava/util/ArrayList;Lo/lambdaonPlaybackSuppressionReasonChanged37;)V
    .registers 3

    .line 1030
    iput-object p1, p0, Lcom/facebook/GraphRequest$IconCompatParcelizer$1;->$AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    iput-object p2, p0, Lcom/facebook/GraphRequest$IconCompatParcelizer$1;->$RemoteActionCompatParcelizer:Lo/lambdaonPlaybackSuppressionReasonChanged37;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final run()V
    .registers 5

    invoke-static {p0}, Lo/getMinWindowSequenceNumber;->IconCompatParcelizer(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_54

    :try_start_6
    invoke-static {p0}, Lo/getMinWindowSequenceNumber;->IconCompatParcelizer(Ljava/lang/Object;)Z

    move-result v0
    :try_end_a
    .catchall {:try_start_6 .. :try_end_a} :catchall_50

    if-nez v0, :cond_54

    .line 1022
    :try_start_c
    iget-object v0, p0, Lcom/facebook/GraphRequest$IconCompatParcelizer$1;->$AudioAttributesCompatParcelizer:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_2f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/util/Pair;

    .line 1023
    iget-object v2, v1, Landroid/util/Pair;->first:Ljava/lang/Object;

    check-cast v2, Lcom/facebook/GraphRequest$write;

    iget-object v1, v1, Landroid/util/Pair;->second:Ljava/lang/Object;

    const-string v3, ""

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lo/lambdaonPlayerError41;

    invoke-interface {v2, v1}, Lcom/facebook/GraphRequest$write;->IconCompatParcelizer(Lo/lambdaonPlayerError41;)V

    goto :goto_12

    .line 1025
    :cond_2f
    iget-object v0, p0, Lcom/facebook/GraphRequest$IconCompatParcelizer$1;->$RemoteActionCompatParcelizer:Lo/lambdaonPlaybackSuppressionReasonChanged37;

    invoke-virtual {v0}, Lo/lambdaonPlaybackSuppressionReasonChanged37;->RemoteActionCompatParcelizer()Ljava/util/List;

    move-result-object v0

    .line 1026
    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_39
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_54

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lo/lambdaonPlaybackSuppressionReasonChanged37$IconCompatParcelizer;

    .line 1027
    iget-object v2, p0, Lcom/facebook/GraphRequest$IconCompatParcelizer$1;->$RemoteActionCompatParcelizer:Lo/lambdaonPlaybackSuppressionReasonChanged37;

    invoke-interface {v1, v2}, Lo/lambdaonPlaybackSuppressionReasonChanged37$IconCompatParcelizer;->RemoteActionCompatParcelizer(Lo/lambdaonPlaybackSuppressionReasonChanged37;)V
    :try_end_4a
    .catchall {:try_start_c .. :try_end_4a} :catchall_4b

    goto :goto_39

    :catchall_4b
    move-exception v0

    .line 1029
    :try_start_4c
    invoke-static {v0, p0}, Lo/getMinWindowSequenceNumber;->read(Ljava/lang/Throwable;Ljava/lang/Object;)V
    :try_end_4f
    .catchall {:try_start_4c .. :try_end_4f} :catchall_50

    goto :goto_54

    :catchall_50
    move-exception v0

    invoke-static {v0, p0}, Lo/getMinWindowSequenceNumber;->read(Ljava/lang/Throwable;Ljava/lang/Object;)V

    :cond_54
    :goto_54
    return-void
.end method

###### Class com.facebook.GraphRequest.MediaBrowserCompatCustomActionResultReceiver (com.facebook.GraphRequest$MediaBrowserCompatCustomActionResultReceiver)
.class final Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/GraphRequest$AudioAttributesCompatParcelizer;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/GraphRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "MediaBrowserCompatCustomActionResultReceiver"
.end annotation


# instance fields
.field private final AudioAttributesCompatParcelizer:Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;

.field private IconCompatParcelizer:Z

.field private final read:Ljava/io/OutputStream;

.field private final write:Z


# direct methods
.method public constructor <init>(Ljava/io/OutputStream;Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;Z)V
    .registers 5

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1668
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->read:Ljava/io/OutputStream;

    iput-object p2, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer:Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;

    const/4 p1, 0x1

    .line 1673
    iput-boolean p1, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer:Z

    .line 1674
    iput-boolean p3, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->write:Z

    return-void
.end method

.method private AudioAttributesCompatParcelizer(Ljava/lang/String;Landroid/graphics/Bitmap;)V
    .registers 7

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1740
    const-string v1, "image/png"

    invoke-direct {p0, p1, p1, v1}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1742
    sget-object v1, Landroid/graphics/Bitmap$CompressFormat;->PNG:Landroid/graphics/Bitmap$CompressFormat;

    const/16 v2, 0x64

    iget-object v3, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->read:Ljava/io/OutputStream;

    invoke-virtual {p2, v1, v2, v3}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z

    const/4 p2, 0x0

    .line 1743
    new-array p2, p2, [Ljava/lang/Object;

    invoke-direct {p0, v0, p2}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1744
    invoke-direct {p0}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->write()V

    .line 1745
    iget-object p0, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer:Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;

    if-eqz p0, :cond_32

    const-string p2, "    "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    const-string p2, "<Image>"

    invoke-virtual {p0, p1, p2}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->write(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_32
    return-void
.end method

.method private AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .registers 6

    .line 1805
    iget-boolean v0, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->write:Z

    const-string v1, ""

    if-nez v0, :cond_33

    .line 1806
    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const-string v0, "Content-Disposition: form-data; name=\"%s\""

    invoke-direct {p0, v0, p1}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p2, :cond_1a

    .line 1808
    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p1

    const-string p2, "; filename=\"%s\""

    invoke-direct {p0, p2, p1}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1a
    const/4 p1, 0x0

    .line 1810
    new-array p2, p1, [Ljava/lang/Object;

    invoke-direct {p0, v1, p2}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(Ljava/lang/String;[Ljava/lang/Object;)V

    if-eqz p3, :cond_2d

    .line 1812
    const-string p2, "Content-Type"

    filled-new-array {p2, p3}, [Ljava/lang/Object;

    move-result-object p2

    const-string p3, "%s: %s"

    invoke-direct {p0, p3, p2}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1814
    :cond_2d
    new-array p1, p1, [Ljava/lang/Object;

    invoke-direct {p0, v1, p1}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 1816
    :cond_33
    iget-object p0, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->read:Ljava/io/OutputStream;

    sget-object p2, Lo/toMagicModuleStatusUcModel;->INSTANCE:Lo/toMagicModuleStatusUcModel;

    filled-new-array {p1}, [Ljava/lang/Object;

    move-result-object p1

    const/4 p2, 0x1

    invoke-static {p1, p2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p1

    const-string p2, "%s="

    invoke-static {p2, p1}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lo/getSubmissionTimestamp;->AudioAttributesCompatParcelizer:Ljava/nio/charset/Charset;

    if-eqz p1, :cond_58

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-static {p1, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    return-void

    :cond_58
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type java.lang.String"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private varargs AudioAttributesCompatParcelizer(Ljava/lang/String;[Ljava/lang/Object;)V
    .registers 4

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1837
    array-length v0, p2

    invoke-static {p2, v0}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-direct {p0, p1, p2}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1838
    iget-boolean p1, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->write:Z

    if-nez p1, :cond_1c

    const/4 p1, 0x0

    .line 1839
    new-array p1, p1, [Ljava/lang/Object;

    const-string p2, "\r\n"

    invoke-direct {p0, p2, p1}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer(Ljava/lang/String;[Ljava/lang/Object;)V

    :cond_1c
    return-void
.end method

.method private static IconCompatParcelizer()Ljava/lang/RuntimeException;
    .registers 2

    .line 1705
    new-instance v0, Ljava/lang/IllegalArgumentException;

    const-string v1, "value is not a supported type."

    invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    check-cast v0, Ljava/lang/RuntimeException;

    return-object v0
.end method

.method private IconCompatParcelizer(Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V
    .registers 9

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p3, :cond_c

    .line 1780
    const-string p3, "content/unknown"

    .line 1782
    :cond_c
    invoke-direct {p0, p1, p1, p3}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1784
    iget-object p3, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->read:Ljava/io/OutputStream;

    instance-of v1, p3, Lo/lambdaonRenderedFirstFrame19;

    const/4 v2, 0x0

    if-eqz v1, :cond_21

    .line 1786
    check-cast p3, Lo/lambdaonRenderedFirstFrame19;

    invoke-virtual {p2}, Landroid/os/ParcelFileDescriptor;->getStatSize()J

    move-result-wide v3

    invoke-virtual {p3, v3, v4}, Lo/lambdaonRenderedFirstFrame19;->read(J)V

    move p2, v2

    goto :goto_2e

    .line 1788
    :cond_21
    new-instance p3, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;

    invoke-direct {p3, p2}, Landroid/os/ParcelFileDescriptor$AutoCloseInputStream;-><init>(Landroid/os/ParcelFileDescriptor;)V

    .line 1789
    check-cast p3, Ljava/io/InputStream;

    iget-object p2, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->read:Ljava/io/OutputStream;

    invoke-static {p3, p2}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->AudioAttributesCompatParcelizer(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    move-result p2

    .line 1791
    :goto_2e
    new-array p3, v2, [Ljava/lang/Object;

    invoke-direct {p0, v0, p3}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1792
    invoke-direct {p0}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->write()V

    .line 1793
    iget-object p0, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer:Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;

    if-eqz p0, :cond_61

    const-string p3, "    "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object p3, Lo/toMagicModuleStatusUcModel;->INSTANCE:Lo/toMagicModuleStatusUcModel;

    sget-object p3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const/4 v1, 0x1

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    const-string v1, "<Data: %d>"

    invoke-static {p3, v1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->write(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_61
    return-void
.end method

.method private varargs RemoteActionCompatParcelizer(Ljava/lang/String;[Ljava/lang/Object;)V
    .registers 8

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1821
    iget-boolean v1, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->write:Z

    const-string v2, "null cannot be cast to non-null type java.lang.String"

    if-nez v1, :cond_7a

    .line 1822
    iget-boolean v1, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer:Z

    if-eqz v1, :cond_50

    .line 1824
    iget-object v1, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->read:Ljava/io/OutputStream;

    const-string v3, "--"

    sget-object v4, Lo/getSubmissionTimestamp;->AudioAttributesCompatParcelizer:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    invoke-static {v3, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/io/OutputStream;->write([B)V

    .line 1825
    iget-object v1, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->read:Ljava/io/OutputStream;

    invoke-static {}, Lcom/facebook/GraphRequest;->AudioAttributesCompatParcelizer()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lo/getSubmissionTimestamp;->AudioAttributesCompatParcelizer:Ljava/nio/charset/Charset;

    if-eqz v3, :cond_4a

    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    invoke-static {v3, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/io/OutputStream;->write([B)V

    .line 1826
    iget-object v1, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->read:Ljava/io/OutputStream;

    const-string v3, "\r\n"

    sget-object v4, Lo/getSubmissionTimestamp;->AudioAttributesCompatParcelizer:Ljava/nio/charset/Charset;

    invoke-virtual {v3, v4}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v3

    invoke-static {v3, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1, v3}, Ljava/io/OutputStream;->write([B)V

    const/4 v1, 0x0

    .line 1827
    iput-boolean v1, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer:Z

    goto :goto_50

    .line 1825
    :cond_4a
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1829
    :cond_50
    :goto_50
    iget-object p0, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->read:Ljava/io/OutputStream;

    sget-object v1, Lo/toMagicModuleStatusUcModel;->INSTANCE:Lo/toMagicModuleStatusUcModel;

    array-length v1, p2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    array-length v1, p2

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {p1, p2}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lo/getSubmissionTimestamp;->AudioAttributesCompatParcelizer:Ljava/nio/charset/Charset;

    if-eqz p1, :cond_74

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    return-void

    :cond_74
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1831
    :cond_7a
    iget-object p0, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->read:Ljava/io/OutputStream;

    .line 1832
    sget-object v1, Lo/toMagicModuleStatusUcModel;->INSTANCE:Lo/toMagicModuleStatusUcModel;

    sget-object v1, Ljava/util/Locale;->US:Ljava/util/Locale;

    array-length v3, p2

    invoke-static {p2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    array-length v3, p2

    invoke-static {p2, v3}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    invoke-static {v1, p1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p2, "UTF-8"

    invoke-static {p1, p2}, Ljava/net/URLEncoder;->encode(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Lo/getSubmissionTimestamp;->AudioAttributesCompatParcelizer:Ljava/nio/charset/Charset;

    if-eqz p1, :cond_a9

    invoke-virtual {p1, p2}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object p1

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1831
    invoke-virtual {p0, p1}, Ljava/io/OutputStream;->write([B)V

    return-void

    .line 1832
    :cond_a9
    new-instance p0, Ljava/lang/NullPointerException;

    invoke-direct {p0, v2}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method private write()V
    .registers 3

    .line 1797
    iget-boolean v0, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->write:Z

    if-nez v0, :cond_12

    .line 1798
    invoke-static {}, Lcom/facebook/GraphRequest;->AudioAttributesCompatParcelizer()Ljava/lang/String;

    move-result-object v0

    filled-new-array {v0}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "--%s"

    invoke-direct {p0, v1, v0}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(Ljava/lang/String;[Ljava/lang/Object;)V

    return-void

    .line 1800
    :cond_12
    iget-object p0, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->read:Ljava/io/OutputStream;

    const-string v0, "&"

    sget-object v1, Lo/getSubmissionTimestamp;->AudioAttributesCompatParcelizer:Ljava/nio/charset/Charset;

    invoke-virtual {v0, v1}, Ljava/lang/String;->getBytes(Ljava/nio/charset/Charset;)[B

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Ljava/io/OutputStream;->write([B)V

    return-void
.end method

.method private write(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V
    .registers 7

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p3, :cond_c

    .line 1759
    const-string p3, "content/unknown"

    .line 1761
    :cond_c
    invoke-direct {p0, p1, p1, p3}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1763
    iget-object p3, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->read:Ljava/io/OutputStream;

    instance-of p3, p3, Lo/lambdaonRenderedFirstFrame19;

    const/4 v1, 0x0

    if-eqz p3, :cond_23

    .line 1765
    invoke-static {p2}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->write(Landroid/net/Uri;)J

    move-result-wide p2

    .line 1766
    iget-object v2, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->read:Ljava/io/OutputStream;

    check-cast v2, Lo/lambdaonRenderedFirstFrame19;

    invoke-virtual {v2, p2, p3}, Lo/lambdaonRenderedFirstFrame19;->read(J)V

    move p2, v1

    goto :goto_38

    .line 1769
    :cond_23
    invoke-static {}, Lo/lambdaonMediaMetadataChanged48;->AudioAttributesCompatParcelizer()Landroid/content/Context;

    move-result-object p3

    invoke-static {p3, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p3}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;

    move-result-object p3

    invoke-virtual {p3, p2}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;

    move-result-object p2

    .line 1770
    iget-object p3, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->read:Ljava/io/OutputStream;

    invoke-static {p2, p3}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->AudioAttributesCompatParcelizer(Ljava/io/InputStream;Ljava/io/OutputStream;)I

    move-result p2

    .line 1772
    :goto_38
    new-array p3, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, p3}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1773
    invoke-direct {p0}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->write()V

    .line 1774
    iget-object p0, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer:Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;

    if-eqz p0, :cond_6b

    const-string p3, "    "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object p3, Lo/toMagicModuleStatusUcModel;->INSTANCE:Lo/toMagicModuleStatusUcModel;

    sget-object p3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const/4 v1, 0x1

    invoke-static {p2, v1}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    const-string v1, "<Data: %d>"

    invoke-static {p3, v1, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->write(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_6b
    return-void
.end method

.method private write(Ljava/lang/String;[B)V
    .registers 6

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1749
    const-string v1, "content/unknown"

    invoke-direct {p0, p1, p1, v1}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1750
    iget-object v1, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->read:Ljava/io/OutputStream;

    invoke-virtual {v1, p2}, Ljava/io/OutputStream;->write([B)V

    const/4 v1, 0x0

    .line 1751
    new-array v1, v1, [Ljava/lang/Object;

    invoke-direct {p0, v0, v1}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1752
    invoke-direct {p0}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->write()V

    .line 1753
    iget-object p0, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer:Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;

    if-eqz p0, :cond_47

    const-string v1, "    "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    sget-object v1, Lo/toMagicModuleStatusUcModel;->INSTANCE:Lo/toMagicModuleStatusUcModel;

    sget-object v1, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    array-length p2, p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object p2

    const/4 v2, 0x1

    invoke-static {p2, v2}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object p2

    const-string v2, "<Data: %d>"

    invoke-static {v1, v2, p2}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->write(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_47
    return-void
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Ljava/lang/String;Lorg/json/JSONArray;Ljava/util/Collection;)V
    .registers 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lorg/json/JSONArray;",
            "Ljava/util/Collection<",
            "Lcom/facebook/GraphRequest;",
            ">;)V"
        }
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1712
    iget-object v1, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->read:Ljava/io/OutputStream;

    instance-of v2, v1, Lo/lambdaonShuffleModeEnabledChanged40;

    if-nez v2, :cond_1c

    .line 1713
    invoke-virtual {p2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->read(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    :cond_1c
    if-eqz v1, :cond_86

    .line 1716
    check-cast v1, Lo/lambdaonShuffleModeEnabledChanged40;

    const/4 v2, 0x0

    .line 1717
    invoke-direct {p0, p1, v2, v2}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1718
    const-string v2, "["

    const/4 v3, 0x0

    new-array v4, v3, [Ljava/lang/Object;

    invoke-direct {p0, v2, v4}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1719
    check-cast p3, Ljava/lang/Iterable;

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    move v2, v3

    :goto_33
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_66

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/facebook/GraphRequest;

    .line 1720
    invoke-virtual {p2, v2}, Lorg/json/JSONArray;->getJSONObject(I)Lorg/json/JSONObject;

    move-result-object v5

    .line 1721
    invoke-interface {v1, v4}, Lo/lambdaonShuffleModeEnabledChanged40;->AudioAttributesCompatParcelizer(Lcom/facebook/GraphRequest;)V

    if-lez v2, :cond_56

    .line 1723
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, ",%s"

    invoke-direct {p0, v5, v4}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_63

    .line 1725
    :cond_56
    invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;

    move-result-object v4

    filled-new-array {v4}, [Ljava/lang/Object;

    move-result-object v4

    const-string v5, "%s"

    invoke-direct {p0, v5, v4}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer(Ljava/lang/String;[Ljava/lang/Object;)V

    :goto_63
    add-int/lit8 v2, v2, 0x1

    goto :goto_33

    .line 1728
    :cond_66
    const-string p3, "]"

    new-array v1, v3, [Ljava/lang/Object;

    invoke-direct {p0, p3, v1}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->RemoteActionCompatParcelizer(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1729
    iget-object p0, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer:Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;

    if-eqz p0, :cond_85

    const-string p3, "    "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p3, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p2}, Lorg/json/JSONArray;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p1, p2}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->write(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_85
    return-void

    .line 1716
    :cond_86
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type com.facebook.RequestOutputStream"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0
.end method

.method public final IconCompatParcelizer(Ljava/lang/String;Ljava/lang/Object;Lcom/facebook/GraphRequest;)V
    .registers 6

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1676
    iget-object v0, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->read:Ljava/io/OutputStream;

    instance-of v1, v0, Lo/lambdaonShuffleModeEnabledChanged40;

    if-eqz v1, :cond_1b

    if-eqz v0, :cond_13

    .line 1677
    check-cast v0, Lo/lambdaonShuffleModeEnabledChanged40;

    invoke-interface {v0, p3}, Lo/lambdaonShuffleModeEnabledChanged40;->AudioAttributesCompatParcelizer(Lcom/facebook/GraphRequest;)V

    goto :goto_1b

    :cond_13
    new-instance p0, Ljava/lang/NullPointerException;

    const-string p1, "null cannot be cast to non-null type com.facebook.RequestOutputStream"

    invoke-direct {p0, p1}, Ljava/lang/NullPointerException;-><init>(Ljava/lang/String;)V

    throw p0

    .line 1679
    :cond_1b
    :goto_1b
    sget-object p3, Lcom/facebook/GraphRequest;->IconCompatParcelizer:Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-static {p2}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->RemoteActionCompatParcelizer(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_2d

    .line 1680
    sget-object p3, Lcom/facebook/GraphRequest;->IconCompatParcelizer:Lcom/facebook/GraphRequest$IconCompatParcelizer;

    invoke-static {p2}, Lcom/facebook/GraphRequest$IconCompatParcelizer;->read(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p0, p1, p2}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->read(Ljava/lang/String;Ljava/lang/String;)V

    return-void

    .line 1681
    :cond_2d
    instance-of p3, p2, Landroid/graphics/Bitmap;

    if-eqz p3, :cond_37

    .line 1682
    check-cast p2, Landroid/graphics/Bitmap;

    invoke-direct {p0, p1, p2}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    return-void

    .line 1683
    :cond_37
    instance-of p3, p2, [B

    if-eqz p3, :cond_41

    .line 1684
    check-cast p2, [B

    invoke-direct {p0, p1, p2}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->write(Ljava/lang/String;[B)V

    return-void

    .line 1685
    :cond_41
    instance-of p3, p2, Landroid/net/Uri;

    const/4 v0, 0x0

    if-eqz p3, :cond_4c

    .line 1686
    check-cast p2, Landroid/net/Uri;

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->write(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V

    return-void

    .line 1687
    :cond_4c
    instance-of p3, p2, Landroid/os/ParcelFileDescriptor;

    if-eqz p3, :cond_56

    .line 1688
    check-cast p2, Landroid/os/ParcelFileDescriptor;

    invoke-direct {p0, p1, p2, v0}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer(Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V

    return-void

    .line 1689
    :cond_56
    instance-of p3, p2, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;

    if-eqz p3, :cond_7f

    .line 1690
    check-cast p2, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;

    invoke-virtual {p2}, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;->write()Landroid/os/Parcelable;

    move-result-object p3

    .line 1691
    invoke-virtual {p2}, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;->read()Ljava/lang/String;

    move-result-object p2

    .line 1692
    instance-of v0, p3, Landroid/os/ParcelFileDescriptor;

    if-eqz v0, :cond_6e

    .line 1693
    check-cast p3, Landroid/os/ParcelFileDescriptor;

    invoke-direct {p0, p1, p3, p2}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer(Ljava/lang/String;Landroid/os/ParcelFileDescriptor;Ljava/lang/String;)V

    return-void

    .line 1694
    :cond_6e
    instance-of v0, p3, Landroid/net/Uri;

    if-eqz v0, :cond_78

    .line 1695
    check-cast p3, Landroid/net/Uri;

    invoke-direct {p0, p1, p3, p2}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->write(Ljava/lang/String;Landroid/net/Uri;Ljava/lang/String;)V

    return-void

    .line 1697
    :cond_78
    invoke-static {}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer()Ljava/lang/RuntimeException;

    move-result-object p0

    check-cast p0, Ljava/lang/Throwable;

    throw p0

    .line 1700
    :cond_7f
    invoke-static {}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->IconCompatParcelizer()Ljava/lang/RuntimeException;

    move-result-object p0

    check-cast p0, Ljava/lang/Throwable;

    throw p0
.end method

.method public final read(Ljava/lang/String;Ljava/lang/String;)V
    .registers 5

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    .line 1733
    invoke-direct {p0, p1, v0, v0}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    .line 1734
    filled-new-array {p2}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "%s"

    invoke-direct {p0, v1, v0}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer(Ljava/lang/String;[Ljava/lang/Object;)V

    .line 1735
    invoke-direct {p0}, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->write()V

    .line 1736
    iget-object p0, p0, Lcom/facebook/GraphRequest$MediaBrowserCompatCustomActionResultReceiver;->AudioAttributesCompatParcelizer:Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;

    if-eqz p0, :cond_29

    const-string v0, "    "

    invoke-static {p1}, Ljava/lang/String;->valueOf(Ljava/lang/Object;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1, p2}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda68;->write(Ljava/lang/String;Ljava/lang/Object;)V

    :cond_29
    return-void
.end method

###### Class com.facebook.GraphRequest.ParcelableResourceWithMimeType (com.facebook.GraphRequest$ParcelableResourceWithMimeType)
.class public final Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/GraphRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "ParcelableResourceWithMimeType"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$AudioAttributesCompatParcelizer;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "<RESOURCE::",
        "Landroid/os/Parcelable;",
        ">",
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\t\u0008\u0000\u0018\u0000 \u0017*\n\u0008\u0000\u0010\u0002*\u0004\u0018\u00010\u00012\u00020\u0001:\u0001\u0017B\u0011\u0008\u0012\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0006J\u000f\u0010\u0008\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u0008\u0010\tJ\u001f\u0010\u000c\u001a\u00020\u000b2\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\u0007H\u0016\u00a2\u0006\u0004\u0008\u000c\u0010\rR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u000e8\u0007\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u001c\u0010\u0011\u001a\u0004\u0018\u00018\u00008\u0007X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010\u0015\u001a\u0004\u0008\u0014\u0010\u0016"
    }
    d2 = {
        "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;",
        "Landroid/os/Parcelable;",
        "RESOURCE",
        "Landroid/os/Parcel;",
        "p0",
        "<init>",
        "(Landroid/os/Parcel;)V",
        "",
        "describeContents",
        "()I",
        "p1",
        "",
        "writeToParcel",
        "(Landroid/os/Parcel;I)V",
        "",
        "IconCompatParcelizer",
        "Ljava/lang/String;",
        "read",
        "()Ljava/lang/String;",
        "RemoteActionCompatParcelizer",
        "write",
        "Landroid/os/Parcelable;",
        "()Landroid/os/Parcelable;",
        "AudioAttributesCompatParcelizer"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final AudioAttributesCompatParcelizer:Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$AudioAttributesCompatParcelizer;

.field private static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType<",
            "*>;>;"
        }
    .end annotation
.end field


# instance fields
.field private final IconCompatParcelizer:Ljava/lang/String;

.field private final write:Landroid/os/Parcelable;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "TRESOURCE;"
        }
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$AudioAttributesCompatParcelizer;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$AudioAttributesCompatParcelizer;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;->AudioAttributesCompatParcelizer:Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$AudioAttributesCompatParcelizer;

    .line 1928
    new-instance v0, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$write;

    invoke-direct {v0}, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$write;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 4

    .line 1922
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    iput-object v0, p0, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;->IconCompatParcelizer:Ljava/lang/String;

    .line 1923
    invoke-static {}, Lo/lambdaonMediaMetadataChanged48;->AudioAttributesCompatParcelizer()Landroid/content/Context;

    move-result-object v0

    const-string v1, ""

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v0}, Landroid/content/Context;->getClassLoader()Ljava/lang/ClassLoader;

    move-result-object v0

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->readParcelable(Ljava/lang/ClassLoader;)Landroid/os/Parcelable;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;->write:Landroid/os/Parcelable;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 3

    .line 1897
    invoke-direct {p0, p1}, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public static final synthetic AudioAttributesCompatParcelizer()Landroid/os/Parcelable$Creator;
    .registers 1

    .line 1897
    sget-object v0, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;->CREATOR:Landroid/os/Parcelable$Creator;

    return-object v0
.end method


# virtual methods
.method public final describeContents()I
    .registers 1

    const/4 p0, 0x1

    return p0
.end method

.method public final read()Ljava/lang/String;
    .registers 1

    .line 1898
    iget-object p0, p0, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;->IconCompatParcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final write()Landroid/os/Parcelable;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()TRESOURCE;"
        }
    .end annotation

    .line 1899
    iget-object p0, p0, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;->write:Landroid/os/Parcelable;

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 4

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1906
    iget-object v0, p0, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;->IconCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, v0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 1907
    iget-object p0, p0, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;->write:Landroid/os/Parcelable;

    invoke-virtual {p1, p0, p2}, Landroid/os/Parcel;->writeParcelable(Landroid/os/Parcelable;I)V

    return-void
.end method

###### Class com.facebook.GraphRequest.ParcelableResourceWithMimeType.Companion (com.facebook.GraphRequest$ParcelableResourceWithMimeType$AudioAttributesCompatParcelizer)
.class public final Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "AudioAttributesCompatParcelizer"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003R#\u0010\u0006\u001a\u000e\u0012\n\u0012\u0008\u0012\u0002\u0008\u0003\u0018\u00010\u00050\u00048\u0007\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010\u0007\u001a\u0004\u0008\u0008\u0010\t"
    }
    d2 = {
        "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$AudioAttributesCompatParcelizer;",
        "",
        "<init>",
        "()V",
        "Landroid/os/Parcelable$Creator;",
        "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;",
        "CREATOR",
        "Landroid/os/Parcelable$Creator;",
        "getCREATOR",
        "()Landroid/os/Parcelable$Creator;"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# direct methods
.method private constructor <init>()V
    .registers 1

    .line 1926
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 1926
    invoke-direct {p0}, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$AudioAttributesCompatParcelizer;-><init>()V

    return-void
.end method


# virtual methods
.method public final getCREATOR()Landroid/os/Parcelable$Creator;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Landroid/os/Parcelable$Creator<",
            "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType<",
            "*>;>;"
        }
    .end annotation

    .line 1927
    invoke-static {}, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;->AudioAttributesCompatParcelizer()Landroid/os/Parcelable$Creator;

    move-result-object p0

    return-object p0
.end method

###### Class com.facebook.GraphRequest.ParcelableResourceWithMimeType.write (com.facebook.GraphRequest$ParcelableResourceWithMimeType$write)
.class public final Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$write;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType<",
        "*>;>;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 1928
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static RemoteActionCompatParcelizer(I)[Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I)[",
            "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType<",
            "*>;"
        }
    .end annotation

    .line 1934
    new-array p0, p0, [Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;

    return-object p0
.end method

.method private static write(Landroid/os/Parcel;)Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Parcel;",
            ")",
            "Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType<",
            "*>;"
        }
    .end annotation

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1930
    new-instance v0, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;-><init>(Landroid/os/Parcel;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 1928
    invoke-static {p1}, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$write;->write(Landroid/os/Parcel;)Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 1928
    invoke-static {p1}, Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType$write;->RemoteActionCompatParcelizer(I)[Lcom/facebook/GraphRequest$ParcelableResourceWithMimeType;

    move-result-object p0

    return-object p0
.end method

###### Class com.facebook.GraphRequest.RemoteActionCompatParcelizer (com.facebook.GraphRequest$RemoteActionCompatParcelizer)
.class final Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/GraphRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x18
    name = "RemoteActionCompatParcelizer"
.end annotation


# static fields
.field private static final $$a:[B

.field private static final $$b:I

.field private static $10:I = 0x0

.field private static $11:I = 0x1

.field private static AudioAttributesImplApi21Parcelizer:[C

.field private static final AudioAttributesImplApi26Parcelizer:I

.field private static AudioAttributesImplBaseParcelizer:C

.field private static IconCompatParcelizer:I

.field private static final MediaBrowserCompatItemReceiver:[B

.field private static RemoteActionCompatParcelizer:[C

.field private static read:I


# instance fields
.field private final AudioAttributesCompatParcelizer:Lcom/facebook/GraphRequest;

.field private final write:Ljava/lang/Object;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    const/16 v0, 0x17

    new-array v0, v0, [B

    fill-array-data v0, :array_2e

    sput-object v0, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->$$a:[B

    const/16 v0, 0x7b

    sput v0, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->$$b:I

    const/16 v0, 0x16d

    .line 1609
    new-array v0, v0, [B

    fill-array-data v0, :array_3e

    sput-object v0, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:[B

    const/16 v0, 0xd2

    sput v0, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:I

    invoke-static {}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer()V

    const/4 v0, 0x0

    sput v0, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    const/4 v1, 0x1

    sput v1, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->read:I

    new-array v1, v1, [C

    const v2, 0xafbb

    aput-char v2, v1, v0

    sput-object v1, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:[C

    return-void

    nop

    :array_2e
    .array-data 1
        0x6ft
        -0x3ft
        0x50t
        0x1bt
        -0x1at
        -0xct
        0x1t
        0x2bt
        -0x2ct
        0x2t
        -0x3t
        0xft
        -0x13t
        0x24t
        -0x11t
        -0x11t
        0xft
        -0x2t
        -0x7t
        0x3t
        -0x11t
        0x15t
        -0xdt
    .end array-data

    :array_3e
    .array-data 1
        0x5dt
        -0x10t
        0x69t
        -0x4at
        0xdt
        -0xat
        0xet
        -0x3t
        -0x6t
        -0x5t
        -0x36t
        0x46t
        -0xft
        0x13t
        -0x4t
        -0x46t
        0x13t
        0x2dt
        -0xat
        0xet
        -0x3t
        -0x6t
        -0x5t
        -0x21t
        0x25t
        -0x7t
        0x11t
        -0x11t
        0x2t
        0x11t
        -0xft
        0xdt
        -0x2t
        0xft
        -0x27t
        0x1ct
        0x9t
        0x0t
        -0x3t
        0x3t
        0xdt
        -0xat
        0xet
        -0x3t
        -0x6t
        -0x5t
        -0x36t
        0x46t
        -0xft
        0x13t
        -0x4t
        -0x46t
        0x26t
        0x11t
        0x13t
        -0x4t
        -0x1ft
        0x1ft
        -0xbt
        0x3t
        0x7t
        0x5t
        -0xat
        0x1t
        0x13t
        -0x29t
        0x17t
        -0x9t
        0x15t
        -0x15t
        -0x33t
        0x3et
        -0xbt
        0xdt
        -0x7t
        -0x39t
        0x15t
        0x25t
        -0x7t
        0x11t
        -0x1ft
        0x12t
        0xct
        0x4t
        -0x10t
        0x9t
        -0xbt
        0x2t
        0xdt
        -0xat
        0xet
        -0x3t
        -0x6t
        -0x5t
        -0x36t
        0x41t
        0x4t
        -0x45t
        0x25t
        0x26t
        -0x6t
        0x1t
        -0xft
        0x8t
        -0x2at
        0x29t
        0x3t
        -0xct
        0x8t
        0x7t
        -0xbt
        0xft
        0x3t
        -0xet
        -0x1t
        -0x12t
        0x13t
        -0x4t
        0xbt
        0x8t
        -0xbt
        0x4t
        -0x8t
        0xdt
        -0xat
        0xet
        -0x3t
        -0x6t
        -0x5t
        -0x36t
        0x48t
        -0xdt
        -0x4t
        0x12t
        -0x49t
        0x28t
        0x13t
        -0x4t
        0x12t
        -0x34t
        0x2ct
        -0x1t
        -0x8t
        0x3t
        -0x2t
        0xet
        -0x3t
        -0x11t
        0x13t
        -0xbt
        0x6t
        -0x1t
        -0x2t
        0xft
        -0x28t
        0x23t
        -0x1t
        -0x7t
        -0x17t
        0x22t
        -0xdt
        0xet
        0x0t
        -0x1ft
        0x15t
        0x4t
        -0x8t
        0xat
        0x6t
        -0x1t
        -0x9t
        0x15t
        -0x15t
        -0x33t
        0x3et
        -0xbt
        0xdt
        -0x7t
        -0x39t
        0x25t
        0x21t
        -0x2t
        -0x9t
        0x5t
        -0x7t
        -0x3t
        -0x4t
        -0x3t
        0xbt
        -0x9t
        0x15t
        -0x15t
        -0x33t
        0x3et
        -0xbt
        0xdt
        -0x7t
        -0x39t
        0x1bt
        0x25t
        0x6t
        -0xft
        0x2t
        -0x2t
        0xdt
        -0x15t
        0xbt
        0x9t
        -0x10t
        -0x16t
        0x17t
        0x5t
        0x6t
        -0x1et
        0xbt
        0xbt
        0x9t
        -0x10t
        -0x9t
        0x15t
        -0x15t
        -0x33t
        0x3et
        -0xbt
        0xdt
        -0x7t
        -0x39t
        0x26t
        0x14t
        0xat
        -0x3t
        0x8t
        -0x16t
        0x1t
        0xat
        -0x7t
        -0x2t
        0xft
        -0x31t
        0x1et
        0x14t
        -0x2t
        -0xet
        -0x9t
        0x15t
        -0x15t
        -0x33t
        0x3et
        -0xbt
        0xdt
        -0x7t
        -0x39t
        0x21t
        0x13t
        0x8t
        -0x5t
        -0x2t
        0x11t
        -0x9t
        0x15t
        -0x15t
        -0x33t
        0x3et
        -0xbt
        0xdt
        -0x7t
        -0x39t
        0x1et
        0x23t
        -0x1t
        -0x7t
        0x5t
        -0x9t
        -0xbt
        -0x9t
        0x15t
        -0x15t
        -0x33t
        0x3et
        -0xbt
        0xdt
        -0x7t
        -0x39t
        0x44t
        -0xdt
        0x1t
        0x6t
        -0x7t
        -0x2t
        0x11t
        -0x46t
        0x13t
        0x22t
        0x0t
        0x2t
        0xet
        0x0t
        -0xat
        -0x7t
        0xat
        -0x7t
        -0x16t
        0x13t
        0x8t
        -0x5t
        -0x2t
        0x11t
        -0xet
        0xft
        -0x33t
        0x22t
        0x0t
        0x2t
        0xet
        0x0t
        -0xat
        -0x7t
        0xat
        -0x7t
        -0x9t
        0x15t
        -0x15t
        -0x33t
        0x3et
        -0xbt
        0xdt
        -0x7t
        -0x39t
        0x44t
        -0xdt
        0x1t
        0x6t
        -0x7t
        -0x2t
        0x11t
        -0x46t
        0x1ft
        0x18t
        0xft
        -0xct
        0x7t
        -0xbt
        0x5t
        0x8t
        -0x7t
        -0x4t
        -0x6t
        -0xft
        0x1et
        -0x9t
        0x15t
        -0x15t
        -0x33t
        0x3et
        -0xbt
        0xdt
        -0x7t
        -0x39t
        0x21t
        0x13t
        0x8t
        -0x5t
        -0x2t
        0x11t
        -0x39t
    .end array-data
.end method

.method public constructor <init>(Lcom/facebook/GraphRequest;Ljava/lang/Object;)V
    .registers 4

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1607
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:Lcom/facebook/GraphRequest;

    iput-object p2, p0, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->write:Ljava/lang/Object;

    return-void
.end method

.method static AudioAttributesCompatParcelizer()V
    .registers 1

    const/16 v0, 0x10

    .line 1610
    new-array v0, v0, [C

    fill-array-data v0, :array_e

    sput-object v0, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer:[C

    const/16 v0, 0x2cb6

    sput-char v0, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:C

    return-void

    :array_e
    .array-data 2
        0x2cb3s
        0x191cs
        0x1904s
        0x191as
        0x191es
        0x1911s
        0x2cb0s
        0x2cb1s
        0x191fs
        0x1918s
        0x191bs
        0x2cb6s
        0x1919s
        0x1910s
        0x191ds
        0x1905s
    .end array-data
.end method

.method private static a(SBS[Ljava/lang/Object;)V
    .registers 9

    .line 1611
    sget-object v0, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:[B

    add-int/lit8 v1, p1, 0x4

    add-int/lit8 p2, p2, 0x54

    add-int/lit8 p0, p0, 0x4

    new-array v1, v1, [B

    add-int/lit8 p1, p1, 0x3

    const/4 v2, 0x0

    if-nez v0, :cond_12

    move v4, p1

    move v3, v2

    goto :goto_24

    :cond_12
    move v3, v2

    :goto_13
    int-to-byte v4, p2

    aput-byte v4, v1, v3

    if-ne v3, p1, :cond_20

    new-instance p0, Ljava/lang/String;

    invoke-direct {p0, v1, v2}, Ljava/lang/String;-><init>([BI)V

    aput-object p0, p3, v2

    return-void

    :cond_20
    add-int/lit8 v3, v3, 0x1

    aget-byte v4, v0, p0

    :goto_24
    add-int/2addr p2, v4

    add-int/lit8 p0, p0, 0x1

    goto :goto_13
.end method

.method private static b([CIB[Ljava/lang/Object;)V
    .registers 37

    move/from16 v0, p1

    .line 190
    new-instance v1, Lo/needsStartedService;

    invoke-direct {v1}, Lo/needsStartedService;-><init>()V

    .line 195
    sget-object v2, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->AudioAttributesImplApi21Parcelizer:[C

    const v3, -0x5b132aab

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v2, :cond_5f

    array-length v7, v2

    new-array v8, v7, [C

    move v9, v5

    :goto_15
    if-ge v9, v7, :cond_5e

    aget-char v10, v2, v9

    :try_start_19
    new-array v11, v6, [Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    aput-object v10, v11, v5

    invoke-static {v3}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v10

    if-nez v10, :cond_4d

    invoke-static {v5}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v10

    int-to-char v12, v10

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v10

    shr-int/lit8 v10, v10, 0x10

    rsub-int v13, v10, 0x1b67

    invoke-static {v5}, Landroid/view/View$MeasureSpec;->getSize(I)I

    move-result v10

    rsub-int/lit8 v14, v10, 0x1e

    const v15, -0x255aee40

    const/16 v16, 0x0

    const-string v17, "o"

    new-array v10, v6, [Ljava/lang/Class;

    sget-object v18, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v18, v10, v5

    move-object/from16 v18, v10

    invoke-static/range {v12 .. v18}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v10

    :cond_4d
    check-cast v10, Ljava/lang/reflect/Method;

    invoke-virtual {v10, v4, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Character;

    invoke-virtual {v10}, Ljava/lang/Character;->charValue()C

    move-result v10
    :try_end_59
    .catchall {:try_start_19 .. :try_end_59} :catchall_2b5

    aput-char v10, v8, v9

    add-int/lit8 v9, v9, 0x1

    goto :goto_15

    :cond_5e
    move-object v2, v8

    .line 197
    :cond_5f
    sget-char v7, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->AudioAttributesImplBaseParcelizer:C

    :try_start_61
    new-array v8, v6, [Ljava/lang/Object;

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    aput-object v7, v8, v5

    invoke-static {v3}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_98

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    int-to-char v9, v3

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollDefaultDelay()I

    move-result v3

    shr-int/lit8 v3, v3, 0x10

    rsub-int v10, v3, 0x1b67

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v11

    const-wide/16 v13, -0x1

    cmp-long v3, v11, v13

    add-int/lit8 v11, v3, 0x1d

    const v12, -0x255aee40

    const/4 v13, 0x0

    const-string v14, "o"

    new-array v15, v6, [Ljava/lang/Class;

    sget-object v3, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v3, v15, v5

    invoke-static/range {v9 .. v15}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v3

    :cond_98
    check-cast v3, Ljava/lang/reflect/Method;

    invoke-virtual {v3, v4, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Character;

    invoke-virtual {v3}, Ljava/lang/Character;->charValue()C

    move-result v3
    :try_end_a4
    .catchall {:try_start_61 .. :try_end_a4} :catchall_2b5

    .line 201
    new-array v7, v0, [C

    .line 204
    rem-int/lit8 v8, v0, 0x2

    if-eqz v8, :cond_b4

    add-int/lit8 v8, v0, -0x1

    .line 206
    aget-char v9, p0, v8

    sub-int v9, v9, p2

    int-to-char v9, v9

    aput-char v9, v7, v8

    goto :goto_b5

    :cond_b4
    move v8, v0

    :goto_b5
    if-le v8, v6, :cond_2a0

    .line 210
    iput v5, v1, Lo/needsStartedService;->AudioAttributesCompatParcelizer:I

    :goto_b9
    iget v9, v1, Lo/needsStartedService;->AudioAttributesCompatParcelizer:I

    if-ge v9, v8, :cond_2a0

    .line 213
    iget v9, v1, Lo/needsStartedService;->AudioAttributesCompatParcelizer:I

    aget-char v9, p0, v9

    iput-char v9, v1, Lo/needsStartedService;->write:C

    .line 214
    iget v9, v1, Lo/needsStartedService;->AudioAttributesCompatParcelizer:I

    add-int/2addr v9, v6

    aget-char v9, p0, v9

    iput-char v9, v1, Lo/needsStartedService;->RemoteActionCompatParcelizer:C

    .line 217
    iget-char v9, v1, Lo/needsStartedService;->write:C

    iget-char v10, v1, Lo/needsStartedService;->RemoteActionCompatParcelizer:C

    const/4 v11, 0x2

    if-ne v9, v10, :cond_e7

    .line 218
    iget v9, v1, Lo/needsStartedService;->AudioAttributesCompatParcelizer:I

    iget-char v10, v1, Lo/needsStartedService;->write:C

    sub-int v10, v10, p2

    int-to-char v10, v10

    aput-char v10, v7, v9

    .line 219
    iget v9, v1, Lo/needsStartedService;->AudioAttributesCompatParcelizer:I

    add-int/2addr v9, v6

    iget-char v10, v1, Lo/needsStartedService;->RemoteActionCompatParcelizer:C

    sub-int v10, v10, p2

    int-to-char v10, v10

    aput-char v10, v7, v9

    move-object v10, v4

    goto/16 :goto_298

    :cond_e7
    const/16 v9, 0xd

    .line 228
    :try_start_e9
    new-array v10, v9, [Ljava/lang/Object;

    const/16 v12, 0xc

    aput-object v1, v10, v12

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    const/16 v14, 0xb

    aput-object v13, v10, v14

    const/16 v13, 0xa

    aput-object v1, v10, v13

    const/16 v15, 0x9

    aput-object v1, v10, v15

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v16

    const/16 v17, 0x8

    aput-object v16, v10, v17

    const/16 v16, 0x7

    aput-object v1, v10, v16

    const/16 v18, 0x6

    aput-object v1, v10, v18

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v19

    const/16 v20, 0x5

    aput-object v19, v10, v20

    const/16 v19, 0x4

    aput-object v1, v10, v19

    const/16 v21, 0x3

    aput-object v1, v10, v21

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v22

    aput-object v22, v10, v11

    aput-object v1, v10, v6

    aput-object v1, v10, v5

    const v22, 0x6422f91

    invoke-static/range {v22 .. v22}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v22

    const-wide/16 v23, 0x0

    if-nez v22, :cond_195

    invoke-static/range {v23 .. v24}, Landroid/widget/ExpandableListView;->getPackedPositionChild(J)I

    move-result v22

    const v25, 0xbc43

    add-int v4, v22, v25

    int-to-char v4, v4

    invoke-static {v5}, Landroid/graphics/Color;->green(I)I

    move-result v12

    add-int/lit16 v12, v12, 0x4e9e

    invoke-static {}, Landroid/view/ViewConfiguration;->getWindowTouchSlop()I

    move-result v22

    shr-int/lit8 v22, v22, 0x8

    rsub-int/lit8 v28, v22, 0x14

    const v29, 0x780beb04

    const/16 v30, 0x0

    const-string v31, "n"

    new-array v9, v9, [Ljava/lang/Class;

    const-class v22, Ljava/lang/Object;

    aput-object v22, v9, v5

    const-class v22, Ljava/lang/Object;

    aput-object v22, v9, v6

    sget-object v22, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v22, v9, v11

    const-class v22, Ljava/lang/Object;

    aput-object v22, v9, v21

    const-class v22, Ljava/lang/Object;

    aput-object v22, v9, v19

    sget-object v22, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v22, v9, v20

    const-class v22, Ljava/lang/Object;

    aput-object v22, v9, v18

    const-class v22, Ljava/lang/Object;

    aput-object v22, v9, v16

    sget-object v22, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v22, v9, v17

    const-class v22, Ljava/lang/Object;

    aput-object v22, v9, v15

    const-class v22, Ljava/lang/Object;

    aput-object v22, v9, v13

    sget-object v22, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v22, v9, v14

    const-class v22, Ljava/lang/Object;

    const/16 v25, 0xc

    aput-object v22, v9, v25

    move/from16 v26, v4

    move/from16 v27, v12

    move-object/from16 v32, v9

    invoke-static/range {v26 .. v32}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v22

    :cond_195
    move-object/from16 v4, v22

    check-cast v4, Ljava/lang/reflect/Method;

    const/4 v9, 0x0

    invoke-virtual {v4, v9, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4
    :try_end_1a4
    .catchall {:try_start_e9 .. :try_end_1a4} :catchall_2b5

    iget v9, v1, Lo/needsStartedService;->AudioAttributesImplBaseParcelizer:I

    if-ne v4, v9, :cond_250

    .line 232
    :try_start_1a8
    new-array v4, v14, [Ljava/lang/Object;

    aput-object v1, v4, v13

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v4, v15

    aput-object v1, v4, v17

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v4, v16

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v4, v18

    aput-object v1, v4, v20

    aput-object v1, v4, v19

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v4, v21

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    aput-object v9, v4, v11

    aput-object v1, v4, v6

    aput-object v1, v4, v5

    const v9, 0x2fd0189

    invoke-static {v9}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v9

    if-nez v9, :cond_22f

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v9

    shr-int/lit8 v9, v9, 0x10

    int-to-char v9, v9

    invoke-static/range {v23 .. v24}, Landroid/widget/ExpandableListView;->getPackedPositionType(J)I

    move-result v10

    add-int/lit16 v10, v10, 0x4ba8

    invoke-static {v5}, Landroid/graphics/ImageFormat;->getBitsPerPixel(I)I

    move-result v12

    add-int/lit8 v28, v12, 0x13

    const v29, 0x7cb4c51c

    const/16 v30, 0x0

    const-string v31, "k"

    new-array v12, v14, [Ljava/lang/Class;

    const-class v14, Ljava/lang/Object;

    aput-object v14, v12, v5

    const-class v14, Ljava/lang/Object;

    aput-object v14, v12, v6

    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v14, v12, v11

    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v14, v12, v21

    const-class v14, Ljava/lang/Object;

    aput-object v14, v12, v19

    const-class v14, Ljava/lang/Object;

    aput-object v14, v12, v20

    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v14, v12, v18

    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v14, v12, v16

    const-class v14, Ljava/lang/Object;

    aput-object v14, v12, v17

    sget-object v14, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v14, v12, v15

    const-class v14, Ljava/lang/Object;

    aput-object v14, v12, v13

    move/from16 v26, v9

    move/from16 v27, v10

    move-object/from16 v32, v12

    invoke-static/range {v26 .. v32}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v9

    :cond_22f
    check-cast v9, Ljava/lang/reflect/Method;

    const/4 v10, 0x0

    invoke-virtual {v9, v10, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Integer;

    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    move-result v4
    :try_end_23c
    .catchall {:try_start_1a8 .. :try_end_23c} :catchall_2b5

    .line 233
    iget v9, v1, Lo/needsStartedService;->read:I

    mul-int/2addr v9, v3

    iget v12, v1, Lo/needsStartedService;->AudioAttributesImplBaseParcelizer:I

    add-int/2addr v9, v12

    .line 235
    iget v12, v1, Lo/needsStartedService;->AudioAttributesCompatParcelizer:I

    aget-char v4, v2, v4

    aput-char v4, v7, v12

    .line 236
    iget v4, v1, Lo/needsStartedService;->AudioAttributesCompatParcelizer:I

    add-int/2addr v4, v6

    aget-char v9, v2, v9

    aput-char v9, v7, v4

    goto :goto_298

    :cond_250
    const/4 v10, 0x0

    .line 241
    iget v4, v1, Lo/needsStartedService;->IconCompatParcelizer:I

    iget v9, v1, Lo/needsStartedService;->read:I

    if-ne v4, v9, :cond_27f

    .line 242
    iget v4, v1, Lo/needsStartedService;->MediaBrowserCompatItemReceiver:I

    add-int/2addr v4, v3

    sub-int/2addr v4, v6

    rem-int/2addr v4, v3

    iput v4, v1, Lo/needsStartedService;->MediaBrowserCompatItemReceiver:I

    .line 243
    iget v4, v1, Lo/needsStartedService;->AudioAttributesImplBaseParcelizer:I

    add-int/2addr v4, v3

    sub-int/2addr v4, v6

    rem-int/2addr v4, v3

    iput v4, v1, Lo/needsStartedService;->AudioAttributesImplBaseParcelizer:I

    .line 245
    iget v4, v1, Lo/needsStartedService;->IconCompatParcelizer:I

    mul-int/2addr v4, v3

    iget v9, v1, Lo/needsStartedService;->MediaBrowserCompatItemReceiver:I

    add-int/2addr v4, v9

    .line 246
    iget v9, v1, Lo/needsStartedService;->read:I

    mul-int/2addr v9, v3

    iget v12, v1, Lo/needsStartedService;->AudioAttributesImplBaseParcelizer:I

    add-int/2addr v9, v12

    .line 248
    iget v12, v1, Lo/needsStartedService;->AudioAttributesCompatParcelizer:I

    aget-char v4, v2, v4

    aput-char v4, v7, v12

    .line 249
    iget v4, v1, Lo/needsStartedService;->AudioAttributesCompatParcelizer:I

    add-int/2addr v4, v6

    aget-char v9, v2, v9

    aput-char v9, v7, v4

    goto :goto_298

    .line 258
    :cond_27f
    iget v4, v1, Lo/needsStartedService;->IconCompatParcelizer:I

    mul-int/2addr v4, v3

    iget v9, v1, Lo/needsStartedService;->AudioAttributesImplBaseParcelizer:I

    add-int/2addr v4, v9

    .line 259
    iget v9, v1, Lo/needsStartedService;->read:I

    mul-int/2addr v9, v3

    iget v12, v1, Lo/needsStartedService;->MediaBrowserCompatItemReceiver:I

    add-int/2addr v9, v12

    .line 261
    iget v12, v1, Lo/needsStartedService;->AudioAttributesCompatParcelizer:I

    aget-char v4, v2, v4

    aput-char v4, v7, v12

    .line 262
    iget v4, v1, Lo/needsStartedService;->AudioAttributesCompatParcelizer:I

    add-int/2addr v4, v6

    aget-char v9, v2, v9

    aput-char v9, v7, v4

    .line 210
    :goto_298
    iget v4, v1, Lo/needsStartedService;->AudioAttributesCompatParcelizer:I

    add-int/2addr v4, v11

    iput v4, v1, Lo/needsStartedService;->AudioAttributesCompatParcelizer:I

    move-object v4, v10

    goto/16 :goto_b9

    :cond_2a0
    move v1, v5

    :goto_2a1
    if-ge v1, v0, :cond_2ad

    .line 270
    aget-char v2, v7, v1

    xor-int/lit16 v2, v2, 0x359a

    int-to-char v2, v2

    aput-char v2, v7, v1

    add-int/lit8 v1, v1, 0x1

    goto :goto_2a1

    .line 273
    :cond_2ad
    new-instance v0, Ljava/lang/String;

    invoke-direct {v0, v7}, Ljava/lang/String;-><init>([C)V

    aput-object v0, p3, v5

    return-void

    :catchall_2b5
    move-exception v0

    .line 195
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_2bd

    throw v1

    :cond_2bd
    throw v0
.end method

.method private static c([BZ[I[Ljava/lang/Object;)V
    .registers 26

    const/4 v0, 0x2

    .line 220
    rem-int v1, v0, v0

    .line 162
    new-instance v1, Lo/buildSetStopReasonIntent;

    invoke-direct {v1}, Lo/buildSetStopReasonIntent;-><init>()V

    const/4 v2, 0x0

    .line 165
    aget v3, p2, v2

    const/4 v4, 0x1

    .line 166
    aget v5, p2, v4

    .line 167
    aget v6, p2, v0

    const/4 v7, 0x3

    .line 168
    aget v7, p2, v7

    .line 170
    sget-object v8, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:[C

    const/4 v9, 0x0

    if-eqz v8, :cond_7c

    .line 181
    sget v10, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->$10:I

    add-int/lit8 v10, v10, 0x3d

    rem-int/lit16 v11, v10, 0x80

    sput v11, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->$11:I

    rem-int/2addr v10, v0

    .line 170
    array-length v10, v8

    new-array v11, v10, [C

    move v12, v2

    :goto_25
    if-ge v12, v10, :cond_7b

    aget-char v13, v8, v12

    :try_start_29
    new-array v14, v4, [Ljava/lang/Object;

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    aput-object v13, v14, v2

    const v13, -0x1432a732

    invoke-static {v13}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v13

    if-nez v13, :cond_66

    invoke-static {v2, v2}, Landroid/view/Gravity;->getAbsoluteGravity(II)I

    move-result v13

    int-to-char v15, v13

    invoke-static {v2}, Landroid/os/Process;->getThreadPriority(I)I

    move-result v13

    add-int/lit8 v13, v13, 0x14

    shr-int/lit8 v13, v13, 0x6

    rsub-int v13, v13, 0x2d5d

    invoke-static {}, Landroid/view/ViewConfiguration;->getTapTimeout()I

    move-result v16

    shr-int/lit8 v16, v16, 0x10

    add-int/lit8 v17, v16, 0x14

    const v18, -0x6a7b63a5

    const/16 v19, 0x0

    const-string v20, "u"

    new-array v0, v4, [Ljava/lang/Class;

    sget-object v16, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v16, v0, v2

    move/from16 v16, v13

    move-object/from16 v21, v0

    invoke-static/range {v15 .. v21}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v13

    :cond_66
    check-cast v13, Ljava/lang/reflect/Method;

    invoke-virtual {v13, v9, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Character;

    invoke-virtual {v0}, Ljava/lang/Character;->charValue()C

    move-result v0
    :try_end_72
    .catchall {:try_start_29 .. :try_end_72} :catchall_78

    aput-char v0, v11, v12

    add-int/lit8 v12, v12, 0x1

    const/4 v0, 0x2

    goto :goto_25

    :catchall_78
    move-exception v0

    goto/16 :goto_1b8

    :cond_7b
    move-object v8, v11

    .line 171
    :cond_7c
    new-array v0, v5, [C

    .line 173
    invoke-static {v8, v3, v0, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    if-eqz p0, :cond_1ca

    .line 177
    new-array v3, v5, [C

    .line 180
    iput v2, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    move v8, v2

    :goto_88
    iget v10, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    if-ge v10, v5, :cond_1c9

    .line 203
    sget v10, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->$11:I

    add-int/lit8 v10, v10, 0x3b

    rem-int/lit16 v11, v10, 0x80

    sput v11, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->$10:I

    const/4 v11, 0x2

    rem-int/2addr v10, v11

    const-string v11, ""

    if-eqz v10, :cond_a1

    .line 181
    iget v10, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    aget-byte v10, p0, v10

    if-nez v10, :cond_103

    goto :goto_a7

    :cond_a1
    iget v10, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    aget-byte v10, p0, v10

    if-ne v10, v4, :cond_103

    .line 182
    :goto_a7
    iget v10, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    iget v12, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    aget-char v12, v0, v12

    const/4 v13, 0x2

    :try_start_ae
    new-array v14, v13, [Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v14, v4

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v14, v2

    const v8, -0x5533cd7b

    invoke-static {v8}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_f4

    invoke-static {v2, v2, v2}, Landroid/view/View;->resolveSizeAndState(III)I

    move-result v8

    int-to-char v15, v8

    invoke-static {v11, v11}, Landroid/text/TextUtils;->indexOf(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)I

    move-result v8

    add-int/lit16 v8, v8, 0x59af

    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtimeNanos()J

    move-result-wide v11

    const-wide/16 v16, 0x0

    cmp-long v11, v11, v16

    add-int/lit8 v17, v11, 0x2a

    const v18, -0x2b7a09f0

    const/16 v19, 0x0

    const-string v20, "x"

    const/4 v11, 0x2

    new-array v12, v11, [Ljava/lang/Class;

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v11, v12, v2

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v11, v12, v4

    move/from16 v16, v8

    move-object/from16 v21, v12

    invoke-static/range {v15 .. v21}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    :cond_f4
    check-cast v8, Ljava/lang/reflect/Method;

    invoke-virtual {v8, v9, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Character;

    invoke-virtual {v8}, Ljava/lang/Character;->charValue()C

    move-result v8
    :try_end_100
    .catchall {:try_start_ae .. :try_end_100} :catchall_78

    aput-char v8, v3, v10

    goto :goto_16c

    .line 184
    :cond_103
    iget v10, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    iget v12, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    aget-char v12, v0, v12

    const/4 v13, 0x2

    :try_start_10a
    new-array v14, v13, [Ljava/lang/Object;

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v14, v4

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    aput-object v8, v14, v2

    const v8, 0x6ed8ef0a

    invoke-static {v8}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v8

    if-nez v8, :cond_154

    invoke-static {}, Landroid/os/SystemClock;->currentThreadTimeMillis()J

    move-result-wide v12

    const-wide/16 v15, -0x1

    cmp-long v8, v12, v15

    add-int/lit16 v8, v8, 0x7b64

    int-to-char v15, v8

    invoke-static {v11}, Landroid/os/Process;->getGidForName(Ljava/lang/String;)I

    move-result v8

    rsub-int v8, v8, 0x2686

    invoke-static {}, Landroid/view/ViewConfiguration;->getMaximumFlingVelocity()I

    move-result v11

    shr-int/lit8 v11, v11, 0x10

    add-int/lit8 v17, v11, 0x41

    const v18, 0x10912b9f

    const/16 v19, 0x0

    const-string v20, "v"

    const/4 v11, 0x2

    new-array v12, v11, [Ljava/lang/Class;

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v11, v12, v2

    sget-object v11, Ljava/lang/Integer;->TYPE:Ljava/lang/Class;

    aput-object v11, v12, v4

    move/from16 v16, v8

    move-object/from16 v21, v12

    invoke-static/range {v15 .. v21}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v8

    :cond_154
    check-cast v8, Ljava/lang/reflect/Method;

    invoke-virtual {v8, v9, v14}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Character;

    invoke-virtual {v8}, Ljava/lang/Character;->charValue()C

    move-result v8
    :try_end_160
    .catchall {:try_start_10a .. :try_end_160} :catchall_1c0

    aput-char v8, v3, v10

    .line 203
    sget v8, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->$11:I

    add-int/lit8 v8, v8, 0x2f

    rem-int/lit16 v10, v8, 0x80

    sput v10, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->$10:I

    const/4 v10, 0x2

    rem-int/2addr v8, v10

    .line 187
    :goto_16c
    iget v8, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    aget-char v8, v3, v8

    .line 180
    :try_start_170
    filled-new-array {v1, v1}, [Ljava/lang/Object;

    move-result-object v10

    const v11, 0x41dc740a

    invoke-static {v11}, Lo/startForeground;->RemoteActionCompatParcelizer(I)Ljava/lang/Object;

    move-result-object v11

    if-nez v11, :cond_1b0

    invoke-static {}, Landroid/view/ViewConfiguration;->getScrollBarSize()I

    move-result v11

    shr-int/lit8 v11, v11, 0x8

    const v12, 0x93be    # 5.3E-41f

    add-int/2addr v11, v12

    int-to-char v12, v11

    invoke-static {}, Landroid/view/ViewConfiguration;->getEdgeSlop()I

    move-result v11

    shr-int/lit8 v11, v11, 0x10

    add-int/lit16 v13, v11, 0x261a

    invoke-static {}, Landroid/view/ViewConfiguration;->getLongPressTimeout()I

    move-result v11

    shr-int/lit8 v11, v11, 0x10

    add-int/lit8 v14, v11, 0x1b

    const v15, 0x3f95b09f

    const/16 v16, 0x0

    const-string v17, "B"

    const/4 v11, 0x2

    new-array v9, v11, [Ljava/lang/Class;

    const-class v11, Ljava/lang/Object;

    aput-object v11, v9, v2

    const-class v11, Ljava/lang/Object;

    aput-object v11, v9, v4

    move-object/from16 v18, v9

    invoke-static/range {v12 .. v18}, Lo/startForeground;->read(CIIIZLjava/lang/String;[Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object v11

    :cond_1b0
    check-cast v11, Ljava/lang/reflect/Method;

    const/4 v9, 0x0

    invoke-virtual {v11, v9, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_1b6
    .catchall {:try_start_170 .. :try_end_1b6} :catchall_78

    goto/16 :goto_88

    .line 170
    :goto_1b8
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_1bf

    throw v1

    :cond_1bf
    throw v0

    :catchall_1c0
    move-exception v0

    .line 184
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_1c8

    throw v1

    :cond_1c8
    throw v0

    :cond_1c9
    move-object v0, v3

    :cond_1ca
    if-lez v7, :cond_1f5

    .line 220
    sget v3, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->$10:I

    add-int/lit8 v3, v3, 0x63

    rem-int/lit16 v8, v3, 0x80

    sput v8, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->$11:I

    const/4 v8, 0x2

    rem-int/2addr v3, v8

    if-nez v3, :cond_1e8

    .line 195
    new-array v3, v5, [C

    .line 197
    invoke-static {v0, v4, v3, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 198
    rem-int v8, v5, v7

    invoke-static {v3, v4, v0, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    mul-int v8, v5, v7

    .line 199
    invoke-static {v3, v7, v0, v2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    goto :goto_1f5

    .line 195
    :cond_1e8
    new-array v3, v5, [C

    .line 197
    invoke-static {v0, v2, v3, v2, v5}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    sub-int v8, v5, v7

    .line 198
    invoke-static {v3, v2, v0, v8, v7}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    .line 199
    invoke-static {v3, v7, v0, v2, v8}, Ljava/lang/System;->arraycopy(Ljava/lang/Object;ILjava/lang/Object;II)V

    :cond_1f5
    :goto_1f5
    if-eqz p1, :cond_211

    .line 204
    new-array v3, v5, [C

    .line 206
    iput v2, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    :goto_1fb
    iget v7, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    if-ge v7, v5, :cond_210

    .line 207
    iget v7, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    iget v8, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    sub-int v8, v5, v8

    sub-int/2addr v8, v4

    aget-char v8, v0, v8

    aput-char v8, v3, v7

    .line 206
    iget v7, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    add-int/2addr v7, v4

    iput v7, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    goto :goto_1fb

    :cond_210
    move-object v0, v3

    :cond_211
    if-lez v6, :cond_22c

    .line 215
    iput v2, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    :goto_215
    iget v3, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    if-ge v3, v5, :cond_22c

    .line 216
    iget v3, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    iget v6, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    aget-char v6, v0, v6

    const/4 v7, 0x2

    aget v8, p2, v7

    sub-int/2addr v6, v8

    int-to-char v6, v6

    aput-char v6, v0, v3

    .line 215
    iget v3, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    add-int/2addr v3, v4

    iput v3, v1, Lo/buildSetStopReasonIntent;->RemoteActionCompatParcelizer:I

    goto :goto_215

    .line 220
    :cond_22c
    new-instance v1, Ljava/lang/String;

    invoke-direct {v1, v0}, Ljava/lang/String;-><init>([C)V

    aput-object v1, p3, v2

    return-void
.end method

.method private static d(ISB[Ljava/lang/Object;)V
    .registers 9

    mul-int/lit8 p0, p0, 0x2

    rsub-int/lit8 v0, p0, 0x14

    mul-int/lit8 p2, p2, 0x4

    rsub-int/lit8 p2, p2, 0x4

    .line 0
    sget-object v1, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->$$a:[B

    mul-int/lit8 p1, p1, 0x4

    rsub-int/lit8 p1, p1, 0x49

    new-array v0, v0, [B

    rsub-int/lit8 p0, p0, 0x13

    const/4 v2, -0x1

    if-nez v1, :cond_19

    move v3, v2

    move v2, p2

    move p2, p0

    goto :goto_30

    :cond_19
    :goto_19
    add-int/lit8 v2, v2, 0x1

    int-to-byte v3, p1

    aput-byte v3, v0, v2

    if-ne v2, p0, :cond_29

    new-instance p0, Ljava/lang/String;

    const/4 p1, 0x0

    invoke-direct {p0, v0, p1}, Ljava/lang/String;-><init>([BI)V

    aput-object p0, p3, p1

    return-void

    :cond_29
    aget-byte v3, v1, p2

    move v4, p2

    move p2, p1

    move p1, v3

    move v3, v2

    move v2, v4

    :goto_30
    neg-int p1, p1

    add-int/lit8 v2, v2, 0x1

    add-int/2addr p1, p2

    move p2, v2

    move v2, v3

    goto :goto_19
.end method

.method public static read(Landroid/content/Context;JJ)V
    .registers 24

    .line 1608
    new-instance v7, Lo/lambdaonSeekBackIncrementChanged45;

    move-object v1, v7

    move-object/from16 v2, p0

    move-wide/from16 v3, p1

    move-wide/from16 v5, p3

    invoke-direct/range {v1 .. v6}, Lo/lambdaonSeekBackIncrementChanged45;-><init>(Ljava/lang/Object;JJ)V

    const/16 v0, 0x11f

    new-array v0, v0, [C

    fill-array-data v0, :array_6c0

    const/4 v1, 0x1

    :try_start_14
    new-array v2, v1, [Ljava/lang/Object;

    const/16 v3, 0x30

    invoke-static {v3}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v3

    const/4 v4, 0x0

    aput-object v3, v2, v4

    sget-object v3, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:[B

    const/16 v5, 0x25

    aget-byte v6, v3, v5

    int-to-short v6, v6

    or-int/lit8 v8, v6, 0x19

    int-to-byte v8, v8

    const/4 v9, 0x4

    aget-byte v10, v3, v9

    int-to-byte v10, v10

    new-array v11, v1, [Ljava/lang/Object;

    invoke-static {v6, v8, v10, v11}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v6, v11, v4

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/16 v8, 0x23

    aget-byte v8, v3, v8

    int-to-short v8, v8

    const/16 v10, 0x3d

    aget-byte v10, v3, v10

    int-to-byte v10, v10

    const/16 v11, 0xd

    aget-byte v12, v3, v11

    int-to-byte v12, v12

    new-array v13, v1, [Ljava/lang/Object;

    invoke-static {v8, v10, v12, v13}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v8, v13, v4

    check-cast v8, Ljava/lang/String;

    new-array v10, v1, [Ljava/lang/Class;

    sget-object v12, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    aput-object v12, v10, v4

    invoke-virtual {v6, v8, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    const/4 v8, 0x0

    invoke-virtual {v6, v8, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Character;

    invoke-virtual {v2}, Ljava/lang/Character;->charValue()C

    move-result v2
    :try_end_67
    .catchall {:try_start_14 .. :try_end_67} :catchall_670

    rsub-int v2, v2, 0x14f

    const-string v6, ""

    const/4 v10, 0x2

    :try_start_6c
    new-array v12, v10, [Ljava/lang/Object;

    const/16 v13, 0x30

    invoke-static {v13}, Ljava/lang/Character;->valueOf(C)Ljava/lang/Character;

    move-result-object v13

    aput-object v13, v12, v1

    aput-object v6, v12, v4

    const/16 v6, 0x18

    aget-byte v6, v3, v6

    sub-int/2addr v6, v1

    int-to-short v6, v6

    const/16 v13, 0x51

    aget-byte v13, v3, v13

    int-to-byte v13, v13

    aget-byte v14, v3, v9

    int-to-byte v14, v14

    new-array v15, v1, [Ljava/lang/Object;

    invoke-static {v6, v13, v14, v15}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v6, v15, v4

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/16 v13, 0x4b

    aget-byte v13, v3, v13

    neg-int v13, v13

    int-to-short v13, v13

    const/16 v14, 0x27

    aget-byte v15, v3, v14

    int-to-byte v15, v15

    const/16 v16, 0x44

    aget-byte v5, v3, v16

    int-to-byte v5, v5

    new-array v14, v1, [Ljava/lang/Object;

    invoke-static {v13, v15, v5, v14}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v5, v14, v4

    check-cast v5, Ljava/lang/String;

    new-array v13, v10, [Ljava/lang/Class;

    const/16 v14, 0x47

    aget-byte v14, v3, v14

    add-int/2addr v14, v1

    int-to-short v14, v14

    const/16 v15, 0x51

    aget-byte v15, v3, v15

    int-to-byte v15, v15

    const/16 v17, 0xd1

    aget-byte v11, v3, v17

    neg-int v11, v11

    int-to-byte v11, v11

    new-array v10, v1, [Ljava/lang/Object;

    invoke-static {v14, v15, v11, v10}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v10, v10, v4

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    aput-object v10, v13, v4

    sget-object v10, Ljava/lang/Character;->TYPE:Ljava/lang/Class;

    aput-object v10, v13, v1

    invoke-virtual {v6, v5, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v8, v12}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Integer;

    invoke-virtual {v5}, Ljava/lang/Integer;->intValue()I

    move-result v5
    :try_end_e0
    .catchall {:try_start_6c .. :try_end_e0} :catchall_670

    rsub-int/lit8 v5, v5, 0x69

    int-to-byte v5, v5

    new-array v6, v1, [Ljava/lang/Object;

    invoke-static {v0, v2, v5, v6}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->b([CIB[Ljava/lang/Object;)V

    aget-object v0, v6, v4

    check-cast v0, Ljava/lang/String;

    new-array v2, v1, [C

    const/16 v5, 0x361e

    aput-char v5, v2, v4

    const/16 v5, 0x54

    int-to-short v5, v5

    const/16 v6, 0x51

    :try_start_f7
    aget-byte v6, v3, v6

    int-to-byte v6, v6

    aget-byte v10, v3, v9

    int-to-byte v10, v10

    new-array v11, v1, [Ljava/lang/Object;

    invoke-static {v5, v6, v10, v11}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v5, v11, v4

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v5

    const/4 v6, 0x2

    aget-byte v10, v3, v6

    int-to-short v6, v10

    const/16 v10, 0x76

    aget-byte v10, v3, v10

    int-to-byte v10, v10

    const/16 v11, 0x1a

    aget-byte v11, v3, v11

    int-to-byte v11, v11

    new-array v12, v1, [Ljava/lang/Object;

    invoke-static {v6, v10, v11, v12}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v6, v12, v4

    check-cast v6, Ljava/lang/String;

    invoke-virtual {v5, v6, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v5

    invoke-virtual {v5, v8, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Long;

    invoke-virtual {v5}, Ljava/lang/Long;->longValue()J

    move-result-wide v5

    const-wide/16 v10, 0x0

    cmp-long v5, v5, v10

    const/16 v6, 0x77

    int-to-short v6, v6

    const/16 v10, 0xc6

    aget-byte v10, v3, v10

    sub-int/2addr v10, v1

    int-to-byte v10, v10

    aget-byte v11, v3, v9

    int-to-byte v11, v11

    new-array v12, v1, [Ljava/lang/Object;

    invoke-static {v6, v10, v11, v12}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v6, v12, v4

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/16 v10, 0x94

    int-to-short v10, v10

    const/16 v11, 0x21

    aget-byte v11, v3, v11

    int-to-byte v11, v11

    const/16 v12, 0xd

    aget-byte v13, v3, v12

    int-to-byte v12, v13

    new-array v13, v1, [Ljava/lang/Object;

    invoke-static {v10, v11, v12, v13}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v10, v13, v4

    check-cast v10, Ljava/lang/String;

    invoke-virtual {v6, v10, v8}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v8, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6
    :try_end_170
    .catchall {:try_start_f7 .. :try_end_170} :catchall_670

    shr-int/lit8 v6, v6, 0x10

    rsub-int/lit8 v6, v6, 0x68

    int-to-byte v6, v6

    new-array v10, v1, [Ljava/lang/Object;

    invoke-static {v2, v5, v6, v10}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->b([CIB[Ljava/lang/Object;)V

    aget-object v2, v10, v4

    check-cast v2, Ljava/lang/String;

    :try_start_17e
    filled-new-array {v2}, [Ljava/lang/Object;

    move-result-object v2

    const/16 v5, 0xa6

    int-to-short v5, v5

    const/16 v6, 0x52

    aget-byte v10, v3, v6

    int-to-byte v10, v10

    aget-byte v11, v3, v17

    neg-int v11, v11

    int-to-byte v11, v11

    new-array v12, v1, [Ljava/lang/Object;

    invoke-static {v5, v10, v11, v12}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v10, v12, v4

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    const/16 v11, 0xb5

    int-to-short v11, v11

    const/16 v12, 0x3f

    aget-byte v12, v3, v12

    int-to-byte v12, v12

    const/16 v13, 0x39

    aget-byte v13, v3, v13

    int-to-byte v13, v13

    new-array v14, v1, [Ljava/lang/Object;

    invoke-static {v11, v12, v13, v14}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v11, v14, v4

    check-cast v11, Ljava/lang/String;

    new-array v12, v1, [Ljava/lang/Class;

    aget-byte v13, v3, v6

    int-to-byte v13, v13

    aget-byte v3, v3, v17

    neg-int v3, v3

    int-to-byte v3, v3

    new-array v14, v1, [Ljava/lang/Object;

    invoke-static {v5, v13, v3, v14}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v3, v14, v4

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v3

    aput-object v3, v12, v4

    invoke-virtual {v10, v11, v12}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v3

    invoke-virtual {v3, v0, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Ljava/lang/Object;
    :try_end_1d3
    .catchall {:try_start_17e .. :try_end_1d3} :catchall_670

    array-length v2, v0

    new-array v2, v2, [I

    move v3, v4

    :goto_1d7
    array-length v10, v0

    if-ge v3, v10, :cond_274

    aget-object v10, v0, v3

    :try_start_1dc
    filled-new-array {v10}, [Ljava/lang/Object;

    move-result-object v10

    const/16 v12, 0xb9

    int-to-short v12, v12

    sget-object v13, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:[B

    aget-byte v14, v13, v9

    int-to-byte v14, v14

    aget-byte v15, v13, v17

    neg-int v15, v15

    int-to-byte v15, v15

    new-array v11, v1, [Ljava/lang/Object;

    invoke-static {v12, v14, v15, v11}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v11, v11, v4

    check-cast v11, Ljava/lang/String;

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    const/16 v14, 0xc9

    int-to-short v14, v14

    const/16 v15, 0x27

    aget-byte v9, v13, v15

    int-to-byte v9, v9

    const/16 v15, 0x9f

    aget-byte v15, v13, v15

    int-to-byte v15, v15

    new-array v8, v1, [Ljava/lang/Object;

    invoke-static {v14, v9, v15, v8}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v8, v8, v4

    check-cast v8, Ljava/lang/String;

    new-array v9, v1, [Ljava/lang/Class;

    aget-byte v14, v13, v6

    int-to-byte v14, v14

    aget-byte v15, v13, v17

    neg-int v15, v15

    int-to-byte v15, v15

    new-array v6, v1, [Ljava/lang/Object;

    invoke-static {v5, v14, v15, v6}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v6, v6, v4

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    aput-object v6, v9, v4

    invoke-virtual {v11, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    const/4 v8, 0x0

    invoke-virtual {v6, v8, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    const/4 v8, 0x4

    aget-byte v9, v13, v8

    int-to-byte v8, v9

    aget-byte v9, v13, v17

    neg-int v9, v9

    int-to-byte v9, v9

    new-array v10, v1, [Ljava/lang/Object;

    invoke-static {v12, v8, v9, v10}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v8, v10, v4

    check-cast v8, Ljava/lang/String;

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    sget v9, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:I

    const/4 v10, 0x3

    sub-int/2addr v9, v10

    int-to-short v9, v9

    const/16 v10, 0x53

    aget-byte v10, v13, v10

    int-to-byte v10, v10

    aget-byte v11, v13, v16

    int-to-byte v11, v11

    new-array v12, v1, [Ljava/lang/Object;

    invoke-static {v9, v10, v11, v12}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v9, v12, v4

    check-cast v9, Ljava/lang/String;

    const/4 v10, 0x0

    invoke-virtual {v8, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v6, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Integer;

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6
    :try_end_26a
    .catchall {:try_start_1dc .. :try_end_26a} :catchall_670

    aput v6, v2, v3

    add-int/lit8 v3, v3, 0x1

    const/16 v6, 0x52

    const/4 v8, 0x0

    const/4 v9, 0x4

    goto/16 :goto_1d7

    :cond_274
    move v3, v4

    :goto_275
    add-int/lit8 v0, v3, 0x1

    :try_start_277
    aget v6, v2, v3

    invoke-virtual {v7, v6}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    move-result v6

    const/4 v8, 0x5

    const/16 v9, 0xf

    const/4 v10, 0x6

    const/4 v11, 0x7

    packed-switch v6, :pswitch_data_67a

    :goto_285
    const/4 v6, 0x3

    :goto_286
    const/16 v8, 0x25

    const/16 v18, 0x52

    goto/16 :goto_654

    :pswitch_28c
    const/16 v3, 0x32

    goto :goto_275

    :pswitch_28f
    new-array v6, v1, [B

    aput-byte v1, v6, v4

    iput-object v6, v7, Lo/lambdaonSeekBackIncrementChanged45;->read:Ljava/lang/Object;

    const/4 v6, 0x3

    :goto_296
    invoke-virtual {v7, v6}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    goto :goto_285

    :pswitch_29a
    filled-new-array {v4, v1, v4, v4}, [I

    move-result-object v6

    iput-object v6, v7, Lo/lambdaonSeekBackIncrementChanged45;->read:Ljava/lang/Object;
    :try_end_2a0
    .catchall {:try_start_277 .. :try_end_2a0} :catchall_657

    const/4 v6, 0x3

    :try_start_2a1
    invoke-virtual {v7, v6}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I
    :try_end_2a4
    .catchall {:try_start_2a1 .. :try_end_2a4} :catchall_2a5

    goto :goto_286

    :catchall_2a5
    move-exception v0

    goto/16 :goto_659

    :pswitch_2a8
    const/4 v6, 0x3

    :try_start_2a9
    iput v6, v7, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer:I

    invoke-virtual {v7, v8}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    invoke-virtual {v7, v10}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget-object v6, v7, Lo/lambdaonSeekBackIncrementChanged45;->write:Ljava/lang/Object;

    check-cast v6, [B

    invoke-virtual {v7, v11}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget v8, v7, Lo/lambdaonSeekBackIncrementChanged45;->IconCompatParcelizer:I

    if-eqz v8, :cond_2be

    move v8, v1

    goto :goto_2bf

    :cond_2be
    move v8, v4

    :goto_2bf
    invoke-virtual {v7, v10}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget-object v9, v7, Lo/lambdaonSeekBackIncrementChanged45;->write:Ljava/lang/Object;

    check-cast v9, [I

    new-array v10, v1, [Ljava/lang/Object;

    invoke-static {v6, v8, v9, v10}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->c([BZ[I[Ljava/lang/Object;)V

    aget-object v6, v10, v4

    check-cast v6, Ljava/lang/String;

    iput-object v6, v7, Lo/lambdaonSeekBackIncrementChanged45;->read:Ljava/lang/Object;
    :try_end_2d1
    .catchall {:try_start_2a9 .. :try_end_2d1} :catchall_657

    const/4 v6, 0x3

    goto :goto_296

    :pswitch_2d3
    const/16 v3, 0x46

    goto :goto_275

    :pswitch_2d6
    :try_start_2d6
    iput v1, v7, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer:I

    invoke-virtual {v7, v8}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    invoke-virtual {v7, v10}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget-object v6, v7, Lo/lambdaonSeekBackIncrementChanged45;->write:Ljava/lang/Object;
    :try_end_2e0
    .catchall {:try_start_2d6 .. :try_end_2e0} :catchall_32d

    :try_start_2e0
    sget v8, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:I
    :try_end_2e2
    .catchall {:try_start_2e0 .. :try_end_2e2} :catchall_323

    const/4 v12, 0x4

    add-int/2addr v8, v12

    int-to-short v8, v8

    :try_start_2e5
    sget-object v9, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:[B

    const/16 v10, 0x21

    aget-byte v10, v9, v10

    int-to-byte v10, v10

    aget-byte v11, v9, v17

    neg-int v11, v11

    int-to-byte v11, v11

    new-array v13, v1, [Ljava/lang/Object;

    invoke-static {v8, v10, v11, v13}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v8, v13, v4

    check-cast v8, Ljava/lang/String;

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/16 v10, 0xe8

    int-to-short v10, v10

    const/16 v11, 0x53

    aget-byte v11, v9, v11

    int-to-byte v11, v11

    const/16 v13, 0xd

    aget-byte v9, v9, v13

    int-to-byte v9, v9

    new-array v13, v1, [Ljava/lang/Object;

    invoke-static {v10, v11, v9, v13}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v9, v13, v4

    check-cast v9, Ljava/lang/String;

    const/4 v10, 0x0

    invoke-virtual {v8, v9, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    invoke-virtual {v8, v6, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_31c
    .catchall {:try_start_2e5 .. :try_end_31c} :catchall_321

    :try_start_31c
    iput-object v6, v7, Lo/lambdaonSeekBackIncrementChanged45;->read:Ljava/lang/Object;

    const/4 v6, 0x3

    goto/16 :goto_296

    :catchall_321
    move-exception v0

    goto :goto_325

    :catchall_323
    move-exception v0

    const/4 v12, 0x4

    :goto_325
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v6

    if-eqz v6, :cond_32c

    throw v6

    :cond_32c
    throw v0

    :catchall_32d
    move-exception v0

    const/4 v12, 0x4

    goto/16 :goto_658

    :pswitch_331
    const/4 v12, 0x4

    const/16 v6, 0xa

    invoke-virtual {v7, v6}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget v3, v7, Lo/lambdaonSeekBackIncrementChanged45;->IconCompatParcelizer:I

    if-nez v3, :cond_654

    const/16 v0, 0xe

    goto/16 :goto_654

    :pswitch_33f
    move v3, v9

    goto/16 :goto_275

    :pswitch_342
    const/4 v12, 0x4

    const/16 v3, 0x12

    goto/16 :goto_275

    :pswitch_347
    const/16 v6, 0xd

    const/4 v12, 0x4

    invoke-virtual {v7, v6}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget-object v0, v7, Lo/lambdaonSeekBackIncrementChanged45;->write:Ljava/lang/Object;

    check-cast v0, Ljava/lang/Throwable;

    throw v0

    :pswitch_352
    const/16 v6, 0xd

    const/4 v12, 0x4

    iput v1, v7, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer:I

    invoke-virtual {v7, v8}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    invoke-virtual {v7, v11}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget v8, v7, Lo/lambdaonSeekBackIncrementChanged45;->IconCompatParcelizer:I

    const/16 v9, 0xef

    int-to-short v9, v9

    sget-object v10, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:[B

    const/16 v11, 0x52

    aget-byte v13, v10, v11

    int-to-byte v11, v13

    aget-byte v10, v10, v17

    neg-int v10, v10

    int-to-byte v10, v10

    new-array v13, v1, [Ljava/lang/Object;

    invoke-static {v9, v11, v10, v13}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v9, v13, v4

    check-cast v9, Ljava/lang/String;

    invoke-static {v9}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v9

    invoke-static {v9, v8}, Ljava/lang/reflect/Array;->newInstance(Ljava/lang/Class;I)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v7, Lo/lambdaonSeekBackIncrementChanged45;->read:Ljava/lang/Object;

    const/4 v8, 0x3

    :goto_381
    invoke-virtual {v7, v8}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    goto/16 :goto_285

    :pswitch_386
    const/16 v6, 0xd

    const/4 v12, 0x4

    iput v1, v7, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer:I

    invoke-virtual {v7, v8}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    invoke-virtual {v7, v9}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget-wide v8, v7, Lo/lambdaonSeekBackIncrementChanged45;->RemoteActionCompatParcelizer:J
    :try_end_393
    .catchall {:try_start_31c .. :try_end_393} :catchall_657

    :try_start_393
    new-array v10, v1, [Ljava/lang/Object;

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    aput-object v8, v10, v4

    sget v8, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:I

    or-int/lit8 v8, v8, 0x2c

    int-to-short v8, v8

    sget-object v9, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:[B

    const/16 v11, 0xa7

    aget-byte v11, v9, v11

    int-to-byte v11, v11

    aget-byte v13, v9, v17

    neg-int v13, v13

    int-to-byte v13, v13

    new-array v14, v1, [Ljava/lang/Object;

    invoke-static {v8, v11, v13, v14}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v8, v14, v4

    check-cast v8, Ljava/lang/String;

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/16 v11, 0xc9

    int-to-short v11, v11

    const/16 v13, 0x27

    aget-byte v14, v9, v13

    int-to-byte v13, v14

    const/16 v14, 0x9f

    aget-byte v9, v9, v14

    int-to-byte v9, v9

    new-array v14, v1, [Ljava/lang/Object;

    invoke-static {v11, v13, v9, v14}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v9, v14, v4

    check-cast v9, Ljava/lang/String;

    new-array v11, v1, [Ljava/lang/Class;

    sget-object v13, Ljava/lang/Long;->TYPE:Ljava/lang/Class;

    aput-object v13, v11, v4

    invoke-virtual {v8, v9, v11}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v8, v9, v10}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8
    :try_end_3dd
    .catchall {:try_start_393 .. :try_end_3dd} :catchall_3e1

    :try_start_3dd
    iput-object v8, v7, Lo/lambdaonSeekBackIncrementChanged45;->read:Ljava/lang/Object;

    const/4 v8, 0x3

    goto :goto_381

    :catchall_3e1
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v8

    if-eqz v8, :cond_3e9

    throw v8

    :cond_3e9
    throw v0

    :pswitch_3ea
    const/16 v6, 0xd

    const/4 v12, 0x4

    const-class v8, Lcom/marrow/TrainingApplication;

    iput-object v8, v7, Lo/lambdaonSeekBackIncrementChanged45;->read:Ljava/lang/Object;

    const/4 v8, 0x3

    goto :goto_381

    :pswitch_3f3
    const/16 v6, 0xd

    const/4 v12, 0x4

    sget-object v8, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->$$a:[B

    aget-byte v8, v8, v10

    sub-int/2addr v8, v1

    int-to-byte v8, v8

    int-to-byte v9, v8

    int-to-byte v10, v9

    new-array v11, v1, [Ljava/lang/Object;

    invoke-static {v8, v9, v10, v11}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->d(ISB[Ljava/lang/Object;)V

    aget-object v8, v11, v4

    check-cast v8, Ljava/lang/String;

    iput-object v8, v7, Lo/lambdaonSeekBackIncrementChanged45;->read:Ljava/lang/Object;

    const/4 v8, 0x3

    goto/16 :goto_381

    :pswitch_40c
    const/16 v6, 0xd

    const/4 v12, 0x4

    iput v1, v7, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer:I

    invoke-virtual {v7, v8}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    invoke-virtual {v7, v11}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget v8, v7, Lo/lambdaonSeekBackIncrementChanged45;->IconCompatParcelizer:I

    new-array v8, v8, [Ljava/lang/Class;

    iput-object v8, v7, Lo/lambdaonSeekBackIncrementChanged45;->read:Ljava/lang/Object;

    const/4 v8, 0x3

    goto/16 :goto_381

    :pswitch_420
    const/16 v6, 0xd

    const/4 v12, 0x4

    sget-object v8, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:[B

    const/16 v9, 0x52

    aget-byte v10, v8, v9

    int-to-byte v9, v10

    aget-byte v8, v8, v17

    neg-int v8, v8

    int-to-byte v8, v8

    new-array v10, v1, [Ljava/lang/Object;

    invoke-static {v5, v9, v8, v10}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v8, v10, v4

    check-cast v8, Ljava/lang/String;

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    iput-object v8, v7, Lo/lambdaonSeekBackIncrementChanged45;->read:Ljava/lang/Object;
    :try_end_43d
    .catchall {:try_start_3dd .. :try_end_43d} :catchall_657

    const/4 v8, 0x3

    goto/16 :goto_381

    :pswitch_440
    const/16 v6, 0xd

    const/4 v12, 0x4

    :try_start_443
    sget v8, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->AudioAttributesImplApi26Parcelizer:I

    or-int/lit8 v8, v8, 0x2c

    int-to-short v8, v8

    sget-object v9, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:[B

    const/16 v10, 0xa7

    aget-byte v10, v9, v10

    int-to-byte v10, v10

    aget-byte v11, v9, v17

    neg-int v11, v11

    int-to-byte v11, v11

    new-array v13, v1, [Ljava/lang/Object;

    invoke-static {v8, v10, v11, v13}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v8, v13, v4

    check-cast v8, Ljava/lang/String;

    invoke-static {v8}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v8

    const/16 v10, 0x10b

    int-to-short v10, v10

    const/16 v11, 0x25

    aget-byte v9, v9, v11

    int-to-byte v9, v9

    int-to-byte v11, v9

    new-array v13, v1, [Ljava/lang/Object;

    invoke-static {v10, v9, v11, v13}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v9, v13, v4

    check-cast v9, Ljava/lang/String;

    invoke-virtual {v8, v9}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;

    move-result-object v8
    :try_end_476
    .catchall {:try_start_443 .. :try_end_476} :catchall_480

    const/4 v9, 0x0

    :try_start_477
    invoke-virtual {v8, v9}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    iput-object v8, v7, Lo/lambdaonSeekBackIncrementChanged45;->read:Ljava/lang/Object;

    const/4 v8, 0x3

    goto/16 :goto_381

    :catchall_480
    move-exception v0

    const/4 v9, 0x0

    goto/16 :goto_658

    :pswitch_484
    const/16 v6, 0xd

    const/4 v9, 0x0

    const/4 v11, 0x3

    const/4 v12, 0x4

    iput v11, v7, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer:I

    invoke-virtual {v7, v8}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    invoke-virtual {v7, v10}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget-object v8, v7, Lo/lambdaonSeekBackIncrementChanged45;->write:Ljava/lang/Object;

    check-cast v8, Ljava/lang/Class;

    invoke-virtual {v7, v10}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget-object v11, v7, Lo/lambdaonSeekBackIncrementChanged45;->write:Ljava/lang/Object;

    check-cast v11, Ljava/lang/String;

    invoke-virtual {v7, v10}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget-object v10, v7, Lo/lambdaonSeekBackIncrementChanged45;->write:Ljava/lang/Object;

    check-cast v10, [Ljava/lang/Class;

    invoke-virtual {v8, v11, v10}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v8

    iput-object v8, v7, Lo/lambdaonSeekBackIncrementChanged45;->read:Ljava/lang/Object;

    const/4 v8, 0x3

    goto/16 :goto_381

    :pswitch_4ac
    const/16 v6, 0xd

    const/4 v9, 0x0

    const/4 v12, 0x4

    const/4 v13, 0x2

    iput v13, v7, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer:I

    invoke-virtual {v7, v8}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    invoke-virtual {v7, v10}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget-object v8, v7, Lo/lambdaonSeekBackIncrementChanged45;->write:Ljava/lang/Object;

    invoke-virtual {v7, v11}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget v10, v7, Lo/lambdaonSeekBackIncrementChanged45;->IconCompatParcelizer:I
    :try_end_4c0
    .catchall {:try_start_477 .. :try_end_4c0} :catchall_657

    if-eqz v10, :cond_4c4

    move v10, v1

    goto :goto_4c5

    :cond_4c4
    move v10, v4

    :goto_4c5
    :try_start_4c5
    new-array v11, v1, [Ljava/lang/Object;

    invoke-static {v10}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    aput-object v10, v11, v4

    const/16 v10, 0x10e

    int-to-short v10, v10

    sget-object v13, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:[B

    const/16 v14, 0xef

    aget-byte v14, v13, v14

    int-to-byte v14, v14

    aget-byte v15, v13, v17

    neg-int v15, v15

    int-to-byte v15, v15

    new-array v6, v1, [Ljava/lang/Object;

    invoke-static {v10, v14, v15, v6}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v6, v6, v4

    check-cast v6, Ljava/lang/String;

    invoke-static {v6}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v6

    const/16 v10, 0x12f

    int-to-short v10, v10

    const/16 v14, 0x24

    aget-byte v14, v13, v14

    int-to-byte v14, v14

    const/16 v15, 0x39

    aget-byte v13, v13, v15

    int-to-byte v13, v13

    new-array v15, v1, [Ljava/lang/Object;

    invoke-static {v10, v14, v13, v15}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v10, v15, v4

    check-cast v10, Ljava/lang/String;

    new-array v13, v1, [Ljava/lang/Class;

    sget-object v14, Ljava/lang/Boolean;->TYPE:Ljava/lang/Class;

    aput-object v14, v13, v4

    invoke-virtual {v6, v10, v13}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v6

    invoke-virtual {v6, v8, v11}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    :try_end_50b
    .catchall {:try_start_4c5 .. :try_end_50b} :catchall_50d

    goto/16 :goto_285

    :catchall_50d
    move-exception v0

    :try_start_50e
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v6

    if-eqz v6, :cond_515

    throw v6

    :cond_515
    throw v0
    :try_end_516
    .catchall {:try_start_50e .. :try_end_516} :catchall_657

    :pswitch_516
    const/4 v6, 0x3

    const/4 v9, 0x0

    const/4 v12, 0x4

    :try_start_519
    iput v6, v7, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer:I
    :try_end_51b
    .catchall {:try_start_519 .. :try_end_51b} :catchall_5c7

    :try_start_51b
    invoke-virtual {v7, v8}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    invoke-virtual {v7, v10}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget-object v6, v7, Lo/lambdaonSeekBackIncrementChanged45;->write:Ljava/lang/Object;

    invoke-virtual {v7, v10}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget-object v8, v7, Lo/lambdaonSeekBackIncrementChanged45;->write:Ljava/lang/Object;

    invoke-virtual {v7, v10}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget-object v10, v7, Lo/lambdaonSeekBackIncrementChanged45;->write:Ljava/lang/Object;
    :try_end_52d
    .catchall {:try_start_51b .. :try_end_52d} :catchall_5c4

    :try_start_52d
    filled-new-array {v8, v10}, [Ljava/lang/Object;

    move-result-object v8

    const/16 v10, 0x13b

    int-to-short v10, v10

    sget-object v11, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->MediaBrowserCompatItemReceiver:[B

    const/16 v13, 0xe4

    aget-byte v13, v11, v13

    int-to-byte v13, v13

    aget-byte v14, v11, v17

    neg-int v14, v14

    int-to-byte v14, v14

    new-array v15, v1, [Ljava/lang/Object;

    invoke-static {v10, v13, v14, v15}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v10, v15, v4

    check-cast v10, Ljava/lang/String;

    invoke-static {v10}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v10

    const/16 v13, 0x152

    int-to-short v13, v13

    const/16 v14, 0x1c

    aget-byte v14, v11, v14

    int-to-byte v14, v14

    aget-byte v15, v11, v16

    int-to-byte v15, v15

    new-array v9, v1, [Ljava/lang/Object;

    invoke-static {v13, v14, v15, v9}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V

    aget-object v9, v9, v4

    check-cast v9, Ljava/lang/String;

    const/4 v13, 0x2

    new-array v14, v13, [Ljava/lang/Class;
    :try_end_563
    .catchall {:try_start_52d .. :try_end_563} :catchall_5b8

    const/16 v15, 0xef

    int-to-short v15, v15

    const/16 v18, 0x52

    :try_start_568
    aget-byte v12, v11, v18

    int-to-byte v12, v12

    aget-byte v13, v11, v17
    :try_end_56d
    .catchall {:try_start_568 .. :try_end_56d} :catchall_5b5

    neg-int v13, v13

    int-to-byte v13, v13

    :try_start_56f
    new-array v4, v1, [Ljava/lang/Object;

    invoke-static {v15, v12, v13, v4}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V
    :try_end_574
    .catchall {:try_start_56f .. :try_end_574} :catchall_5b2

    const/4 v12, 0x0

    :try_start_575
    aget-object v4, v4, v12

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v4

    aput-object v4, v14, v12
    :try_end_57f
    .catchall {:try_start_575 .. :try_end_57f} :catchall_5af

    const/16 v4, 0x157

    int-to-short v4, v4

    const/16 v12, 0x21

    :try_start_584
    aget-byte v12, v11, v12

    int-to-byte v12, v12

    const/16 v13, 0x3c

    aget-byte v11, v11, v13

    int-to-byte v11, v11

    new-array v13, v1, [Ljava/lang/Object;

    invoke-static {v4, v12, v11, v13}, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->a(SBS[Ljava/lang/Object;)V
    :try_end_591
    .catchall {:try_start_584 .. :try_end_591} :catchall_5b2

    const/4 v4, 0x0

    :try_start_592
    aget-object v11, v13, v4

    check-cast v11, Ljava/lang/String;

    invoke-static {v11}, Ljava/lang/Class;->forName(Ljava/lang/String;)Ljava/lang/Class;

    move-result-object v11

    aput-object v11, v14, v1

    invoke-virtual {v10, v9, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;

    move-result-object v9

    invoke-virtual {v9, v6, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6
    :try_end_5a4
    .catchall {:try_start_592 .. :try_end_5a4} :catchall_5b5

    :try_start_5a4
    iput-object v6, v7, Lo/lambdaonSeekBackIncrementChanged45;->read:Ljava/lang/Object;
    :try_end_5a6
    .catchall {:try_start_5a4 .. :try_end_5a6} :catchall_5ab

    const/4 v6, 0x3

    :try_start_5a7
    invoke-virtual {v7, v6}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    goto :goto_5e4

    :catchall_5ab
    move-exception v0

    const/4 v6, 0x3

    goto/16 :goto_626

    :catchall_5af
    move-exception v0

    move v4, v12

    goto :goto_5b6

    :catchall_5b2
    move-exception v0

    const/4 v4, 0x0

    goto :goto_5b6

    :catchall_5b5
    move-exception v0

    :goto_5b6
    const/4 v6, 0x3

    goto :goto_5bc

    :catchall_5b8
    move-exception v0

    const/4 v6, 0x3

    const/16 v18, 0x52

    :goto_5bc
    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v8

    if-eqz v8, :cond_5c3

    throw v8

    :cond_5c3
    throw v0

    :catchall_5c4
    move-exception v0

    const/4 v6, 0x3

    goto :goto_5c8

    :catchall_5c7
    move-exception v0

    :goto_5c8
    const/16 v18, 0x52

    goto :goto_626

    :pswitch_5cb
    return-void

    :pswitch_5cc
    const/16 v18, 0x52

    move v3, v1

    goto/16 :goto_275

    :pswitch_5d1
    const/4 v6, 0x3

    const/16 v18, 0x52

    const/16 v3, 0x3b

    goto/16 :goto_275

    :pswitch_5d8
    const/4 v6, 0x3

    const/16 v18, 0x52

    sget v8, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    iput v8, v7, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer:I

    const/16 v8, 0x1b

    invoke-virtual {v7, v8}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    :goto_5e4
    const/16 v8, 0x25

    goto/16 :goto_654

    :pswitch_5e8
    const/4 v6, 0x3

    const/16 v18, 0x52

    iput v1, v7, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer:I

    invoke-virtual {v7, v8}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    invoke-virtual {v7, v11}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget v8, v7, Lo/lambdaonSeekBackIncrementChanged45;->IconCompatParcelizer:I

    sput v8, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->read:I

    goto :goto_5e4

    :pswitch_5f8
    const/4 v6, 0x3

    const/16 v18, 0x52

    const/16 v8, 0x1f

    invoke-virtual {v7, v8}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget v3, v7, Lo/lambdaonSeekBackIncrementChanged45;->IconCompatParcelizer:I

    if-nez v3, :cond_654

    move/from16 v3, v16

    goto/16 :goto_275

    :pswitch_608
    const/4 v6, 0x3

    const/16 v18, 0x52

    const/16 v3, 0x45

    goto/16 :goto_275

    :pswitch_60f
    const/4 v6, 0x3

    const/16 v18, 0x52

    const/16 v3, 0x14

    goto/16 :goto_275

    :pswitch_616
    const/4 v6, 0x3

    const/16 v18, 0x52

    const/16 v8, 0x1f

    invoke-virtual {v7, v8}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget v3, v7, Lo/lambdaonSeekBackIncrementChanged45;->IconCompatParcelizer:I
    :try_end_620
    .catchall {:try_start_5a7 .. :try_end_620} :catchall_625

    if-nez v3, :cond_654

    const/16 v0, 0x4f

    goto :goto_654

    :catchall_625
    move-exception v0

    :goto_626
    const/16 v8, 0x25

    goto :goto_65d

    :pswitch_629
    const/4 v6, 0x3

    const/16 v18, 0x52

    const/16 v3, 0x57

    goto/16 :goto_275

    :pswitch_630
    const/4 v6, 0x3

    const/16 v18, 0x52

    const/16 v3, 0x55

    goto/16 :goto_275

    :pswitch_637
    const/4 v6, 0x3

    const/16 v8, 0x25

    const/16 v18, 0x52

    :try_start_63c
    invoke-virtual {v7, v8}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    iget v0, v7, Lo/lambdaonSeekBackIncrementChanged45;->IconCompatParcelizer:I
    :try_end_641
    .catchall {:try_start_63c .. :try_end_641} :catchall_649

    if-eqz v0, :cond_646

    const/16 v0, 0x36

    goto :goto_654

    :cond_646
    const/16 v0, 0x50

    goto :goto_654

    :catchall_649
    move-exception v0

    goto :goto_65d

    :pswitch_64b
    const/4 v6, 0x3

    const/16 v8, 0x25

    const/16 v18, 0x52

    const/16 v3, 0x54

    goto/16 :goto_275

    :cond_654
    :goto_654
    move v3, v0

    goto/16 :goto_275

    :catchall_657
    move-exception v0

    :goto_658
    const/4 v6, 0x3

    :goto_659
    const/16 v8, 0x25

    const/16 v18, 0x52

    :goto_65d
    const/16 v9, 0x14

    if-lt v3, v9, :cond_66f

    const/16 v9, 0x32

    if-ge v3, v9, :cond_66f

    iput-object v0, v7, Lo/lambdaonSeekBackIncrementChanged45;->read:Ljava/lang/Object;

    const/16 v3, 0x27

    invoke-virtual {v7, v3}, Lo/lambdaonSeekBackIncrementChanged45;->AudioAttributesCompatParcelizer(I)I

    const/16 v0, 0x9

    goto :goto_654

    :cond_66f
    throw v0

    :catchall_670
    move-exception v0

    invoke-virtual {v0}, Ljava/lang/Throwable;->getCause()Ljava/lang/Throwable;

    move-result-object v1

    if-eqz v1, :cond_678

    throw v1

    :cond_678
    throw v0

    nop

    :pswitch_data_67a
    .packed-switch -0x21
        :pswitch_64b
        :pswitch_637
        :pswitch_630
        :pswitch_629
        :pswitch_616
        :pswitch_60f
        :pswitch_608
        :pswitch_5f8
        :pswitch_5e8
        :pswitch_5d8
        :pswitch_5d1
        :pswitch_5cc
        :pswitch_5cb
        :pswitch_516
        :pswitch_4ac
        :pswitch_484
        :pswitch_440
        :pswitch_420
        :pswitch_40c
        :pswitch_3f3
        :pswitch_3ea
        :pswitch_386
        :pswitch_352
        :pswitch_347
        :pswitch_342
        :pswitch_33f
        :pswitch_331
        :pswitch_2d6
        :pswitch_2d3
        :pswitch_2a8
        :pswitch_29a
        :pswitch_28f
        :pswitch_28c
    .end packed-switch

    :array_6c0
    .array-data 2
        0xcs
        0xds
        0x0s
        0xes
        0x3s
        0x0s
        0x3s
        0xes
        0x0s
        0x3s
        0x2s
        0x3s
        0xes
        0xbs
        0x3s
        0xes
        0x2s
        0x3s
        0xes
        0x1s
        0xcs
        0xfs
        0x1s
        0x6s
        0x3s
        0xes
        0x6s
        0x0s
        0x6s
        0x1s
        0xcs
        0xbs
        0x3s
        0xes
        0xes
        0x1s
        0xds
        0x7s
        0x0s
        0xes
        0xes
        0x0s
        0xfs
        0x0s
        0x3s
        0xes
        0xds
        0x8s
        0x0s
        0xes
        0x0s
        0x3s
        0xcs
        0xds
        0xas
        0x1s
        0xds
        0x0s
        0x3s
        0xes
        0x3615s
        0x3615s
        0x0s
        0xes
        0x6s
        0x0s
        0xcs
        0xds
        0x0s
        0x3s
        0x3615s
        0x3615s
        0x0s
        0xes
        0xas
        0x0s
        0xds
        0xes
        0x0s
        0xes
        0x6s
        0x1s
        0x1s
        0xbs
        0x3s
        0x0s
        0xes
        0x0s
        0xcs
        0xds
        0xes
        0x6s
        0xcs
        0xds
        0x2s
        0x3s
        0xds
        0x0s
        0x3s
        0xes
        0xds
        0xfs
        0x3s
        0x0s
        0x0s
        0x3s
        0xcs
        0xds
        0x6s
        0x0s
        0x0s
        0xfs
        0x3s
        0x0s
        0xes
        0x6s
        0xcs
        0xds
        0xas
        0x0s
        0x0s
        0xfs
        0x3s
        0xes
        0xds
        0xes
        0x1s
        0x6s
        0x3s
        0x2s
        0x3s
        0xes
        0xds
        0x4s
        0x0s
        0xes
        0xes
        0x0s
        0x0s
        0x2s
        0x0s
        0xes
        0xes
        0x0s
        0x3s
        0x7s
        0xas
        0x1s
        0xfs
        0x0s
        0x3s
        0xes
        0x0s
        0xfs
        0x0s
        0xes
        0x2s
        0x3s
        0x2s
        0xfs
        0x0s
        0xes
        0x0s
        0x3s
        0x3s
        0x7s
        0x0s
        0x3s
        0xds
        0x0s
        0x0s
        0xes
        0x2s
        0x3s
        0x0s
        0x7s
        0x0s
        0xes
        0x0s
        0x3s
        0x3s
        0x7s
        0xes
        0x6s
        0x3s
        0x7s
        0x2s
        0x3s
        0x1s
        0xfs
        0x3s
        0x0s
        0x6s
        0x1s
        0xbs
        0xas
        0x3s
        0x0s
        0x6s
        0x0s
        0x3s
        0x7s
        0x2s
        0x6s
        0x2s
        0xfs
        0x3s
        0xes
        0x0s
        0x7s
        0x3s
        0xes
        0x0s
        0xbs
        0x3s
        0xes
        0x1s
        0xfs
        0x3s
        0xes
        0x1s
        0xfs
        0x3s
        0xes
        0x0s
        0x2s
        0x6s
        0xes
        0x0s
        0x3s
        0x3613s
        0x3613s
        0x6s
        0xes
        0x2s
        0x3s
        0x3s
        0x7s
        0x2s
        0x6s
        0xds
        0x0s
        0x3s
        0x0s
        0x6s
        0x0s
        0x3s
        0x7s
        0x6s
        0x1s
        0xes
        0xbs
        0xas
        0x1s
        0xes
        0xbs
        0xes
        0x0s
        0xes
        0x2s
        0x6s
        0xes
        0x6s
        0x0s
        0xfs
        0x0s
        0x3s
        0xes
        0x2s
        0xbs
        0x3s
        0xes
        0xbs
        0x2s
        0x3s
        0x2s
        0x3s
        0xes
        0x3613s
        0x3613s
        0x6s
        0xes
        0xes
        0x1s
        0xes
        0xbs
        0x3613s
    .end array-data
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer()Lcom/facebook/GraphRequest;
    .registers 4

    const/4 v0, 0x2

    .line 1607
    rem-int v1, v0, v0

    sget v1, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    add-int/lit8 v1, v1, 0x6d

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->read:I

    rem-int/2addr v1, v0

    iget-object p0, p0, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer:Lcom/facebook/GraphRequest;

    add-int/lit8 v2, v2, 0x79

    rem-int/lit16 v1, v2, 0x80

    sput v1, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_18

    return-object p0

    :cond_18
    const/4 p0, 0x0

    throw p0
.end method

.method public final write()Ljava/lang/Object;
    .registers 4

    const/4 v0, 0x2

    .line 1607
    rem-int v1, v0, v0

    sget v1, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    add-int/lit8 v1, v1, 0x25

    rem-int/lit16 v2, v1, 0x80

    sput v2, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->read:I

    rem-int/2addr v1, v0

    iget-object p0, p0, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->write:Ljava/lang/Object;

    if-nez v1, :cond_14

    const/16 v1, 0x24

    div-int/lit8 v1, v1, 0x0

    :cond_14
    add-int/lit8 v2, v2, 0x6d

    rem-int/lit16 v1, v2, 0x80

    sput v1, Lcom/facebook/GraphRequest$RemoteActionCompatParcelizer;->IconCompatParcelizer:I

    rem-int/2addr v2, v0

    if-nez v2, :cond_1e

    return-object p0

    :cond_1e
    const/4 p0, 0x0

    throw p0
.end method

###### Class com.facebook.GraphRequest.read (com.facebook.GraphRequest$read)
.class public interface abstract Lcom/facebook/GraphRequest$read;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/facebook/GraphRequest$write;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/GraphRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "read"
.end annotation

###### Class com.facebook.GraphRequest.write (com.facebook.GraphRequest$write)
.class public interface abstract Lcom/facebook/GraphRequest$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/GraphRequest;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "write"
.end annotation


# virtual methods
.method public abstract IconCompatParcelizer(Lo/lambdaonPlayerError41;)V
.end method
