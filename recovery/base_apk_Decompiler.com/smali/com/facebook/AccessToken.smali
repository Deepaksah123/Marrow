###### Class com.facebook.AccessToken (com.facebook.AccessToken)
.class public final Lcom/facebook/AccessToken;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/AccessToken$RemoteActionCompatParcelizer;,
        Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0010\u001e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0010\"\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u000c\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\t\u0018\u0000 A2\u00020\u0001:\u0003?@AB\u0089\u0001\u0008\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0010\u0010\u0006\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007\u0012\u0010\u0010\u0008\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007\u0012\u0010\u0010\t\u001a\u000c\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0011B\u000f\u0008\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013\u00a2\u0006\u0002\u0010\u0014J\u0014\u0010-\u001a\u00020.2\n\u0010/\u001a\u000600j\u0002`1H\u0002J\u0008\u00102\u001a\u000203H\u0016J\u0013\u00104\u001a\u00020!2\u0008\u00105\u001a\u0004\u0018\u000106H\u0096\u0002J\u0008\u00107\u001a\u000203H\u0016J\u0008\u00108\u001a\u000209H\u0007J\u0008\u0010:\u001a\u00020\u0003H\u0016J\u0008\u0010;\u001a\u00020\u0003H\u0002J\u0018\u0010<\u001a\u00020.2\u0006\u0010=\u001a\u00020\u00132\u0006\u0010>\u001a\u000203H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0018R\u0019\u0010\u0008\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001e\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u0016R\u0011\u0010 \u001a\u00020!8F\u00a2\u0006\u0006\u001a\u0004\u0008 \u0010\"R\u0011\u0010#\u001a\u00020!8F\u00a2\u0006\u0006\u001a\u0004\u0008#\u0010\"R\u0011\u0010$\u001a\u00020\r\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010\u0018R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\u001bR\u0011\u0010\'\u001a\u00020\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0011\u0010*\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008,\u0010\u0016\u00a8\u0006B"
    }
    d2 = {
        "Lcom/facebook/AccessToken;",
        "Landroid/os/Parcelable;",
        "accessToken",
        "",
        "applicationId",
        "userId",
        "permissions",
        "",
        "declinedPermissions",
        "expiredPermissions",
        "accessTokenSource",
        "Lcom/facebook/AccessTokenSource;",
        "expirationTime",
        "Ljava/util/Date;",
        "lastRefreshTime",
        "dataAccessExpirationTime",
        "graphDomain",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lcom/facebook/AccessTokenSource;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V",
        "parcel",
        "Landroid/os/Parcel;",
        "(Landroid/os/Parcel;)V",
        "getApplicationId",
        "()Ljava/lang/String;",
        "getDataAccessExpirationTime",
        "()Ljava/util/Date;",
        "",
        "getDeclinedPermissions",
        "()Ljava/util/Set;",
        "getExpiredPermissions",
        "expires",
        "getExpires",
        "getGraphDomain",
        "isDataAccessExpired",
        "",
        "()Z",
        "isExpired",
        "lastRefresh",
        "getLastRefresh",
        "getPermissions",
        "source",
        "getSource",
        "()Lcom/facebook/AccessTokenSource;",
        "token",
        "getToken",
        "getUserId",
        "appendPermissions",
        "",
        "builder",
        "Ljava/lang/StringBuilder;",
        "Lkotlin/text/StringBuilder;",
        "describeContents",
        "",
        "equals",
        "other",
        "",
        "hashCode",
        "toJSONObject",
        "Lorg/json/JSONObject;",
        "toString",
        "tokenToString",
        "writeToParcel",
        "dest",
        "flags",
        "AccessTokenCreationCallback",
        "AccessTokenRefreshCallback",
        "Companion",
        "facebook-core_release"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/facebook/AccessToken;",
            ">;"
        }
    .end annotation
.end field

.field private static final IconCompatParcelizer:Ljava/util/Date;

.field public static final RemoteActionCompatParcelizer:Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;

.field private static final read:Ljava/util/Date;

.field private static final write:Lo/lambdaonIsLoadingChanged32;


# instance fields
.field private final AudioAttributesCompatParcelizer:Ljava/lang/String;

.field private final AudioAttributesImplApi21Parcelizer:Ljava/util/Date;

.field private final AudioAttributesImplApi26Parcelizer:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final AudioAttributesImplBaseParcelizer:Ljava/util/Date;

.field private final MediaBrowserCompatCustomActionResultReceiver:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final MediaBrowserCompatItemReceiver:Ljava/lang/String;

.field private final MediaBrowserCompatMediaItem:Ljava/lang/String;

.field private final MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field

.field private final MediaDescriptionCompat:Lo/lambdaonIsLoadingChanged32;

.field private final MediaMetadataCompat:Ljava/util/Date;

.field private final RatingCompat:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .registers 3

    new-instance v0, Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Lcom/facebook/AccessToken;->RemoteActionCompatParcelizer:Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;

    .line 369
    new-instance v0, Ljava/util/Date;

    const-wide v1, 0x7fffffffffffffffL

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 370
    sput-object v0, Lcom/facebook/AccessToken;->read:Ljava/util/Date;

    .line 371
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    sput-object v0, Lcom/facebook/AccessToken;->IconCompatParcelizer:Ljava/util/Date;

    .line 372
    sget-object v0, Lo/lambdaonIsLoadingChanged32;->read:Lo/lambdaonIsLoadingChanged32;

    sput-object v0, Lcom/facebook/AccessToken;->write:Lo/lambdaonIsLoadingChanged32;

    .line 669
    new-instance v0, Lcom/facebook/AccessToken$read;

    invoke-direct {v0}, Lcom/facebook/AccessToken$read;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/facebook/AccessToken;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(Landroid/os/Parcel;)V
    .registers 7

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 318
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    new-instance v1, Ljava/util/Date;

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Ljava/util/Date;-><init>(J)V

    iput-object v1, p0, Lcom/facebook/AccessToken;->AudioAttributesImplBaseParcelizer:Ljava/util/Date;

    .line 319
    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    .line 320
    move-object v2, v1

    check-cast v2, Ljava/util/List;

    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readStringList(Ljava/util/List;)V

    .line 321
    move-object v3, v1

    check-cast v3, Ljava/util/Collection;

    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    check-cast v4, Ljava/util/Set;

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v4

    invoke-static {v4, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    .line 322
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->clear()V

    .line 323
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readStringList(Ljava/util/List;)V

    .line 324
    new-instance v4, Ljava/util/HashSet;

    invoke-direct {v4, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    check-cast v4, Ljava/util/Set;

    invoke-static {v4}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v4

    invoke-static {v4, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v4, p0, Lcom/facebook/AccessToken;->AudioAttributesImplApi26Parcelizer:Ljava/util/Set;

    .line 325
    invoke-virtual {v1}, Ljava/util/AbstractCollection;->clear()V

    .line 326
    invoke-virtual {p1, v2}, Landroid/os/Parcel;->readStringList(Ljava/util/List;)V

    .line 327
    new-instance v1, Ljava/util/HashSet;

    invoke-direct {v1, v3}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    check-cast v1, Ljava/util/Set;

    invoke-static {v1}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object v1

    invoke-static {v1, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object v1, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/Set;

    .line 328
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    .line 329
    const-string v1, "token"

    invoke-static {v0, v1}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda8;->write(Ljava/lang/String;Ljava/lang/String;)V

    .line 330
    const-string v1, "Required value was null."

    if-eqz v0, :cond_ca

    iput-object v0, p0, Lcom/facebook/AccessToken;->RatingCompat:Ljava/lang/String;

    .line 331
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_77

    .line 333
    invoke-static {v0}, Lo/lambdaonIsLoadingChanged32;->valueOf(Ljava/lang/String;)Lo/lambdaonIsLoadingChanged32;

    move-result-object v0

    goto :goto_79

    .line 334
    :cond_77
    sget-object v0, Lcom/facebook/AccessToken;->write:Lo/lambdaonIsLoadingChanged32;

    .line 333
    :goto_79
    iput-object v0, p0, Lcom/facebook/AccessToken;->MediaDescriptionCompat:Lo/lambdaonIsLoadingChanged32;

    .line 335
    new-instance v0, Ljava/util/Date;

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v2

    invoke-direct {v0, v2, v3}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/facebook/AccessToken;->MediaMetadataCompat:Ljava/util/Date;

    .line 336
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    .line 337
    const-string v2, "applicationId"

    invoke-static {v0, v2}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda8;->write(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_be

    .line 338
    iput-object v0, p0, Lcom/facebook/AccessToken;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 339
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v0

    .line 340
    const-string v2, "userId"

    invoke-static {v0, v2}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda8;->write(Ljava/lang/String;Ljava/lang/String;)V

    if-eqz v0, :cond_b2

    .line 341
    iput-object v0, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    .line 342
    new-instance v0, Ljava/util/Date;

    invoke-virtual {p1}, Landroid/os/Parcel;->readLong()J

    move-result-wide v1

    invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V

    iput-object v0, p0, Lcom/facebook/AccessToken;->AudioAttributesImplApi21Parcelizer:Ljava/util/Date;

    .line 343
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    return-void

    .line 341
    :cond_b2
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    throw p0

    .line 338
    :cond_be
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    throw p0

    .line 330
    :cond_ca
    new-instance p0, Ljava/lang/IllegalStateException;

    invoke-virtual {v1}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    throw p0
.end method

.method public constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lo/lambdaonIsLoadingChanged32;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V
    .registers 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Ljava/util/Collection<",
            "Ljava/lang/String;",
            ">;",
            "Lo/lambdaonIsLoadingChanged32;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/util/Date;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    const-string v0, ""

    invoke-static {p1, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p3, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 174
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const-string v1, "accessToken"

    invoke-static {p1, v1}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda8;->read(Ljava/lang/String;Ljava/lang/String;)V

    .line 175
    const-string v1, "applicationId"

    invoke-static {p2, v1}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda8;->read(Ljava/lang/String;Ljava/lang/String;)V

    .line 176
    const-string v1, "userId"

    invoke-static {p3, v1}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda8;->read(Ljava/lang/String;Ljava/lang/String;)V

    if-nez p8, :cond_21

    .line 178
    sget-object p8, Lcom/facebook/AccessToken;->read:Ljava/util/Date;

    :cond_21
    iput-object p8, p0, Lcom/facebook/AccessToken;->AudioAttributesImplBaseParcelizer:Ljava/util/Date;

    .line 180
    new-instance p8, Ljava/util/HashSet;

    if-eqz p4, :cond_2b

    invoke-direct {p8, p4}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    goto :goto_2e

    :cond_2b
    invoke-direct {p8}, Ljava/util/HashSet;-><init>()V

    :goto_2e
    check-cast p8, Ljava/util/Set;

    invoke-static {p8}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p4

    invoke-static {p4, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    .line 183
    new-instance p4, Ljava/util/HashSet;

    if-eqz p5, :cond_41

    invoke-direct {p4, p5}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    goto :goto_44

    :cond_41
    invoke-direct {p4}, Ljava/util/HashSet;-><init>()V

    :goto_44
    check-cast p4, Ljava/util/Set;

    .line 182
    invoke-static {p4}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p4

    invoke-static {p4, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, Lcom/facebook/AccessToken;->AudioAttributesImplApi26Parcelizer:Ljava/util/Set;

    .line 186
    new-instance p4, Ljava/util/HashSet;

    if-eqz p6, :cond_57

    invoke-direct {p4, p6}, Ljava/util/HashSet;-><init>(Ljava/util/Collection;)V

    goto :goto_5a

    :cond_57
    invoke-direct {p4}, Ljava/util/HashSet;-><init>()V

    :goto_5a
    check-cast p4, Ljava/util/Set;

    .line 185
    invoke-static {p4}, Ljava/util/Collections;->unmodifiableSet(Ljava/util/Set;)Ljava/util/Set;

    move-result-object p4

    invoke-static {p4, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p4, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/Set;

    .line 187
    iput-object p1, p0, Lcom/facebook/AccessToken;->RatingCompat:Ljava/lang/String;

    if-nez p7, :cond_6b

    .line 188
    sget-object p7, Lcom/facebook/AccessToken;->write:Lo/lambdaonIsLoadingChanged32;

    :cond_6b
    iput-object p7, p0, Lcom/facebook/AccessToken;->MediaDescriptionCompat:Lo/lambdaonIsLoadingChanged32;

    if-nez p9, :cond_71

    .line 189
    sget-object p9, Lcom/facebook/AccessToken;->IconCompatParcelizer:Ljava/util/Date;

    :cond_71
    iput-object p9, p0, Lcom/facebook/AccessToken;->MediaMetadataCompat:Ljava/util/Date;

    .line 190
    iput-object p2, p0, Lcom/facebook/AccessToken;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    .line 191
    iput-object p3, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    if-eqz p10, :cond_83

    .line 193
    invoke-virtual {p10}, Ljava/util/Date;->getTime()J

    move-result-wide p1

    const-wide/16 p3, 0x0

    cmp-long p1, p1, p3

    if-nez p1, :cond_85

    .line 196
    :cond_83
    sget-object p10, Lcom/facebook/AccessToken;->read:Ljava/util/Date;

    .line 193
    :cond_85
    iput-object p10, p0, Lcom/facebook/AccessToken;->AudioAttributesImplApi21Parcelizer:Ljava/util/Date;

    .line 198
    iput-object p11, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lo/lambdaonIsLoadingChanged32;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 27

    move/from16 v0, p12

    and-int/lit16 v0, v0, 0x400

    if-eqz v0, :cond_9

    const/4 v0, 0x0

    move-object v12, v0

    goto :goto_b

    :cond_9
    move-object/from16 v12, p11

    :goto_b
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    .line 172
    invoke-direct/range {v1 .. v12}, Lcom/facebook/AccessToken;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lo/lambdaonIsLoadingChanged32;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V

    return-void
.end method

.method public static final AudioAttributesCompatParcelizer()Lcom/facebook/AccessToken;
    .registers 1
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    .line 670
    invoke-static {}, Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;->read()Lcom/facebook/AccessToken;

    move-result-object v0

    return-object v0
.end method

.method private final AudioAttributesCompatParcelizer(Ljava/lang/StringBuilder;)V
    .registers 3

    .line 311
    const-string v0, " permissions:"

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 312
    const-string v0, "["

    invoke-virtual {p1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 313
    const-string v0, ", "

    check-cast v0, Ljava/lang/CharSequence;

    iget-object p0, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {v0, p0}, Landroid/text/TextUtils;->join(Ljava/lang/CharSequence;Ljava/lang/Iterable;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 314
    const-string p0, "]"

    invoke-virtual {p1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method

.method private final MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Ljava/lang/String;
    .registers 2

    .line 303
    sget-object v0, Lo/lambdaonPositionDiscontinuity43;->AudioAttributesImplApi21Parcelizer:Lo/lambdaonPositionDiscontinuity43;

    invoke-static {v0}, Lo/lambdaonMediaMetadataChanged48;->write(Lo/lambdaonPositionDiscontinuity43;)Z

    move-result v0

    if-eqz v0, :cond_b

    .line 304
    iget-object p0, p0, Lcom/facebook/AccessToken;->RatingCompat:Ljava/lang/String;

    return-object p0

    .line 306
    :cond_b
    const-string p0, "ACCESS_TOKEN_REMOVED"

    return-object p0
.end method

.method public static final write()Z
    .registers 1
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    .line 671
    invoke-static {}, Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer()Z

    move-result v0

    return v0
.end method


# virtual methods
.method public final AudioAttributesImplApi21Parcelizer()Ljava/util/Set;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 66
    iget-object p0, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    return-object p0
.end method

.method public final AudioAttributesImplApi26Parcelizer()Ljava/lang/String;
    .registers 1

    .line 133
    iget-object p0, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    return-object p0
.end method

.method public final AudioAttributesImplBaseParcelizer()Ljava/util/Date;
    .registers 1

    .line 105
    iget-object p0, p0, Lcom/facebook/AccessToken;->MediaMetadataCompat:Ljava/util/Date;

    return-object p0
.end method

.method public final IconCompatParcelizer()Ljava/lang/String;
    .registers 1

    .line 112
    iget-object p0, p0, Lcom/facebook/AccessToken;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final MediaBrowserCompatCustomActionResultReceiver()Ljava/util/Date;
    .registers 1

    .line 56
    iget-object p0, p0, Lcom/facebook/AccessToken;->AudioAttributesImplBaseParcelizer:Ljava/util/Date;

    return-object p0
.end method

.method public final MediaBrowserCompatItemReceiver()Ljava/util/Set;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 83
    iget-object p0, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/Set;

    return-object p0
.end method

.method public final MediaBrowserCompatMediaItem()Ljava/lang/String;
    .registers 1

    .line 90
    iget-object p0, p0, Lcom/facebook/AccessToken;->RatingCompat:Ljava/lang/String;

    return-object p0
.end method

.method public final MediaBrowserCompatSearchResultReceiver()Lorg/json/JSONObject;
    .registers 5
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .line 281
    new-instance v0, Lorg/json/JSONObject;

    invoke-direct {v0}, Lorg/json/JSONObject;-><init>()V

    .line 282
    const-string v1, "version"

    const/4 v2, 0x1

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;I)Lorg/json/JSONObject;

    .line 283
    const-string v1, "token"

    iget-object v2, p0, Lcom/facebook/AccessToken;->RatingCompat:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 284
    iget-object v1, p0, Lcom/facebook/AccessToken;->AudioAttributesImplBaseParcelizer:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    const-string v3, "expires_at"

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 285
    new-instance v1, Lorg/json/JSONArray;

    iget-object v2, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    check-cast v2, Ljava/util/Collection;

    invoke-direct {v1, v2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 286
    const-string v2, "permissions"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 287
    new-instance v1, Lorg/json/JSONArray;

    iget-object v2, p0, Lcom/facebook/AccessToken;->AudioAttributesImplApi26Parcelizer:Ljava/util/Set;

    check-cast v2, Ljava/util/Collection;

    invoke-direct {v1, v2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 288
    const-string v2, "declined_permissions"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 289
    new-instance v1, Lorg/json/JSONArray;

    iget-object v2, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/Set;

    check-cast v2, Ljava/util/Collection;

    invoke-direct {v1, v2}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V

    .line 290
    const-string v2, "expired_permissions"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 291
    iget-object v1, p0, Lcom/facebook/AccessToken;->MediaMetadataCompat:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    const-string v3, "last_refresh"

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 292
    iget-object v1, p0, Lcom/facebook/AccessToken;->MediaDescriptionCompat:Lo/lambdaonIsLoadingChanged32;

    invoke-virtual {v1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v1

    const-string v2, "source"

    invoke-virtual {v0, v2, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 293
    const-string v1, "application_id"

    iget-object v2, p0, Lcom/facebook/AccessToken;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 294
    const-string v1, "user_id"

    iget-object v2, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    invoke-virtual {v0, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    .line 295
    iget-object v1, p0, Lcom/facebook/AccessToken;->AudioAttributesImplApi21Parcelizer:Ljava/util/Date;

    invoke-virtual {v1}, Ljava/util/Date;->getTime()J

    move-result-wide v1

    const-string v3, "data_access_expiration_time"

    invoke-virtual {v0, v3, v1, v2}, Lorg/json/JSONObject;->put(Ljava/lang/String;J)Lorg/json/JSONObject;

    .line 296
    iget-object p0, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    if-eqz p0, :cond_7f

    .line 297
    const-string v1, "graph_domain"

    invoke-virtual {v0, v1, p0}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;

    :cond_7f
    return-object v0
.end method

.method public final MediaDescriptionCompat()Lo/lambdaonIsLoadingChanged32;
    .registers 1

    .line 97
    iget-object p0, p0, Lcom/facebook/AccessToken;->MediaDescriptionCompat:Lo/lambdaonIsLoadingChanged32;

    return-object p0
.end method

.method public final MediaMetadataCompat()Ljava/lang/String;
    .registers 1

    .line 119
    iget-object p0, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    return-object p0
.end method

.method public final RatingCompat()Z
    .registers 2

    .line 268
    new-instance v0, Ljava/util/Date;

    invoke-direct {v0}, Ljava/util/Date;-><init>()V

    iget-object p0, p0, Lcom/facebook/AccessToken;->AudioAttributesImplBaseParcelizer:Ljava/util/Date;

    invoke-virtual {v0, p0}, Ljava/util/Date;->after(Ljava/util/Date;)Z

    move-result p0

    return p0
.end method

.method public final RemoteActionCompatParcelizer()Ljava/util/Date;
    .registers 1

    .line 126
    iget-object p0, p0, Lcom/facebook/AccessToken;->AudioAttributesImplApi21Parcelizer:Ljava/util/Date;

    return-object p0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final equals(Ljava/lang/Object;)Z
    .registers 6

    .line 227
    move-object v0, p0

    check-cast v0, Lcom/facebook/AccessToken;

    const/4 v0, 0x1

    if-ne p0, p1, :cond_7

    return v0

    .line 230
    :cond_7
    instance-of v1, p1, Lcom/facebook/AccessToken;

    const/4 v2, 0x0

    if-nez v1, :cond_d

    return v2

    .line 243
    :cond_d
    iget-object v1, p0, Lcom/facebook/AccessToken;->AudioAttributesImplBaseParcelizer:Ljava/util/Date;

    check-cast p1, Lcom/facebook/AccessToken;

    iget-object v3, p1, Lcom/facebook/AccessToken;->AudioAttributesImplBaseParcelizer:Ljava/util/Date;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_81

    iget-object v1, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    iget-object v3, p1, Lcom/facebook/AccessToken;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_81

    iget-object v1, p0, Lcom/facebook/AccessToken;->AudioAttributesImplApi26Parcelizer:Ljava/util/Set;

    iget-object v3, p1, Lcom/facebook/AccessToken;->AudioAttributesImplApi26Parcelizer:Ljava/util/Set;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_81

    iget-object v1, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/Set;

    iget-object v3, p1, Lcom/facebook/AccessToken;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/Set;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_81

    iget-object v1, p0, Lcom/facebook/AccessToken;->RatingCompat:Ljava/lang/String;

    iget-object v3, p1, Lcom/facebook/AccessToken;->RatingCompat:Ljava/lang/String;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_81

    iget-object v1, p0, Lcom/facebook/AccessToken;->MediaDescriptionCompat:Lo/lambdaonIsLoadingChanged32;

    iget-object v3, p1, Lcom/facebook/AccessToken;->MediaDescriptionCompat:Lo/lambdaonIsLoadingChanged32;

    if-ne v1, v3, :cond_81

    iget-object v1, p0, Lcom/facebook/AccessToken;->MediaMetadataCompat:Ljava/util/Date;

    iget-object v3, p1, Lcom/facebook/AccessToken;->MediaMetadataCompat:Ljava/util/Date;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_81

    iget-object v1, p0, Lcom/facebook/AccessToken;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    iget-object v3, p1, Lcom/facebook/AccessToken;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_81

    iget-object v1, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    iget-object v3, p1, Lcom/facebook/AccessToken;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_81

    iget-object v1, p0, Lcom/facebook/AccessToken;->AudioAttributesImplApi21Parcelizer:Ljava/util/Date;

    iget-object v3, p1, Lcom/facebook/AccessToken;->AudioAttributesImplApi21Parcelizer:Ljava/util/Date;

    invoke-static {v1, v3}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_81

    iget-object p0, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    if-nez p0, :cond_78

    iget-object p0, p1, Lcom/facebook/AccessToken;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    if-nez p0, :cond_81

    goto :goto_80

    :cond_78
    iget-object p1, p1, Lcom/facebook/AccessToken;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    invoke-static {p0, p1}, Lo/toMagicModuleMetaRepoModel;->RemoteActionCompatParcelizer(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_81

    :goto_80
    return v0

    :cond_81
    return v2
.end method

.method public final hashCode()I
    .registers 11

    .line 248
    iget-object v0, p0, Lcom/facebook/AccessToken;->AudioAttributesImplBaseParcelizer:Ljava/util/Date;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    .line 249
    iget-object v1, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    .line 250
    iget-object v2, p0, Lcom/facebook/AccessToken;->AudioAttributesImplApi26Parcelizer:Ljava/util/Set;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    .line 251
    iget-object v3, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/Set;

    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    .line 252
    iget-object v4, p0, Lcom/facebook/AccessToken;->RatingCompat:Ljava/lang/String;

    invoke-virtual {v4}, Ljava/lang/Object;->hashCode()I

    move-result v4

    .line 253
    iget-object v5, p0, Lcom/facebook/AccessToken;->MediaDescriptionCompat:Lo/lambdaonIsLoadingChanged32;

    invoke-virtual {v5}, Ljava/lang/Object;->hashCode()I

    move-result v5

    .line 254
    iget-object v6, p0, Lcom/facebook/AccessToken;->MediaMetadataCompat:Ljava/util/Date;

    invoke-virtual {v6}, Ljava/lang/Object;->hashCode()I

    move-result v6

    .line 255
    iget-object v7, p0, Lcom/facebook/AccessToken;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {v7}, Ljava/lang/Object;->hashCode()I

    move-result v7

    .line 256
    iget-object v8, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    invoke-virtual {v8}, Ljava/lang/Object;->hashCode()I

    move-result v8

    .line 257
    iget-object v9, p0, Lcom/facebook/AccessToken;->AudioAttributesImplApi21Parcelizer:Ljava/util/Date;

    invoke-virtual {v9}, Ljava/lang/Object;->hashCode()I

    move-result v9

    .line 258
    iget-object p0, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    if-eqz p0, :cond_45

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result p0

    goto :goto_46

    :cond_45
    const/4 p0, 0x0

    :goto_46
    add-int/lit16 v0, v0, 0x20f

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v1

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v2

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v3

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v4

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v5

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v6

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v7

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v8

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, v9

    mul-int/lit8 v0, v0, 0x1f

    add-int/2addr v0, p0

    return v0
.end method

.method public final read()Ljava/util/Set;
    .registers 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Set<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .line 76
    iget-object p0, p0, Lcom/facebook/AccessToken;->AudioAttributesImplApi26Parcelizer:Ljava/util/Set;

    return-object p0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 218
    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    .line 219
    const-string v1, "{AccessToken token:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 220
    invoke-direct {p0}, Lcom/facebook/AccessToken;->MediaControllerCompatMediaControllerImplApi21ExtraBinderRequestResultReceiver()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 221
    invoke-direct {p0, v0}, Lcom/facebook/AccessToken;->AudioAttributesCompatParcelizer(Ljava/lang/StringBuilder;)V

    .line 222
    const-string p0, "}"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 223
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 5

    const-string p2, ""

    invoke-static {p1, p2}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 351
    iget-object p2, p0, Lcom/facebook/AccessToken;->AudioAttributesImplBaseParcelizer:Ljava/util/Date;

    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 352
    new-instance p2, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatSearchResultReceiver:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    check-cast p2, Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 353
    new-instance p2, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/facebook/AccessToken;->AudioAttributesImplApi26Parcelizer:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    check-cast p2, Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 354
    new-instance p2, Ljava/util/ArrayList;

    iget-object v0, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatCustomActionResultReceiver:Ljava/util/Set;

    check-cast v0, Ljava/util/Collection;

    invoke-direct {p2, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    check-cast p2, Ljava/util/List;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeStringList(Ljava/util/List;)V

    .line 355
    iget-object p2, p0, Lcom/facebook/AccessToken;->RatingCompat:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 356
    iget-object p2, p0, Lcom/facebook/AccessToken;->MediaDescriptionCompat:Lo/lambdaonIsLoadingChanged32;

    invoke-virtual {p2}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 357
    iget-object p2, p0, Lcom/facebook/AccessToken;->MediaMetadataCompat:Ljava/util/Date;

    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 358
    iget-object p2, p0, Lcom/facebook/AccessToken;->AudioAttributesCompatParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 359
    iget-object p2, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatMediaItem:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 360
    iget-object p2, p0, Lcom/facebook/AccessToken;->AudioAttributesImplApi21Parcelizer:Ljava/util/Date;

    invoke-virtual {p2}, Ljava/util/Date;->getTime()J

    move-result-wide v0

    invoke-virtual {p1, v0, v1}, Landroid/os/Parcel;->writeLong(J)V

    .line 361
    iget-object p0, p0, Lcom/facebook/AccessToken;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

###### Class com.facebook.AccessToken.AudioAttributesCompatParcelizer (com.facebook.AccessToken$AudioAttributesCompatParcelizer)
.class public final Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/AccessToken;
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
        "\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J\u0017\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0004H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\t\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0008H\u0007\u00a2\u0006\u0004\u0008\t\u0010\nJ\u0019\u0010\u000c\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u000bH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u000f\u0010\u000c\u001a\u00020\u000eH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\u0003J\u0011\u0010\u0006\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u000fJ)\u0010\u0013\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00100\u00122\u0006\u0010\u0005\u001a\u00020\u000b2\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J\u000f\u0010\u0013\u001a\u00020\u0015H\u0007\u00a2\u0006\u0004\u0008\u0013\u0010\u0016J\u0019\u0010\u0017\u001a\u00020\u000e2\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007\u00a2\u0006\u0004\u0008\u0017\u0010\u0018R\u0017\u0010\u001a\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u00198\u0006\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0006\u001a\u00020\u001c8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\t\u0010\u001dR\u0014\u0010\u0013\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0006\u0010\u001fR\u0014\u0010\u0017\u001a\u00020\u001e8\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0017\u0010\u001f"
    }
    d2 = {
        "Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;",
        "",
        "<init>",
        "()V",
        "Lcom/facebook/AccessToken;",
        "p0",
        "read",
        "(Lcom/facebook/AccessToken;)Lcom/facebook/AccessToken;",
        "Lorg/json/JSONObject;",
        "write",
        "(Lorg/json/JSONObject;)Lcom/facebook/AccessToken;",
        "Landroid/os/Bundle;",
        "RemoteActionCompatParcelizer",
        "(Landroid/os/Bundle;)Lcom/facebook/AccessToken;",
        "",
        "()Lcom/facebook/AccessToken;",
        "",
        "p1",
        "",
        "AudioAttributesCompatParcelizer",
        "(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;",
        "",
        "()Z",
        "IconCompatParcelizer",
        "(Lcom/facebook/AccessToken;)V",
        "Landroid/os/Parcelable$Creator;",
        "CREATOR",
        "Landroid/os/Parcelable$Creator;",
        "Lo/lambdaonIsLoadingChanged32;",
        "Lo/lambdaonIsLoadingChanged32;",
        "Ljava/util/Date;",
        "Ljava/util/Date;"
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

    .line 364
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 364
    invoke-direct {p0}, Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/os/Bundle;",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation

    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 597
    invoke-virtual {p0, p1}, Landroid/os/Bundle;->getStringArrayList(Ljava/lang/String;)Ljava/util/ArrayList;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    if-nez p0, :cond_12

    .line 601
    invoke-static {}, Lo/IntermediateLoginResponseBody;->RemoteActionCompatParcelizer()Ljava/util/List;

    move-result-object p0

    return-object p0

    .line 603
    :cond_12
    new-instance p1, Ljava/util/ArrayList;

    check-cast p0, Ljava/util/Collection;

    invoke-direct {p1, p0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    check-cast p1, Ljava/util/List;

    invoke-static {p1}, Ljava/util/Collections;->unmodifiableList(Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static AudioAttributesCompatParcelizer()Z
    .registers 1
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    .line 411
    sget-object v0, Lo/lambdaonLoadError26;->read:Lo/lambdaonLoadError26$read;

    invoke-virtual {v0}, Lo/lambdaonLoadError26$read;->read()Lo/lambdaonLoadError26;

    move-result-object v0

    invoke-virtual {v0}, Lo/lambdaonLoadError26;->write()Lcom/facebook/AccessToken;

    move-result-object v0

    if-eqz v0, :cond_14

    .line 412
    invoke-virtual {v0}, Lcom/facebook/AccessToken;->RatingCompat()Z

    move-result v0

    if-nez v0, :cond_14

    const/4 v0, 0x1

    return v0

    :cond_14
    const/4 v0, 0x0

    return v0
.end method

.method public static IconCompatParcelizer(Lcom/facebook/AccessToken;)V
    .registers 2
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    .line 402
    sget-object v0, Lo/lambdaonLoadError26;->read:Lo/lambdaonLoadError26$read;

    invoke-virtual {v0}, Lo/lambdaonLoadError26$read;->read()Lo/lambdaonLoadError26;

    move-result-object v0

    invoke-virtual {v0, p0}, Lo/lambdaonLoadError26;->read(Lcom/facebook/AccessToken;)V

    return-void
.end method

.method public static read()Lcom/facebook/AccessToken;
    .registers 1
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    .line 393
    sget-object v0, Lo/lambdaonLoadError26;->read:Lo/lambdaonLoadError26$read;

    invoke-virtual {v0}, Lo/lambdaonLoadError26$read;->read()Lo/lambdaonLoadError26;

    move-result-object v0

    invoke-virtual {v0}, Lo/lambdaonLoadError26;->write()Lcom/facebook/AccessToken;

    move-result-object v0

    return-object v0
.end method

.method private static read(Lcom/facebook/AccessToken;)Lcom/facebook/AccessToken;
    .registers 16

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 547
    invoke-virtual {p0}, Lcom/facebook/AccessToken;->MediaBrowserCompatMediaItem()Ljava/lang/String;

    move-result-object v2

    .line 548
    invoke-virtual {p0}, Lcom/facebook/AccessToken;->IconCompatParcelizer()Ljava/lang/String;

    move-result-object v3

    .line 549
    invoke-virtual {p0}, Lcom/facebook/AccessToken;->MediaMetadataCompat()Ljava/lang/String;

    move-result-object v4

    .line 550
    invoke-virtual {p0}, Lcom/facebook/AccessToken;->AudioAttributesImplApi21Parcelizer()Ljava/util/Set;

    move-result-object v0

    move-object v5, v0

    check-cast v5, Ljava/util/Collection;

    .line 551
    invoke-virtual {p0}, Lcom/facebook/AccessToken;->read()Ljava/util/Set;

    move-result-object v0

    move-object v6, v0

    check-cast v6, Ljava/util/Collection;

    .line 552
    invoke-virtual {p0}, Lcom/facebook/AccessToken;->MediaBrowserCompatItemReceiver()Ljava/util/Set;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Collection;

    .line 553
    invoke-virtual {p0}, Lcom/facebook/AccessToken;->MediaDescriptionCompat()Lo/lambdaonIsLoadingChanged32;

    move-result-object v8

    .line 554
    new-instance v9, Ljava/util/Date;

    invoke-direct {v9}, Ljava/util/Date;-><init>()V

    .line 555
    new-instance v10, Ljava/util/Date;

    invoke-direct {v10}, Ljava/util/Date;-><init>()V

    .line 556
    invoke-virtual {p0}, Lcom/facebook/AccessToken;->RemoteActionCompatParcelizer()Ljava/util/Date;

    move-result-object v11

    .line 546
    new-instance p0, Lcom/facebook/AccessToken;

    const/4 v12, 0x0

    const/16 v13, 0x400

    const/4 v14, 0x0

    move-object v1, p0

    invoke-direct/range {v1 .. v14}, Lcom/facebook/AccessToken;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lo/lambdaonIsLoadingChanged32;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-object p0
.end method

.method public static write(Lorg/json/JSONObject;)Lcom/facebook/AccessToken;
    .registers 16
    .annotation system Ldalvik/annotation/Throws;
        value = {
            Lorg/json/JSONException;
        }
    .end annotation

    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 612
    const-string v1, "version"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v1

    const/4 v2, 0x1

    if-gt v1, v2, :cond_a0

    .line 616
    const-string v1, "token"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    .line 617
    new-instance v10, Ljava/util/Date;

    const-string v1, "expires_at"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v1

    invoke-direct {v10, v1, v2}, Ljava/util/Date;-><init>(J)V

    .line 618
    const-string v1, "permissions"

    invoke-virtual {p0, v1}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v1

    .line 619
    const-string v2, "declined_permissions"

    invoke-virtual {p0, v2}, Lorg/json/JSONObject;->getJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    .line 620
    const-string v4, "expired_permissions"

    invoke-virtual {p0, v4}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v4

    .line 621
    new-instance v11, Ljava/util/Date;

    const-string v5, "last_refresh"

    invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getLong(Ljava/lang/String;)J

    move-result-wide v5

    invoke-direct {v11, v5, v6}, Ljava/util/Date;-><init>(J)V

    .line 622
    const-string v5, "source"

    invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v5}, Lo/lambdaonIsLoadingChanged32;->valueOf(Ljava/lang/String;)Lo/lambdaonIsLoadingChanged32;

    move-result-object v9

    .line 623
    const-string v5, "application_id"

    invoke-virtual {p0, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    .line 624
    const-string v6, "user_id"

    invoke-virtual {p0, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    .line 625
    new-instance v12, Ljava/util/Date;

    const-string v7, "data_access_expiration_time"

    const-wide/16 v13, 0x0

    invoke-virtual {p0, v7, v13, v14}, Lorg/json/JSONObject;->optLong(Ljava/lang/String;J)J

    move-result-wide v7

    invoke-direct {v12, v7, v8}, Ljava/util/Date;-><init>(J)V

    .line 626
    const-string v7, "graph_domain"

    const/4 v8, 0x0

    invoke-virtual {p0, v7, v8}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    .line 628
    invoke-static {v3, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 629
    invoke-static {v5, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 630
    invoke-static {v6, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    .line 631
    invoke-static {v1, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->write(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    .line 632
    invoke-static {v2, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v2}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->write(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    move-object v7, v0

    check-cast v7, Ljava/util/Collection;

    if-nez v4, :cond_8f

    .line 633
    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    check-cast v0, Ljava/util/List;

    goto :goto_93

    .line 634
    :cond_8f
    invoke-static {v4}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->write(Lorg/json/JSONArray;)Ljava/util/List;

    move-result-object v0

    .line 633
    :goto_93
    move-object v8, v0

    check-cast v8, Ljava/util/Collection;

    .line 627
    new-instance v0, Lcom/facebook/AccessToken;

    move-object v2, v0

    move-object v4, v5

    move-object v5, v6

    move-object v6, p0

    invoke-direct/range {v2 .. v13}, Lcom/facebook/AccessToken;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lo/lambdaonIsLoadingChanged32;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V

    return-object v0

    .line 614
    :cond_a0
    new-instance p0, Lo/lambdaonMetadata50;

    const-string v0, "Unknown AccessToken serialization format."

    invoke-direct {p0, v0}, Lo/lambdaonMetadata50;-><init>(Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Throwable;

    throw p0
.end method


# virtual methods
.method public final RemoteActionCompatParcelizer(Landroid/os/Bundle;)Lcom/facebook/AccessToken;
    .registers 21
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    move-object/from16 v0, p1

    const-string v1, ""

    invoke-static {v0, v1}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 562
    move-object/from16 v1, p0

    check-cast v1, Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;

    const-string v1, "com.facebook.TokenCachingStrategy.Permissions"

    invoke-static {v0, v1}, Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;

    move-result-object v1

    .line 564
    const-string v2, "com.facebook.TokenCachingStrategy.DeclinedPermissions"

    invoke-static {v0, v2}, Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;

    move-result-object v2

    .line 566
    const-string v3, "com.facebook.TokenCachingStrategy.ExpiredPermissions"

    invoke-static {v0, v3}, Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/os/Bundle;Ljava/lang/String;)Ljava/util/List;

    move-result-object v3

    .line 567
    sget-object v4, Lo/lambdaonPlaybackParametersChanged44;->RemoteActionCompatParcelizer:Lo/lambdaonPlaybackParametersChanged44$RemoteActionCompatParcelizer;

    invoke-static/range {p1 .. p1}, Lo/lambdaonPlaybackParametersChanged44$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v4

    .line 568
    invoke-static {v4}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->IconCompatParcelizer(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_2d

    .line 569
    invoke-static {}, Lo/lambdaonMediaMetadataChanged48;->write()Ljava/lang/String;

    move-result-object v4

    :cond_2d
    move-object v7, v4

    .line 571
    sget-object v4, Lo/lambdaonPlaybackParametersChanged44;->RemoteActionCompatParcelizer:Lo/lambdaonPlaybackParametersChanged44$RemoteActionCompatParcelizer;

    invoke-static/range {p1 .. p1}, Lo/lambdaonPlaybackParametersChanged44$RemoteActionCompatParcelizer;->AudioAttributesCompatParcelizer(Landroid/os/Bundle;)Ljava/lang/String;

    move-result-object v6

    const/4 v4, 0x0

    if-eqz v6, :cond_74

    .line 572
    invoke-static {v6}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->AudioAttributesCompatParcelizer(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v5

    if-eqz v5, :cond_46

    .line 575
    :try_start_3d
    const-string v8, "id"

    invoke-virtual {v5, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5
    :try_end_43
    .catch Lorg/json/JSONException; {:try_start_3d .. :try_end_43} :catch_45

    move-object v8, v5

    goto :goto_47

    :catch_45
    return-object v4

    :cond_46
    move-object v8, v4

    :goto_47
    if-eqz v7, :cond_74

    if-eqz v8, :cond_74

    .line 585
    move-object v9, v1

    check-cast v9, Ljava/util/Collection;

    .line 586
    move-object v10, v2

    check-cast v10, Ljava/util/Collection;

    .line 587
    move-object v11, v3

    check-cast v11, Ljava/util/Collection;

    .line 588
    sget-object v1, Lo/lambdaonPlaybackParametersChanged44;->RemoteActionCompatParcelizer:Lo/lambdaonPlaybackParametersChanged44$RemoteActionCompatParcelizer;

    invoke-static/range {p1 .. p1}, Lo/lambdaonPlaybackParametersChanged44$RemoteActionCompatParcelizer;->IconCompatParcelizer(Landroid/os/Bundle;)Lo/lambdaonIsLoadingChanged32;

    move-result-object v12

    .line 589
    sget-object v1, Lo/lambdaonPlaybackParametersChanged44;->RemoteActionCompatParcelizer:Lo/lambdaonPlaybackParametersChanged44$RemoteActionCompatParcelizer;

    invoke-virtual {v1, v0}, Lo/lambdaonPlaybackParametersChanged44$RemoteActionCompatParcelizer;->read(Landroid/os/Bundle;)Ljava/util/Date;

    move-result-object v13

    .line 590
    sget-object v1, Lo/lambdaonPlaybackParametersChanged44;->RemoteActionCompatParcelizer:Lo/lambdaonPlaybackParametersChanged44$RemoteActionCompatParcelizer;

    invoke-virtual {v1, v0}, Lo/lambdaonPlaybackParametersChanged44$RemoteActionCompatParcelizer;->write(Landroid/os/Bundle;)Ljava/util/Date;

    move-result-object v14

    .line 581
    new-instance v0, Lcom/facebook/AccessToken;

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x400

    const/16 v18, 0x0

    move-object v5, v0

    invoke-direct/range {v5 .. v18}, Lcom/facebook/AccessToken;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lo/lambdaonIsLoadingChanged32;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;ILo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-object v0

    :cond_74
    return-object v4
.end method

.method public final RemoteActionCompatParcelizer()V
    .registers 2
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    .line 427
    sget-object v0, Lo/lambdaonLoadError26;->read:Lo/lambdaonLoadError26$read;

    invoke-virtual {v0}, Lo/lambdaonLoadError26$read;->read()Lo/lambdaonLoadError26;

    move-result-object v0

    invoke-virtual {v0}, Lo/lambdaonLoadError26;->write()Lcom/facebook/AccessToken;

    move-result-object v0

    if-eqz v0, :cond_15

    .line 429
    check-cast p0, Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;

    invoke-static {v0}, Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;->read(Lcom/facebook/AccessToken;)Lcom/facebook/AccessToken;

    move-result-object p0

    invoke-static {p0}, Lcom/facebook/AccessToken$AudioAttributesCompatParcelizer;->IconCompatParcelizer(Lcom/facebook/AccessToken;)V

    :cond_15
    return-void
.end method

###### Class com.facebook.AccessToken.RemoteActionCompatParcelizer (com.facebook.AccessToken$RemoteActionCompatParcelizer)
.class public interface abstract Lcom/facebook/AccessToken$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/AccessToken;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x609
    name = "RemoteActionCompatParcelizer"
.end annotation

###### Class com.facebook.AccessToken.read (com.facebook.AccessToken$read)
.class public final Lcom/facebook/AccessToken$read;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/AccessToken;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/facebook/AccessToken;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 669
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static AudioAttributesCompatParcelizer(I)[Lcom/facebook/AccessToken;
    .registers 1

    .line 675
    new-array p0, p0, [Lcom/facebook/AccessToken;

    return-object p0
.end method

.method private static write(Landroid/os/Parcel;)Lcom/facebook/AccessToken;
    .registers 2

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 671
    new-instance v0, Lcom/facebook/AccessToken;

    invoke-direct {v0, p0}, Lcom/facebook/AccessToken;-><init>(Landroid/os/Parcel;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 669
    invoke-static {p1}, Lcom/facebook/AccessToken$read;->write(Landroid/os/Parcel;)Lcom/facebook/AccessToken;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 669
    invoke-static {p1}, Lcom/facebook/AccessToken$read;->AudioAttributesCompatParcelizer(I)[Lcom/facebook/AccessToken;

    move-result-object p0

    return-object p0
.end method
