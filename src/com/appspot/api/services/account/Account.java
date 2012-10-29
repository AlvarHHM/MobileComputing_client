/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This file was generated.
 *  with google-apis-code-generator 1.2.0 (build: 2012-10-03 02:48:15 UTC)
 *  on 2012-10-29 at 05:53:55 UTC 
 */

package com.appspot.api.services.account;

import com.google.api.client.googleapis.services.GoogleClient;
import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpMethod;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpRequestInitializer;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.json.JsonHttpRequest;
import com.google.api.client.http.json.JsonHttpRequestInitializer;
import com.google.api.client.json.JsonFactory;
import com.google.api.client.json.JsonObjectParser;
import com.google.common.base.Preconditions;

import java.io.IOException;

/**
 * Service definition for Account (v1).
 *
 * <p>
 * 
 * </p>
 *
 * <p>
 * For more information about this service, see the
 * <a href="" target="_blank">API Documentation</a>
 * </p>
 *
 * <p>
 * This service uses {@link JsonHttpRequestInitializer} to initialize global parameters via its
 * {@link Builder}. Sample usage:
 * </p>
 *
 * <pre>
  public class AccountRequestInitializer implements JsonHttpRequestInitializer {
      public void initialize(JsonHttpRequest request) {
        AccountRequest accountRequest = (AccountRequest)request;
        accountRequest.setPrettyPrint(true);
        accountRequest.setKey(ClientCredentials.KEY);
    }
  }
 * </pre>
 *
 * @since 1.3.0
 * @author Google, Inc.
 */
public class Account extends GoogleClient {

  /**
   * The default encoded base path of the service. This is determined when the library is generated
   * and normally should not be changed.
   * @deprecated (scheduled to be removed in 1.8) Use "/" + {@link #DEFAULT_SERVICE_PATH}.
   */
  @Deprecated
  public static final String DEFAULT_BASE_PATH = "/_ah/api/account/v1/login/";

  /**
   * The default encoded root URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_ROOT_URL = "https://alvar-mbass.appspot.com/_ah/api/";

  /**
   * The default encoded service path of the service. This is determined when the library is
   * generated and normally should not be changed.
   *
   * @since 1.7
   */
  public static final String DEFAULT_SERVICE_PATH = "account/v1/login/";

  /**
   * The default encoded base URL of the service. This is determined when the library is generated
   * and normally should not be changed.
   */
  public static final String DEFAULT_BASE_URL = DEFAULT_ROOT_URL + DEFAULT_SERVICE_PATH;

  /**
   * Construct a Account instance to connect to the Account service.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @deprecated (scheduled to be removed in 1.8) Use
   *             {@link #Account(HttpTransport, JsonFactory, HttpRequestInitializer)}.
   */
  @Deprecated
  public Account(HttpTransport transport, JsonFactory jsonFactory) {
    super(transport, jsonFactory, DEFAULT_BASE_URL);
  }

  /**
   * Construct a Account instance to connect to the Account service.
   *
   * <p>
   * Use {@link Builder} if you need to specify any of the optional parameters.
   * </p>
   *
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @param httpRequestInitializer The HTTP request initializer or {@code null} for none
   * @since 1.7
   */
  public Account(HttpTransport transport, JsonFactory jsonFactory,
      HttpRequestInitializer httpRequestInitializer) {
    super(transport, jsonFactory, DEFAULT_ROOT_URL, DEFAULT_SERVICE_PATH, httpRequestInitializer);
  }

  /**
   * Construct a Account instance to connect to the Account service.
   *
   * @param transport The transport to use for requests
   * @param jsonHttpRequestInitializer The initializer to use when creating an JSON HTTP request
   * @param httpRequestInitializer The initializer to use when creating an {@link HttpRequest}
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @param jsonObjectParser JSON parser to use or {@code null} if unused
   * @param baseUrl The base URL of the service on the server
   * @param applicationName The application name to be sent in the User-Agent header of requests
   */
  @Deprecated
  Account(
      HttpTransport transport,
      JsonHttpRequestInitializer jsonHttpRequestInitializer,
      HttpRequestInitializer httpRequestInitializer,
      JsonFactory jsonFactory,
      JsonObjectParser jsonObjectParser,
      String baseUrl,
      String applicationName) {
      super(transport,
          jsonHttpRequestInitializer,
          httpRequestInitializer,
          jsonFactory,
          jsonObjectParser,
          baseUrl,
          applicationName);
  }

  /**
   * Construct a Account instance to connect to the Account service.
   *
   * @param transport The transport to use for requests
   * @param jsonHttpRequestInitializer The initializer to use when creating an JSON HTTP request
   * @param httpRequestInitializer The initializer to use when creating an {@link HttpRequest}
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @param jsonObjectParser JSON parser to use or {@code null} if unused
   * @param rootUrl The root URL of the service on the server
   * @param servicePath The service path of the service on the server
   * @param applicationName The application name to be sent in the User-Agent header of requests
   * @param suppressPatternChecks whether discovery pattern checks should be suppressed on required
   *        parameters
   */
  Account(
      HttpTransport transport,
      JsonHttpRequestInitializer jsonHttpRequestInitializer,
      HttpRequestInitializer httpRequestInitializer,
      JsonFactory jsonFactory,
      JsonObjectParser jsonObjectParser,
      String rootUrl,
      String servicePath,
      String applicationName,
      boolean suppressPatternChecks) {
      super(transport,
          jsonHttpRequestInitializer,
          httpRequestInitializer,
          jsonFactory,
          jsonObjectParser,
          rootUrl,
          servicePath,
          applicationName,
          suppressPatternChecks);
  }

  @Override
  protected void initialize(JsonHttpRequest jsonHttpRequest) throws IOException {
    super.initialize(jsonHttpRequest);
  }

  /**
   * Returns an instance of a new builder.
   *
   * @param transport The transport to use for requests
   * @param jsonFactory A factory for creating JSON parsers and serializers
   * @deprecated (scheduled to removed in 1.8) Use
   *             {@link Builder#Builder(HttpTransport, JsonFactory, HttpRequestInitializer)}.
   */
   @Deprecated
   public static Builder builder(HttpTransport transport, JsonFactory jsonFactory) {
     return new Builder(transport, jsonFactory, new GenericUrl(DEFAULT_BASE_URL));
   }

  /**
   * An accessor for creating requests from the AccountOperations collection.
   *
   * The typical use is:<pre>
   *   {@code Account account = new Account(...);}
   *   {@code Account.AccountOperations.List request = account.account().list(parameters ...)}</pre>
   *
   * @return the resource collection
   */
  public AccountOperations account() {
    return new AccountOperations();
  }

  /**
   * The "account" collection of methods.
   */
  public class AccountOperations {

    /**
     * Create a request for the method "account.login".
     *
     * This request holds the parameters needed by the the account server.  After setting any optional
     * parameters, call the {@link Login#execute()} method to invoke the remote operation.
     *
     * @param username
     * @param password
     * @return the request
     * @throws IOException if the initialization of the request fails
     */
    public Login login(String username, String password) throws IOException {
      Login result = new Login(username, password);
      initialize(result);
      return result;
    }

    public class Login extends AccountRequest {

      private static final String REST_PATH = "{username}/{password}";

      /**
       * Internal constructor.  Use the convenience method instead.
       */
      Login(String username, String password) {
        super(Account.this, HttpMethod.POST, REST_PATH, null);
        this.username = Preconditions.checkNotNull(username, "Required parameter username must be specified.");
        this.password = Preconditions.checkNotNull(password, "Required parameter password must be specified.");
      }

      /**
       * Sends the "login" request to the Account server.
       *
       * @return the {@link com.appspot.api.services.account.model.Account} response
       * @throws IOException if the request fails
       */
      public com.appspot.api.services.account.model.Account execute() throws IOException {
        HttpResponse response = executeUnparsed();
        com.appspot.api.services.account.model.Account result = response.parseAs(
            com.appspot.api.services.account.model.Account.class);
        result.setResponseHeaders(response.getHeaders());
        return result;
      }

      /**
       * Queues the "login" request to the Account server into the given batch request.
       *
       * <p>
       * Example usage:
       * </p>
       *
       * <pre>
         request.queue(batchRequest, new JsonBatchCallback&lt;Account&gt;() {

           public void onSuccess(Account content, GoogleHeaders responseHeaders) {
             log("Success");
           }

           public void onFailure(GoogleJsonError e, GoogleHeaders responseHeaders) {
             log(e.getMessage());
           }
         });
       * </pre>
       *
       * @param batch a single batch of requests
       * @param callback batch callback
       * @since 1.6
       */
      public void queue(com.google.api.client.googleapis.batch.BatchRequest batch,
          com.google.api.client.googleapis.batch.json.JsonBatchCallback<com.appspot.api.services.account.model.Account> callback)
          throws IOException {
        batch.queue(buildHttpRequest(), com.appspot.api.services.account.model.Account.class,
            com.google.api.client.googleapis.json.GoogleJsonErrorContainer.class, callback);
      }

      /**
       * @since 1.7
       */
      @Override
      public Login setFields(String fields) {
        super.setFields(fields);
        return this;
      }

      @com.google.api.client.util.Key
      private String username;

      /**

       */
      public String getUsername() {
        return username;
      }

      public Login setUsername(String username) {
        this.username = username;
        return this;
      }

      @com.google.api.client.util.Key
      private String password;

      /**

       */
      public String getPassword() {
        return password;
      }

      public Login setPassword(String password) {
        this.password = password;
        return this;
      }

    }

  }

  /**
   * Builder for {@link Account}.
   *
   * <p>
   * Implementation is not thread-safe.
   * </p>
   *
   * @since 1.3.0
   */
  public static final class Builder extends GoogleClient.Builder {

    /**
     * Returns an instance of a new builder.
     *
     * @param transport The transport to use for requests
     * @param jsonFactory A factory for creating JSON parsers and serializers
     * @param baseUrl The base URL of the service. Must end with a "/"
     */
    @Deprecated
    Builder(HttpTransport transport, JsonFactory jsonFactory, GenericUrl baseUrl) {
      super(transport, jsonFactory, baseUrl);
    }

    /**
     * Returns an instance of a new builder.
     *
     * @param transport The transport to use for requests
     * @param jsonFactory A factory for creating JSON parsers and serializers
     * @param httpRequestInitializer The HTTP request initializer or {@code null} for none
     * @since 1.7
     */
    public Builder(HttpTransport transport, JsonFactory jsonFactory,
        HttpRequestInitializer httpRequestInitializer) {
      super(transport, jsonFactory, DEFAULT_ROOT_URL, DEFAULT_SERVICE_PATH, httpRequestInitializer);
    }

    /** Builds a new instance of {@link Account}. */
    @SuppressWarnings("deprecation")
    @Override
    public Account build() {
      if (isBaseUrlUsed()) {
        return new Account(
            getTransport(),
            getJsonHttpRequestInitializer(),
            getHttpRequestInitializer(),
            getJsonFactory(),
            getObjectParser(),
            getBaseUrl().build(),
            getApplicationName());
      }
      return new Account(
          getTransport(),
          getJsonHttpRequestInitializer(),
          getHttpRequestInitializer(),
          getJsonFactory(),
          getObjectParser(),
          getRootUrl(),
          getServicePath(),
          getApplicationName(),
          getSuppressPatternChecks());
    }

    @Override
    @Deprecated
    public Builder setBaseUrl(GenericUrl baseUrl) {
      super.setBaseUrl(baseUrl);
      return this;
    }

    @Override
    public Builder setRootUrl(String rootUrl) {
      super.setRootUrl(rootUrl);
      return this;
    }

    @Override
    public Builder setServicePath(String servicePath) {
      super.setServicePath(servicePath);
      return this;
    }

    @Override
    public Builder setJsonHttpRequestInitializer(
        JsonHttpRequestInitializer jsonHttpRequestInitializer) {
      super.setJsonHttpRequestInitializer(jsonHttpRequestInitializer);
      return this;
    }

    @Override
    public Builder setHttpRequestInitializer(HttpRequestInitializer httpRequestInitializer) {
      super.setHttpRequestInitializer(httpRequestInitializer);
      return this;
    }

    @Override
    public Builder setApplicationName(String applicationName) {
      super.setApplicationName(applicationName);
      return this;
    }

    @Override
    public Builder setObjectParser(JsonObjectParser parser) {
      super.setObjectParser(parser);
      return this;
    }

    @Override
    public Builder setSuppressPatternChecks(boolean suppressPatternChecks) {
      super.setSuppressPatternChecks(suppressPatternChecks);
      return this;
    }
  }
}
