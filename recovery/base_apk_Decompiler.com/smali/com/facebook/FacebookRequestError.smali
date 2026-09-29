###### Class com.facebook.FacebookRequestError (com.facebook.FacebookRequestError)
.class public final Lcom/facebook/FacebookRequestError;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/facebook/FacebookRequestError$read;,
        Lcom/facebook/FacebookRequestError$write;,
        Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0018\n\u0002\u0010\u0002\n\u0002\u0008\u0006\u0018\u0000 @2\u00020\u0001:\u0003?@AB!\u0008\u0017\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0004\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u00a2\u0006\u0002\u0010\u0007B#\u0008\u0016\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0002\u0010\rB\u000f\u0008\u0012\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u00a2\u0006\u0002\u0010\u0010B\u0081\u0001\u0008\u0002\u0012\u0006\u0010\u0011\u001a\u00020\t\u0012\u0006\u0010\u0008\u001a\u00020\t\u0012\u0006\u0010\u0012\u001a\u00020\t\u0012\u0008\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001c\u0012\u0006\u0010\u001d\u001a\u00020\u001e\u00a2\u0006\u0002\u0010\u001fJ\u0008\u00109\u001a\u00020\tH\u0016J\u0008\u0010:\u001a\u00020\u000bH\u0016J\u0018\u0010;\u001a\u00020<2\u0006\u0010=\u001a\u00020\u000f2\u0006\u0010>\u001a\u00020\tH\u0016R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\"\u001a\u00020#\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0011\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0015\u0010\u000c\u001a\u0004\u0018\u00010\u000b8F\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010+R\u0013\u0010,\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008-\u0010+R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010+R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u000b\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010+R\"\u0010\u0004\u001a\u0004\u0018\u00010\u001c2\u0008\u00101\u001a\u0004\u0018\u00010\u001c@BX\u0086\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u00103R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u00105R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00105R\u0011\u0010\u0011\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u0010)R\u0011\u0010\u0012\u001a\u00020\t\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00088\u0010)\u00a8\u0006B"
    }
    d2 = {
        "Lcom/facebook/FacebookRequestError;",
        "Landroid/os/Parcelable;",
        "connection",
        "Ljava/net/HttpURLConnection;",
        "exception",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V",
        "errorCode",
        "",
        "errorType",
        "",
        "errorMessage",
        "(ILjava/lang/String;Ljava/lang/String;)V",
        "parcel",
        "Landroid/os/Parcel;",
        "(Landroid/os/Parcel;)V",
        "requestStatusCode",
        "subErrorCode",
        "errorMessageField",
        "errorUserTitle",
        "errorUserMessage",
        "requestResultBody",
        "Lorg/json/JSONObject;",
        "requestResult",
        "batchRequestResult",
        "",
        "exceptionField",
        "Lcom/facebook/FacebookException;",
        "errorIsTransient",
        "",
        "(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lcom/facebook/FacebookException;Z)V",
        "getBatchRequestResult",
        "()Ljava/lang/Object;",
        "category",
        "Lcom/facebook/FacebookRequestError$Category;",
        "getCategory",
        "()Lcom/facebook/FacebookRequestError$Category;",
        "getConnection",
        "()Ljava/net/HttpURLConnection;",
        "getErrorCode",
        "()I",
        "getErrorMessage",
        "()Ljava/lang/String;",
        "errorRecoveryMessage",
        "getErrorRecoveryMessage",
        "getErrorType",
        "getErrorUserMessage",
        "getErrorUserTitle",
        "<set-?>",
        "getException",
        "()Lcom/facebook/FacebookException;",
        "getRequestResult",
        "()Lorg/json/JSONObject;",
        "getRequestResultBody",
        "getRequestStatusCode",
        "getSubErrorCode",
        "describeContents",
        "toString",
        "writeToParcel",
        "",
        "out",
        "flags",
        "Category",
        "Companion",
        "Range",
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
.field private static final AudioAttributesCompatParcelizer:Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;

.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/facebook/FacebookRequestError;",
            ">;"
        }
    .end annotation
.end field

.field public static final RemoteActionCompatParcelizer:Lcom/facebook/FacebookRequestError$write;


# instance fields
.field private final AudioAttributesImplApi21Parcelizer:I

.field private final AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

.field private final AudioAttributesImplBaseParcelizer:Ljava/lang/String;

.field private final IconCompatParcelizer:Ljava/net/HttpURLConnection;

.field private final MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

.field private final MediaBrowserCompatItemReceiver:Ljava/lang/String;

.field private final MediaBrowserCompatMediaItem:Lorg/json/JSONObject;

.field private MediaBrowserCompatSearchResultReceiver:Lo/lambdaonMetadata50;

.field private final MediaDescriptionCompat:I

.field private final MediaMetadataCompat:Ljava/lang/String;

.field private final RatingCompat:Lorg/json/JSONObject;

.field private final onCustomAction:I

.field private final read:Ljava/lang/Object;

.field private final write:Lcom/facebook/FacebookRequestError$read;


# direct methods
.method static constructor <clinit>()V
    .registers 2

    new-instance v0, Lcom/facebook/FacebookRequestError$write;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/facebook/FacebookRequestError$write;-><init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    sput-object v0, Lcom/facebook/FacebookRequestError;->RemoteActionCompatParcelizer:Lcom/facebook/FacebookRequestError$write;

    .line 283
    new-instance v0, Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;

    invoke-direct {v0}, Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;-><init>()V

    sput-object v0, Lcom/facebook/FacebookRequestError;->AudioAttributesCompatParcelizer:Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;

    .line 390
    new-instance v0, Lcom/facebook/FacebookRequestError$AudioAttributesCompatParcelizer;

    invoke-direct {v0}, Lcom/facebook/FacebookRequestError$AudioAttributesCompatParcelizer;-><init>()V

    check-cast v0, Landroid/os/Parcelable$Creator;

    sput-object v0, Lcom/facebook/FacebookRequestError;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method private constructor <init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lo/lambdaonMetadata50;Z)V
    .registers 14

    .line 42
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/facebook/FacebookRequestError;->MediaDescriptionCompat:I

    iput p2, p0, Lcom/facebook/FacebookRequestError;->AudioAttributesImplApi21Parcelizer:I

    iput p3, p0, Lcom/facebook/FacebookRequestError;->onCustomAction:I

    iput-object p4, p0, Lcom/facebook/FacebookRequestError;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    iput-object p6, p0, Lcom/facebook/FacebookRequestError;->MediaMetadataCompat:Ljava/lang/String;

    iput-object p7, p0, Lcom/facebook/FacebookRequestError;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    iput-object p8, p0, Lcom/facebook/FacebookRequestError;->RatingCompat:Lorg/json/JSONObject;

    iput-object p9, p0, Lcom/facebook/FacebookRequestError;->MediaBrowserCompatMediaItem:Lorg/json/JSONObject;

    iput-object p10, p0, Lcom/facebook/FacebookRequestError;->read:Ljava/lang/Object;

    iput-object p11, p0, Lcom/facebook/FacebookRequestError;->IconCompatParcelizer:Ljava/net/HttpURLConnection;

    .line 132
    iput-object p5, p0, Lcom/facebook/FacebookRequestError;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    if-eqz p12, :cond_20

    .line 404
    iput-object p12, p0, Lcom/facebook/FacebookRequestError;->MediaBrowserCompatSearchResultReceiver:Lo/lambdaonMetadata50;

    .line 411
    sget-object p1, Lcom/facebook/FacebookRequestError$read;->read:Lcom/facebook/FacebookRequestError$read;

    goto :goto_37

    .line 407
    :cond_20
    new-instance p1, Lo/lambdaonLoadStarted23;

    invoke-virtual {p0}, Lcom/facebook/FacebookRequestError;->AudioAttributesCompatParcelizer()Ljava/lang/String;

    move-result-object p4

    invoke-direct {p1, p0, p4}, Lo/lambdaonLoadStarted23;-><init>(Lcom/facebook/FacebookRequestError;Ljava/lang/String;)V

    check-cast p1, Lo/lambdaonMetadata50;

    iput-object p1, p0, Lcom/facebook/FacebookRequestError;->MediaBrowserCompatSearchResultReceiver:Lo/lambdaonMetadata50;

    .line 412
    sget-object p1, Lcom/facebook/FacebookRequestError;->RemoteActionCompatParcelizer:Lcom/facebook/FacebookRequestError$write;

    invoke-virtual {p1}, Lcom/facebook/FacebookRequestError$write;->RemoteActionCompatParcelizer()Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55;

    move-result-object p1

    invoke-virtual {p1, p2, p3, p13}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55;->IconCompatParcelizer(IIZ)Lcom/facebook/FacebookRequestError$read;

    move-result-object p1

    .line 411
    :goto_37
    iput-object p1, p0, Lcom/facebook/FacebookRequestError;->write:Lcom/facebook/FacebookRequestError$read;

    .line 413
    sget-object p2, Lcom/facebook/FacebookRequestError;->RemoteActionCompatParcelizer:Lcom/facebook/FacebookRequestError$write;

    invoke-virtual {p2}, Lcom/facebook/FacebookRequestError$write;->RemoteActionCompatParcelizer()Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55;

    move-result-object p2

    invoke-virtual {p2, p1}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55;->AudioAttributesCompatParcelizer(Lcom/facebook/FacebookRequestError$read;)Ljava/lang/String;

    move-result-object p1

    iput-object p1, p0, Lcom/facebook/FacebookRequestError;->AudioAttributesImplApi26Parcelizer:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lo/lambdaonMetadata50;ZLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 15

    .line 41
    invoke-direct/range {p0 .. p13}, Lcom/facebook/FacebookRequestError;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lo/lambdaonMetadata50;Z)V

    return-void
.end method

.method private constructor <init>(Landroid/os/Parcel;)V
    .registers 16

    .line 224
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v1

    .line 225
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v2

    .line 226
    invoke-virtual {p1}, Landroid/os/Parcel;->readInt()I

    move-result v3

    .line 227
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v4

    .line 228
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v5

    .line 229
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v6

    .line 230
    invoke-virtual {p1}, Landroid/os/Parcel;->readString()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v0, p0

    .line 223
    invoke-direct/range {v0 .. v13}, Lcom/facebook/FacebookRequestError;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lo/lambdaonMetadata50;Z)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/os/Parcel;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 3

    .line 41
    invoke-direct {p0, p1}, Lcom/facebook/FacebookRequestError;-><init>(Landroid/os/Parcel;)V

    return-void
.end method

.method public constructor <init>(Ljava/net/HttpURLConnection;Ljava/lang/Exception;)V
    .registers 19

    move-object/from16 v0, p2

    .line 174
    instance-of v1, v0, Lo/lambdaonMetadata50;

    if-eqz v1, :cond_a

    check-cast v0, Lo/lambdaonMetadata50;

    move-object v14, v0

    goto :goto_12

    :cond_a
    new-instance v1, Lo/lambdaonMetadata50;

    check-cast v0, Ljava/lang/Throwable;

    invoke-direct {v1, v0}, Lo/lambdaonMetadata50;-><init>(Ljava/lang/Throwable;)V

    move-object v14, v1

    :goto_12
    const/4 v3, -0x1

    const/4 v4, -0x1

    const/4 v5, -0x1

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v15, 0x0

    move-object/from16 v2, p0

    move-object/from16 v13, p1

    .line 162
    invoke-direct/range {v2 .. v15}, Lcom/facebook/FacebookRequestError;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lo/lambdaonMetadata50;Z)V

    return-void
.end method

.method public static final synthetic RemoteActionCompatParcelizer()Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;
    .registers 1

    .line 41
    sget-object v0, Lcom/facebook/FacebookRequestError;->AudioAttributesCompatParcelizer:Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;

    return-object v0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer()Ljava/lang/String;
    .registers 2

    .line 133
    iget-object v0, p0, Lcom/facebook/FacebookRequestError;->MediaBrowserCompatItemReceiver:Ljava/lang/String;

    if-eqz v0, :cond_5

    return-object v0

    :cond_5
    iget-object p0, p0, Lcom/facebook/FacebookRequestError;->MediaBrowserCompatSearchResultReceiver:Lo/lambdaonMetadata50;

    if-eqz p0, :cond_e

    invoke-virtual {p0}, Ljava/lang/Throwable;->getLocalizedMessage()Ljava/lang/String;

    move-result-object p0

    return-object p0

    :cond_e
    const/4 p0, 0x0

    return-object p0
.end method

.method public final AudioAttributesImplApi21Parcelizer()I
    .registers 1

    .line 60
    iget p0, p0, Lcom/facebook/FacebookRequestError;->onCustomAction:I

    return p0
.end method

.method public final AudioAttributesImplApi26Parcelizer()I
    .registers 1

    .line 48
    iget p0, p0, Lcom/facebook/FacebookRequestError;->MediaDescriptionCompat:I

    return p0
.end method

.method public final IconCompatParcelizer()Lo/lambdaonMetadata50;
    .registers 1

    .line 140
    iget-object p0, p0, Lcom/facebook/FacebookRequestError;->MediaBrowserCompatSearchResultReceiver:Lo/lambdaonMetadata50;

    return-object p0
.end method

.method public final describeContents()I
    .registers 1

    const/4 p0, 0x0

    return p0
.end method

.method public final read()I
    .registers 1

    .line 54
    iget p0, p0, Lcom/facebook/FacebookRequestError;->AudioAttributesImplApi21Parcelizer:I

    return p0
.end method

.method public final toString()Ljava/lang/String;
    .registers 3

    .line 197
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "{HttpStatus: "

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 198
    iget v1, p0, Lcom/facebook/FacebookRequestError;->MediaDescriptionCompat:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 199
    const-string v1, ", errorCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 200
    iget v1, p0, Lcom/facebook/FacebookRequestError;->AudioAttributesImplApi21Parcelizer:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 201
    const-string v1, ", subErrorCode: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 202
    iget v1, p0, Lcom/facebook/FacebookRequestError;->onCustomAction:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 203
    const-string v1, ", errorType: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 204
    iget-object v1, p0, Lcom/facebook/FacebookRequestError;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 205
    const-string v1, ", errorMessage: "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 206
    invoke-virtual {p0}, Lcom/facebook/FacebookRequestError;->AudioAttributesCompatParcelizer()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 207
    const-string p0, "}"

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 208
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p0

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->AudioAttributesCompatParcelizer(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public final write()Ljava/lang/String;
    .registers 1

    .line 67
    iget-object p0, p0, Lcom/facebook/FacebookRequestError;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    return-object p0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .registers 3

    const-string p2, ""

    invoke-static {p1, p2}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 212
    iget p2, p0, Lcom/facebook/FacebookRequestError;->MediaDescriptionCompat:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 213
    iget p2, p0, Lcom/facebook/FacebookRequestError;->AudioAttributesImplApi21Parcelizer:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 214
    iget p2, p0, Lcom/facebook/FacebookRequestError;->onCustomAction:I

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeInt(I)V

    .line 215
    iget-object p2, p0, Lcom/facebook/FacebookRequestError;->AudioAttributesImplBaseParcelizer:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 216
    invoke-virtual {p0}, Lcom/facebook/FacebookRequestError;->AudioAttributesCompatParcelizer()Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 217
    iget-object p2, p0, Lcom/facebook/FacebookRequestError;->MediaMetadataCompat:Ljava/lang/String;

    invoke-virtual {p1, p2}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    .line 218
    iget-object p0, p0, Lcom/facebook/FacebookRequestError;->MediaBrowserCompatCustomActionResultReceiver:Ljava/lang/String;

    invoke-virtual {p1, p0}, Landroid/os/Parcel;->writeString(Ljava/lang/String;)V

    return-void
.end method

###### Class com.facebook.FacebookRequestError.AudioAttributesCompatParcelizer (com.facebook.FacebookRequestError$AudioAttributesCompatParcelizer)
.class public final Lcom/facebook/FacebookRequestError$AudioAttributesCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Landroid/os/Parcelable$Creator;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/FacebookRequestError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Landroid/os/Parcelable$Creator<",
        "Lcom/facebook/FacebookRequestError;",
        ">;"
    }
.end annotation


# direct methods
.method constructor <init>()V
    .registers 1

    .line 390
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private static read(I)[Lcom/facebook/FacebookRequestError;
    .registers 1

    .line 396
    new-array p0, p0, [Lcom/facebook/FacebookRequestError;

    return-object p0
.end method

.method private static write(Landroid/os/Parcel;)Lcom/facebook/FacebookRequestError;
    .registers 3

    const-string v0, ""

    invoke-static {p0, v0}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    .line 392
    new-instance v0, Lcom/facebook/FacebookRequestError;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/facebook/FacebookRequestError;-><init>(Landroid/os/Parcel;Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-object v0
.end method


# virtual methods
.method public final synthetic createFromParcel(Landroid/os/Parcel;)Ljava/lang/Object;
    .registers 2

    .line 390
    invoke-static {p1}, Lcom/facebook/FacebookRequestError$AudioAttributesCompatParcelizer;->write(Landroid/os/Parcel;)Lcom/facebook/FacebookRequestError;

    move-result-object p0

    return-object p0
.end method

.method public final synthetic newArray(I)[Ljava/lang/Object;
    .registers 2

    .line 390
    invoke-static {p1}, Lcom/facebook/FacebookRequestError$AudioAttributesCompatParcelizer;->read(I)[Lcom/facebook/FacebookRequestError;

    move-result-object p0

    return-object p0
.end method

###### Class com.facebook.FacebookRequestError.RemoteActionCompatParcelizer (com.facebook.FacebookRequestError$RemoteActionCompatParcelizer)
.class public final Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/FacebookRequestError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "RemoteActionCompatParcelizer"
.end annotation


# instance fields
.field private final RemoteActionCompatParcelizer:I

.field private final read:I


# direct methods
.method public constructor <init>()V
    .registers 2

    .line 121
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/16 v0, 0xc8

    iput v0, p0, Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:I

    const/16 v0, 0x12b

    iput v0, p0, Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;->read:I

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(I)Z
    .registers 3

    .line 123
    iget v0, p0, Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;->RemoteActionCompatParcelizer:I

    iget p0, p0, Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;->read:I

    if-gt v0, p1, :cond_a

    if-lt p0, p1, :cond_a

    const/4 p0, 0x1

    return p0

    :cond_a
    const/4 p0, 0x0

    return p0
.end method

###### Class com.facebook.FacebookRequestError.read (com.facebook.FacebookRequestError$read)
.class public final enum Lcom/facebook/FacebookRequestError$read;
.super Ljava/lang/Enum;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/FacebookRequestError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x4019
    name = "read"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Enum<",
        "Lcom/facebook/FacebookRequestError$read;",
        ">;"
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0008\u0005\u0008\u0086\u0001\u0018\u00002\u0008\u0012\u0004\u0012\u00020\u00000\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003j\u0002\u0008\u0004j\u0002\u0008\u0005j\u0002\u0008\u0006"
    }
    d2 = {
        "Lcom/facebook/FacebookRequestError$read;",
        "",
        "<init>",
        "(Ljava/lang/String;I)V",
        "AudioAttributesCompatParcelizer",
        "read",
        "write"
    }
    k = 0x1
    mv = {
        0x1,
        0x4,
        0x0
    }
.end annotation


# static fields
.field public static final enum AudioAttributesCompatParcelizer:Lcom/facebook/FacebookRequestError$read;

.field private static final synthetic RemoteActionCompatParcelizer:[Lcom/facebook/FacebookRequestError$read;

.field public static final enum read:Lcom/facebook/FacebookRequestError$read;

.field public static final enum write:Lcom/facebook/FacebookRequestError$read;


# direct methods
.method static constructor <clinit>()V
    .registers 5

    .line 245
    new-instance v0, Lcom/facebook/FacebookRequestError$read;

    const-string v1, "LOGIN_RECOVERABLE"

    const/4 v2, 0x0

    invoke-direct {v0, v1, v2}, Lcom/facebook/FacebookRequestError$read;-><init>(Ljava/lang/String;I)V

    sput-object v0, Lcom/facebook/FacebookRequestError$read;->AudioAttributesCompatParcelizer:Lcom/facebook/FacebookRequestError$read;

    new-instance v1, Lcom/facebook/FacebookRequestError$read;

    const-string v2, "OTHER"

    const/4 v3, 0x1

    invoke-direct {v1, v2, v3}, Lcom/facebook/FacebookRequestError$read;-><init>(Ljava/lang/String;I)V

    sput-object v1, Lcom/facebook/FacebookRequestError$read;->read:Lcom/facebook/FacebookRequestError$read;

    new-instance v2, Lcom/facebook/FacebookRequestError$read;

    const-string v3, "TRANSIENT"

    const/4 v4, 0x2

    invoke-direct {v2, v3, v4}, Lcom/facebook/FacebookRequestError$read;-><init>(Ljava/lang/String;I)V

    sput-object v2, Lcom/facebook/FacebookRequestError$read;->write:Lcom/facebook/FacebookRequestError$read;

    filled-new-array {v0, v1, v2}, [Lcom/facebook/FacebookRequestError$read;

    move-result-object v0

    sput-object v0, Lcom/facebook/FacebookRequestError$read;->RemoteActionCompatParcelizer:[Lcom/facebook/FacebookRequestError$read;

    return-void
.end method

.method private constructor <init>(Ljava/lang/String;I)V
    .registers 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()V"
        }
    .end annotation

    .line 244
    invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V

    return-void
.end method

.method public static valueOf(Ljava/lang/String;)Lcom/facebook/FacebookRequestError$read;
    .registers 2

    .line 246
    const-class v0, Lcom/facebook/FacebookRequestError$read;

    invoke-static {v0, p0}, Ljava/lang/Enum;->valueOf(Ljava/lang/Class;Ljava/lang/String;)Ljava/lang/Enum;

    move-result-object p0

    check-cast p0, Lcom/facebook/FacebookRequestError$read;

    return-object p0
.end method

.method public static values()[Lcom/facebook/FacebookRequestError$read;
    .registers 1

    .line 247
    sget-object v0, Lcom/facebook/FacebookRequestError$read;->RemoteActionCompatParcelizer:[Lcom/facebook/FacebookRequestError$read;

    invoke-virtual {v0}, [Lcom/facebook/FacebookRequestError$read;->clone()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lcom/facebook/FacebookRequestError$read;

    return-object v0
.end method

###### Class com.facebook.FacebookRequestError.write (com.facebook.FacebookRequestError$write)
.class public final Lcom/facebook/FacebookRequestError$write;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/facebook/FacebookRequestError;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "write"
.end annotation

.annotation runtime Lkotlin/Metadata;
    bv = {
        0x1,
        0x0,
        0x3
    }
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u0008\u0086\u0003\u0018\u00002\u00020\u0001B\t\u0008\u0002\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J-\u0010\n\u001a\u0004\u0018\u00010\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u00012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000bR\u0017\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\t0\u000c8\u0006\u00a2\u0006\u0006\n\u0004\u0008\r\u0010\u000eR\u0017\u0010\u0013\u001a\u00020\u000f8\u0007\u00a2\u0006\u000c\n\u0004\u0008\n\u0010\u0010\u001a\u0004\u0008\u0011\u0010\u0012R\u0011\u0010\n\u001a\u00020\u00148G\u00a2\u0006\u0006\u001a\u0004\u0008\u0015\u0010\u0016"
    }
    d2 = {
        "Lcom/facebook/FacebookRequestError$write;",
        "",
        "<init>",
        "()V",
        "Lorg/json/JSONObject;",
        "p0",
        "p1",
        "Ljava/net/HttpURLConnection;",
        "p2",
        "Lcom/facebook/FacebookRequestError;",
        "AudioAttributesCompatParcelizer",
        "(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)Lcom/facebook/FacebookRequestError;",
        "Landroid/os/Parcelable$Creator;",
        "CREATOR",
        "Landroid/os/Parcelable$Creator;",
        "Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;",
        "Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;",
        "read",
        "()Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;",
        "write",
        "Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55;",
        "RemoteActionCompatParcelizer",
        "()Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55;"
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

    .line 260
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public synthetic constructor <init>(Lo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    .registers 2

    .line 260
    invoke-direct {p0}, Lcom/facebook/FacebookRequestError$write;-><init>()V

    return-void
.end method

.method private static read()Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;
    .registers 1

    .line 283
    invoke-static {}, Lcom/facebook/FacebookRequestError;->RemoteActionCompatParcelizer()Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final AudioAttributesCompatParcelizer(Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;)Lcom/facebook/FacebookRequestError;
    .registers 23
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    move-object/from16 v9, p1

    const-string v0, "error_code"

    const-string v1, "error"

    const-string v2, "FACEBOOK_NON_JSON_RESULT"

    const-string v3, "body"

    const-string v4, "code"

    const-string v5, ""

    invoke-static {v9, v5}, Lo/toMagicModuleMetaRepoModel;->write(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v15, 0x0

    .line 292
    :try_start_12
    invoke-virtual {v9, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    if-eqz v5, :cond_127

    .line 293
    invoke-virtual {v9, v4}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I

    move-result v5

    .line 295
    invoke-static {v9, v3, v2}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->IconCompatParcelizer(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v6
    :try_end_20
    .catch Lorg/json/JSONException; {:try_start_12 .. :try_end_20} :catch_127

    if-eqz v6, :cond_ef

    .line 297
    instance-of v7, v6, Lorg/json/JSONObject;

    if-eqz v7, :cond_ef

    .line 310
    :try_start_26
    move-object v7, v6

    check-cast v7, Lorg/json/JSONObject;

    invoke-virtual {v7, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v7
    :try_end_2d
    .catch Lorg/json/JSONException; {:try_start_26 .. :try_end_2d} :catch_127

    const-string v8, "error_subcode"

    const/4 v10, 0x0

    const/4 v11, -0x1

    const/4 v12, 0x1

    if-eqz v7, :cond_80

    .line 312
    :try_start_34
    move-object v0, v6

    check-cast v0, Lorg/json/JSONObject;

    invoke-static {v0, v1, v15}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->IconCompatParcelizer(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    if-eqz v0, :cond_46

    .line 313
    const-string v1, "type"

    invoke-virtual {v0, v1, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    goto :goto_47

    :cond_46
    move-object v1, v15

    :goto_47
    if-eqz v0, :cond_50

    .line 314
    const-string v7, "message"

    invoke-virtual {v0, v7, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    goto :goto_51

    :cond_50
    move-object v7, v15

    :goto_51
    if-eqz v0, :cond_58

    .line 316
    invoke-virtual {v0, v4, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v4

    goto :goto_59

    :cond_58
    move v4, v11

    :goto_59
    if-eqz v0, :cond_5f

    .line 318
    invoke-virtual {v0, v8, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v11

    :cond_5f
    if-eqz v0, :cond_68

    .line 319
    const-string v8, "error_user_msg"

    invoke-virtual {v0, v8, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    goto :goto_69

    :cond_68
    move-object v8, v15

    :goto_69
    if-eqz v0, :cond_72

    .line 320
    const-string v13, "error_user_title"

    invoke-virtual {v0, v13, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    goto :goto_73

    :cond_72
    move-object v13, v15

    :goto_73
    if-eqz v0, :cond_7b

    .line 321
    const-string v14, "is_transient"

    invoke-virtual {v0, v14, v10}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v10

    :cond_7b
    move v14, v10

    move-object v10, v8

    move-object v8, v7

    :goto_7e
    move-object v7, v1

    goto :goto_cb

    .line 323
    :cond_80
    move-object v1, v6

    check-cast v1, Lorg/json/JSONObject;

    invoke-virtual {v1, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1
    :try_end_87
    .catch Lorg/json/JSONException; {:try_start_34 .. :try_end_87} :catch_127

    const-string v4, "error_msg"

    const-string v7, "error_reason"

    if-nez v1, :cond_a8

    .line 324
    :try_start_8d
    move-object v1, v6

    check-cast v1, Lorg/json/JSONObject;

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-nez v1, :cond_a8

    .line 325
    move-object v1, v6

    check-cast v1, Lorg/json/JSONObject;

    invoke-virtual {v1, v7}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v1

    if-eqz v1, :cond_a0

    goto :goto_a8

    :cond_a0
    move v12, v10

    move v14, v12

    move v4, v11

    move-object v7, v15

    move-object v8, v7

    move-object v10, v8

    move-object v13, v10

    goto :goto_cb

    .line 326
    :cond_a8
    :goto_a8
    move-object v1, v6

    check-cast v1, Lorg/json/JSONObject;

    invoke-virtual {v1, v7, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    .line 327
    move-object v7, v6

    check-cast v7, Lorg/json/JSONObject;

    invoke-virtual {v7, v4, v15}, Lorg/json/JSONObject;->optString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    .line 328
    move-object v7, v6

    check-cast v7, Lorg/json/JSONObject;

    invoke-virtual {v7, v0, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v0

    .line 329
    move-object v7, v6

    check-cast v7, Lorg/json/JSONObject;

    invoke-virtual {v7, v8, v11}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;I)I

    move-result v7

    move-object v8, v4

    move v11, v7

    move v14, v10

    move-object v10, v15

    move-object v13, v10

    move v4, v0

    goto :goto_7e

    :goto_cb
    if-eqz v12, :cond_ef

    .line 341
    move-object v12, v6

    check-cast v12, Lorg/json/JSONObject;

    .line 333
    new-instance v16, Lcom/facebook/FacebookRequestError;

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v0, v16

    move v1, v5

    move v2, v4

    move v3, v11

    move-object v4, v7

    move-object v5, v8

    move-object v6, v13

    move-object v7, v10

    move-object v8, v12

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    move-object/from16 v12, v17

    move v13, v14

    move-object/from16 v14, v18

    invoke-direct/range {v0 .. v14}, Lcom/facebook/FacebookRequestError;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lo/lambdaonMetadata50;ZLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V

    return-object v16

    .line 352
    :cond_ef
    move-object/from16 v0, p0

    check-cast v0, Lcom/facebook/FacebookRequestError$write;

    invoke-static {}, Lcom/facebook/FacebookRequestError$write;->read()Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;

    move-result-object v0

    invoke-virtual {v0, v5}, Lcom/facebook/FacebookRequestError$RemoteActionCompatParcelizer;->IconCompatParcelizer(I)Z

    move-result v0

    if-nez v0, :cond_127

    .line 361
    invoke-virtual {v9, v3}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v0

    if-eqz v0, :cond_10b

    .line 362
    invoke-static {v9, v3, v2}, Lo/DefaultAnalyticsCollectorMediaPeriodQueueTracker;->IconCompatParcelizer(Lorg/json/JSONObject;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lorg/json/JSONObject;

    move-object v8, v0

    goto :goto_10c

    :cond_10b
    move-object v8, v15

    .line 353
    :goto_10c
    new-instance v16, Lcom/facebook/FacebookRequestError;

    const/4 v2, -0x1

    const/4 v3, -0x1

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v0, v16

    move v1, v5

    move-object v5, v6

    move-object v6, v7

    move-object v7, v10

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    move-object/from16 v11, p3

    invoke-direct/range {v0 .. v14}, Lcom/facebook/FacebookRequestError;-><init>(IIILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lorg/json/JSONObject;Lorg/json/JSONObject;Ljava/lang/Object;Ljava/net/HttpURLConnection;Lo/lambdaonMetadata50;ZLo/MagicModuleRepositoryImplExternalSyntheticLambda0;)V
    :try_end_126
    .catch Lorg/json/JSONException; {:try_start_8d .. :try_end_126} :catch_127

    return-object v16

    :catch_127
    :cond_127
    return-object v15
.end method

.method public final RemoteActionCompatParcelizer()Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55;
    .registers 2
    .annotation runtime Lo/getMagicModuleMeta;
    .end annotation

    monitor-enter p0

    .line 384
    :try_start_1
    invoke-static {}, Lo/lambdaonMediaMetadataChanged48;->write()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda61;->AudioAttributesCompatParcelizer(Ljava/lang/String;)Lo/DefaultAnalyticsCollectorExternalSyntheticLambda6;

    move-result-object v0

    if-eqz v0, :cond_11

    .line 386
    invoke-virtual {v0}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda6;->AudioAttributesCompatParcelizer()Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55;

    move-result-object v0
    :try_end_f
    .catchall {:try_start_1 .. :try_end_f} :catchall_19

    monitor-exit p0

    return-object v0

    .line 385
    :cond_11
    :try_start_11
    sget-object v0, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55;->RemoteActionCompatParcelizer:Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55$RemoteActionCompatParcelizer;

    invoke-virtual {v0}, Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55$RemoteActionCompatParcelizer;->IconCompatParcelizer()Lo/DefaultAnalyticsCollectorExternalSyntheticLambda55;

    move-result-object v0
    :try_end_17
    .catchall {:try_start_11 .. :try_end_17} :catchall_19

    monitor-exit p0

    return-object v0

    :catchall_19
    move-exception v0

    monitor-exit p0

    throw v0
.end method
