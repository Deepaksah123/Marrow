###### Class com.bumptech.glide.integration.okhttp3.OkHttpGlideModule (com.bumptech.glide.integration.okhttp3.OkHttpGlideModule)
.class public Lcom/bumptech/glide/integration/okhttp3/OkHttpGlideModule;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lo/getFirstMediaPeriodInfoOfNextPeriod;


# annotations
.annotation runtime Ljava/lang/Deprecated;
.end annotation


# direct methods
.method public constructor <init>()V
    .registers 1

    .line 24
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final IconCompatParcelizer(Landroid/content/Context;Lcom/bumptech/glide/Glide;Lo/setSelectionFlags;)V
    .registers 4

    .line 32
    const-class p0, Lo/setMaxPlaybackSpeed;

    const-class p1, Ljava/io/InputStream;

    new-instance p2, Lo/onPlaylistMetadataChanged$RemoteActionCompatParcelizer;

    invoke-direct {p2}, Lo/onPlaylistMetadataChanged$RemoteActionCompatParcelizer;-><init>()V

    invoke-virtual {p3, p0, p1, p2}, Lo/setSelectionFlags;->read(Ljava/lang/Class;Ljava/lang/Class;Lo/setTargetOffsetMs;)Lo/setSelectionFlags;

    return-void
.end method
